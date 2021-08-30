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

import java.net.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>link</h1>
 * <h2>Description</h2>
 * <p>A reference to a local or remote resource</p><h2>Remarks</h2>
 * <p>To provide a cryptographic hash for a remote target resource, a local reference to a back matter <code>resource</code> is needed. The resource allows one or more hash values to be provided using the <code>rlink/hash</code> object.</p>
 * <p>The OSCAL <code>link</code> is a roughly based on the HTML <a href="https://www.w3.org/TR/html401/struct/links.html#edef-LINK">link element</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Link#getEHref <em>EHref</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Link#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Link#getRel <em>Rel</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Link#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends OscalElement {
	/**
	 * Returns the value of the '<em><b>EHref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>href</h1>
	 * <h2>Description</h2>
	 * <p>A resolvable URL reference to a resource.</p><h2>Remarks</h2>
	 * <p>The value of the <code>href</code> can be an internet resource, or a local reference using a fragment e.g. #fragment that points to a <code>back-matter</code>
	 * <code>resource</code> in the same document.</p>
	 * <p>If a local reference using a fragment is used, this will be indicated by a fragment <q>#</q> followed by an identifier which references an identified <code>resource</code> in the document's <code>back-matter</code> or another object that is within the scope of the containing OSCAL document.</p>
	 * <p>If an internet resource is used, the <code>href</code> value will be an absolute or relative URI pointing to the location of the referenced resource. A relative URI will be resolved relative to the location of the document containing the link.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EHref</em>' attribute.
	 * @see #setEHref(URI)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLink_EHref()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriReferenceType" required="true"
	 * @generated
	 */
	URI getEHref();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Link#getEHref <em>EHref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EHref</em>' attribute.
	 * @see #getEHref()
	 * @generated
	 */
	void setEHref(URI value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>media-type</h1>
	 * <h2>Description</h2>
	 * <p>Specifies a media type as defined by the Internet Assigned Numbers Authority (IANA) <a href="https://www.iana.org/assignments/media-types/media-types.xhtml">Media Types Registry</a>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLink_MediaType()
	 * @model
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Link#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>rel</h1>
	 * <h2>Description</h2>
	 * <p>Describes the type of relationship provided by the link. This can be an indicator of the link's purpose.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLink_Rel()
	 * @model
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Link#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>text</h1>
	 * <h2>Description</h2>
	 * <p>A textual label to associate with the link, which may be used for presentation in a tool.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(MarkupLine)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getLink_Text()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType"
	 * @generated
	 */
	MarkupLine getText();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Link#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(MarkupLine value);

} // Link
