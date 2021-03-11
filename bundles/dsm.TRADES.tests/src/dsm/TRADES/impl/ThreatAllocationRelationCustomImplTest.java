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
import org.junit.Test;

import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.testlib.AbstractTest;

public class ThreatAllocationRelationCustomImplTest extends AbstractTest {

	@Test
	public void checkCheckComputedDifficultyConstraint() {

		ThreatAllocationRelation thAllocation = fact.createThreatAllocationRelation();

		BasicDiagnostic diag = new BasicDiagnostic();
		assertThat(thAllocation.checkComputedDifficultyConstraint(diag, new HashMap<>())).isTrue();

		// Difficulty set but no attack chain description => No problem
		DifficultyScore diff5 = fact.createDifficultyScore();
		diff5.setDifficulty(5);

		thAllocation.setDifficultyScore(diff5);

		diag = new BasicDiagnostic();
		assertThat(thAllocation.checkComputedDifficultyConstraint(diag, new HashMap<>())).isTrue();

		// Difficulty set but emtpy attack chain => computedDiff != diff => invalid

		AttackChain attackChain = fact.createAttackChain();
		thAllocation.setAttackChain(attackChain);

		diag = new BasicDiagnostic();
		assertThat(thAllocation.checkComputedDifficultyConstraint(diag, new HashMap<>())).isFalse();
		assertThat(diag.getChildren()).hasSize(1).allMatch(d -> d.getSeverity() == Diagnostic.WARNING);

		// Attach chain with different computation ( 5 != 3 )

		AttackChainStep step1 = fact.createAttackChainStep();
		ThreatAllocationRelation thAlloc1 = fact.createThreatAllocationRelation();
		attackChain.getAttackchainSteps().add(step1);

		DifficultyScore diff3 = fact.createDifficultyScore();
		diff3.setDifficulty(3);
		thAlloc1.setDifficultyScore(diff3);
		step1.setThreatAllocationRelation(thAlloc1);

		diag = new BasicDiagnostic();
		assertThat(thAllocation.checkComputedDifficultyConstraint(diag, new HashMap<>())).isFalse();
		assertThat(diag.getChildren()).hasSize(1).allMatch(d -> d.getSeverity() == Diagnostic.WARNING);

		// Valid difficulty computation ( 5 == 3 + 2) => No validation issues

		AttackChainStep step2 = fact.createAttackChainStep();
		ThreatAllocationRelation thAlloc2 = fact.createThreatAllocationRelation();

		DifficultyScore diff2 = fact.createDifficultyScore();
		diff2.setDifficulty(2);
		thAlloc2.setDifficultyScore(diff2);
		step2.setThreatAllocationRelation(thAlloc2);
		attackChain.getAttackchainSteps().add(step2);
		step1.getNext().add(step2);

		diag = new BasicDiagnostic();
		assertThat(thAllocation.checkComputedDifficultyConstraint(diag, new HashMap<>())).isTrue();
		assertThat(diag.getChildren()).isEmpty();

	}

}
