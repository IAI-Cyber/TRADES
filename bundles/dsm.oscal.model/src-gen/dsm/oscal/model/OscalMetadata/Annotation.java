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

import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import java.net.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Annotated Property</h1>
 * <h2>Description</h2>
 * <p>An attribute, characteristic, or quality of the containing object expressed as a namespace qualified name/value pair with optional explanatory remarks. The value of an annotated property is a simple scalar value.</p>
 * <h2>Remarks</h2>
 * <p>Annotated property and property have a similar model. Both permit the deployment and management of arbitrary controlled values, within OSCAL objects. Similar to a property, an annotated property can be included for any purpose useful to an application or implementation. Typically, annotated properties will be used to sort, filter, select, order, and arrange OSCAL content objects, to relate OSCAL objects to one another, or to associate an OSCAL object to class hierarchies, taxonomies, or external authorities. Thus, the lexical composition of annotated properties may be constrained by external processes to ensure consistency.</p>
 * <p>Unlike a property, an annotated property allows for associated remarks that describe why the specific annotation value was applied to the containing object, or the significance of the annotation value in the context of the containing object.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Annotation#getName <em>Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Annotation#getNs <em>Ns</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Annotation#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Annotation#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAnnotation()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;annotation'"
 * @generated
 */
public interface Annotation extends OscalElement, UUIDElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Annotated Property Name</h1>
	 * <h2>Description</h2>
	 * <p>A textual label that uniquely identifies a specific attribute, characteristic, or quality of the annotated property's containing object.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAnnotation_Name()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;annotation.&lt;FlagInstance&gt;name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Annotation#getName <em>Name</em>}' attribute.
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
	 * <h1>Annotated Property Namespace</h1>
	 * <h2>Description</h2>
	 * <p>A namespace qualifying the annotated property's name. This allows different organizations to associate distinct semantics with the same name.</p>
	 * <h2>Remarks</h2>
	 * <p>Provides a means to segment the value space for the <code>name</code>, so that different organizations and individuals can assert control over the allowed names and associated values used in an annotated property. This allows the semantics associated with a given name/value pair to be defined on an organization-by-organization basis.</p>
	 * <p>An organization MUST use a URI that they have control over. e.g., a domain registered to the organization in a URI, a registered uniform resource names (URN) namespace.</p>
	 * <p>When a <code>ns</code> is not provided, its value should be assumed to be <code>http://csrc.nist.gov/ns/oscal</code> and the name should be a name defined by the associated OSCAL model.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns</em>' attribute.
	 * @see #setNs(URI)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAnnotation_Ns()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;annotation.&lt;FlagInstance&gt;ns'"
	 * @generated
	 */
	URI getNs();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Annotation#getNs <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' attribute.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(URI value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Annotated Property Value</h1>
	 * <h2>Description</h2>
	 * <p>Indicates the value of the attribute, characteristic, or quality.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAnnotation_Value()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;annotation.&lt;FlagInstance&gt;value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Annotation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAnnotation_Remarks()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;annotation.&lt;FieldInstance&gt;remarks'"
	 * @generated
	 */
	MarkupMultiline getRemarks();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Annotation#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultiline value);

} // Annotation
