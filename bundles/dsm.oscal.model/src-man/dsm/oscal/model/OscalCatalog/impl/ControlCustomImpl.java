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

import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import dsm.TRADES.IMitigationLink;
import dsm.TRADES.util.EcoreUtils;
import dsm.oscal.model.DocumentationComputer;
import dsm.oscal.model.ParameterResolver;
import dsm.oscal.model.OscalCatalog.Catalog;

public class ControlCustomImpl extends ControlImpl {

	@Override
	public String computeDocumentation() {
		return DocumentationComputer.computeDocumentation(this, getParameterValues());
	}

	@Override
	public Map<String, String> getParameterValues() {
		return ParameterResolver.getAvailableParams(this);
	}

	@Override
	public String getDescription() {
		return computeDocumentation();
	}

	@Override
	public EList<IMitigationLink> getMitigatedThreatDefinitions() {
		return ECollections.emptyEList();
	}

	@Override
	public String getSourceIdentifier() {
		Catalog catalog = EcoreUtils.getAncestor(this, Catalog.class);
		if (catalog != null) {
			return catalog.getIdentifier();
		}
		return null;
	}

	@Override
	public String getSourceName() {
		Catalog catalog = EcoreUtils.getAncestor(this, Catalog.class);
		if (catalog != null) {
			return catalog.getName();
		}
		return null;
	}
}
