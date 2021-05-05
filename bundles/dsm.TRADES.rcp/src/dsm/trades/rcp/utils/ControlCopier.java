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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import dsm.TRADES.Control;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalThreat;
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

	public ExternalControl copy(Control control, String sourceName) {

		ExternalControl result = TRADESFactory.eINSTANCE.createExternalControl();
		result.setDescription(control.getDescription());
		result.setId(control.getId());
		result.setName(control.getName());

		// Mitigation
		for (Threat mitigatedThreat : control.getMitigatedThreats()) {
			if (importedThreats.containsKey(mitigatedThreat)) {
				result.getMitigatedThreats().add(importedThreats.get(mitigatedThreat));
			}
		}

		for (ThreatMitigationRelation rel : control.getMitigationRelations()) {
			Threat mThreat = rel.getThreat();
			if (importedThreats.containsKey(mThreat)) {
				ThreatMitigationRelation nRel = TRADESFactory.eINSTANCE.createThreatMitigationRelation();
				nRel.setThreat(importedThreats.get(mThreat));
				nRel.setAssessment(rel.getAssessment());
				nRel.setControl(result);
				result.getMitigationRelations().add(nRel);
			}
		}

		if (control instanceof ExternalControl) {
			ExternalControl extControl = (ExternalControl) control;
			result.setSource(extControl.getSource());
			result.setLink(extControl.getLink());
		} else {
			Resource eResource = control.eResource();
			URI uri = eResource.getURI().appendFragment(eResource.getURIFragment(control));
			result.setLink(URI.decode(uri.toString()));
			result.setSource(sourceName);
		}

		oldToNew.put(control, result);
		return result;
	}

}
