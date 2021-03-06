/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */
package dsm.TRADES;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * <!-- begin-model-doc -->
 * TRADES model, by Israel Aerospace Industries. All rights reserved.
 * 
 * The TRADES model, based on Threat and Risk assessment ontology and the TRADES model-based methodology.
 * <!-- end-model-doc -->
 * @see dsm.TRADES.TRADESFactory
 * @model kind="package"
 * @generated
 */
public interface TRADESPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TRADES";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsm.TRADES";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TRADES";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TRADESPackage eINSTANCE = dsm.TRADES.impl.TRADESPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ComponentOwnerImpl <em>Component Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ComponentOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponentOwner()
	 * @generated
	 */
	int COMPONENT_OWNER = 14;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OWNER__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Component Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AnalysisImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__COMPONENTS = COMPONENT_OWNER__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Data Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DATA_OWNER = COMPONENT_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NAME = COMPONENT_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__CONTROL_OWNER = COMPONENT_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Score System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__SCORE_SYSTEM = COMPONENT_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Threat Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__THREAT_OWNER = COMPONENT_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Catalogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__CATALOGS = COMPONENT_OWNER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = COMPONENT_OWNER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_DATAS = COMPONENT_OWNER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inherited Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_INHERITED_DATAS = COMPONENT_OWNER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_ALL_DATAS = COMPONENT_OWNER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___GET_ALL_CONTROLS = COMPONENT_OWNER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = COMPONENT_OWNER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.NamedElementImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ThreatImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Threat Allocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__THREAT_ALLOCATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__THREAT_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ID = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__APPLICABILITY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Check Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ComponentImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENTS = COMPONENT_OWNER__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Data Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA_OWNER = COMPONENT_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = COMPONENT_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTROL_OWNER = COMPONENT_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threat Allocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__THREAT_ALLOCATIONS = COMPONENT_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Affect Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AFFECT_RELATIONS = COMPONENT_OWNER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = COMPONENT_OWNER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_DATAS = COMPONENT_OWNER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Inherited Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_INHERITED_DATAS = COMPONENT_OWNER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_ALL_DATAS = COMPONENT_OWNER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_ALL_CONTROLS = COMPONENT_OWNER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = COMPONENT_OWNER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ControlImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mitigated Threats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MITIGATED_THREATS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mitigation Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MITIGATION_RELATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ThreatAllocationRelationImpl <em>Threat Allocation Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ThreatAllocationRelationImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatAllocationRelation()
	 * @generated
	 */
	int THREAT_ALLOCATION_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__ASSESSMENT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__THREAT = 2;

	/**
	 * The feature id for the '<em><b>Impact Score</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__IMPACT_SCORE = 3;

	/**
	 * The feature id for the '<em><b>Difficulty Score</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE = 4;

	/**
	 * The feature id for the '<em><b>Attack Chain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__ATTACK_CHAIN = 5;

	/**
	 * The number of structural features of the '<em>Threat Allocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Check Computed Difficulty Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION___CHECK_COMPUTED_DIFFICULTY_CONSTRAINT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Threat Allocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ThreatMitigationRelationImpl <em>Threat Mitigation Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ThreatMitigationRelationImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatMitigationRelation()
	 * @generated
	 */
	int THREAT_MITIGATION_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__ASSESSMENT = 0;

	/**
	 * The feature id for the '<em><b>Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__THREAT = 2;

	/**
	 * The feature id for the '<em><b>Mitigated Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Threat Mitigation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Threat Mitigation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DataImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AffectRelationImpl <em>Affect Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AffectRelationImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAffectRelation()
	 * @generated
	 */
	int AFFECT_RELATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__DATA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__SOURCE_COMPONENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__TARGET_COMPONENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Analysis Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__ANALYSIS_STATUS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Affect Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Check Data Scope</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION___CHECK_DATA_SCOPE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Affect Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AttackChainImpl <em>Attack Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AttackChainImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChain()
	 * @generated
	 */
	int ATTACK_CHAIN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attackchain Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__ATTACKCHAIN_STEPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Computed Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__COMPUTED_DIFFICULTY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attack Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attack Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AttackChainStepImpl <em>Attack Chain Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AttackChainStepImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChainStep()
	 * @generated
	 */
	int ATTACK_CHAIN_STEP = 9;

	/**
	 * The feature id for the '<em><b>Step Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__STEP_NUM = 0;

	/**
	 * The feature id for the '<em><b>Threat Allocation Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Impact Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__NEXT = 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__PREVIOUS = 4;

	/**
	 * The number of structural features of the '<em>Attack Chain Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Threat Allocation Relation Candidates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP___GET_THREAT_ALLOCATION_RELATION_CANDIDATES = 0;

	/**
	 * The operation id for the '<em>Check Allocation Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP___CHECK_ALLOCATION_VALUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Attack Chain Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ScoreSystemImpl <em>Score System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ScoreSystemImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getScoreSystem()
	 * @generated
	 */
	int SCORE_SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Impact Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__IMPACT_SCORES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Difficulty Scores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__DIFFICULTY_SCORES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Score System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Score System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ImpactScoreImpl <em>Impact Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ImpactScoreImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getImpactScore()
	 * @generated
	 */
	int IMPACT_SCORE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE__IMPACT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE__CONFIGURATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Impact Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Impact Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DifficultyScoreImpl <em>Difficulty Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DifficultyScoreImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getDifficultyScore()
	 * @generated
	 */
	int DIFFICULTY_SCORE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE__DIFFICULTY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Difficulty Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Difficulty Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DataOwnerElementImpl <em>Data Owner Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DataOwnerElementImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getDataOwnerElement()
	 * @generated
	 */
	int DATA_OWNER_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Data Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT__DATA_OWNER = 0;

	/**
	 * The number of structural features of the '<em>Data Owner Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT___GET_DATAS = 0;

	/**
	 * The operation id for the '<em>Get Inherited Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT___GET_INHERITED_DATAS = 1;

	/**
	 * The operation id for the '<em>Get All Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT___GET_ALL_DATAS = 2;

	/**
	 * The number of operations of the '<em>Data Owner Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_ELEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ExternalThreatImpl <em>External Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ExternalThreatImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalThreat()
	 * @generated
	 */
	int EXTERNAL_THREAT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__NAME = THREAT__NAME;

	/**
	 * The feature id for the '<em><b>Threat Allocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__THREAT_ALLOCATIONS = THREAT__THREAT_ALLOCATIONS;

	/**
	 * The feature id for the '<em><b>Threat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__THREAT_TYPE = THREAT__THREAT_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__ID = THREAT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__DESCRIPTION = THREAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__APPLICABILITY = THREAT__APPLICABILITY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__SOURCE = THREAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT__LINK = THREAT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT_FEATURE_COUNT = THREAT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP = THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>External Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_THREAT_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ExternalElementImpl <em>External Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ExternalElementImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalElement()
	 * @generated
	 */
	int EXTERNAL_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT__LINK = 1;

	/**
	 * The number of structural features of the '<em>External Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ImpactConfigurationImpl <em>Impact Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ImpactConfigurationImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getImpactConfiguration()
	 * @generated
	 */
	int IMPACT_CONFIGURATION = 18;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION__DIFFICULTY = 0;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION__IMPACT = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Impact Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Impact Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ExternalControlImpl <em>External Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ExternalControlImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalControl()
	 * @generated
	 */
	int EXTERNAL_CONTROL = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__SOURCE = EXTERNAL_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__LINK = EXTERNAL_ELEMENT__LINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__NAME = EXTERNAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mitigated Threats</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__MITIGATED_THREATS = EXTERNAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__ID = EXTERNAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__DESCRIPTION = EXTERNAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mitigation Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL__MITIGATION_RELATIONS = EXTERNAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>External Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL_FEATURE_COUNT = EXTERNAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>External Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONTROL_OPERATION_COUNT = EXTERNAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ThreatsOwnerImpl <em>Threats Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ThreatsOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatsOwner()
	 * @generated
	 */
	int THREATS_OWNER = 20;

	/**
	 * The feature id for the '<em><b>Internals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_OWNER__INTERNALS = 0;

	/**
	 * The feature id for the '<em><b>Externals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_OWNER__EXTERNALS = 1;

	/**
	 * The number of structural features of the '<em>Threats Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_OWNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Threats Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREATS_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ControlOwnerImpl <em>Control Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ControlOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getControlOwner()
	 * @generated
	 */
	int CONTROL_OWNER = 21;

	/**
	 * The feature id for the '<em><b>Internals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OWNER__INTERNALS = 0;

	/**
	 * The feature id for the '<em><b>Externals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OWNER__EXTERNALS = 1;

	/**
	 * The number of structural features of the '<em>Control Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OWNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AbstractControlOwnerImpl <em>Abstract Control Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AbstractControlOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractControlOwner()
	 * @generated
	 */
	int ABSTRACT_CONTROL_OWNER = 22;

	/**
	 * The feature id for the '<em><b>Control Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROL_OWNER__CONTROL_OWNER = 0;

	/**
	 * The number of structural features of the '<em>Abstract Control Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROL_OWNER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get All Controls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS = 0;

	/**
	 * The number of operations of the '<em>Abstract Control Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROL_OWNER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DataOwnerImpl <em>Data Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DataOwnerImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getDataOwner()
	 * @generated
	 */
	int DATA_OWNER = 23;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER__DATA = 0;

	/**
	 * The number of structural features of the '<em>Data Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.AssessmentENUM <em>Assessment ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.AssessmentENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAssessmentENUM()
	 * @generated
	 */
	int ASSESSMENT_ENUM = 24;

	/**
	 * The meta object id for the '{@link dsm.TRADES.AffectedENUM <em>Affected ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.AffectedENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAffectedENUM()
	 * @generated
	 */
	int AFFECTED_ENUM = 25;

	/**
	 * The meta object id for the '{@link dsm.TRADES.threatTypeENUM <em>threat Type ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.threatTypeENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getthreatTypeENUM()
	 * @generated
	 */
	int THREAT_TYPE_ENUM = 26;

	/**
	 * The meta object id for the '<em>RGB Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.RGBColor
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getRGBColor()
	 * @generated
	 */
	int RGB_COLOR = 27;

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see dsm.TRADES.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.Analysis#getScoreSystem <em>Score System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Score System</em>'.
	 * @see dsm.TRADES.Analysis#getScoreSystem()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_ScoreSystem();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.Analysis#getThreatOwner <em>Threat Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Threat Owner</em>'.
	 * @see dsm.TRADES.Analysis#getThreatOwner()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_ThreatOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getCatalogs <em>Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalogs</em>'.
	 * @see dsm.TRADES.Analysis#getCatalogs()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Catalogs();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see dsm.TRADES.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Threat#getThreatAllocations <em>Threat Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threat Allocations</em>'.
	 * @see dsm.TRADES.Threat#getThreatAllocations()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_ThreatAllocations();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Threat#getThreatType <em>Threat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threat Type</em>'.
	 * @see dsm.TRADES.Threat#getThreatType()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_ThreatType();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Threat#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.TRADES.Threat#getId()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Threat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.TRADES.Threat#getDescription()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Description();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Threat#getApplicability <em>Applicability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicability</em>'.
	 * @see dsm.TRADES.Threat#getApplicability()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Applicability();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.Threat#checkIsUsed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Is Used</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Is Used</em>' operation.
	 * @see dsm.TRADES.Threat#checkIsUsed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getThreat__CheckIsUsed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see dsm.TRADES.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getThreatAllocations <em>Threat Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threat Allocations</em>'.
	 * @see dsm.TRADES.Component#getThreatAllocations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ThreatAllocations();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getAffectRelations <em>Affect Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affect Relations</em>'.
	 * @see dsm.TRADES.Component#getAffectRelations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AffectRelations();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see dsm.TRADES.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Control#getMitigatedThreats <em>Mitigated Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mitigated Threats</em>'.
	 * @see dsm.TRADES.Control#getMitigatedThreats()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_MitigatedThreats();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Control#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.TRADES.Control#getId()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Control#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.TRADES.Control#getDescription()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Control#getMitigationRelations <em>Mitigation Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mitigation Relations</em>'.
	 * @see dsm.TRADES.Control#getMitigationRelations()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_MitigationRelations();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ThreatAllocationRelation <em>Threat Allocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat Allocation Relation</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation
	 * @generated
	 */
	EClass getThreatAllocationRelation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ThreatAllocationRelation#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getAssessment()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EAttribute getThreatAllocationRelation_Assessment();

	/**
	 * Returns the meta object for the container reference '{@link dsm.TRADES.ThreatAllocationRelation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getComponent()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_Component();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatAllocationRelation#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threat</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getThreat()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_Threat();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatAllocationRelation#getImpactScore <em>Impact Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impact Score</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getImpactScore()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_ImpactScore();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatAllocationRelation#getDifficultyScore <em>Difficulty Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Difficulty Score</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getDifficultyScore()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_DifficultyScore();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.ThreatAllocationRelation#getAttackChain <em>Attack Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attack Chain</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getAttackChain()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_AttackChain();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.ThreatAllocationRelation#checkComputedDifficultyConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Computed Difficulty Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Computed Difficulty Constraint</em>' operation.
	 * @see dsm.TRADES.ThreatAllocationRelation#checkComputedDifficultyConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getThreatAllocationRelation__CheckComputedDifficultyConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ThreatMitigationRelation <em>Threat Mitigation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat Mitigation Relation</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation
	 * @generated
	 */
	EClass getThreatMitigationRelation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ThreatMitigationRelation#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getAssessment()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EAttribute getThreatMitigationRelation_Assessment();

	/**
	 * Returns the meta object for the container reference '{@link dsm.TRADES.ThreatMitigationRelation#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Control</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getControl()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EReference getThreatMitigationRelation_Control();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatMitigationRelation#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threat</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getThreat()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EReference getThreatMitigationRelation_Threat();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatMitigationRelation#getMitigatedAllocation <em>Mitigated Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mitigated Allocation</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getMitigatedAllocation()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EReference getThreatMitigationRelation_MitigatedAllocation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ThreatMitigationRelation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getDescription()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EAttribute getThreatMitigationRelation_Description();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see dsm.TRADES.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AffectRelation <em>Affect Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affect Relation</em>'.
	 * @see dsm.TRADES.AffectRelation
	 * @generated
	 */
	EClass getAffectRelation();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AffectRelation#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see dsm.TRADES.AffectRelation#getData()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EReference getAffectRelation_Data();

	/**
	 * Returns the meta object for the container reference '{@link dsm.TRADES.AffectRelation#getSourceComponent <em>Source Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Component</em>'.
	 * @see dsm.TRADES.AffectRelation#getSourceComponent()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EReference getAffectRelation_SourceComponent();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.AffectRelation#getTargetComponent <em>Target Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Component</em>'.
	 * @see dsm.TRADES.AffectRelation#getTargetComponent()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EReference getAffectRelation_TargetComponent();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AffectRelation#getAnalysisStatus <em>Analysis Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Status</em>'.
	 * @see dsm.TRADES.AffectRelation#getAnalysisStatus()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EAttribute getAffectRelation_AnalysisStatus();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.AffectRelation#checkDataScope(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Data Scope</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Data Scope</em>' operation.
	 * @see dsm.TRADES.AffectRelation#checkDataScope(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAffectRelation__CheckDataScope__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AttackChain <em>Attack Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Chain</em>'.
	 * @see dsm.TRADES.AttackChain
	 * @generated
	 */
	EClass getAttackChain();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.AttackChain#getAttackchainSteps <em>Attackchain Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attackchain Steps</em>'.
	 * @see dsm.TRADES.AttackChain#getAttackchainSteps()
	 * @see #getAttackChain()
	 * @generated
	 */
	EReference getAttackChain_AttackchainSteps();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AttackChain#getComputedDifficulty <em>Computed Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computed Difficulty</em>'.
	 * @see dsm.TRADES.AttackChain#getComputedDifficulty()
	 * @see #getAttackChain()
	 * @generated
	 */
	EAttribute getAttackChain_ComputedDifficulty();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AttackChainStep <em>Attack Chain Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Chain Step</em>'.
	 * @see dsm.TRADES.AttackChainStep
	 * @generated
	 */
	EClass getAttackChainStep();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AttackChainStep#getStepNum <em>Step Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Num</em>'.
	 * @see dsm.TRADES.AttackChainStep#getStepNum()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EAttribute getAttackChainStep_StepNum();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.AttackChainStep#getThreatAllocationRelation <em>Threat Allocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threat Allocation Relation</em>'.
	 * @see dsm.TRADES.AttackChainStep#getThreatAllocationRelation()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EReference getAttackChainStep_ThreatAllocationRelation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AttackChainStep#getImpactDescription <em>Impact Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact Description</em>'.
	 * @see dsm.TRADES.AttackChainStep#getImpactDescription()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EAttribute getAttackChainStep_ImpactDescription();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AttackChainStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see dsm.TRADES.AttackChainStep#getNext()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EReference getAttackChainStep_Next();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AttackChainStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous</em>'.
	 * @see dsm.TRADES.AttackChainStep#getPrevious()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EReference getAttackChainStep_Previous();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.AttackChainStep#getThreatAllocationRelationCandidates() <em>Get Threat Allocation Relation Candidates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Threat Allocation Relation Candidates</em>' operation.
	 * @see dsm.TRADES.AttackChainStep#getThreatAllocationRelationCandidates()
	 * @generated
	 */
	EOperation getAttackChainStep__GetThreatAllocationRelationCandidates();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.AttackChainStep#checkAllocationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Allocation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Allocation Value</em>' operation.
	 * @see dsm.TRADES.AttackChainStep#checkAllocationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAttackChainStep__CheckAllocationValue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ScoreSystem <em>Score System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score System</em>'.
	 * @see dsm.TRADES.ScoreSystem
	 * @generated
	 */
	EClass getScoreSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ScoreSystem#getImpactScores <em>Impact Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impact Scores</em>'.
	 * @see dsm.TRADES.ScoreSystem#getImpactScores()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EReference getScoreSystem_ImpactScores();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ScoreSystem#getDifficultyScores <em>Difficulty Scores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difficulty Scores</em>'.
	 * @see dsm.TRADES.ScoreSystem#getDifficultyScores()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EReference getScoreSystem_DifficultyScores();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ImpactScore <em>Impact Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact Score</em>'.
	 * @see dsm.TRADES.ImpactScore
	 * @generated
	 */
	EClass getImpactScore();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ImpactScore#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact</em>'.
	 * @see dsm.TRADES.ImpactScore#getImpact()
	 * @see #getImpactScore()
	 * @generated
	 */
	EAttribute getImpactScore_Impact();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ImpactScore#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see dsm.TRADES.ImpactScore#getConfigurations()
	 * @see #getImpactScore()
	 * @generated
	 */
	EReference getImpactScore_Configurations();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.DifficultyScore <em>Difficulty Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difficulty Score</em>'.
	 * @see dsm.TRADES.DifficultyScore
	 * @generated
	 */
	EClass getDifficultyScore();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.DifficultyScore#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see dsm.TRADES.DifficultyScore#getDifficulty()
	 * @see #getDifficultyScore()
	 * @generated
	 */
	EAttribute getDifficultyScore_Difficulty();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.DataOwnerElement <em>Data Owner Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Owner Element</em>'.
	 * @see dsm.TRADES.DataOwnerElement
	 * @generated
	 */
	EClass getDataOwnerElement();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.DataOwnerElement#getDataOwner <em>Data Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Owner</em>'.
	 * @see dsm.TRADES.DataOwnerElement#getDataOwner()
	 * @see #getDataOwnerElement()
	 * @generated
	 */
	EReference getDataOwnerElement_DataOwner();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.DataOwnerElement#getDatas() <em>Get Datas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Datas</em>' operation.
	 * @see dsm.TRADES.DataOwnerElement#getDatas()
	 * @generated
	 */
	EOperation getDataOwnerElement__GetDatas();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.DataOwnerElement#getInheritedDatas() <em>Get Inherited Datas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inherited Datas</em>' operation.
	 * @see dsm.TRADES.DataOwnerElement#getInheritedDatas()
	 * @generated
	 */
	EOperation getDataOwnerElement__GetInheritedDatas();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.DataOwnerElement#getAllDatas() <em>Get All Datas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Datas</em>' operation.
	 * @see dsm.TRADES.DataOwnerElement#getAllDatas()
	 * @generated
	 */
	EOperation getDataOwnerElement__GetAllDatas();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ComponentOwner <em>Component Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Owner</em>'.
	 * @see dsm.TRADES.ComponentOwner
	 * @generated
	 */
	EClass getComponentOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ComponentOwner#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see dsm.TRADES.ComponentOwner#getComponents()
	 * @see #getComponentOwner()
	 * @generated
	 */
	EReference getComponentOwner_Components();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see dsm.TRADES.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ExternalThreat <em>External Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Threat</em>'.
	 * @see dsm.TRADES.ExternalThreat
	 * @generated
	 */
	EClass getExternalThreat();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ExternalElement <em>External Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Element</em>'.
	 * @see dsm.TRADES.ExternalElement
	 * @generated
	 */
	EClass getExternalElement();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ExternalElement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see dsm.TRADES.ExternalElement#getSource()
	 * @see #getExternalElement()
	 * @generated
	 */
	EAttribute getExternalElement_Source();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ExternalElement#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see dsm.TRADES.ExternalElement#getLink()
	 * @see #getExternalElement()
	 * @generated
	 */
	EAttribute getExternalElement_Link();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ImpactConfiguration <em>Impact Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact Configuration</em>'.
	 * @see dsm.TRADES.ImpactConfiguration
	 * @generated
	 */
	EClass getImpactConfiguration();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ImpactConfiguration#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Difficulty</em>'.
	 * @see dsm.TRADES.ImpactConfiguration#getDifficulty()
	 * @see #getImpactConfiguration()
	 * @generated
	 */
	EReference getImpactConfiguration_Difficulty();

	/**
	 * Returns the meta object for the container reference '{@link dsm.TRADES.ImpactConfiguration#getImpact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Impact</em>'.
	 * @see dsm.TRADES.ImpactConfiguration#getImpact()
	 * @see #getImpactConfiguration()
	 * @generated
	 */
	EReference getImpactConfiguration_Impact();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ImpactConfiguration#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see dsm.TRADES.ImpactConfiguration#getColor()
	 * @see #getImpactConfiguration()
	 * @generated
	 */
	EAttribute getImpactConfiguration_Color();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ExternalControl <em>External Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Control</em>'.
	 * @see dsm.TRADES.ExternalControl
	 * @generated
	 */
	EClass getExternalControl();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ThreatsOwner <em>Threats Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threats Owner</em>'.
	 * @see dsm.TRADES.ThreatsOwner
	 * @generated
	 */
	EClass getThreatsOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ThreatsOwner#getInternals <em>Internals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internals</em>'.
	 * @see dsm.TRADES.ThreatsOwner#getInternals()
	 * @see #getThreatsOwner()
	 * @generated
	 */
	EReference getThreatsOwner_Internals();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ThreatsOwner#getExternals <em>Externals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Externals</em>'.
	 * @see dsm.TRADES.ThreatsOwner#getExternals()
	 * @see #getThreatsOwner()
	 * @generated
	 */
	EReference getThreatsOwner_Externals();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.ControlOwner <em>Control Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Owner</em>'.
	 * @see dsm.TRADES.ControlOwner
	 * @generated
	 */
	EClass getControlOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ControlOwner#getInternals <em>Internals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internals</em>'.
	 * @see dsm.TRADES.ControlOwner#getInternals()
	 * @see #getControlOwner()
	 * @generated
	 */
	EReference getControlOwner_Internals();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ControlOwner#getExternals <em>Externals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Externals</em>'.
	 * @see dsm.TRADES.ControlOwner#getExternals()
	 * @see #getControlOwner()
	 * @generated
	 */
	EReference getControlOwner_Externals();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.AbstractControlOwner <em>Abstract Control Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Control Owner</em>'.
	 * @see dsm.TRADES.AbstractControlOwner
	 * @generated
	 */
	EClass getAbstractControlOwner();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.AbstractControlOwner#getControlOwner <em>Control Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Owner</em>'.
	 * @see dsm.TRADES.AbstractControlOwner#getControlOwner()
	 * @see #getAbstractControlOwner()
	 * @generated
	 */
	EReference getAbstractControlOwner_ControlOwner();

	/**
	 * Returns the meta object for the '{@link dsm.TRADES.AbstractControlOwner#getAllControls() <em>Get All Controls</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Controls</em>' operation.
	 * @see dsm.TRADES.AbstractControlOwner#getAllControls()
	 * @generated
	 */
	EOperation getAbstractControlOwner__GetAllControls();

	/**
	 * Returns the meta object for class '{@link dsm.TRADES.DataOwner <em>Data Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Owner</em>'.
	 * @see dsm.TRADES.DataOwner
	 * @generated
	 */
	EClass getDataOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.DataOwner#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see dsm.TRADES.DataOwner#getData()
	 * @see #getDataOwner()
	 * @generated
	 */
	EReference getDataOwner_Data();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.AssessmentENUM <em>Assessment ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assessment ENUM</em>'.
	 * @see dsm.TRADES.AssessmentENUM
	 * @generated
	 */
	EEnum getAssessmentENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.AffectedENUM <em>Affected ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Affected ENUM</em>'.
	 * @see dsm.TRADES.AffectedENUM
	 * @generated
	 */
	EEnum getAffectedENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.TRADES.threatTypeENUM <em>threat Type ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>threat Type ENUM</em>'.
	 * @see dsm.TRADES.threatTypeENUM
	 * @generated
	 */
	EEnum getthreatTypeENUM();

	/**
	 * Returns the meta object for data type '{@link dsm.TRADES.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RGB Color</em>'.
	 * @see dsm.TRADES.RGBColor
	 * @model instanceClass="dsm.TRADES.RGBColor"
	 * @generated
	 */
	EDataType getRGBColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TRADESFactory getTRADESFactory();

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
		 * The meta object literal for the '{@link dsm.TRADES.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AnalysisImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '<em><b>Score System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__SCORE_SYSTEM = eINSTANCE.getAnalysis_ScoreSystem();

		/**
		 * The meta object literal for the '<em><b>Threat Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__THREAT_OWNER = eINSTANCE.getAnalysis_ThreatOwner();

		/**
		 * The meta object literal for the '<em><b>Catalogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__CATALOGS = eINSTANCE.getAnalysis_Catalogs();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ThreatImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Threat Allocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__THREAT_ALLOCATIONS = eINSTANCE.getThreat_ThreatAllocations();

		/**
		 * The meta object literal for the '<em><b>Threat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__THREAT_TYPE = eINSTANCE.getThreat_ThreatType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__ID = eINSTANCE.getThreat_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__DESCRIPTION = eINSTANCE.getThreat_Description();

		/**
		 * The meta object literal for the '<em><b>Applicability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__APPLICABILITY = eINSTANCE.getThreat_Applicability();

		/**
		 * The meta object literal for the '<em><b>Check Is Used</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getThreat__CheckIsUsed__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ComponentImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Threat Allocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__THREAT_ALLOCATIONS = eINSTANCE.getComponent_ThreatAllocations();

		/**
		 * The meta object literal for the '<em><b>Affect Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__AFFECT_RELATIONS = eINSTANCE.getComponent_AffectRelations();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ControlImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Mitigated Threats</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MITIGATED_THREATS = eINSTANCE.getControl_MitigatedThreats();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__ID = eINSTANCE.getControl_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__DESCRIPTION = eINSTANCE.getControl_Description();

		/**
		 * The meta object literal for the '<em><b>Mitigation Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MITIGATION_RELATIONS = eINSTANCE.getControl_MitigationRelations();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ThreatAllocationRelationImpl <em>Threat Allocation Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ThreatAllocationRelationImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatAllocationRelation()
		 * @generated
		 */
		EClass THREAT_ALLOCATION_RELATION = eINSTANCE.getThreatAllocationRelation();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_ALLOCATION_RELATION__ASSESSMENT = eINSTANCE.getThreatAllocationRelation_Assessment();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__COMPONENT = eINSTANCE.getThreatAllocationRelation_Component();

		/**
		 * The meta object literal for the '<em><b>Threat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__THREAT = eINSTANCE.getThreatAllocationRelation_Threat();

		/**
		 * The meta object literal for the '<em><b>Impact Score</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__IMPACT_SCORE = eINSTANCE.getThreatAllocationRelation_ImpactScore();

		/**
		 * The meta object literal for the '<em><b>Difficulty Score</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__DIFFICULTY_SCORE = eINSTANCE
				.getThreatAllocationRelation_DifficultyScore();

		/**
		 * The meta object literal for the '<em><b>Attack Chain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__ATTACK_CHAIN = eINSTANCE.getThreatAllocationRelation_AttackChain();

		/**
		 * The meta object literal for the '<em><b>Check Computed Difficulty Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THREAT_ALLOCATION_RELATION___CHECK_COMPUTED_DIFFICULTY_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getThreatAllocationRelation__CheckComputedDifficultyConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ThreatMitigationRelationImpl <em>Threat Mitigation Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ThreatMitigationRelationImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatMitigationRelation()
		 * @generated
		 */
		EClass THREAT_MITIGATION_RELATION = eINSTANCE.getThreatMitigationRelation();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_MITIGATION_RELATION__ASSESSMENT = eINSTANCE.getThreatMitigationRelation_Assessment();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MITIGATION_RELATION__CONTROL = eINSTANCE.getThreatMitigationRelation_Control();

		/**
		 * The meta object literal for the '<em><b>Threat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MITIGATION_RELATION__THREAT = eINSTANCE.getThreatMitigationRelation_Threat();

		/**
		 * The meta object literal for the '<em><b>Mitigated Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION = eINSTANCE
				.getThreatMitigationRelation_MitigatedAllocation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_MITIGATION_RELATION__DESCRIPTION = eINSTANCE.getThreatMitigationRelation_Description();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.DataImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AffectRelationImpl <em>Affect Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AffectRelationImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAffectRelation()
		 * @generated
		 */
		EClass AFFECT_RELATION = eINSTANCE.getAffectRelation();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECT_RELATION__DATA = eINSTANCE.getAffectRelation_Data();

		/**
		 * The meta object literal for the '<em><b>Source Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECT_RELATION__SOURCE_COMPONENT = eINSTANCE.getAffectRelation_SourceComponent();

		/**
		 * The meta object literal for the '<em><b>Target Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECT_RELATION__TARGET_COMPONENT = eINSTANCE.getAffectRelation_TargetComponent();

		/**
		 * The meta object literal for the '<em><b>Analysis Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECT_RELATION__ANALYSIS_STATUS = eINSTANCE.getAffectRelation_AnalysisStatus();

		/**
		 * The meta object literal for the '<em><b>Check Data Scope</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AFFECT_RELATION___CHECK_DATA_SCOPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAffectRelation__CheckDataScope__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AttackChainImpl <em>Attack Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AttackChainImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChain()
		 * @generated
		 */
		EClass ATTACK_CHAIN = eINSTANCE.getAttackChain();

		/**
		 * The meta object literal for the '<em><b>Attackchain Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN__ATTACKCHAIN_STEPS = eINSTANCE.getAttackChain_AttackchainSteps();

		/**
		 * The meta object literal for the '<em><b>Computed Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_CHAIN__COMPUTED_DIFFICULTY = eINSTANCE.getAttackChain_ComputedDifficulty();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AttackChainStepImpl <em>Attack Chain Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AttackChainStepImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChainStep()
		 * @generated
		 */
		EClass ATTACK_CHAIN_STEP = eINSTANCE.getAttackChainStep();

		/**
		 * The meta object literal for the '<em><b>Step Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_CHAIN_STEP__STEP_NUM = eINSTANCE.getAttackChainStep_StepNum();

		/**
		 * The meta object literal for the '<em><b>Threat Allocation Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION = eINSTANCE
				.getAttackChainStep_ThreatAllocationRelation();

		/**
		 * The meta object literal for the '<em><b>Impact Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION = eINSTANCE.getAttackChainStep_ImpactDescription();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN_STEP__NEXT = eINSTANCE.getAttackChainStep_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN_STEP__PREVIOUS = eINSTANCE.getAttackChainStep_Previous();

		/**
		 * The meta object literal for the '<em><b>Get Threat Allocation Relation Candidates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTACK_CHAIN_STEP___GET_THREAT_ALLOCATION_RELATION_CANDIDATES = eINSTANCE
				.getAttackChainStep__GetThreatAllocationRelationCandidates();

		/**
		 * The meta object literal for the '<em><b>Check Allocation Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTACK_CHAIN_STEP___CHECK_ALLOCATION_VALUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAttackChainStep__CheckAllocationValue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ScoreSystemImpl <em>Score System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ScoreSystemImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getScoreSystem()
		 * @generated
		 */
		EClass SCORE_SYSTEM = eINSTANCE.getScoreSystem();

		/**
		 * The meta object literal for the '<em><b>Impact Scores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE_SYSTEM__IMPACT_SCORES = eINSTANCE.getScoreSystem_ImpactScores();

		/**
		 * The meta object literal for the '<em><b>Difficulty Scores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE_SYSTEM__DIFFICULTY_SCORES = eINSTANCE.getScoreSystem_DifficultyScores();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ImpactScoreImpl <em>Impact Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ImpactScoreImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getImpactScore()
		 * @generated
		 */
		EClass IMPACT_SCORE = eINSTANCE.getImpactScore();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPACT_SCORE__IMPACT = eINSTANCE.getImpactScore_Impact();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT_SCORE__CONFIGURATIONS = eINSTANCE.getImpactScore_Configurations();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.DifficultyScoreImpl <em>Difficulty Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.DifficultyScoreImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getDifficultyScore()
		 * @generated
		 */
		EClass DIFFICULTY_SCORE = eINSTANCE.getDifficultyScore();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFICULTY_SCORE__DIFFICULTY = eINSTANCE.getDifficultyScore_Difficulty();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.DataOwnerElementImpl <em>Data Owner Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.DataOwnerElementImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getDataOwnerElement()
		 * @generated
		 */
		EClass DATA_OWNER_ELEMENT = eINSTANCE.getDataOwnerElement();

		/**
		 * The meta object literal for the '<em><b>Data Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OWNER_ELEMENT__DATA_OWNER = eINSTANCE.getDataOwnerElement_DataOwner();

		/**
		 * The meta object literal for the '<em><b>Get Datas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OWNER_ELEMENT___GET_DATAS = eINSTANCE.getDataOwnerElement__GetDatas();

		/**
		 * The meta object literal for the '<em><b>Get Inherited Datas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OWNER_ELEMENT___GET_INHERITED_DATAS = eINSTANCE.getDataOwnerElement__GetInheritedDatas();

		/**
		 * The meta object literal for the '<em><b>Get All Datas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_OWNER_ELEMENT___GET_ALL_DATAS = eINSTANCE.getDataOwnerElement__GetAllDatas();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ComponentOwnerImpl <em>Component Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ComponentOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponentOwner()
		 * @generated
		 */
		EClass COMPONENT_OWNER = eINSTANCE.getComponentOwner();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_OWNER__COMPONENTS = eINSTANCE.getComponentOwner_Components();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.NamedElementImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ExternalThreatImpl <em>External Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ExternalThreatImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalThreat()
		 * @generated
		 */
		EClass EXTERNAL_THREAT = eINSTANCE.getExternalThreat();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ExternalElementImpl <em>External Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ExternalElementImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalElement()
		 * @generated
		 */
		EClass EXTERNAL_ELEMENT = eINSTANCE.getExternalElement();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ELEMENT__SOURCE = eINSTANCE.getExternalElement_Source();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ELEMENT__LINK = eINSTANCE.getExternalElement_Link();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ImpactConfigurationImpl <em>Impact Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ImpactConfigurationImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getImpactConfiguration()
		 * @generated
		 */
		EClass IMPACT_CONFIGURATION = eINSTANCE.getImpactConfiguration();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT_CONFIGURATION__DIFFICULTY = eINSTANCE.getImpactConfiguration_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT_CONFIGURATION__IMPACT = eINSTANCE.getImpactConfiguration_Impact();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPACT_CONFIGURATION__COLOR = eINSTANCE.getImpactConfiguration_Color();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ExternalControlImpl <em>External Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ExternalControlImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getExternalControl()
		 * @generated
		 */
		EClass EXTERNAL_CONTROL = eINSTANCE.getExternalControl();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ThreatsOwnerImpl <em>Threats Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ThreatsOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getThreatsOwner()
		 * @generated
		 */
		EClass THREATS_OWNER = eINSTANCE.getThreatsOwner();

		/**
		 * The meta object literal for the '<em><b>Internals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREATS_OWNER__INTERNALS = eINSTANCE.getThreatsOwner_Internals();

		/**
		 * The meta object literal for the '<em><b>Externals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREATS_OWNER__EXTERNALS = eINSTANCE.getThreatsOwner_Externals();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.ControlOwnerImpl <em>Control Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ControlOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getControlOwner()
		 * @generated
		 */
		EClass CONTROL_OWNER = eINSTANCE.getControlOwner();

		/**
		 * The meta object literal for the '<em><b>Internals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_OWNER__INTERNALS = eINSTANCE.getControlOwner_Internals();

		/**
		 * The meta object literal for the '<em><b>Externals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_OWNER__EXTERNALS = eINSTANCE.getControlOwner_Externals();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AbstractControlOwnerImpl <em>Abstract Control Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AbstractControlOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAbstractControlOwner()
		 * @generated
		 */
		EClass ABSTRACT_CONTROL_OWNER = eINSTANCE.getAbstractControlOwner();

		/**
		 * The meta object literal for the '<em><b>Control Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTROL_OWNER__CONTROL_OWNER = eINSTANCE.getAbstractControlOwner_ControlOwner();

		/**
		 * The meta object literal for the '<em><b>Get All Controls</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS = eINSTANCE.getAbstractControlOwner__GetAllControls();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.DataOwnerImpl <em>Data Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.DataOwnerImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getDataOwner()
		 * @generated
		 */
		EClass DATA_OWNER = eINSTANCE.getDataOwner();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OWNER__DATA = eINSTANCE.getDataOwner_Data();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.AssessmentENUM <em>Assessment ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.AssessmentENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAssessmentENUM()
		 * @generated
		 */
		EEnum ASSESSMENT_ENUM = eINSTANCE.getAssessmentENUM();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.AffectedENUM <em>Affected ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.AffectedENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAffectedENUM()
		 * @generated
		 */
		EEnum AFFECTED_ENUM = eINSTANCE.getAffectedENUM();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.threatTypeENUM <em>threat Type ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.threatTypeENUM
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getthreatTypeENUM()
		 * @generated
		 */
		EEnum THREAT_TYPE_ENUM = eINSTANCE.getthreatTypeENUM();

		/**
		 * The meta object literal for the '<em>RGB Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.RGBColor
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getRGBColor()
		 * @generated
		 */
		EDataType RGB_COLOR = eINSTANCE.getRGBColor();

	}

} //TRADESPackage
