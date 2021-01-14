/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Control Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AbstractControlOwner#getControlOwner <em>Control Owner</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAbstractControlOwner()
 * @model abstract="true"
 * @generated
 */
public interface AbstractControlOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Control Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Owner</em>' containment reference.
	 * @see #setControlOwner(ControlOwner)
	 * @see dsm.TRADES.TRADESPackage#getAbstractControlOwner_ControlOwner()
	 * @model containment="true"
	 * @generated
	 */
	ControlOwner getControlOwner();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AbstractControlOwner#getControlOwner <em>Control Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Owner</em>' containment reference.
	 * @see #getControlOwner()
	 * @generated
	 */
	void setControlOwner(ControlOwner value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Control> getAllControls();

} // AbstractControlOwner
