/**
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
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threats Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ThreatsOwner#getInternals <em>Internals</em>}</li>
 *   <li>{@link dsm.TRADES.ThreatsOwner#getExternals <em>Externals</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getThreatsOwner()
 * @model
 * @generated
 */
public interface ThreatsOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Internals</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internals</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreatsOwner_Internals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getInternals();

	/**
	 * Returns the value of the '<em><b>Externals</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ExternalThreat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externals</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getThreatsOwner_Externals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalThreat> getExternals();

} // ThreatsOwner
