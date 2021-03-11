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
 * A representation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set parameters or amend controls in resolution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Modify#getSetparameters <em>Setparameters</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Modify#getAlters <em>Alters</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getModify()
 * @model
 * @generated
 */
public interface Modify extends EObject {
	/**
	 * Returns the value of the '<em><b>Setparameters</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.SetParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setparameters</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getModify_Setparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetParameter> getSetparameters();

	/**
	 * Returns the value of the '<em><b>Alters</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Alter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alters</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getModify_Alters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alter> getAlters();

} // Modify
