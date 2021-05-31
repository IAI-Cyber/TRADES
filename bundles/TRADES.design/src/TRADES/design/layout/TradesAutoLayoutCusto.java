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
package TRADES.design.layout;

import java.util.Optional;

import org.eclipse.elk.core.options.CoreOptions;
import org.eclipse.elk.core.options.NodeLabelPlacement;
import org.eclipse.elk.core.service.LayoutMapping;
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

	/** The identifier of the node mapping for Control. */
	private static final String CONTROL_MAPPING_NAME = "ControlNode";
	private static final String CONTROL_MAPPING_NAME_CA = "ControlNode_CA";

	/** The identifier of the node mapping for Threat. */
	private static final String THREAT_MAPPING_NAME = "ThreatNode_TD";

	private static final String TRADES_DIAGRAM = "TRADES diagram";

	@Override
	public void beforeELKLayout(LayoutMapping layoutMapping) {
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
//		EcoreUtils.allContainedObjectOfType(layoutGraph, ElkEdge.class).forEach(edge -> edge.getSections().clear());
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
		// Force the location, of label of Control/Threat, to be centered below the node
		// (with NodeLabelPlacement.outsideBottomCenter() value for NODE_LABELS_PLACEMENT
		// property)
		EcoreUtils.allContainedObjectOfType(layoutGraph, ElkNode.class).forEach(node -> {
			Object objectEditPart = graphMap.get(node);
			if (objectEditPart instanceof IGraphicalEditPart) {
				IGraphicalEditPart editpart = (IGraphicalEditPart) objectEditPart;
				EObject sElement = editpart.resolveSemanticElement();
				if (sElement instanceof DDiagramElement) {
					DDiagramElement dde = (DDiagramElement) sElement;
					if (CONTROL_MAPPING_NAME_CA.equals(dde.getMapping().getName())
							|| CONTROL_MAPPING_NAME.equals(dde.getMapping().getName())
							|| THREAT_MAPPING_NAME.equals(dde.getMapping().getName())) {
						if (node.getLabels().size() > 0) {
							node.getLabels().get(0).setProperty(CoreOptions.NODE_LABELS_PLACEMENT,
									NodeLabelPlacement.outsideBottomCenter());
						}
					}
				}
			}
		});

	}

	@Override
	public void afterELKLayout(LayoutMapping layoutMapping) {

	}

	@Override
	public void afterGMFCommandApplied(GmfLayoutCommand gmfLayoutCommand, LayoutMapping layoutMapping) {

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

}
