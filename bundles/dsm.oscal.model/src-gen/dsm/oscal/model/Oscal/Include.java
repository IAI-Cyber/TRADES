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
package dsm.oscal.model.Oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When a control is included, whether its child (dependent) controls are also included
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Include#getAll <em>All</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Include#getCalls <em>Calls</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Include#getMatchs <em>Matchs</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends EObject {
	/**
	 * Returns the value of the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All</em>' containment reference.
	 * @see #setAll(All)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getInclude_All()
	 * @model containment="true"
	 * @generated
	 */
	All getAll();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Include#getAll <em>All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All</em>' containment reference.
	 * @see #getAll()
	 * @generated
	 */
	void setAll(All value);

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getInclude_Calls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Call> getCalls();

	/**
	 * Returns the value of the '<em><b>Matchs</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchs</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getInclude_Matchs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatchs();

} // Include
