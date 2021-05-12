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

package dsm.oscal.model.OscalCatalog.impl;

import static java.util.stream.Collectors.toList;

import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import dsm.TRADES.IControlDefinition;
import dsm.TRADES.IThreatDefinition;
import dsm.TRADES.Threat;
import dsm.TRADES.util.EcoreUtils;
import dsm.oscal.model.ParameterResolver;
import dsm.oscal.model.OscalCatalog.Control;
import dsm.oscal.model.OscalMetadata.Metadata;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

public class CatalogCustomImpl extends CatalogImpl {

	@Override
	public Map<String, String> getParameterValues() {
		return ParameterResolver.getAvailableParams(this);
	}

	@Override
	public IControlDefinition getControlById(String id) {
		if (id == null) {
			return null;
		}
		return EcoreUtils.allContainedObjectOfType(this, Control.class).filter(c -> id.equals(c.getId())).findFirst()
				.orElse(null);
	}

	@Override
	public Threat getThreatById(String id) {
		return null;
	}

	@Override
	public EList<IThreatDefinition> getThreatDefinitions() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<IControlDefinition> getControlDefinitions() {
		return ECollections.toEList(EcoreUtils.allContainedObjectOfType(this, Control.class)
				.filter(c -> c.getId() != null).collect(toList()));
	}

	@Override
	public String getIdentifier() {
		UUID id = getUuid();
		if (id != null) {
			return id.toString();
		} else {
			return null;
		}
	}

	@Override
	public String getName() {
		Metadata m = getMetadata();
		if (m != null) {
			MarkupLine title = m.getTitle();
			if (title != null) {
				return title.toMarkdown();
			}
		}
		return getIdentifier();
	}
}
