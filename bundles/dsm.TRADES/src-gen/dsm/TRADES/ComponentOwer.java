/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Ower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ComponentOwer#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getComponentOwer()
 * @model abstract="true"
 * @generated
 */
public interface ComponentOwer extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getComponentOwer_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

} // ComponentOwer
