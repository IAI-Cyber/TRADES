/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.ScoreSystem;
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
 * An implementation of the model object '<em><b>Score System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ScoreSystemImpl#getImpactscore <em>Impactscore</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ScoreSystemImpl#getDifficultyscore <em>Difficultyscore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScoreSystemImpl extends NamedElementImpl implements ScoreSystem {
	/**
	 * The cached value of the '{@link #getImpactscore() <em>Impactscore</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactscore()
	 * @generated
	 * @ordered
	 */
	protected EList<ImpactScore> impactscore;

	/**
	 * The cached value of the '{@link #getDifficultyscore() <em>Difficultyscore</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficultyscore()
	 * @generated
	 * @ordered
	 */
	protected EList<DifficultyScore> difficultyscore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScoreSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.SCORE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImpactScore> getImpactscore() {
		if (impactscore == null) {
			impactscore = new EObjectContainmentEList<ImpactScore>(ImpactScore.class, this,
					TRADESPackage.SCORE_SYSTEM__IMPACTSCORE);
		}
		return impactscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DifficultyScore> getDifficultyscore() {
		if (difficultyscore == null) {
			difficultyscore = new EObjectContainmentEList<DifficultyScore>(DifficultyScore.class, this,
					TRADESPackage.SCORE_SYSTEM__DIFFICULTYSCORE);
		}
		return difficultyscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.SCORE_SYSTEM__IMPACTSCORE:
			return ((InternalEList<?>) getImpactscore()).basicRemove(otherEnd, msgs);
		case TRADESPackage.SCORE_SYSTEM__DIFFICULTYSCORE:
			return ((InternalEList<?>) getDifficultyscore()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.SCORE_SYSTEM__IMPACTSCORE:
			return getImpactscore();
		case TRADESPackage.SCORE_SYSTEM__DIFFICULTYSCORE:
			return getDifficultyscore();
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
		case TRADESPackage.SCORE_SYSTEM__IMPACTSCORE:
			getImpactscore().clear();
			getImpactscore().addAll((Collection<? extends ImpactScore>) newValue);
			return;
		case TRADESPackage.SCORE_SYSTEM__DIFFICULTYSCORE:
			getDifficultyscore().clear();
			getDifficultyscore().addAll((Collection<? extends DifficultyScore>) newValue);
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
		case TRADESPackage.SCORE_SYSTEM__IMPACTSCORE:
			getImpactscore().clear();
			return;
		case TRADESPackage.SCORE_SYSTEM__DIFFICULTYSCORE:
			getDifficultyscore().clear();
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
		case TRADESPackage.SCORE_SYSTEM__IMPACTSCORE:
			return impactscore != null && !impactscore.isEmpty();
		case TRADESPackage.SCORE_SYSTEM__DIFFICULTYSCORE:
			return difficultyscore != null && !difficultyscore.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScoreSystemImpl
