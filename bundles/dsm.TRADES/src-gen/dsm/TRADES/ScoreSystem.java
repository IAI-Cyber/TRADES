/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ScoreSystem#getImpactscore <em>Impactscore</em>}</li>
 *   <li>{@link dsm.TRADES.ScoreSystem#getDifficultyscore <em>Difficultyscore</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getScoreSystem()
 * @model
 * @generated
 */
public interface ScoreSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Impactscore</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ImpactScore}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impactscore</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impactscore</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getScoreSystem_Impactscore()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImpactScore> getImpactscore();

	/**
	 * Returns the value of the '<em><b>Difficultyscore</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.DifficultyScore}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficultyscore</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficultyscore</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getScoreSystem_Difficultyscore()
	 * @model containment="true"
	 * @generated
	 */
	EList<DifficultyScore> getDifficultyscore();

} // ScoreSystem
