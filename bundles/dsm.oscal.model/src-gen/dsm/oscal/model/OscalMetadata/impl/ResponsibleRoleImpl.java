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
import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Property;
import dsm.oscal.model.OscalMetadata.ResponsibleRole;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsible Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl#getPartyUuids <em>Party Uuids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl#getProps <em>Props</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl#getRoleId <em>Role Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsibleRoleImpl extends MinimalEObjectImpl.Container implements ResponsibleRole {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getPartyUuids() <em>Party Uuids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyUuids()
	 * @generated
	 * @ordered
	 */
	protected EList<UUID> partyUuids;

	/**
	 * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> props;

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
	 * The default value of the '{@link #getRoleId() <em>Role Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleId() <em>Role Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleId()
	 * @generated
	 * @ordered
	 */
	protected String roleId = ROLE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibleRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalMetadataPackage.Literals.RESPONSIBLE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleId() {
		return roleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleId(String newRoleId) {
		String oldRoleId = roleId;
		roleId = newRoleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.RESPONSIBLE_ROLE__ROLE_ID, oldRoleId, roleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UUID> getPartyUuids() {
		if (partyUuids == null) {
			partyUuids = new EDataTypeUniqueEList<UUID>(UUID.class, this, OscalMetadataPackage.RESPONSIBLE_ROLE__PARTY_UUIDS);
		}
		return partyUuids;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.RESPONSIBLE_ROLE__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, OscalMetadataPackage.RESPONSIBLE_ROLE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalMetadataPackage.RESPONSIBLE_ROLE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProps() {
		if (props == null) {
			props = new EObjectContainmentEList<Property>(Property.class, this, OscalMetadataPackage.RESPONSIBLE_ROLE__PROPS);
		}
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OscalMetadataPackage.RESPONSIBLE_ROLE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.RESPONSIBLE_ROLE__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
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
			case OscalMetadataPackage.RESPONSIBLE_ROLE__ANNOTATIONS:
				return getAnnotations();
			case OscalMetadataPackage.RESPONSIBLE_ROLE__LINKS:
				return getLinks();
			case OscalMetadataPackage.RESPONSIBLE_ROLE__PARTY_UUIDS:
				return getPartyUuids();
			case OscalMetadataPackage.RESPONSIBLE_ROLE__PROPS:
				return getProps();
			case OscalMetadataPackage.RESPONSIBLE_ROLE__REMARKS:
				return getRemarks();
			case OscalMetadataPackage.RESPONSIBLE_ROLE__ROLE_ID:
				return getRoleId();
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
			case OscalMetadataPackage.RESPONSIBLE_ROLE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__PARTY_UUIDS:
				getPartyUuids().clear();
				getPartyUuids().addAll((Collection<? extends UUID>)newValue);
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends Property>)newValue);
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__REMARKS:
				setRemarks((MarkupMultiline)newValue);
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__ROLE_ID:
				setRoleId((String)newValue);
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
			case OscalMetadataPackage.RESPONSIBLE_ROLE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__LINKS:
				getLinks().clear();
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__PARTY_UUIDS:
				getPartyUuids().clear();
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__PROPS:
				getProps().clear();
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OscalMetadataPackage.RESPONSIBLE_ROLE__ROLE_ID:
				setRoleId(ROLE_ID_EDEFAULT);
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
			case OscalMetadataPackage.RESPONSIBLE_ROLE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OscalMetadataPackage.RESPONSIBLE_ROLE__LINKS:
				return links != null && !links.isEmpty();
			case OscalMetadataPackage.RESPONSIBLE_ROLE__PARTY_UUIDS:
				return partyUuids != null && !partyUuids.isEmpty();
			case OscalMetadataPackage.RESPONSIBLE_ROLE__PROPS:
				return props != null && !props.isEmpty();
			case OscalMetadataPackage.RESPONSIBLE_ROLE__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OscalMetadataPackage.RESPONSIBLE_ROLE__ROLE_ID:
				return ROLE_ID_EDEFAULT == null ? roleId != null : !ROLE_ID_EDEFAULT.equals(roleId);
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
		if (baseClass == AnnotationOwner.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.RESPONSIBLE_ROLE__ANNOTATIONS: return OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS;
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
		if (baseClass == AnnotationOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS: return OscalMetadataPackage.RESPONSIBLE_ROLE__ANNOTATIONS;
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
		result.append(" (partyUuids: ");
		result.append(partyUuids);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", roleId: ");
		result.append(roleId);
		result.append(')');
		return result.toString();
	}

} //ResponsibleRoleImpl
