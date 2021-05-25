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

import java.net.URI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Rlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Resource link</h1>
 * <h2>Description</h2>
 * <p>A pointer to an external resource with an optional hash for verification and change detection.</p><h2>Remarks</h2>
 * <p>This construct is different from <code>link</code>, which makes no provision for a hash or formal title.</p>
 * <p>Multiple <code>rlink</code> can be included for a resource. In such a case, all provided <code>rlink</code> items are intended to be equivalent in content, but may differ in structure. A <code>media-type</code> is used to identify the format of a given rlink, and can be used to differentiate a items in a collection of rlinks. The <code>media-type</code> also provides a hint to the OSCAL document consumer about the structure of the resource referenced by the <code>rlink</code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ResourceRlink#getEHref <em>EHref</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ResourceRlink#getHashes <em>Hashes</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ResourceRlink#getMediaType <em>Media Type</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResourceRlink()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;rlink'"
 * @generated
 */
public interface ResourceRlink extends OscalElement {
	/**
	 * Returns the value of the '<em><b>EHref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Hypertext Reference</h1>
	 * <h2>Description</h2>
	 * <p>A resolvable URI reference to a resource.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EHref</em>' attribute.
	 * @see #setEHref(URI)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResourceRlink_EHref()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriReferenceType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;rlink.&lt;FlagInstance&gt;href'"
	 * @generated
	 */
	URI getEHref();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.ResourceRlink#getEHref <em>EHref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EHref</em>' attribute.
	 * @see #getEHref()
	 * @generated
	 */
	void setEHref(URI value);

	/**
	 * Returns the value of the '<em><b>Hashes</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Hash}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashes</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResourceRlink_Hashes()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;hash'"
	 * @generated
	 */
	EList<Hash> getHashes();

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Media Type</h1>
	 * <h2>Description</h2>
	 * <p>Specifies a media type as defined by the Internet Assigned Numbers Authority (IANA) <a href="https://www.iana.org/assignments/media-types/media-types.xhtml">Media Types Registry</a>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResourceRlink_MediaType()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;rlink.&lt;FlagInstance&gt;media-type'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.ResourceRlink#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

} // ResourceRlink
