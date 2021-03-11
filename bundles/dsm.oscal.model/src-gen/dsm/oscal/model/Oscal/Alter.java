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
 * A representation of the model object '<em><b>Alter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Alter element specifies changes to be made to an included control when a profile is resolved
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Alter#getControlId <em>Control Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Alter#getRemoves <em>Removes</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Alter#getAdds <em>Adds</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getAlter()
 * @model
 * @generated
 */
public interface Alter extends EObject {
	/**
	 * Returns the value of the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the 'id' flag on a target control
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Id</em>' attribute.
	 * @see #setControlId(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getAlter_ControlId()
	 * @model
	 * @generated
	 */
	String getControlId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Alter#getControlId <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Id</em>' attribute.
	 * @see #getControlId()
	 * @generated
	 */
	void setControlId(String value);

	/**
	 * Returns the value of the '<em><b>Removes</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Remove}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removes</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getAlter_Removes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Remove> getRemoves();

	/**
	 * Returns the value of the '<em><b>Adds</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Addition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adds</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getAlter_Adds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Addition> getAdds();

} // Alter
