/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ThreatTypeImpl#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatTypeImpl#getThreats <em>Threats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatTypeImpl extends NamedElementImpl implements ThreatType {
	/**
	 * The cached value of the '{@link #getSubTypes() <em>Sub Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatType> subTypes;

	/**
	 * The cached value of the '{@link #getThreats() <em>Threats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreats()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> threats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.THREAT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatType> getSubTypes() {
		if (subTypes == null) {
			subTypes = new EObjectContainmentEList<ThreatType>(ThreatType.class, this,
					TRADESPackage.THREAT_TYPE__SUB_TYPES);
		}
		return subTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getThreats() {
		if (threats == null) {
			threats = new EObjectContainmentEList<Threat>(Threat.class, this, TRADESPackage.THREAT_TYPE__THREATS);
		}
		return threats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.THREAT_TYPE__SUB_TYPES:
			return ((InternalEList<?>) getSubTypes()).basicRemove(otherEnd, msgs);
		case TRADESPackage.THREAT_TYPE__THREATS:
			return ((InternalEList<?>) getThreats()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.THREAT_TYPE__SUB_TYPES:
			return getSubTypes();
		case TRADESPackage.THREAT_TYPE__THREATS:
			return getThreats();
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
		case TRADESPackage.THREAT_TYPE__SUB_TYPES:
			getSubTypes().clear();
			getSubTypes().addAll((Collection<? extends ThreatType>) newValue);
			return;
		case TRADESPackage.THREAT_TYPE__THREATS:
			getThreats().clear();
			getThreats().addAll((Collection<? extends Threat>) newValue);
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
		case TRADESPackage.THREAT_TYPE__SUB_TYPES:
			getSubTypes().clear();
			return;
		case TRADESPackage.THREAT_TYPE__THREATS:
			getThreats().clear();
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
		case TRADESPackage.THREAT_TYPE__SUB_TYPES:
			return subTypes != null && !subTypes.isEmpty();
		case TRADESPackage.THREAT_TYPE__THREATS:
			return threats != null && !threats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThreatTypeImpl
