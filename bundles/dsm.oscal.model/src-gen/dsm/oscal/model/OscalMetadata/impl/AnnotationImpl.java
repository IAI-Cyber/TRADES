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
package dsm.oscal.model.OscalMetadata.impl;

import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.ElementWithRemarks;
import dsm.oscal.model.OscalMetadata.ElementWithValue;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;

import dsm.oscal.model.OscalMetadata.UUIDElement;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import java.net.URI;

import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.AnnotationImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.AnnotationImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.AnnotationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.AnnotationImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.AnnotationImpl#getNs <em>Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends OscalElementCustomImpl implements Annotation {
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
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupMultiline REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultiline remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected static final URI NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected URI ns = NS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalMetadataPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ANNOTATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ANNOTATION__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getNs() {
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNs(URI newNs) {
		URI oldNs = ns;
		ns = newNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ANNOTATION__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ANNOTATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultiline getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(MarkupMultiline newRemarks) {
		MarkupMultiline oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ANNOTATION__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OscalMetadataPackage.ANNOTATION__UUID:
				return getUuid();
			case OscalMetadataPackage.ANNOTATION__REMARKS:
				return getRemarks();
			case OscalMetadataPackage.ANNOTATION__VALUE:
				return getValue();
			case OscalMetadataPackage.ANNOTATION__NAME:
				return getName();
			case OscalMetadataPackage.ANNOTATION__NS:
				return getNs();
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
			case OscalMetadataPackage.ANNOTATION__UUID:
				setUuid((UUID)newValue);
				return;
			case OscalMetadataPackage.ANNOTATION__REMARKS:
				setRemarks((MarkupMultiline)newValue);
				return;
			case OscalMetadataPackage.ANNOTATION__VALUE:
				setValue((String)newValue);
				return;
			case OscalMetadataPackage.ANNOTATION__NAME:
				setName((String)newValue);
				return;
			case OscalMetadataPackage.ANNOTATION__NS:
				setNs((URI)newValue);
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
			case OscalMetadataPackage.ANNOTATION__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case OscalMetadataPackage.ANNOTATION__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OscalMetadataPackage.ANNOTATION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case OscalMetadataPackage.ANNOTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OscalMetadataPackage.ANNOTATION__NS:
				setNs(NS_EDEFAULT);
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
			case OscalMetadataPackage.ANNOTATION__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case OscalMetadataPackage.ANNOTATION__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OscalMetadataPackage.ANNOTATION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case OscalMetadataPackage.ANNOTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OscalMetadataPackage.ANNOTATION__NS:
				return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
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
				case OscalMetadataPackage.ANNOTATION__UUID: return OscalMetadataPackage.UUID_ELEMENT__UUID;
				default: return -1;
			}
		}
		if (baseClass == ElementWithRemarks.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.ANNOTATION__REMARKS: return OscalMetadataPackage.ELEMENT_WITH_REMARKS__REMARKS;
				default: return -1;
			}
		}
		if (baseClass == ElementWithValue.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.ANNOTATION__VALUE: return OscalMetadataPackage.ELEMENT_WITH_VALUE__VALUE;
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
				case OscalMetadataPackage.UUID_ELEMENT__UUID: return OscalMetadataPackage.ANNOTATION__UUID;
				default: return -1;
			}
		}
		if (baseClass == ElementWithRemarks.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.ELEMENT_WITH_REMARKS__REMARKS: return OscalMetadataPackage.ANNOTATION__REMARKS;
				default: return -1;
			}
		}
		if (baseClass == ElementWithValue.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.ELEMENT_WITH_VALUE__VALUE: return OscalMetadataPackage.ANNOTATION__VALUE;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", value: ");
		result.append(value);
		result.append(", name: ");
		result.append(name);
		result.append(", ns: ");
		result.append(ns);
		result.append(')');
		return result.toString();
	}

} //AnnotationImpl
