package dsm.trades.m2doc.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import dsm.TRADES.TRADESPackage;

public class HandlerUtils {

	public static EObject getTradesSelection(final ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;

			if (strucSelection.size() == 1) {
				Object first = strucSelection.getFirstElement();
				if (first instanceof EObject) {
					EObject eObject = (EObject) first;
					if (eObject.eClass().getEPackage() == TRADESPackage.eINSTANCE) {
						return eObject;
					}
				}
			}

		}
		return null;
	}
}
