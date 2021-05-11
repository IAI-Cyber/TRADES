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
 * A representation of the model object '<em><b>Control Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ControlOwner#getInternals <em>Internals</em>}</li>
 *   <li>{@link dsm.TRADES.ControlOwner#getExternals <em>Externals</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getControlOwner()
 * @model
 * @generated
 */
public interface ControlOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Internals</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internals</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getControlOwner_Internals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getInternals();

	/**
	 * Returns the value of the '<em><b>Externals</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ExternalControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externals</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getControlOwner_Externals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalControl> getExternals();

} // ControlOwner
