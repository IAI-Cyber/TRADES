/**
 */
package dsm.TRADES;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Difficulty Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.DifficultyScore#getDifficulty <em>Difficulty</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getDifficultyScore()
 * @model
 * @generated
 */
public interface DifficultyScore extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(int)
	 * @see dsm.TRADES.TRADESPackage#getDifficultyScore_Difficulty()
	 * @model
	 * @generated
	 */
	int getDifficulty();

	/**
	 * Sets the value of the '{@link dsm.TRADES.DifficultyScore#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(int value);
} // DifficultyScore
