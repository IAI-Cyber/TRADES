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
 *   <li>{@link dsm.TRADES.AttackChain#getAttackchainSteps <em>Attackchain Steps</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChain#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAttackChain()
 * @model
 * @generated
 */
public interface AttackChain extends EObject {
	/**
	 * Returns the value of the '<em><b>Attackchain Steps</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.AttackChainStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attackchain Steps</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getAttackChain_AttackchainSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackChainStep> getAttackchainSteps();

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

} // AttackChain
