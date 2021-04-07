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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Address</h1>
 * <h2>Description</h2>
 * <p>A postal address for the location.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Address#getType <em>Type</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Address#getAddrLines <em>Addr Lines</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Address#getCity <em>City</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Address#getState <em>State</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Address#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalMetadata.Address#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAddress()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;address'"
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Address Type</h1>
	 * <h2>Description</h2>
	 * <p>Indicates the type of address.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAddress_Type()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;address.&lt;FlagInstance&gt;location-type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Address#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Addr Lines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Address line</h1>
	 * <h2>Description</h2>
	 * <p>A single line of an address.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addr Lines</em>' attribute list.
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAddress_AddrLines()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;address.&lt;FieldInstance&gt;addr-line'"
	 * @generated
	 */
	EList<String> getAddrLines();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>City</h1>
	 * <h2>Description</h2>
	 * <p>City, town or geographical region for the mailing address.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAddress_City()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;address.&lt;FieldInstance&gt;city'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Address#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>State</h1>
	 * <h2>Description</h2>
	 * <p>State, province or analogous geographical region for mailing address</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAddress_State()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;address.&lt;FieldInstance&gt;state'"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Address#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Postal Code</h1>
	 * <h2>Description</h2>
	 * <p>Postal or ZIP code for mailing address</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAddress_PostalCode()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;address.&lt;FieldInstance&gt;postal-code'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Address#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Country Code</h1>
	 * <h2>Description</h2>
	 * <p>The ISO 3166-1 alpha-2 country code for the mailing address.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getAddress_Country()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;address.&lt;FieldInstance&gt;country'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.Address#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // Address
