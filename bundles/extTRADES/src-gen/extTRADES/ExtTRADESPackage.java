/**
 */
package extTRADES;

import dsm.TRADES.TRADESPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see extTRADES.ExtTRADESFactory
 * @model kind="package"
 * @generated
 */
public interface ExtTRADESPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extTRADES";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/extTRADES";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extTRADES";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtTRADESPackage eINSTANCE = extTRADES.impl.ExtTRADESPackageImpl.init();

	/**
	 * The meta object id for the '{@link extTRADES.impl.extThreatImpl <em>ext Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extTRADES.impl.extThreatImpl
	 * @see extTRADES.impl.ExtTRADESPackageImpl#getextThreat()
	 * @generated
	 */
	int EXT_THREAT = 0;

	/**
	 * The feature id for the '<em><b>Allocated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT__ALLOCATED = TRADESPackage.THREAT__ALLOCATED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT__NAME = TRADESPackage.THREAT__NAME;

	/**
	 * The feature id for the '<em><b>Threatallocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT__THREATALLOCATION = TRADESPackage.THREAT__THREATALLOCATION;

	/**
	 * The feature id for the '<em><b>Threat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT__THREAT_TYPE = TRADESPackage.THREAT__THREAT_TYPE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT__ID = TRADESPackage.THREAT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT__DESCRIPTION = TRADESPackage.THREAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT__APPLICABILITY = TRADESPackage.THREAT__APPLICABILITY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT__SOURCE = TRADESPackage.THREAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT__LINK = TRADESPackage.THREAT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ext Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT_FEATURE_COUNT = TRADESPackage.THREAT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ext Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_THREAT_OPERATION_COUNT = TRADESPackage.THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link extTRADES.impl.extElementImpl <em>ext Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extTRADES.impl.extElementImpl
	 * @see extTRADES.impl.ExtTRADESPackageImpl#getextElement()
	 * @generated
	 */
	int EXT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENT__LINK = 1;

	/**
	 * The number of structural features of the '<em>ext Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ext Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link extTRADES.impl.ExtControlImpl <em>Ext Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see extTRADES.impl.ExtControlImpl
	 * @see extTRADES.impl.ExtTRADESPackageImpl#getExtControl()
	 * @generated
	 */
	int EXT_CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Mitigates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONTROL__MITIGATES = TRADESPackage.CONTROL__MITIGATES;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONTROL__IMPLEMENTED_BY = TRADESPackage.CONTROL__IMPLEMENTED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONTROL__NAME = TRADESPackage.CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONTROL__ID = TRADESPackage.CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONTROL__DESCRIPTION = TRADESPackage.CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONTROL__SOURCE = TRADESPackage.CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONTROL__LINK = TRADESPackage.CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ext Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONTROL_FEATURE_COUNT = TRADESPackage.CONTROL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ext Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_CONTROL_OPERATION_COUNT = TRADESPackage.CONTROL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link extTRADES.extThreat <em>ext Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ext Threat</em>'.
	 * @see extTRADES.extThreat
	 * @generated
	 */
	EClass getextThreat();

	/**
	 * Returns the meta object for class '{@link extTRADES.extElement <em>ext Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ext Element</em>'.
	 * @see extTRADES.extElement
	 * @generated
	 */
	EClass getextElement();

	/**
	 * Returns the meta object for the attribute '{@link extTRADES.extElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see extTRADES.extElement#getSource()
	 * @see #getextElement()
	 * @generated
	 */
	EAttribute getextElement_Source();

	/**
	 * Returns the meta object for the attribute '{@link extTRADES.extElement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see extTRADES.extElement#getLink()
	 * @see #getextElement()
	 * @generated
	 */
	EAttribute getextElement_Link();

	/**
	 * Returns the meta object for class '{@link extTRADES.ExtControl <em>Ext Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ext Control</em>'.
	 * @see extTRADES.ExtControl
	 * @generated
	 */
	EClass getExtControl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtTRADESFactory getExtTRADESFactory();

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
		 * The meta object literal for the '{@link extTRADES.impl.extThreatImpl <em>ext Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extTRADES.impl.extThreatImpl
		 * @see extTRADES.impl.ExtTRADESPackageImpl#getextThreat()
		 * @generated
		 */
		EClass EXT_THREAT = eINSTANCE.getextThreat();

		/**
		 * The meta object literal for the '{@link extTRADES.impl.extElementImpl <em>ext Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extTRADES.impl.extElementImpl
		 * @see extTRADES.impl.ExtTRADESPackageImpl#getextElement()
		 * @generated
		 */
		EClass EXT_ELEMENT = eINSTANCE.getextElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXT_ELEMENT__SOURCE = eINSTANCE.getextElement_Source();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXT_ELEMENT__LINK = eINSTANCE.getextElement_Link();

		/**
		 * The meta object literal for the '{@link extTRADES.impl.ExtControlImpl <em>Ext Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see extTRADES.impl.ExtControlImpl
		 * @see extTRADES.impl.ExtTRADESPackageImpl#getExtControl()
		 * @generated
		 */
		EClass EXT_CONTROL = eINSTANCE.getExtControl();

	}

} //ExtTRADESPackage
