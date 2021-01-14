/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.DataOwner#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getDataOwner()
 * @model
 * @generated
 */
public interface DataOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getDataOwner_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // DataOwner
