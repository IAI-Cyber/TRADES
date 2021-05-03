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

import dsm.TRADES.AbstractThreatOwner;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatsOwner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Threat Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AbstractThreatOwnerImpl#getThreatOwner <em>Threat Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractThreatOwnerImpl extends MinimalEObjectImpl.Container implements AbstractThreatOwner {
	/**
	 * The cached value of the '{@link #getThreatOwner() <em>Threat Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatOwner()
	 * @generated
	 * @ordered
	 */
	protected ThreatsOwner threatOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractThreatOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ABSTRACT_THREAT_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatsOwner getThreatOwner() {
		return threatOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreatOwner(ThreatsOwner newThreatOwner, NotificationChain msgs) {
		ThreatsOwner oldThreatOwner = threatOwner;
		threatOwner = newThreatOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER, oldThreatOwner, newThreatOwner);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreatOwner(ThreatsOwner newThreatOwner) {
		if (newThreatOwner != threatOwner) {
			NotificationChain msgs = null;
			if (threatOwner != null)
				msgs = ((InternalEObject) threatOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER, null, msgs);
			if (newThreatOwner != null)
				msgs = ((InternalEObject) newThreatOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER, null, msgs);
			msgs = basicSetThreatOwner(newThreatOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER,
					newThreatOwner, newThreatOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER:
			return basicSetThreatOwner(null, msgs);
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
		case TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER:
			return getThreatOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER:
			setThreatOwner((ThreatsOwner) newValue);
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
		case TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER:
			setThreatOwner((ThreatsOwner) null);
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
		case TRADESPackage.ABSTRACT_THREAT_OWNER__THREAT_OWNER:
			return threatOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractThreatOwnerImpl
