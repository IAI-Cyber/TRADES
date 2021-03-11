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

import java.util.HashMap;
import java.util.Map;

import dsm.TRADES.AttackChainStep;
import dsm.TRADES.ThreatAllocationRelation;

public class AttackChainCustomImpl extends AttackChainImpl {

	@Override
	public int getComputedDifficulty() {
		Map<Integer, Integer> collectors = new HashMap<>();

		for (AttackChainStep step : getAttackchainSteps()) {
			ThreatAllocationRelation rel = step.getThreatAllocationRelation();
			if (rel != null && rel.getDifficultyScore() != null) {
				int difficulty = rel.getDifficultyScore().getDifficulty();
				collectors.merge(((AttackChainStepCustomImpl) step).getNum(), difficulty, (a, b) -> Math.max(a, b));
			}
		}

		int score = collectors.values().stream().mapToInt(i -> i.intValue()).sum();

		return score;
	}
}
