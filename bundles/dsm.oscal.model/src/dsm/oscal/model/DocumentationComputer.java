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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalCatalogCommon.Part;
import dsm.oscal.model.OscalMetadata.ParameterOwner;
import dsm.oscal.model.OscalMetadata.PartOwner;

public class DocumentationComputer {

	public static Pattern INSET_PATTERN = Pattern.compile("\\{\\{\\s*insert:\\s*param\\s*,\\s*(\\S*)\\s*\\}\\}");

	/**
	 * Computes the documentation of the given {@link PartOwner}. This methods also
	 * replace the <code>{{insert: param ...}}</code> tags by their value (if more
	 * than one only takes the first one)
	 * 
	 * @param owner  the owner
	 * @param params the available parameters value from the given owner
	 * @return
	 */
	public static String computeDocumentation(PartOwner owner, boolean resolve, Map<String, String> params) {

		StringBuilder builder = new StringBuilder();
		for (Part p : owner.getParts()) {
			String doc = p.computeDocumentation(resolve);
			if (doc != null && !doc.isBlank()) {
				builder.append(doc).append(System.lineSeparator());
			}
		}
		String doc = builder.toString();

		if (resolve) {
			return resolveInsideVariable(params, doc);
		} else {
			return doc;
		}

	}

	/**
	 * Collects all parameters available from the given object (all its parameters
	 * on the one from its parents) in used in its documentation
	 * 
	 * @param source object
	 * @return list of parameters
	 */
	public static EList<Parameter> collectParametersInUse(dsm.oscal.model.OscalMetadata.DocumentationComputer source) {

		String doc = source.computeDocumentation(false);
		Set<Parameter> usedParameters = new HashSet<>();
		if (doc != null && !doc.isBlank()) {
			Map<String, Parameter> allParameters = collectParameter(source, new HashMap<>());
			Matcher matcher = INSET_PATTERN.matcher(doc);
			while (matcher.find()) {
				String paramId = matcher.group(1);
				if (paramId != null) {
					Parameter param = allParameters.get(paramId);
					if (param != null) {
						usedParameters.add(param);
					}
				}
			}
		}
		return new BasicEList<>(usedParameters);
	}

	private static Map<String, Parameter> collectParameter(EObject source, Map<String, Parameter> collector) {
		if (source != null) {
			if (source instanceof ParameterOwner) {
				for (Parameter p : ((ParameterOwner) source).getParams()) {
					String id = p.getId();
					if (id != null && !collector.containsKey(id)) {
						collector.put(id, p);
					}
				}
			}
			collectParameter(source.eContainer(), collector);
		}
		return collector;
	}

	public static String resolveInsideVariable(Map<String, String> params, String doc) {
		Matcher match = INSET_PATTERN.matcher(doc);

		String newDoc = match.replaceAll(matchResult -> {
			String id = matchResult.group(1);
			String value = params.get(id);
			if (value != null) {
				return Matcher.quoteReplacement(value);
			}
			return doc.substring(matchResult.start(), matchResult.end());
		});
		return newDoc;
	}

}
