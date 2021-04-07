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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Document Identifier</h1>
 * <h2>Description</h2>
 * <p>A document identifier qualified by an identifier <code>type</code>.</p>
 * <h2>Remarks</h2>
 * <p>A document identifier or name, qualified by a <code>type</code> that indicates the naming system of the identifier. A document identifier may provide a hint to the persistent location of <q>the same</q> or <q>another version</q> of the document.</p>
 * <p>Specific usage rules, nomenclatures, and recognized file types (e.g., DOIs, CMS locators, etc.) may be defined at application level. The value of this field may also be a hash or checksum.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.DocumentId#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.DocumentId#getScheme <em>Scheme</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getDocumentId()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;document-id'"
 * @generated
 */
public interface DocumentId extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getDocumentId_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.DocumentId#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Document Identification Scheme</h1>
	 * <h2>Description</h2>
	 * <p>Qualifies the kind of document identifier.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(URI)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getDocumentId_Scheme()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;document-id.&lt;FlagInstance&gt;scheme'"
	 * @generated
	 */
	URI getScheme();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.DocumentId#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(URI value);

} // DocumentId
