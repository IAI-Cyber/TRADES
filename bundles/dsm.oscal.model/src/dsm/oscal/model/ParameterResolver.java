/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */

package dsm.oscal.model;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalCatalogCommon.ParameterSelection;
import dsm.oscal.model.OscalMetadata.ParameterOwner;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

/**
 * Util class to collect {@link Parameter} values
 * 
 * @author Arthur Daussy
 *
 */
public class ParameterResolver {

	/**
	 * Gets all {@link Parameter} value available from the given owner.
	 * 
	 * <p>
	 * Note: For parameters with multiple value (or select) only return the first
	 * valid value
	 * </p>
	 * 
	 * @param owner an non null owner
	 * @return a map that maps id to a value
	 */
	public static HashMap<String, String> getAvailableParams(EObject owner) {

		HashMap<String, String> params = new HashMap<>();

		EObject current = owner;
		while (current != null) {
			if (current instanceof ParameterOwner) {
				collect((ParameterOwner) current, params);
			}
			current = current.eContainer();
		}

		// Resolve inside variables
		params.replaceAll((key, value) -> {
			String resolveValue = DocumentationComputer.resolveInsideVariable(params, value);
			if (value != null && !value.equals(resolveValue)) {
				return resolveValue;
			} else {
				return value;
			}
		});

		return params;
	}

	private static void collect(ParameterOwner owner, HashMap<String, String> collector) {
		for (Parameter p : owner.getParams()) {
			String id = p.getId();
			String value = getParamValue(p);
			if (value != null && !collector.containsKey(id)) {
				collector.put(id, value);
			}
		}
	}

	public static String getParamValue(Parameter p) {
		if (p == null) {
			return null;
		}

		EList<String> values = p.getValues();
		if (!values.isEmpty()) {
			return values.get(0);
		}

		ParameterSelection select = p.getSelect();
		if (select != null) {
			EList<MarkupLine> choices = select.getChoice();
			if (!choices.isEmpty()) {
				MarkupLine choice = choices.get(0);
				if (choice != null) {
					return safeToMarkdown(choice);
				}
			}
		}

		MarkupLine label = p.getLabel();
		if (label != null) {
			return "${" + safeToMarkdown(label) + "}";
		}

		return null;

	}

	public static String safeToMarkdown(MarkupLine line) {
		if (line != null) {
			String md = line.toMarkdown();
			if (md != null) {
				// Workaround for https://github.com/usnistgov/liboscal-java/issues/4
				if (md.endsWith("\n")) {
					return md.substring(0, md.length() - 1);
				}
				return md;
			}
		}
		return null;
	}

}
