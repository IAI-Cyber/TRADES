/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Component;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;

import dsm.TRADES.threatTypeENUM;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getAllocated <em>Allocated</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getThreatallocation <em>Threatallocation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getThreatType <em>Threat Type</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatImpl extends MinimalEObjectImpl.Container implements Threat {
	/**
	 * The cached value of the '{@link #getAllocated() <em>Allocated</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocated()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> allocated;

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
	 * The cached value of the '{@link #getThreatallocation() <em>Threatallocation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatallocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatAllocationRelation> threatallocation;

	/**
	 * The default value of the '{@link #getThreatType() <em>Threat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatType()
	 * @generated
	 * @ordered
	 */
	protected static final threatTypeENUM THREAT_TYPE_EDEFAULT = threatTypeENUM.CONCRETE_THREAT;

	/**
	 * The cached value of the '{@link #getThreatType() <em>Threat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatType()
	 * @generated
	 * @ordered
	 */
	protected threatTypeENUM threatType = THREAT_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.THREAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getAllocated() {
		if (allocated == null) {
			allocated = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this,
					TRADESPackage.THREAT__ALLOCATED, TRADESPackage.COMPONENT__ALLOCATED_THREAT);
		}
		return allocated;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatAllocationRelation> getThreatallocation() {
		if (threatallocation == null) {
			threatallocation = new EObjectWithInverseResolvingEList<ThreatAllocationRelation>(
					ThreatAllocationRelation.class, this, TRADESPackage.THREAT__THREATALLOCATION,
					TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT);
		}
		return threatallocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public threatTypeENUM getThreatType() {
		return threatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreatType(threatTypeENUM newThreatType) {
		threatTypeENUM oldThreatType = threatType;
		threatType = newThreatType == null ? THREAT_TYPE_EDEFAULT : newThreatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__THREAT_TYPE, oldThreatType,
					threatType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__ID, oldId, id));
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
		case TRADESPackage.THREAT__ALLOCATED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAllocated()).basicAdd(otherEnd, msgs);
		case TRADESPackage.THREAT__THREATALLOCATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getThreatallocation()).basicAdd(otherEnd, msgs);
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
		case TRADESPackage.THREAT__ALLOCATED:
			return ((InternalEList<?>) getAllocated()).basicRemove(otherEnd, msgs);
		case TRADESPackage.THREAT__THREATALLOCATION:
			return ((InternalEList<?>) getThreatallocation()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.THREAT__ALLOCATED:
			return getAllocated();
		case TRADESPackage.THREAT__NAME:
			return getName();
		case TRADESPackage.THREAT__THREATALLOCATION:
			return getThreatallocation();
		case TRADESPackage.THREAT__THREAT_TYPE:
			return getThreatType();
		case TRADESPackage.THREAT__ID:
			return getId();
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
		case TRADESPackage.THREAT__ALLOCATED:
			getAllocated().clear();
			getAllocated().addAll((Collection<? extends Component>) newValue);
			return;
		case TRADESPackage.THREAT__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.THREAT__THREATALLOCATION:
			getThreatallocation().clear();
			getThreatallocation().addAll((Collection<? extends ThreatAllocationRelation>) newValue);
			return;
		case TRADESPackage.THREAT__THREAT_TYPE:
			setThreatType((threatTypeENUM) newValue);
			return;
		case TRADESPackage.THREAT__ID:
			setId((String) newValue);
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
		case TRADESPackage.THREAT__ALLOCATED:
			getAllocated().clear();
			return;
		case TRADESPackage.THREAT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.THREAT__THREATALLOCATION:
			getThreatallocation().clear();
			return;
		case TRADESPackage.THREAT__THREAT_TYPE:
			setThreatType(THREAT_TYPE_EDEFAULT);
			return;
		case TRADESPackage.THREAT__ID:
			setId(ID_EDEFAULT);
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
		case TRADESPackage.THREAT__ALLOCATED:
			return allocated != null && !allocated.isEmpty();
		case TRADESPackage.THREAT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.THREAT__THREATALLOCATION:
			return threatallocation != null && !threatallocation.isEmpty();
		case TRADESPackage.THREAT__THREAT_TYPE:
			return threatType != THREAT_TYPE_EDEFAULT;
		case TRADESPackage.THREAT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", threatType: ");
		result.append(threatType);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ThreatImpl
