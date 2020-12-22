/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link dsm.TRADES.ImpactScore#getConfigurations <em>Configurations</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ImpactConfiguration}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ImpactConfiguration#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getImpactScore_Configurations()
	 * @see dsm.TRADES.ImpactConfiguration#getImpact
	 * @model opposite="impact" containment="true"
	 * @generated
	 */
	EList<ImpactConfiguration> getConfigurations();

} // ImpactScore
