/******************************************************************************************************
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
*******************************************************************************************************/
package dsm.TRADES.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import dsm.TRADES.Analysis;
import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.SemanticUtil;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.testlib.AbstractTest;

public class ThreatCustomImplTest extends AbstractTest {

	@Test
	public void checkCheckIsUsed() {
		Analysis root = createEmptyModel();

		EList<Threat> internalsThreat = root.getThreatOwner().getInternals();

		Threat threat = fact.createThreat();
		internalsThreat.add(threat);

		BasicDiagnostic chain = new BasicDiagnostic();
		assertThat(threat.checkIsUsed(chain, new HashMap<>())).isFalse(); // Not used
		assertThat(chain.getChildren()).hasSize(1).allMatch(b -> b.getSeverity() == Diagnostic.INFO);

		// Allocated a ThreatMitigationRelation but no component => not used

		Component rootComponent = fact.createComponent();
		root.getComponents().add(rootComponent);

		ThreatAllocationRelation thAllocationRel = fact.createThreatAllocationRelation();
		thAllocationRel.setComponent(rootComponent);

		Control intControl = SemanticUtil.addControl(root, fact.createControl());
		Control extControl = SemanticUtil.addControl(root, fact.createExternalControl());

		ThreatMitigationRelation intThreatMitigtion = fact.createThreatMitigationRelation();
		intControl.getMitigationRelations().add(intThreatMitigtion);
		intThreatMitigtion.setThreat(threat);

		ThreatMitigationRelation extThreatMitigtion = fact.createThreatMitigationRelation();
		extControl.getMitigationRelations().add(extThreatMitigtion);
		extThreatMitigtion.setMitigatedAllocation(thAllocationRel);

		chain = new BasicDiagnostic();
		assertThat(threat.checkIsUsed(chain, new HashMap<>())).isFalse(); // Still Not used
		assertThat(chain.getChildren()).hasSize(1).allMatch(b -> b.getSeverity() == Diagnostic.INFO);

		// Allocate the threat
		thAllocationRel.setThreat(threat);

		chain = new BasicDiagnostic();
		assertThat(threat.checkIsUsed(chain, new HashMap<>())).isTrue();
		assertThat(chain.getChildren()).isEmpty();

	}

}
