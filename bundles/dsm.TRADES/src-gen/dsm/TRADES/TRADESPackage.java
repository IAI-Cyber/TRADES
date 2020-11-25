/**
 */
package dsm.TRADES;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link dsm.TRADES.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AnalysisImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__THREAT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NAME = 3;

	/**
	 * The feature id for the '<em><b>Threatallocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__THREATALLOCATION = 4;

	/**
	 * The feature id for the '<em><b>Threatmitigation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__THREATMITIGATION = 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__DATA = 6;

	/**
	 * The feature id for the '<em><b>Affectrelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__AFFECTRELATION = 7;

	/**
	 * The feature id for the '<em><b>Analysisdiagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ANALYSISDIAGRAM = 8;

	/**
	 * The feature id for the '<em><b>Attackchain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__ATTACKCHAIN = 9;

	/**
	 * The feature id for the '<em><b>Scoresystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__SCORESYSTEM = 10;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Allocated</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ALLOCATED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Threatallocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__THREATALLOCATION = 2;

	/**
	 * The feature id for the '<em><b>Threat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__THREAT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__ID = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__APPLICABILITY = 6;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Allocated Threat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALLOCATED_THREAT = 0;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Threatallocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__THREATALLOCATION = 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA = 5;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTROL = 6;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANALYSIS = 7;

	/**
	 * The feature id for the '<em><b>Affectrelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AFFECTRELATION = 8;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__THREAT = 9;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Mitigates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MITIGATES = 0;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__IMPLEMENTED_BY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__ASSESSMENT = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__THREAT = 3;

	/**
	 * The feature id for the '<em><b>Impactscore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__IMPACTSCORE = 4;

	/**
	 * The feature id for the '<em><b>Difficultyscore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE = 5;

	/**
	 * The feature id for the '<em><b>Threat Decomposed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__THREAT_DECOMPOSED = 6;

	/**
	 * The feature id for the '<em><b>Threat Related</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__THREAT_RELATED = 7;

	/**
	 * The feature id for the '<em><b>Attackinfo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION__ATTACKINFO = 8;

	/**
	 * The number of structural features of the '<em>Threat Allocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Threat Allocation Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_ALLOCATION_RELATION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__ASSESSMENT = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__THREAT = 3;

	/**
	 * The feature id for the '<em><b>Mitigates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_MITIGATION_RELATION__MITIGATES = 4;

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
	int DATA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__DATA = 0;

	/**
	 * The feature id for the '<em><b>Source Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__SOURCE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__TARGET_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Analysis Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION__ANALYSIS_STATUS = 4;

	/**
	 * The number of structural features of the '<em>Affect Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Affect Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECT_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AnalysisDiagramImpl <em>Analysis Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AnalysisDiagramImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAnalysisDiagram()
	 * @generated
	 */
	int ANALYSIS_DIAGRAM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DIAGRAM__THREAT = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DIAGRAM__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DIAGRAM__CONTROL = 3;

	/**
	 * The number of structural features of the '<em>Analysis Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Analysis Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AttackChainImpl <em>Attack Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AttackChainImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChain()
	 * @generated
	 */
	int ATTACK_CHAIN = 9;

	/**
	 * The feature id for the '<em><b>Attackchainstep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__ATTACKCHAINSTEP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN__END = 3;

	/**
	 * The number of structural features of the '<em>Attack Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attack Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AttackChainStepImpl <em>Attack Chain Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AttackChainStepImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackChainStep()
	 * @generated
	 */
	int ATTACK_CHAIN_STEP = 10;

	/**
	 * The feature id for the '<em><b>Step Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__STEP_NUM = 0;

	/**
	 * The feature id for the '<em><b>Threatallocationrelation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__THREATALLOCATIONRELATION = 1;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__DIFFICULTY = 2;

	/**
	 * The feature id for the '<em><b>Impact Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Nexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__NEXTS = 4;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP__PREVIOUS = 5;

	/**
	 * The number of structural features of the '<em>Attack Chain Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attack Chain Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_CHAIN_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ScoreSystemImpl <em>Score System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ScoreSystemImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getScoreSystem()
	 * @generated
	 */
	int SCORE_SYSTEM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Impactscore</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__IMPACTSCORE = 1;

	/**
	 * The feature id for the '<em><b>Difficultyscore</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM__DIFFICULTYSCORE = 2;

	/**
	 * The number of structural features of the '<em>Score System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Score System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.ImpactScoreImpl <em>Impact Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.ImpactScoreImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getImpactScore()
	 * @generated
	 */
	int IMPACT_SCORE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE__IMPACT = 1;

	/**
	 * The number of structural features of the '<em>Impact Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Impact Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_SCORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.DifficultyScoreImpl <em>Difficulty Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.DifficultyScoreImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getDifficultyScore()
	 * @generated
	 */
	int DIFFICULTY_SCORE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE__DIFFICULTY = 1;

	/**
	 * The number of structural features of the '<em>Difficulty Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Difficulty Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_SCORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.impl.AttackInfoImpl <em>Attack Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.impl.AttackInfoImpl
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackInfo()
	 * @generated
	 */
	int ATTACK_INFO = 14;

	/**
	 * The feature id for the '<em><b>Step Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_INFO__STEP_NUM = 0;

	/**
	 * The feature id for the '<em><b>Attack Vector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_INFO__ATTACK_VECTOR = 1;

	/**
	 * The number of structural features of the '<em>Attack Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attack Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.TRADES.AssessmentENUM <em>Assessment ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.AssessmentENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAssessmentENUM()
	 * @generated
	 */
	int ASSESSMENT_ENUM = 15;

	/**
	 * The meta object id for the '{@link dsm.TRADES.AffectedENUM <em>Affected ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.AffectedENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getAffectedENUM()
	 * @generated
	 */
	int AFFECTED_ENUM = 16;

	/**
	 * The meta object id for the '{@link dsm.TRADES.threatTypeENUM <em>threat Type ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.TRADES.threatTypeENUM
	 * @see dsm.TRADES.impl.TRADESPackageImpl#getthreatTypeENUM()
	 * @generated
	 */
	int THREAT_TYPE_ENUM = 17;

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
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threat</em>'.
	 * @see dsm.TRADES.Analysis#getThreat()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Threat();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see dsm.TRADES.Analysis#getComponent()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see dsm.TRADES.Analysis#getControl()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Control();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Analysis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.Analysis#getName()
	 * @see #getAnalysis()
	 * @generated
	 */
	EAttribute getAnalysis_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getThreatallocation <em>Threatallocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threatallocation</em>'.
	 * @see dsm.TRADES.Analysis#getThreatallocation()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Threatallocation();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getThreatmitigation <em>Threatmitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threatmitigation</em>'.
	 * @see dsm.TRADES.Analysis#getThreatmitigation()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Threatmitigation();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see dsm.TRADES.Analysis#getData()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getAffectrelation <em>Affectrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affectrelation</em>'.
	 * @see dsm.TRADES.Analysis#getAffectrelation()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Affectrelation();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getAnalysisdiagram <em>Analysisdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysisdiagram</em>'.
	 * @see dsm.TRADES.Analysis#getAnalysisdiagram()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Analysisdiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Analysis#getAttackchain <em>Attackchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attackchain</em>'.
	 * @see dsm.TRADES.Analysis#getAttackchain()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Attackchain();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.TRADES.Analysis#getScoresystem <em>Scoresystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoresystem</em>'.
	 * @see dsm.TRADES.Analysis#getScoresystem()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Scoresystem();

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
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Threat#getAllocated <em>Allocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated</em>'.
	 * @see dsm.TRADES.Threat#getAllocated()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Allocated();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Threat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.Threat#getName()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Name();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Threat#getThreatallocation <em>Threatallocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threatallocation</em>'.
	 * @see dsm.TRADES.Threat#getThreatallocation()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Threatallocation();

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
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Threat#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see dsm.TRADES.Threat#getID()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_ID();

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
	 * Returns the meta object for class '{@link dsm.TRADES.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see dsm.TRADES.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getAllocatedThreat <em>Allocated Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated Threat</em>'.
	 * @see dsm.TRADES.Component#getAllocatedThreat()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AllocatedThreat();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see dsm.TRADES.Component#getImplements()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Implements();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Component#getThreatallocation <em>Threatallocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threatallocation</em>'.
	 * @see dsm.TRADES.Component#getThreatallocation()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Threatallocation();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see dsm.TRADES.Component#getComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see dsm.TRADES.Component#getData()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see dsm.TRADES.Component#getControl()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysis</em>'.
	 * @see dsm.TRADES.Component#getAnalysis()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Analysis();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getAffectrelation <em>Affectrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affectrelation</em>'.
	 * @see dsm.TRADES.Component#getAffectrelation()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Affectrelation();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.Component#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threat</em>'.
	 * @see dsm.TRADES.Component#getThreat()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Threat();

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
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Control#getMitigates <em>Mitigates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mitigates</em>'.
	 * @see dsm.TRADES.Control#getMitigates()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Mitigates();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.Control#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented By</em>'.
	 * @see dsm.TRADES.Control#getImplementedBy()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_ImplementedBy();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Control#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.Control#getName()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Control#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see dsm.TRADES.Control#getID()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_ID();

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
	 * Returns the meta object for class '{@link dsm.TRADES.ThreatAllocationRelation <em>Threat Allocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat Allocation Relation</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation
	 * @generated
	 */
	EClass getThreatAllocationRelation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ThreatAllocationRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getName()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EAttribute getThreatAllocationRelation_Name();

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
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatAllocationRelation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
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
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatAllocationRelation#getImpactscore <em>Impactscore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impactscore</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getImpactscore()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_Impactscore();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatAllocationRelation#getDifficultyscore <em>Difficultyscore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Difficultyscore</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getDifficultyscore()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_Difficultyscore();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ThreatAllocationRelation#getThreatDecomposed <em>Threat Decomposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threat Decomposed</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getThreatDecomposed()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_ThreatDecomposed();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.ThreatAllocationRelation#getThreatRelated <em>Threat Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threat Related</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getThreatRelated()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_ThreatRelated();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ThreatAllocationRelation#getAttackinfo <em>Attackinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attackinfo</em>'.
	 * @see dsm.TRADES.ThreatAllocationRelation#getAttackinfo()
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	EReference getThreatAllocationRelation_Attackinfo();

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
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ThreatMitigationRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getName()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EAttribute getThreatMitigationRelation_Name();

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
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatMitigationRelation#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
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
	 * Returns the meta object for the reference '{@link dsm.TRADES.ThreatMitigationRelation#getMitigates <em>Mitigates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mitigates</em>'.
	 * @see dsm.TRADES.ThreatMitigationRelation#getMitigates()
	 * @see #getThreatMitigationRelation()
	 * @generated
	 */
	EReference getThreatMitigationRelation_Mitigates();

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
	 * Returns the meta object for the attribute '{@link dsm.TRADES.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

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
	 * Returns the meta object for the reference '{@link dsm.TRADES.AffectRelation#getSourceComponent <em>Source Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Component</em>'.
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
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AffectRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.AffectRelation#getName()
	 * @see #getAffectRelation()
	 * @generated
	 */
	EAttribute getAffectRelation_Name();

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
	 * Returns the meta object for class '{@link dsm.TRADES.AnalysisDiagram <em>Analysis Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Diagram</em>'.
	 * @see dsm.TRADES.AnalysisDiagram
	 * @generated
	 */
	EClass getAnalysisDiagram();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AnalysisDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.AnalysisDiagram#getName()
	 * @see #getAnalysisDiagram()
	 * @generated
	 */
	EAttribute getAnalysisDiagram_Name();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AnalysisDiagram#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Threat</em>'.
	 * @see dsm.TRADES.AnalysisDiagram#getThreat()
	 * @see #getAnalysisDiagram()
	 * @generated
	 */
	EReference getAnalysisDiagram_Threat();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AnalysisDiagram#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see dsm.TRADES.AnalysisDiagram#getComponent()
	 * @see #getAnalysisDiagram()
	 * @generated
	 */
	EReference getAnalysisDiagram_Component();

	/**
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AnalysisDiagram#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control</em>'.
	 * @see dsm.TRADES.AnalysisDiagram#getControl()
	 * @see #getAnalysisDiagram()
	 * @generated
	 */
	EReference getAnalysisDiagram_Control();

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
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.AttackChain#getAttackchainstep <em>Attackchainstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attackchainstep</em>'.
	 * @see dsm.TRADES.AttackChain#getAttackchainstep()
	 * @see #getAttackChain()
	 * @generated
	 */
	EReference getAttackChain_Attackchainstep();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AttackChain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.AttackChain#getName()
	 * @see #getAttackChain()
	 * @generated
	 */
	EAttribute getAttackChain_Name();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.AttackChain#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see dsm.TRADES.AttackChain#getStart()
	 * @see #getAttackChain()
	 * @generated
	 */
	EReference getAttackChain_Start();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.AttackChain#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see dsm.TRADES.AttackChain#getEnd()
	 * @see #getAttackChain()
	 * @generated
	 */
	EReference getAttackChain_End();

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
	 * Returns the meta object for the reference '{@link dsm.TRADES.AttackChainStep#getThreatallocationrelation <em>Threatallocationrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threatallocationrelation</em>'.
	 * @see dsm.TRADES.AttackChainStep#getThreatallocationrelation()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EReference getAttackChainStep_Threatallocationrelation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AttackChainStep#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see dsm.TRADES.AttackChainStep#getDifficulty()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EAttribute getAttackChainStep_Difficulty();

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
	 * Returns the meta object for the reference list '{@link dsm.TRADES.AttackChainStep#getNexts <em>Nexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nexts</em>'.
	 * @see dsm.TRADES.AttackChainStep#getNexts()
	 * @see #getAttackChainStep()
	 * @generated
	 */
	EReference getAttackChainStep_Nexts();

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
	 * Returns the meta object for class '{@link dsm.TRADES.ScoreSystem <em>Score System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score System</em>'.
	 * @see dsm.TRADES.ScoreSystem
	 * @generated
	 */
	EClass getScoreSystem();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ScoreSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.ScoreSystem#getName()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EAttribute getScoreSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ScoreSystem#getImpactscore <em>Impactscore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impactscore</em>'.
	 * @see dsm.TRADES.ScoreSystem#getImpactscore()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EReference getScoreSystem_Impactscore();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.TRADES.ScoreSystem#getDifficultyscore <em>Difficultyscore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difficultyscore</em>'.
	 * @see dsm.TRADES.ScoreSystem#getDifficultyscore()
	 * @see #getScoreSystem()
	 * @generated
	 */
	EReference getScoreSystem_Difficultyscore();

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
	 * Returns the meta object for the attribute '{@link dsm.TRADES.ImpactScore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.ImpactScore#getName()
	 * @see #getImpactScore()
	 * @generated
	 */
	EAttribute getImpactScore_Name();

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
	 * Returns the meta object for class '{@link dsm.TRADES.DifficultyScore <em>Difficulty Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difficulty Score</em>'.
	 * @see dsm.TRADES.DifficultyScore
	 * @generated
	 */
	EClass getDifficultyScore();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.DifficultyScore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.TRADES.DifficultyScore#getName()
	 * @see #getDifficultyScore()
	 * @generated
	 */
	EAttribute getDifficultyScore_Name();

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
	 * Returns the meta object for class '{@link dsm.TRADES.AttackInfo <em>Attack Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Info</em>'.
	 * @see dsm.TRADES.AttackInfo
	 * @generated
	 */
	EClass getAttackInfo();

	/**
	 * Returns the meta object for the attribute '{@link dsm.TRADES.AttackInfo#getStepNum <em>Step Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Num</em>'.
	 * @see dsm.TRADES.AttackInfo#getStepNum()
	 * @see #getAttackInfo()
	 * @generated
	 */
	EAttribute getAttackInfo_StepNum();

	/**
	 * Returns the meta object for the reference '{@link dsm.TRADES.AttackInfo#getAttackVector <em>Attack Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attack Vector</em>'.
	 * @see dsm.TRADES.AttackInfo#getAttackVector()
	 * @see #getAttackInfo()
	 * @generated
	 */
	EReference getAttackInfo_AttackVector();

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
		 * The meta object literal for the '<em><b>Threat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__THREAT = eINSTANCE.getAnalysis_Threat();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__COMPONENT = eINSTANCE.getAnalysis_Component();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__CONTROL = eINSTANCE.getAnalysis_Control();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS__NAME = eINSTANCE.getAnalysis_Name();

		/**
		 * The meta object literal for the '<em><b>Threatallocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__THREATALLOCATION = eINSTANCE.getAnalysis_Threatallocation();

		/**
		 * The meta object literal for the '<em><b>Threatmitigation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__THREATMITIGATION = eINSTANCE.getAnalysis_Threatmitigation();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__DATA = eINSTANCE.getAnalysis_Data();

		/**
		 * The meta object literal for the '<em><b>Affectrelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__AFFECTRELATION = eINSTANCE.getAnalysis_Affectrelation();

		/**
		 * The meta object literal for the '<em><b>Analysisdiagram</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__ANALYSISDIAGRAM = eINSTANCE.getAnalysis_Analysisdiagram();

		/**
		 * The meta object literal for the '<em><b>Attackchain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__ATTACKCHAIN = eINSTANCE.getAnalysis_Attackchain();

		/**
		 * The meta object literal for the '<em><b>Scoresystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__SCORESYSTEM = eINSTANCE.getAnalysis_Scoresystem();

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
		 * The meta object literal for the '<em><b>Allocated</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__ALLOCATED = eINSTANCE.getThreat_Allocated();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__NAME = eINSTANCE.getThreat_Name();

		/**
		 * The meta object literal for the '<em><b>Threatallocation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__THREATALLOCATION = eINSTANCE.getThreat_Threatallocation();

		/**
		 * The meta object literal for the '<em><b>Threat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__THREAT_TYPE = eINSTANCE.getThreat_ThreatType();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__ID = eINSTANCE.getThreat_ID();

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
		 * The meta object literal for the '{@link dsm.TRADES.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.ComponentImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Allocated Threat</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ALLOCATED_THREAT = eINSTANCE.getComponent_AllocatedThreat();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPLEMENTS = eINSTANCE.getComponent_Implements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Threatallocation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__THREATALLOCATION = eINSTANCE.getComponent_Threatallocation();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT = eINSTANCE.getComponent_Component();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DATA = eINSTANCE.getComponent_Data();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONTROL = eINSTANCE.getComponent_Control();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ANALYSIS = eINSTANCE.getComponent_Analysis();

		/**
		 * The meta object literal for the '<em><b>Affectrelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__AFFECTRELATION = eINSTANCE.getComponent_Affectrelation();

		/**
		 * The meta object literal for the '<em><b>Threat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__THREAT = eINSTANCE.getComponent_Threat();

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
		 * The meta object literal for the '<em><b>Mitigates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MITIGATES = eINSTANCE.getControl_Mitigates();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__IMPLEMENTED_BY = eINSTANCE.getControl_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NAME = eINSTANCE.getControl_Name();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__ID = eINSTANCE.getControl_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__DESCRIPTION = eINSTANCE.getControl_Description();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_ALLOCATION_RELATION__NAME = eINSTANCE.getThreatAllocationRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_ALLOCATION_RELATION__ASSESSMENT = eINSTANCE.getThreatAllocationRelation_Assessment();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Impactscore</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__IMPACTSCORE = eINSTANCE.getThreatAllocationRelation_Impactscore();

		/**
		 * The meta object literal for the '<em><b>Difficultyscore</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE = eINSTANCE
				.getThreatAllocationRelation_Difficultyscore();

		/**
		 * The meta object literal for the '<em><b>Threat Decomposed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__THREAT_DECOMPOSED = eINSTANCE
				.getThreatAllocationRelation_ThreatDecomposed();

		/**
		 * The meta object literal for the '<em><b>Threat Related</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__THREAT_RELATED = eINSTANCE.getThreatAllocationRelation_ThreatRelated();

		/**
		 * The meta object literal for the '<em><b>Attackinfo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_ALLOCATION_RELATION__ATTACKINFO = eINSTANCE.getThreatAllocationRelation_Attackinfo();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_MITIGATION_RELATION__NAME = eINSTANCE.getThreatMitigationRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT_MITIGATION_RELATION__ASSESSMENT = eINSTANCE.getThreatMitigationRelation_Assessment();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Mitigates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT_MITIGATION_RELATION__MITIGATES = eINSTANCE.getThreatMitigationRelation_Mitigates();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

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
		 * The meta object literal for the '<em><b>Source Component</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECT_RELATION__NAME = eINSTANCE.getAffectRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Analysis Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECT_RELATION__ANALYSIS_STATUS = eINSTANCE.getAffectRelation_AnalysisStatus();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AnalysisDiagramImpl <em>Analysis Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AnalysisDiagramImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAnalysisDiagram()
		 * @generated
		 */
		EClass ANALYSIS_DIAGRAM = eINSTANCE.getAnalysisDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_DIAGRAM__NAME = eINSTANCE.getAnalysisDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Threat</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DIAGRAM__THREAT = eINSTANCE.getAnalysisDiagram_Threat();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DIAGRAM__COMPONENT = eINSTANCE.getAnalysisDiagram_Component();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DIAGRAM__CONTROL = eINSTANCE.getAnalysisDiagram_Control();

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
		 * The meta object literal for the '<em><b>Attackchainstep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN__ATTACKCHAINSTEP = eINSTANCE.getAttackChain_Attackchainstep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_CHAIN__NAME = eINSTANCE.getAttackChain_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN__START = eINSTANCE.getAttackChain_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN__END = eINSTANCE.getAttackChain_End();

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
		 * The meta object literal for the '<em><b>Threatallocationrelation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN_STEP__THREATALLOCATIONRELATION = eINSTANCE
				.getAttackChainStep_Threatallocationrelation();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_CHAIN_STEP__DIFFICULTY = eINSTANCE.getAttackChainStep_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Impact Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION = eINSTANCE.getAttackChainStep_ImpactDescription();

		/**
		 * The meta object literal for the '<em><b>Nexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN_STEP__NEXTS = eINSTANCE.getAttackChainStep_Nexts();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_CHAIN_STEP__PREVIOUS = eINSTANCE.getAttackChainStep_Previous();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_SYSTEM__NAME = eINSTANCE.getScoreSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Impactscore</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE_SYSTEM__IMPACTSCORE = eINSTANCE.getScoreSystem_Impactscore();

		/**
		 * The meta object literal for the '<em><b>Difficultyscore</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCORE_SYSTEM__DIFFICULTYSCORE = eINSTANCE.getScoreSystem_Difficultyscore();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPACT_SCORE__NAME = eINSTANCE.getImpactScore_Name();

		/**
		 * The meta object literal for the '<em><b>Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPACT_SCORE__IMPACT = eINSTANCE.getImpactScore_Impact();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFICULTY_SCORE__NAME = eINSTANCE.getDifficultyScore_Name();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFICULTY_SCORE__DIFFICULTY = eINSTANCE.getDifficultyScore_Difficulty();

		/**
		 * The meta object literal for the '{@link dsm.TRADES.impl.AttackInfoImpl <em>Attack Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.TRADES.impl.AttackInfoImpl
		 * @see dsm.TRADES.impl.TRADESPackageImpl#getAttackInfo()
		 * @generated
		 */
		EClass ATTACK_INFO = eINSTANCE.getAttackInfo();

		/**
		 * The meta object literal for the '<em><b>Step Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK_INFO__STEP_NUM = eINSTANCE.getAttackInfo_StepNum();

		/**
		 * The meta object literal for the '<em><b>Attack Vector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK_INFO__ATTACK_VECTOR = eINSTANCE.getAttackInfo_AttackVector();

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

	}

} //TRADESPackage
