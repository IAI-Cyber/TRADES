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

import dsm.oscal.model.OscalMetadata.Address;
import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.ExternalId;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Party;
import dsm.oscal.model.OscalMetadata.Property;
import dsm.oscal.model.OscalMetadata.TelephoneNumber;

import dsm.oscal.model.OscalMetadata.UUIDElement;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getEmailAddresses <em>Email Addresses</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getExternalIds <em>External Ids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getLocationUuids <em>Location Uuids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getMemberOfOrganizations <em>Member Of Organizations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getProps <em>Props</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends MinimalEObjectImpl.Container implements Party {
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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * The cached value of the '{@link #getEmailAddresses() <em>Email Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> emailAddresses;

	/**
	 * The cached value of the '{@link #getExternalIds() <em>External Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIds()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalId> externalIds;

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
	 * The cached value of the '{@link #getLocationUuids() <em>Location Uuids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationUuids()
	 * @generated
	 * @ordered
	 */
	protected EList<UUID> locationUuids;

	/**
	 * The cached value of the '{@link #getMemberOfOrganizations() <em>Member Of Organizations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOfOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<UUID> memberOfOrganizations;

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
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTelephoneNumbers() <em>Telephone Numbers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<TelephoneNumber> telephoneNumbers;

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
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalMetadataPackage.Literals.PARTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.PARTY__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.PARTY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.PARTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.PARTY__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEmailAddresses() {
		if (emailAddresses == null) {
			emailAddresses = new EDataTypeUniqueEList<String>(String.class, this, OscalMetadataPackage.PARTY__EMAIL_ADDRESSES);
		}
		return emailAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UUID> getLocationUuids() {
		if (locationUuids == null) {
			locationUuids = new EDataTypeUniqueEList<UUID>(UUID.class, this, OscalMetadataPackage.PARTY__LOCATION_UUIDS);
		}
		return locationUuids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UUID> getMemberOfOrganizations() {
		if (memberOfOrganizations == null) {
			memberOfOrganizations = new EDataTypeUniqueEList<UUID>(UUID.class, this, OscalMetadataPackage.PARTY__MEMBER_OF_ORGANIZATIONS);
		}
		return memberOfOrganizations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.PARTY__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, OscalMetadataPackage.PARTY__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Address>(Address.class, this, OscalMetadataPackage.PARTY__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalMetadataPackage.PARTY__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalId> getExternalIds() {
		if (externalIds == null) {
			externalIds = new EObjectContainmentEList<ExternalId>(ExternalId.class, this, OscalMetadataPackage.PARTY__EXTERNAL_IDS);
		}
		return externalIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProps() {
		if (props == null) {
			props = new EObjectContainmentEList<Property>(Property.class, this, OscalMetadataPackage.PARTY__PROPS);
		}
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TelephoneNumber> getTelephoneNumbers() {
		if (telephoneNumbers == null) {
			telephoneNumbers = new EObjectContainmentEList<TelephoneNumber>(TelephoneNumber.class, this, OscalMetadataPackage.PARTY__TELEPHONE_NUMBERS);
		}
		return telephoneNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OscalMetadataPackage.PARTY__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.PARTY__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.PARTY__EXTERNAL_IDS:
				return ((InternalEList<?>)getExternalIds()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.PARTY__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.PARTY__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.PARTY__TELEPHONE_NUMBERS:
				return ((InternalEList<?>)getTelephoneNumbers()).basicRemove(otherEnd, msgs);
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
			case OscalMetadataPackage.PARTY__UUID:
				return getUuid();
			case OscalMetadataPackage.PARTY__ANNOTATIONS:
				return getAnnotations();
			case OscalMetadataPackage.PARTY__ADDRESSES:
				return getAddresses();
			case OscalMetadataPackage.PARTY__EMAIL_ADDRESSES:
				return getEmailAddresses();
			case OscalMetadataPackage.PARTY__EXTERNAL_IDS:
				return getExternalIds();
			case OscalMetadataPackage.PARTY__LINKS:
				return getLinks();
			case OscalMetadataPackage.PARTY__LOCATION_UUIDS:
				return getLocationUuids();
			case OscalMetadataPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
				return getMemberOfOrganizations();
			case OscalMetadataPackage.PARTY__NAME:
				return getName();
			case OscalMetadataPackage.PARTY__PROPS:
				return getProps();
			case OscalMetadataPackage.PARTY__REMARKS:
				return getRemarks();
			case OscalMetadataPackage.PARTY__SHORT_NAME:
				return getShortName();
			case OscalMetadataPackage.PARTY__TELEPHONE_NUMBERS:
				return getTelephoneNumbers();
			case OscalMetadataPackage.PARTY__TYPE:
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
			case OscalMetadataPackage.PARTY__UUID:
				setUuid((UUID)newValue);
				return;
			case OscalMetadataPackage.PARTY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OscalMetadataPackage.PARTY__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case OscalMetadataPackage.PARTY__EMAIL_ADDRESSES:
				getEmailAddresses().clear();
				getEmailAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case OscalMetadataPackage.PARTY__EXTERNAL_IDS:
				getExternalIds().clear();
				getExternalIds().addAll((Collection<? extends ExternalId>)newValue);
				return;
			case OscalMetadataPackage.PARTY__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case OscalMetadataPackage.PARTY__LOCATION_UUIDS:
				getLocationUuids().clear();
				getLocationUuids().addAll((Collection<? extends UUID>)newValue);
				return;
			case OscalMetadataPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
				getMemberOfOrganizations().clear();
				getMemberOfOrganizations().addAll((Collection<? extends UUID>)newValue);
				return;
			case OscalMetadataPackage.PARTY__NAME:
				setName((String)newValue);
				return;
			case OscalMetadataPackage.PARTY__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends Property>)newValue);
				return;
			case OscalMetadataPackage.PARTY__REMARKS:
				setRemarks((MarkupMultiline)newValue);
				return;
			case OscalMetadataPackage.PARTY__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case OscalMetadataPackage.PARTY__TELEPHONE_NUMBERS:
				getTelephoneNumbers().clear();
				getTelephoneNumbers().addAll((Collection<? extends TelephoneNumber>)newValue);
				return;
			case OscalMetadataPackage.PARTY__TYPE:
				setType((String)newValue);
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
			case OscalMetadataPackage.PARTY__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case OscalMetadataPackage.PARTY__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OscalMetadataPackage.PARTY__ADDRESSES:
				getAddresses().clear();
				return;
			case OscalMetadataPackage.PARTY__EMAIL_ADDRESSES:
				getEmailAddresses().clear();
				return;
			case OscalMetadataPackage.PARTY__EXTERNAL_IDS:
				getExternalIds().clear();
				return;
			case OscalMetadataPackage.PARTY__LINKS:
				getLinks().clear();
				return;
			case OscalMetadataPackage.PARTY__LOCATION_UUIDS:
				getLocationUuids().clear();
				return;
			case OscalMetadataPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
				getMemberOfOrganizations().clear();
				return;
			case OscalMetadataPackage.PARTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OscalMetadataPackage.PARTY__PROPS:
				getProps().clear();
				return;
			case OscalMetadataPackage.PARTY__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OscalMetadataPackage.PARTY__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case OscalMetadataPackage.PARTY__TELEPHONE_NUMBERS:
				getTelephoneNumbers().clear();
				return;
			case OscalMetadataPackage.PARTY__TYPE:
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
			case OscalMetadataPackage.PARTY__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case OscalMetadataPackage.PARTY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OscalMetadataPackage.PARTY__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case OscalMetadataPackage.PARTY__EMAIL_ADDRESSES:
				return emailAddresses != null && !emailAddresses.isEmpty();
			case OscalMetadataPackage.PARTY__EXTERNAL_IDS:
				return externalIds != null && !externalIds.isEmpty();
			case OscalMetadataPackage.PARTY__LINKS:
				return links != null && !links.isEmpty();
			case OscalMetadataPackage.PARTY__LOCATION_UUIDS:
				return locationUuids != null && !locationUuids.isEmpty();
			case OscalMetadataPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
				return memberOfOrganizations != null && !memberOfOrganizations.isEmpty();
			case OscalMetadataPackage.PARTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OscalMetadataPackage.PARTY__PROPS:
				return props != null && !props.isEmpty();
			case OscalMetadataPackage.PARTY__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OscalMetadataPackage.PARTY__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case OscalMetadataPackage.PARTY__TELEPHONE_NUMBERS:
				return telephoneNumbers != null && !telephoneNumbers.isEmpty();
			case OscalMetadataPackage.PARTY__TYPE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.PARTY__UUID: return OscalMetadataPackage.UUID_ELEMENT__UUID;
				default: return -1;
			}
		}
		if (baseClass == AnnotationOwner.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.PARTY__ANNOTATIONS: return OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS;
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
				case OscalMetadataPackage.UUID_ELEMENT__UUID: return OscalMetadataPackage.PARTY__UUID;
				default: return -1;
			}
		}
		if (baseClass == AnnotationOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS: return OscalMetadataPackage.PARTY__ANNOTATIONS;
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
		result.append(", emailAddresses: ");
		result.append(emailAddresses);
		result.append(", locationUuids: ");
		result.append(locationUuids);
		result.append(", memberOfOrganizations: ");
		result.append(memberOfOrganizations);
		result.append(", name: ");
		result.append(name);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PartyImpl
