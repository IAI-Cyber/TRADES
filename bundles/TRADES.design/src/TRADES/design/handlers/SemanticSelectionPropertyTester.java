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
package TRADES.design.handlers;

import java.util.Collection;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.emf.ecore.EObject;

import dsm.TRADES.TRADESPackage;

/**
 * Property test that check that the current selection if one or more EObject
 * belonging to TRADES or OSCAL MM
 * 
 * @author Arthur Daussy
 *
 */
public class SemanticSelectionPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (receiver instanceof Collection<?>) {
			return ((Collection<?>) receiver).stream().allMatch(e -> {
				EObject eObject = Adapters.adapt(e, EObject.class);
				return eObject != null && (eObject.eClass().getEPackage() == TRADESPackage.eINSTANCE);
			});
		}

		return false;
	}

}
