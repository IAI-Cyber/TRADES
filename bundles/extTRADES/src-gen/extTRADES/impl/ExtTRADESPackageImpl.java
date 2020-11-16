/**
 */
package extTRADES.impl;

import dsm.TRADES.TRADESPackage;

import extTRADES.ExtControl;
import extTRADES.ExtTRADESFactory;
import extTRADES.ExtTRADESPackage;
import extTRADES.extElement;
import extTRADES.extThreat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtTRADESPackageImpl extends EPackageImpl implements ExtTRADESPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extThreatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extControlEClass = null;

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
	 * @see extTRADES.ExtTRADESPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtTRADESPackageImpl() {
		super(eNS_URI, ExtTRADESFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtTRADESPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtTRADESPackage init() {
		if (isInited)
			return (ExtTRADESPackage) EPackage.Registry.INSTANCE.getEPackage(ExtTRADESPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExtTRADESPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExtTRADESPackageImpl theExtTRADESPackage = registeredExtTRADESPackage instanceof ExtTRADESPackageImpl
				? (ExtTRADESPackageImpl) registeredExtTRADESPackage
				: new ExtTRADESPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TRADESPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExtTRADESPackage.createPackageContents();

		// Initialize created meta-data
		theExtTRADESPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtTRADESPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtTRADESPackage.eNS_URI, theExtTRADESPackage);
		return theExtTRADESPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getextThreat() {
		return extThreatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getextElement() {
		return extElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getextElement_Source() {
		return (EAttribute) extElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getextElement_Link() {
		return (EAttribute) extElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtControl() {
		return extControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtTRADESFactory getExtTRADESFactory() {
		return (ExtTRADESFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		extThreatEClass = createEClass(EXT_THREAT);

		extElementEClass = createEClass(EXT_ELEMENT);
		createEAttribute(extElementEClass, EXT_ELEMENT__SOURCE);
		createEAttribute(extElementEClass, EXT_ELEMENT__LINK);

		extControlEClass = createEClass(EXT_CONTROL);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TRADESPackage theTRADESPackage = (TRADESPackage) EPackage.Registry.INSTANCE.getEPackage(TRADESPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extThreatEClass.getESuperTypes().add(theTRADESPackage.getThreat());
		extThreatEClass.getESuperTypes().add(this.getextElement());
		extControlEClass.getESuperTypes().add(theTRADESPackage.getControl());
		extControlEClass.getESuperTypes().add(this.getextElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(extThreatEClass, extThreat.class, "extThreat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(extElementEClass, extElement.class, "extElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getextElement_Source(), ecorePackage.getEString(), "source", null, 0, 1, extElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getextElement_Link(), ecorePackage.getEString(), "link", null, 0, 1, extElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extControlEClass, ExtControl.class, "ExtControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtTRADESPackageImpl
