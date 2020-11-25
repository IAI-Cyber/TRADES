/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AttackChain#getAttackchainstep <em>Attackchainstep</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChain#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChain#getStart <em>Start</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChain#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAttackChain()
 * @model
 * @generated
 */
public interface AttackChain extends EObject {
	/**
	 * Returns the value of the '<em><b>Attackchainstep</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AttackChainStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attackchainstep</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attackchainstep</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAttackChain_Attackchainstep()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackChainStep> getAttackchainstep();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsm.TRADES.TRADESPackage#getAttackChain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(AttackChainStep)
	 * @see dsm.TRADES.TRADESPackage#getAttackChain_Start()
	 * @model required="true"
	 * @generated
	 */
	AttackChainStep getStart();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChain#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(AttackChainStep value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(AttackChainStep)
	 * @see dsm.TRADES.TRADESPackage#getAttackChain_End()
	 * @model required="true"
	 * @generated
	 */
	AttackChainStep getEnd();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChain#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(AttackChainStep value);

} // AttackChain
