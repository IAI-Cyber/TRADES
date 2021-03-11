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
import dsm.oscal.model.Oscal.Link;
import dsm.oscal.model.Oscal.LinkOwner;
import dsm.oscal.model.Oscal.Location;
import dsm.oscal.model.Oscal.OscalPackage;
import dsm.oscal.model.Oscal.Remark;
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
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.LocationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.LocationImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.LocationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.LocationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.LocationImpl#getEmailAddresses <em>Email Addresses</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.LocationImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.LocationImpl#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.LocationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.LocationImpl#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends PropertyOwnerImpl implements Location {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

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
	 * The cached value of the '{@link #getTelephoneNumbers() <em>Telephone Numbers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<TelephoneNumber> telephoneNumbers;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected EList<String> url;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected Remark remark;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					OscalPackage.LOCATION__ANNOTATIONS);
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
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalPackage.LOCATION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.LOCATION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OscalPackage.LOCATION__ADDRESS, oldAddress, newAddress);
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
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.LOCATION__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.LOCATION__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.LOCATION__ADDRESS, newAddress,
					newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmailAddresses() {
		if (emailAddresses == null) {
			emailAddresses = new EDataTypeUniqueEList<String>(String.class, this,
					OscalPackage.LOCATION__EMAIL_ADDRESSES);
		}
		return emailAddresses;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.LOCATION__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TelephoneNumber> getTelephoneNumbers() {
		if (telephoneNumbers == null) {
			telephoneNumbers = new EObjectContainmentEList<TelephoneNumber>(TelephoneNumber.class, this,
					OscalPackage.LOCATION__TELEPHONE_NUMBERS);
		}
		return telephoneNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUrl() {
		if (url == null) {
			url = new EDataTypeUniqueEList<String>(String.class, this, OscalPackage.LOCATION__URL);
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remark getRemark() {
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemark(Remark newRemark, NotificationChain msgs) {
		Remark oldRemark = remark;
		remark = newRemark;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OscalPackage.LOCATION__REMARK, oldRemark, newRemark);
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
	public void setRemark(Remark newRemark) {
		if (newRemark != remark) {
			NotificationChain msgs = null;
			if (remark != null)
				msgs = ((InternalEObject) remark).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.LOCATION__REMARK, null, msgs);
			if (newRemark != null)
				msgs = ((InternalEObject) newRemark).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OscalPackage.LOCATION__REMARK, null, msgs);
			msgs = basicSetRemark(newRemark, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.LOCATION__REMARK, newRemark, newRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.LOCATION__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		case OscalPackage.LOCATION__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case OscalPackage.LOCATION__ADDRESS:
			return basicSetAddress(null, msgs);
		case OscalPackage.LOCATION__TELEPHONE_NUMBERS:
			return ((InternalEList<?>) getTelephoneNumbers()).basicRemove(otherEnd, msgs);
		case OscalPackage.LOCATION__REMARK:
			return basicSetRemark(null, msgs);
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
		case OscalPackage.LOCATION__ANNOTATIONS:
			return getAnnotations();
		case OscalPackage.LOCATION__LINKS:
			return getLinks();
		case OscalPackage.LOCATION__TITLE:
			return getTitle();
		case OscalPackage.LOCATION__ADDRESS:
			return getAddress();
		case OscalPackage.LOCATION__EMAIL_ADDRESSES:
			return getEmailAddresses();
		case OscalPackage.LOCATION__UUID:
			return getUuid();
		case OscalPackage.LOCATION__TELEPHONE_NUMBERS:
			return getTelephoneNumbers();
		case OscalPackage.LOCATION__URL:
			return getUrl();
		case OscalPackage.LOCATION__REMARK:
			return getRemark();
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
		case OscalPackage.LOCATION__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case OscalPackage.LOCATION__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case OscalPackage.LOCATION__TITLE:
			setTitle((String) newValue);
			return;
		case OscalPackage.LOCATION__ADDRESS:
			setAddress((Address) newValue);
			return;
		case OscalPackage.LOCATION__EMAIL_ADDRESSES:
			getEmailAddresses().clear();
			getEmailAddresses().addAll((Collection<? extends String>) newValue);
			return;
		case OscalPackage.LOCATION__UUID:
			setUuid((String) newValue);
			return;
		case OscalPackage.LOCATION__TELEPHONE_NUMBERS:
			getTelephoneNumbers().clear();
			getTelephoneNumbers().addAll((Collection<? extends TelephoneNumber>) newValue);
			return;
		case OscalPackage.LOCATION__URL:
			getUrl().clear();
			getUrl().addAll((Collection<? extends String>) newValue);
			return;
		case OscalPackage.LOCATION__REMARK:
			setRemark((Remark) newValue);
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
		case OscalPackage.LOCATION__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case OscalPackage.LOCATION__LINKS:
			getLinks().clear();
			return;
		case OscalPackage.LOCATION__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case OscalPackage.LOCATION__ADDRESS:
			setAddress((Address) null);
			return;
		case OscalPackage.LOCATION__EMAIL_ADDRESSES:
			getEmailAddresses().clear();
			return;
		case OscalPackage.LOCATION__UUID:
			setUuid(UUID_EDEFAULT);
			return;
		case OscalPackage.LOCATION__TELEPHONE_NUMBERS:
			getTelephoneNumbers().clear();
			return;
		case OscalPackage.LOCATION__URL:
			getUrl().clear();
			return;
		case OscalPackage.LOCATION__REMARK:
			setRemark((Remark) null);
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
		case OscalPackage.LOCATION__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case OscalPackage.LOCATION__LINKS:
			return links != null && !links.isEmpty();
		case OscalPackage.LOCATION__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case OscalPackage.LOCATION__ADDRESS:
			return address != null;
		case OscalPackage.LOCATION__EMAIL_ADDRESSES:
			return emailAddresses != null && !emailAddresses.isEmpty();
		case OscalPackage.LOCATION__UUID:
			return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		case OscalPackage.LOCATION__TELEPHONE_NUMBERS:
			return telephoneNumbers != null && !telephoneNumbers.isEmpty();
		case OscalPackage.LOCATION__URL:
			return url != null && !url.isEmpty();
		case OscalPackage.LOCATION__REMARK:
			return remark != null;
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
			case OscalPackage.LOCATION__ANNOTATIONS:
				return OscalPackage.ANNOTATION_OWNER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
			case OscalPackage.LOCATION__LINKS:
				return OscalPackage.LINK_OWNER__LINKS;
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
				return OscalPackage.LOCATION__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
			case OscalPackage.LINK_OWNER__LINKS:
				return OscalPackage.LOCATION__LINKS;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", emailAddresses: ");
		result.append(emailAddresses);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
