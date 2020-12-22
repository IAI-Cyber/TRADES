/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AttackChainImpl#getAttackchainSteps <em>Attackchain Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackChainImpl extends NamedElementImpl implements AttackChain {
	/**
	 * The cached value of the '{@link #getAttackchainSteps() <em>Attackchain Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackchainSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackChainStep> attackchainSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ATTACK_CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackChainStep> getAttackchainSteps() {
		if (attackchainSteps == null) {
			attackchainSteps = new EObjectContainmentEList<AttackChainStep>(AttackChainStep.class, this,
					TRADESPackage.ATTACK_CHAIN__ATTACKCHAIN_STEPS);
		}
		return attackchainSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAIN_STEPS:
			return ((InternalEList<?>) getAttackchainSteps()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAIN_STEPS:
			return getAttackchainSteps();
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
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAIN_STEPS:
			getAttackchainSteps().clear();
			getAttackchainSteps().addAll((Collection<? extends AttackChainStep>) newValue);
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
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAIN_STEPS:
			getAttackchainSteps().clear();
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
		case TRADESPackage.ATTACK_CHAIN__ATTACKCHAIN_STEPS:
			return attackchainSteps != null && !attackchainSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttackChainImpl
