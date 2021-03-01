/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pointer to an external resource with an optional hash for verification and change detection
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Rlink#getHref <em>Href</em>}</li>
 *   <li>{@link dsm.TRADES.Rlink#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link dsm.TRADES.Rlink#getHashes <em>Hashes</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getRlink()
 * @model
 * @generated
 */
public interface Rlink extends EObject {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resolvable URI reference to a resource
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see dsm.TRADES.TRADESPackage#getRlink_Href()
	 * @model required="true"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Rlink#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a media type as defined by the Internet Assigned Numbers Authority (IANA)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see dsm.TRADES.TRADESPackage#getRlink_MediaType()
	 * @model
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Rlink#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Hashes</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.Hash}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashes</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getRlink_Hashes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hash> getHashes();

} // Rlink
