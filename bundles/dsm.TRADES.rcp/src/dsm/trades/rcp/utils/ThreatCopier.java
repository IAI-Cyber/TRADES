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

import dsm.TRADES.ExternalThreat;
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


		return existingThreat;
	}

	public ExternalThreat copy(Threat threat, String analysisSourceName) {

		ExternalThreat result = TRADESFactory.eINSTANCE.createExternalThreat();
		oldToNewThreats.put(threat, result);
		result.setDescription(threat.getDescription());
		result.setApplicability(threat.getApplicability());
		result.setId(threat.getId());
		result.setName(threat.getName());
		result.setThreatType(threat.getThreatType());

		if (threat instanceof ExternalThreat) {
			ExternalThreat inputExtThreat = (ExternalThreat) threat;
			result.setLink(inputExtThreat.getLink());
			result.setSource(inputExtThreat.getSource());
		} else {
			result.setSource(analysisSourceName);
		}
		return result;
	}

	public Map<Threat, ExternalThreat> getOldToNewThreats() {
		return oldToNewThreats;
	}
}
