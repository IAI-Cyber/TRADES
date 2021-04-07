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
import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.OscalElement;
import dsm.oscal.model.OscalMetadata.Property;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Control</h1>
 * <h2>Description</h2>
 * <p>A structured information object representing a security or privacy control. Each security or privacy control within the Catalog is defined by a distinct control instance.</p>
 * <h2>Remarks</h2>
 * <p>Controls may be grouped using <code>group</code>, and controls may be partitioned using <code>part</code> or further enhanced (extended) using <code>control</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getParams <em>Params</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getParts <em>Parts</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getControls <em>Controls</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;control'"
 * @generated
 */
public interface Control extends OscalElement, AnnotationOwner {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Control Identifier</h1>
	 * <h2>Description</h2>
	 * <p>A unique identifier for a specific control instance that can be used to reference the control in other OSCAL documents. This identifier's uniqueness is document scoped and is intended to be consistent for the same control across minor revisions of the document.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Id()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;control.&lt;FlagInstance&gt;id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalog.Control#getId <em>Id</em>}' attribute.
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
	 * <h1>Control Class</h1>
	 * <h2>Description</h2>
	 * <p>A textual label that provides a sub-type or characterization of the control.</p>
	 * <h2>Remarks</h2>
	 * <p>A <code>class</code> can be used in validation rules to express extra constraints over named items of a specific <code>class</code> value.</p>
	 * <p>A <code>class</code> can also be used in an OSCAL profile as a means to target an alteration to control content.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(String)
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Clazz()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;control.&lt;FlagInstance&gt;class'"
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalog.Control#getClazz <em>Clazz</em>}' attribute.
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
	 * <h1>Control Title</h1>
	 * <h2>Description</h2>
	 * <p>A name given to the control, which may be used by a tool for display and navigation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(MarkupLine)
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Title()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;control.&lt;FieldInstance&gt;title'"
	 * @generated
	 */
	MarkupLine getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalog.Control#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLine value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalogCommon.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Params()
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
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Parts()
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
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Links()
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
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Controls()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;control'"
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Props()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property'"
	 * @generated
	 */
	EList<Property> getProps();

} // Control
