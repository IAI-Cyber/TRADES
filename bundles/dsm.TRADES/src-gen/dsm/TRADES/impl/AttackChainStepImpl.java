/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AttackChainStep;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatAllocationRelation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Chain Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getStepNum <em>Step Num</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getThreatallocationrelation <em>Threatallocationrelation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getImpactDescription <em>Impact Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackChainStepImpl extends MinimalEObjectImpl.Container implements AttackChainStep {
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
	 * The cached value of the '{@link #getThreatallocationrelation() <em>Threatallocationrelation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatallocationrelation()
	 * @generated
	 * @ordered
	 */
	protected ThreatAllocationRelation threatallocationrelation;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final int DIFFICULTY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected int difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpactDescription() <em>Impact Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpactDescription() <em>Impact Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactDescription()
	 * @generated
	 * @ordered
	 */
	protected String impactDescription = IMPACT_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackChainStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ATTACK_CHAIN_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM, oldStepNum,
					stepNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatAllocationRelation getThreatallocationrelation() {
		if (threatallocationrelation != null && threatallocationrelation.eIsProxy()) {
			InternalEObject oldThreatallocationrelation = (InternalEObject) threatallocationrelation;
			threatallocationrelation = (ThreatAllocationRelation) eResolveProxy(oldThreatallocationrelation);
			if (threatallocationrelation != oldThreatallocationrelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.ATTACK_CHAIN_STEP__THREATALLOCATIONRELATION, oldThreatallocationrelation,
							threatallocationrelation));
			}
		}
		return threatallocationrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatAllocationRelation basicGetThreatallocationrelation() {
		return threatallocationrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreatallocationrelation(ThreatAllocationRelation newThreatallocationrelation) {
		ThreatAllocationRelation oldThreatallocationrelation = threatallocationrelation;
		threatallocationrelation = newThreatallocationrelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ATTACK_CHAIN_STEP__THREATALLOCATIONRELATION, oldThreatallocationrelation,
					threatallocationrelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficulty(int newDifficulty) {
		int oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY,
					oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImpactDescription() {
		return impactDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpactDescription(String newImpactDescription) {
		String oldImpactDescription = impactDescription;
		impactDescription = newImpactDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION,
					oldImpactDescription, impactDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			return getStepNum();
		case TRADESPackage.ATTACK_CHAIN_STEP__THREATALLOCATIONRELATION:
			if (resolve)
				return getThreatallocationrelation();
			return basicGetThreatallocationrelation();
		case TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY:
			return getDifficulty();
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			return getImpactDescription();
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			setStepNum((Integer) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__THREATALLOCATIONRELATION:
			setThreatallocationrelation((ThreatAllocationRelation) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY:
			setDifficulty((Integer) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			setImpactDescription((String) newValue);
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			setStepNum(STEP_NUM_EDEFAULT);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__THREATALLOCATIONRELATION:
			setThreatallocationrelation((ThreatAllocationRelation) null);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY:
			setDifficulty(DIFFICULTY_EDEFAULT);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			setImpactDescription(IMPACT_DESCRIPTION_EDEFAULT);
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			return stepNum != STEP_NUM_EDEFAULT;
		case TRADESPackage.ATTACK_CHAIN_STEP__THREATALLOCATIONRELATION:
			return threatallocationrelation != null;
		case TRADESPackage.ATTACK_CHAIN_STEP__DIFFICULTY:
			return difficulty != DIFFICULTY_EDEFAULT;
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			return IMPACT_DESCRIPTION_EDEFAULT == null ? impactDescription != null
					: !IMPACT_DESCRIPTION_EDEFAULT.equals(impactDescription);
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
		result.append(", difficulty: ");
		result.append(difficulty);
		result.append(", impactDescription: ");
		result.append(impactDescription);
		result.append(')');
		return result.toString();
	}

} //AttackChainStepImpl
