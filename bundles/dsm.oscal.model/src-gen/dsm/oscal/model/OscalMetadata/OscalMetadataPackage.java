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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataFactory
 * @model kind="package"
 * @generated
 */
public interface OscalMetadataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OscalMetadata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://csrc.nist.gov/ns/oscal/1.0/oscal-metadata";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oscal-metadata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OscalMetadataPackage eINSTANCE = dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.OscalElementImpl <em>Oscal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalElementImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getOscalElement()
	 * @generated
	 */
	int OSCAL_ELEMENT = 16;

	/**
	 * The number of structural features of the '<em>Oscal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAL_ELEMENT___RESOLVE__URI = 0;

	/**
	 * The number of operations of the '<em>Oscal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAL_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.AddressImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Addr Lines</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDR_LINES = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTAL_CODE = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.AnnotationImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__UUID = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__REMARKS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NS = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.BackMatterImpl <em>Back Matter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.BackMatterImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getBackMatter()
	 * @generated
	 */
	int BACK_MATTER = 3;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl <em>Back Matter Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getBackMatterResource()
	 * @generated
	 */
	int BACK_MATTER_RESOURCE = 4;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.Base64Impl <em>Base64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.Base64Impl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getBase64()
	 * @generated
	 */
	int BASE64 = 5;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.DocumentIdImpl <em>Document Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.DocumentIdImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDocumentId()
	 * @generated
	 */
	int DOCUMENT_ID = 6;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.ExternalIdImpl <em>External Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.ExternalIdImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getExternalId()
	 * @generated
	 */
	int EXTERNAL_ID = 10;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.HashImpl <em>Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.HashImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getHash()
	 * @generated
	 */
	int HASH = 11;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.LinkImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 12;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.LocationImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 14;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.MetadataImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 15;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.PartyImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 17;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.PropertyImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 18;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.ResourceCitationImpl <em>Resource Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.ResourceCitationImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getResourceCitation()
	 * @generated
	 */
	int RESOURCE_CITATION = 20;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.ResourceRlinkImpl <em>Resource Rlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.ResourceRlinkImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getResourceRlink()
	 * @generated
	 */
	int RESOURCE_RLINK = 21;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.ResponsiblePartyImpl <em>Responsible Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.ResponsiblePartyImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getResponsibleParty()
	 * @generated
	 */
	int RESPONSIBLE_PARTY = 22;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl <em>Responsible Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getResponsibleRole()
	 * @generated
	 */
	int RESPONSIBLE_ROLE = 23;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.RevisionImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 24;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.RoleImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 25;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.TelephoneNumberImpl <em>Telephone Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.TelephoneNumberImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getTelephoneNumber()
	 * @generated
	 */
	int TELEPHONE_NUMBER = 26;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.UUIDElementImpl <em>UUID Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.UUIDElementImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getUUIDElement()
	 * @generated
	 */
	int UUID_ELEMENT = 27;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.AnnotationOwnerImpl <em>Annotation Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.AnnotationOwnerImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getAnnotationOwner()
	 * @generated
	 */
	int ANNOTATION_OWNER = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OWNER__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotation Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotation Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OWNER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER__RESOURCES = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Back Matter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Back Matter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__UUID = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__ANNOTATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__PROPS = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__REMARKS = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__BASE64 = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__CITATION = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__DESCRIPTION = OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Document Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__DOCUMENT_IDS = OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__RLINKS = OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE__TITLE = OSCAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Back Matter Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Back Matter Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_RESOURCE_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64__FILENAME = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64__MEDIA_TYPE = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64__VALUE = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Base64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Base64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID__VALUE = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID__SCHEME = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Document Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.ElementWithClazzImpl <em>Element With Clazz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.ElementWithClazzImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getElementWithClazz()
	 * @generated
	 */
	int ELEMENT_WITH_CLAZZ = 7;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_CLAZZ__CLAZZ = 0;

	/**
	 * The number of structural features of the '<em>Element With Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_CLAZZ_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element With Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_CLAZZ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.ElementWithRemarksImpl <em>Element With Remarks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.ElementWithRemarksImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getElementWithRemarks()
	 * @generated
	 */
	int ELEMENT_WITH_REMARKS = 8;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_REMARKS__REMARKS = 0;

	/**
	 * The number of structural features of the '<em>Element With Remarks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_REMARKS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element With Remarks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_REMARKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.ElementWithValueImpl <em>Element With Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.ElementWithValueImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getElementWithValue()
	 * @generated
	 */
	int ELEMENT_WITH_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Element With Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element With Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_VALUE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID__VALUE = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID__SCHEME = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>External Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__VALUE = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__ALGORITHM = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EHref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__EHREF = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MEDIA_TYPE = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.LinkOwnerImpl <em>Link Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.LinkOwnerImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getLinkOwner()
	 * @generated
	 */
	int LINK_OWNER = 13;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OWNER__LINKS = 0;

	/**
	 * The number of structural features of the '<em>Link Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OWNER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__UUID = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ANNOTATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROPS = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LINKS = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REMARKS = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ADDRESS = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Email Addresses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__EMAIL_ADDRESSES = OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Telephone Numbers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TELEPHONE_NUMBERS = OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TITLE = OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Urls</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__URLS = OSCAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ANNOTATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PROPS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LINKS = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__REMARKS = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__DOCUMENT_IDS = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LAST_MODIFIED = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LOCATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__OSCAL_VERSION = OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PARTIES = OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PUBLISHED = OSCAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Responsible Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__RESPONSIBLE_PARTIES = OSCAL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__REVISIONS = OSCAL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ROLES = OSCAL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__TITLE = OSCAL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VERSION = OSCAL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__UUID = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__ANNOTATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PROPS = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LINKS = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__REMARKS = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__ADDRESSES = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Email Addresses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__EMAIL_ADDRESSES = OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>External Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__EXTERNAL_IDS = OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Location Uuids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LOCATION_UUIDS = OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Member Of Organizations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__MEMBER_OF_ORGANIZATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__NAME = OSCAL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__SHORT_NAME = OSCAL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Telephone Numbers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__TELEPHONE_NUMBERS = OSCAL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__TYPE = OSCAL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UUID = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLAZZ = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NS = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalMetadata.impl.PropertyOwnerImpl <em>Property Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalMetadata.impl.PropertyOwnerImpl
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getPropertyOwner()
	 * @generated
	 */
	int PROPERTY_OWNER = 19;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OWNER__PROPS = 0;

	/**
	 * The number of structural features of the '<em>Property Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OWNER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CITATION__ANNOTATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CITATION__PROPS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CITATION__TEXT = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CITATION_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CITATION___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Resource Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CITATION_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EHref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RLINK__EHREF = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hashes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RLINK__HASHES = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RLINK__MEDIA_TYPE = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Rlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RLINK_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RLINK___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Resource Rlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RLINK_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__ANNOTATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__PROPS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__LINKS = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__REMARKS = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Uuids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__PARTY_UUIDS = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__ROLE_ID = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Responsible Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Responsible Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__ANNOTATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__PROPS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__LINKS = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__REMARKS = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Uuids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__PARTY_UUIDS = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE__ROLE_ID = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Responsible Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Responsible Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_ROLE_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ANNOTATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PROPS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LINKS = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REMARKS = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LAST_MODIFIED = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__OSCAL_VERSION = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PUBLISHED = OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__TITLE = OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__VERSION = OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ANNOTATIONS = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PROPS = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__LINKS = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REMARKS = OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SHORT_NAME = OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TITLE = OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__VALUE = OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__TYPE = OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_FEATURE_COUNT = OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER___RESOLVE__URI = OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The number of operations of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_OPERATION_COUNT = OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT__UUID = 0;

	/**
	 * The number of structural features of the '<em>UUID Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>UUID Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Date Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.secauto.metaschema.datatypes.DateTime
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 29;

	/**
	 * The meta object id for the '<em>Date Time With Tz Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.ZonedDateTime
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDateTimeWithTzType()
	 * @generated
	 */
	int DATE_TIME_WITH_TZ_TYPE = 30;

	/**
	 * The meta object id for the '<em>Ip V6 Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.secauto.metaschema.datatypes.IPv6
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getIpV6AddressType()
	 * @generated
	 */
	int IP_V6_ADDRESS_TYPE = 35;

	/**
	 * The meta object id for the '<em>Ip V4 Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.secauto.metaschema.datatypes.IPv4
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getIpV4AddressType()
	 * @generated
	 */
	int IP_V4_ADDRESS_TYPE = 34;

	/**
	 * The meta object id for the '<em>Date With Tz Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.ZonedDateTime
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDateWithTzType()
	 * @generated
	 */
	int DATE_WITH_TZ_TYPE = 32;

	/**
	 * The meta object id for the '<em>Uuid Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.UUID
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getUuidType()
	 * @generated
	 */
	int UUID_TYPE = 40;

	/**
	 * The meta object id for the '<em>Markup Line Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.secauto.metaschema.datatypes.markup.MarkupLine
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getMarkupLineType()
	 * @generated
	 */
	int MARKUP_LINE_TYPE = 36;

	/**
	 * The meta object id for the '<em>Date Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.secauto.metaschema.datatypes.Date
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 31;

	/**
	 * The meta object id for the '<em>Uri Reference Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getUriReferenceType()
	 * @generated
	 */
	int URI_REFERENCE_TYPE = 38;

	/**
	 * The meta object id for the '<em>Markup Multiline Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getMarkupMultilineType()
	 * @generated
	 */
	int MARKUP_MULTILINE_TYPE = 37;

	/**
	 * The meta object id for the '<em>Empty Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Void
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 33;

	/**
	 * The meta object id for the '<em>Base64 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nist.secauto.metaschema.datatypes.Base64
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getBase64Type()
	 * @generated
	 */
	int BASE64_TYPE = 28;

	/**
	 * The meta object id for the '<em>Uri Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getUriType()
	 * @generated
	 */
	int URI_TYPE = 39;


	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Type();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalMetadata.Address#getAddrLines <em>Addr Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Addr Lines</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Address#getAddrLines()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_AddrLines();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Address#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Address#getPostalCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Annotation#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Annotation#getNs()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Ns();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.BackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back Matter</em>'.
	 * @see dsm.oscal.model.OscalMetadata.BackMatter
	 * @generated
	 */
	EClass getBackMatter();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.BackMatter#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see dsm.oscal.model.OscalMetadata.BackMatter#getResources()
	 * @see #getBackMatter()
	 * @generated
	 */
	EReference getBackMatter_Resources();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.BackMatterResource <em>Back Matter Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back Matter Resource</em>'.
	 * @see dsm.oscal.model.OscalMetadata.BackMatterResource
	 * @generated
	 */
	EClass getBackMatterResource();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.OscalMetadata.BackMatterResource#getTitle()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EAttribute getBackMatterResource_Title();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.oscal.model.OscalMetadata.BackMatterResource#getDescription()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EAttribute getBackMatterResource_Description();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation</em>'.
	 * @see dsm.oscal.model.OscalMetadata.BackMatterResource#getCitation()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Citation();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getRlinks <em>Rlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rlinks</em>'.
	 * @see dsm.oscal.model.OscalMetadata.BackMatterResource#getRlinks()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Rlinks();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getDocumentIds <em>Document Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Ids</em>'.
	 * @see dsm.oscal.model.OscalMetadata.BackMatterResource#getDocumentIds()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_DocumentIds();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.OscalMetadata.BackMatterResource#getBase64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base64</em>'.
	 * @see dsm.oscal.model.OscalMetadata.BackMatterResource#getBase64()
	 * @see #getBackMatterResource()
	 * @generated
	 */
	EReference getBackMatterResource_Base64();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Base64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Base64
	 * @generated
	 */
	EClass getBase64();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Base64#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Base64#getValue()
	 * @see #getBase64()
	 * @generated
	 */
	EAttribute getBase64_Value();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Base64#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Base64#getFilename()
	 * @see #getBase64()
	 * @generated
	 */
	EAttribute getBase64_Filename();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Base64#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Base64#getMediaType()
	 * @see #getBase64()
	 * @generated
	 */
	EAttribute getBase64_MediaType();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.DocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Id</em>'.
	 * @see dsm.oscal.model.OscalMetadata.DocumentId
	 * @generated
	 */
	EClass getDocumentId();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.DocumentId#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see dsm.oscal.model.OscalMetadata.DocumentId#getScheme()
	 * @see #getDocumentId()
	 * @generated
	 */
	EAttribute getDocumentId_Scheme();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.ElementWithClazz <em>Element With Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element With Clazz</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithClazz
	 * @generated
	 */
	EClass getElementWithClazz();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.ElementWithClazz#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithClazz#getClazz()
	 * @see #getElementWithClazz()
	 * @generated
	 */
	EAttribute getElementWithClazz_Clazz();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.ElementWithRemarks <em>Element With Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element With Remarks</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithRemarks
	 * @generated
	 */
	EClass getElementWithRemarks();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.ElementWithRemarks#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithRemarks#getRemarks()
	 * @see #getElementWithRemarks()
	 * @generated
	 */
	EAttribute getElementWithRemarks_Remarks();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.ElementWithValue <em>Element With Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element With Value</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithValue
	 * @generated
	 */
	EClass getElementWithValue();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.ElementWithValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithValue#getValue()
	 * @see #getElementWithValue()
	 * @generated
	 */
	EAttribute getElementWithValue_Value();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.ExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Id</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ExternalId
	 * @generated
	 */
	EClass getExternalId();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.ExternalId#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ExternalId#getScheme()
	 * @see #getExternalId()
	 * @generated
	 */
	EAttribute getExternalId_Scheme();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Hash
	 * @generated
	 */
	EClass getHash();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Hash#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Hash#getAlgorithm()
	 * @see #getHash()
	 * @generated
	 */
	EAttribute getHash_Algorithm();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Link#getEHref <em>EHref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EHref</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Link#getEHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_EHref();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Link#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Link#getMediaType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Link#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Link#getText()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Text();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.LinkOwner <em>Link Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Owner</em>'.
	 * @see dsm.oscal.model.OscalMetadata.LinkOwner
	 * @generated
	 */
	EClass getLinkOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.LinkOwner#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see dsm.oscal.model.OscalMetadata.LinkOwner#getLinks()
	 * @see #getLinkOwner()
	 * @generated
	 */
	EReference getLinkOwner_Links();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Location#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Location#getTitle()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Title();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalMetadata.Location#getEmailAddresses <em>Email Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email Addresses</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Location#getEmailAddresses()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_EmailAddresses();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalMetadata.Location#getUrls <em>Urls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Urls</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Location#getUrls()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Urls();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.OscalMetadata.Location#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Location#getAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Location#getTelephoneNumbers <em>Telephone Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Numbers</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Location#getTelephoneNumbers()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_TelephoneNumbers();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Metadata#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getTitle()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Title();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Metadata#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getPublished()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Published();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Metadata#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getLastModified()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Metadata#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getVersion()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Version();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Metadata#getOscalVersion <em>Oscal Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscal Version</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getOscalVersion()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_OscalVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Metadata#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getRoles()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Metadata#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getLocations()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Metadata#getResponsibleParties <em>Responsible Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Parties</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getResponsibleParties()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_ResponsibleParties();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Metadata#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parties</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getParties()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Parties();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Metadata#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getRevisions()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Revisions();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Metadata#getDocumentIds <em>Document Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Ids</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Metadata#getDocumentIds()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_DocumentIds();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Party#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party#getType()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Type();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Party#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party#getName()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Party#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party#getShortName()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_ShortName();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalMetadata.Party#getEmailAddresses <em>Email Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email Addresses</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party#getEmailAddresses()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_EmailAddresses();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalMetadata.Party#getLocationUuids <em>Location Uuids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location Uuids</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party#getLocationUuids()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_LocationUuids();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalMetadata.Party#getMemberOfOrganizations <em>Member Of Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Member Of Organizations</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party#getMemberOfOrganizations()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_MemberOfOrganizations();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Party#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party#getAddresses()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Addresses();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Party#getExternalIds <em>External Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Ids</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party#getExternalIds()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_ExternalIds();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.Party#getTelephoneNumbers <em>Telephone Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Numbers</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Party#getTelephoneNumbers()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_TelephoneNumbers();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Property#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Property#getNs()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Ns();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.PropertyOwner <em>Property Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Owner</em>'.
	 * @see dsm.oscal.model.OscalMetadata.PropertyOwner
	 * @generated
	 */
	EClass getPropertyOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.PropertyOwner#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see dsm.oscal.model.OscalMetadata.PropertyOwner#getProps()
	 * @see #getPropertyOwner()
	 * @generated
	 */
	EReference getPropertyOwner_Props();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.ResourceCitation <em>Resource Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Citation</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResourceCitation
	 * @generated
	 */
	EClass getResourceCitation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.ResourceCitation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResourceCitation#getText()
	 * @see #getResourceCitation()
	 * @generated
	 */
	EAttribute getResourceCitation_Text();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.ResourceRlink <em>Resource Rlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Rlink</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResourceRlink
	 * @generated
	 */
	EClass getResourceRlink();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.ResourceRlink#getEHref <em>EHref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EHref</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResourceRlink#getEHref()
	 * @see #getResourceRlink()
	 * @generated
	 */
	EAttribute getResourceRlink_EHref();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.ResourceRlink#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResourceRlink#getMediaType()
	 * @see #getResourceRlink()
	 * @generated
	 */
	EAttribute getResourceRlink_MediaType();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.ResourceRlink#getHashes <em>Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hashes</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResourceRlink#getHashes()
	 * @see #getResourceRlink()
	 * @generated
	 */
	EReference getResourceRlink_Hashes();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Party</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResponsibleParty
	 * @generated
	 */
	EClass getResponsibleParty();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.ResponsibleParty#getRoleId <em>Role Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Id</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResponsibleParty#getRoleId()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EAttribute getResponsibleParty_RoleId();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalMetadata.ResponsibleParty#getPartyUuids <em>Party Uuids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Uuids</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResponsibleParty#getPartyUuids()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EAttribute getResponsibleParty_PartyUuids();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.ResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Role</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResponsibleRole
	 * @generated
	 */
	EClass getResponsibleRole();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.ResponsibleRole#getRoleId <em>Role Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Id</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResponsibleRole#getRoleId()
	 * @see #getResponsibleRole()
	 * @generated
	 */
	EAttribute getResponsibleRole_RoleId();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalMetadata.ResponsibleRole#getPartyUuids <em>Party Uuids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Uuids</em>'.
	 * @see dsm.oscal.model.OscalMetadata.ResponsibleRole#getPartyUuids()
	 * @see #getResponsibleRole()
	 * @generated
	 */
	EAttribute getResponsibleRole_PartyUuids();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Revision#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Revision#getTitle()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Title();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Revision#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Revision#getPublished()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Published();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Revision#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Revision#getLastModified()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Revision#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Revision#getVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Version();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Revision#getOscalVersion <em>Oscal Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscal Version</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Revision#getOscalVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_OscalVersion();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Role#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Role#getId()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Role#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Role#getTitle()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Title();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Role#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Role#getShortName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.oscal.model.OscalMetadata.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Description();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number</em>'.
	 * @see dsm.oscal.model.OscalMetadata.TelephoneNumber
	 * @generated
	 */
	EClass getTelephoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.TelephoneNumber#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsm.oscal.model.OscalMetadata.TelephoneNumber#getType()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_Type();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.OscalElement <em>Oscal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oscal Element</em>'.
	 * @see dsm.oscal.model.OscalMetadata.OscalElement
	 * @generated
	 */
	EClass getOscalElement();

	/**
	 * Returns the meta object for the '{@link dsm.oscal.model.OscalMetadata.OscalElement#resolve(java.net.URI) <em>Resolve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve</em>' operation.
	 * @see dsm.oscal.model.OscalMetadata.OscalElement#resolve(java.net.URI)
	 * @generated
	 */
	EOperation getOscalElement__Resolve__URI();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.UUIDElement <em>UUID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UUID Element</em>'.
	 * @see dsm.oscal.model.OscalMetadata.UUIDElement
	 * @generated
	 */
	EClass getUUIDElement();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalMetadata.UUIDElement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see dsm.oscal.model.OscalMetadata.UUIDElement#getUuid()
	 * @see #getUUIDElement()
	 * @generated
	 */
	EAttribute getUUIDElement_Uuid();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalMetadata.AnnotationOwner <em>Annotation Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Owner</em>'.
	 * @see dsm.oscal.model.OscalMetadata.AnnotationOwner
	 * @generated
	 */
	EClass getAnnotationOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalMetadata.AnnotationOwner#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see dsm.oscal.model.OscalMetadata.AnnotationOwner#getAnnotations()
	 * @see #getAnnotationOwner()
	 * @generated
	 */
	EReference getAnnotationOwner_Annotations();

	/**
	 * Returns the meta object for data type '{@link gov.nist.secauto.metaschema.datatypes.DateTime <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Type</em>'.
	 * @see gov.nist.secauto.metaschema.datatypes.DateTime
	 * @model instanceClass="gov.nist.secauto.metaschema.datatypes.DateTime"
	 * @generated
	 */
	EDataType getDateTimeType();

	/**
	 * Returns the meta object for data type '{@link java.time.ZonedDateTime <em>Date Time With Tz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time With Tz Type</em>'.
	 * @see java.time.ZonedDateTime
	 * @model instanceClass="java.time.ZonedDateTime"
	 * @generated
	 */
	EDataType getDateTimeWithTzType();

	/**
	 * Returns the meta object for data type '{@link gov.nist.secauto.metaschema.datatypes.IPv6 <em>Ip V6 Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V6 Address Type</em>'.
	 * @see gov.nist.secauto.metaschema.datatypes.IPv6
	 * @model instanceClass="gov.nist.secauto.metaschema.datatypes.IPv6"
	 * @generated
	 */
	EDataType getIpV6AddressType();

	/**
	 * Returns the meta object for data type '{@link gov.nist.secauto.metaschema.datatypes.IPv4 <em>Ip V4 Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip V4 Address Type</em>'.
	 * @see gov.nist.secauto.metaschema.datatypes.IPv4
	 * @model instanceClass="gov.nist.secauto.metaschema.datatypes.IPv4"
	 * @generated
	 */
	EDataType getIpV4AddressType();

	/**
	 * Returns the meta object for data type '{@link java.time.ZonedDateTime <em>Date With Tz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date With Tz Type</em>'.
	 * @see java.time.ZonedDateTime
	 * @model instanceClass="java.time.ZonedDateTime"
	 * @generated
	 */
	EDataType getDateWithTzType();

	/**
	 * Returns the meta object for data type '{@link java.util.UUID <em>Uuid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uuid Type</em>'.
	 * @see java.util.UUID
	 * @model instanceClass="java.util.UUID"
	 * @generated
	 */
	EDataType getUuidType();

	/**
	 * Returns the meta object for data type '{@link gov.nist.secauto.metaschema.datatypes.markup.MarkupLine <em>Markup Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Markup Line Type</em>'.
	 * @see gov.nist.secauto.metaschema.datatypes.markup.MarkupLine
	 * @model instanceClass="gov.nist.secauto.metaschema.datatypes.markup.MarkupLine"
	 * @generated
	 */
	EDataType getMarkupLineType();

	/**
	 * Returns the meta object for data type '{@link gov.nist.secauto.metaschema.datatypes.Date <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Type</em>'.
	 * @see gov.nist.secauto.metaschema.datatypes.Date
	 * @model instanceClass="gov.nist.secauto.metaschema.datatypes.Date"
	 * @generated
	 */
	EDataType getDateType();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>Uri Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uri Reference Type</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getUriReferenceType();

	/**
	 * Returns the meta object for data type '{@link gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline <em>Markup Multiline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Markup Multiline Type</em>'.
	 * @see gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline
	 * @model instanceClass="gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline"
	 * @generated
	 */
	EDataType getMarkupMultilineType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Void <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Empty Type</em>'.
	 * @see java.lang.Void
	 * @model instanceClass="java.lang.Void"
	 * @generated
	 */
	EDataType getEmptyType();

	/**
	 * Returns the meta object for data type '{@link gov.nist.secauto.metaschema.datatypes.Base64 <em>Base64 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base64 Type</em>'.
	 * @see gov.nist.secauto.metaschema.datatypes.Base64
	 * @model instanceClass="gov.nist.secauto.metaschema.datatypes.Base64"
	 * @generated
	 */
	EDataType getBase64Type();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>Uri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uri Type</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getUriType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OscalMetadataFactory getOscalMetadataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.AddressImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__TYPE = eINSTANCE.getAddress_Type();

		/**
		 * The meta object literal for the '<em><b>Addr Lines</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADDR_LINES = eINSTANCE.getAddress_AddrLines();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__POSTAL_CODE = eINSTANCE.getAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.AnnotationImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NS = eINSTANCE.getAnnotation_Ns();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.BackMatterImpl <em>Back Matter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.BackMatterImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getBackMatter()
		 * @generated
		 */
		EClass BACK_MATTER = eINSTANCE.getBackMatter();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACK_MATTER__RESOURCES = eINSTANCE.getBackMatter_Resources();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl <em>Back Matter Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.BackMatterResourceImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getBackMatterResource()
		 * @generated
		 */
		EClass BACK_MATTER_RESOURCE = eINSTANCE.getBackMatterResource();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACK_MATTER_RESOURCE__TITLE = eINSTANCE.getBackMatterResource_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACK_MATTER_RESOURCE__DESCRIPTION = eINSTANCE.getBackMatterResource_Description();

		/**
		 * The meta object literal for the '<em><b>Citation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACK_MATTER_RESOURCE__CITATION = eINSTANCE.getBackMatterResource_Citation();

		/**
		 * The meta object literal for the '<em><b>Rlinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACK_MATTER_RESOURCE__RLINKS = eINSTANCE.getBackMatterResource_Rlinks();

		/**
		 * The meta object literal for the '<em><b>Document Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACK_MATTER_RESOURCE__DOCUMENT_IDS = eINSTANCE.getBackMatterResource_DocumentIds();

		/**
		 * The meta object literal for the '<em><b>Base64</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACK_MATTER_RESOURCE__BASE64 = eINSTANCE.getBackMatterResource_Base64();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.Base64Impl <em>Base64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.Base64Impl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getBase64()
		 * @generated
		 */
		EClass BASE64 = eINSTANCE.getBase64();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64__VALUE = eINSTANCE.getBase64_Value();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64__FILENAME = eINSTANCE.getBase64_Filename();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64__MEDIA_TYPE = eINSTANCE.getBase64_MediaType();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.DocumentIdImpl <em>Document Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.DocumentIdImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDocumentId()
		 * @generated
		 */
		EClass DOCUMENT_ID = eINSTANCE.getDocumentId();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ID__SCHEME = eINSTANCE.getDocumentId_Scheme();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.ElementWithClazzImpl <em>Element With Clazz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.ElementWithClazzImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getElementWithClazz()
		 * @generated
		 */
		EClass ELEMENT_WITH_CLAZZ = eINSTANCE.getElementWithClazz();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_WITH_CLAZZ__CLAZZ = eINSTANCE.getElementWithClazz_Clazz();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.ElementWithRemarksImpl <em>Element With Remarks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.ElementWithRemarksImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getElementWithRemarks()
		 * @generated
		 */
		EClass ELEMENT_WITH_REMARKS = eINSTANCE.getElementWithRemarks();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_WITH_REMARKS__REMARKS = eINSTANCE.getElementWithRemarks_Remarks();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.ElementWithValueImpl <em>Element With Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.ElementWithValueImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getElementWithValue()
		 * @generated
		 */
		EClass ELEMENT_WITH_VALUE = eINSTANCE.getElementWithValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_WITH_VALUE__VALUE = eINSTANCE.getElementWithValue_Value();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.ExternalIdImpl <em>External Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.ExternalIdImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getExternalId()
		 * @generated
		 */
		EClass EXTERNAL_ID = eINSTANCE.getExternalId();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ID__SCHEME = eINSTANCE.getExternalId_Scheme();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.HashImpl <em>Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.HashImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getHash()
		 * @generated
		 */
		EClass HASH = eINSTANCE.getHash();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH__ALGORITHM = eINSTANCE.getHash_Algorithm();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.LinkImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>EHref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__EHREF = eINSTANCE.getLink_EHref();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__MEDIA_TYPE = eINSTANCE.getLink_MediaType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TEXT = eINSTANCE.getLink_Text();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.LinkOwnerImpl <em>Link Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.LinkOwnerImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getLinkOwner()
		 * @generated
		 */
		EClass LINK_OWNER = eINSTANCE.getLinkOwner();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_OWNER__LINKS = eINSTANCE.getLinkOwner_Links();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.LocationImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__TITLE = eINSTANCE.getLocation_Title();

		/**
		 * The meta object literal for the '<em><b>Email Addresses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__EMAIL_ADDRESSES = eINSTANCE.getLocation_EmailAddresses();

		/**
		 * The meta object literal for the '<em><b>Urls</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__URLS = eINSTANCE.getLocation_Urls();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__ADDRESS = eINSTANCE.getLocation_Address();

		/**
		 * The meta object literal for the '<em><b>Telephone Numbers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__TELEPHONE_NUMBERS = eINSTANCE.getLocation_TelephoneNumbers();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.MetadataImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__TITLE = eINSTANCE.getMetadata_Title();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__PUBLISHED = eINSTANCE.getMetadata_Published();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__LAST_MODIFIED = eINSTANCE.getMetadata_LastModified();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__VERSION = eINSTANCE.getMetadata_Version();

		/**
		 * The meta object literal for the '<em><b>Oscal Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__OSCAL_VERSION = eINSTANCE.getMetadata_OscalVersion();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__ROLES = eINSTANCE.getMetadata_Roles();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__LOCATIONS = eINSTANCE.getMetadata_Locations();

		/**
		 * The meta object literal for the '<em><b>Responsible Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__RESPONSIBLE_PARTIES = eINSTANCE.getMetadata_ResponsibleParties();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__PARTIES = eINSTANCE.getMetadata_Parties();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__REVISIONS = eINSTANCE.getMetadata_Revisions();

		/**
		 * The meta object literal for the '<em><b>Document Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__DOCUMENT_IDS = eINSTANCE.getMetadata_DocumentIds();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.PartyImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__TYPE = eINSTANCE.getParty_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__NAME = eINSTANCE.getParty_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__SHORT_NAME = eINSTANCE.getParty_ShortName();

		/**
		 * The meta object literal for the '<em><b>Email Addresses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__EMAIL_ADDRESSES = eINSTANCE.getParty_EmailAddresses();

		/**
		 * The meta object literal for the '<em><b>Location Uuids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__LOCATION_UUIDS = eINSTANCE.getParty_LocationUuids();

		/**
		 * The meta object literal for the '<em><b>Member Of Organizations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__MEMBER_OF_ORGANIZATIONS = eINSTANCE.getParty_MemberOfOrganizations();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__ADDRESSES = eINSTANCE.getParty_Addresses();

		/**
		 * The meta object literal for the '<em><b>External Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__EXTERNAL_IDS = eINSTANCE.getParty_ExternalIds();

		/**
		 * The meta object literal for the '<em><b>Telephone Numbers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__TELEPHONE_NUMBERS = eINSTANCE.getParty_TelephoneNumbers();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.PropertyImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NS = eINSTANCE.getProperty_Ns();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.PropertyOwnerImpl <em>Property Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.PropertyOwnerImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getPropertyOwner()
		 * @generated
		 */
		EClass PROPERTY_OWNER = eINSTANCE.getPropertyOwner();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OWNER__PROPS = eINSTANCE.getPropertyOwner_Props();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.ResourceCitationImpl <em>Resource Citation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.ResourceCitationImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getResourceCitation()
		 * @generated
		 */
		EClass RESOURCE_CITATION = eINSTANCE.getResourceCitation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CITATION__TEXT = eINSTANCE.getResourceCitation_Text();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.ResourceRlinkImpl <em>Resource Rlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.ResourceRlinkImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getResourceRlink()
		 * @generated
		 */
		EClass RESOURCE_RLINK = eINSTANCE.getResourceRlink();

		/**
		 * The meta object literal for the '<em><b>EHref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_RLINK__EHREF = eINSTANCE.getResourceRlink_EHref();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_RLINK__MEDIA_TYPE = eINSTANCE.getResourceRlink_MediaType();

		/**
		 * The meta object literal for the '<em><b>Hashes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RLINK__HASHES = eINSTANCE.getResourceRlink_Hashes();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.ResponsiblePartyImpl <em>Responsible Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.ResponsiblePartyImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getResponsibleParty()
		 * @generated
		 */
		EClass RESPONSIBLE_PARTY = eINSTANCE.getResponsibleParty();

		/**
		 * The meta object literal for the '<em><b>Role Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY__ROLE_ID = eINSTANCE.getResponsibleParty_RoleId();

		/**
		 * The meta object literal for the '<em><b>Party Uuids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY__PARTY_UUIDS = eINSTANCE.getResponsibleParty_PartyUuids();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl <em>Responsible Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.ResponsibleRoleImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getResponsibleRole()
		 * @generated
		 */
		EClass RESPONSIBLE_ROLE = eINSTANCE.getResponsibleRole();

		/**
		 * The meta object literal for the '<em><b>Role Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_ROLE__ROLE_ID = eINSTANCE.getResponsibleRole_RoleId();

		/**
		 * The meta object literal for the '<em><b>Party Uuids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_ROLE__PARTY_UUIDS = eINSTANCE.getResponsibleRole_PartyUuids();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.RevisionImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__TITLE = eINSTANCE.getRevision_Title();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__PUBLISHED = eINSTANCE.getRevision_Published();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__LAST_MODIFIED = eINSTANCE.getRevision_LastModified();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__VERSION = eINSTANCE.getRevision_Version();

		/**
		 * The meta object literal for the '<em><b>Oscal Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__OSCAL_VERSION = eINSTANCE.getRevision_OscalVersion();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.RoleImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ID = eINSTANCE.getRole_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__TITLE = eINSTANCE.getRole_Title();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__SHORT_NAME = eINSTANCE.getRole_ShortName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.TelephoneNumberImpl <em>Telephone Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.TelephoneNumberImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getTelephoneNumber()
		 * @generated
		 */
		EClass TELEPHONE_NUMBER = eINSTANCE.getTelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__TYPE = eINSTANCE.getTelephoneNumber_Type();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.OscalElementImpl <em>Oscal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalElementImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getOscalElement()
		 * @generated
		 */
		EClass OSCAL_ELEMENT = eINSTANCE.getOscalElement();

		/**
		 * The meta object literal for the '<em><b>Resolve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSCAL_ELEMENT___RESOLVE__URI = eINSTANCE.getOscalElement__Resolve__URI();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.UUIDElementImpl <em>UUID Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.UUIDElementImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getUUIDElement()
		 * @generated
		 */
		EClass UUID_ELEMENT = eINSTANCE.getUUIDElement();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UUID_ELEMENT__UUID = eINSTANCE.getUUIDElement_Uuid();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalMetadata.impl.AnnotationOwnerImpl <em>Annotation Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalMetadata.impl.AnnotationOwnerImpl
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getAnnotationOwner()
		 * @generated
		 */
		EClass ANNOTATION_OWNER = eINSTANCE.getAnnotationOwner();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_OWNER__ANNOTATIONS = eINSTANCE.getAnnotationOwner_Annotations();

		/**
		 * The meta object literal for the '<em>Date Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.secauto.metaschema.datatypes.DateTime
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDateTimeType()
		 * @generated
		 */
		EDataType DATE_TIME_TYPE = eINSTANCE.getDateTimeType();

		/**
		 * The meta object literal for the '<em>Date Time With Tz Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.ZonedDateTime
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDateTimeWithTzType()
		 * @generated
		 */
		EDataType DATE_TIME_WITH_TZ_TYPE = eINSTANCE.getDateTimeWithTzType();

		/**
		 * The meta object literal for the '<em>Ip V6 Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.secauto.metaschema.datatypes.IPv6
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getIpV6AddressType()
		 * @generated
		 */
		EDataType IP_V6_ADDRESS_TYPE = eINSTANCE.getIpV6AddressType();

		/**
		 * The meta object literal for the '<em>Ip V4 Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.secauto.metaschema.datatypes.IPv4
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getIpV4AddressType()
		 * @generated
		 */
		EDataType IP_V4_ADDRESS_TYPE = eINSTANCE.getIpV4AddressType();

		/**
		 * The meta object literal for the '<em>Date With Tz Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.ZonedDateTime
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDateWithTzType()
		 * @generated
		 */
		EDataType DATE_WITH_TZ_TYPE = eINSTANCE.getDateWithTzType();

		/**
		 * The meta object literal for the '<em>Uuid Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.UUID
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getUuidType()
		 * @generated
		 */
		EDataType UUID_TYPE = eINSTANCE.getUuidType();

		/**
		 * The meta object literal for the '<em>Markup Line Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.secauto.metaschema.datatypes.markup.MarkupLine
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getMarkupLineType()
		 * @generated
		 */
		EDataType MARKUP_LINE_TYPE = eINSTANCE.getMarkupLineType();

		/**
		 * The meta object literal for the '<em>Date Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.secauto.metaschema.datatypes.Date
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getDateType()
		 * @generated
		 */
		EDataType DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '<em>Uri Reference Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getUriReferenceType()
		 * @generated
		 */
		EDataType URI_REFERENCE_TYPE = eINSTANCE.getUriReferenceType();

		/**
		 * The meta object literal for the '<em>Markup Multiline Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getMarkupMultilineType()
		 * @generated
		 */
		EDataType MARKUP_MULTILINE_TYPE = eINSTANCE.getMarkupMultilineType();

		/**
		 * The meta object literal for the '<em>Empty Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Void
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getEmptyType()
		 * @generated
		 */
		EDataType EMPTY_TYPE = eINSTANCE.getEmptyType();

		/**
		 * The meta object literal for the '<em>Base64 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nist.secauto.metaschema.datatypes.Base64
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getBase64Type()
		 * @generated
		 */
		EDataType BASE64_TYPE = eINSTANCE.getBase64Type();

		/**
		 * The meta object literal for the '<em>Uri Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl#getUriType()
		 * @generated
		 */
		EDataType URI_TYPE = eINSTANCE.getUriType();

	}

} //OscalMetadataPackage
