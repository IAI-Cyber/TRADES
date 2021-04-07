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

import java.util.UUID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsible Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Responsible Role</h1>
 * <h2>Description</h2>
 * <p>A reference to one or more roles with responsibility for performing a function relative to the containing object.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ResponsibleRole#getRoleId <em>Role Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ResponsibleRole#getPartyUuids <em>Party Uuids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ResponsibleRole#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ResponsibleRole#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ResponsibleRole#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResponsibleRole()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;responsible-role'"
 * @generated
 */
public interface ResponsibleRole extends OscalElement, AnnotationOwner {
	/**
	 * Returns the value of the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Responsible Role ID</h1>
	 * <h2>Description</h2>
	 * <p>The role that is responsible for the business function.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Id</em>' attribute.
	 * @see #setRoleId(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResponsibleRole_RoleId()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;responsible-role.&lt;FlagInstance&gt;role-id'"
	 * @generated
	 */
	String getRoleId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.ResponsibleRole#getRoleId <em>Role Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Id</em>' attribute.
	 * @see #getRoleId()
	 * @generated
	 */
	void setRoleId(String value);

	/**
	 * Returns the value of the '<em><b>Party Uuids</b></em>' attribute list.
	 * The list contents are of type {@link java.util.UUID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Party Reference</h1>
	 * <h2>Description</h2>
	 * <p>References a <code>party</code> defined in <code>metadata</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Party Uuids</em>' attribute list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResponsibleRole_PartyUuids()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UuidType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;responsible-role.&lt;FieldInstance&gt;party-uuid'"
	 * @generated
	 */
	EList<UUID> getPartyUuids();

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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResponsibleRole_Remarks()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;responsible-role.&lt;FieldInstance&gt;remarks'"
	 * @generated
	 */
	MarkupMultiline getRemarks();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.ResponsibleRole#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultiline value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResponsibleRole_Links()
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
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResponsibleRole_Props()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;property'"
	 * @generated
	 */
	EList<Property> getProps();

} // ResponsibleRole
