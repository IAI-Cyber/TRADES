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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base64</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Base64</h1>
 * <h2>Description</h2>
 * <p>The Base64 alphabet in RFC 2045 - aligned with XSD.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Base64#getFilename <em>Filename</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Base64#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Base64#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBase64()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;base64'"
 * @generated
 */
public interface Base64 extends OscalElement {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>File Name</h1>
	 * <h2>Description</h2>
	 * <p>Name of the file before it was encoded as Base64 to be embedded in a <code>resource</code>. This is the name that will be assigned to the file when the file is decoded.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(URI)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBase64_Filename()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriReferenceType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;base64.&lt;FlagInstance&gt;filename'"
	 * @generated
	 */
	URI getFilename();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Base64#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(URI value);

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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBase64_MediaType()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;base64.&lt;FlagInstance&gt;media-type'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Base64#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(gov.nist.secauto.metaschema.datatypes.Base64)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getBase64_Value()
	 * @model dataType="dsm.oscal.model.OscalMetadata.Base64Type"
	 * @generated
	 */
	gov.nist.secauto.metaschema.datatypes.Base64 getValue();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Base64#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(gov.nist.secauto.metaschema.datatypes.Base64 value);

} // Base64
