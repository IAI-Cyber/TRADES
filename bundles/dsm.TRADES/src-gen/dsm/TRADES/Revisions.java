/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revisions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Revisions#getRevisions <em>Revisions</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getRevisions()
 * @model
 * @generated
 */
public interface Revisions extends EObject {
	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Revision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getRevisions_Revisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision> getRevisions();

} // Revisions
