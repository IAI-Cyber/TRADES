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

import dsm.oscal.model.OscalCatalog.Control;
import dsm.oscal.model.OscalCatalog.Group;
import dsm.oscal.model.OscalCatalog.OscalCatalogPackage;

import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalCatalogCommon.Part;

import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Property;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getParams <em>Params</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
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
	 * The default value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAZZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected String clazz = CLAZZ_EDEFAULT;

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
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> params;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

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
	 * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> props;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalCatalogPackage.Literals.GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClazz() {
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClazz(String newClazz) {
		String oldClazz = clazz;
		clazz = newClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.GROUP__CLAZZ, oldClazz, clazz));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.GROUP__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, OscalCatalogPackage.GROUP__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Parameter>(Parameter.class, this, OscalCatalogPackage.GROUP__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<Part>(Part.class, this, OscalCatalogPackage.GROUP__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalCatalogPackage.GROUP__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<Control>(Control.class, this, OscalCatalogPackage.GROUP__CONTROLS);
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
			groups = new EObjectContainmentEList<Group>(Group.class, this, OscalCatalogPackage.GROUP__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProps() {
		if (props == null) {
			props = new EObjectContainmentEList<Property>(Property.class, this, OscalCatalogPackage.GROUP__PROPS);
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
			case OscalCatalogPackage.GROUP__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.GROUP__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.GROUP__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.GROUP__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.GROUP__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.GROUP__PROPS:
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
			case OscalCatalogPackage.GROUP__ANNOTATIONS:
				return getAnnotations();
			case OscalCatalogPackage.GROUP__ID:
				return getId();
			case OscalCatalogPackage.GROUP__CLAZZ:
				return getClazz();
			case OscalCatalogPackage.GROUP__TITLE:
				return getTitle();
			case OscalCatalogPackage.GROUP__PARAMS:
				return getParams();
			case OscalCatalogPackage.GROUP__PARTS:
				return getParts();
			case OscalCatalogPackage.GROUP__LINKS:
				return getLinks();
			case OscalCatalogPackage.GROUP__CONTROLS:
				return getControls();
			case OscalCatalogPackage.GROUP__GROUPS:
				return getGroups();
			case OscalCatalogPackage.GROUP__PROPS:
				return getProps();
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
			case OscalCatalogPackage.GROUP__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OscalCatalogPackage.GROUP__ID:
				setId((String)newValue);
				return;
			case OscalCatalogPackage.GROUP__CLAZZ:
				setClazz((String)newValue);
				return;
			case OscalCatalogPackage.GROUP__TITLE:
				setTitle((MarkupLine)newValue);
				return;
			case OscalCatalogPackage.GROUP__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OscalCatalogPackage.GROUP__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
				return;
			case OscalCatalogPackage.GROUP__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case OscalCatalogPackage.GROUP__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case OscalCatalogPackage.GROUP__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case OscalCatalogPackage.GROUP__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends Property>)newValue);
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
			case OscalCatalogPackage.GROUP__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OscalCatalogPackage.GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case OscalCatalogPackage.GROUP__CLAZZ:
				setClazz(CLAZZ_EDEFAULT);
				return;
			case OscalCatalogPackage.GROUP__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OscalCatalogPackage.GROUP__PARAMS:
				getParams().clear();
				return;
			case OscalCatalogPackage.GROUP__PARTS:
				getParts().clear();
				return;
			case OscalCatalogPackage.GROUP__LINKS:
				getLinks().clear();
				return;
			case OscalCatalogPackage.GROUP__CONTROLS:
				getControls().clear();
				return;
			case OscalCatalogPackage.GROUP__GROUPS:
				getGroups().clear();
				return;
			case OscalCatalogPackage.GROUP__PROPS:
				getProps().clear();
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
			case OscalCatalogPackage.GROUP__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OscalCatalogPackage.GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OscalCatalogPackage.GROUP__CLAZZ:
				return CLAZZ_EDEFAULT == null ? clazz != null : !CLAZZ_EDEFAULT.equals(clazz);
			case OscalCatalogPackage.GROUP__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OscalCatalogPackage.GROUP__PARAMS:
				return params != null && !params.isEmpty();
			case OscalCatalogPackage.GROUP__PARTS:
				return parts != null && !parts.isEmpty();
			case OscalCatalogPackage.GROUP__LINKS:
				return links != null && !links.isEmpty();
			case OscalCatalogPackage.GROUP__CONTROLS:
				return controls != null && !controls.isEmpty();
			case OscalCatalogPackage.GROUP__GROUPS:
				return groups != null && !groups.isEmpty();
			case OscalCatalogPackage.GROUP__PROPS:
				return props != null && !props.isEmpty();
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
				case OscalCatalogPackage.GROUP__ANNOTATIONS: return OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS;
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
				case OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS: return OscalCatalogPackage.GROUP__ANNOTATIONS;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", clazz: ");
		result.append(clazz);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //GroupImpl
