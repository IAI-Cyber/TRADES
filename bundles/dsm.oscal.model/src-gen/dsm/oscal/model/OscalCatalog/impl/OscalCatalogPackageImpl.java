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
package dsm.oscal.model.OscalCatalog.impl;

import dsm.TRADES.TRADESPackage;

import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalCatalog.Control;
import dsm.oscal.model.OscalCatalog.Group;
import dsm.oscal.model.OscalCatalog.OscalCatalogFactory;
import dsm.oscal.model.OscalCatalog.OscalCatalogPackage;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage;

import dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl;

import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;

import dsm.oscal.model.OscalMetadata.impl.OscalMetadataPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscalCatalogPackageImpl extends EPackageImpl implements OscalCatalogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

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
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OscalCatalogPackageImpl() {
		super(eNS_URI, OscalCatalogFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OscalCatalogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OscalCatalogPackage init() {
		if (isInited) return (OscalCatalogPackage)EPackage.Registry.INSTANCE.getEPackage(OscalCatalogPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOscalCatalogPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OscalCatalogPackageImpl theOscalCatalogPackage = registeredOscalCatalogPackage instanceof OscalCatalogPackageImpl ? (OscalCatalogPackageImpl)registeredOscalCatalogPackage : new OscalCatalogPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TRADESPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OscalMetadataPackage.eNS_URI);
		OscalMetadataPackageImpl theOscalMetadataPackage = (OscalMetadataPackageImpl)(registeredPackage instanceof OscalMetadataPackageImpl ? registeredPackage : OscalMetadataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OscalCatalogCommonPackage.eNS_URI);
		OscalCatalogCommonPackageImpl theOscalCatalogCommonPackage = (OscalCatalogCommonPackageImpl)(registeredPackage instanceof OscalCatalogCommonPackageImpl ? registeredPackage : OscalCatalogCommonPackage.eINSTANCE);

		// Create package meta-data objects
		theOscalCatalogPackage.createPackageContents();
		theOscalMetadataPackage.createPackageContents();
		theOscalCatalogCommonPackage.createPackageContents();

		// Initialize created meta-data
		theOscalCatalogPackage.initializePackageContents();
		theOscalMetadataPackage.initializePackageContents();
		theOscalCatalogCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOscalCatalogPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OscalCatalogPackage.eNS_URI, theOscalCatalogPackage);
		return theOscalCatalogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_BackMatter() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Groups() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Metadata() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Title() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Groups() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Title() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OscalCatalogFactory getOscalCatalogFactory() {
		return (OscalCatalogFactory)getEFactoryInstance();
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
		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__BACK_MATTER);
		createEReference(catalogEClass, CATALOG__GROUPS);
		createEReference(catalogEClass, CATALOG__METADATA);

		controlEClass = createEClass(CONTROL);
		createEAttribute(controlEClass, CONTROL__TITLE);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__GROUPS);
		createEAttribute(groupEClass, GROUP__TITLE);
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

		// Obtain other dependent packages
		OscalMetadataPackage theOscalMetadataPackage = (OscalMetadataPackage)EPackage.Registry.INSTANCE.getEPackage(OscalMetadataPackage.eNS_URI);
		TRADESPackage theTRADESPackage = (TRADESPackage)EPackage.Registry.INSTANCE.getEPackage(TRADESPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		catalogEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		catalogEClass.getESuperTypes().add(theOscalMetadataPackage.getUUIDElement());
		catalogEClass.getESuperTypes().add(theOscalMetadataPackage.getParameterOwner());
		catalogEClass.getESuperTypes().add(theOscalMetadataPackage.getControlOwner());
		catalogEClass.getESuperTypes().add(theTRADESPackage.getICatalogDefinition());
		controlEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		controlEClass.getESuperTypes().add(theOscalMetadataPackage.getParameterOwner());
		controlEClass.getESuperTypes().add(theOscalMetadataPackage.getPropertyOwner());
		controlEClass.getESuperTypes().add(theOscalMetadataPackage.getLinkOwner());
		controlEClass.getESuperTypes().add(theOscalMetadataPackage.getControlOwner());
		controlEClass.getESuperTypes().add(theOscalMetadataPackage.getPartOwner());
		controlEClass.getESuperTypes().add(theTRADESPackage.getIControlDefinition());
		controlEClass.getESuperTypes().add(theOscalMetadataPackage.getElementWithClazz());
		controlEClass.getESuperTypes().add(theOscalMetadataPackage.getElementWithId());
		groupEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		groupEClass.getESuperTypes().add(theOscalMetadataPackage.getParameterOwner());
		groupEClass.getESuperTypes().add(theOscalMetadataPackage.getPropertyOwner());
		groupEClass.getESuperTypes().add(theOscalMetadataPackage.getLinkOwner());
		groupEClass.getESuperTypes().add(theOscalMetadataPackage.getControlOwner());
		groupEClass.getESuperTypes().add(theOscalMetadataPackage.getPartOwner());
		groupEClass.getESuperTypes().add(theOscalMetadataPackage.getElementWithClazz());
		groupEClass.getESuperTypes().add(theOscalMetadataPackage.getElementWithId());

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_BackMatter(), theOscalMetadataPackage.getBackMatter(), null, "backMatter", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Groups(), this.getGroup(), null, "groups", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Metadata(), theOscalMetadataPackage.getMetadata(), null, "metadata", null, 1, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControl_Title(), theOscalMetadataPackage.getMarkupLineType(), "title", null, 1, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Groups(), this.getGroup(), null, "groups", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Title(), theOscalMetadataPackage.getMarkupLineType(), "title", null, 1, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (catalogEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>catalog"
		   });
		addAnnotation
		  (getCatalog_BackMatter(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>back-matter"
		   });
		addAnnotation
		  (getCatalog_Groups(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>group"
		   });
		addAnnotation
		  (getCatalog_Metadata(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>metadata"
		   });
		addAnnotation
		  (controlEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>control"
		   });
		addAnnotation
		  (getControl_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>control.<FieldInstance>title"
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>group"
		   });
		addAnnotation
		  (getGroup_Groups(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>group"
		   });
		addAnnotation
		  (getGroup_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>group.<FieldInstance>title"
		   });
	}

} //OscalCatalogPackageImpl
