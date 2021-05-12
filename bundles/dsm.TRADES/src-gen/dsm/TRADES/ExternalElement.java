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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ExternalElement#getSource <em>Source</em>}</li>
 *   <li>{@link dsm.TRADES.ExternalElement#getLink <em>Link</em>}</li>
 *   <li>{@link dsm.TRADES.ExternalElement#getSourceID <em>Source ID</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getExternalElement()
 * @model abstract="true"
 * @generated
 */
public interface ExternalElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see dsm.TRADES.TRADESPackage#getExternalElement_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ExternalElement#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see dsm.TRADES.TRADESPackage#getExternalElement_Link()
	 * @model
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ExternalElement#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

	/**
	 * Returns the value of the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source ID</em>' attribute.
	 * @see #setSourceID(String)
	 * @see dsm.TRADES.TRADESPackage#getExternalElement_SourceID()
	 * @model
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ExternalElement#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

} // ExternalElement
