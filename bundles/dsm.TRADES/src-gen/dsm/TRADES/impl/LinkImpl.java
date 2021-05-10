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
package dsm.TRADES.impl;

import dsm.TRADES.Component;
import dsm.TRADES.Link;
import dsm.TRADES.LinkType;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.LinkImpl#getLinktype <em>Linktype</em>}</li>
 *   <li>{@link dsm.TRADES.impl.LinkImpl#getLinkConveyed <em>Link Conveyed</em>}</li>
 *   <li>{@link dsm.TRADES.impl.LinkImpl#getConveyingLink <em>Conveying Link</em>}</li>
 *   <li>{@link dsm.TRADES.impl.LinkImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends NamedElementImpl implements Link {
	/**
	 * The cached value of the '{@link #getLinktype() <em>Linktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinktype()
	 * @generated
	 * @ordered
	 */
	protected LinkType linktype;

	/**
	 * The cached value of the '{@link #getLinkConveyed() <em>Link Conveyed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkConveyed()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> linkConveyed;

	/**
	 * The cached value of the '{@link #getConveyingLink() <em>Conveying Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyingLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> conveyingLink;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getLinktype() {
		if (linktype != null && linktype.eIsProxy()) {
			InternalEObject oldLinktype = (InternalEObject) linktype;
			linktype = (LinkType) eResolveProxy(oldLinktype);
			if (linktype != oldLinktype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TRADESPackage.LINK__LINKTYPE, oldLinktype,
							linktype));
			}
		}
		return linktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType basicGetLinktype() {
		return linktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinktype(LinkType newLinktype) {
		LinkType oldLinktype = linktype;
		linktype = newLinktype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.LINK__LINKTYPE, oldLinktype, linktype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinkConveyed() {
		if (linkConveyed == null) {
			linkConveyed = new EObjectWithInverseResolvingEList.ManyInverse<Link>(Link.class, this,
					TRADESPackage.LINK__LINK_CONVEYED, TRADESPackage.LINK__CONVEYING_LINK);
		}
		return linkConveyed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getConveyingLink() {
		if (conveyingLink == null) {
			conveyingLink = new EObjectWithInverseResolvingEList.ManyInverse<Link>(Link.class, this,
					TRADESPackage.LINK__CONVEYING_LINK, TRADESPackage.LINK__LINK_CONVEYED);
		}
		return conveyingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<Component>(Component.class, this, TRADESPackage.LINK__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.LINK__LINK_CONVEYED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinkConveyed()).basicAdd(otherEnd, msgs);
		case TRADESPackage.LINK__CONVEYING_LINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConveyingLink()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.LINK__LINK_CONVEYED:
			return ((InternalEList<?>) getLinkConveyed()).basicRemove(otherEnd, msgs);
		case TRADESPackage.LINK__CONVEYING_LINK:
			return ((InternalEList<?>) getConveyingLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.LINK__LINKTYPE:
			if (resolve)
				return getLinktype();
			return basicGetLinktype();
		case TRADESPackage.LINK__LINK_CONVEYED:
			return getLinkConveyed();
		case TRADESPackage.LINK__CONVEYING_LINK:
			return getConveyingLink();
		case TRADESPackage.LINK__COMPONENTS:
			return getComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.LINK__LINKTYPE:
			setLinktype((LinkType) newValue);
			return;
		case TRADESPackage.LINK__LINK_CONVEYED:
			getLinkConveyed().clear();
			getLinkConveyed().addAll((Collection<? extends Link>) newValue);
			return;
		case TRADESPackage.LINK__CONVEYING_LINK:
			getConveyingLink().clear();
			getConveyingLink().addAll((Collection<? extends Link>) newValue);
			return;
		case TRADESPackage.LINK__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TRADESPackage.LINK__LINKTYPE:
			setLinktype((LinkType) null);
			return;
		case TRADESPackage.LINK__LINK_CONVEYED:
			getLinkConveyed().clear();
			return;
		case TRADESPackage.LINK__CONVEYING_LINK:
			getConveyingLink().clear();
			return;
		case TRADESPackage.LINK__COMPONENTS:
			getComponents().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TRADESPackage.LINK__LINKTYPE:
			return linktype != null;
		case TRADESPackage.LINK__LINK_CONVEYED:
			return linkConveyed != null && !linkConveyed.isEmpty();
		case TRADESPackage.LINK__CONVEYING_LINK:
			return conveyingLink != null && !conveyingLink.isEmpty();
		case TRADESPackage.LINK__COMPONENTS:
			return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
