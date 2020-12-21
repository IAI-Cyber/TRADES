package TRADES.design;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Component;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ControlType;
import dsm.TRADES.ThreatAllocationRelation;

public class DiagramService {

	public String getAttackChainLabel(AttackChainStep step) {

		String label = step.getStepNum();

		ThreatAllocationRelation allocation = step.getThreatAllocationRelation();

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

	public Set<AttackChainStep> getAllPrevious(AttackChainStep step) {
		Set<AttackChainStep> result = new HashSet<>();
		getAllPrevious(step, result, 0);
		return result;
	}

	public void getAllPrevious(AttackChainStep step, Set<AttackChainStep> collector, int stepNb) {
		if (stepNb > 10000) {
			return;
		}
		for (AttackChainStep previous : step.getPrevious()) {
			if (!collector.contains(previous)) {
				collector.add(previous);
				getAllPrevious(previous, collector, stepNb++);
			}
		}
	}

	public boolean containedInComponent(EObject o) {
		EObject eContainer = o.eContainer();
		if (eContainer instanceof Component) {
			return true;
		} else if (eContainer instanceof ControlType) {
			return containedInComponent(eContainer);
		} else if (eContainer instanceof ControlOwner) {
			return containedInComponent(eContainer);
		}
		return false;
	}

	public Set<AttackChainStep> getAllNext(AttackChainStep step) {
		Set<AttackChainStep> result = new HashSet<>();
		getAllNext(step, result, 0);
		return result;
	}

	public void getAllNext(AttackChainStep step, Set<AttackChainStep> collector, int stepNb) {
		if (stepNb > 10000) {
			return;
		}
		for (AttackChainStep next : step.getNext()) {
			if (!collector.contains(next)) {
				collector.add(next);
				getAllPrevious(next, collector, stepNb++);
			}
		}
	}

}
