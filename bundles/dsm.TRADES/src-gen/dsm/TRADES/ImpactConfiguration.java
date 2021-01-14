/**
 */
package dsm.TRADES;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ImpactConfiguration#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link dsm.TRADES.ImpactConfiguration#getImpact <em>Impact</em>}</li>
 *   <li>{@link dsm.TRADES.ImpactConfiguration#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getImpactConfiguration()
 * @model
 * @generated
 */
public interface ImpactConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' reference.
	 * @see #setDifficulty(DifficultyScore)
	 * @see dsm.TRADES.TRADESPackage#getImpactConfiguration_Difficulty()
	 * @model required="true"
	 * @generated
	 */
	DifficultyScore getDifficulty();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ImpactConfiguration#getDifficulty <em>Difficulty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' reference.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(DifficultyScore value);

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ImpactScore#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' container reference.
	 * @see #setImpact(ImpactScore)
	 * @see dsm.TRADES.TRADESPackage#getImpactConfiguration_Impact()
	 * @see dsm.TRADES.ImpactScore#getConfigurations
	 * @model opposite="configurations" required="true" transient="false"
	 * @generated
	 */
	ImpactScore getImpact();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ImpactConfiguration#getImpact <em>Impact</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' container reference.
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(ImpactScore value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"#FFFFFF"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(RGBColor)
	 * @see dsm.TRADES.TRADESPackage#getImpactConfiguration_Color()
	 * @model default="#FFFFFF" dataType="dsm.TRADES.RGBColor"
	 * @generated
	 */
	RGBColor getColor();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ImpactConfiguration#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(RGBColor value);

} // ImpactConfiguration
