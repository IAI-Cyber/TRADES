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
import dsm.oscal.model.Oscal.Select;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SelectImpl#getHowMany <em>How Many</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SelectImpl#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends MinimalEObjectImpl.Container implements Select {
	/**
	 * The default value of the '{@link #getHowMany() <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowMany()
	 * @generated
	 * @ordered
	 */
	protected static final String HOW_MANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHowMany() <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowMany()
	 * @generated
	 * @ordered
	 */
	protected String howMany = HOW_MANY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<String> choice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHowMany() {
		return howMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHowMany(String newHowMany) {
		String oldHowMany = howMany;
		howMany = newHowMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.SELECT__HOW_MANY, oldHowMany, howMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getChoice() {
		if (choice == null) {
			choice = new EDataTypeUniqueEList<String>(String.class, this, OscalPackage.SELECT__CHOICE);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OscalPackage.SELECT__HOW_MANY:
			return getHowMany();
		case OscalPackage.SELECT__CHOICE:
			return getChoice();
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
		case OscalPackage.SELECT__HOW_MANY:
			setHowMany((String) newValue);
			return;
		case OscalPackage.SELECT__CHOICE:
			getChoice().clear();
			getChoice().addAll((Collection<? extends String>) newValue);
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
		case OscalPackage.SELECT__HOW_MANY:
			setHowMany(HOW_MANY_EDEFAULT);
			return;
		case OscalPackage.SELECT__CHOICE:
			getChoice().clear();
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
		case OscalPackage.SELECT__HOW_MANY:
			return HOW_MANY_EDEFAULT == null ? howMany != null : !HOW_MANY_EDEFAULT.equals(howMany);
		case OscalPackage.SELECT__CHOICE:
			return choice != null && !choice.isEmpty();
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
		result.append(" (howMany: ");
		result.append(howMany);
		result.append(", choice: ");
		result.append(choice);
		result.append(')');
		return result.toString();
	}

} //SelectImpl
