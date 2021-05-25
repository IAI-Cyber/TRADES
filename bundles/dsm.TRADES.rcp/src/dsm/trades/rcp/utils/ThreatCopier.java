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

import dsm.TRADES.ExternalThreat;
import dsm.TRADES.NamedElement;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.Threat;

public class ThreatCopier {

	Map<Threat, ExternalThreat> oldToNewThreats = new HashMap<>();

	public ExternalThreat update(Threat toImport, ExternalThreat existingThreat) {
		oldToNewThreats.put(toImport, existingThreat);
		existingThreat.setDescription(toImport.getDescription());
		existingThreat.setApplicability(toImport.getApplicability());
		existingThreat.setId(toImport.getId());
		existingThreat.setName(toImport.getName());
		existingThreat.setThreatType(toImport.getThreatType());
		if (toImport instanceof ExternalThreat) {
			existingThreat.setLink(((ExternalThreat) toImport).getLink());
		}


		return existingThreat;
	}

	public ExternalThreat copy(Threat threat) {

		ExternalThreat result = TRADESFactory.eINSTANCE.createExternalThreat();
		oldToNewThreats.put(threat, result);

		Resource resource = threat.eResource();
		if (resource != null) {
			EObject root = resource.getContents().get(0);
			if (root instanceof NamedElement) {
				result.setSource(((NamedElement) root).getName());
			}
			result.setSourceID(resource.getURIFragment(threat));
		}

		update(threat, result);

		return result;
	}

	public Map<Threat, ExternalThreat> getOldToNewThreats() {
		return oldToNewThreats;
	}
}
