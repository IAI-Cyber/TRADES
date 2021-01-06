package TRADES.design;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import dsm.TRADES.AffectRelation;
import dsm.TRADES.Analysis;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Component;
import dsm.TRADES.ComponentOwner;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DataOwnerElement;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.util.EcoreUtils;

public class DiagramService {

	public String getAttackChainLabel(AttackChainStep step) {

		String label = step.getStepNum();

		ThreatAllocationRelation allocation = step.getThreatAllocationRelation();

		label += " : " + getAllocLabel(allocation);

		return label;

	}

	/**
	 * Gets all threats that are linked to the semantic element behind the given
	 * node or one of its descendant
	 * 
	 * @param node a node
	 * @return a list of {@link Threat}
	 */
	public List<Threat> getRelatedThreats(DSemanticDecorator node) {
		EObject semanticTarget = node.getTarget();

		Set<Threat> alsreadyDisplayed = getDisplayedThreats(node);
		Set<Threat> collector = new HashSet<>();
		getLinkedThreat(semanticTarget, collector);
		return collector.stream().filter(e -> !alsreadyDisplayed.contains(e)).collect(toList());
	}

	private Set<Threat> getDisplayedThreats(DSemanticDecorator node) {
		DSemanticDiagram diagram = EcoreUtils.getAncestor(node, DSemanticDiagram.class);

		if (diagram != null) {

			return EcoreUtils.allContainedObjectOfType(diagram, DSemanticDecorator.class)
					.filter(n -> n.getTarget() instanceof Threat).map(n -> (Threat) n.getTarget()).collect(toSet());
		} else {
			return Collections.emptySet();
		}
	}

	private void getLinkedThreat(EObject o, Set<Threat> collector) {
		if (o instanceof Component) {
			Component cmp = (Component) o;
			cmp.getThreatAllocations().stream().map(rel -> rel.getThreat()).forEach(collector::add);
		}

		if (o instanceof ComponentOwner) {
			for (Component c : ((ComponentOwner) o).getComponent()) {
				getLinkedThreat(c, collector);
			}
		}
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

	/**
	 * Gets all threats not already displayed in the diagram
	 * 
	 * @param semanticElement a semantic element (should be contained in a
	 *                        {@link Analysis})
	 * @param node            an element of the diagram)
	 * @return
	 */
	public List<Threat> getAllNonDisplayedThreats(EObject semanticElement, DSemanticDecorator node) {
		Set<Threat> displayedThreat = getDisplayedThreats(node);
		return EcoreUtils
				.allContainedObjectOfType(EcoreUtils.getAncestor(semanticElement, Analysis.class).getThreatOwner(),
						Threat.class)
				.filter(t -> !displayedThreat.contains(t)).collect(toList());
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

	public List<Data> availableData(AffectRelation affect) {
		List<Data> result = new ArrayList<Data>();

		collectData(affect.eContainer(), result, new HashSet<>(affect.getData()));

		return result;
	}

	private void collectData(EObject from, List<Data> datas, Set<Data> relatedData) {
		if (from instanceof DataOwnerElement) {
			DataOwner owner = ((DataOwnerElement) from).getDataOwner();
			if (owner != null) {
				datas.addAll(owner.getData().stream().filter(d -> !relatedData.contains(d)).collect(toList()));
			}
		}

		EObject eContainer = from.eContainer();
		if (eContainer != null) {
			collectData(eContainer, datas, relatedData);
		}
	}

	public String dataLabelOnAffect(AffectRelation affect) {

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
