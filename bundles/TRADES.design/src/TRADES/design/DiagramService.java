package TRADES.design;

import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;

public class DiagramService {

	public String getAttackChainLabel(AttackChainStep step) {
		int index = getNum(step);
		int subNum = getSubNum(step);
		
		String label = "";
		if(index != -1) {
			label += index;
		}else {
			label += "?";
		}
		
		if(subNum != -1) {
			label+="."+subNum;
		}
		
		ThreatAllocationRelation allocation = step.getThreatallocationrelation();
		
		label+=" : " +getAllocLabel(allocation);
		
		return label;

	}
	
	private String getAllocLabel(ThreatAllocationRelation alloc) {
		if(alloc == null) {
			return "No allocation";
		}
		
		String threatLabel = alloc.getThreat() != null ? alloc.getThreat().getName() : "No Threat";
		String componentLabel = alloc.getComponent() != null ? alloc.getComponent().getName() : "No component";
		
		return threatLabel +"->"+componentLabel;
	}

	private int getNum(AttackChainStep step) {
		AttackChainStep current = step;
		int index = 0;
		while (current.getPrevious() != null && index < 1000) {
			index++;
			current = current.getPrevious();
		}

		if (index > 999) {
			return -1;
		}
		return index;
	}

	private int getSubNum(AttackChainStep step) {
		AttackChainStep previous = step.getPrevious();
		if (previous != null) {
			return previous.getNexts().indexOf(step);
		}
		return -1;
	}
}
