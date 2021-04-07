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
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Revision History Entry</h1>
 * <h2>Description</h2>
 * <p>An entry in a sequential list of revisions to the containing document in reverse chronological order (i.e., most recent previous revision first).</p>
 * <h2>Remarks</h2>
 * <p>While <code>published</code>, <code>last-modified</code>, <code>oscal-version</code>, and <code>version</code> are not required, values for these entries should be provided if the information is known. For a revision entry to be considered valid, at least one of the following items must be provided: <code>published</code>, <code>last-modified</code>, <code>version</code>, or a <code>link</code> with a <code>rel</code> of <q>source</q>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Revision#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Revision#getPublished <em>Published</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Revision#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Revision#getVersion <em>Version</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Revision#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Revision#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Revision#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Revision#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Revision#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;revision'"
 * @generated
 */
public interface Revision extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Document Title</h1>
	 * <h2>Description</h2>
	 * <p>A name given to the document revision, which may be used by a tool for display and navigation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(MarkupLine)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision_Title()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;revision.&lt;FieldInstance&gt;title'"
	 * @generated
	 */
	MarkupLine getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Revision#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLine value);

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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision_Published()
	 * @model dataType="dsm.oscal.model.OscalMetadata.DateTimeWithTzType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;revision.&lt;FieldInstance&gt;published'"
	 * @generated
	 */
	ZonedDateTime getPublished();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Revision#getPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #getPublished()
	 * @generated
	 */
	void setPublished(ZonedDateTime value);

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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision_LastModified()
	 * @model dataType="dsm.oscal.model.OscalMetadata.DateTimeWithTzType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;revision.&lt;FieldInstance&gt;last-modified'"
	 * @generated
	 */
	ZonedDateTime getLastModified();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Revision#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(ZonedDateTime value);

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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision_Version()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;revision.&lt;FieldInstance&gt;version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Revision#getVersion <em>Version</em>}' attribute.
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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision_OscalVersion()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;revision.&lt;FieldInstance&gt;oscal-version'"
	 * @generated
	 */
	String getOscalVersion();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Revision#getOscalVersion <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oscal Version</em>' attribute.
	 * @see #getOscalVersion()
	 * @generated
	 */
	void setOscalVersion(String value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Remarks</h1>
	 * <h2>Description</h2>
	 * <p>Additional commentary on the containing object.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(MarkupMultiline)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision_Remarks()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;revision.&lt;FieldInstance&gt;remarks'"
	 * @generated
	 */
	MarkupMultiline getRemarks();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Revision#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultiline value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision_Annotations()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;annotation'"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision_Links()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;link'"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRevision_Props()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property'"
	 * @generated
	 */
	EList<Property> getProps();

} // Revision
