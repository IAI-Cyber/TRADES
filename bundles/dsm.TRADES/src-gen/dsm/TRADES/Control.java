/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Control#getMitigates <em>Mitigates</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends EObject {
	/**
	 * Returns the value of the '<em><b>Mitigates</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mitigates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigates</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getControl_Mitigates()
	 * @model
	 * @generated
	 */
	EList<Threat> getMitigates();

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Component}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Component#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getControl_ImplementedBy()
	 * @see dsm.TRADES.Component#getImplements
	 * @model opposite="implements"
	 * @generated
	 */
	EList<Component> getImplementedBy();

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
	 * @see dsm.TRADES.TRADESPackage#getControl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Control#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Control
