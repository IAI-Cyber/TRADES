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
 * A representation of the model object '<em><b>External Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>external-id</h1>
 * <h2>Description</h2>
 * <p>An identifier for a person or organization using a designated scheme. e.g. an Open Researcher and Contributor ID (ORCID)</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ExternalId#getScheme <em>Scheme</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getExternalId()
 * @model
 * @generated
 */
public interface ExternalId extends OscalElement, ElementWithValue {
	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>scheme</h1>
	 * <h2>Description</h2>
	 * <p>Indicates the type of external identifier.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(URI)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getExternalId_Scheme()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriType" required="true"
	 * @generated
	 */
	URI getScheme();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.ExternalId#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(URI value);

} // ExternalId
