package TRADES.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.ThreatAllocationRelation;

public class DiagramService {

	public String getAttackChainLabel(AttackChainStep step) {

		String label = step.getStepNum();

		ThreatAllocationRelation allocation = step.getThreatallocationrelation();

		label += " : " + getAllocLabel(allocation);

		return label;

	}

	private String getAllocLabel(ThreatAllocationRelation alloc) {
		if (alloc == null) {
			return "No allocation";
		}

		String threatLabel = alloc.getThreat() != null ? alloc.getThreat().getName() : "No Threat";
		String componentLabel = alloc.getComponent() != null ? alloc.getComponent().getName() : "No component";

		return threatLabel + "->" + componentLabel;
	}
	
	public List<AttackChainStep> getLastSteps(AttackChain chain){
		if(chain.getStart() == null) {
			return Collections.emptyList();
		}else {
			List<AttackChainStep> leaves = new ArrayList<>();
			collectLeaves(chain.getStart(),leaves);
			return leaves;
		}
	}

	private void collectLeaves(AttackChainStep start, List<AttackChainStep> leaves) {
		if(start == null) {
			return;
		}
		for(AttackChainStep step : start.getNexts()) {
			if(step.getNexts().isEmpty()) {
				leaves.add(step);
			}else {
				collectLeaves(step, leaves);
			}
		}
		
	}

}
