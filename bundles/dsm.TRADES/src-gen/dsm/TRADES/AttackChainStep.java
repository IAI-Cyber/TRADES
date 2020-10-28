/**
 */
package dsm.TRADES;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Chain Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AttackChainStep#getStepNum <em>Step Num</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getThreatallocationrelation <em>Threatallocationrelation</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getImpactDescription <em>Impact Description</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAttackChainStep()
 * @model
 * @generated
 */
public interface AttackChainStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Num</em>' attribute.
	 * @see #setStepNum(int)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_StepNum()
	 * @model
	 * @generated
	 */
	int getStepNum();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getStepNum <em>Step Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Num</em>' attribute.
	 * @see #getStepNum()
	 * @generated
	 */
	void setStepNum(int value);

	/**
	 * Returns the value of the '<em><b>Threatallocationrelation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threatallocationrelation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threatallocationrelation</em>' reference.
	 * @see #setThreatallocationrelation(ThreatAllocationRelation)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_Threatallocationrelation()
	 * @model
	 * @generated
	 */
	ThreatAllocationRelation getThreatallocationrelation();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getThreatallocationrelation <em>Threatallocationrelation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threatallocationrelation</em>' reference.
	 * @see #getThreatallocationrelation()
	 * @generated
	 */
	void setThreatallocationrelation(ThreatAllocationRelation value);

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * optional difficulty of implementing step, overriding ThreatAllocationRelation difficulty rating
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(int)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_Difficulty()
	 * @model
	 * @generated
	 */
	int getDifficulty();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(int value);

	/**
	 * Returns the value of the '<em><b>Impact Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Description</em>' attribute.
	 * @see #setImpactDescription(String)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_ImpactDescription()
	 * @model
	 * @generated
	 */
	String getImpactDescription();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getImpactDescription <em>Impact Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Description</em>' attribute.
	 * @see #getImpactDescription()
	 * @generated
	 */
	void setImpactDescription(String value);

} // AttackChainStep
