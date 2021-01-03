package TRADES.design;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import dsm.TRADES.AffectRelation;
import dsm.TRADES.Analysis;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.Data;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;

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

	public DSemanticDecorator getAnalysisView(DRepresentationElement view, EObject containerSmeantic) {
		if (containerSmeantic instanceof Analysis) {
			return view;
		} else if (containerSmeantic instanceof Component) {
			EObject viewContainer = view.eContainer();
			while (viewContainer instanceof DSemanticDecorator) {
				DSemanticDecorator parentView = (DSemanticDecorator) viewContainer;
				if (parentView.getTarget() instanceof Analysis) {
					return parentView;
				}
			}
		}
		return null;
	}
	
	public String threatMitigationName (ThreatMitigationRelation mitigation) {

		String label = "";
		int i = 0;
		
		Control control = mitigation.getControl();
		EList<ThreatMitigationRelation> threatMitigationsList = control.getMitigationrRelations();
		
		for (ThreatMitigationRelation currThreat : threatMitigationsList) {
			i ++;
			label = "Mitigation #" + String.valueOf(i) + " " +control.getName();
			currThreat.setName(label);
			}
		
		label = "Mitigation #" + String.valueOf(i) + " " +control.getName();
		return label;
	}
	
	public String affectRelationName (AffectRelation affect) {
		
		String label = "";
		label = affect.getSourceComponent().getName() + " To " + affect.getTargetComponent().getName();
			
		return label;
		
	}
	
	public List<Data> availableData (AffectRelation affect) {
		
		EObject analysis = affect.eContainer();
		while (!(analysis instanceof Analysis) && analysis != null) {
			analysis = analysis.eContainer();
		}
		
		Analysis realAnalysis =  ((Analysis)analysis);
		
		EList<Data> analysisDataList = realAnalysis.getData();
		EList<Data> affectDataList = affect.getData();
		List<Data> result = new ArrayList<Data>();
		
		for (Data data : analysisDataList) {
			if (!affectDataList.contains(data)) {
				result.add(data);
			}
		}			
					
		return result;
	}
	
	public String dataLabelOnAffect (AffectRelation affect) {
		
		String label = ""; 
		
		for (Data data : affect.getData()) {
			label = label + data.getName() + " ,";
		}
		
		if (label != "") {
			label = label.substring(0, label.length() - 2);
		}
		
		return label;
	}
	

}
