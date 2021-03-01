/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.LinkOwner#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getLinkOwner()
 * @model abstract="true"
 * @generated
 */
public interface LinkOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getLinkOwner_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // LinkOwner
