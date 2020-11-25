/**
 */
package dsm.TRADES;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ImpactScore#getImpact <em>Impact</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getImpactScore()
 * @model
 * @generated
 */
public interface ImpactScore extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see #setImpact(int)
	 * @see dsm.TRADES.TRADESPackage#getImpactScore_Impact()
	 * @model
	 * @generated
	 */
	int getImpact();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ImpactScore#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(int value);
} // ImpactScore
