/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.DifficultyScore;
import dsm.TRADES.TRADESPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Difficulty Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.DifficultyScoreImpl#getDifficulty <em>Difficulty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DifficultyScoreImpl extends NamedElementImpl implements DifficultyScore {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifficultyScoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.DIFFICULTY_SCORE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.DIFFICULTY_SCORE__DIFFICULTY,
					oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.DIFFICULTY_SCORE__DIFFICULTY:
			return getDifficulty();
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
		case TRADESPackage.DIFFICULTY_SCORE__DIFFICULTY:
			setDifficulty((Integer) newValue);
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
		case TRADESPackage.DIFFICULTY_SCORE__DIFFICULTY:
			setDifficulty(DIFFICULTY_EDEFAULT);
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
		case TRADESPackage.DIFFICULTY_SCORE__DIFFICULTY:
			return difficulty != DIFFICULTY_EDEFAULT;
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
		result.append(" (difficulty: ");
		result.append(difficulty);
		result.append(')');
		return result.toString();
	}

} //DifficultyScoreImpl
