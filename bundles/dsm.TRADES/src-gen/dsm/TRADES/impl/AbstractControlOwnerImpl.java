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

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.TRADESPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Control Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AbstractControlOwnerImpl#getControlOwner <em>Control Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractControlOwnerImpl extends MinimalEObjectImpl.Container implements AbstractControlOwner {
	/**
	 * The cached value of the '{@link #getControlOwner() <em>Control Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlOwner()
	 * @generated
	 * @ordered
	 */
	protected ControlOwner controlOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractControlOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ABSTRACT_CONTROL_OWNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlOwner getControlOwner() {
		return controlOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlOwner(ControlOwner newControlOwner, NotificationChain msgs) {
		ControlOwner oldControlOwner = controlOwner;
		controlOwner = newControlOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER, oldControlOwner, newControlOwner);
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
	public void setControlOwner(ControlOwner newControlOwner) {
		if (newControlOwner != controlOwner) {
			NotificationChain msgs = null;
			if (controlOwner != null)
				msgs = ((InternalEObject) controlOwner).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER, null, msgs);
			if (newControlOwner != null)
				msgs = ((InternalEObject) newControlOwner).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER, null, msgs);
			msgs = basicSetControlOwner(newControlOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER,
					newControlOwner, newControlOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getAllControls() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalControl> getExternalControls(String id, String catalogIdentifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER:
			return basicSetControlOwner(null, msgs);
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
		case TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER:
			return getControlOwner();
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
		case TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER:
			setControlOwner((ControlOwner) newValue);
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
		case TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER:
			setControlOwner((ControlOwner) null);
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
		case TRADESPackage.ABSTRACT_CONTROL_OWNER__CONTROL_OWNER:
			return controlOwner != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TRADESPackage.ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS:
			return getAllControls();
		case TRADESPackage.ABSTRACT_CONTROL_OWNER___GET_EXTERNAL_CONTROLS__STRING_STRING:
			return getExternalControls((String) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractControlOwnerImpl
