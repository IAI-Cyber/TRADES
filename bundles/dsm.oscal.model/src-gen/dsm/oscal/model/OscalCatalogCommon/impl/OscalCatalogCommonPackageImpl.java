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
package dsm.oscal.model.OscalCatalogCommon.impl;

import dsm.oscal.model.OscalCatalog.OscalCatalogPackage;

import dsm.oscal.model.OscalCatalog.impl.OscalCatalogPackageImpl;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonFactory;
import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage;
import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalCatalogCommon.ParameterConstraint;
import dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest;
import dsm.oscal.model.OscalCatalogCommon.ParameterGuideline;
import dsm.oscal.model.OscalCatalogCommon.ParameterSelection;
import dsm.oscal.model.OscalCatalogCommon.Part;

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
public class OscalCatalogCommonPackageImpl extends EPackageImpl implements OscalCatalogCommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterConstraintTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterGuidelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

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
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OscalCatalogCommonPackageImpl() {
		super(eNS_URI, OscalCatalogCommonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OscalCatalogCommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OscalCatalogCommonPackage init() {
		if (isInited) return (OscalCatalogCommonPackage)EPackage.Registry.INSTANCE.getEPackage(OscalCatalogCommonPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOscalCatalogCommonPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OscalCatalogCommonPackageImpl theOscalCatalogCommonPackage = registeredOscalCatalogCommonPackage instanceof OscalCatalogCommonPackageImpl ? (OscalCatalogCommonPackageImpl)registeredOscalCatalogCommonPackage : new OscalCatalogCommonPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OscalMetadataPackage.eNS_URI);
		OscalMetadataPackageImpl theOscalMetadataPackage = (OscalMetadataPackageImpl)(registeredPackage instanceof OscalMetadataPackageImpl ? registeredPackage : OscalMetadataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OscalCatalogPackage.eNS_URI);
		OscalCatalogPackageImpl theOscalCatalogPackage = (OscalCatalogPackageImpl)(registeredPackage instanceof OscalCatalogPackageImpl ? registeredPackage : OscalCatalogPackage.eINSTANCE);

		// Create package meta-data objects
		theOscalCatalogCommonPackage.createPackageContents();
		theOscalMetadataPackage.createPackageContents();
		theOscalCatalogPackage.createPackageContents();

		// Initialize created meta-data
		theOscalCatalogCommonPackage.initializePackageContents();
		theOscalMetadataPackage.initializePackageContents();
		theOscalCatalogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOscalCatalogCommonPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OscalCatalogCommonPackage.eNS_URI, theOscalCatalogCommonPackage);
		return theOscalCatalogCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Id() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_DependsOn() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Label() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Usage() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Values() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Select() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Guidelines() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Constraints() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterConstraint() {
		return parameterConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterConstraint_Description() {
		return (EAttribute)parameterConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterConstraint_Tests() {
		return (EReference)parameterConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterConstraintTest() {
		return parameterConstraintTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterConstraintTest_Expression() {
		return (EAttribute)parameterConstraintTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterGuideline() {
		return parameterGuidelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterGuideline_Prose() {
		return (EAttribute)parameterGuidelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterSelection() {
		return parameterSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterSelection_HowMany() {
		return (EAttribute)parameterSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterSelection_Choice() {
		return (EAttribute)parameterSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Id() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Name() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Ns() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Title() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPart_Prose() {
		return (EAttribute)partEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPart_Parts() {
		return (EReference)partEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OscalCatalogCommonFactory getOscalCatalogCommonFactory() {
		return (OscalCatalogCommonFactory)getEFactoryInstance();
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
		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__CONSTRAINTS);
		createEAttribute(parameterEClass, PARAMETER__DEPENDS_ON);
		createEReference(parameterEClass, PARAMETER__GUIDELINES);
		createEAttribute(parameterEClass, PARAMETER__ID);
		createEAttribute(parameterEClass, PARAMETER__LABEL);
		createEReference(parameterEClass, PARAMETER__SELECT);
		createEAttribute(parameterEClass, PARAMETER__USAGE);
		createEAttribute(parameterEClass, PARAMETER__VALUES);

		parameterConstraintEClass = createEClass(PARAMETER_CONSTRAINT);
		createEAttribute(parameterConstraintEClass, PARAMETER_CONSTRAINT__DESCRIPTION);
		createEReference(parameterConstraintEClass, PARAMETER_CONSTRAINT__TESTS);

		parameterConstraintTestEClass = createEClass(PARAMETER_CONSTRAINT_TEST);
		createEAttribute(parameterConstraintTestEClass, PARAMETER_CONSTRAINT_TEST__EXPRESSION);

		parameterGuidelineEClass = createEClass(PARAMETER_GUIDELINE);
		createEAttribute(parameterGuidelineEClass, PARAMETER_GUIDELINE__PROSE);

		parameterSelectionEClass = createEClass(PARAMETER_SELECTION);
		createEAttribute(parameterSelectionEClass, PARAMETER_SELECTION__CHOICE);
		createEAttribute(parameterSelectionEClass, PARAMETER_SELECTION__HOW_MANY);

		partEClass = createEClass(PART);
		createEAttribute(partEClass, PART__ID);
		createEAttribute(partEClass, PART__NAME);
		createEAttribute(partEClass, PART__NS);
		createEReference(partEClass, PART__PARTS);
		createEAttribute(partEClass, PART__PROSE);
		createEAttribute(partEClass, PART__TITLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		parameterEClass.getESuperTypes().add(theOscalMetadataPackage.getAnnotationOwner());
		parameterEClass.getESuperTypes().add(theOscalMetadataPackage.getPropertyOwner());
		parameterEClass.getESuperTypes().add(theOscalMetadataPackage.getLinkOwner());
		parameterEClass.getESuperTypes().add(theOscalMetadataPackage.getElementWithRemarks());
		parameterEClass.getESuperTypes().add(theOscalMetadataPackage.getElementWithClazz());
		parameterConstraintEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		parameterConstraintTestEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		parameterConstraintTestEClass.getESuperTypes().add(theOscalMetadataPackage.getElementWithRemarks());
		parameterGuidelineEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		parameterSelectionEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		partEClass.getESuperTypes().add(theOscalMetadataPackage.getOscalElement());
		partEClass.getESuperTypes().add(theOscalMetadataPackage.getAnnotationOwner());
		partEClass.getESuperTypes().add(theOscalMetadataPackage.getPropertyOwner());
		partEClass.getESuperTypes().add(theOscalMetadataPackage.getLinkOwner());
		partEClass.getESuperTypes().add(theOscalMetadataPackage.getElementWithClazz());

		// Initialize classes, features, and operations; add parameters
		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Constraints(), this.getParameterConstraint(), null, "constraints", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_DependsOn(), ecorePackage.getEString(), "dependsOn", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Guidelines(), this.getParameterGuideline(), null, "guidelines", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Id(), ecorePackage.getEString(), "id", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Label(), theOscalMetadataPackage.getMarkupLineType(), "label", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Select(), this.getParameterSelection(), null, "select", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Usage(), theOscalMetadataPackage.getMarkupMultilineType(), "usage", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Values(), ecorePackage.getEString(), "values", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterConstraintEClass, ParameterConstraint.class, "ParameterConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterConstraint_Description(), theOscalMetadataPackage.getMarkupMultilineType(), "description", null, 0, 1, ParameterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterConstraint_Tests(), this.getParameterConstraintTest(), null, "tests", null, 0, -1, ParameterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterConstraintTestEClass, ParameterConstraintTest.class, "ParameterConstraintTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterConstraintTest_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, ParameterConstraintTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterGuidelineEClass, ParameterGuideline.class, "ParameterGuideline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterGuideline_Prose(), theOscalMetadataPackage.getMarkupMultilineType(), "prose", null, 1, 1, ParameterGuideline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterSelectionEClass, ParameterSelection.class, "ParameterSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterSelection_Choice(), theOscalMetadataPackage.getMarkupLineType(), "choice", null, 0, -1, ParameterSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterSelection_HowMany(), ecorePackage.getEString(), "howMany", null, 0, 1, ParameterSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPart_Id(), ecorePackage.getEString(), "id", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_Name(), ecorePackage.getEString(), "name", null, 1, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_Ns(), theOscalMetadataPackage.getUriType(), "ns", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPart_Parts(), this.getPart(), null, "parts", null, 0, -1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_Prose(), theOscalMetadataPackage.getMarkupMultilineType(), "prose", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPart_Title(), theOscalMetadataPackage.getMarkupLineType(), "title", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (parameterEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter"
		   });
		addAnnotation
		  (getParameter_Constraints(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-constraint"
		   });
		addAnnotation
		  (getParameter_DependsOn(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter.<FlagInstance>depends-on"
		   });
		addAnnotation
		  (getParameter_Guidelines(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-guideline"
		   });
		addAnnotation
		  (getParameter_Id(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter.<FlagInstance>id"
		   });
		addAnnotation
		  (getParameter_Label(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter.<FieldInstance>label"
		   });
		addAnnotation
		  (getParameter_Select(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-selection"
		   });
		addAnnotation
		  (getParameter_Usage(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter.<FieldInstance>usage"
		   });
		addAnnotation
		  (getParameter_Values(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter.<FieldInstance>parameter-value"
		   });
		addAnnotation
		  (parameterConstraintEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-constraint"
		   });
		addAnnotation
		  (getParameterConstraint_Description(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-constraint.<FieldInstance>description"
		   });
		addAnnotation
		  (getParameterConstraint_Tests(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>test"
		   });
		addAnnotation
		  (parameterConstraintTestEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>test"
		   });
		addAnnotation
		  (getParameterConstraintTest_Expression(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>test.<FieldInstance>expression"
		   });
		addAnnotation
		  (parameterGuidelineEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-guideline"
		   });
		addAnnotation
		  (getParameterGuideline_Prose(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-guideline.<FieldInstance>prose"
		   });
		addAnnotation
		  (parameterSelectionEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-selection"
		   });
		addAnnotation
		  (getParameterSelection_Choice(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-selection.<FieldInstance>parameter-choice"
		   });
		addAnnotation
		  (getParameterSelection_HowMany(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>parameter-selection.<FlagInstance>how-many"
		   });
		addAnnotation
		  (partEClass,
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>part"
		   });
		addAnnotation
		  (getPart_Id(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>part.<FlagInstance>id"
		   });
		addAnnotation
		  (getPart_Name(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>part.<FlagInstance>name"
		   });
		addAnnotation
		  (getPart_Ns(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>part.<FlagInstance>ns"
		   });
		addAnnotation
		  (getPart_Parts(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>part"
		   });
		addAnnotation
		  (getPart_Prose(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>part.<FieldInstance>prose"
		   });
		addAnnotation
		  (getPart_Title(),
		   source,
		   new String[] {
			   "source", "<Metaschema>oscal-catalog-common.<AssemblyDefinition>part.<FieldInstance>title"
		   });
	}

} //OscalCatalogCommonPackageImpl
