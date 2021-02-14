/**
 */
package dsm.TRADES;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides information about the publication and availability of the containing document.
 * 
 * This element appears inside catalog.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.metadata#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.TRADES.metadata#getPublished <em>Published</em>}</li>
 *   <li>{@link dsm.TRADES.metadata#getVersion <em>Version</em>}</li>
 *   <li>{@link dsm.TRADES.metadata#getOscalVersion <em>Oscal Version</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getmetadata()
 * @model
 * @generated
 */
public interface metadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name given to the document, which may be used by a tool for display and navigation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dsm.TRADES.TRADESPackage#getmetadata_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dsm.TRADES.metadata#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time the document was published. The date-time value must be formatted according to RFC 3339 with full time and time zone included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(Date)
	 * @see dsm.TRADES.TRADESPackage#getmetadata_Published()
	 * @model
	 * @generated
	 */
	Date getPublished();

	/**
	 * Sets the value of the '{@link dsm.TRADES.metadata#getPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #getPublished()
	 * @generated
	 */
	void setPublished(Date value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string used to distinguish the current version of the document from other previous (and future) versions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see dsm.TRADES.TRADESPackage#getmetadata_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dsm.TRADES.metadata#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Oscal Version</b></em>' attribute.
	 * The default value is <code>"1.0.0-rc1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscal Version</em>' attribute.
	 * @see #setOscalVersion(String)
	 * @see dsm.TRADES.TRADESPackage#getmetadata_OscalVersion()
	 * @model default="1.0.0-rc1"
	 * @generated
	 */
	String getOscalVersion();

	/**
	 * Sets the value of the '{@link dsm.TRADES.metadata#getOscalVersion <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscal Version</em>' attribute.
	 * @see #getOscalVersion()
	 * @generated
	 */
	void setOscalVersion(String value);

} // metadata
