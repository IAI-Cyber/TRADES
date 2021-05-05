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
 *   <li>{@link dsm.TRADES.Link#getAffectRelations <em>Affect Relations</em>}</li>
 *   <li>{@link dsm.TRADES.Link#getLinktype <em>Linktype</em>}</li>
 *   <li>{@link dsm.TRADES.Link#getLinkConveyed <em>Link Conveyed</em>}</li>
 *   <li>{@link dsm.TRADES.Link#getConveyingLink <em>Conveying Link</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Affect Relations</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.AffectRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.AffectRelation#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affect Relations</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getLink_AffectRelations()
	 * @see dsm.TRADES.AffectRelation#getLink
	 * @model opposite="link"
	 * @generated
	 */
	EList<AffectRelation> getAffectRelations();

	/**
	 * Returns the value of the '<em><b>Linktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linktype</em>' reference.
	 * @see #setLinktype(LinkType)
	 * @see dsm.TRADES.TRADESPackage#getLink_Linktype()
	 * @model required="true"
	 * @generated
	 */
	LinkType getLinktype();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Link#getLinktype <em>Linktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linktype</em>' reference.
	 * @see #getLinktype()
	 * @generated
	 */
	void setLinktype(LinkType value);

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

} // Link
