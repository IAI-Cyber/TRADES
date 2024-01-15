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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ComponentType#getRefines <em>Refines</em>}</li>
 *   <li>{@link dsm.TRADES.ComponentType#getSubjectToThreats <em>Subject To Threats</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponentType_Refines()
	 * @model
	 * @generated
	 */
	EList<ComponentType> getRefines();

	/**
	 * Returns the value of the '<em><b>Subject To Threats</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject To Threats</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponentType_SubjectToThreats()
	 * @model
	 * @generated
	 */
	EList<Threat> getSubjectToThreats();

} // ComponentType
