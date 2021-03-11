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
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Select#getHowMany <em>How Many</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Select#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject {
	/**
	 * Returns the value of the '<em><b>How Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How Many</em>' attribute.
	 * @see #setHowMany(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSelect_HowMany()
	 * @model
	 * @generated
	 */
	String getHowMany();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Select#getHowMany <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How Many</em>' attribute.
	 * @see #getHowMany()
	 * @generated
	 */
	void setHowMany(String value);

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' attribute list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSelect_Choice()
	 * @model
	 * @generated
	 */
	EList<String> getChoice();

} // Select
