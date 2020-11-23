package TRADES.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.business.api.helper.graphicalfilters.HideFilterHelper;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Component;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		return self;
	}

	// A function to hide elements from a diagram
	public void encapsulateElements(Component component, DDiagram diagram) {
		Collection<EObject> result = new EObjectQuery(component)
				.getInverseReferences(ViewpointPackage.Literals.DREPRESENTATION_ELEMENT__SEMANTIC_ELEMENTS);
		// ???result.toArray();
		System.out.println(result.toString()); // DEBUG
		result.forEach(e -> System.out.print(e.eClass().getName() + ';')); // DEBUG
		System.out.println(); // DEBUG
		result.removeIf(obj -> obj.eClass().getName().toString() != "DNodeContainer");
		System.out.print("filtered: ");
		result.forEach(e -> System.out.print(e.eClass().getName() + ";")); // DEBUG
		System.out.println(); // DEBUG

		result.removeIf(n -> !(((DDiagramElement) n).getParentDiagram().equals(diagram)));

		// Collection<EObject> resultRep = new EObjectQuery((EObject)
		// result).getRepresentation(diagram);
		result.forEach(diagramElement -> HideFilterHelper.INSTANCE.hide((DDiagramElement) diagramElement));

		return;
	}



	// A function to show (cancel hiding) elements from diagram
	public void decapsulateElements(Component component, DDiagram diagram) {
		Collection<EObject> result = new EObjectQuery(component)
				.getInverseReferences(ViewpointPackage.Literals.DREPRESENTATION_ELEMENT__SEMANTIC_ELEMENTS); // past:
																												// DSEMANTIC_DECORATOR__TARGET
		// DSemanticDecor

		result.removeIf(obj -> obj.eClass().getName().toString() != "DNodeContainer");
		result.removeIf(n -> !(((DDiagramElement) n).getParentDiagram().equals(diagram)));
		// result.forEach(elem -> System.out.print(elem.eClass().getName().toString()));

		result.forEach(diagramElement -> HideFilterHelper.INSTANCE.reveal((DDiagramElement) diagramElement));

		// Alternative implementation (different syntax)
		// for (EObject diagramElement : result) {
		// HideFilterHelper.INSTANCE.reveal((DDiagramElement) diagramElement);
		// }
		return;
	}
}
