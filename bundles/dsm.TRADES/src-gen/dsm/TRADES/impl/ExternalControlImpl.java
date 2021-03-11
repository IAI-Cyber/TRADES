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
package dsm.TRADES.impl;

import dsm.TRADES.Control;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.NamedElement;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatMitigationRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getMitigatedThreats <em>Mitigated Threats</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getMitigationRelations <em>Mitigation Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalControlImpl extends ExternalElementImpl implements ExternalControl {
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
	 * The cached value of the '{@link #getMitigatedThreats() <em>Mitigated Threats</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigatedThreats()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> mitigatedThreats;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMitigationRelations() <em>Mitigation Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigationRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatMitigationRelation> mitigationRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.EXTERNAL_CONTROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.EXTERNAL_CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getMitigatedThreats() {
		if (mitigatedThreats == null) {
			mitigatedThreats = new EObjectResolvingEList<Threat>(Threat.class, this,
					TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS);
		}
		return mitigatedThreats;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.EXTERNAL_CONTROL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatMitigationRelation> getMitigationRelations() {
		if (mitigationRelations == null) {
			mitigationRelations = new EObjectContainmentWithInverseEList<ThreatMitigationRelation>(
					ThreatMitigationRelation.class, this, TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS,
					TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL);
		}
		return mitigationRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMitigationRelations()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			return ((InternalEList<?>) getMitigationRelations()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.EXTERNAL_CONTROL__NAME:
			return getName();
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
			return getMitigatedThreats();
		case TRADESPackage.EXTERNAL_CONTROL__ID:
			return getId();
		case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
			return getDescription();
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			return getMitigationRelations();
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
		case TRADESPackage.EXTERNAL_CONTROL__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
			getMitigatedThreats().clear();
			getMitigatedThreats().addAll((Collection<? extends Threat>) newValue);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__ID:
			setId((String) newValue);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			getMitigationRelations().clear();
			getMitigationRelations().addAll((Collection<? extends ThreatMitigationRelation>) newValue);
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
		case TRADESPackage.EXTERNAL_CONTROL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
			getMitigatedThreats().clear();
			return;
		case TRADESPackage.EXTERNAL_CONTROL__ID:
			setId(ID_EDEFAULT);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			getMitigationRelations().clear();
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
		case TRADESPackage.EXTERNAL_CONTROL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
			return mitigatedThreats != null && !mitigatedThreats.isEmpty();
		case TRADESPackage.EXTERNAL_CONTROL__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			return mitigationRelations != null && !mitigationRelations.isEmpty();
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.EXTERNAL_CONTROL__NAME:
				return TRADESPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == Control.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
				return TRADESPackage.CONTROL__MITIGATED_THREATS;
			case TRADESPackage.EXTERNAL_CONTROL__ID:
				return TRADESPackage.CONTROL__ID;
			case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
				return TRADESPackage.CONTROL__DESCRIPTION;
			case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
				return TRADESPackage.CONTROL__MITIGATION_RELATIONS;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.NAMED_ELEMENT__NAME:
				return TRADESPackage.EXTERNAL_CONTROL__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == Control.class) {
			switch (baseFeatureID) {
			case TRADESPackage.CONTROL__MITIGATED_THREATS:
				return TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS;
			case TRADESPackage.CONTROL__ID:
				return TRADESPackage.EXTERNAL_CONTROL__ID;
			case TRADESPackage.CONTROL__DESCRIPTION:
				return TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION;
			case TRADESPackage.CONTROL__MITIGATION_RELATIONS:
				return TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS;
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
		result.append(", id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ExternalControlImpl
