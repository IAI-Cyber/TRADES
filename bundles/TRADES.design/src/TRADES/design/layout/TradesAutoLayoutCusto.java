package TRADES.design.layout;

import java.util.Optional;

import org.eclipse.elk.core.options.CoreOptions;
import org.eclipse.elk.core.options.NodeLabelPlacement;
import org.eclipse.elk.core.service.LayoutMapping;
import org.eclipse.elk.graph.ElkEdge;
import org.eclipse.elk.graph.ElkGraphElement;
import org.eclipse.elk.graph.ElkGraphPackage;
import org.eclipse.elk.graph.ElkLabel;
import org.eclipse.elk.graph.ElkNode;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.elk.ElkDiagramLayoutConnector;
import org.eclipse.sirius.diagram.elk.GmfLayoutCommand;
import org.eclipse.sirius.diagram.elk.IELKLayoutExtension;

import com.google.common.collect.BiMap;

import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.Threat;
import dsm.TRADES.util.EcoreUtils;

public class TradesAutoLayoutCusto implements IELKLayoutExtension {

	private static final String TRADES_DIAGRAM = "TRADES diagram";

//	private List<ElkEdge> modifiedMitigationRelations;

	@Override
	public void beforeELKLayout(LayoutMapping layoutMapping) {
//		modifiedMitigationRelations = new ArrayList<>();
		Optional<DDiagram> optionalDDiagram = getDDiagram(layoutMapping);
		if (optionalDDiagram.isPresent()) {
			String diagramDescriptionName = optionalDDiagram.get().getDescription() != null
					? optionalDDiagram.get().getDescription().getName()
					: StringUtil.EMPTY_STRING;
			if (TRADES_DIAGRAM.equals(diagramDescriptionName) || "Component Analysis".equals(diagramDescriptionName)) {
				beforeElkLayout_MainDiagram(layoutMapping, optionalDDiagram.get());
			}
		}
	}

	private void beforeElkLayout_MainDiagram(LayoutMapping layoutMapping, DDiagram dDiagram) {
		// Remove all edge layout information

		ElkNode layoutGraph = layoutMapping.getLayoutGraph();
		EcoreUtils.allContainedObjectOfType(layoutGraph, ElkEdge.class).forEach(edge -> edge.getSections().clear());
		BiMap<ElkGraphElement, Object> graphMap = layoutMapping.getGraphMap();
		EcoreUtils.allContainedObjectOfType(layoutGraph, ElkLabel.class).forEach(label -> {
			ElkGraphElement parent = label.getParent();
			Object oParent = graphMap.get(parent);
			if (oParent instanceof IGraphicalEditPart) {
				IGraphicalEditPart editpart = (IGraphicalEditPart) oParent;
				EObject sElement = editpart.resolveSemanticElement();
				if (sElement instanceof DDiagramElement) {
					DDiagramElement node = (DDiagramElement) sElement;
					EObject semanticElement = node.getTarget();
					if (semanticElement instanceof Component) {
						label.setProperty(CoreOptions.NODE_LABELS_PLACEMENT, NodeLabelPlacement.insideTopCenter());
					} else if (semanticElement instanceof Threat || semanticElement instanceof Control) {
						label.setProperty(CoreOptions.NODE_LABELS_PLACEMENT, NodeLabelPlacement.outsideBottomCenter());
						label.eUnset(ElkGraphPackage.eINSTANCE.getElkShape_X());
						label.eUnset(ElkGraphPackage.eINSTANCE.getElkShape_Y());
					}

				}
			}
		});

		// Attempt to handle edge that connect node to another edge
//
//		List<Pair<ElkEdge, ThreatMitigationRelation>> mitigationEdges = getEdgeWithMappingNames(layoutGraph, graphMap,
//				ThreatMitigationRelation.class, "mitigatesThreatAllocation");
//
//		List<Pair<ElkEdge, ThreatAllocationRelation>> affectEdges = getEdgeWithMappingNames(layoutGraph,
//				layoutMapping.getGraphMap(), ThreatAllocationRelation.class, "allocatedThreat");
//		int cmpt = 0;
//		for (Pair<ElkEdge, ThreatAllocationRelation> affectRelation : affectEdges) {
//			cmpt++;
//			ThreatAllocationRelation affectRel = affectRelation.getTwo();
//
//			/// Gets linked mitigations
//			List<Pair<ElkEdge, ThreatMitigationRelation>> linkedMitigation = mitigationEdges.stream()
//					.filter(e -> e.getTwo().getMitigates() == affectRel).collect(Collectors.toList());
//
//			if (!linkedMitigation.isEmpty()) {
//				ElkEdge affectEdge = affectRelation.getOne();
//				ElkConnectableShape elkNode = affectEdge.getTargets().get(0);
//				if (elkNode instanceof ElkNode) {
//					ElkNode targetNode = (ElkNode) elkNode;
//					ElkPort port = ElkGraphUtil.createPort(targetNode);
//					port.setIdentifier(targetNode.getIdentifier() + "_" + cmpt);
//					port.setDimensions(1, 1);
//					port.setProperty(CoreOptions.PORT_BORDER_OFFSET, -1.0);
////					modifiedMitigationRelations.add(affectEdge);
//					affectEdge.getTargets().clear();
//					affectEdge.getTargets().add(port);
//
//					for (Pair<ElkEdge, ThreatMitigationRelation> miEntry : linkedMitigation) {
//						ElkEdge miEdge = miEntry.getOne();
//						modifiedMitigationRelations.add(miEdge);
//						miEdge.getTargets().clear();
//						miEdge.getTargets().add(port);
//					}
//				}
//			}
//		}

		// For each of them create a virtual port on the target component

//		for (Pair<ElkEdge, ThreatMitigationRelation> edgeEntry : mitigationEdges) {
//
//			ThreatMitigationRelation mitigationRel = edgeEntry.getTwo();
//
//			// Change the relation edges
//			Optional<Pair<ElkEdge, ThreatAllocationRelation>> optMatchingAffectEdge = getEdgeWithMappingNames(
//					layoutGraph, layoutMapping.getGraphMap(), ThreatAllocationRelation.class, "allocatedThreat")
//							.stream()//
//							.filter(entry -> entry.getTwo() == mitigationRel.getMitigates()).findFirst();
//
//			if (!optMatchingAffectEdge.isEmpty()) {
//				ElkEdge affectEdge = optMatchingAffectEdge.get().getOne();
//				ElkEdge edge = edgeEntry.getOne();
//				ElkConnectableShape elkNode = edge.getTargets().get(0);
//				if (elkNode instanceof ElkNode) {
//					ElkNode targetNode = (ElkNode) elkNode;
//					ElkPort port = ElkGraphUtil.createPort(targetNode);
//					port.setIdentifier(targetNode.getIdentifier() + "_" + edge.getIdentifier());
//					port.setDimensions(1, 1);
//					port.setProperty(CoreOptions.PORT_BORDER_OFFSET, -1.0);
//					edge.getTargets().clear();
//					edge.getTargets().add(port);
//					affectEdge.getTargets().clear();
//					affectEdge.getTargets().add(port);
//				}
//			}
//		}

		// Change the target of both the mitigation and the affectation to that port
//		System.out.println(mitigationEdges);

	}

	@Override
	public void afterELKLayout(LayoutMapping layoutMapping) {

		// Attempt to handle edge that connect node to another edge
//		for (ElkEdge edge : modifiedMitigationRelations) {
//			System.out.println(edge);
//			KVectorChain jPoint = edge.getProperty(CoreOptions.JUNCTION_POINTS);
//			if(jPoint != null && !jPoint.isEmpty()) {
//				KVector lastJPoint = jPoint.get(jPoint.size() - 1);
//				System.out.println(jPoint);
//				List<ElkEdgeSection> sectionToKeep = new ArrayList<ElkEdgeSection>();
//				for (ElkEdgeSection s : edge.getSections()) {
//					sectionToKeep.add(s);
//					List<ElkBendPoint> bendPointToKeep = new ArrayList<ElkBendPoint>();
//					for (ElkBendPoint bp : s.getBendPoints()) {
//						if( bp.getX() == lastJPoint.x && bp.getY() == lastJPoint.y) {
//							break;
//						}
//						bendPointToKeep.add(bp);
//					}
//					s.getBendPoints().clear();
//					s.getBendPoints().addAll(bendPointToKeep);
//					s.setEndLocation(lastJPoint.x, lastJPoint.y);
//				}
//			}
//			edge.setProperty(CoreOptions.JUNCTION_POINTS, null);
//		}

	}

	@Override
	public void afterGMFCommandApplied(GmfLayoutCommand gmfLayoutCommand, LayoutMapping layoutMapping) {
		// TODO Auto-generated method stub

	}

	/**
	 * Return the {@link DDiagram} concerned by this {@link LayoutMapping}.
	 *
	 * @param layoutMapping The ELK layout mapping
	 * @return the {@link DiagramDescription} name of the {@link DDiagram} concerned
	 *         by this {@link LayoutMapping}.
	 */
	private Optional<DDiagram> getDDiagram(LayoutMapping layoutMapping) {
		// Retrieve the root diagram editPart
		DiagramEditPart diagramEditPart = layoutMapping.getProperty(ElkDiagramLayoutConnector.DIAGRAM_EDIT_PART);
		// Retrieve the GMF diagram
		Diagram gmfDiagram = diagramEditPart.getDiagramView();
		if (gmfDiagram.getElement() instanceof DDiagram) {
			return Optional.of((DDiagram) gmfDiagram.getElement());
		}
		return Optional.empty();
	}

//	private List<ElkNode> getNodesWithMappingNames(ElkNode elkNode, BiMap<ElkGraphElement, Object> graphMap,
//			Predicate<EObject> semanticFilter, String... mappingNames) {
//		List<ElkNode> elkNodes = new ArrayList<>();
//
//		// We collect nodes with the given mapping.
//		elkNodes.addAll(elkNode.getChildren().stream().filter(node -> {
//			Object editPart = graphMap.get(node);
//			if (editPart instanceof AbstractBorderedDiagramElementEditPart) {
//				EObject targetElement = ((AbstractBorderedDiagramElementEditPart) editPart).resolveSemanticElement();
//				if (targetElement instanceof DEdge) {
//					DEdge dEdge = (DEdge) targetElement;
//					DiagramElementMapping mapping = dEdge.getDiagramElementMapping();
//					if (mapping != null) {
//						for (String mappingName : mappingNames) {
//							if (mappingName.equals(mapping.getName())) {
//								return semanticFilter == null || semanticFilter.apply(dEdge.getTarget());
//							}
//						}
//					}
//				}
//			}
//			return false;
//		}).collect(Collectors.toList()));
//
//		// We recursively collect them for each child
//		elkNodes.addAll(elkNode.getChildren().stream()
//				.flatMap(n -> getNodesWithMappingNames(n, graphMap, mappingNames).stream())
//				.collect(Collectors.toList()));
//
//		return elkNodes;
//	}

//	private <T extends EObject> List<Pair<ElkEdge, T>> getEdgeWithMappingNames(ElkNode elkNode,
//			BiMap<ElkGraphElement, Object> graphMap, Class<T> type, String... mappingNames) {
//		List<Pair<ElkEdge, T>> elkNodes = new ArrayList<>();
//
//		// We collect nodes with the given mapping.
//		elkNodes.addAll(elkNode.getContainedEdges().stream().map(edge -> {
//			Object editPart = graphMap.get(edge);
//			if (editPart instanceof DEdgeEditPart) {
//				EObject targetElement = ((DEdgeEditPart) editPart).resolveSemanticElement();
//				if (targetElement instanceof DEdge) {
//					DEdge dEdge = (DEdge) targetElement;
//					DiagramElementMapping mapping = dEdge.getDiagramElementMapping();
//					if (mapping != null) {
//						for (String mappingName : mappingNames) {
//							if (mappingName.equals(mapping.getName())) {
//								EObject target = dEdge.getTarget();
//								if (type.isInstance(target)) {
//									return Tuples.pair(edge, type.cast(target));
//								} else {
//									return null;
//								}
//
//							}
//						}
//					}
//				}
//			}
//			return null;
//		}).filter(e -> e != null).collect(Collectors.toList()));
//
//		// We recursively collect them for each child
//		elkNodes.addAll(elkNode.getChildren().stream()
//				.flatMap(n -> getEdgeWithMappingNames(n, graphMap, type, mappingNames).stream())
//				.collect(Collectors.toList()));
//
//		return elkNodes;
//	}

}
