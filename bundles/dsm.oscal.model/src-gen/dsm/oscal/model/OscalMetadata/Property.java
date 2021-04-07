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

import java.util.UUID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Property</h1>
 * <h2>Description</h2>
 * <p>An attribute, characteristic, or quality of the containing object expressed as a namespace qualified name/value pair. The value of a property is a simple scalar value, which may be expressed as a list of values in some OSCAL formats.</p>
 * <h2>Remarks</h2>
 * <p>Properties permit the deployment and management of arbitrary controlled values, within OSCAL objects. A property can be included for any purpose useful to an application or implementation. Typically, properties will be used to sort, filter, select, order, and arrange OSCAL content objects, to relate OSCAL objects to one another, or to associate an OSCAL object to class hierarchies, taxonomies, or external authorities. Thus, the lexical composition of properties may be constrained by external processes to ensure consistency.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Property#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Property#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Property#getName <em>Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Property#getNs <em>Ns</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Property#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getProperty()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property'"
 * @generated
 */
public interface Property extends OscalElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getProperty_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Property Universally Unique Identifier</h1>
	 * <h2>Description</h2>
	 * <p>A unique identifier that can be used to reference this property elsewhere in an OSCAL document. A UUID should be consistantly used for a given location across revisions of the document.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(UUID)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getProperty_Uuid()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UuidType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property.&lt;FlagInstance&gt;uuid'"
	 * @generated
	 */
	UUID getUuid();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Property#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(UUID value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Property Name</h1>
	 * <h2>Description</h2>
	 * <p>A textual label that uniquely identifies a specific attribute, characteristic, or quality of the property's containing object.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getProperty_Name()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property.&lt;FlagInstance&gt;name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Property Namespace</h1>
	 * <h2>Description</h2>
	 * <p>A namespace qualifying the property's name. This allows different organizations to associate distinct semantics with the same name.</p>
	 * <h2>Remarks</h2>
	 * <p>Provides a means to segment the value space for the <code>name</code>, so that different organizations and individuals can assert control over the allowed names and associated values used in a property. This allows the semantics associated with a given name/value pair to be defined on an organization-by-organization basis.</p>
	 * <p>An organization MUST use a URI that they have control over. e.g., a domain registered to the organization in a URI, a registered uniform resource names (URN) namespace.</p>
	 * <p>When a <code>ns</code> is not provided, its value should be assumed to be <code>http://csrc.nist.gov/ns/oscal</code> and the name should be a name defined by the associated OSCAL model.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns</em>' attribute.
	 * @see #setNs(URI)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getProperty_Ns()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property.&lt;FlagInstance&gt;ns'"
	 * @generated
	 */
	URI getNs();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Property#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(URI value);

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Property Class</h1>
	 * <h2>Description</h2>
	 * <p>A textual label that provides a sub-type or characterization of the property's <code>name</code>. This can be used to further distinguish or discriminate between the semantics of multiple properties of the same object with the same <code>name</code> and <code>ns</code>.</p>
	 * <h2>Remarks</h2>
	 * <p>A <code>class</code> can be used in validation rules to express extra constraints over named items of a specific <code>class</code> value.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getProperty_Clazz()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property.&lt;FlagInstance&gt;class'"
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Property#getClazz <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' attribute.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(String value);

} // Property
