/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Back Matter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.BackMatter#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getBackMatter()
 * @model
 * @generated
 */
public interface BackMatter extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getBackMatter_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // BackMatter
