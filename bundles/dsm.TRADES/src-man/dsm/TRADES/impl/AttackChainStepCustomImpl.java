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

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Component;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.util.EcoreUtils;
import dsm.TRADES.util.TRADESValidator;

public class AttackChainStepCustomImpl extends AttackChainStepImpl {
	@Override
	public String getStepNum() {
		int index = getNum();
		int subNum = getSubNum(index);

		String label = "";
		if (index != -1) {
			label += index;
		} else {
			label += "?";
		}

		if (subNum != -1) {
			label += "." + subNum;
		}

		return label;
	}

	int getNum() {
		return doGetNum(this, 0);
	}

	private int doGetNum(AttackChainStep step, int stepNum) {
		if (stepNum > 1000) {
			return -1;
		}

		int result = stepNum;
		for (AttackChainStep previous : step.getPrevious()) {
			result = Math.max(doGetNum(previous, stepNum + 1), result);
		}

		return result;

	}

	private int getSubNum(int stepNum) {
		List<AttackChainStepCustomImpl> sameSteps = EcoreUtils
				.allContainedObjectOfType(eContainer, AttackChainStepCustomImpl.class)
				.filter(s -> s.getNum() == stepNum).collect(toList());
		if (sameSteps.size() == 1) {
			// Not other sub step
			return -1;
		}
		return sameSteps.indexOf(this);
	}

	@Override
	public EList<ThreatAllocationRelation> getThreatAllocationRelationCandidates() {
		EObject container = eContainer();
		if (container == null || !(eContainer().eContainer() instanceof ThreatAllocationRelation)) {
			return ECollections.emptyEList();
		}

		ThreatAllocationRelation threatAllocation = (ThreatAllocationRelation) eContainer().eContainer();

		Component targetComponent = threatAllocation.getComponent();
		if (targetComponent != null) {
			return ECollections
					.asEList(EcoreUtils.allContainedObjectOfType(targetComponent, ThreatAllocationRelation.class)
							.filter(tAlloc -> tAlloc != threatAllocation).collect(Collectors.toList()));
		} else {
			return ECollections.emptyEList();
		}
	}

	@Override
	public boolean checkAllocationValue(DiagnosticChain chain, @SuppressWarnings("rawtypes") Map context) {

		ThreatAllocationRelation tAlloc = getThreatAllocationRelation();
		if (tAlloc == null) {
			chain.add(new BasicDiagnostic(Diagnostic.WARNING, TRADESValidator.DIAGNOSTIC_SOURCE,
					TRADESValidator.ATTACK_CHAIN_STEP__CHECK_ALLOCATION_VALUE,
					"Each step should be linked a threat allocation relation.",
					new Object[] { this }));
			return false;
		} else {
			EList<ThreatAllocationRelation> threatAllocationRelationCandidates = getThreatAllocationRelationCandidates();
			if (!threatAllocationRelationCandidates.contains(tAlloc)) {
				chain.add(new BasicDiagnostic(Diagnostic.WARNING, TRADESValidator.DIAGNOSTIC_SOURCE,
						TRADESValidator.ATTACK_CHAIN_STEP__CHECK_ALLOCATION_VALUE,
						"The current threat allocation does not belong the possible threat allocations for this step",
						new Object[] { this }));
				return false;
			}
		}
		return true;
	}
}
