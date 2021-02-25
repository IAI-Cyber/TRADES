/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Control;
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
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ControlImpl#getMitigatedThreats <em>Mitigated Threats</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlImpl#getMitigationrRelations <em>Mitigationr Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends NamedElementImpl implements Control {
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
	 * The cached value of the '{@link #getMitigationrRelations() <em>Mitigationr Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigationrRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatMitigationRelation> mitigationrRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.CONTROL;
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
					TRADESPackage.CONTROL__MITIGATED_THREATS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CONTROL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CONTROL__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatMitigationRelation> getMitigationrRelations() {
		if (mitigationrRelations == null) {
			mitigationrRelations = new EObjectContainmentWithInverseEList<ThreatMitigationRelation>(
					ThreatMitigationRelation.class, this, TRADESPackage.CONTROL__MITIGATIONR_RELATIONS,
					TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL);
		}
		return mitigationrRelations;
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
		case TRADESPackage.CONTROL__MITIGATIONR_RELATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMitigationrRelations()).basicAdd(otherEnd,
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
		case TRADESPackage.CONTROL__MITIGATIONR_RELATIONS:
			return ((InternalEList<?>) getMitigationrRelations()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.CONTROL__MITIGATED_THREATS:
			return getMitigatedThreats();
		case TRADESPackage.CONTROL__ID:
			return getId();
		case TRADESPackage.CONTROL__DESCRIPTION:
			return getDescription();
		case TRADESPackage.CONTROL__MITIGATIONR_RELATIONS:
			return getMitigationrRelations();
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
		case TRADESPackage.CONTROL__MITIGATED_THREATS:
			getMitigatedThreats().clear();
			getMitigatedThreats().addAll((Collection<? extends Threat>) newValue);
			return;
		case TRADESPackage.CONTROL__ID:
			setId((String) newValue);
			return;
		case TRADESPackage.CONTROL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TRADESPackage.CONTROL__MITIGATIONR_RELATIONS:
			getMitigationrRelations().clear();
			getMitigationrRelations().addAll((Collection<? extends ThreatMitigationRelation>) newValue);
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
		case TRADESPackage.CONTROL__MITIGATED_THREATS:
			getMitigatedThreats().clear();
			return;
		case TRADESPackage.CONTROL__ID:
			setId(ID_EDEFAULT);
			return;
		case TRADESPackage.CONTROL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TRADESPackage.CONTROL__MITIGATIONR_RELATIONS:
			getMitigationrRelations().clear();
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
		case TRADESPackage.CONTROL__MITIGATED_THREATS:
			return mitigatedThreats != null && !mitigatedThreats.isEmpty();
		case TRADESPackage.CONTROL__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TRADESPackage.CONTROL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TRADESPackage.CONTROL__MITIGATIONR_RELATIONS:
			return mitigationrRelations != null && !mitigationrRelations.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ControlImpl
