/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.model.OscalMetadata;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Publication metadata</h1>
 * <h2>Description</h2>
 * <p>Provides information about the publication and availability of the containing document.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getDocumentIds <em>Document Ids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getLocations <em>Locations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getParties <em>Parties</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getPublished <em>Published</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getResponsibleParties <em>Responsible Parties</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getRoles <em>Roles</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Metadata#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;metadata'"
 * @generated
 */
public interface Metadata extends OscalElement, PropertyOwner, LinkOwner, ElementWithRemarks {
	/**
	 * Returns the value of the '<em><b>Document Ids</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.DocumentId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Ids</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_DocumentIds()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;document-id'"
	 * @generated
	 */
	EList<DocumentId> getDocumentIds();

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Last Modified Timestamp</h1>
	 * <h2>Description</h2>
	 * <p>The date and time the document was last modified. The date-time value must be formatted according to <a href="https://tools.ietf.org/html/rfc3339">RFC 3339</a> with full time and time zone included.</p>
	 * <h2>Remarks</h2>
	 * <p>This value represents the point in time when the OSCAL document was last updated, or at the point of creation the creation date. Typically, this date value will be machine generated at time of creation or modification.</p>
	 * <p>In some cases, an OSCAL document may be derived from some source material in a different format. In such a case, the <code>last-modified</code> value should indicate the modification time of the OSCAL document, not the source material.</p>
	 * <p>A publisher of OSCAL content can use this data point along with its siblings <code>published</code> and <code>version</code> to establish a sequence of successive revisions of a given OSCAL-based publication. The metadata for previous revisions can be represented as a <code>revision</code> in this object.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(ZonedDateTime)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_LastModified()
	 * @model dataType="dsm.oscal.model.OscalMetadata.DateTimeWithTzType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;metadata.&lt;FieldInstance&gt;last-modified'"
	 * @generated
	 */
	ZonedDateTime getLastModified();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Metadata#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_Locations()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;location'"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>OSCAL version</h1>
	 * <h2>Description</h2>
	 * <p>The OSCAL model version the document was authored against.</p>
	 * <h2>Remarks</h2>
	 * <p>Indicates the version of the OSCAL model to which this data set conforms, for example <q>1.1.0</q> or <q>1.0.0-M1</q>. That can be used as a hint by a tool to indicate which version of the OSCAL XML or JSON schema to use for validation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oscal Version</em>' attribute.
	 * @see #setOscalVersion(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_OscalVersion()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;metadata.&lt;FieldInstance&gt;oscal-version'"
	 * @generated
	 */
	String getOscalVersion();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Metadata#getOscalVersion <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscal Version</em>' attribute.
	 * @see #getOscalVersion()
	 * @generated
	 */
	void setOscalVersion(String value);

	/**
	 * Returns the value of the '<em><b>Parties</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Party}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_Parties()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;party'"
	 * @generated
	 */
	EList<Party> getParties();

	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Publication Timestamp</h1>
	 * <h2>Description</h2>
	 * <p>The date and time the document was published. The date-time value must be formatted according to <a href="https://tools.ietf.org/html/rfc3339">RFC 3339</a> with full time and time zone included.</p>
	 * <h2>Remarks</h2>
	 * <p>This value represents the point in time when the OSCAL document was published. Typically, this date value will be machine generated at the time the containing document is published.</p>
	 * <p>In some cases, an OSCAL document may be derived from some source material in a different format. In such a case, the <code>published</code> value should indicate when the OSCAL document was published, not the source material. Where necessary, the publication date of the original source material can be captured as a named property or custom metadata construct.</p>
	 * <p>A publisher of OSCAL content can use this data point along with its siblings <code>last-modified</code> and <code>version</code> to establish a sequence of successive revisions of a given OSCAL-based publication. The metadata for previous revisions can be represented as a <code>revision</code> in this object.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(ZonedDateTime)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_Published()
	 * @model dataType="dsm.oscal.model.OscalMetadata.DateTimeWithTzType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;metadata.&lt;FieldInstance&gt;published'"
	 * @generated
	 */
	ZonedDateTime getPublished();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Metadata#getPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #getPublished()
	 * @generated
	 */
	void setPublished(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Responsible Parties</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.ResponsibleParty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Parties</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_ResponsibleParties()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;responsible-party'"
	 * @generated
	 */
	EList<ResponsibleParty> getResponsibleParties();

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Revision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_Revisions()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;revision'"
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_Roles()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;role'"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Document Title</h1>
	 * <h2>Description</h2>
	 * <p>A name given to the document, which may be used by a tool for display and navigation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(MarkupLine)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_Title()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;metadata.&lt;FieldInstance&gt;title'"
	 * @generated
	 */
	MarkupLine getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Metadata#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLine value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Document Version</h1>
	 * <h2>Description</h2>
	 * <p>A string used to distinguish the current version of the document from other previous (and future) versions.</p>
	 * <h2>Remarks</h2>
	 * <p>A version string may be a release number, sequence number, date, or other identifier suffcient to distinguish between different document versions. This version is typically set by the document owner or by the tool used to maintain the content.</p>
	 * <p>While not required, it is recommended that OSCAL content authors use <a href="https://semver.org/spec/v2.0.0.html">Semantic Versioning</a> as a format for version strings. This allows for the easy identification of a version tree consisting of major, minor, and patch numbers.</p>
	 * <p>A publisher of OSCAL content can use this data point along with its siblings <code>published</code> and <code>last-modified</code> to establish a sequence of successive revisions of a given OSCAL-based publication. The metadata for previous revisions can be represented as a <code>revision</code> in this object.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getMetadata_Version()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;metadata.&lt;FieldInstance&gt;version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Metadata#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Metadata
