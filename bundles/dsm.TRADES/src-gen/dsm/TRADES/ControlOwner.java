/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ControlOwner#getInternals <em>Internals</em>}</li>
 *   <li>{@link dsm.TRADES.ControlOwner#getExternals <em>Externals</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getControlOwner()
 * @model
 * @generated
 */
public interface ControlOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Internals</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internals</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getControlOwner_Internals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getInternals();

	/**
	 * Returns the value of the '<em><b>Externals</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externals</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getControlOwner_Externals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getExternals();

} // ControlOwner
