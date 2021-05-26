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
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import dsm.TRADES.IMitigationLink;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatMitigationRelation;

public class ExternalControlCustomImpl extends ExternalControlImpl {

	@Override
	public EList<IMitigationLink> getMitigatedThreatDefinitions() {
		List<IMitigationLink> definitions = new ArrayList<IMitigationLink>();
		for (ThreatMitigationRelation rel : getMitigationRelations()) {
			Threat threat = rel.getThreat();
			if (threat != null && threat.getId() != null) {
				definitions.add(rel);
			}
		}
		return ECollections.toEList(definitions);
	}

	@Override
	public String getSourceName() {
		return getSource();
	}

	@Override
	public String getSourceIdentifier() {
		return getSourceID();
	}

}
