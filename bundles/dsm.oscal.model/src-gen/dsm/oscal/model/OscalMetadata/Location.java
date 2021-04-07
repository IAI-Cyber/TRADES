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

import java.net.URI;

import java.util.UUID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Location</h1>
 * <h2>Description</h2>
 * <p>A location, with associated metadata that can be referenced.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getEmailAddresses <em>Email Addresses</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getUrls <em>Urls</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getAddress <em>Address</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Location#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;location'"
 * @generated
 */
public interface Location extends OscalElement {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Location Universally Unique Identifier</h1>
	 * <h2>Description</h2>
	 * <p>A unique identifier that can be used to reference this defined location elsewhere in an OSCAL document. A UUID should be consistantly used for a given location across revisions of the document.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(UUID)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_Uuid()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UuidType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;location.&lt;FlagInstance&gt;uuid'"
	 * @generated
	 */
	UUID getUuid();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Location#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(UUID value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Location Title</h1>
	 * <h2>Description</h2>
	 * <p>A name given to the location, which may be used by a tool for display and navigation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(MarkupLine)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_Title()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;location.&lt;FieldInstance&gt;title'"
	 * @generated
	 */
	MarkupLine getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Location#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLine value);

	/**
	 * Returns the value of the '<em><b>Email Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Email Address</h1>
	 * <h2>Description</h2>
	 * <p>An email address as defined by <a href="https://tools.ietf.org/html/rfc5322#section-3.4.1">RFC 5322 Section 3.4.1</a>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email Addresses</em>' attribute list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_EmailAddresses()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;location.&lt;FieldInstance&gt;email-address'"
	 * @generated
	 */
	EList<String> getEmailAddresses();

	/**
	 * Returns the value of the '<em><b>Urls</b></em>' attribute list.
	 * The list contents are of type {@link java.net.URI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Location URL</h1>
	 * <h2>Description</h2>
	 * <p>The uniform resource locator (URL) for a web site or Internet presence associated with the location.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Urls</em>' attribute list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_Urls()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;location.&lt;FieldInstance&gt;url'"
	 * @generated
	 */
	EList<URI> getUrls();

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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_Remarks()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;location.&lt;FieldInstance&gt;remarks'"
	 * @generated
	 */
	MarkupMultiline getRemarks();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Location#getRemarks <em>Remarks</em>}' attribute.
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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_Annotations()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;annotation'"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_Address()
	 * @model containment="true" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;address'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Location#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_Links()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;link'"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Telephone Numbers</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.TelephoneNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Numbers</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_TelephoneNumbers()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;telephone-number'"
	 * @generated
	 */
	EList<TelephoneNumber> getTelephoneNumbers();

	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLocation_Props()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property'"
	 * @generated
	 */
	EList<Property> getProps();

} // Location
