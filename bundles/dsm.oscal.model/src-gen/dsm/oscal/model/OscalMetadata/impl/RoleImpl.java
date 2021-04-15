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
import dsm.oscal.model.OscalMetadata.ElementWithRemarks;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.LinkOwner;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Property;
import dsm.oscal.model.OscalMetadata.PropertyOwner;
import dsm.oscal.model.OscalMetadata.Role;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

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
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl#getProps <em>Props</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role {
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
	 * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> props;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalMetadataPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ROLE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ROLE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ROLE__SHORT_NAME, oldShortName, shortName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ROLE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalMetadataPackage.ROLE__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, OscalMetadataPackage.ROLE__ANNOTATIONS);
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
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalMetadataPackage.ROLE__LINKS);
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
			props = new EObjectContainmentEList<Property>(Property.class, this, OscalMetadataPackage.ROLE__PROPS);
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
			case OscalMetadataPackage.ROLE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.ROLE__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
			case OscalMetadataPackage.ROLE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case OscalMetadataPackage.ROLE__ANNOTATIONS:
				return getAnnotations();
			case OscalMetadataPackage.ROLE__PROPS:
				return getProps();
			case OscalMetadataPackage.ROLE__LINKS:
				return getLinks();
			case OscalMetadataPackage.ROLE__REMARKS:
				return getRemarks();
			case OscalMetadataPackage.ROLE__DESCRIPTION:
				return getDescription();
			case OscalMetadataPackage.ROLE__ID:
				return getId();
			case OscalMetadataPackage.ROLE__SHORT_NAME:
				return getShortName();
			case OscalMetadataPackage.ROLE__TITLE:
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
			case OscalMetadataPackage.ROLE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OscalMetadataPackage.ROLE__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends Property>)newValue);
				return;
			case OscalMetadataPackage.ROLE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case OscalMetadataPackage.ROLE__REMARKS:
				setRemarks((MarkupMultiline)newValue);
				return;
			case OscalMetadataPackage.ROLE__DESCRIPTION:
				setDescription((MarkupMultiline)newValue);
				return;
			case OscalMetadataPackage.ROLE__ID:
				setId((String)newValue);
				return;
			case OscalMetadataPackage.ROLE__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case OscalMetadataPackage.ROLE__TITLE:
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
			case OscalMetadataPackage.ROLE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OscalMetadataPackage.ROLE__PROPS:
				getProps().clear();
				return;
			case OscalMetadataPackage.ROLE__LINKS:
				getLinks().clear();
				return;
			case OscalMetadataPackage.ROLE__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OscalMetadataPackage.ROLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OscalMetadataPackage.ROLE__ID:
				setId(ID_EDEFAULT);
				return;
			case OscalMetadataPackage.ROLE__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case OscalMetadataPackage.ROLE__TITLE:
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
			case OscalMetadataPackage.ROLE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OscalMetadataPackage.ROLE__PROPS:
				return props != null && !props.isEmpty();
			case OscalMetadataPackage.ROLE__LINKS:
				return links != null && !links.isEmpty();
			case OscalMetadataPackage.ROLE__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OscalMetadataPackage.ROLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OscalMetadataPackage.ROLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OscalMetadataPackage.ROLE__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case OscalMetadataPackage.ROLE__TITLE:
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
		if (baseClass == AnnotationOwner.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.ROLE__ANNOTATIONS: return OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == PropertyOwner.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.ROLE__PROPS: return OscalMetadataPackage.PROPERTY_OWNER__PROPS;
				default: return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.ROLE__LINKS: return OscalMetadataPackage.LINK_OWNER__LINKS;
				default: return -1;
			}
		}
		if (baseClass == ElementWithRemarks.class) {
			switch (derivedFeatureID) {
				case OscalMetadataPackage.ROLE__REMARKS: return OscalMetadataPackage.ELEMENT_WITH_REMARKS__REMARKS;
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
				case OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS: return OscalMetadataPackage.ROLE__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == PropertyOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.PROPERTY_OWNER__PROPS: return OscalMetadataPackage.ROLE__PROPS;
				default: return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.LINK_OWNER__LINKS: return OscalMetadataPackage.ROLE__LINKS;
				default: return -1;
			}
		}
		if (baseClass == ElementWithRemarks.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.ELEMENT_WITH_REMARKS__REMARKS: return OscalMetadataPackage.ROLE__REMARKS;
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
		result.append(" (remarks: ");
		result.append(remarks);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
