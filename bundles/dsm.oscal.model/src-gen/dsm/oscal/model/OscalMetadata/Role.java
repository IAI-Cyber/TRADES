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

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Role</h1>
 * <h2>Description</h2>
 * <p>Defines a function assumed or expected to be assumed by a party in a specific situation.</p>
 * <h2>Remarks</h2>
 * <p>Permissible values to be determined closer to the application (e.g. by a receiving authority).</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Role#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Role#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Role#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Role#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRole()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;role'"
 * @generated
 */
public interface Role extends OscalElement, AnnotationOwner, PropertyOwner, LinkOwner, ElementWithRemarks {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Role Identifier</h1>
	 * <h2>Description</h2>
	 * <p>A unique identifier for a specific role instance. This identifier's uniqueness is document scoped and is intended to be consistent for the same role across minor revisions of the document.</p>
	 * <h2>Remarks</h2>
	 * <p>OSCAL has defined a set of standardized roles for consistant use in OSCAL documents. This allows tools consuming OSCAL content to infer specific semantics when these roles are used. These roles are documented in the specific contexts of their use (e.g., responsible-party, responsible-role). When using such a role, it is necessary to define these roles in this list, which will then allow such a role to be referenced.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRole_Id()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;role.&lt;FlagInstance&gt;id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Role#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Role Title</h1>
	 * <h2>Description</h2>
	 * <p>A name given to the role, which may be used by a tool for display and navigation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(MarkupLine)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRole_Title()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;role.&lt;FieldInstance&gt;title'"
	 * @generated
	 */
	MarkupLine getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Role#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLine value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Role Short Name</h1>
	 * <h2>Description</h2>
	 * <p>A short common name, abbreviation, or acronym for the role.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRole_ShortName()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;role.&lt;FieldInstance&gt;short-name'"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Role#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Role Description</h1>
	 * <h2>Description</h2>
	 * <p>A summary of the role's purpose and associated responsibilities.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(MarkupMultiline)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getRole_Description()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;role.&lt;FieldInstance&gt;description'"
	 * @generated
	 */
	MarkupMultiline getDescription();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Role#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(MarkupMultiline value);

} // Role
