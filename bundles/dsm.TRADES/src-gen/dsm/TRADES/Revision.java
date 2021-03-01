/**
 */
package dsm.TRADES;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Revision History Entry
 * 
 * An entry in a sequential list of revisions to the containing document in reverse chronological order (i.e., most recent previous revision first).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Revision#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.TRADES.Revision#getPublished <em>Published</em>}</li>
 *   <li>{@link dsm.TRADES.Revision#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link dsm.TRADES.Revision#getVersion <em>Version</em>}</li>
 *   <li>{@link dsm.TRADES.Revision#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link dsm.TRADES.Revision#getRemark <em>Remark</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getRevision()
 * @model
 * @generated
 */
public interface Revision extends PropertyOwner, AnnotationOwner, LinkOwner {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dsm.TRADES.TRADESPackage#getRevision_Title()
	 * @model dataType="dsm.TRADES.MarkupLine"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Revision#getTitle <em>Title</em>}' attribute.
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
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(Date)
	 * @see dsm.TRADES.TRADESPackage#getRevision_Published()
	 * @model
	 * @generated
	 */
	Date getPublished();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Revision#getPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #getPublished()
	 * @generated
	 */
	void setPublished(Date value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(Date)
	 * @see dsm.TRADES.TRADESPackage#getRevision_LastModified()
	 * @model
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Revision#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Date value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see dsm.TRADES.TRADESPackage#getRevision_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Revision#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oscal Version</em>' attribute.
	 * @see #setOscalVersion(String)
	 * @see dsm.TRADES.TRADESPackage#getRevision_OscalVersion()
	 * @model
	 * @generated
	 */
	String getOscalVersion();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Revision#getOscalVersion <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscal Version</em>' attribute.
	 * @see #getOscalVersion()
	 * @generated
	 */
	void setOscalVersion(String value);

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference.
	 * @see #setRemark(Remark)
	 * @see dsm.TRADES.TRADESPackage#getRevision_Remark()
	 * @model containment="true"
	 * @generated
	 */
	Remark getRemark();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Revision#getRemark <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' containment reference.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(Remark value);

} // Revision
