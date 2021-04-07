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
	public EReference getCatalog_Metadata() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Params() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Controls() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_BackMatter() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Groups() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getControl_Id() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Clazz() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Title() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Annotations() {
		return (EReference)controlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Params() {
		return (EReference)controlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Parts() {
		return (EReference)controlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Links() {
		return (EReference)controlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Controls() {
		return (EReference)controlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_Props() {
		return (EReference)controlEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getGroup_Id() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Clazz() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Title() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Annotations() {
		return (EReference)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Params() {
		return (EReference)groupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Parts() {
		return (EReference)groupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Links() {
		return (EReference)groupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Controls() {
		return (EReference)groupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Groups() {
		return (EReference)groupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Props() {
		return (EReference)groupEClass.getEStructuralFeatures().get(9);
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
		createEReference(catalogEClass, CATALOG__METADATA);
		createEReference(catalogEClass, CATALOG__PARAMS);
		createEReference(catalogEClass, CATALOG__CONTROLS);
		createEReference(catalogEClass, CATALOG__BACK_MATTER);
		createEReference(catalogEClass, CATALOG__GROUPS);

		controlEClass = createEClass(CONTROL);
		createEAttribute(controlEClass, CONTROL__ID);
		createEAttribute(controlEClass, CONTROL__CLAZZ);
		createEAttribute(controlEClass, CONTROL__TITLE);
		createEReference(controlEClass, CONTROL__ANNOTATIONS);
		createEReference(controlEClass, CONTROL__PARAMS);
		createEReference(controlEClass, CONTROL__PARTS);
		createEReference(controlEClass, CONTROL__LINKS);
		createEReference(controlEClass, CONTROL__CONTROLS);
		createEReference(controlEClass, CONTROL__PROPS);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__ID);
		createEAttribute(groupEClass, GROUP__CLAZZ);
		createEAttribute(groupEClass, GROUP__TITLE);
		createEReference(groupEClass, GROUP__ANNOTATIONS);
		createEReference(groupEClass, GROUP__PARAMS);
		createEReference(groupEClass, GROUP__PARTS);
		createEReference(groupEClass, GROUP__LINKS);
		createEReference(groupEClass, GROUP__CONTROLS);
		createEReference(groupEClass, GROUP__GROUPS);
		createEReference(groupEClass, GROUP__PROPS);
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
		OscalCatalogCommonPackage theOscalCatalogCommonPackage = (OscalCatalogCommonPackage)EPackage.Registry.INSTANCE.getEPackage(OscalCatalogCommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		catalogEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		catalogEClass.getESuperTypes().add(theOscalMetadataPackage.getUUIDElement());
		controlEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		groupEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Metadata(), theOscalMetadataPackage.getMetadata(), null, "metadata", null, 1, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Params(), theOscalCatalogCommonPackage.getParameter(), null, "params", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Controls(), this.getControl(), null, "controls", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_BackMatter(), theOscalMetadataPackage.getBackMatter(), null, "backMatter", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Groups(), this.getGroup(), null, "groups", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControl_Id(), ecorePackage.getEString(), "id", null, 1, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Clazz(), ecorePackage.getEString(), "clazz", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Title(), theOscalMetadataPackage.getMarkupLineType(), "title", null, 1, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Annotations(), theOscalMetadataPackage.getAnnotation(), null, "annotations", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Params(), theOscalCatalogCommonPackage.getParameter(), null, "params", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Parts(), theOscalCatalogCommonPackage.getPart(), null, "parts", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Links(), theOscalMetadataPackage.getLink(), null, "links", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Controls(), this.getControl(), null, "controls", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_Props(), theOscalMetadataPackage.getProperty(), null, "props", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Id(), ecorePackage.getEString(), "id", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Clazz(), ecorePackage.getEString(), "clazz", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Title(), theOscalMetadataPackage.getMarkupLineType(), "title", null, 1, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Annotations(), theOscalMetadataPackage.getAnnotation(), null, "annotations", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Params(), theOscalCatalogCommonPackage.getParameter(), null, "params", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Parts(), theOscalCatalogCommonPackage.getPart(), null, "parts", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Links(), theOscalMetadataPackage.getLink(), null, "links", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Controls(), this.getControl(), null, "controls", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Groups(), this.getGroup(), null, "groups", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Props(), theOscalMetadataPackage.getProperty(), null, "props", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getCatalog_Metadata(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>metadata"
		   });
		addAnnotation
		  (getCatalog_Params(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter"
		   });
		addAnnotation
		  (getCatalog_Controls(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>control"
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
		  (controlEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>control"
		   });
		addAnnotation
		  (getControl_Id(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>control.<FlagInstance>id"
		   });
		addAnnotation
		  (getControl_Clazz(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>control.<FlagInstance>class"
		   });
		addAnnotation
		  (getControl_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>control.<FieldInstance>title"
		   });
		addAnnotation
		  (getControl_Annotations(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>annotation"
		   });
		addAnnotation
		  (getControl_Params(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter"
		   });
		addAnnotation
		  (getControl_Parts(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>part"
		   });
		addAnnotation
		  (getControl_Links(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getControl_Controls(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>control"
		   });
		addAnnotation
		  (getControl_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>group"
		   });
		addAnnotation
		  (getGroup_Id(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>group.<FlagInstance>id"
		   });
		addAnnotation
		  (getGroup_Clazz(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>group.<FlagInstance>class"
		   });
		addAnnotation
		  (getGroup_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>group.<FieldInstance>title"
		   });
		addAnnotation
		  (getGroup_Annotations(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>annotation"
		   });
		addAnnotation
		  (getGroup_Params(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter"
		   });
		addAnnotation
		  (getGroup_Parts(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>part"
		   });
		addAnnotation
		  (getGroup_Links(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<AssemblyDefinition>link"
		   });
		addAnnotation
		  (getGroup_Controls(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>control"
		   });
		addAnnotation
		  (getGroup_Groups(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog.<AssemblyDefinition>group"
		   });
		addAnnotation
		  (getGroup_Props(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-metadata.<FieldDefinition>property"
		   });
	}

} //OscalCatalogPackageImpl
