/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ControlType#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getControlType()
 * @model
 * @generated
 */
public interface ControlType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getControlType_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Control> getControls();

} // ControlType
