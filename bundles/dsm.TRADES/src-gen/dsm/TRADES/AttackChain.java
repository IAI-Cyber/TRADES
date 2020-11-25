/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAttackChain()
 * @model
 * @generated
 */
public interface AttackChain extends NamedElement {
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

} // AttackChain
