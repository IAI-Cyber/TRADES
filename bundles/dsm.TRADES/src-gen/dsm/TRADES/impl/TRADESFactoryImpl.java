/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TRADESFactoryImpl extends EFactoryImpl implements TRADESFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TRADESFactory init() {
		try {
			TRADESFactory theTRADESFactory = (TRADESFactory) EPackage.Registry.INSTANCE
					.getEFactory(TRADESPackage.eNS_URI);
			if (theTRADESFactory != null) {
				return theTRADESFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TRADESFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRADESFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TRADESPackage.ANALYSIS:
			return createAnalysis();
		case TRADESPackage.THREAT:
			return createThreat();
		case TRADESPackage.COMPONENT:
			return createComponent();
		case TRADESPackage.CONTROL:
			return createControl();
		case TRADESPackage.THREAT_ALLOCATION_RELATION:
			return createThreatAllocationRelation();
		case TRADESPackage.THREAT_MITIGATION_RELATION:
			return createThreatMitigationRelation();
		case TRADESPackage.DATA:
			return createData();
		case TRADESPackage.AFFECT_RELATION:
			return createAffectRelation();
		case TRADESPackage.ATTACK_CHAIN:
			return createAttackChain();
		case TRADESPackage.ATTACK_CHAIN_STEP:
			return createAttackChainStep();
		case TRADESPackage.SCORE_SYSTEM:
			return createScoreSystem();
		case TRADESPackage.IMPACT_SCORE:
			return createImpactScore();
		case TRADESPackage.DIFFICULTY_SCORE:
			return createDifficultyScore();
		case TRADESPackage.EXTERNAL_THREAT:
			return createExternalThreat();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TRADESPackage.ASSESSMENT_ENUM:
			return createAssessmentENUMFromString(eDataType, initialValue);
		case TRADESPackage.AFFECTED_ENUM:
			return createAffectedENUMFromString(eDataType, initialValue);
		case TRADESPackage.THREAT_TYPE_ENUM:
			return createthreatTypeENUMFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TRADESPackage.ASSESSMENT_ENUM:
			return convertAssessmentENUMToString(eDataType, instanceValue);
		case TRADESPackage.AFFECTED_ENUM:
			return convertAffectedENUMToString(eDataType, instanceValue);
		case TRADESPackage.THREAT_TYPE_ENUM:
			return convertthreatTypeENUMToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Analysis createAnalysis() {
		AnalysisImpl analysis = new AnalysisImpl();
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threat createThreat() {
		ThreatImpl threat = new ThreatImpl();
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatAllocationRelation createThreatAllocationRelation() {
		ThreatAllocationRelationImpl threatAllocationRelation = new ThreatAllocationRelationImpl();
		return threatAllocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatMitigationRelation createThreatMitigationRelation() {
		ThreatMitigationRelationImpl threatMitigationRelation = new ThreatMitigationRelationImpl();
		return threatMitigationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffectRelation createAffectRelation() {
		AffectRelationImpl affectRelation = new AffectRelationImpl();
		return affectRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChain createAttackChain() {
		AttackChainImpl attackChain = new AttackChainImpl();
		return attackChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChainStep createAttackChainStep() {
		AttackChainStepImpl attackChainStep = new AttackChainStepImpl();
		return attackChainStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScoreSystem createScoreSystem() {
		ScoreSystemImpl scoreSystem = new ScoreSystemImpl();
		return scoreSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactScore createImpactScore() {
		ImpactScoreImpl impactScore = new ImpactScoreImpl();
		return impactScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifficultyScore createDifficultyScore() {
		DifficultyScoreImpl difficultyScore = new DifficultyScoreImpl();
		return difficultyScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalThreat createExternalThreat() {
		ExternalThreatImpl externalThreat = new ExternalThreatImpl();
		return externalThreat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentENUM createAssessmentENUMFromString(EDataType eDataType, String initialValue) {
		AssessmentENUM result = AssessmentENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssessmentENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectedENUM createAffectedENUMFromString(EDataType eDataType, String initialValue) {
		AffectedENUM result = AffectedENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffectedENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public threatTypeENUM createthreatTypeENUMFromString(EDataType eDataType, String initialValue) {
		threatTypeENUM result = threatTypeENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertthreatTypeENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRADESPackage getTRADESPackage() {
		return (TRADESPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TRADESPackage getPackage() {
		return TRADESPackage.eINSTANCE;
	}

} //TRADESFactoryImpl
