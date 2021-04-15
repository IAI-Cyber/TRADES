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

import dsm.oscal.model.OscalCatalog.OscalCatalogPackage;

import dsm.oscal.model.OscalCatalog.impl.OscalCatalogPackageImpl;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage;

import dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl;

import dsm.oscal.model.OscalMetadata.Address;
import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.BackMatter;
import dsm.oscal.model.OscalMetadata.BackMatterResource;
import dsm.oscal.model.OscalMetadata.Base64;
import dsm.oscal.model.OscalMetadata.DocumentId;
import dsm.oscal.model.OscalMetadata.ExternalId;
import dsm.oscal.model.OscalMetadata.Hash;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.Location;
import dsm.oscal.model.OscalMetadata.Metadata;
import dsm.oscal.model.OscalMetadata.OscalElement;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.Party;
import dsm.oscal.model.OscalMetadata.Property;
import dsm.oscal.model.OscalMetadata.ResourceCitation;
import dsm.oscal.model.OscalMetadata.ResourceRlink;
import dsm.oscal.model.OscalMetadata.ResponsibleParty;
import dsm.oscal.model.OscalMetadata.ResponsibleRole;
import dsm.oscal.model.OscalMetadata.Revision;
import dsm.oscal.model.OscalMetadata.Role;
import dsm.oscal.model.OscalMetadata.TelephoneNumber;
import dsm.oscal.model.OscalMetadata.UUIDElement;
import gov.nist.secauto.metaschema.datatypes.Date;
import gov.nist.secauto.metaschema.datatypes.DateTime;
import gov.nist.secauto.metaschema.datatypes.IPv4;
import gov.nist.secauto.metaschema.datatypes.IPv6;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import java.net.URI;

import java.time.ZonedDateTime;

import java.util.UUID;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscalMetadataPackageImpl extends EPackageImpl implements OscalMetadataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backMatterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backMatterResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceCitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsiblePartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibleRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telephoneNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uuidElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeWithTzTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV6AddressTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipV4AddressTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateWithTzTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markupLineTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriReferenceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markupMultilineTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emptyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType base64TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OscalMetadataPackageImpl() {
		super(eNS_URI, OscalMetadataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OscalMetadataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OscalMetadataPackage init() {
		if (isInited) return (OscalMetadataPackage)EPackage.Registry.INSTANCE.getEPackage(OscalMetadataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOscalMetadataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OscalMetadataPackageImpl theOscalMetadataPackage = registeredOscalMetadataPackage instanceof OscalMetadataPackageImpl ? (OscalMetadataPackageImpl)registeredOscalMetadataPackage : new OscalMetadataPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OscalCatalogCommonPackage.eNS_URI);
		OscalCatalogCommonPackageImpl theOscalCatalogCommonPackage = (OscalCatalogCommonPackageImpl)(registeredPackage instanceof OscalCatalogCommonPackageImpl ? registeredPackage : OscalCatalogCommonPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OscalCatalogPackage.eNS_URI);
		OscalCatalogPackageImpl theOscalCatalogPackage = (OscalCatalogPackageImpl)(registeredPackage instanceof OscalCatalogPackageImpl ? registeredPackage : OscalCatalogPackage.eINSTANCE);

		// Create package meta-data objects
		theOscalMetadataPackage.createPackageContents();
		theOscalCatalogCommonPackage.createPackageContents();
		theOscalCatalogPackage.createPackageContents();

		// Initialize created meta-data
		theOscalMetadataPackage.initializePackageContents();
		theOscalCatalogCommonPackage.initializePackageContents();
		theOscalCatalogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOscalMetadataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OscalMetadataPackage.eNS_URI, theOscalMetadataPackage);
		return theOscalMetadataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_Type() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_AddrLines() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_City() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_State() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_PostalCode() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_Country() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Name() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Ns() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Value() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Remarks() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackMatter() {
		return backMatterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatter_Resources() {
		return (EReference)backMatterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackMatterResource() {
		return backMatterResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackMatterResource_Title() {
		return (EAttribute)backMatterResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackMatterResource_Description() {
		return (EAttribute)backMatterResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackMatterResource_Remarks() {
		return (EAttribute)backMatterResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_Citation() {
		return (EReference)backMatterResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_Rlinks() {
		return (EReference)backMatterResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_Props() {
		return (EReference)backMatterResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_DocumentIds() {
		return (EReference)backMatterResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackMatterResource_Base64() {
		return (EReference)backMatterResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase64() {
		return base64EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64_Value() {
		return (EAttribute)base64EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64_Filename() {
		return (EAttribute)base64EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64_MediaType() {
		return (EAttribute)base64EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentId() {
		return documentIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentId_Value() {
		return (EAttribute)documentIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentId_Scheme() {
		return (EAttribute)documentIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalId() {
		return externalIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalId_Value() {
		return (EAttribute)externalIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalId_Scheme() {
		return (EAttribute)externalIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHash() {
		return hashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHash_Value() {
		return (EAttribute)hashEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHash_Algorithm() {
		return (EAttribute)hashEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_EHref() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Rel() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_MediaType() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Text() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Title() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_EmailAddresses() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Urls() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Remarks() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Address() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Links() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_TelephoneNumbers() {
		return (EReference)locationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Props() {
		return (EReference)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Title() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Published() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_LastModified() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Version() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_OscalVersion() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Remarks() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Roles() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Links() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Locations() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_ResponsibleParties() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Parties() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Revisions() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_DocumentIds() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Props() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Type() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Name() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_ShortName() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_EmailAddresses() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_LocationUuids() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_MemberOfOrganizations() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Remarks() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_Addresses() {
		return (EReference)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_Links() {
		return (EReference)partyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_ExternalIds() {
		return (EReference)partyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_Props() {
		return (EReference)partyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_TelephoneNumbers() {
		return (EReference)partyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Ns() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Clazz() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceCitation() {
		return resourceCitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceCitation_Text() {
		return (EAttribute)resourceCitationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceCitation_Props() {
		return (EReference)resourceCitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceRlink() {
		return resourceRlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceRlink_EHref() {
		return (EAttribute)resourceRlinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceRlink_MediaType() {
		return (EAttribute)resourceRlinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceRlink_Hashes() {
		return (EReference)resourceRlinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponsibleParty() {
		return responsiblePartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleParty_RoleId() {
		return (EAttribute)responsiblePartyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleParty_PartyUuids() {
		return (EAttribute)responsiblePartyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleParty_Remarks() {
		return (EAttribute)responsiblePartyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibleParty_Links() {
		return (EReference)responsiblePartyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibleParty_Props() {
		return (EReference)responsiblePartyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponsibleRole() {
		return responsibleRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleRole_RoleId() {
		return (EAttribute)responsibleRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleRole_PartyUuids() {
		return (EAttribute)responsibleRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsibleRole_Remarks() {
		return (EAttribute)responsibleRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibleRole_Links() {
		return (EReference)responsibleRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponsibleRole_Props() {
		return (EReference)responsibleRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRevision() {
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Title() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Published() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_LastModified() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Version() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_OscalVersion() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Remarks() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_Links() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_Props() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Id() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Title() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_ShortName() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Description() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Remarks() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Links() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Props() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTelephoneNumber() {
		return telephoneNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelephoneNumber_Value() {
		return (EAttribute)telephoneNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTelephoneNumber_Type() {
		return (EAttribute)telephoneNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOscalElement() {
		return oscalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUUIDElement() {
		return uuidElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUUIDElement_Uuid() {
		return (EAttribute)uuidElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationOwner() {
		return annotationOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationOwner_Annotations() {
		return (EReference)annotationOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateTimeType() {
		return dateTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateTimeWithTzType() {
		return dateTimeWithTzTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV6AddressType() {
		return ipV6AddressTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIpV4AddressType() {
		return ipV4AddressTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateWithTzType() {
		return dateWithTzTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUuidType() {
		return uuidTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMarkupLineType() {
		return markupLineTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateType() {
		return dateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUriReferenceType() {
		return uriReferenceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMarkupMultilineType() {
		return markupMultilineTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEmptyType() {
		return emptyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBase64Type() {
		return base64TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUriType() {
		return uriTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OscalMetadataFactory getOscalMetadataFactory() {
		return (OscalMetadataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__ADDR_LINES);
		createEAttribute(addressEClass, ADDRESS__CITY);
		createEAttribute(addressEClass, ADDRESS__COUNTRY);
		createEAttribute(addressEClass, ADDRESS__POSTAL_CODE);
		createEAttribute(addressEClass, ADDRESS__STATE);
		createEAttribute(addressEClass, ADDRESS__TYPE);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__NAME);
		createEAttribute(annotationEClass, ANNOTATION__NS);
		createEAttribute(annotationEClass, ANNOTATION__REMARKS);
		createEAttribute(annotationEClass, ANNOTATION__VALUE);

		annotationOwnerEClass = createEClass(ANNOTATION_OWNER);
		createEReference(annotationOwnerEClass, ANNOTATION_OWNER__ANNOTATIONS);

		backMatterEClass = createEClass(BACK_MATTER);
		createEReference(backMatterEClass, BACK_MATTER__RESOURCES);

		backMatterResourceEClass = createEClass(BACK_MATTER_RESOURCE);
		createEReference(backMatterResourceEClass, BACK_MATTER_RESOURCE__BASE64);
		createEReference(backMatterResourceEClass, BACK_MATTER_RESOURCE__CITATION);
		createEAttribute(backMatterResourceEClass, BACK_MATTER_RESOURCE__DESCRIPTION);
		createEReference(backMatterResourceEClass, BACK_MATTER_RESOURCE__DOCUMENT_IDS);
		createEReference(backMatterResourceEClass, BACK_MATTER_RESOURCE__PROPS);
		createEAttribute(backMatterResourceEClass, BACK_MATTER_RESOURCE__REMARKS);
		createEReference(backMatterResourceEClass, BACK_MATTER_RESOURCE__RLINKS);
		createEAttribute(backMatterResourceEClass, BACK_MATTER_RESOURCE__TITLE);

		base64EClass = createEClass(BASE64);
		createEAttribute(base64EClass, BASE64__FILENAME);
		createEAttribute(base64EClass, BASE64__MEDIA_TYPE);
		createEAttribute(base64EClass, BASE64__VALUE);

		documentIdEClass = createEClass(DOCUMENT_ID);
		createEAttribute(documentIdEClass, DOCUMENT_ID__SCHEME);
		createEAttribute(documentIdEClass, DOCUMENT_ID__VALUE);

		externalIdEClass = createEClass(EXTERNAL_ID);
		createEAttribute(externalIdEClass, EXTERNAL_ID__SCHEME);
		createEAttribute(externalIdEClass, EXTERNAL_ID__VALUE);

		hashEClass = createEClass(HASH);
		createEAttribute(hashEClass, HASH__ALGORITHM);
		createEAttribute(hashEClass, HASH__VALUE);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__EHREF);
		createEAttribute(linkEClass, LINK__MEDIA_TYPE);
		createEAttribute(linkEClass, LINK__REL);
		createEAttribute(linkEClass, LINK__TEXT);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__ADDRESS);
		createEAttribute(locationEClass, LOCATION__EMAIL_ADDRESSES);
		createEReference(locationEClass, LOCATION__LINKS);
		createEReference(locationEClass, LOCATION__PROPS);
		createEAttribute(locationEClass, LOCATION__REMARKS);
		createEReference(locationEClass, LOCATION__TELEPHONE_NUMBERS);
		createEAttribute(locationEClass, LOCATION__TITLE);
		createEAttribute(locationEClass, LOCATION__URLS);

		metadataEClass = createEClass(METADATA);
		createEReference(metadataEClass, METADATA__DOCUMENT_IDS);
		createEAttribute(metadataEClass, METADATA__LAST_MODIFIED);
		createEReference(metadataEClass, METADATA__LINKS);
		createEReference(metadataEClass, METADATA__LOCATIONS);
		createEAttribute(metadataEClass, METADATA__OSCAL_VERSION);
		createEReference(metadataEClass, METADATA__PARTIES);
		createEReference(metadataEClass, METADATA__PROPS);
		createEAttribute(metadataEClass, METADATA__PUBLISHED);
		createEAttribute(metadataEClass, METADATA__REMARKS);
		createEReference(metadataEClass, METADATA__RESPONSIBLE_PARTIES);
		createEReference(metadataEClass, METADATA__REVISIONS);
		createEReference(metadataEClass, METADATA__ROLES);
		createEAttribute(metadataEClass, METADATA__TITLE);
		createEAttribute(metadataEClass, METADATA__VERSION);

		oscalElementEClass = createEClass(OSCAL_ELEMENT);

		partyEClass = createEClass(PARTY);
		createEReference(partyEClass, PARTY__ADDRESSES);
		createEAttribute(partyEClass, PARTY__EMAIL_ADDRESSES);
		createEReference(partyEClass, PARTY__EXTERNAL_IDS);
		createEReference(partyEClass, PARTY__LINKS);
		createEAttribute(partyEClass, PARTY__LOCATION_UUIDS);
		createEAttribute(partyEClass, PARTY__MEMBER_OF_ORGANIZATIONS);
		createEAttribute(partyEClass, PARTY__NAME);
		createEReference(partyEClass, PARTY__PROPS);
		createEAttribute(partyEClass, PARTY__REMARKS);
		createEAttribute(partyEClass, PARTY__SHORT_NAME);
		createEReference(partyEClass, PARTY__TELEPHONE_NUMBERS);
		createEAttribute(partyEClass, PARTY__TYPE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__CLAZZ);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__NS);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		resourceCitationEClass = createEClass(RESOURCE_CITATION);
		createEReference(resourceCitationEClass, RESOURCE_CITATION__PROPS);
		createEAttribute(resourceCitationEClass, RESOURCE_CITATION__TEXT);

		resourceRlinkEClass = createEClass(RESOURCE_RLINK);
		createEAttribute(resourceRlinkEClass, RESOURCE_RLINK__EHREF);
		createEReference(resourceRlinkEClass, RESOURCE_RLINK__HASHES);
		createEAttribute(resourceRlinkEClass, RESOURCE_RLINK__MEDIA_TYPE);

		responsiblePartyEClass = createEClass(RESPONSIBLE_PARTY);
		createEReference(responsiblePartyEClass, RESPONSIBLE_PARTY__LINKS);
		createEAttribute(responsiblePartyEClass, RESPONSIBLE_PARTY__PARTY_UUIDS);
		createEReference(responsiblePartyEClass, RESPONSIBLE_PARTY__PROPS);
		createEAttribute(responsiblePartyEClass, RESPONSIBLE_PARTY__REMARKS);
		createEAttribute(responsiblePartyEClass, RESPONSIBLE_PARTY__ROLE_ID);

		responsibleRoleEClass = createEClass(RESPONSIBLE_ROLE);
		createEReference(responsibleRoleEClass, RESPONSIBLE_ROLE__LINKS);
		createEAttribute(responsibleRoleEClass, RESPONSIBLE_ROLE__PARTY_UUIDS);
		createEReference(responsibleRoleEClass, RESPONSIBLE_ROLE__PROPS);
		createEAttribute(responsibleRoleEClass, RESPONSIBLE_ROLE__REMARKS);
		createEAttribute(responsibleRoleEClass, RESPONSIBLE_ROLE__ROLE_ID);

		revisionEClass = createEClass(REVISION);
		createEAttribute(revisionEClass, REVISION__LAST_MODIFIED);
		createEReference(revisionEClass, REVISION__LINKS);
		createEAttribute(revisionEClass, REVISION__OSCAL_VERSION);
		createEReference(revisionEClass, REVISION__PROPS);
		createEAttribute(revisionEClass, REVISION__PUBLISHED);
		createEAttribute(revisionEClass, REVISION__REMARKS);
		createEAttribute(revisionEClass, REVISION__TITLE);
		createEAttribute(revisionEClass, REVISION__VERSION);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__DESCRIPTION);
		createEAttribute(roleEClass, ROLE__ID);
		createEReference(roleEClass, ROLE__LINKS);
		createEReference(roleEClass, ROLE__PROPS);
		createEAttribute(roleEClass, ROLE__REMARKS);
		createEAttribute(roleEClass, ROLE__SHORT_NAME);
		createEAttribute(roleEClass, ROLE__TITLE);

		telephoneNumberEClass = createEClass(TELEPHONE_NUMBER);
		createEAttribute(telephoneNumberEClass, TELEPHONE_NUMBER__TYPE);
		createEAttribute(telephoneNumberEClass, TELEPHONE_NUMBER__VALUE);

		uuidElementEClass = createEClass(UUID_ELEMENT);
		createEAttribute(uuidElementEClass, UUID_ELEMENT__UUID);

		// Create data types
		base64TypeEDataType = createEDataType(BASE64_TYPE);
		dateTimeTypeEDataType = createEDataType(DATE_TIME_TYPE);
		dateTimeWithTzTypeEDataType = createEDataType(DATE_TIME_WITH_TZ_TYPE);
		dateTypeEDataType = createEDataType(DATE_TYPE);
		dateWithTzTypeEDataType = createEDataType(DATE_WITH_TZ_TYPE);
		emptyTypeEDataType = createEDataType(EMPTY_TYPE);
		ipV4AddressTypeEDataType = createEDataType(IP_V4_ADDRESS_TYPE);
		ipV6AddressTypeEDataType = createEDataType(IP_V6_ADDRESS_TYPE);
		markupLineTypeEDataType = createEDataType(MARKUP_LINE_TYPE);
		markupMultilineTypeEDataType = createEDataType(MARKUP_MULTILINE_TYPE);
		uriReferenceTypeEDataType = createEDataType(URI_REFERENCE_TYPE);
		uriTypeEDataType = createEDataType(URI_TYPE);
		uuidTypeEDataType = createEDataType(UUID_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addressEClass.getESuperTypes().add(this.getOscalElement());
		annotationEClass.getESuperTypes().add(this.getOscalElement());
		annotationEClass.getESuperTypes().add(this.getUUIDElement());
		backMatterEClass.getESuperTypes().add(this.getOscalElement());
		backMatterResourceEClass.getESuperTypes().add(this.getOscalElement());
		backMatterResourceEClass.getESuperTypes().add(this.getUUIDElement());
		backMatterResourceEClass.getESuperTypes().add(this.getAnnotationOwner());
		base64EClass.getESuperTypes().add(this.getOscalElement());
		documentIdEClass.getESuperTypes().add(this.getOscalElement());
		externalIdEClass.getESuperTypes().add(this.getOscalElement());
		hashEClass.getESuperTypes().add(this.getOscalElement());
		linkEClass.getESuperTypes().add(this.getOscalElement());
		locationEClass.getESuperTypes().add(this.getOscalElement());
		locationEClass.getESuperTypes().add(this.getUUIDElement());
		locationEClass.getESuperTypes().add(this.getAnnotationOwner());
		metadataEClass.getESuperTypes().add(this.getOscalElement());
		metadataEClass.getESuperTypes().add(this.getAnnotationOwner());
		partyEClass.getESuperTypes().add(this.getOscalElement());
		partyEClass.getESuperTypes().add(this.getUUIDElement());
		partyEClass.getESuperTypes().add(this.getAnnotationOwner());
		propertyEClass.getESuperTypes().add(this.getOscalElement());
		propertyEClass.getESuperTypes().add(this.getUUIDElement());
		resourceCitationEClass.getESuperTypes().add(this.getOscalElement());
		resourceCitationEClass.getESuperTypes().add(this.getAnnotationOwner());
		resourceRlinkEClass.getESuperTypes().add(this.getOscalElement());
		responsiblePartyEClass.getESuperTypes().add(this.getOscalElement());
		responsiblePartyEClass.getESuperTypes().add(this.getAnnotationOwner());
		responsibleRoleEClass.getESuperTypes().add(this.getOscalElement());
		responsibleRoleEClass.getESuperTypes().add(this.getAnnotationOwner());
		revisionEClass.getESuperTypes().add(this.getOscalElement());
		revisionEClass.getESuperTypes().add(this.getAnnotationOwner());
		roleEClass.getESuperTypes().add(this.getOscalElement());
		roleEClass.getESuperTypes().add(this.getAnnotationOwner());
		telephoneNumberEClass.getESuperTypes().add(this.getOscalElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_AddrLines(), ecorePackage.getEString(), "addrLines", null, 0, -1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Country(), ecorePackage.getEString(), "country", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_PostalCode(), ecorePackage.getEString(), "postalCode", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_State(), ecorePackage.getEString(), "state", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Type(), ecorePackage.getEString(), "type", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Ns(), this.getUriType(), "ns", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Remarks(), this.getMarkupMultilineType(), "remarks", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Value(), ecorePackage.getEString(), "value", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationOwnerEClass, AnnotationOwner.class, "AnnotationOwner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationOwner_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, AnnotationOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backMatterEClass, BackMatter.class, "BackMatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackMatter_Resources(), this.getBackMatterResource(), null, "resources", null, 0, -1, BackMatter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backMatterResourceEClass, BackMatterResource.class, "BackMatterResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackMatterResource_Base64(), this.getBase64(), null, "base64", null, 0, 1, BackMatterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBackMatterResource_Citation(), this.getResourceCitation(), null, "citation", null, 0, 1, BackMatterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackMatterResource_Description(), this.getMarkupMultilineType(), "description", null, 0, 1, BackMatterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBackMatterResource_DocumentIds(), this.getDocumentId(), null, "documentIds", null, 0, -1, BackMatterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBackMatterResource_Props(), this.getProperty(), null, "props", null, 0, -1, BackMatterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackMatterResource_Remarks(), this.getMarkupMultilineType(), "remarks", null, 0, 1, BackMatterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBackMatterResource_Rlinks(), this.getResourceRlink(), null, "rlinks", null, 0, -1, BackMatterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackMatterResource_Title(), this.getMarkupLineType(), "title", null, 0, 1, BackMatterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base64EClass, Base64.class, "Base64", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64_Filename(), this.getUriReferenceType(), "filename", null, 0, 1, Base64.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, Base64.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64_Value(), this.getBase64Type(), "value", null, 0, 1, Base64.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentIdEClass, DocumentId.class, "DocumentId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentId_Scheme(), this.getUriType(), "scheme", null, 1, 1, DocumentId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentId_Value(), ecorePackage.getEString(), "value", null, 0, 1, DocumentId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalIdEClass, ExternalId.class, "ExternalId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalId_Scheme(), this.getUriType(), "scheme", null, 1, 1, ExternalId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalId_Value(), ecorePackage.getEString(), "value", null, 0, 1, ExternalId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashEClass, Hash.class, "Hash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHash_Algorithm(), ecorePackage.getEString(), "algorithm", null, 1, 1, Hash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHash_Value(), ecorePackage.getEString(), "value", null, 0, 1, Hash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_EHref(), this.getUriReferenceType(), "eHref", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Rel(), ecorePackage.getEString(), "rel", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Text(), this.getMarkupLineType(), "text", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Address(), this.getAddress(), null, "address", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_EmailAddresses(), ecorePackage.getEString(), "emailAddresses", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Links(), this.getLink(), null, "links", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Props(), this.getProperty(), null, "props", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Remarks(), this.getMarkupMultilineType(), "remarks", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_TelephoneNumbers(), this.getTelephoneNumber(), null, "telephoneNumbers", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Title(), this.getMarkupLineType(), "title", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Urls(), this.getUriType(), "urls", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadata_DocumentIds(), this.getDocumentId(), null, "documentIds", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_LastModified(), this.getDateTimeWithTzType(), "lastModified", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Links(), this.getLink(), null, "links", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Locations(), this.getLocation(), null, "locations", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_OscalVersion(), ecorePackage.getEString(), "oscalVersion", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Parties(), this.getParty(), null, "parties", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Props(), this.getProperty(), null, "props", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Published(), this.getDateTimeWithTzType(), "published", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Remarks(), this.getMarkupMultilineType(), "remarks", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_ResponsibleParties(), this.getResponsibleParty(), null, "responsibleParties", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Revisions(), this.getRevision(), null, "revisions", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Roles(), this.getRole(), null, "roles", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Title(), this.getMarkupLineType(), "title", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Version(), ecorePackage.getEString(), "version", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oscalElementEClass, OscalElement.class, "OscalElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partyEClass, Party.class, "Party", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParty_Addresses(), this.getAddress(), null, "addresses", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_EmailAddresses(), ecorePackage.getEString(), "emailAddresses", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_ExternalIds(), this.getExternalId(), null, "externalIds", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_Links(), this.getLink(), null, "links", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_LocationUuids(), this.getUuidType(), "locationUuids", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_MemberOfOrganizations(), this.getUuidType(), "memberOfOrganizations", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_Props(), this.getProperty(), null, "props", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_Remarks(), this.getMarkupMultilineType(), "remarks", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_TelephoneNumbers(), this.getTelephoneNumber(), null, "telephoneNumbers", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_Type(), ecorePackage.getEString(), "type", null, 1, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Clazz(), ecorePackage.getEString(), "clazz", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Ns(), this.getUriType(), "ns", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceCitationEClass, ResourceCitation.class, "ResourceCitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceCitation_Props(), this.getProperty(), null, "props", null, 0, -1, ResourceCitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceCitation_Text(), this.getMarkupLineType(), "text", null, 1, 1, ResourceCitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceRlinkEClass, ResourceRlink.class, "ResourceRlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceRlink_EHref(), this.getUriReferenceType(), "eHref", null, 1, 1, ResourceRlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceRlink_Hashes(), this.getHash(), null, "hashes", null, 0, -1, ResourceRlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceRlink_MediaType(), ecorePackage.getEString(), "mediaType", null, 0, 1, ResourceRlink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsiblePartyEClass, ResponsibleParty.class, "ResponsibleParty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponsibleParty_Links(), this.getLink(), null, "links", null, 0, -1, ResponsibleParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsibleParty_PartyUuids(), this.getUuidType(), "partyUuids", null, 1, -1, ResponsibleParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibleParty_Props(), this.getProperty(), null, "props", null, 0, -1, ResponsibleParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsibleParty_Remarks(), this.getMarkupMultilineType(), "remarks", null, 0, 1, ResponsibleParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsibleParty_RoleId(), ecorePackage.getEString(), "roleId", null, 1, 1, ResponsibleParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsibleRoleEClass, ResponsibleRole.class, "ResponsibleRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponsibleRole_Links(), this.getLink(), null, "links", null, 0, -1, ResponsibleRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsibleRole_PartyUuids(), this.getUuidType(), "partyUuids", null, 0, -1, ResponsibleRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibleRole_Props(), this.getProperty(), null, "props", null, 0, -1, ResponsibleRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsibleRole_Remarks(), this.getMarkupMultilineType(), "remarks", null, 0, 1, ResponsibleRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponsibleRole_RoleId(), ecorePackage.getEString(), "roleId", null, 1, 1, ResponsibleRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevision_LastModified(), this.getDateTimeWithTzType(), "lastModified", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Links(), this.getLink(), null, "links", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_OscalVersion(), ecorePackage.getEString(), "oscalVersion", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Props(), this.getProperty(), null, "props", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Published(), this.getDateTimeWithTzType(), "published", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Remarks(), this.getMarkupMultilineType(), "remarks", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Title(), this.getMarkupLineType(), "title", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Version(), ecorePackage.getEString(), "version", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Description(), this.getMarkupMultilineType(), "description", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Id(), ecorePackage.getEString(), "id", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Links(), this.getLink(), null, "links", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Props(), this.getProperty(), null, "props", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Remarks(), this.getMarkupMultilineType(), "remarks", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Title(), this.getMarkupLineType(), "title", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(telephoneNumberEClass, TelephoneNumber.class, "TelephoneNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelephoneNumber_Type(), ecorePackage.getEString(), "type", null, 0, 1, TelephoneNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneNumber_Value(), ecorePackage.getEString(), "value", null, 0, 1, TelephoneNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uuidElementEClass, UUIDElement.class, "UUIDElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUUIDElement_Uuid(), this.getUuidType(), "uuid", null, 1, 1, UUIDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(base64TypeEDataType, gov.nist.secauto.metaschema.datatypes.Base64.class, "Base64Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimeTypeEDataType, DateTime.class, "DateTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimeWithTzTypeEDataType, ZonedDateTime.class, "DateTimeWithTzType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTypeEDataType, Date.class, "DateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateWithTzTypeEDataType, ZonedDateTime.class, "DateWithTzType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(emptyTypeEDataType, Void.class, "EmptyType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipV4AddressTypeEDataType, IPv4.class, "IpV4AddressType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipV6AddressTypeEDataType, IPv6.class, "IpV6AddressType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(markupLineTypeEDataType, MarkupLine.class, "MarkupLineType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(markupMultilineTypeEDataType, MarkupMultiline.class, "MarkupMultilineType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriReferenceTypeEDataType, URI.class, "UriReferenceType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriTypeEDataType, URI.class, "UriType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uuidTypeEDataType, UUID.class, "UuidType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Metaschema
		createMetaschemaAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Metaschema</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetaschemaAnnotations() {
		String source = "Metaschema";
		addAnnotation
		  (addressEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>address"
		   });
		addAnnotation
		  (getAddress_AddrLines(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>address.<FieldInstance>addr-line"
		   });
		addAnnotation
		  (getAddress_City(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>address.<FieldInstance>city"
		   });
		addAnnotation
		  (getAddress_Country(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>address.<FieldInstance>country"
		   });
		addAnnotation
		  (getAddress_PostalCode(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>address.<FieldInstance>postal-code"
		   });
		addAnnotation
		  (getAddress_State(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>address.<FieldInstance>state"
		   });
		addAnnotation
		  (getAddress_Type(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>address.<FlagInstance>location-type"
		   });
		addAnnotation
		  (annotationEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>annotation"
		   });
		addAnnotation
		  (getAnnotation_Name(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>annotation.<FlagInstance>name"
		   });
		addAnnotation
		  (getAnnotation_Ns(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>annotation.<FlagInstance>ns"
		   });
		addAnnotation
		  (getAnnotation_Remarks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>annotation.<FieldInstance>remarks"
		   });
		addAnnotation
		  (getAnnotation_Value(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>annotation.<FlagInstance>value"
		   });
		addAnnotation
		  (backMatterEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>back-matter"
		   });
		addAnnotation
		  (getBackMatter_Resources(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>resource"
		   });
		addAnnotation
		  (backMatterResourceEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>resource"
		   });
		addAnnotation
		  (getBackMatterResource_Base64(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>base64"
		   });
		addAnnotation
		  (getBackMatterResource_Citation(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>citation"
		   });
		addAnnotation
		  (getBackMatterResource_Description(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>resource.<FieldInstance>description"
		   });
		addAnnotation
		  (getBackMatterResource_DocumentIds(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>document-id"
		   });
		addAnnotation
		  (getBackMatterResource_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getBackMatterResource_Remarks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>resource.<FieldInstance>remarks"
		   });
		addAnnotation
		  (getBackMatterResource_Rlinks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>rlink"
		   });
		addAnnotation
		  (getBackMatterResource_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>resource.<FieldInstance>title"
		   });
		addAnnotation
		  (base64EClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>base64"
		   });
		addAnnotation
		  (getBase64_Filename(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>base64.<FlagInstance>filename"
		   });
		addAnnotation
		  (getBase64_MediaType(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>base64.<FlagInstance>media-type"
		   });
		addAnnotation
		  (documentIdEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>document-id"
		   });
		addAnnotation
		  (getDocumentId_Scheme(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>document-id.<FlagInstance>scheme"
		   });
		addAnnotation
		  (externalIdEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>external-id"
		   });
		addAnnotation
		  (getExternalId_Scheme(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>external-id.<FlagInstance>scheme"
		   });
		addAnnotation
		  (hashEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>hash"
		   });
		addAnnotation
		  (getHash_Algorithm(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>hash.<FlagInstance>algorithm"
		   });
		addAnnotation
		  (linkEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getLink_EHref(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link.<FlagInstance>href"
		   });
		addAnnotation
		  (getLink_MediaType(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link.<FlagInstance>media-type"
		   });
		addAnnotation
		  (getLink_Rel(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link.<FlagInstance>rel"
		   });
		addAnnotation
		  (getLink_Text(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link.<FieldInstance>text"
		   });
		addAnnotation
		  (locationEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>location"
		   });
		addAnnotation
		  (getLocation_Address(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>address"
		   });
		addAnnotation
		  (getLocation_EmailAddresses(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>location.<FieldInstance>email-address"
		   });
		addAnnotation
		  (getLocation_Links(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getLocation_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getLocation_Remarks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>location.<FieldInstance>remarks"
		   });
		addAnnotation
		  (getLocation_TelephoneNumbers(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>telephone-number"
		   });
		addAnnotation
		  (getLocation_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>location.<FieldInstance>title"
		   });
		addAnnotation
		  (getLocation_Urls(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>location.<FieldInstance>url"
		   });
		addAnnotation
		  (metadataEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>metadata"
		   });
		addAnnotation
		  (getMetadata_DocumentIds(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>document-id"
		   });
		addAnnotation
		  (getMetadata_LastModified(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>metadata.<FieldInstance>last-modified"
		   });
		addAnnotation
		  (getMetadata_Links(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getMetadata_Locations(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>location"
		   });
		addAnnotation
		  (getMetadata_OscalVersion(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>metadata.<FieldInstance>oscal-version"
		   });
		addAnnotation
		  (getMetadata_Parties(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>party"
		   });
		addAnnotation
		  (getMetadata_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getMetadata_Published(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>metadata.<FieldInstance>published"
		   });
		addAnnotation
		  (getMetadata_Remarks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>metadata.<FieldInstance>remarks"
		   });
		addAnnotation
		  (getMetadata_ResponsibleParties(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>responsible-party"
		   });
		addAnnotation
		  (getMetadata_Revisions(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>revision"
		   });
		addAnnotation
		  (getMetadata_Roles(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>role"
		   });
		addAnnotation
		  (getMetadata_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>metadata.<FieldInstance>title"
		   });
		addAnnotation
		  (getMetadata_Version(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>metadata.<FieldInstance>version"
		   });
		addAnnotation
		  (partyEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>party"
		   });
		addAnnotation
		  (getParty_Addresses(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>address"
		   });
		addAnnotation
		  (getParty_EmailAddresses(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>party.<FieldInstance>email-address"
		   });
		addAnnotation
		  (getParty_ExternalIds(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>external-id"
		   });
		addAnnotation
		  (getParty_Links(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getParty_LocationUuids(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>party.<FieldInstance>location-uuid"
		   });
		addAnnotation
		  (getParty_MemberOfOrganizations(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>party.<FieldInstance>member-of-organization"
		   });
		addAnnotation
		  (getParty_Name(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>party.<FieldInstance>name"
		   });
		addAnnotation
		  (getParty_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getParty_Remarks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>party.<FieldInstance>remarks"
		   });
		addAnnotation
		  (getParty_ShortName(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>party.<FieldInstance>short-name"
		   });
		addAnnotation
		  (getParty_TelephoneNumbers(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>telephone-number"
		   });
		addAnnotation
		  (getParty_Type(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>party.<FlagInstance>type"
		   });
		addAnnotation
		  (propertyEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getProperty_Clazz(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property.<FlagInstance>class"
		   });
		addAnnotation
		  (getProperty_Name(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property.<FlagInstance>name"
		   });
		addAnnotation
		  (getProperty_Ns(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property.<FlagInstance>ns"
		   });
		addAnnotation
		  (resourceCitationEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>citation"
		   });
		addAnnotation
		  (getResourceCitation_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getResourceCitation_Text(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>citation.<FieldInstance>text"
		   });
		addAnnotation
		  (resourceRlinkEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>rlink"
		   });
		addAnnotation
		  (getResourceRlink_EHref(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>rlink.<FlagInstance>href"
		   });
		addAnnotation
		  (getResourceRlink_Hashes(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>hash"
		   });
		addAnnotation
		  (getResourceRlink_MediaType(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>rlink.<FlagInstance>media-type"
		   });
		addAnnotation
		  (responsiblePartyEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>responsible-party"
		   });
		addAnnotation
		  (getResponsibleParty_Links(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getResponsibleParty_PartyUuids(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>responsible-party.<FieldInstance>party-uuid"
		   });
		addAnnotation
		  (getResponsibleParty_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getResponsibleParty_Remarks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>responsible-party.<FieldInstance>remarks"
		   });
		addAnnotation
		  (getResponsibleParty_RoleId(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>responsible-party.<FlagInstance>role-id"
		   });
		addAnnotation
		  (responsibleRoleEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>responsible-role"
		   });
		addAnnotation
		  (getResponsibleRole_Links(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getResponsibleRole_PartyUuids(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>responsible-role.<FieldInstance>party-uuid"
		   });
		addAnnotation
		  (getResponsibleRole_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getResponsibleRole_Remarks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>responsible-role.<FieldInstance>remarks"
		   });
		addAnnotation
		  (getResponsibleRole_RoleId(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>responsible-role.<FlagInstance>role-id"
		   });
		addAnnotation
		  (revisionEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>revision"
		   });
		addAnnotation
		  (getRevision_LastModified(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>revision.<FieldInstance>last-modified"
		   });
		addAnnotation
		  (getRevision_Links(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getRevision_OscalVersion(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>revision.<FieldInstance>oscal-version"
		   });
		addAnnotation
		  (getRevision_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getRevision_Published(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>revision.<FieldInstance>published"
		   });
		addAnnotation
		  (getRevision_Remarks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>revision.<FieldInstance>remarks"
		   });
		addAnnotation
		  (getRevision_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>revision.<FieldInstance>title"
		   });
		addAnnotation
		  (getRevision_Version(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>revision.<FieldInstance>version"
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>role"
		   });
		addAnnotation
		  (getRole_Description(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>role.<FieldInstance>description"
		   });
		addAnnotation
		  (getRole_Id(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>role.<FlagInstance>id"
		   });
		addAnnotation
		  (getRole_Links(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getRole_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (getRole_Remarks(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>role.<FieldInstance>remarks"
		   });
		addAnnotation
		  (getRole_ShortName(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>role.<FieldInstance>short-name"
		   });
		addAnnotation
		  (getRole_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>role.<FieldInstance>title"
		   });
		addAnnotation
		  (telephoneNumberEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>telephone-number"
		   });
		addAnnotation
		  (getTelephoneNumber_Type(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>telephone-number.<FlagInstance>type"
		   });
	}

} //OscalMetadataPackageImpl
