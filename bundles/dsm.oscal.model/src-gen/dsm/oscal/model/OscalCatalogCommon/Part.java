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
package dsm.oscal.model.OscalCatalogCommon;

import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.OscalElement;
import dsm.oscal.model.OscalMetadata.Property;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import java.net.URI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Part</h1>
 * <h2>Description</h2>
 * <p>A partition of a control's definition or a child of another part.</p>
 * <h2>Remarks</h2>
 * <p>A <code>part</code> provides for logical partitioning of prose, and can be thought of as a grouping structure (e.g., section). A <code>part</code> can have child parts allowing for arbitrary nesting of prose content (e.g., statement hierarchy). A <code>part</code> can contain <code>prop</code> objects that allow for enriching prose text with structured name/value information.</p>
 * <p>A <code>part</code> can be assigned an optional <code>id</code>, which allows for internal and external references to the textual concept contained within a <code>part</code>. A <code>id</code> provides a means for an OSCAL profile, or a higher layer OSCAL model to reference a specific part within a <code>catalog</code>. For example, an <code>id</code> can be used to reference or to make modifications to a control statement in a profile.</p>
 * <p>Use of <code>part</code> and <code>prop</code> provides for a wide degree of extensibility within the OSCAL catalog model. The optional <code>ns</code> provides a means to qualify a part's <code>name</code>, allowing for organization-specific vocabularies to be defined with clear semantics. Any organization that extends OSCAL in this way should consistently assign a <code>ns</code> value that represents the organization, making a given namespace qualified <code>name</code> unique to that organization. This allows the combination of <code>ns</code> and <code>name</code> to always be unique and unambiguous, even when mixed with extensions from other organizations. Each organization is responsible for governance of their own extensions, and is strongly encouraged to publish their extensions as standards to their user community. If no <code>ns</code> is provided, the name is expected to be in the <q>OSCAL</q> namespace.</p>
 * <p>To ensure a <code>ns</code> is unique to an organization and naming conflicts are avoided, a URI containing a DNS or other globally defined organization name should be used. For example, if FedRAMP and DoD both extend OSCAL, FedRAMP will use the <code>ns</code> <q>https://fedramp.gov</q>, while DoD will use the <code>ns</code> <q>https://defense.gov</q> for any organization specific <code>name</code>.</p>
 * <p>Tools that process OSCAL content are not required to interpret unrecognized OSCAL extensions; however, OSCAL-compliant tools should not modify or remove unrecognized extensions, unless there is a compelling reason to do so, such as data sensitivity.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getName <em>Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getNs <em>Ns</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getProse <em>Prose</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getParts <em>Parts</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Part#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;part'"
 * @generated
 */
public interface Part extends OscalElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Part Identifier</h1>
	 * <h2>Description</h2>
	 * <p>A unique identifier for a specific part instance. This identifier's uniqueness is document scoped and is intended to be consistent for the same part across minor revisions of the document.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Id()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;part.&lt;FlagInstance&gt;id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Part#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Part Name</h1>
	 * <h2>Description</h2>
	 * <p>A textual label that uniquely identifies the part's semantic type.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Name()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;part.&lt;FlagInstance&gt;name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Part#getName <em>Name</em>}' attribute.
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
	 * <h1>Part Namespace</h1>
	 * <h2>Description</h2>
	 * <p>A namespace qualifying the part's name. This allows different organizations to associate distinct semantics with the same name.</p>
	 * <h2>Remarks</h2>
	 * <p>Provides a means to segment the value space for the <code>name</code>, so that different organizations and individuals can assert control over the allowed names and associated text used in a part. This allows the semantics associated with a given name to be defined on an organization-by-organization basis.</p>
	 * <p>An organization MUST use a URI that they have control over. e.g., a domain registered to the organization in a URI, a registered uniform resource names (URN) namespace.</p>
	 * <p>When a <code>ns</code> is not provided, its value should be assumed to be <code>http://csrc.nist.gov/ns/oscal</code> and the name should be a name defined by the associated OSCAL model.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns</em>' attribute.
	 * @see #setNs(URI)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Ns()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UriType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;part.&lt;FlagInstance&gt;ns'"
	 * @generated
	 */
	URI getNs();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Part#getNs <em>Ns</em>}' attribute.
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
	 * <h1>Part Class</h1>
	 * <h2>Description</h2>
	 * <p>A textual label that provides a sub-type or characterization of the part's <code>name</code>. This can be used to further distinguish or discriminate between the semantics of multiple parts of the same control with the same <code>name</code> and <code>ns</code>.</p>
	 * <h2>Remarks</h2>
	 * <p>A <code>class</code> can be used in validation rules to express extra constraints over named items of a specific <code>class</code> value.</p>
	 * <p>A <code>class</code> can also be used in an OSCAL profile as a means to target an alteration to control content.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(String)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Clazz()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;part.&lt;FlagInstance&gt;class'"
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Part#getClazz <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' attribute.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Part Title</h1>
	 * <h2>Description</h2>
	 * <p>A name given to the part, which may be used by a tool for display and navigation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(MarkupLine)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Title()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;part.&lt;FieldInstance&gt;title'"
	 * @generated
	 */
	MarkupLine getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Part#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLine value);

	/**
	 * Returns the value of the '<em><b>Prose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Part Text</h1>
	 * <h2>Description</h2>
	 * <p>Permits multiple paragraphs, lists, tables etc.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prose</em>' attribute.
	 * @see #setProse(MarkupMultiline)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Prose()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;part.&lt;FieldInstance&gt;prose'"
	 * @generated
	 */
	MarkupMultiline getProse();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Part#getProse <em>Prose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prose</em>' attribute.
	 * @see #getProse()
	 * @generated
	 */
	void setProse(MarkupMultiline value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Annotations()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;annotation'"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalogCommon.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Parts()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;part'"
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Links()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;link'"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getPart_Props()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property'"
	 * @generated
	 */
	EList<Property> getProps();

} // Part
