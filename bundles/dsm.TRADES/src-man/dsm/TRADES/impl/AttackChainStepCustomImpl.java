package dsm.TRADES.impl;

import static java.util.stream.Collectors.toList;

import java.util.List;

import dsm.TRADES.AttackChainStep;
import dsm.TRADES.util.EcoreUtils;

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
}
