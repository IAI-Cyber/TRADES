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
package dsm.oscal.model.OscalCatalogCommon.impl;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage;
import dsm.oscal.model.OscalCatalogCommon.Part;

import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Property;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getNs <em>Ns</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getProse <em>Prose</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartImpl extends MinimalEObjectImpl.Container implements Part {
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
	 * The default value of the '{@link #getProse() <em>Prose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProse()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupMultiline PROSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProse() <em>Prose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProse()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultiline prose = PROSE_EDEFAULT;

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
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalCatalogCommonPackage.Literals.PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PART__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PART__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PART__NS, oldNs, ns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PART__CLAZZ, oldClazz, clazz));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PART__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultiline getProse() {
		return prose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProse(MarkupMultiline newProse) {
		MarkupMultiline oldProse = prose;
		prose = newProse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PART__PROSE, oldProse, prose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, OscalCatalogCommonPackage.PART__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<Part>(Part.class, this, OscalCatalogCommonPackage.PART__PARTS);
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
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalCatalogCommonPackage.PART__LINKS);
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
			props = new EObjectContainmentEList<Property>(Property.class, this, OscalCatalogCommonPackage.PART__PROPS);
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
			case OscalCatalogCommonPackage.PART__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case OscalCatalogCommonPackage.PART__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case OscalCatalogCommonPackage.PART__PROPS:
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
			case OscalCatalogCommonPackage.PART__ANNOTATIONS:
				return getAnnotations();
			case OscalCatalogCommonPackage.PART__ID:
				return getId();
			case OscalCatalogCommonPackage.PART__NAME:
				return getName();
			case OscalCatalogCommonPackage.PART__NS:
				return getNs();
			case OscalCatalogCommonPackage.PART__CLAZZ:
				return getClazz();
			case OscalCatalogCommonPackage.PART__TITLE:
				return getTitle();
			case OscalCatalogCommonPackage.PART__PROSE:
				return getProse();
			case OscalCatalogCommonPackage.PART__PARTS:
				return getParts();
			case OscalCatalogCommonPackage.PART__LINKS:
				return getLinks();
			case OscalCatalogCommonPackage.PART__PROPS:
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
			case OscalCatalogCommonPackage.PART__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OscalCatalogCommonPackage.PART__ID:
				setId((String)newValue);
				return;
			case OscalCatalogCommonPackage.PART__NAME:
				setName((String)newValue);
				return;
			case OscalCatalogCommonPackage.PART__NS:
				setNs((URI)newValue);
				return;
			case OscalCatalogCommonPackage.PART__CLAZZ:
				setClazz((String)newValue);
				return;
			case OscalCatalogCommonPackage.PART__TITLE:
				setTitle((MarkupLine)newValue);
				return;
			case OscalCatalogCommonPackage.PART__PROSE:
				setProse((MarkupMultiline)newValue);
				return;
			case OscalCatalogCommonPackage.PART__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
				return;
			case OscalCatalogCommonPackage.PART__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case OscalCatalogCommonPackage.PART__PROPS:
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
			case OscalCatalogCommonPackage.PART__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OscalCatalogCommonPackage.PART__ID:
				setId(ID_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PART__NS:
				setNs(NS_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PART__CLAZZ:
				setClazz(CLAZZ_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PART__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PART__PROSE:
				setProse(PROSE_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PART__PARTS:
				getParts().clear();
				return;
			case OscalCatalogCommonPackage.PART__LINKS:
				getLinks().clear();
				return;
			case OscalCatalogCommonPackage.PART__PROPS:
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
			case OscalCatalogCommonPackage.PART__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OscalCatalogCommonPackage.PART__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OscalCatalogCommonPackage.PART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OscalCatalogCommonPackage.PART__NS:
				return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
			case OscalCatalogCommonPackage.PART__CLAZZ:
				return CLAZZ_EDEFAULT == null ? clazz != null : !CLAZZ_EDEFAULT.equals(clazz);
			case OscalCatalogCommonPackage.PART__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OscalCatalogCommonPackage.PART__PROSE:
				return PROSE_EDEFAULT == null ? prose != null : !PROSE_EDEFAULT.equals(prose);
			case OscalCatalogCommonPackage.PART__PARTS:
				return parts != null && !parts.isEmpty();
			case OscalCatalogCommonPackage.PART__LINKS:
				return links != null && !links.isEmpty();
			case OscalCatalogCommonPackage.PART__PROPS:
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
				case OscalCatalogCommonPackage.PART__ANNOTATIONS: return OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS;
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
				case OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS: return OscalCatalogCommonPackage.PART__ANNOTATIONS;
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
		result.append(", name: ");
		result.append(name);
		result.append(", ns: ");
		result.append(ns);
		result.append(", clazz: ");
		result.append(clazz);
		result.append(", title: ");
		result.append(title);
		result.append(", prose: ");
		result.append(prose);
		result.append(')');
		return result.toString();
	}

} //PartImpl
