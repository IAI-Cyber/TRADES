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

import dsm.oscal.model.Oscal.Address;
import dsm.oscal.model.Oscal.OscalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.AddressImpl#getAddrLine <em>Addr Line</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.AddressImpl#getState <em>State</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.AddressImpl#getPostaCode <em>Posta Code</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.AddressImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends MinimalEObjectImpl.Container implements Address {
	/**
	 * The cached value of the '{@link #getAddrLine() <em>Addr Line</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrLine()
	 * @generated
	 * @ordered
	 */
	protected EList<String> addrLine;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostaCode() <em>Posta Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostaCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTA_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostaCode() <em>Posta Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostaCode()
	 * @generated
	 * @ordered
	 */
	protected String postaCode = POSTA_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAddrLine() {
		if (addrLine == null) {
			addrLine = new EDataTypeUniqueEList<String>(String.class, this, OscalPackage.ADDRESS__ADDR_LINE);
		}
		return addrLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.ADDRESS__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostaCode() {
		return postaCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostaCode(String newPostaCode) {
		String oldPostaCode = postaCode;
		postaCode = newPostaCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.ADDRESS__POSTA_CODE, oldPostaCode,
					postaCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.ADDRESS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OscalPackage.ADDRESS__ADDR_LINE:
			return getAddrLine();
		case OscalPackage.ADDRESS__CITY:
			return getCity();
		case OscalPackage.ADDRESS__STATE:
			return getState();
		case OscalPackage.ADDRESS__POSTA_CODE:
			return getPostaCode();
		case OscalPackage.ADDRESS__COUNTRY:
			return getCountry();
		case OscalPackage.ADDRESS__TYPE:
			return getType();
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
		case OscalPackage.ADDRESS__ADDR_LINE:
			getAddrLine().clear();
			getAddrLine().addAll((Collection<? extends String>) newValue);
			return;
		case OscalPackage.ADDRESS__CITY:
			setCity((String) newValue);
			return;
		case OscalPackage.ADDRESS__STATE:
			setState((String) newValue);
			return;
		case OscalPackage.ADDRESS__POSTA_CODE:
			setPostaCode((String) newValue);
			return;
		case OscalPackage.ADDRESS__COUNTRY:
			setCountry((String) newValue);
			return;
		case OscalPackage.ADDRESS__TYPE:
			setType((String) newValue);
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
		case OscalPackage.ADDRESS__ADDR_LINE:
			getAddrLine().clear();
			return;
		case OscalPackage.ADDRESS__CITY:
			setCity(CITY_EDEFAULT);
			return;
		case OscalPackage.ADDRESS__STATE:
			setState(STATE_EDEFAULT);
			return;
		case OscalPackage.ADDRESS__POSTA_CODE:
			setPostaCode(POSTA_CODE_EDEFAULT);
			return;
		case OscalPackage.ADDRESS__COUNTRY:
			setCountry(COUNTRY_EDEFAULT);
			return;
		case OscalPackage.ADDRESS__TYPE:
			setType(TYPE_EDEFAULT);
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
		case OscalPackage.ADDRESS__ADDR_LINE:
			return addrLine != null && !addrLine.isEmpty();
		case OscalPackage.ADDRESS__CITY:
			return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
		case OscalPackage.ADDRESS__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
		case OscalPackage.ADDRESS__POSTA_CODE:
			return POSTA_CODE_EDEFAULT == null ? postaCode != null : !POSTA_CODE_EDEFAULT.equals(postaCode);
		case OscalPackage.ADDRESS__COUNTRY:
			return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
		case OscalPackage.ADDRESS__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (addrLine: ");
		result.append(addrLine);
		result.append(", city: ");
		result.append(city);
		result.append(", state: ");
		result.append(state);
		result.append(", postaCode: ");
		result.append(postaCode);
		result.append(", country: ");
		result.append(country);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //AddressImpl
