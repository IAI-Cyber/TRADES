/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AttackInfo;
import dsm.TRADES.TRADESPackage;

import dsm.TRADES.ThreatAllocationRelation;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AttackInfoImpl#getStepNum <em>Step Num</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackInfoImpl#getAttackVector <em>Attack Vector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackInfoImpl extends MinimalEObjectImpl.Container implements AttackInfo {
	/**
	 * The default value of the '{@link #getStepNum() <em>Step Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNum()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepNum() <em>Step Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNum()
	 * @generated
	 * @ordered
	 */
	protected int stepNum = STEP_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttackVector() <em>Attack Vector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackVector()
	 * @generated
	 * @ordered
	 */
	protected ThreatAllocationRelation attackVector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ATTACK_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStepNum() {
		return stepNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepNum(int newStepNum) {
		int oldStepNum = stepNum;
		stepNum = newStepNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_INFO__STEP_NUM, oldStepNum,
					stepNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatAllocationRelation getAttackVector() {
		if (attackVector != null && attackVector.eIsProxy()) {
			InternalEObject oldAttackVector = (InternalEObject) attackVector;
			attackVector = (ThreatAllocationRelation) eResolveProxy(oldAttackVector);
			if (attackVector != oldAttackVector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TRADESPackage.ATTACK_INFO__ATTACK_VECTOR,
							oldAttackVector, attackVector));
			}
		}
		return attackVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatAllocationRelation basicGetAttackVector() {
		return attackVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttackVector(ThreatAllocationRelation newAttackVector) {
		ThreatAllocationRelation oldAttackVector = attackVector;
		attackVector = newAttackVector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_INFO__ATTACK_VECTOR,
					oldAttackVector, attackVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.ATTACK_INFO__STEP_NUM:
			return getStepNum();
		case TRADESPackage.ATTACK_INFO__ATTACK_VECTOR:
			if (resolve)
				return getAttackVector();
			return basicGetAttackVector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.ATTACK_INFO__STEP_NUM:
			setStepNum((Integer) newValue);
			return;
		case TRADESPackage.ATTACK_INFO__ATTACK_VECTOR:
			setAttackVector((ThreatAllocationRelation) newValue);
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
		case TRADESPackage.ATTACK_INFO__STEP_NUM:
			setStepNum(STEP_NUM_EDEFAULT);
			return;
		case TRADESPackage.ATTACK_INFO__ATTACK_VECTOR:
			setAttackVector((ThreatAllocationRelation) null);
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
		case TRADESPackage.ATTACK_INFO__STEP_NUM:
			return stepNum != STEP_NUM_EDEFAULT;
		case TRADESPackage.ATTACK_INFO__ATTACK_VECTOR:
			return attackVector != null;
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
		result.append(" (stepNum: ");
		result.append(stepNum);
		result.append(')');
		return result.toString();
	}

} //AttackInfoImpl
