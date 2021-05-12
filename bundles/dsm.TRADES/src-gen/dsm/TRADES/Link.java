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
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Link#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link dsm.TRADES.Link#getLinkConveyed <em>Link Conveyed</em>}</li>
 *   <li>{@link dsm.TRADES.Link#getConveyingLink <em>Conveying Link</em>}</li>
 *   <li>{@link dsm.TRADES.Link#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' reference.
	 * @see #setLinkType(LinkType)
	 * @see dsm.TRADES.TRADESPackage#getLink_LinkType()
	 * @model required="true"
	 * @generated
	 */
	LinkType getLinkType();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Link#getLinkType <em>Link Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' reference.
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(LinkType value);

	/**
	 * Returns the value of the '<em><b>Link Conveyed</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Link}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Link#getConveyingLink <em>Conveying Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Conveyed</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getLink_LinkConveyed()
	 * @see dsm.TRADES.Link#getConveyingLink
	 * @model opposite="conveyingLink"
	 * @generated
	 */
	EList<Link> getLinkConveyed();

	/**
	 * Returns the value of the '<em><b>Conveying Link</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Link}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Link#getLinkConveyed <em>Link Conveyed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conveying Link</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getLink_ConveyingLink()
	 * @see dsm.TRADES.Link#getLinkConveyed
	 * @model opposite="linkConveyed"
	 * @generated
	 */
	EList<Link> getConveyingLink();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getLink_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

} // Link
