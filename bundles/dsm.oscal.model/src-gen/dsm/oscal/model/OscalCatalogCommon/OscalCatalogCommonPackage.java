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
package dsm.oscal.model.OscalCatalogCommon;

import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonFactory
 * @model kind="package"
 * @generated
 */
public interface OscalCatalogCommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OscalCatalogCommon";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://csrc.nist.gov/ns/oscal/1.0/oscal-catalog-common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oscal-catalog-common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OscalCatalogCommonPackage eINSTANCE = dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLAZZ = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEPENDS_ON = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LABEL = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__USAGE = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUES = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REMARKS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ANNOTATIONS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SELECT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Guidelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GUIDELINES = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LINKS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONSTRAINTS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PROPS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterConstraintImpl <em>Parameter Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterConstraintImpl
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameterConstraint()
	 * @generated
	 */
	int PARAMETER_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT__DESCRIPTION = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT__TESTS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_FEATURE_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_OPERATION_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterConstraintTestImpl <em>Parameter Constraint Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterConstraintTestImpl
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameterConstraintTest()
	 * @generated
	 */
	int PARAMETER_CONSTRAINT_TEST = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_TEST__EXPRESSION = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_TEST__REMARKS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Constraint Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_TEST_FEATURE_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Constraint Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONSTRAINT_TEST_OPERATION_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterGuidelineImpl <em>Parameter Guideline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterGuidelineImpl
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameterGuideline()
	 * @generated
	 */
	int PARAMETER_GUIDELINE = 3;

	/**
	 * The feature id for the '<em><b>Prose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE__PROSE = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE_FEATURE_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GUIDELINE_OPERATION_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterSelectionImpl <em>Parameter Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterSelectionImpl
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameterSelection()
	 * @generated
	 */
	int PARAMETER_SELECTION = 4;

	/**
	 * The feature id for the '<em><b>How Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SELECTION__HOW_MANY = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SELECTION__CHOICE = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SELECTION_FEATURE_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SELECTION_OPERATION_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.PartImpl
	 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getPart()
	 * @generated
	 */
	int PART = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ID = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__CLAZZ = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TITLE = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__PROSE = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ANNOTATIONS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__PARTS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__LINKS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__PROPS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalCatalogCommon.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getId()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getClazz()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Clazz();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends On</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getDependsOn()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DependsOn();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getLabel()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Label();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getUsage()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Usage();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getValues()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Values();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getRemarks()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Remarks();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getAnnotations()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Annotations();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getSelect()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Select();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getGuidelines <em>Guidelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guidelines</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getGuidelines()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Guidelines();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getLinks()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getConstraints()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter#getProps()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Props();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalCatalogCommon.ParameterConstraint <em>Parameter Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Constraint</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterConstraint
	 * @generated
	 */
	EClass getParameterConstraint();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.ParameterConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterConstraint#getDescription()
	 * @see #getParameterConstraint()
	 * @generated
	 */
	EAttribute getParameterConstraint_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.ParameterConstraint#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterConstraint#getTests()
	 * @see #getParameterConstraint()
	 * @generated
	 */
	EReference getParameterConstraint_Tests();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest <em>Parameter Constraint Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Constraint Test</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest
	 * @generated
	 */
	EClass getParameterConstraintTest();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest#getExpression()
	 * @see #getParameterConstraintTest()
	 * @generated
	 */
	EAttribute getParameterConstraintTest_Expression();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest#getRemarks()
	 * @see #getParameterConstraintTest()
	 * @generated
	 */
	EAttribute getParameterConstraintTest_Remarks();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalCatalogCommon.ParameterGuideline <em>Parameter Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Guideline</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterGuideline
	 * @generated
	 */
	EClass getParameterGuideline();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.ParameterGuideline#getProse <em>Prose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prose</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterGuideline#getProse()
	 * @see #getParameterGuideline()
	 * @generated
	 */
	EAttribute getParameterGuideline_Prose();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalCatalogCommon.ParameterSelection <em>Parameter Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Selection</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterSelection
	 * @generated
	 */
	EClass getParameterSelection();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.ParameterSelection#getHowMany <em>How Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>How Many</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterSelection#getHowMany()
	 * @see #getParameterSelection()
	 * @generated
	 */
	EAttribute getParameterSelection_HowMany();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.OscalCatalogCommon.ParameterSelection#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Choice</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterSelection#getChoice()
	 * @see #getParameterSelection()
	 * @generated
	 */
	EAttribute getParameterSelection_Choice();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalCatalogCommon.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Part#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getId()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Part#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Part#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getNs()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Ns();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Part#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getClazz()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Clazz();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Part#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getTitle()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Title();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalogCommon.Part#getProse <em>Prose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prose</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getProse()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Prose();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.Part#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getAnnotations()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.Part#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getParts()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.Part#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getLinks()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalogCommon.Part#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part#getProps()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Props();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OscalCatalogCommonFactory getOscalCatalogCommonFactory();

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
		 * The meta object literal for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterImpl
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ID = eINSTANCE.getParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CLAZZ = eINSTANCE.getParameter_Clazz();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEPENDS_ON = eINSTANCE.getParameter_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LABEL = eINSTANCE.getParameter_Label();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__USAGE = eINSTANCE.getParameter_Usage();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUES = eINSTANCE.getParameter_Values();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REMARKS = eINSTANCE.getParameter_Remarks();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__ANNOTATIONS = eINSTANCE.getParameter_Annotations();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__SELECT = eINSTANCE.getParameter_Select();

		/**
		 * The meta object literal for the '<em><b>Guidelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__GUIDELINES = eINSTANCE.getParameter_Guidelines();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__LINKS = eINSTANCE.getParameter_Links();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__CONSTRAINTS = eINSTANCE.getParameter_Constraints();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PROPS = eINSTANCE.getParameter_Props();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterConstraintImpl <em>Parameter Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterConstraintImpl
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameterConstraint()
		 * @generated
		 */
		EClass PARAMETER_CONSTRAINT = eINSTANCE.getParameterConstraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_CONSTRAINT__DESCRIPTION = eINSTANCE.getParameterConstraint_Description();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONSTRAINT__TESTS = eINSTANCE.getParameterConstraint_Tests();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterConstraintTestImpl <em>Parameter Constraint Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterConstraintTestImpl
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameterConstraintTest()
		 * @generated
		 */
		EClass PARAMETER_CONSTRAINT_TEST = eINSTANCE.getParameterConstraintTest();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_CONSTRAINT_TEST__EXPRESSION = eINSTANCE.getParameterConstraintTest_Expression();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_CONSTRAINT_TEST__REMARKS = eINSTANCE.getParameterConstraintTest_Remarks();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterGuidelineImpl <em>Parameter Guideline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterGuidelineImpl
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameterGuideline()
		 * @generated
		 */
		EClass PARAMETER_GUIDELINE = eINSTANCE.getParameterGuideline();

		/**
		 * The meta object literal for the '<em><b>Prose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_GUIDELINE__PROSE = eINSTANCE.getParameterGuideline_Prose();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.ParameterSelectionImpl <em>Parameter Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.ParameterSelectionImpl
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getParameterSelection()
		 * @generated
		 */
		EClass PARAMETER_SELECTION = eINSTANCE.getParameterSelection();

		/**
		 * The meta object literal for the '<em><b>How Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SELECTION__HOW_MANY = eINSTANCE.getParameterSelection_HowMany();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SELECTION__CHOICE = eINSTANCE.getParameterSelection_Choice();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalCatalogCommon.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.PartImpl
		 * @see dsm.oscal.model.OscalCatalogCommon.impl.OscalCatalogCommonPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__ID = eINSTANCE.getPart_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__NAME = eINSTANCE.getPart_Name();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__NS = eINSTANCE.getPart_Ns();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__CLAZZ = eINSTANCE.getPart_Clazz();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__TITLE = eINSTANCE.getPart_Title();

		/**
		 * The meta object literal for the '<em><b>Prose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__PROSE = eINSTANCE.getPart_Prose();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__ANNOTATIONS = eINSTANCE.getPart_Annotations();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__PARTS = eINSTANCE.getPart_Parts();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__LINKS = eINSTANCE.getPart_Links();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__PROPS = eINSTANCE.getPart_Props();

	}

} //OscalCatalogCommonPackage
