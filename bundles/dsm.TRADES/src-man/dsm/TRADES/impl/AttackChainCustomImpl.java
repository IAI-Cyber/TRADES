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
