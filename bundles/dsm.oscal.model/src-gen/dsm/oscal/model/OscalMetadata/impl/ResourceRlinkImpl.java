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

import dsm.oscal.model.OscalMetadata.Hash;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.ResourceRlink;

import java.net.URI;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Rlink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.ResourceRlinkImpl#getEHref <em>EHref</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.ResourceRlinkImpl#getHashes <em>Hashes</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.ResourceRlinkImpl#getMediaType <em>Media Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceRlinkImpl extends MinimalEObjectImpl.Container implements ResourceRlink {
	/**
	 * The default value of the '{@link #getEHref() <em>EHref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEHref()
	 * @generated
	 * @ordered
	 */
	protected static final URI EHREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEHref() <em>EHref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEHref()
	 * @generated
	 * @ordered
	 */
	protected URI eHref = EHREF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHashes() <em>Hashes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashes()
	 * @generated
	 * @ordered
	 */
	protected EList<Hash> hashes;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected String mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRlinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalMetadataPackage.Literals.RESOURCE_RLINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URI getEHref() {
		return eHref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEHref(URI newEHref) {
		URI oldEHref = eHref;
		eHref = newEHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.RESOURCE_RLINK__EHREF, oldEHref, eHref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaType(String newMediaType) {
		String oldMediaType = mediaType;
		mediaType = newMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.RESOURCE_RLINK__MEDIA_TYPE, oldMediaType, mediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hash> getHashes() {
		if (hashes == null) {
			hashes = new EObjectContainmentEList<Hash>(Hash.class, this, OscalMetadataPackage.RESOURCE_RLINK__HASHES);
		}
		return hashes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OscalMetadataPackage.RESOURCE_RLINK__HASHES:
				return ((InternalEList<?>)getHashes()).basicRemove(otherEnd, msgs);
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
			case OscalMetadataPackage.RESOURCE_RLINK__EHREF:
				return getEHref();
			case OscalMetadataPackage.RESOURCE_RLINK__HASHES:
				return getHashes();
			case OscalMetadataPackage.RESOURCE_RLINK__MEDIA_TYPE:
				return getMediaType();
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
			case OscalMetadataPackage.RESOURCE_RLINK__EHREF:
				setEHref((URI)newValue);
				return;
			case OscalMetadataPackage.RESOURCE_RLINK__HASHES:
				getHashes().clear();
				getHashes().addAll((Collection<? extends Hash>)newValue);
				return;
			case OscalMetadataPackage.RESOURCE_RLINK__MEDIA_TYPE:
				setMediaType((String)newValue);
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
			case OscalMetadataPackage.RESOURCE_RLINK__EHREF:
				setEHref(EHREF_EDEFAULT);
				return;
			case OscalMetadataPackage.RESOURCE_RLINK__HASHES:
				getHashes().clear();
				return;
			case OscalMetadataPackage.RESOURCE_RLINK__MEDIA_TYPE:
				setMediaType(MEDIA_TYPE_EDEFAULT);
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
			case OscalMetadataPackage.RESOURCE_RLINK__EHREF:
				return EHREF_EDEFAULT == null ? eHref != null : !EHREF_EDEFAULT.equals(eHref);
			case OscalMetadataPackage.RESOURCE_RLINK__HASHES:
				return hashes != null && !hashes.isEmpty();
			case OscalMetadataPackage.RESOURCE_RLINK__MEDIA_TYPE:
				return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (eHref: ");
		result.append(eHref);
		result.append(", mediaType: ");
		result.append(mediaType);
		result.append(')');
		return result.toString();
	}

} //ResourceRlinkImpl
