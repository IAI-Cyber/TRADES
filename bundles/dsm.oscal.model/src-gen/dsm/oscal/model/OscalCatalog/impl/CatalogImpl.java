/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.model.OscalCatalog.impl;

import dsm.TRADES.ICatalogDefinition;
import dsm.TRADES.IControlDefinition;
import dsm.TRADES.IThreatDefinition;
import dsm.TRADES.TRADESPackage;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalCatalog.Control;
import dsm.oscal.model.OscalCatalog.Group;
import dsm.oscal.model.OscalCatalog.OscalCatalogPackage;

import dsm.oscal.model.OscalCatalogCommon.Parameter;

import dsm.oscal.model.OscalMetadata.BackMatter;
import dsm.oscal.model.OscalMetadata.Metadata;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.ParameterOwner;
import dsm.oscal.model.OscalMetadata.UUIDElement;

import dsm.oscal.model.OscalMetadata.impl.OscalElementCustomImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.CatalogImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.CatalogImpl#getParams <em>Params</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.CatalogImpl#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.CatalogImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.CatalogImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.CatalogImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogImpl extends OscalElementCustomImpl implements Catalog {
	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final UUID UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected UUID uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> params;

	/**
	 * The cached value of the '{@link #getBackMatter() <em>Back Matter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackMatter()
	 * @generated
	 * @ordered
	 */
	protected BackMatter backMatter;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalCatalogPackage.Literals.CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UUID getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(UUID newUuid) {
		UUID oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.CATALOG__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Parameter>(Parameter.class, this, OscalCatalogPackage.CATALOG__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatter getBackMatter() {
		return backMatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackMatter(BackMatter newBackMatter, NotificationChain msgs) {
		BackMatter oldBackMatter = backMatter;
		backMatter = newBackMatter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.CATALOG__BACK_MATTER, oldBackMatter, newBackMatter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackMatter(BackMatter newBackMatter) {
		if (newBackMatter != backMatter) {
			NotificationChain msgs = null;
			if (backMatter != null)
				msgs = ((InternalEObject)backMatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OscalCatalogPackage.CATALOG__BACK_MATTER, null, msgs);
			if (newBackMatter != null)
				msgs = ((InternalEObject)newBackMatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OscalCatalogPackage.CATALOG__BACK_MATTER, null, msgs);
			msgs = basicSetBackMatter(newBackMatter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.CATALOG__BACK_MATTER, newBackMatter, newBackMatter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<Control>(Control.class, this, OscalCatalogPackage.CATALOG__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, OscalCatalogPackage.CATALOG__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.CATALOG__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OscalCatalogPackage.CATALOG__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OscalCatalogPackage.CATALOG__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.CATALOG__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IThreatDefinition getThreatById(String id) {
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
	public IControlDefinition getControlById(String id) {
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
	public EList<IThreatDefinition> getThreatDefinitions() {
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
	public EList<IControlDefinition> getControlDefinitions() {
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
	public String getIdentifier() {
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
	public String getName() {
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
	public Map<String, String> getParameterValues() {
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
			case OscalCatalogPackage.CATALOG__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.CATALOG__BACK_MATTER:
				return basicSetBackMatter(null, msgs);
			case OscalCatalogPackage.CATALOG__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.CATALOG__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.CATALOG__METADATA:
				return basicSetMetadata(null, msgs);
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
			case OscalCatalogPackage.CATALOG__UUID:
				return getUuid();
			case OscalCatalogPackage.CATALOG__PARAMS:
				return getParams();
			case OscalCatalogPackage.CATALOG__BACK_MATTER:
				return getBackMatter();
			case OscalCatalogPackage.CATALOG__CONTROLS:
				return getControls();
			case OscalCatalogPackage.CATALOG__GROUPS:
				return getGroups();
			case OscalCatalogPackage.CATALOG__METADATA:
				return getMetadata();
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
			case OscalCatalogPackage.CATALOG__UUID:
				setUuid((UUID)newValue);
				return;
			case OscalCatalogPackage.CATALOG__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OscalCatalogPackage.CATALOG__BACK_MATTER:
				setBackMatter((BackMatter)newValue);
				return;
			case OscalCatalogPackage.CATALOG__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case OscalCatalogPackage.CATALOG__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case OscalCatalogPackage.CATALOG__METADATA:
				setMetadata((Metadata)newValue);
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
			case OscalCatalogPackage.CATALOG__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case OscalCatalogPackage.CATALOG__PARAMS:
				getParams().clear();
				return;
			case OscalCatalogPackage.CATALOG__BACK_MATTER:
				setBackMatter((BackMatter)null);
				return;
			case OscalCatalogPackage.CATALOG__CONTROLS:
				getControls().clear();
				return;
			case OscalCatalogPackage.CATALOG__GROUPS:
				getGroups().clear();
				return;
			case OscalCatalogPackage.CATALOG__METADATA:
				setMetadata((Metadata)null);
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
			case OscalCatalogPackage.CATALOG__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case OscalCatalogPackage.CATALOG__PARAMS:
				return params != null && !params.isEmpty();
			case OscalCatalogPackage.CATALOG__BACK_MATTER:
				return backMatter != null;
			case OscalCatalogPackage.CATALOG__CONTROLS:
				return controls != null && !controls.isEmpty();
			case OscalCatalogPackage.CATALOG__GROUPS:
				return groups != null && !groups.isEmpty();
			case OscalCatalogPackage.CATALOG__METADATA:
				return metadata != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (derivedFeatureID) {
				case OscalCatalogPackage.CATALOG__UUID: return OscalMetadataPackage.UUID_ELEMENT__UUID;
				default: return -1;
			}
		}
		if (baseClass == ParameterOwner.class) {
			switch (derivedFeatureID) {
				case OscalCatalogPackage.CATALOG__PARAMS: return OscalMetadataPackage.PARAMETER_OWNER__PARAMS;
				default: return -1;
			}
		}
		if (baseClass == ICatalogDefinition.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.UUID_ELEMENT__UUID: return OscalCatalogPackage.CATALOG__UUID;
				default: return -1;
			}
		}
		if (baseClass == ParameterOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.PARAMETER_OWNER__PARAMS: return OscalCatalogPackage.CATALOG__PARAMS;
				default: return -1;
			}
		}
		if (baseClass == ICatalogDefinition.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ParameterOwner.class) {
			switch (baseOperationID) {
				case OscalMetadataPackage.PARAMETER_OWNER___GET_PARAMETER_VALUES: return OscalCatalogPackage.CATALOG___GET_PARAMETER_VALUES;
				default: return -1;
			}
		}
		if (baseClass == ICatalogDefinition.class) {
			switch (baseOperationID) {
				case TRADESPackage.ICATALOG_DEFINITION___GET_THREAT_BY_ID__STRING: return OscalCatalogPackage.CATALOG___GET_THREAT_BY_ID__STRING;
				case TRADESPackage.ICATALOG_DEFINITION___GET_CONTROL_BY_ID__STRING: return OscalCatalogPackage.CATALOG___GET_CONTROL_BY_ID__STRING;
				case TRADESPackage.ICATALOG_DEFINITION___GET_THREAT_DEFINITIONS: return OscalCatalogPackage.CATALOG___GET_THREAT_DEFINITIONS;
				case TRADESPackage.ICATALOG_DEFINITION___GET_CONTROL_DEFINITIONS: return OscalCatalogPackage.CATALOG___GET_CONTROL_DEFINITIONS;
				case TRADESPackage.ICATALOG_DEFINITION___GET_IDENTIFIER: return OscalCatalogPackage.CATALOG___GET_IDENTIFIER;
				case TRADESPackage.ICATALOG_DEFINITION___GET_NAME: return OscalCatalogPackage.CATALOG___GET_NAME;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OscalCatalogPackage.CATALOG___GET_THREAT_BY_ID__STRING:
				return getThreatById((String)arguments.get(0));
			case OscalCatalogPackage.CATALOG___GET_CONTROL_BY_ID__STRING:
				return getControlById((String)arguments.get(0));
			case OscalCatalogPackage.CATALOG___GET_THREAT_DEFINITIONS:
				return getThreatDefinitions();
			case OscalCatalogPackage.CATALOG___GET_CONTROL_DEFINITIONS:
				return getControlDefinitions();
			case OscalCatalogPackage.CATALOG___GET_IDENTIFIER:
				return getIdentifier();
			case OscalCatalogPackage.CATALOG___GET_NAME:
				return getName();
			case OscalCatalogPackage.CATALOG___GET_PARAMETER_VALUES:
				return getParameterValues();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //CatalogImpl
