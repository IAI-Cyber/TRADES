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

import dsm.oscal.model.Oscal.OscalPackage;
import dsm.oscal.model.Oscal.Remove;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.RemoveImpl#getNameRef <em>Name Ref</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.RemoveImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.RemoveImpl#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.RemoveImpl#getItemName <em>Item Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveImpl extends MinimalEObjectImpl.Container implements Remove {
	/**
	 * The default value of the '{@link #getNameRef() <em>Name Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameRef()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameRef() <em>Name Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameRef()
	 * @generated
	 * @ordered
	 */
	protected String nameRef = NAME_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected String classRef = CLASS_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdRef() <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdRef() <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRef()
	 * @generated
	 * @ordered
	 */
	protected String idRef = ID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemName() <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemName()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemName() <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemName()
	 * @generated
	 * @ordered
	 */
	protected String itemName = ITEM_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.REMOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameRef() {
		return nameRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameRef(String newNameRef) {
		String oldNameRef = nameRef;
		nameRef = newNameRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.REMOVE__NAME_REF, oldNameRef, nameRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassRef() {
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassRef(String newClassRef) {
		String oldClassRef = classRef;
		classRef = newClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.REMOVE__CLASS_REF, oldClassRef,
					classRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdRef() {
		return idRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRef(String newIdRef) {
		String oldIdRef = idRef;
		idRef = newIdRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.REMOVE__ID_REF, oldIdRef, idRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemName(String newItemName) {
		String oldItemName = itemName;
		itemName = newItemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.REMOVE__ITEM_NAME, oldItemName,
					itemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OscalPackage.REMOVE__NAME_REF:
			return getNameRef();
		case OscalPackage.REMOVE__CLASS_REF:
			return getClassRef();
		case OscalPackage.REMOVE__ID_REF:
			return getIdRef();
		case OscalPackage.REMOVE__ITEM_NAME:
			return getItemName();
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
		case OscalPackage.REMOVE__NAME_REF:
			setNameRef((String) newValue);
			return;
		case OscalPackage.REMOVE__CLASS_REF:
			setClassRef((String) newValue);
			return;
		case OscalPackage.REMOVE__ID_REF:
			setIdRef((String) newValue);
			return;
		case OscalPackage.REMOVE__ITEM_NAME:
			setItemName((String) newValue);
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
		case OscalPackage.REMOVE__NAME_REF:
			setNameRef(NAME_REF_EDEFAULT);
			return;
		case OscalPackage.REMOVE__CLASS_REF:
			setClassRef(CLASS_REF_EDEFAULT);
			return;
		case OscalPackage.REMOVE__ID_REF:
			setIdRef(ID_REF_EDEFAULT);
			return;
		case OscalPackage.REMOVE__ITEM_NAME:
			setItemName(ITEM_NAME_EDEFAULT);
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
		case OscalPackage.REMOVE__NAME_REF:
			return NAME_REF_EDEFAULT == null ? nameRef != null : !NAME_REF_EDEFAULT.equals(nameRef);
		case OscalPackage.REMOVE__CLASS_REF:
			return CLASS_REF_EDEFAULT == null ? classRef != null : !CLASS_REF_EDEFAULT.equals(classRef);
		case OscalPackage.REMOVE__ID_REF:
			return ID_REF_EDEFAULT == null ? idRef != null : !ID_REF_EDEFAULT.equals(idRef);
		case OscalPackage.REMOVE__ITEM_NAME:
			return ITEM_NAME_EDEFAULT == null ? itemName != null : !ITEM_NAME_EDEFAULT.equals(itemName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nameRef: ");
		result.append(nameRef);
		result.append(", classRef: ");
		result.append(classRef);
		result.append(", idRef: ");
		result.append(idRef);
		result.append(", itemName: ");
		result.append(itemName);
		result.append(')');
		return result.toString();
	}

} //RemoveImpl
