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
 * A representation of the model object '<em><b>Document Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>document-id</h1>
 * <h2>Description</h2>
 * <p>A document identifier qualified by an identifier <code>scheme</code>. A document identifier provides a globally unique identifier for a group of documents that are to be treated as different versions of the same document. If this element does not appear, or if the value of this element is empty, the value of <q>document-id</q> is equal to the value of the <q>uuid</q> flag of the top-level root element.</p><h2>Remarks</h2>
 * <p>This element is optional, but it will always have a valid value, as if it is missing the value of <q>document-id</q> is assumed to be equal to the UUID of the root. This requirement allows for document creators to retroactively link an update to the original version, by providing a document-id on the new document that is equal to the uuid of the original document.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.DocumentId#getScheme <em>Scheme</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getDocumentId()
 * @model
 * @generated
 */
public interface DocumentId extends OscalElement, ElementWithValue {
	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>scheme</h1>
	 * <h2>Description</h2>
	 * <p>Qualifies the kind of document identifier using a URI. If the scheme is not provided the value of the element will be interpreted as a string of characters.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(URI)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getDocumentId_Scheme()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriType"
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
