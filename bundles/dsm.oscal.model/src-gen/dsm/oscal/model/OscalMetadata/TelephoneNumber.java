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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Telephone Number</h1>
 * <h2>Description</h2>
 * <p>Contact number by telephone.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.TelephoneNumber#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.TelephoneNumber#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getTelephoneNumber()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;telephone-number'"
 * @generated
 */
public interface TelephoneNumber extends OscalElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getTelephoneNumber_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.TelephoneNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>type flag</h1>
	 * <h2>Description</h2>
	 * <p>Indicates the type of phone number.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getTelephoneNumber_Type()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;telephone-number.&lt;FlagInstance&gt;type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.TelephoneNumber#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // TelephoneNumber
