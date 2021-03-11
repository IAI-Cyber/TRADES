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

import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatsOwner;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threats Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ThreatsOwnerImpl#getInternals <em>Internals</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatsOwnerImpl#getExternals <em>Externals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatsOwnerImpl extends MinimalEObjectImpl.Container implements ThreatsOwner {
	/**
	 * The cached value of the '{@link #getInternals() <em>Internals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternals()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> internals;

	/**
	 * The cached value of the '{@link #getExternals() <em>Externals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternals()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> externals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatsOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.THREATS_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getInternals() {
		if (internals == null) {
			internals = new EObjectContainmentEList<Threat>(Threat.class, this, TRADESPackage.THREATS_OWNER__INTERNALS);
		}
		return internals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getExternals() {
		if (externals == null) {
			externals = new EObjectContainmentEList<Threat>(Threat.class, this, TRADESPackage.THREATS_OWNER__EXTERNALS);
		}
		return externals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.THREATS_OWNER__INTERNALS:
			return ((InternalEList<?>) getInternals()).basicRemove(otherEnd, msgs);
		case TRADESPackage.THREATS_OWNER__EXTERNALS:
			return ((InternalEList<?>) getExternals()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.THREATS_OWNER__INTERNALS:
			return getInternals();
		case TRADESPackage.THREATS_OWNER__EXTERNALS:
			return getExternals();
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
		case TRADESPackage.THREATS_OWNER__INTERNALS:
			getInternals().clear();
			getInternals().addAll((Collection<? extends Threat>) newValue);
			return;
		case TRADESPackage.THREATS_OWNER__EXTERNALS:
			getExternals().clear();
			getExternals().addAll((Collection<? extends Threat>) newValue);
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
		case TRADESPackage.THREATS_OWNER__INTERNALS:
			getInternals().clear();
			return;
		case TRADESPackage.THREATS_OWNER__EXTERNALS:
			getExternals().clear();
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
		case TRADESPackage.THREATS_OWNER__INTERNALS:
			return internals != null && !internals.isEmpty();
		case TRADESPackage.THREATS_OWNER__EXTERNALS:
			return externals != null && !externals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThreatsOwnerImpl
