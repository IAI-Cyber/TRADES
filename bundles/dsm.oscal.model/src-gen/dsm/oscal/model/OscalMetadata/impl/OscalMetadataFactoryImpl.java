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
package dsm.oscal.model.OscalMetadata.impl;

import dsm.oscal.model.OscalMetadata.*;

import gov.nist.secauto.metaschema.datatypes.Date;
import gov.nist.secauto.metaschema.datatypes.DateTime;
import gov.nist.secauto.metaschema.datatypes.IPv4;
import gov.nist.secauto.metaschema.datatypes.IPv6;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import java.net.URI;

import java.time.ZonedDateTime;

import java.util.UUID;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscalMetadataFactoryImpl extends EFactoryImpl implements OscalMetadataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OscalMetadataFactory init() {
		try {
			OscalMetadataFactory theOscalMetadataFactory = (OscalMetadataFactory)EPackage.Registry.INSTANCE.getEFactory(OscalMetadataPackage.eNS_URI);
			if (theOscalMetadataFactory != null) {
				return theOscalMetadataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OscalMetadataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscalMetadataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OscalMetadataPackage.ADDRESS: return createAddress();
			case OscalMetadataPackage.BACK_MATTER: return createBackMatter();
			case OscalMetadataPackage.BACK_MATTER_RESOURCE: return createBackMatterResource();
			case OscalMetadataPackage.BASE64: return createBase64();
			case OscalMetadataPackage.DOCUMENT_ID: return createDocumentId();
			case OscalMetadataPackage.ELEMENT_WITH_CLAZZ: return createElementWithClazz();
			case OscalMetadataPackage.ELEMENT_WITH_ID: return createElementWithId();
			case OscalMetadataPackage.ELEMENT_WITH_REMARKS: return createElementWithRemarks();
			case OscalMetadataPackage.ELEMENT_WITH_VALUE: return createElementWithValue();
			case OscalMetadataPackage.EXTERNAL_ID: return createExternalId();
			case OscalMetadataPackage.HASH: return createHash();
			case OscalMetadataPackage.LINK: return createLink();
			case OscalMetadataPackage.LINK_OWNER: return createLinkOwner();
			case OscalMetadataPackage.LOCATION: return createLocation();
			case OscalMetadataPackage.METADATA: return createMetadata();
			case OscalMetadataPackage.PARAMETER_OWNER: return createParameterOwner();
			case OscalMetadataPackage.PART_OWNER: return createPartOwner();
			case OscalMetadataPackage.PARTY: return createParty();
			case OscalMetadataPackage.PROPERTY: return createProperty();
			case OscalMetadataPackage.PROPERTY_OWNER: return createPropertyOwner();
			case OscalMetadataPackage.RESOURCE_CITATION: return createResourceCitation();
			case OscalMetadataPackage.RESOURCE_RLINK: return createResourceRlink();
			case OscalMetadataPackage.RESPONSIBLE_PARTY: return createResponsibleParty();
			case OscalMetadataPackage.RESPONSIBLE_ROLE: return createResponsibleRole();
			case OscalMetadataPackage.REVISION: return createRevision();
			case OscalMetadataPackage.ROLE: return createRole();
			case OscalMetadataPackage.TELEPHONE_NUMBER: return createTelephoneNumber();
			case OscalMetadataPackage.UUID_ELEMENT: return createUUIDElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OscalMetadataPackage.BASE64_TYPE:
				return createBase64TypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.DATE_TIME_TYPE:
				return createDateTimeTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.DATE_TIME_WITH_TZ_TYPE:
				return createDateTimeWithTzTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.DATE_TYPE:
				return createDateTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.DATE_WITH_TZ_TYPE:
				return createDateWithTzTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.EMPTY_TYPE:
				return createEmptyTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.IP_V4_ADDRESS_TYPE:
				return createIpV4AddressTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.IP_V6_ADDRESS_TYPE:
				return createIpV6AddressTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.MARKUP_LINE_TYPE:
				return createMarkupLineTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.MARKUP_MULTILINE_TYPE:
				return createMarkupMultilineTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.URI_REFERENCE_TYPE:
				return createUriReferenceTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.URI_TYPE:
				return createUriTypeFromString(eDataType, initialValue);
			case OscalMetadataPackage.UUID_TYPE:
				return createUuidTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OscalMetadataPackage.BASE64_TYPE:
				return convertBase64TypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.DATE_TIME_TYPE:
				return convertDateTimeTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.DATE_TIME_WITH_TZ_TYPE:
				return convertDateTimeWithTzTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.DATE_TYPE:
				return convertDateTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.DATE_WITH_TZ_TYPE:
				return convertDateWithTzTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.EMPTY_TYPE:
				return convertEmptyTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.IP_V4_ADDRESS_TYPE:
				return convertIpV4AddressTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.IP_V6_ADDRESS_TYPE:
				return convertIpV6AddressTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.MARKUP_LINE_TYPE:
				return convertMarkupLineTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.MARKUP_MULTILINE_TYPE:
				return convertMarkupMultilineTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.URI_REFERENCE_TYPE:
				return convertUriReferenceTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.URI_TYPE:
				return convertUriTypeToString(eDataType, instanceValue);
			case OscalMetadataPackage.UUID_TYPE:
				return convertUuidTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatter createBackMatter() {
		BackMatterImpl backMatter = new BackMatterImpl();
		return backMatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatterResource createBackMatterResource() {
		BackMatterResourceImpl backMatterResource = new BackMatterResourceImpl();
		return backMatterResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64 createBase64() {
		Base64Impl base64 = new Base64Impl();
		return base64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentId createDocumentId() {
		DocumentIdImpl documentId = new DocumentIdImpl();
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementWithClazz createElementWithClazz() {
		ElementWithClazzImpl elementWithClazz = new ElementWithClazzImpl();
		return elementWithClazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementWithId createElementWithId() {
		ElementWithIdImpl elementWithId = new ElementWithIdImpl();
		return elementWithId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementWithRemarks createElementWithRemarks() {
		ElementWithRemarksImpl elementWithRemarks = new ElementWithRemarksImpl();
		return elementWithRemarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementWithValue createElementWithValue() {
		ElementWithValueImpl elementWithValue = new ElementWithValueImpl();
		return elementWithValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalId createExternalId() {
		ExternalIdImpl externalId = new ExternalIdImpl();
		return externalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hash createHash() {
		HashImpl hash = new HashImpl();
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkOwner createLinkOwner() {
		LinkOwnerImpl linkOwner = new LinkOwnerImpl();
		return linkOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterOwner createParameterOwner() {
		ParameterOwnerImpl parameterOwner = new ParameterOwnerImpl();
		return parameterOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartOwner createPartOwner() {
		PartOwnerCustomImpl partOwner = new PartOwnerCustomImpl();
		return partOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party createParty() {
		PartyImpl party = new PartyImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyOwner createPropertyOwner() {
		PropertyOwnerImpl propertyOwner = new PropertyOwnerImpl();
		return propertyOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceCitation createResourceCitation() {
		ResourceCitationImpl resourceCitation = new ResourceCitationImpl();
		return resourceCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceRlink createResourceRlink() {
		ResourceRlinkImpl resourceRlink = new ResourceRlinkImpl();
		return resourceRlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsibleParty createResponsibleParty() {
		ResponsiblePartyImpl responsibleParty = new ResponsiblePartyImpl();
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsibleRole createResponsibleRole() {
		ResponsibleRoleImpl responsibleRole = new ResponsibleRoleImpl();
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Revision createRevision() {
		RevisionImpl revision = new RevisionImpl();
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelephoneNumber createTelephoneNumber() {
		TelephoneNumberImpl telephoneNumber = new TelephoneNumberImpl();
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UUIDElement createUUIDElement() {
		UUIDElementImpl uuidElement = new UUIDElementImpl();
		return uuidElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.nist.secauto.metaschema.datatypes.Base64 createBase64Type(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadBase64TypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.nist.secauto.metaschema.datatypes.Base64 createBase64TypeFromString(EDataType eDataType, String initialValue) {
		return createBase64Type(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64Type(final gov.nist.secauto.metaschema.datatypes.Base64 it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveBase64TypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64TypeToString(EDataType eDataType, Object instanceValue) {
		return convertBase64Type((gov.nist.secauto.metaschema.datatypes.Base64)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTimeType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadDateTimeTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTimeTypeFromString(EDataType eDataType, String initialValue) {
		return createDateTimeType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeType(final DateTime it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveDateTimeTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeType((DateTime)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime createDateTimeWithTzType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadDateTimeWithTzTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime createDateTimeWithTzTypeFromString(EDataType eDataType, String initialValue) {
		return createDateTimeWithTzType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeWithTzType(final ZonedDateTime it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveDateTimeWithTzTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeWithTzTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimeWithTzType((ZonedDateTime)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadDateTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateTypeFromString(EDataType eDataType, String initialValue) {
		return createDateType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateType(final Date it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveDateTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateType((Date)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime createDateWithTzType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadDateWithTzTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime createDateWithTzTypeFromString(EDataType eDataType, String initialValue) {
		return createDateWithTzType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateWithTzType(final ZonedDateTime it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveDateWithTzTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateWithTzTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDateWithTzType((ZonedDateTime)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Void createEmptyType(final String it) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Void createEmptyTypeFromString(EDataType eDataType, String initialValue) {
		return createEmptyType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmptyType(final Void it) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmptyTypeToString(EDataType eDataType, Object instanceValue) {
		return convertEmptyType((Void)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPv4 createIpV4AddressType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadIpV4AddressTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPv4 createIpV4AddressTypeFromString(EDataType eDataType, String initialValue) {
		return createIpV4AddressType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpV4AddressType(final IPv4 it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveIpV4AddressTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpV4AddressTypeToString(EDataType eDataType, Object instanceValue) {
		return convertIpV4AddressType((IPv4)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPv6 createIpV6AddressType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadIpV6AddressTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPv6 createIpV6AddressTypeFromString(EDataType eDataType, String initialValue) {
		return createIpV6AddressType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpV6AddressType(final IPv6 it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveIpV6AddressTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpV6AddressTypeToString(EDataType eDataType, Object instanceValue) {
		return convertIpV6AddressType((IPv6)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupLine createMarkupLineType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadMarkupLineTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupLine createMarkupLineTypeFromString(EDataType eDataType, String initialValue) {
		return createMarkupLineType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkupLineType(final MarkupLine it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveMarkupLineTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkupLineTypeToString(EDataType eDataType, Object instanceValue) {
		return convertMarkupLineType((MarkupLine)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupMultiline createMarkupMultilineType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadMarkupMultilineTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupMultiline createMarkupMultilineTypeFromString(EDataType eDataType, String initialValue) {
		return createMarkupMultilineType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkupMultilineType(final MarkupMultiline it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveMarkupMultilineTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkupMultilineTypeToString(EDataType eDataType, Object instanceValue) {
		return convertMarkupMultilineType((MarkupMultiline)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createUriReferenceType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadUriReferenceTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createUriReferenceTypeFromString(EDataType eDataType, String initialValue) {
		return createUriReferenceType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriReferenceType(final URI it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveUriReferenceTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return convertUriReferenceType((URI)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createUriType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadUriTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createUriTypeFromString(EDataType eDataType, String initialValue) {
		return createUriType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriType(final URI it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveUriTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriTypeToString(EDataType eDataType, Object instanceValue) {
		return convertUriType((URI)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUID createUuidType(final String it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.loadUuidTypeFromString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUID createUuidTypeFromString(EDataType eDataType, String initialValue) {
		return createUuidType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidType(final UUID it) {
		return dsm.oscal.model.OSCALDataTypeHandler.INSTANCE.saveUuidTypeToString(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidTypeToString(EDataType eDataType, Object instanceValue) {
		return convertUuidType((UUID)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OscalMetadataPackage getOscalMetadataPackage() {
		return (OscalMetadataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OscalMetadataPackage getPackage() {
		return OscalMetadataPackage.eINSTANCE;
	}

} //OscalMetadataFactoryImpl
