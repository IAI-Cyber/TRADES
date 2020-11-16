/**
 */
package dsm.TRADES;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AttackInfo#getStepNum <em>Step Num</em>}</li>
 *   <li>{@link dsm.TRADES.AttackInfo#getAttackVector <em>Attack Vector</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAttackInfo()
 * @model
 * @generated
 */
public interface AttackInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Num</em>' attribute.
	 * @see #setStepNum(int)
	 * @see dsm.TRADES.TRADESPackage#getAttackInfo_StepNum()
	 * @model
	 * @generated
	 */
	int getStepNum();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackInfo#getStepNum <em>Step Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Num</em>' attribute.
	 * @see #getStepNum()
	 * @generated
	 */
	void setStepNum(int value);

	/**
	 * Returns the value of the '<em><b>Attack Vector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Vector</em>' reference.
	 * @see #setAttackVector(ThreatAllocationRelation)
	 * @see dsm.TRADES.TRADESPackage#getAttackInfo_AttackVector()
	 * @model required="true"
	 * @generated
	 */
	ThreatAllocationRelation getAttackVector();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackInfo#getAttackVector <em>Attack Vector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Vector</em>' reference.
	 * @see #getAttackVector()
	 * @generated
	 */
	void setAttackVector(ThreatAllocationRelation value);

} // AttackInfo
