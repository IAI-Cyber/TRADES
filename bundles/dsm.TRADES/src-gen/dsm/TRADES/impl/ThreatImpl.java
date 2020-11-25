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
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getThreatallocation <em>Threatallocation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getThreatType <em>Threat Type</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getID <em>ID</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatImpl#getApplicability <em>Applicability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatImpl extends NamedElementImpl implements Threat {
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
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
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
	 * The default value of the '{@link #getApplicability() <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicability() <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicability()
	 * @generated
	 * @ordered
	 */
	protected String applicability = APPLICABILITY_EDEFAULT;

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
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplicability() {
		return applicability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicability(String newApplicability) {
		String oldApplicability = applicability;
		applicability = newApplicability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT__APPLICABILITY, oldApplicability,
					applicability));
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
		case TRADESPackage.THREAT__THREATALLOCATION:
			return getThreatallocation();
		case TRADESPackage.THREAT__THREAT_TYPE:
			return getThreatType();
		case TRADESPackage.THREAT__ID:
			return getID();
		case TRADESPackage.THREAT__DESCRIPTION:
			return getDescription();
		case TRADESPackage.THREAT__APPLICABILITY:
			return getApplicability();
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
		case TRADESPackage.THREAT__THREATALLOCATION:
			getThreatallocation().clear();
			getThreatallocation().addAll((Collection<? extends ThreatAllocationRelation>) newValue);
			return;
		case TRADESPackage.THREAT__THREAT_TYPE:
			setThreatType((threatTypeENUM) newValue);
			return;
		case TRADESPackage.THREAT__ID:
			setID((String) newValue);
			return;
		case TRADESPackage.THREAT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TRADESPackage.THREAT__APPLICABILITY:
			setApplicability((String) newValue);
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
		case TRADESPackage.THREAT__THREATALLOCATION:
			getThreatallocation().clear();
			return;
		case TRADESPackage.THREAT__THREAT_TYPE:
			setThreatType(THREAT_TYPE_EDEFAULT);
			return;
		case TRADESPackage.THREAT__ID:
			setID(ID_EDEFAULT);
			return;
		case TRADESPackage.THREAT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TRADESPackage.THREAT__APPLICABILITY:
			setApplicability(APPLICABILITY_EDEFAULT);
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
		case TRADESPackage.THREAT__THREATALLOCATION:
			return threatallocation != null && !threatallocation.isEmpty();
		case TRADESPackage.THREAT__THREAT_TYPE:
			return threatType != THREAT_TYPE_EDEFAULT;
		case TRADESPackage.THREAT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TRADESPackage.THREAT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TRADESPackage.THREAT__APPLICABILITY:
			return APPLICABILITY_EDEFAULT == null ? applicability != null
					: !APPLICABILITY_EDEFAULT.equals(applicability);
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
		result.append(" (threatType: ");
		result.append(threatType);
		result.append(", ID: ");
		result.append(id);
		result.append(", Description: ");
		result.append(description);
		result.append(", Applicability: ");
		result.append(applicability);
		result.append(')');
		return result.toString();
	}

} //ThreatImpl
