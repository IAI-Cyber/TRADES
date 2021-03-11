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
