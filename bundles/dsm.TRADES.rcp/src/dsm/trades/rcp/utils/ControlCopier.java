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

package dsm.trades.rcp.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import dsm.TRADES.Control;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.NamedElement;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatMitigationRelation;

public class ControlCopier {

	private final Map<Control, ExternalControl> oldToNew = new HashMap<>();

	private final Map<Threat, ExternalThreat> importedThreats;

	public ControlCopier(Map<Threat, ExternalThreat> importedThreats) {
		super();
		this.importedThreats = importedThreats;
	}

	public ExternalControl update(Control controlToImport, ExternalControl existingControl) {
		existingControl.setDescription(controlToImport.getDescription());
		existingControl.setId(controlToImport.getId());
		existingControl.setName(controlToImport.getName());
		if (controlToImport instanceof ExternalControl) {
			existingControl.setLink(((ExternalControl) controlToImport).getLink());
		}

		existingControl.getMitigationRelations().clear();
		for (ThreatMitigationRelation rel : controlToImport.getMitigationRelations()) {
			Threat mThreat = rel.getThreat();
			if (importedThreats.containsKey(mThreat)) {
				ThreatMitigationRelation nRel = TRADESFactory.eINSTANCE.createThreatMitigationRelation();
				nRel.setThreat(importedThreats.get(mThreat));
				nRel.setAssessment(rel.getAssessment());
				nRel.setControl(existingControl);
				existingControl.getMitigationRelations().add(nRel);
			}
			oldToNew.put(controlToImport, existingControl);
		}
		return existingControl;
	}

	public ExternalControl copy(Control controlToImport) {

		ExternalControl result = TRADESFactory.eINSTANCE.createExternalControl();
		Resource resource = controlToImport.eResource();
		if (resource != null) {
			EObject root = resource.getContents().get(0);
			if (root instanceof NamedElement) {
				result.setSource(((NamedElement) root).getName());
			}
			result.setSourceID(resource.getURIFragment(controlToImport));
		}
		update(controlToImport, result);

		oldToNew.put(controlToImport, result);
		return result;
	}

}
