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
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.All;
import dsm.oscal.model.Oscal.Call;
import dsm.oscal.model.Oscal.Include;
import dsm.oscal.model.Oscal.Match;
import dsm.oscal.model.Oscal.OscalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.IncludeImpl#getAll <em>All</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.IncludeImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.IncludeImpl#getMatchs <em>Matchs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeImpl extends MinimalEObjectImpl.Container implements Include {
	/**
	 * The cached value of the '{@link #getAll() <em>All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAll()
	 * @generated
	 * @ordered
	 */
	protected All all;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<Call> calls;

	/**
	 * The cached value of the '{@link #getMatchs() <em>Matchs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchs()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matchs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public All getAll() {
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAll(All newAll, NotificationChain msgs) {
		All oldAll = all;
		all = newAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalPackage.INCLUDE__ALL,
					oldAll, newAll);
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
	public void setAll(All newAll) {
		if (newAll != all) {
			NotificationChain msgs = null;
			if (all != null)
				msgs = ((InternalEObject) all).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OscalPackage.INCLUDE__ALL,
						null, msgs);
			if (newAll != null)
				msgs = ((InternalEObject) newAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OscalPackage.INCLUDE__ALL,
						null, msgs);
			msgs = basicSetAll(newAll, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.INCLUDE__ALL, newAll, newAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Call> getCalls() {
		if (calls == null) {
			calls = new EObjectContainmentEList<Call>(Call.class, this, OscalPackage.INCLUDE__CALLS);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatchs() {
		if (matchs == null) {
			matchs = new EObjectContainmentEList<Match>(Match.class, this, OscalPackage.INCLUDE__MATCHS);
		}
		return matchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.INCLUDE__ALL:
			return basicSetAll(null, msgs);
		case OscalPackage.INCLUDE__CALLS:
			return ((InternalEList<?>) getCalls()).basicRemove(otherEnd, msgs);
		case OscalPackage.INCLUDE__MATCHS:
			return ((InternalEList<?>) getMatchs()).basicRemove(otherEnd, msgs);
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
		case OscalPackage.INCLUDE__ALL:
			return getAll();
		case OscalPackage.INCLUDE__CALLS:
			return getCalls();
		case OscalPackage.INCLUDE__MATCHS:
			return getMatchs();
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
		case OscalPackage.INCLUDE__ALL:
			setAll((All) newValue);
			return;
		case OscalPackage.INCLUDE__CALLS:
			getCalls().clear();
			getCalls().addAll((Collection<? extends Call>) newValue);
			return;
		case OscalPackage.INCLUDE__MATCHS:
			getMatchs().clear();
			getMatchs().addAll((Collection<? extends Match>) newValue);
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
		case OscalPackage.INCLUDE__ALL:
			setAll((All) null);
			return;
		case OscalPackage.INCLUDE__CALLS:
			getCalls().clear();
			return;
		case OscalPackage.INCLUDE__MATCHS:
			getMatchs().clear();
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
		case OscalPackage.INCLUDE__ALL:
			return all != null;
		case OscalPackage.INCLUDE__CALLS:
			return calls != null && !calls.isEmpty();
		case OscalPackage.INCLUDE__MATCHS:
			return matchs != null && !matchs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IncludeImpl
