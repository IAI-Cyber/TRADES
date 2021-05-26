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

package dsm.TRADES.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import dsm.TRADES.Control;
import dsm.TRADES.IControlDefinition;
import dsm.TRADES.IThreatDefinition;
import dsm.TRADES.SemanticHelper;
import dsm.TRADES.Threat;

public class CatalogCustomImpl extends CatalogImpl {

	@Override
	public EList<Control> getAllControls() {
		return ECollections.asEList(SemanticHelper.getAllControls(this));
	}

	@Override
	public Control getControlById(String id) {
		if (id == null) {
			return null;
		}
		return getAllControls().stream().filter(c -> id.equals(c.getId())).findFirst().orElse(null);
	}

	@Override
	public Threat getThreatById(String id) {
		if (id == null || getThreatOwner() == null) {
			return null;
		}
		return getThreatOwner().getExternals().stream().filter(c -> id.equals(c.getId())).findFirst().orElse(null);
	}

	@Override
	public EList<IThreatDefinition> getThreatDefinitions() {

		List<IThreatDefinition> result = new ArrayList<>();
		Set<String> ids = new HashSet<>();
		for (Threat t : getThreatOwner().getExternals()) {
			String id = t.getId();
			if (id != null && !ids.contains(id)) {
				result.add(t);
			}
		}
		return ECollections.toEList(result);
	}

	@Override
	public EList<IControlDefinition> getControlDefinitions() {
		List<IControlDefinition> definitions = new ArrayList<>();
		Set<String> ids = new HashSet<>();
		for (Control c : getAllControls()) {
			String id = c.getId();
			if (id != null && !ids.contains(id)) {
				definitions.add(c);
				ids.add(id);
			}
		}
		return ECollections.toEList(definitions);
	}

	@Override
	public String getIdentifier() {
		return getId();
	}

}
