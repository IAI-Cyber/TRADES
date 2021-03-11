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

import dsm.oscal.model.Oscal.Annotation;
import dsm.oscal.model.Oscal.AnnotationOwner;
import dsm.oscal.model.Oscal.Link;
import dsm.oscal.model.Oscal.LinkOwner;
import dsm.oscal.model.Oscal.OSCALConstraint;
import dsm.oscal.model.Oscal.OscalPackage;
import dsm.oscal.model.Oscal.Select;
import dsm.oscal.model.Oscal.SetParameter;

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
 * An implementation of the model object '<em><b>Set Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getParamId <em>Param Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.SetParameterImpl#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetParameterImpl extends PropertyOwnerImpl implements SetParameter {
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
	 * The default value of the '{@link #getParamId() <em>Param Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamId() <em>Param Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamId()
	 * @generated
	 * @ordered
	 */
	protected String paramId = PARAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

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
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<OSCALConstraint> constraints;

	/**
	 * The cached value of the '{@link #getGuideline() <em>Guideline</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideline()
	 * @generated
	 * @ordered
	 */
	protected EList<String> guideline;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> value;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected EList<Select> select;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.SET_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					OscalPackage.SET_PARAMETER__ANNOTATIONS);
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
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalPackage.SET_PARAMETER__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParamId() {
		return paramId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamId(String newParamId) {
		String oldParamId = paramId;
		paramId = newParamId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.SET_PARAMETER__PARAM_ID, oldParamId,
					paramId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.SET_PARAMETER__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOn(String newDependsOn) {
		String oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.SET_PARAMETER__DEPENDS_ON, oldDependsOn,
					dependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.SET_PARAMETER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(String newUsage) {
		String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.SET_PARAMETER__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSCALConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<OSCALConstraint>(OSCALConstraint.class, this,
					OscalPackage.SET_PARAMETER__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGuideline() {
		if (guideline == null) {
			guideline = new EDataTypeUniqueEList<String>(String.class, this, OscalPackage.SET_PARAMETER__GUIDELINE);
		}
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValue() {
		if (value == null) {
			value = new EDataTypeUniqueEList<String>(String.class, this, OscalPackage.SET_PARAMETER__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Select> getSelect() {
		if (select == null) {
			select = new EObjectContainmentEList<Select>(Select.class, this, OscalPackage.SET_PARAMETER__SELECT);
		}
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.SET_PARAMETER__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		case OscalPackage.SET_PARAMETER__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case OscalPackage.SET_PARAMETER__CONSTRAINTS:
			return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
		case OscalPackage.SET_PARAMETER__SELECT:
			return ((InternalEList<?>) getSelect()).basicRemove(otherEnd, msgs);
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
		case OscalPackage.SET_PARAMETER__ANNOTATIONS:
			return getAnnotations();
		case OscalPackage.SET_PARAMETER__LINKS:
			return getLinks();
		case OscalPackage.SET_PARAMETER__PARAM_ID:
			return getParamId();
		case OscalPackage.SET_PARAMETER__CLASS:
			return getClass_();
		case OscalPackage.SET_PARAMETER__DEPENDS_ON:
			return getDependsOn();
		case OscalPackage.SET_PARAMETER__LABEL:
			return getLabel();
		case OscalPackage.SET_PARAMETER__USAGE:
			return getUsage();
		case OscalPackage.SET_PARAMETER__CONSTRAINTS:
			return getConstraints();
		case OscalPackage.SET_PARAMETER__GUIDELINE:
			return getGuideline();
		case OscalPackage.SET_PARAMETER__VALUE:
			return getValue();
		case OscalPackage.SET_PARAMETER__SELECT:
			return getSelect();
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
		case OscalPackage.SET_PARAMETER__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case OscalPackage.SET_PARAMETER__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case OscalPackage.SET_PARAMETER__PARAM_ID:
			setParamId((String) newValue);
			return;
		case OscalPackage.SET_PARAMETER__CLASS:
			setClass((String) newValue);
			return;
		case OscalPackage.SET_PARAMETER__DEPENDS_ON:
			setDependsOn((String) newValue);
			return;
		case OscalPackage.SET_PARAMETER__LABEL:
			setLabel((String) newValue);
			return;
		case OscalPackage.SET_PARAMETER__USAGE:
			setUsage((String) newValue);
			return;
		case OscalPackage.SET_PARAMETER__CONSTRAINTS:
			getConstraints().clear();
			getConstraints().addAll((Collection<? extends OSCALConstraint>) newValue);
			return;
		case OscalPackage.SET_PARAMETER__GUIDELINE:
			getGuideline().clear();
			getGuideline().addAll((Collection<? extends String>) newValue);
			return;
		case OscalPackage.SET_PARAMETER__VALUE:
			getValue().clear();
			getValue().addAll((Collection<? extends String>) newValue);
			return;
		case OscalPackage.SET_PARAMETER__SELECT:
			getSelect().clear();
			getSelect().addAll((Collection<? extends Select>) newValue);
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
		case OscalPackage.SET_PARAMETER__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case OscalPackage.SET_PARAMETER__LINKS:
			getLinks().clear();
			return;
		case OscalPackage.SET_PARAMETER__PARAM_ID:
			setParamId(PARAM_ID_EDEFAULT);
			return;
		case OscalPackage.SET_PARAMETER__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case OscalPackage.SET_PARAMETER__DEPENDS_ON:
			setDependsOn(DEPENDS_ON_EDEFAULT);
			return;
		case OscalPackage.SET_PARAMETER__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case OscalPackage.SET_PARAMETER__USAGE:
			setUsage(USAGE_EDEFAULT);
			return;
		case OscalPackage.SET_PARAMETER__CONSTRAINTS:
			getConstraints().clear();
			return;
		case OscalPackage.SET_PARAMETER__GUIDELINE:
			getGuideline().clear();
			return;
		case OscalPackage.SET_PARAMETER__VALUE:
			getValue().clear();
			return;
		case OscalPackage.SET_PARAMETER__SELECT:
			getSelect().clear();
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
		case OscalPackage.SET_PARAMETER__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case OscalPackage.SET_PARAMETER__LINKS:
			return links != null && !links.isEmpty();
		case OscalPackage.SET_PARAMETER__PARAM_ID:
			return PARAM_ID_EDEFAULT == null ? paramId != null : !PARAM_ID_EDEFAULT.equals(paramId);
		case OscalPackage.SET_PARAMETER__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case OscalPackage.SET_PARAMETER__DEPENDS_ON:
			return DEPENDS_ON_EDEFAULT == null ? dependsOn != null : !DEPENDS_ON_EDEFAULT.equals(dependsOn);
		case OscalPackage.SET_PARAMETER__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case OscalPackage.SET_PARAMETER__USAGE:
			return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
		case OscalPackage.SET_PARAMETER__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		case OscalPackage.SET_PARAMETER__GUIDELINE:
			return guideline != null && !guideline.isEmpty();
		case OscalPackage.SET_PARAMETER__VALUE:
			return value != null && !value.isEmpty();
		case OscalPackage.SET_PARAMETER__SELECT:
			return select != null && !select.isEmpty();
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
			case OscalPackage.SET_PARAMETER__ANNOTATIONS:
				return OscalPackage.ANNOTATION_OWNER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
			case OscalPackage.SET_PARAMETER__LINKS:
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
				return OscalPackage.SET_PARAMETER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
			case OscalPackage.LINK_OWNER__LINKS:
				return OscalPackage.SET_PARAMETER__LINKS;
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
		result.append(" (paramId: ");
		result.append(paramId);
		result.append(", class: ");
		result.append(class_);
		result.append(", dependsOn: ");
		result.append(dependsOn);
		result.append(", label: ");
		result.append(label);
		result.append(", usage: ");
		result.append(usage);
		result.append(", guideline: ");
		result.append(guideline);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SetParameterImpl
