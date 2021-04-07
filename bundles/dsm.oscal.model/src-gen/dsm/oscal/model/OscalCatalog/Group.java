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
package dsm.oscal.model.OscalCatalog;

import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalCatalogCommon.Part;

import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.Property;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Control Group</h1>
 * <h2>Description</h2>
 * <p>A group of controls, or of groups of controls.</p>
 * <h2>Remarks</h2>
 * <p>Catalogs can use a <code>group</code> to collect related controls into a single grouping. That can be useful to group controls into a family or other logical grouping.</p>
 * <p>A <code>group</code> may have its own properties, statements, parameters, and references, which are inherited by all members of that group.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getParams <em>Params</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getParts <em>Parts</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getControls <em>Controls</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getGroups <em>Groups</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Group#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;group'"
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Group Identifier</h1>
	 * <h2>Description</h2>
	 * <p>A unique identifier for a specific group instance that can be used to reference the group within this and in other OSCAL documents. This identifier's uniqueness is document scoped and is intended to be consistent for the same group across minor revisions of the document.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Id()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;group.&lt;FlagInstance&gt;id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalog.Group#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Group Class</h1>
	 * <h2>Description</h2>
	 * <p>A textual label that provides a sub-type or characterization of the group.</p>
	 * <h2>Remarks</h2>
	 * <p>A <code>class</code> can be used in validation rules to express extra constraints over named items of a specific <code>class</code> value.</p>
	 * <p>A <code>class</code> can also be used in an OSCAL profile as a means to target an alteration to control content.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(String)
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Clazz()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;group.&lt;FlagInstance&gt;class'"
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalog.Group#getClazz <em>Clazz</em>}' attribute.
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
	 * <h1>Group Title</h1>
	 * <h2>Description</h2>
	 * <p>A name given to the group, which may be used by a tool for display and navigation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(MarkupLine)
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Title()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;group.&lt;FieldInstance&gt;title'"
	 * @generated
	 */
	MarkupLine getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalog.Group#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLine value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Annotations()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;annotation'"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalogCommon.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Params()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter'"
	 * @generated
	 */
	EList<Parameter> getParams();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalogCommon.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Parts()
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
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Links()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;link'"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalog.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Controls()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;control'"
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalog.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Groups()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;group'"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getGroup_Props()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property'"
	 * @generated
	 */
	EList<Property> getProps();

} // Group
