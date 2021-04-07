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
import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalCatalogCommon.ParameterConstraint;
import dsm.oscal.model.OscalCatalogCommon.ParameterGuideline;
import dsm.oscal.model.OscalCatalogCommon.ParameterSelection;

import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Property;

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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getValues <em>Values</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getGuidelines <em>Guidelines</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
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
	 * The default value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected String dependsOn = DEPENDS_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupLine LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected MarkupLine label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupMultiline USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultiline usage = USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

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
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected ParameterSelection select;

	/**
	 * The cached value of the '{@link #getGuidelines() <em>Guidelines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidelines()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterGuideline> guidelines;

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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterConstraint> constraints;

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
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalCatalogCommonPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PARAMETER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PARAMETER__CLAZZ, oldClazz, clazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependsOn(String newDependsOn) {
		String oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PARAMETER__DEPENDS_ON, oldDependsOn, dependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLine getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(MarkupLine newLabel) {
		MarkupLine oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PARAMETER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultiline getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsage(MarkupMultiline newUsage) {
		MarkupMultiline oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PARAMETER__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this, OscalCatalogCommonPackage.PARAMETER__VALUES);
		}
		return values;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PARAMETER__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, OscalCatalogCommonPackage.PARAMETER__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterSelection getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(ParameterSelection newSelect, NotificationChain msgs) {
		ParameterSelection oldSelect = select;
		select = newSelect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PARAMETER__SELECT, oldSelect, newSelect);
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
	public void setSelect(ParameterSelection newSelect) {
		if (newSelect != select) {
			NotificationChain msgs = null;
			if (select != null)
				msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OscalCatalogCommonPackage.PARAMETER__SELECT, null, msgs);
			if (newSelect != null)
				msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OscalCatalogCommonPackage.PARAMETER__SELECT, null, msgs);
			msgs = basicSetSelect(newSelect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogCommonPackage.PARAMETER__SELECT, newSelect, newSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterGuideline> getGuidelines() {
		if (guidelines == null) {
			guidelines = new EObjectContainmentEList<ParameterGuideline>(ParameterGuideline.class, this, OscalCatalogCommonPackage.PARAMETER__GUIDELINES);
		}
		return guidelines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalCatalogCommonPackage.PARAMETER__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<ParameterConstraint>(ParameterConstraint.class, this, OscalCatalogCommonPackage.PARAMETER__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProps() {
		if (props == null) {
			props = new EObjectContainmentEList<Property>(Property.class, this, OscalCatalogCommonPackage.PARAMETER__PROPS);
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
			case OscalCatalogCommonPackage.PARAMETER__SELECT:
				return basicSetSelect(null, msgs);
			case OscalCatalogCommonPackage.PARAMETER__GUIDELINES:
				return ((InternalEList<?>)getGuidelines()).basicRemove(otherEnd, msgs);
			case OscalCatalogCommonPackage.PARAMETER__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case OscalCatalogCommonPackage.PARAMETER__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case OscalCatalogCommonPackage.PARAMETER__PROPS:
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
			case OscalCatalogCommonPackage.PARAMETER__ANNOTATIONS:
				return getAnnotations();
			case OscalCatalogCommonPackage.PARAMETER__ID:
				return getId();
			case OscalCatalogCommonPackage.PARAMETER__CLAZZ:
				return getClazz();
			case OscalCatalogCommonPackage.PARAMETER__DEPENDS_ON:
				return getDependsOn();
			case OscalCatalogCommonPackage.PARAMETER__LABEL:
				return getLabel();
			case OscalCatalogCommonPackage.PARAMETER__USAGE:
				return getUsage();
			case OscalCatalogCommonPackage.PARAMETER__VALUES:
				return getValues();
			case OscalCatalogCommonPackage.PARAMETER__REMARKS:
				return getRemarks();
			case OscalCatalogCommonPackage.PARAMETER__SELECT:
				return getSelect();
			case OscalCatalogCommonPackage.PARAMETER__GUIDELINES:
				return getGuidelines();
			case OscalCatalogCommonPackage.PARAMETER__LINKS:
				return getLinks();
			case OscalCatalogCommonPackage.PARAMETER__CONSTRAINTS:
				return getConstraints();
			case OscalCatalogCommonPackage.PARAMETER__PROPS:
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
			case OscalCatalogCommonPackage.PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__ID:
				setId((String)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__CLAZZ:
				setClazz((String)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__DEPENDS_ON:
				setDependsOn((String)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__LABEL:
				setLabel((MarkupLine)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__USAGE:
				setUsage((MarkupMultiline)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__REMARKS:
				setRemarks((MarkupMultiline)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__SELECT:
				setSelect((ParameterSelection)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__GUIDELINES:
				getGuidelines().clear();
				getGuidelines().addAll((Collection<? extends ParameterGuideline>)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends ParameterConstraint>)newValue);
				return;
			case OscalCatalogCommonPackage.PARAMETER__PROPS:
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
			case OscalCatalogCommonPackage.PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case OscalCatalogCommonPackage.PARAMETER__ID:
				setId(ID_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PARAMETER__CLAZZ:
				setClazz(CLAZZ_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PARAMETER__DEPENDS_ON:
				setDependsOn(DEPENDS_ON_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PARAMETER__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PARAMETER__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PARAMETER__VALUES:
				getValues().clear();
				return;
			case OscalCatalogCommonPackage.PARAMETER__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OscalCatalogCommonPackage.PARAMETER__SELECT:
				setSelect((ParameterSelection)null);
				return;
			case OscalCatalogCommonPackage.PARAMETER__GUIDELINES:
				getGuidelines().clear();
				return;
			case OscalCatalogCommonPackage.PARAMETER__LINKS:
				getLinks().clear();
				return;
			case OscalCatalogCommonPackage.PARAMETER__CONSTRAINTS:
				getConstraints().clear();
				return;
			case OscalCatalogCommonPackage.PARAMETER__PROPS:
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
			case OscalCatalogCommonPackage.PARAMETER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case OscalCatalogCommonPackage.PARAMETER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OscalCatalogCommonPackage.PARAMETER__CLAZZ:
				return CLAZZ_EDEFAULT == null ? clazz != null : !CLAZZ_EDEFAULT.equals(clazz);
			case OscalCatalogCommonPackage.PARAMETER__DEPENDS_ON:
				return DEPENDS_ON_EDEFAULT == null ? dependsOn != null : !DEPENDS_ON_EDEFAULT.equals(dependsOn);
			case OscalCatalogCommonPackage.PARAMETER__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case OscalCatalogCommonPackage.PARAMETER__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
			case OscalCatalogCommonPackage.PARAMETER__VALUES:
				return values != null && !values.isEmpty();
			case OscalCatalogCommonPackage.PARAMETER__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OscalCatalogCommonPackage.PARAMETER__SELECT:
				return select != null;
			case OscalCatalogCommonPackage.PARAMETER__GUIDELINES:
				return guidelines != null && !guidelines.isEmpty();
			case OscalCatalogCommonPackage.PARAMETER__LINKS:
				return links != null && !links.isEmpty();
			case OscalCatalogCommonPackage.PARAMETER__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case OscalCatalogCommonPackage.PARAMETER__PROPS:
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
				case OscalCatalogCommonPackage.PARAMETER__ANNOTATIONS: return OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS;
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
				case OscalMetadataPackage.ANNOTATION_OWNER__ANNOTATIONS: return OscalCatalogCommonPackage.PARAMETER__ANNOTATIONS;
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
		result.append(", dependsOn: ");
		result.append(dependsOn);
		result.append(", label: ");
		result.append(label);
		result.append(", usage: ");
		result.append(usage);
		result.append(", values: ");
		result.append(values);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
