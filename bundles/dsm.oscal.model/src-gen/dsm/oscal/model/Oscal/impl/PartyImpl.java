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
import dsm.oscal.model.Oscal.Annotation;
import dsm.oscal.model.Oscal.AnnotationOwner;
import dsm.oscal.model.Oscal.ExternalId;
import dsm.oscal.model.Oscal.Link;
import dsm.oscal.model.Oscal.LinkOwner;
import dsm.oscal.model.Oscal.NamedElement;
import dsm.oscal.model.Oscal.OscalPackage;
import dsm.oscal.model.Oscal.Party;
import dsm.oscal.model.Oscal.TelephoneNumber;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getExternalIds <em>External Ids</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getEmailAddresses <em>Email Addresses</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getLocationUuids <em>Location Uuids</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartyImpl#getMemberOfOrganizations <em>Member Of Organizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends PropertyOwnerImpl implements Party {
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
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

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
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected String newAttribute = NEW_ATTRIBUTE_EDEFAULT;

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
	 * The cached value of the '{@link #getExternalIds() <em>External Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIds()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalId> externalIds;

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
	 * The cached value of the '{@link #getTelephoneNumbers() <em>Telephone Numbers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<TelephoneNumber> telephoneNumbers;

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
	 * The cached value of the '{@link #getLocationUuids() <em>Location Uuids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationUuids()
	 * @generated
	 * @ordered
	 */
	protected EList<String> locationUuids;

	/**
	 * The cached value of the '{@link #getMemberOfOrganizations() <em>Member Of Organizations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOfOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> memberOfOrganizations;

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
		return OscalPackage.Literals.PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					OscalPackage.PARTY__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalPackage.PARTY__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PARTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PARTY__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAttribute(String newNewAttribute) {
		String oldNewAttribute = newAttribute;
		newAttribute = newNewAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PARTY__NEW_ATTRIBUTE, oldNewAttribute,
					newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PARTY__SHORT_NAME, oldShortName,
					shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalId> getExternalIds() {
		if (externalIds == null) {
			externalIds = new EObjectContainmentEList<ExternalId>(ExternalId.class, this,
					OscalPackage.PARTY__EXTERNAL_IDS);
		}
		return externalIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmailAddresses() {
		if (emailAddresses == null) {
			emailAddresses = new EDataTypeUniqueEList<String>(String.class, this, OscalPackage.PARTY__EMAIL_ADDRESSES);
		}
		return emailAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TelephoneNumber> getTelephoneNumbers() {
		if (telephoneNumbers == null) {
			telephoneNumbers = new EObjectContainmentEList<TelephoneNumber>(TelephoneNumber.class, this,
					OscalPackage.PARTY__TELEPHONE_NUMBERS);
		}
		return telephoneNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Address>(Address.class, this, OscalPackage.PARTY__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLocationUuids() {
		if (locationUuids == null) {
			locationUuids = new EDataTypeUniqueEList<String>(String.class, this, OscalPackage.PARTY__LOCATION_UUIDS);
		}
		return locationUuids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMemberOfOrganizations() {
		if (memberOfOrganizations == null) {
			memberOfOrganizations = new EDataTypeUniqueEList<String>(String.class, this,
					OscalPackage.PARTY__MEMBER_OF_ORGANIZATIONS);
		}
		return memberOfOrganizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.PARTY__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		case OscalPackage.PARTY__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case OscalPackage.PARTY__EXTERNAL_IDS:
			return ((InternalEList<?>) getExternalIds()).basicRemove(otherEnd, msgs);
		case OscalPackage.PARTY__TELEPHONE_NUMBERS:
			return ((InternalEList<?>) getTelephoneNumbers()).basicRemove(otherEnd, msgs);
		case OscalPackage.PARTY__ADDRESSES:
			return ((InternalEList<?>) getAddresses()).basicRemove(otherEnd, msgs);
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
		case OscalPackage.PARTY__ANNOTATIONS:
			return getAnnotations();
		case OscalPackage.PARTY__LINKS:
			return getLinks();
		case OscalPackage.PARTY__NAME:
			return getName();
		case OscalPackage.PARTY__UUID:
			return getUuid();
		case OscalPackage.PARTY__NEW_ATTRIBUTE:
			return getNewAttribute();
		case OscalPackage.PARTY__SHORT_NAME:
			return getShortName();
		case OscalPackage.PARTY__EXTERNAL_IDS:
			return getExternalIds();
		case OscalPackage.PARTY__EMAIL_ADDRESSES:
			return getEmailAddresses();
		case OscalPackage.PARTY__TELEPHONE_NUMBERS:
			return getTelephoneNumbers();
		case OscalPackage.PARTY__ADDRESSES:
			return getAddresses();
		case OscalPackage.PARTY__LOCATION_UUIDS:
			return getLocationUuids();
		case OscalPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
			return getMemberOfOrganizations();
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
		case OscalPackage.PARTY__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case OscalPackage.PARTY__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case OscalPackage.PARTY__NAME:
			setName((String) newValue);
			return;
		case OscalPackage.PARTY__UUID:
			setUuid((String) newValue);
			return;
		case OscalPackage.PARTY__NEW_ATTRIBUTE:
			setNewAttribute((String) newValue);
			return;
		case OscalPackage.PARTY__SHORT_NAME:
			setShortName((String) newValue);
			return;
		case OscalPackage.PARTY__EXTERNAL_IDS:
			getExternalIds().clear();
			getExternalIds().addAll((Collection<? extends ExternalId>) newValue);
			return;
		case OscalPackage.PARTY__EMAIL_ADDRESSES:
			getEmailAddresses().clear();
			getEmailAddresses().addAll((Collection<? extends String>) newValue);
			return;
		case OscalPackage.PARTY__TELEPHONE_NUMBERS:
			getTelephoneNumbers().clear();
			getTelephoneNumbers().addAll((Collection<? extends TelephoneNumber>) newValue);
			return;
		case OscalPackage.PARTY__ADDRESSES:
			getAddresses().clear();
			getAddresses().addAll((Collection<? extends Address>) newValue);
			return;
		case OscalPackage.PARTY__LOCATION_UUIDS:
			getLocationUuids().clear();
			getLocationUuids().addAll((Collection<? extends String>) newValue);
			return;
		case OscalPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
			getMemberOfOrganizations().clear();
			getMemberOfOrganizations().addAll((Collection<? extends String>) newValue);
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
		case OscalPackage.PARTY__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case OscalPackage.PARTY__LINKS:
			getLinks().clear();
			return;
		case OscalPackage.PARTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OscalPackage.PARTY__UUID:
			setUuid(UUID_EDEFAULT);
			return;
		case OscalPackage.PARTY__NEW_ATTRIBUTE:
			setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
			return;
		case OscalPackage.PARTY__SHORT_NAME:
			setShortName(SHORT_NAME_EDEFAULT);
			return;
		case OscalPackage.PARTY__EXTERNAL_IDS:
			getExternalIds().clear();
			return;
		case OscalPackage.PARTY__EMAIL_ADDRESSES:
			getEmailAddresses().clear();
			return;
		case OscalPackage.PARTY__TELEPHONE_NUMBERS:
			getTelephoneNumbers().clear();
			return;
		case OscalPackage.PARTY__ADDRESSES:
			getAddresses().clear();
			return;
		case OscalPackage.PARTY__LOCATION_UUIDS:
			getLocationUuids().clear();
			return;
		case OscalPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
			getMemberOfOrganizations().clear();
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
		case OscalPackage.PARTY__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case OscalPackage.PARTY__LINKS:
			return links != null && !links.isEmpty();
		case OscalPackage.PARTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OscalPackage.PARTY__UUID:
			return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		case OscalPackage.PARTY__NEW_ATTRIBUTE:
			return NEW_ATTRIBUTE_EDEFAULT == null ? newAttribute != null : !NEW_ATTRIBUTE_EDEFAULT.equals(newAttribute);
		case OscalPackage.PARTY__SHORT_NAME:
			return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
		case OscalPackage.PARTY__EXTERNAL_IDS:
			return externalIds != null && !externalIds.isEmpty();
		case OscalPackage.PARTY__EMAIL_ADDRESSES:
			return emailAddresses != null && !emailAddresses.isEmpty();
		case OscalPackage.PARTY__TELEPHONE_NUMBERS:
			return telephoneNumbers != null && !telephoneNumbers.isEmpty();
		case OscalPackage.PARTY__ADDRESSES:
			return addresses != null && !addresses.isEmpty();
		case OscalPackage.PARTY__LOCATION_UUIDS:
			return locationUuids != null && !locationUuids.isEmpty();
		case OscalPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
			return memberOfOrganizations != null && !memberOfOrganizations.isEmpty();
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
			case OscalPackage.PARTY__ANNOTATIONS:
				return OscalPackage.ANNOTATION_OWNER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
			case OscalPackage.PARTY__LINKS:
				return OscalPackage.LINK_OWNER__LINKS;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case OscalPackage.PARTY__NAME:
				return OscalPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
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
			case OscalPackage.ANNOTATION_OWNER__ANNOTATIONS:
				return OscalPackage.PARTY__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
			case OscalPackage.LINK_OWNER__LINKS:
				return OscalPackage.PARTY__LINKS;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case OscalPackage.NAMED_ELEMENT__NAME:
				return OscalPackage.PARTY__NAME;
			default:
				return -1;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", newAttribute: ");
		result.append(newAttribute);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", emailAddresses: ");
		result.append(emailAddresses);
		result.append(", locationUuids: ");
		result.append(locationUuids);
		result.append(", memberOfOrganizations: ");
		result.append(memberOfOrganizations);
		result.append(')');
		return result.toString();
	}

} //PartyImpl
