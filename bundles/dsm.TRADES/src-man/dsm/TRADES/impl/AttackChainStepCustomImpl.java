package dsm.TRADES.impl;

import dsm.TRADES.AttackChainStep;

public class AttackChainStepCustomImpl extends AttackChainStepImpl {
	@Override
	public String getStepNum() {
		int index = getNum(this);
		int subNum = getSubNum(this);

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

	private int getNum(AttackChainStep step) {
		return doGetNum(step, 0);
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

	private int getSubNum(AttackChainStep step) {
		int index = -1;
		for (AttackChainStep previous : step.getPrevious()) {
			index = Math.max(index, previous.getNext().indexOf(step));
		}
		return index;
	}
}
