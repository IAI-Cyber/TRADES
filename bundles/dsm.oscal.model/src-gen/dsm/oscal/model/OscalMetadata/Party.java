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

import java.util.UUID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Party (organization or person)</h1>
 * <h2>Description</h2>
 * <p>A responsible entity which is either a person or an organization.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Party#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Party#getEmailAddresses <em>Email Addresses</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Party#getExternalIds <em>External Ids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Party#getLocationUuids <em>Location Uuids</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Party#getMemberOfOrganizations <em>Member Of Organizations</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Party#getName <em>Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Party#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Party#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Party#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;party'"
 * @generated
 */
public interface Party extends OscalElement, UUIDElement, PropertyOwner, LinkOwner, ElementWithRemarks {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty_Addresses()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;address'"
	 * @generated
	 */
	EList<Address> getAddresses();

	/**
	 * Returns the value of the '<em><b>Email Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Email Address</h1>
	 * <h2>Description</h2>
	 * <p>An email address as defined by <a href="https://tools.ietf.org/html/rfc5322#section-3.4.1">RFC 5322 Section 3.4.1</a>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email Addresses</em>' attribute list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty_EmailAddresses()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;party.&lt;FieldInstance&gt;email-address'"
	 * @generated
	 */
	EList<String> getEmailAddresses();

	/**
	 * Returns the value of the '<em><b>External Ids</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.ExternalId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ids</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty_ExternalIds()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;external-id'"
	 * @generated
	 */
	EList<ExternalId> getExternalIds();

	/**
	 * Returns the value of the '<em><b>Location Uuids</b></em>' attribute list.
	 * The list contents are of type {@link java.util.UUID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Location Reference</h1>
	 * <h2>Description</h2>
	 * <p>References a <code>location</code> defined in <code>metadata</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Uuids</em>' attribute list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty_LocationUuids()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UuidType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;party.&lt;FieldInstance&gt;location-uuid'"
	 * @generated
	 */
	EList<UUID> getLocationUuids();

	/**
	 * Returns the value of the '<em><b>Member Of Organizations</b></em>' attribute list.
	 * The list contents are of type {@link java.util.UUID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Organizational Affiliation</h1>
	 * <h2>Description</h2>
	 * <p>Identifies that the party object is a member of the organization associated with the provided UUID.</p><h2>Remarks</h2>
	 * <p>Parties of both the <code>person</code> or <code>organization</code> type can be associated with an organization using the <code>member-of-organization</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member Of Organizations</em>' attribute list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty_MemberOfOrganizations()
	 * @model dataType="dsm.oscal.model.OscalMetadata.UuidType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;party.&lt;FieldInstance&gt;member-of-organization'"
	 * @generated
	 */
	EList<UUID> getMemberOfOrganizations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Party Name</h1>
	 * <h2>Description</h2>
	 * <p>The full name of the party. This is typically the legal name associated with the party.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty_Name()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;party.&lt;FieldInstance&gt;name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Party#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Party Short Name</h1>
	 * <h2>Description</h2>
	 * <p>A short common name, abbreviation, or acronym for the party.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty_ShortName()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;party.&lt;FieldInstance&gt;short-name'"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Party#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Telephone Numbers</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalMetadata.TelephoneNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Numbers</em>' containment reference list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty_TelephoneNumbers()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;FieldDefinition&gt;telephone-number'"
	 * @generated
	 */
	EList<TelephoneNumber> getTelephoneNumbers();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Party Type</h1>
	 * <h2>Description</h2>
	 * <p>A category describing the kind of party the object describes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getParty_Type()
	 * @model required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;party.&lt;FlagInstance&gt;type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Party#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Party
