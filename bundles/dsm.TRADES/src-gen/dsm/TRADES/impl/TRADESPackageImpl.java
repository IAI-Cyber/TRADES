/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.AffectRelation;
import dsm.TRADES.AffectedENUM;
import dsm.TRADES.Analysis;
import dsm.TRADES.AssessmentENUM;
import dsm.TRADES.AttackChain;
import dsm.TRADES.AttackChainStep;
import dsm.TRADES.Component;
import dsm.TRADES.ComponentOwner;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DataOwnerElement;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalElement;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.ImpactConfiguration;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.NamedElement;
import dsm.TRADES.RGBColor;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.ThreatsOwner;
import dsm.TRADES.threatTypeENUM;

import dsm.TRADES.util.TRADESValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TRADESPackageImpl extends EPackageImpl implements TRADESPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

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
	private EClass threatAllocationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatMitigationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackChainStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass difficultyScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOwnerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalThreatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impactConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatsOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractControlOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assessmentENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum affectedENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum threatTypeENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rgbColorEDataType = null;

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
	 * @see dsm.TRADES.TRADESPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TRADESPackageImpl() {
		super(eNS_URI, TRADESFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TRADESPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TRADESPackage init() {
		if (isInited)
			return (TRADESPackage) EPackage.Registry.INSTANCE.getEPackage(TRADESPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTRADESPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TRADESPackageImpl theTRADESPackage = registeredTRADESPackage instanceof TRADESPackageImpl
				? (TRADESPackageImpl) registeredTRADESPackage
				: new TRADESPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTRADESPackage.createPackageContents();

		// Initialize created meta-data
		theTRADESPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theTRADESPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return TRADESValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theTRADESPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TRADESPackage.eNS_URI, theTRADESPackage);
		return theTRADESPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysis() {
		return analysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysis_Scoresystem() {
		return (EReference) analysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysis_ThreatOwner() {
		return (EReference) analysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreat() {
		return threatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreat_Threatallocation() {
		return (EReference) threatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_ThreatType() {
		return (EAttribute) threatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_ID() {
		return (EAttribute) threatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_Description() {
		return (EAttribute) threatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreat_Applicability() {
		return (EAttribute) threatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreat__CheckIsUsed__DiagnosticChain_Map() {
		return threatEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Implements() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ThreatAllocations() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_AffectRelations() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
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
	public EReference getControl_Mitigates() {
		return (EReference) controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_ImplementedBy() {
		return (EReference) controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_ID() {
		return (EAttribute) controlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControl_Description() {
		return (EAttribute) controlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControl_MitigationrRelations() {
		return (EReference) controlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatAllocationRelation() {
		return threatAllocationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatAllocationRelation_Assessment() {
		return (EAttribute) threatAllocationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_Component() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_Threat() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_Impactscore() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_Difficultyscore() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_ThreatRelated() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatAllocationRelation_AttackChain() {
		return (EReference) threatAllocationRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThreatAllocationRelation__CheckComputedDifficultyConstraint__DiagnosticChain_Map() {
		return threatAllocationRelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatMitigationRelation() {
		return threatMitigationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatMitigationRelation_Assessment() {
		return (EAttribute) threatMitigationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatMitigationRelation_Control() {
		return (EReference) threatMitigationRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatMitigationRelation_Threat() {
		return (EReference) threatMitigationRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatMitigationRelation_Mitigates() {
		return (EReference) threatMitigationRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreatMitigationRelation_Description() {
		return (EAttribute) threatMitigationRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAffectRelation() {
		return affectRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAffectRelation_Data() {
		return (EReference) affectRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAffectRelation_SourceComponent() {
		return (EReference) affectRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAffectRelation_TargetComponent() {
		return (EReference) affectRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffectRelation_AnalysisStatus() {
		return (EAttribute) affectRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAffectRelation__CheckDataScope__DiagnosticChain_Map() {
		return affectRelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttackChain() {
		return attackChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttackChain_AttackchainSteps() {
		return (EReference) attackChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttackChain_ComputedDifficulty() {
		return (EAttribute) attackChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttackChainStep() {
		return attackChainStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttackChainStep_StepNum() {
		return (EAttribute) attackChainStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttackChainStep_ThreatAllocationRelation() {
		return (EReference) attackChainStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttackChainStep_ImpactDescription() {
		return (EAttribute) attackChainStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttackChainStep_Next() {
		return (EReference) attackChainStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttackChainStep_Previous() {
		return (EReference) attackChainStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttackChainStep__GetThreatAllocationRelationCandidates() {
		return attackChainStepEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttackChainStep__CheckAllocationValue__DiagnosticChain_Map() {
		return attackChainStepEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScoreSystem() {
		return scoreSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScoreSystem_ImpactScores() {
		return (EReference) scoreSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScoreSystem_Difficultyscore() {
		return (EReference) scoreSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImpactScore() {
		return impactScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpactScore_Impact() {
		return (EAttribute) impactScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpactScore_Configurations() {
		return (EReference) impactScoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDifficultyScore() {
		return difficultyScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifficultyScore_Difficulty() {
		return (EAttribute) difficultyScoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataOwnerElement() {
		return dataOwnerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataOwnerElement_DataOwner() {
		return (EReference) dataOwnerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataOwnerElement__GetDatas() {
		return dataOwnerElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataOwnerElement__GetInheritedDatas() {
		return dataOwnerElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataOwnerElement__GetAllDatas() {
		return dataOwnerElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentOwner() {
		return componentOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentOwner_Component() {
		return (EReference) componentOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalThreat() {
		return externalThreatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalElement() {
		return externalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalElement_Source() {
		return (EAttribute) externalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalElement_Link() {
		return (EAttribute) externalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImpactConfiguration() {
		return impactConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpactConfiguration_Difficulty() {
		return (EReference) impactConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImpactConfiguration_Impact() {
		return (EReference) impactConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImpactConfiguration_Color() {
		return (EAttribute) impactConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalControl() {
		return externalControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreatsOwner() {
		return threatsOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatsOwner_Internals() {
		return (EReference) threatsOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThreatsOwner_Externals() {
		return (EReference) threatsOwnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlOwner() {
		return controlOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlOwner_Internals() {
		return (EReference) controlOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlOwner_Externals() {
		return (EReference) controlOwnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractControlOwner() {
		return abstractControlOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractControlOwner_ControlOwner() {
		return (EReference) abstractControlOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractControlOwner__GetAllControls() {
		return abstractControlOwnerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataOwner() {
		return dataOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataOwner_Data() {
		return (EReference) dataOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssessmentENUM() {
		return assessmentENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAffectedENUM() {
		return affectedENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getthreatTypeENUM() {
		return threatTypeENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRGBColor() {
		return rgbColorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRADESFactory getTRADESFactory() {
		return (TRADESFactory) getEFactoryInstance();
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
		analysisEClass = createEClass(ANALYSIS);
		createEReference(analysisEClass, ANALYSIS__SCORESYSTEM);
		createEReference(analysisEClass, ANALYSIS__THREAT_OWNER);

		threatEClass = createEClass(THREAT);
		createEReference(threatEClass, THREAT__THREATALLOCATION);
		createEAttribute(threatEClass, THREAT__THREAT_TYPE);
		createEAttribute(threatEClass, THREAT__ID);
		createEAttribute(threatEClass, THREAT__DESCRIPTION);
		createEAttribute(threatEClass, THREAT__APPLICABILITY);
		createEOperation(threatEClass, THREAT___CHECK_IS_USED__DIAGNOSTICCHAIN_MAP);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__IMPLEMENTS);
		createEReference(componentEClass, COMPONENT__THREAT_ALLOCATIONS);
		createEReference(componentEClass, COMPONENT__AFFECT_RELATIONS);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__MITIGATES);
		createEReference(controlEClass, CONTROL__IMPLEMENTED_BY);
		createEAttribute(controlEClass, CONTROL__ID);
		createEAttribute(controlEClass, CONTROL__DESCRIPTION);
		createEReference(controlEClass, CONTROL__MITIGATIONR_RELATIONS);

		threatAllocationRelationEClass = createEClass(THREAT_ALLOCATION_RELATION);
		createEAttribute(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__ASSESSMENT);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__COMPONENT);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__THREAT);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__IMPACTSCORE);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__THREAT_RELATED);
		createEReference(threatAllocationRelationEClass, THREAT_ALLOCATION_RELATION__ATTACK_CHAIN);
		createEOperation(threatAllocationRelationEClass,
				THREAT_ALLOCATION_RELATION___CHECK_COMPUTED_DIFFICULTY_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		threatMitigationRelationEClass = createEClass(THREAT_MITIGATION_RELATION);
		createEAttribute(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__ASSESSMENT);
		createEReference(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__CONTROL);
		createEReference(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__THREAT);
		createEReference(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__MITIGATES);
		createEAttribute(threatMitigationRelationEClass, THREAT_MITIGATION_RELATION__DESCRIPTION);

		dataEClass = createEClass(DATA);

		affectRelationEClass = createEClass(AFFECT_RELATION);
		createEReference(affectRelationEClass, AFFECT_RELATION__DATA);
		createEReference(affectRelationEClass, AFFECT_RELATION__SOURCE_COMPONENT);
		createEReference(affectRelationEClass, AFFECT_RELATION__TARGET_COMPONENT);
		createEAttribute(affectRelationEClass, AFFECT_RELATION__ANALYSIS_STATUS);
		createEOperation(affectRelationEClass, AFFECT_RELATION___CHECK_DATA_SCOPE__DIAGNOSTICCHAIN_MAP);

		attackChainEClass = createEClass(ATTACK_CHAIN);
		createEReference(attackChainEClass, ATTACK_CHAIN__ATTACKCHAIN_STEPS);
		createEAttribute(attackChainEClass, ATTACK_CHAIN__COMPUTED_DIFFICULTY);

		attackChainStepEClass = createEClass(ATTACK_CHAIN_STEP);
		createEAttribute(attackChainStepEClass, ATTACK_CHAIN_STEP__STEP_NUM);
		createEReference(attackChainStepEClass, ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION);
		createEAttribute(attackChainStepEClass, ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION);
		createEReference(attackChainStepEClass, ATTACK_CHAIN_STEP__NEXT);
		createEReference(attackChainStepEClass, ATTACK_CHAIN_STEP__PREVIOUS);
		createEOperation(attackChainStepEClass, ATTACK_CHAIN_STEP___GET_THREAT_ALLOCATION_RELATION_CANDIDATES);
		createEOperation(attackChainStepEClass, ATTACK_CHAIN_STEP___CHECK_ALLOCATION_VALUE__DIAGNOSTICCHAIN_MAP);

		scoreSystemEClass = createEClass(SCORE_SYSTEM);
		createEReference(scoreSystemEClass, SCORE_SYSTEM__IMPACT_SCORES);
		createEReference(scoreSystemEClass, SCORE_SYSTEM__DIFFICULTYSCORE);

		impactScoreEClass = createEClass(IMPACT_SCORE);
		createEAttribute(impactScoreEClass, IMPACT_SCORE__IMPACT);
		createEReference(impactScoreEClass, IMPACT_SCORE__CONFIGURATIONS);

		difficultyScoreEClass = createEClass(DIFFICULTY_SCORE);
		createEAttribute(difficultyScoreEClass, DIFFICULTY_SCORE__DIFFICULTY);

		dataOwnerElementEClass = createEClass(DATA_OWNER_ELEMENT);
		createEReference(dataOwnerElementEClass, DATA_OWNER_ELEMENT__DATA_OWNER);
		createEOperation(dataOwnerElementEClass, DATA_OWNER_ELEMENT___GET_DATAS);
		createEOperation(dataOwnerElementEClass, DATA_OWNER_ELEMENT___GET_INHERITED_DATAS);
		createEOperation(dataOwnerElementEClass, DATA_OWNER_ELEMENT___GET_ALL_DATAS);

		componentOwnerEClass = createEClass(COMPONENT_OWNER);
		createEReference(componentOwnerEClass, COMPONENT_OWNER__COMPONENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		externalThreatEClass = createEClass(EXTERNAL_THREAT);

		externalElementEClass = createEClass(EXTERNAL_ELEMENT);
		createEAttribute(externalElementEClass, EXTERNAL_ELEMENT__SOURCE);
		createEAttribute(externalElementEClass, EXTERNAL_ELEMENT__LINK);

		impactConfigurationEClass = createEClass(IMPACT_CONFIGURATION);
		createEReference(impactConfigurationEClass, IMPACT_CONFIGURATION__DIFFICULTY);
		createEReference(impactConfigurationEClass, IMPACT_CONFIGURATION__IMPACT);
		createEAttribute(impactConfigurationEClass, IMPACT_CONFIGURATION__COLOR);

		externalControlEClass = createEClass(EXTERNAL_CONTROL);

		threatsOwnerEClass = createEClass(THREATS_OWNER);
		createEReference(threatsOwnerEClass, THREATS_OWNER__INTERNALS);
		createEReference(threatsOwnerEClass, THREATS_OWNER__EXTERNALS);

		controlOwnerEClass = createEClass(CONTROL_OWNER);
		createEReference(controlOwnerEClass, CONTROL_OWNER__INTERNALS);
		createEReference(controlOwnerEClass, CONTROL_OWNER__EXTERNALS);

		abstractControlOwnerEClass = createEClass(ABSTRACT_CONTROL_OWNER);
		createEReference(abstractControlOwnerEClass, ABSTRACT_CONTROL_OWNER__CONTROL_OWNER);
		createEOperation(abstractControlOwnerEClass, ABSTRACT_CONTROL_OWNER___GET_ALL_CONTROLS);

		dataOwnerEClass = createEClass(DATA_OWNER);
		createEReference(dataOwnerEClass, DATA_OWNER__DATA);

		// Create enums
		assessmentENUMEEnum = createEEnum(ASSESSMENT_ENUM);
		affectedENUMEEnum = createEEnum(AFFECTED_ENUM);
		threatTypeENUMEEnum = createEEnum(THREAT_TYPE_ENUM);

		// Create data types
		rgbColorEDataType = createEDataType(RGB_COLOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		analysisEClass.getESuperTypes().add(this.getComponentOwner());
		analysisEClass.getESuperTypes().add(this.getDataOwnerElement());
		analysisEClass.getESuperTypes().add(this.getNamedElement());
		analysisEClass.getESuperTypes().add(this.getAbstractControlOwner());
		threatEClass.getESuperTypes().add(this.getNamedElement());
		componentEClass.getESuperTypes().add(this.getComponentOwner());
		componentEClass.getESuperTypes().add(this.getDataOwnerElement());
		componentEClass.getESuperTypes().add(this.getNamedElement());
		componentEClass.getESuperTypes().add(this.getAbstractControlOwner());
		controlEClass.getESuperTypes().add(this.getNamedElement());
		dataEClass.getESuperTypes().add(this.getNamedElement());
		affectRelationEClass.getESuperTypes().add(this.getNamedElement());
		attackChainEClass.getESuperTypes().add(this.getNamedElement());
		scoreSystemEClass.getESuperTypes().add(this.getNamedElement());
		impactScoreEClass.getESuperTypes().add(this.getNamedElement());
		difficultyScoreEClass.getESuperTypes().add(this.getNamedElement());
		externalThreatEClass.getESuperTypes().add(this.getThreat());
		externalThreatEClass.getESuperTypes().add(this.getExternalElement());
		externalControlEClass.getESuperTypes().add(this.getExternalElement());
		externalControlEClass.getESuperTypes().add(this.getControl());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisEClass, Analysis.class, "Analysis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysis_Scoresystem(), this.getScoreSystem(), null, "scoresystem", null, 0, 1,
				Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_ThreatOwner(), this.getThreatsOwner(), null, "threatOwner", null, 1, 1,
				Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatEClass, Threat.class, "Threat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreat_Threatallocation(), this.getThreatAllocationRelation(),
				this.getThreatAllocationRelation_Threat(), "threatallocation", null, 0, -1, Threat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getThreat_ThreatType(), this.getthreatTypeENUM(), "threatType", null, 0, 1, Threat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Threat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Threat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreat_Applicability(), ecorePackage.getEString(), "Applicability", null, 0, 1, Threat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getThreat__CheckIsUsed__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"checkIsUsed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Implements(), this.getControl(), this.getControl_ImplementedBy(), "implements",
				null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ThreatAllocations(), this.getThreatAllocationRelation(),
				this.getThreatAllocationRelation_Component(), "threatAllocations", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AffectRelations(), this.getAffectRelation(),
				this.getAffectRelation_SourceComponent(), "affectRelations", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_Mitigates(), this.getThreat(), null, "mitigates", null, 0, -1, Control.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_ImplementedBy(), this.getComponent(), this.getComponent_Implements(), "implementedBy",
				null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Control.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Control.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControl_MitigationrRelations(), this.getThreatMitigationRelation(),
				this.getThreatMitigationRelation_Control(), "mitigationrRelations", null, 0, -1, Control.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threatAllocationRelationEClass, ThreatAllocationRelation.class, "ThreatAllocationRelation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreatAllocationRelation_Assessment(), this.getAssessmentENUM(), "assessment", "Undecided", 1,
				1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_Component(), this.getComponent(),
				this.getComponent_ThreatAllocations(), "component", null, 1, 1, ThreatAllocationRelation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_Threat(), this.getThreat(), this.getThreat_Threatallocation(),
				"threat", null, 1, 1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_Impactscore(), this.getImpactScore(), null, "impactscore", null, 0,
				1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_Difficultyscore(), this.getDifficultyScore(), null,
				"difficultyscore", null, 0, 1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_ThreatRelated(), this.getThreatAllocationRelation(), null,
				"threatRelated", null, 0, -1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatAllocationRelation_AttackChain(), this.getAttackChain(), null, "attackChain", null, 0,
				1, ThreatAllocationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getThreatAllocationRelation__CheckComputedDifficultyConstraint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "checkComputedDifficultyConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(threatMitigationRelationEClass, ThreatMitigationRelation.class, "ThreatMitigationRelation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreatMitigationRelation_Assessment(), this.getAssessmentENUM(), "assessment", "Undecided", 1,
				1, ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatMitigationRelation_Control(), this.getControl(), this.getControl_MitigationrRelations(),
				"control", null, 1, 1, ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatMitigationRelation_Threat(), this.getThreat(), null, "threat", null, 0, 1,
				ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatMitigationRelation_Mitigates(), this.getThreatAllocationRelation(), null, "mitigates",
				null, 0, 1, ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreatMitigationRelation_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ThreatMitigationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(affectRelationEClass, AffectRelation.class, "AffectRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAffectRelation_Data(), this.getData(), null, "data", null, 0, -1, AffectRelation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAffectRelation_SourceComponent(), this.getComponent(), this.getComponent_AffectRelations(),
				"sourceComponent", null, 1, 1, AffectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAffectRelation_TargetComponent(), this.getComponent(), null, "targetComponent", null, 1, 1,
				AffectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffectRelation_AnalysisStatus(), this.getAffectedENUM(), "analysisStatus", null, 1, 1,
				AffectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAffectRelation__CheckDataScope__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"checkDataScope", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attackChainEClass, AttackChain.class, "AttackChain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttackChain_AttackchainSteps(), this.getAttackChainStep(), null, "attackchainSteps", null, 0,
				-1, AttackChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackChain_ComputedDifficulty(), ecorePackage.getEInt(), "computedDifficulty", null, 0, 1,
				AttackChain.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(attackChainStepEClass, AttackChainStep.class, "AttackChainStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttackChainStep_StepNum(), ecorePackage.getEString(), "stepNum", null, 0, 1,
				AttackChainStep.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEReference(getAttackChainStep_ThreatAllocationRelation(), this.getThreatAllocationRelation(), null,
				"threatAllocationRelation", null, 0, 1, AttackChainStep.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackChainStep_ImpactDescription(), ecorePackage.getEString(), "impactDescription", null, 0,
				1, AttackChainStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAttackChainStep_Next(), this.getAttackChainStep(), this.getAttackChainStep_Previous(), "next",
				null, 0, -1, AttackChainStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttackChainStep_Previous(), this.getAttackChainStep(), this.getAttackChainStep_Next(),
				"previous", null, 0, -1, AttackChainStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAttackChainStep__GetThreatAllocationRelationCandidates(), this.getThreatAllocationRelation(),
				"getThreatAllocationRelationCandidates", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAttackChainStep__CheckAllocationValue__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"checkAllocationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scoreSystemEClass, ScoreSystem.class, "ScoreSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScoreSystem_ImpactScores(), this.getImpactScore(), null, "impactScores", null, 0, -1,
				ScoreSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScoreSystem_Difficultyscore(), this.getDifficultyScore(), null, "difficultyscore", null, 0,
				-1, ScoreSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impactScoreEClass, ImpactScore.class, "ImpactScore", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImpactScore_Impact(), ecorePackage.getEInt(), "impact", null, 0, 1, ImpactScore.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpactScore_Configurations(), this.getImpactConfiguration(),
				this.getImpactConfiguration_Impact(), "configurations", null, 0, -1, ImpactScore.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(difficultyScoreEClass, DifficultyScore.class, "DifficultyScore", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDifficultyScore_Difficulty(), ecorePackage.getEInt(), "difficulty", null, 0, 1,
				DifficultyScore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataOwnerElementEClass, DataOwnerElement.class, "DataOwnerElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOwnerElement_DataOwner(), this.getDataOwner(), null, "dataOwner", null, 0, 1,
				DataOwnerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataOwnerElement__GetDatas(), this.getData(), "getDatas", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataOwnerElement__GetInheritedDatas(), this.getData(), "getInheritedDatas", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getDataOwnerElement__GetAllDatas(), this.getData(), "getAllDatas", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentOwnerEClass, ComponentOwner.class, "ComponentOwner", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentOwner_Component(), this.getComponent(), null, "component", null, 0, -1,
				ComponentOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalThreatEClass, ExternalThreat.class, "ExternalThreat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalElementEClass, ExternalElement.class, "ExternalElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalElement_Source(), ecorePackage.getEString(), "source", null, 0, 1,
				ExternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalElement_Link(), ecorePackage.getEString(), "link", null, 0, 1, ExternalElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(impactConfigurationEClass, ImpactConfiguration.class, "ImpactConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImpactConfiguration_Difficulty(), this.getDifficultyScore(), null, "difficulty", null, 1, 1,
				ImpactConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImpactConfiguration_Impact(), this.getImpactScore(), this.getImpactScore_Configurations(),
				"impact", null, 1, 1, ImpactConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImpactConfiguration_Color(), this.getRGBColor(), "color", "#FFFFFF", 0, 1,
				ImpactConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalControlEClass, ExternalControl.class, "ExternalControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(threatsOwnerEClass, ThreatsOwner.class, "ThreatsOwner", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThreatsOwner_Internals(), this.getThreat(), null, "internals", null, 0, -1,
				ThreatsOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThreatsOwner_Externals(), this.getThreat(), null, "externals", null, 0, -1,
				ThreatsOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlOwnerEClass, ControlOwner.class, "ControlOwner", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlOwner_Internals(), this.getControl(), null, "internals", null, 0, -1,
				ControlOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlOwner_Externals(), this.getControl(), null, "externals", null, 0, -1,
				ControlOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractControlOwnerEClass, AbstractControlOwner.class, "AbstractControlOwner", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractControlOwner_ControlOwner(), this.getControlOwner(), null, "controlOwner", null, 0, 1,
				AbstractControlOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractControlOwner__GetAllControls(), this.getControl(), "getAllControls", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(dataOwnerEClass, DataOwner.class, "DataOwner", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataOwner_Data(), this.getData(), null, "data", null, 0, -1, DataOwner.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(assessmentENUMEEnum, AssessmentENUM.class, "AssessmentENUM");
		addEEnumLiteral(assessmentENUMEEnum, AssessmentENUM.UNDECIDED);
		addEEnumLiteral(assessmentENUMEEnum, AssessmentENUM.GAP);
		addEEnumLiteral(assessmentENUMEEnum, AssessmentENUM.ACCEPTED);

		initEEnum(affectedENUMEEnum, AffectedENUM.class, "AffectedENUM");
		addEEnumLiteral(affectedENUMEEnum, AffectedENUM.UNDECIDED);
		addEEnumLiteral(affectedENUMEEnum, AffectedENUM.CONFIRMED);

		initEEnum(threatTypeENUMEEnum, threatTypeENUM.class, "threatTypeENUM");
		addEEnumLiteral(threatTypeENUMEEnum, threatTypeENUM.CONCRETE_THREAT);
		addEEnumLiteral(threatTypeENUMEEnum, threatTypeENUM.CONCEPTUAL_THREAT);

		// Initialize data types
		initEDataType(rgbColorEDataType, RGBColor.class, "RGBColor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TRADESPackageImpl
