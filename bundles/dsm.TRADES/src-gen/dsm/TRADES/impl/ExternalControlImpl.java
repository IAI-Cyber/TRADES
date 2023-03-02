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
import dsm.TRADES.ControlStatusENUM;
import dsm.TRADES.ElementWithId;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.IControlDefinition;
import dsm.TRADES.IElementWithSource;
import dsm.TRADES.IMitigationLink;
import dsm.TRADES.NamedElement;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatMitigationRelation;

import dsm.TRADES.Vulnerability;
import java.lang.reflect.InvocationTargetException;

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
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getMitigatedThreats <em>Mitigated Threats</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getMitigationRelations <em>Mitigation Relations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ExternalControlImpl#getMitigatesVulnerability <em>Mitigates Vulnerability</em>}</li>
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
	 * The cached value of the '{@link #getMitigatedThreats() <em>Mitigated Threats</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigatedThreats()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> mitigatedThreats;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ControlStatusENUM STATUS_EDEFAULT = ControlStatusENUM.PROPOSED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ControlStatusENUM status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMitigatesVulnerability() <em>Mitigates Vulnerability</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigatesVulnerability()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> mitigatesVulnerability;

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
	@Override
	public ControlStatusENUM getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ControlStatusENUM newStatus) {
		ControlStatusENUM oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.EXTERNAL_CONTROL__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vulnerability> getMitigatesVulnerability() {
		if (mitigatesVulnerability == null) {
			mitigatesVulnerability = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this,
					TRADESPackage.EXTERNAL_CONTROL__MITIGATES_VULNERABILITY);
		}
		return mitigatesVulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IMitigationLink> getMitigatedThreatDefinitions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceIdentifier() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case TRADESPackage.EXTERNAL_CONTROL__ID:
			return getId();
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
			return getMitigatedThreats();
		case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
			return getDescription();
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			return getMitigationRelations();
		case TRADESPackage.EXTERNAL_CONTROL__STATUS:
			return getStatus();
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATES_VULNERABILITY:
			return getMitigatesVulnerability();
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
		case TRADESPackage.EXTERNAL_CONTROL__ID:
			setId((String) newValue);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
			getMitigatedThreats().clear();
			getMitigatedThreats().addAll((Collection<? extends Threat>) newValue);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			getMitigationRelations().clear();
			getMitigationRelations().addAll((Collection<? extends ThreatMitigationRelation>) newValue);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__STATUS:
			setStatus((ControlStatusENUM) newValue);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATES_VULNERABILITY:
			getMitigatesVulnerability().clear();
			getMitigatesVulnerability().addAll((Collection<? extends Vulnerability>) newValue);
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
		case TRADESPackage.EXTERNAL_CONTROL__ID:
			setId(ID_EDEFAULT);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
			getMitigatedThreats().clear();
			return;
		case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			getMitigationRelations().clear();
			return;
		case TRADESPackage.EXTERNAL_CONTROL__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATES_VULNERABILITY:
			getMitigatesVulnerability().clear();
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
		case TRADESPackage.EXTERNAL_CONTROL__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
			return mitigatedThreats != null && !mitigatedThreats.isEmpty();
		case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
			return mitigationRelations != null && !mitigationRelations.isEmpty();
		case TRADESPackage.EXTERNAL_CONTROL__STATUS:
			return status != STATUS_EDEFAULT;
		case TRADESPackage.EXTERNAL_CONTROL__MITIGATES_VULNERABILITY:
			return mitigatesVulnerability != null && !mitigatesVulnerability.isEmpty();
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
		if (baseClass == IElementWithSource.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == IControlDefinition.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.EXTERNAL_CONTROL__ID:
				return TRADESPackage.ELEMENT_WITH_ID__ID;
			default:
				return -1;
			}
		}
		if (baseClass == Control.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS:
				return TRADESPackage.CONTROL__MITIGATED_THREATS;
			case TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION:
				return TRADESPackage.CONTROL__DESCRIPTION;
			case TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS:
				return TRADESPackage.CONTROL__MITIGATION_RELATIONS;
			case TRADESPackage.EXTERNAL_CONTROL__STATUS:
				return TRADESPackage.CONTROL__STATUS;
			case TRADESPackage.EXTERNAL_CONTROL__MITIGATES_VULNERABILITY:
				return TRADESPackage.CONTROL__MITIGATES_VULNERABILITY;
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
		if (baseClass == IElementWithSource.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == IControlDefinition.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ELEMENT_WITH_ID__ID:
				return TRADESPackage.EXTERNAL_CONTROL__ID;
			default:
				return -1;
			}
		}
		if (baseClass == Control.class) {
			switch (baseFeatureID) {
			case TRADESPackage.CONTROL__MITIGATED_THREATS:
				return TRADESPackage.EXTERNAL_CONTROL__MITIGATED_THREATS;
			case TRADESPackage.CONTROL__DESCRIPTION:
				return TRADESPackage.EXTERNAL_CONTROL__DESCRIPTION;
			case TRADESPackage.CONTROL__MITIGATION_RELATIONS:
				return TRADESPackage.EXTERNAL_CONTROL__MITIGATION_RELATIONS;
			case TRADESPackage.CONTROL__STATUS:
				return TRADESPackage.EXTERNAL_CONTROL__STATUS;
			case TRADESPackage.CONTROL__MITIGATES_VULNERABILITY:
				return TRADESPackage.EXTERNAL_CONTROL__MITIGATES_VULNERABILITY;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == IElementWithSource.class) {
			switch (baseOperationID) {
			case TRADESPackage.IELEMENT_WITH_SOURCE___GET_SOURCE_NAME:
				return TRADESPackage.EXTERNAL_CONTROL___GET_SOURCE_NAME;
			case TRADESPackage.IELEMENT_WITH_SOURCE___GET_SOURCE_IDENTIFIER:
				return TRADESPackage.EXTERNAL_CONTROL___GET_SOURCE_IDENTIFIER;
			default:
				return -1;
			}
		}
		if (baseClass == IControlDefinition.class) {
			switch (baseOperationID) {
			case TRADESPackage.ICONTROL_DEFINITION___GET_DESCRIPTION:
				return TRADESPackage.EXTERNAL_CONTROL___GET_DESCRIPTION;
			case TRADESPackage.ICONTROL_DEFINITION___GET_ID:
				return TRADESPackage.EXTERNAL_CONTROL___GET_ID;
			case TRADESPackage.ICONTROL_DEFINITION___GET_MITIGATED_THREAT_DEFINITIONS:
				return TRADESPackage.EXTERNAL_CONTROL___GET_MITIGATED_THREAT_DEFINITIONS;
			case TRADESPackage.ICONTROL_DEFINITION___GET_NAME:
				return TRADESPackage.EXTERNAL_CONTROL___GET_NAME;
			default:
				return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == Control.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TRADESPackage.EXTERNAL_CONTROL___GET_MITIGATED_THREAT_DEFINITIONS:
			return getMitigatedThreatDefinitions();
		case TRADESPackage.EXTERNAL_CONTROL___GET_SOURCE_NAME:
			return getSourceName();
		case TRADESPackage.EXTERNAL_CONTROL___GET_SOURCE_IDENTIFIER:
			return getSourceIdentifier();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ExternalControlImpl
