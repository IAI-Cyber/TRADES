/**
 */
package dsm.oscal.model.Oscal;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides information about the publication and availability of the containing document
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getPublished <em>Published</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getVersion <em>Version</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getRoles <em>Roles</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getRevision <em>Revision</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getLocations <em>Locations</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getParties <em>Parties</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getResponsibleParties <em>Responsible Parties</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getRemark <em>Remark</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Metadata#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends AnnotationOwner, LinkOwner, PropertyOwner {
	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(Date)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_Published()
	 * @model
	 * @generated
	 */
	Date getPublished();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Metadata#getPublished <em>Published</em>}' attribute.
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
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_LastModified()
	 * @model required="true"
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Metadata#getLastModified <em>Last Modified</em>}' attribute.
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
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Metadata#getVersion <em>Version</em>}' attribute.
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
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_OscalVersion()
	 * @model required="true"
	 * @generated
	 */
	String getOscalVersion();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Metadata#getOscalVersion <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscal Version</em>' attribute.
	 * @see #getOscalVersion()
	 * @generated
	 */
	void setOscalVersion(String value);

	/**
	 * Returns the value of the '<em><b>Document Id</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.DocumentId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Id</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_DocumentId()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentId> getDocumentId();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' containment reference.
	 * @see #setRevision(Revisions)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_Revision()
	 * @model containment="true"
	 * @generated
	 */
	Revisions getRevision();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Metadata#getRevision <em>Revision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' containment reference.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Revisions value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Parties</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Party}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_Parties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Party> getParties();

	/**
	 * Returns the value of the '<em><b>Responsible Parties</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.ResponsibleParty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Parties</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_ResponsibleParties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResponsibleParty> getResponsibleParties();

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference.
	 * @see #setRemark(Remark)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_Remark()
	 * @model containment="true"
	 * @generated
	 */
	Remark getRemark();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Metadata#getRemark <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' containment reference.
	 * @see #getRemark()
	 * @generated
	 */
	void setRemark(Remark value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMetadata_Title()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupLine" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Metadata#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Metadata
