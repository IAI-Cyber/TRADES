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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * How clashing controls should be handled
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Combine#getMethod <em>Method</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Combine#isAsIs <em>As Is</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Combine#getCustom <em>Custom</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getCombine()
 * @model
 * @generated
 */
public interface Combine extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCombine_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Combine#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>As Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An As-is element indicates that the controls should be structured in resolution as they are structured in their source catalogs. It does not contain any elements or attributes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Is</em>' attribute.
	 * @see #setAsIs(boolean)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCombine_AsIs()
	 * @model
	 * @generated
	 */
	boolean isAsIs();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Combine#isAsIs <em>As Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Is</em>' attribute.
	 * @see #isAsIs()
	 * @generated
	 */
	void setAsIs(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom</em>' containment reference.
	 * @see #setCustom(Custom)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCombine_Custom()
	 * @model containment="true"
	 * @generated
	 */
	Custom getCustom();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Combine#getCustom <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom</em>' containment reference.
	 * @see #getCustom()
	 * @generated
	 */
	void setCustom(Custom value);

} // Combine
