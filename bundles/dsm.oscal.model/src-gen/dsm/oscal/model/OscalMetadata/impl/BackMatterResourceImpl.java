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
import dsm.oscal.model.OscalMetadata.BackMatterResource;
import dsm.oscal.model.OscalMetadata.Base64;
import dsm.oscal.model.OscalMetadata.DocumentId;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Property;
import dsm.oscal.model.OscalMetadata.ResourceCitation;
import dsm.oscal.model.OscalMetadata.ResourceRlink;

import dsm.oscal.model.OscalMetadata.UUIDElement;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Back Matter Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getBase64 <em>Base64</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getDocumentIds <em>Document Ids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getProps <em>Props</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getRlinks <em>Rlinks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackMatterResourceImpl extends MinimalEObjectImpl.Container implements BackMatterResource {
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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getBase64() <em>Base64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase64()
	 * @generated
	 * @ordered
	 */
	protected Base64 base64;

	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected ResourceCitation citation;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupMultiline DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultiline description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentIds() <em>Document Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIds()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentId> documentIds;

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
	 * The cached value of the '{@link #getRlinks() <em>Rlinks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRlinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRlink> rlinks;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupLine TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected MarkupLine title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackMatterResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalMetadataPackage.Literals.BACK_MATTER_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.BACK_MATTER_RESOURCE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLine getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(MarkupLine newTitle) {
		MarkupLine oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.BACK_MATTER_RESOURCE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultiline getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(MarkupMultiline newDescription) {
		MarkupMultiline oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.BACK_MATTER_RESOURCE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.BACK_MATTER_RESOURCE__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, OscalMetadataPackage.BACK_MATTER_RESOURCE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCitation getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(ResourceCitation newCitation, NotificationChain msgs) {
		ResourceCitation oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION, oldCitation, newCitation);
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
	public void setCitation(ResourceCitation newCitation) {
		if (newCitation != citation) {
			NotificationChain msgs = null;
			if (citation != null)
				msgs = ((InternalEObject)citation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION, null, msgs);
			if (newCitation != null)
				msgs = ((InternalEObject)newCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION, null, msgs);
			msgs = basicSetCitation(newCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION, newCitation, newCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceRlink> getRlinks() {
		if (rlinks == null) {
			rlinks = new EObjectContainmentEList<ResourceRlink>(ResourceRlink.class, this, OscalMetadataPackage.BACK_MATTER_RESOURCE__RLINKS);
		}
		return rlinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProps() {
		if (props == null) {
			props = new EObjectContainmentEList<Property>(Property.class, this, OscalMetadataPackage.BACK_MATTER_RESOURCE__PROPS);
		}
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentId> getDocumentIds() {
		if (documentIds == null) {
			documentIds = new EObjectContainmentEList<DocumentId>(DocumentId.class, this, OscalMetadataPackage.BACK_MATTER_RESOURCE__DOCUMENT_IDS);
		}
		return documentIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64 getBase64() {
		return base64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64(Base64 newBase64, NotificationChain msgs) {
		Base64 oldBase64 = base64;
		base64 = newBase64;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64, oldBase64, newBase64);
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
	public void setBase64(Base64 newBase64) {
		if (newBase64 != base64) {
			NotificationChain msgs = null;
			if (base64 != null)
				msgs = ((InternalEObject)base64).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64, null, msgs);
			if (newBase64 != null)
				msgs = ((InternalEObject)newBase64).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64, null, msgs);
			msgs = basicSetBase64(newBase64, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64, newBase64, newBase64));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64:
				return basicSetBase64(null, msgs);
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION:
				return basicSetCitation(null, msgs);
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DOCUMENT_IDS:
				return ((InternalEList<?>)getDocumentIds()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__RLINKS:
				return ((InternalEList<?>)getRlinks()).basicRemove(otherEnd, msgs);
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
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__UUID:
				return getUuid();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__ANNOTATIONS:
				return getAnnotations();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64:
				return getBase64();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION:
				return getCitation();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DESCRIPTION:
				return getDescription();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DOCUMENT_IDS:
				return getDocumentIds();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__PROPS:
				return getProps();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__REMARKS:
				return getRemarks();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__RLINKS:
				return getRlinks();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__TITLE:
				return getTitle();
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
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__UUID:
				setUuid((UUID)newValue);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64:
				setBase64((Base64)newValue);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION:
				setCitation((ResourceCitation)newValue);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DESCRIPTION:
				setDescription((MarkupMultiline)newValue);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DOCUMENT_IDS:
				getDocumentIds().clear();
				getDocumentIds().addAll((Collection<? extends DocumentId>)newValue);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends Property>)newValue);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__REMARKS:
				setRemarks((MarkupMultiline)newValue);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__RLINKS:
				getRlinks().clear();
				getRlinks().addAll((Collection<? extends ResourceRlink>)newValue);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__TITLE:
				setTitle((MarkupLine)newValue);
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
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64:
				setBase64((Base64)null);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION:
				setCitation((ResourceCitation)null);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DOCUMENT_IDS:
				getDocumentIds().clear();
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__PROPS:
				getProps().clear();
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__RLINKS:
				getRlinks().clear();
				return;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__BASE64:
				return base64 != null;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__CITATION:
				return citation != null;
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__DOCUMENT_IDS:
				return documentIds != null && !documentIds.isEmpty();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__PROPS:
				return props != null && !props.isEmpty();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__RLINKS:
				return rlinks != null && !rlinks.isEmpty();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
				case OscalMetadataPackage.BACK_MATTER_RESOURCE__UUID: return OscalMetadataPackage.UUID_ELEMENT__UUID;
				default: return -1;
			}
		}
		if (baseClass == AnnotationOwner.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.BACK_MATTER_RESOURCE__ANNOTATIONS: return OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS;
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
				case OscalMetadataPackage.UUID_ELEMENT__UUID: return OscalMetadataPackage.BACK_MATTER_RESOURCE__UUID;
				default: return -1;
			}
		}
		if (baseClass == AnnotationOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS: return OscalMetadataPackage.BACK_MATTER_RESOURCE__ANNOTATIONS;
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
		result.append(", description: ");
		result.append(description);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //BackMatterResourceImpl
