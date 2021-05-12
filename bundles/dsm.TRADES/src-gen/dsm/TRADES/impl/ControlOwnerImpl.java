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

import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.TRADESPackage;

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
 * An implementation of the model object '<em><b>Control Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ControlOwnerImpl#getInternals <em>Internals</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlOwnerImpl#getExternals <em>Externals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlOwnerImpl extends MinimalEObjectImpl.Container implements ControlOwner {
	/**
	 * The cached value of the '{@link #getInternals() <em>Internals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternals()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> internals;

	/**
	 * The cached value of the '{@link #getExternals() <em>Externals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternals()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalControl> externals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.CONTROL_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getInternals() {
		if (internals == null) {
			internals = new EObjectContainmentEList<Control>(Control.class, this,
					TRADESPackage.CONTROL_OWNER__INTERNALS);
		}
		return internals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalControl> getExternals() {
		if (externals == null) {
			externals = new EObjectContainmentEList<ExternalControl>(ExternalControl.class, this,
					TRADESPackage.CONTROL_OWNER__EXTERNALS);
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
		case TRADESPackage.CONTROL_OWNER__INTERNALS:
			return ((InternalEList<?>) getInternals()).basicRemove(otherEnd, msgs);
		case TRADESPackage.CONTROL_OWNER__EXTERNALS:
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
		case TRADESPackage.CONTROL_OWNER__INTERNALS:
			return getInternals();
		case TRADESPackage.CONTROL_OWNER__EXTERNALS:
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
		case TRADESPackage.CONTROL_OWNER__INTERNALS:
			getInternals().clear();
			getInternals().addAll((Collection<? extends Control>) newValue);
			return;
		case TRADESPackage.CONTROL_OWNER__EXTERNALS:
			getExternals().clear();
			getExternals().addAll((Collection<? extends ExternalControl>) newValue);
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
		case TRADESPackage.CONTROL_OWNER__INTERNALS:
			getInternals().clear();
			return;
		case TRADESPackage.CONTROL_OWNER__EXTERNALS:
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
		case TRADESPackage.CONTROL_OWNER__INTERNALS:
			return internals != null && !internals.isEmpty();
		case TRADESPackage.CONTROL_OWNER__EXTERNALS:
			return externals != null && !externals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlOwnerImpl
