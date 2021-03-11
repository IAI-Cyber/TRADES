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
 * A representation of the model object '<em><b>Exclude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Which controls to exclude from the resource (source catalog) being imported
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Exclude#getCalls <em>Calls</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Exclude#getMatchs <em>Matchs</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getExclude()
 * @model
 * @generated
 */
public interface Exclude extends EObject {
	/**
	 * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getExclude_Calls()
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
	 * @see dsm.oscal.model.Oscal.OscalPackage#getExclude_Matchs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatchs();

} // Exclude
