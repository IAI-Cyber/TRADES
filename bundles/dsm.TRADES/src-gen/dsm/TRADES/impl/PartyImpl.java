/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Address;
import dsm.TRADES.Annotation;
import dsm.TRADES.AnnotationOwner;
import dsm.TRADES.ExternalId;
import dsm.TRADES.Link;
import dsm.TRADES.LinkOwner;
import dsm.TRADES.NamedElement;
import dsm.TRADES.Party;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.TelephoneNumber;

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
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getExternalIds <em>External Ids</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getEmailAddresses <em>Email Addresses</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getLocationUuids <em>Location Uuids</em>}</li>
 *   <li>{@link dsm.TRADES.impl.PartyImpl#getMemberOfOrganizations <em>Member Of Organizations</em>}</li>
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
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

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
		return TRADESPackage.Literals.PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					TRADESPackage.PARTY__ANNOTATIONS);
		}
		return annotations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, TRADESPackage.PARTY__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARTY__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewAttribute(String newNewAttribute) {
		String oldNewAttribute = newAttribute;
		newAttribute = newNewAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARTY__NEW_ATTRIBUTE, oldNewAttribute,
					newAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.PARTY__SHORT_NAME, oldShortName,
					shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalId> getExternalIds() {
		if (externalIds == null) {
			externalIds = new EObjectContainmentEList<ExternalId>(ExternalId.class, this,
					TRADESPackage.PARTY__EXTERNAL_IDS);
		}
		return externalIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEmailAddresses() {
		if (emailAddresses == null) {
			emailAddresses = new EDataTypeUniqueEList<String>(String.class, this, TRADESPackage.PARTY__EMAIL_ADDRESSES);
		}
		return emailAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TelephoneNumber> getTelephoneNumbers() {
		if (telephoneNumbers == null) {
			telephoneNumbers = new EObjectContainmentEList<TelephoneNumber>(TelephoneNumber.class, this,
					TRADESPackage.PARTY__TELEPHONE_NUMBERS);
		}
		return telephoneNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectContainmentEList<Address>(Address.class, this, TRADESPackage.PARTY__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLocationUuids() {
		if (locationUuids == null) {
			locationUuids = new EDataTypeUniqueEList<String>(String.class, this, TRADESPackage.PARTY__LOCATION_UUIDS);
		}
		return locationUuids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMemberOfOrganizations() {
		if (memberOfOrganizations == null) {
			memberOfOrganizations = new EDataTypeUniqueEList<String>(String.class, this,
					TRADESPackage.PARTY__MEMBER_OF_ORGANIZATIONS);
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
		case TRADESPackage.PARTY__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		case TRADESPackage.PARTY__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case TRADESPackage.PARTY__EXTERNAL_IDS:
			return ((InternalEList<?>) getExternalIds()).basicRemove(otherEnd, msgs);
		case TRADESPackage.PARTY__TELEPHONE_NUMBERS:
			return ((InternalEList<?>) getTelephoneNumbers()).basicRemove(otherEnd, msgs);
		case TRADESPackage.PARTY__ADDRESSES:
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
		case TRADESPackage.PARTY__ANNOTATIONS:
			return getAnnotations();
		case TRADESPackage.PARTY__NAME:
			return getName();
		case TRADESPackage.PARTY__LINKS:
			return getLinks();
		case TRADESPackage.PARTY__UUID:
			return getUuid();
		case TRADESPackage.PARTY__NEW_ATTRIBUTE:
			return getNewAttribute();
		case TRADESPackage.PARTY__SHORT_NAME:
			return getShortName();
		case TRADESPackage.PARTY__EXTERNAL_IDS:
			return getExternalIds();
		case TRADESPackage.PARTY__EMAIL_ADDRESSES:
			return getEmailAddresses();
		case TRADESPackage.PARTY__TELEPHONE_NUMBERS:
			return getTelephoneNumbers();
		case TRADESPackage.PARTY__ADDRESSES:
			return getAddresses();
		case TRADESPackage.PARTY__LOCATION_UUIDS:
			return getLocationUuids();
		case TRADESPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
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
		case TRADESPackage.PARTY__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case TRADESPackage.PARTY__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.PARTY__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case TRADESPackage.PARTY__UUID:
			setUuid((String) newValue);
			return;
		case TRADESPackage.PARTY__NEW_ATTRIBUTE:
			setNewAttribute((String) newValue);
			return;
		case TRADESPackage.PARTY__SHORT_NAME:
			setShortName((String) newValue);
			return;
		case TRADESPackage.PARTY__EXTERNAL_IDS:
			getExternalIds().clear();
			getExternalIds().addAll((Collection<? extends ExternalId>) newValue);
			return;
		case TRADESPackage.PARTY__EMAIL_ADDRESSES:
			getEmailAddresses().clear();
			getEmailAddresses().addAll((Collection<? extends String>) newValue);
			return;
		case TRADESPackage.PARTY__TELEPHONE_NUMBERS:
			getTelephoneNumbers().clear();
			getTelephoneNumbers().addAll((Collection<? extends TelephoneNumber>) newValue);
			return;
		case TRADESPackage.PARTY__ADDRESSES:
			getAddresses().clear();
			getAddresses().addAll((Collection<? extends Address>) newValue);
			return;
		case TRADESPackage.PARTY__LOCATION_UUIDS:
			getLocationUuids().clear();
			getLocationUuids().addAll((Collection<? extends String>) newValue);
			return;
		case TRADESPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
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
		case TRADESPackage.PARTY__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case TRADESPackage.PARTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.PARTY__LINKS:
			getLinks().clear();
			return;
		case TRADESPackage.PARTY__UUID:
			setUuid(UUID_EDEFAULT);
			return;
		case TRADESPackage.PARTY__NEW_ATTRIBUTE:
			setNewAttribute(NEW_ATTRIBUTE_EDEFAULT);
			return;
		case TRADESPackage.PARTY__SHORT_NAME:
			setShortName(SHORT_NAME_EDEFAULT);
			return;
		case TRADESPackage.PARTY__EXTERNAL_IDS:
			getExternalIds().clear();
			return;
		case TRADESPackage.PARTY__EMAIL_ADDRESSES:
			getEmailAddresses().clear();
			return;
		case TRADESPackage.PARTY__TELEPHONE_NUMBERS:
			getTelephoneNumbers().clear();
			return;
		case TRADESPackage.PARTY__ADDRESSES:
			getAddresses().clear();
			return;
		case TRADESPackage.PARTY__LOCATION_UUIDS:
			getLocationUuids().clear();
			return;
		case TRADESPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
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
		case TRADESPackage.PARTY__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case TRADESPackage.PARTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.PARTY__LINKS:
			return links != null && !links.isEmpty();
		case TRADESPackage.PARTY__UUID:
			return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		case TRADESPackage.PARTY__NEW_ATTRIBUTE:
			return NEW_ATTRIBUTE_EDEFAULT == null ? newAttribute != null : !NEW_ATTRIBUTE_EDEFAULT.equals(newAttribute);
		case TRADESPackage.PARTY__SHORT_NAME:
			return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
		case TRADESPackage.PARTY__EXTERNAL_IDS:
			return externalIds != null && !externalIds.isEmpty();
		case TRADESPackage.PARTY__EMAIL_ADDRESSES:
			return emailAddresses != null && !emailAddresses.isEmpty();
		case TRADESPackage.PARTY__TELEPHONE_NUMBERS:
			return telephoneNumbers != null && !telephoneNumbers.isEmpty();
		case TRADESPackage.PARTY__ADDRESSES:
			return addresses != null && !addresses.isEmpty();
		case TRADESPackage.PARTY__LOCATION_UUIDS:
			return locationUuids != null && !locationUuids.isEmpty();
		case TRADESPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
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
			case TRADESPackage.PARTY__ANNOTATIONS:
				return TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.PARTY__NAME:
				return TRADESPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.PARTY__LINKS:
				return TRADESPackage.LINK_OWNER__LINKS;
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
			case TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS:
				return TRADESPackage.PARTY__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.NAMED_ELEMENT__NAME:
				return TRADESPackage.PARTY__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.LINK_OWNER__LINKS:
				return TRADESPackage.PARTY__LINKS;
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
