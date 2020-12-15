/**
 */
package dsm.TRADES;

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
 *   <li>{@link dsm.TRADES.ControlOwner#getInternal <em>Internal</em>}</li>
 *   <li>{@link dsm.TRADES.ControlOwner#getExternal <em>External</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getControlOwner()
 * @model
 * @generated
 */
public interface ControlOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' containment reference.
	 * @see #setInternal(ControlType)
	 * @see dsm.TRADES.TRADESPackage#getControlOwner_Internal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ControlType getInternal();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ControlOwner#getInternal <em>Internal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' containment reference.
	 * @see #getInternal()
	 * @generated
	 */
	void setInternal(ControlType value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' containment reference.
	 * @see #setExternal(ControlType)
	 * @see dsm.TRADES.TRADESPackage#getControlOwner_External()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ControlType getExternal();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ControlOwner#getExternal <em>External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' containment reference.
	 * @see #getExternal()
	 * @generated
	 */
	void setExternal(ControlType value);

} // ControlOwner
