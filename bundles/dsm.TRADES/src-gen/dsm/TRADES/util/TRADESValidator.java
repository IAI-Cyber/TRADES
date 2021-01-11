/**
 */
package dsm.TRADES.util;

import dsm.TRADES.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dsm.TRADES.TRADESPackage
 * @generated
 */
public class TRADESValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TRADESValidator INSTANCE = new TRADESValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dsm.TRADES";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Computed Difficulty Constraint' of 'Threat Allocation Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int THREAT_ALLOCATION_RELATION__CHECK_COMPUTED_DIFFICULTY_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Allocation Value' of 'Attack Chain Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTACK_CHAIN_STEP__CHECK_ALLOCATION_VALUE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRADESValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TRADESPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TRADESPackage.ANALYSIS:
			return validateAnalysis((Analysis) value, diagnostics, context);
		case TRADESPackage.THREAT:
			return validateThreat((Threat) value, diagnostics, context);
		case TRADESPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case TRADESPackage.CONTROL:
			return validateControl((Control) value, diagnostics, context);
		case TRADESPackage.THREAT_ALLOCATION_RELATION:
			return validateThreatAllocationRelation((ThreatAllocationRelation) value, diagnostics, context);
		case TRADESPackage.THREAT_MITIGATION_RELATION:
			return validateThreatMitigationRelation((ThreatMitigationRelation) value, diagnostics, context);
		case TRADESPackage.DATA:
			return validateData((Data) value, diagnostics, context);
		case TRADESPackage.AFFECT_RELATION:
			return validateAffectRelation((AffectRelation) value, diagnostics, context);
		case TRADESPackage.ATTACK_CHAIN:
			return validateAttackChain((AttackChain) value, diagnostics, context);
		case TRADESPackage.ATTACK_CHAIN_STEP:
			return validateAttackChainStep((AttackChainStep) value, diagnostics, context);
		case TRADESPackage.SCORE_SYSTEM:
			return validateScoreSystem((ScoreSystem) value, diagnostics, context);
		case TRADESPackage.IMPACT_SCORE:
			return validateImpactScore((ImpactScore) value, diagnostics, context);
		case TRADESPackage.DIFFICULTY_SCORE:
			return validateDifficultyScore((DifficultyScore) value, diagnostics, context);
		case TRADESPackage.DATA_OWNER_ELEMENT:
			return validateDataOwnerElement((DataOwnerElement) value, diagnostics, context);
		case TRADESPackage.COMPONENT_OWNER:
			return validateComponentOwner((ComponentOwner) value, diagnostics, context);
		case TRADESPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case TRADESPackage.EXTERNAL_THREAT:
			return validateExternalThreat((ExternalThreat) value, diagnostics, context);
		case TRADESPackage.EXTERNAL_ELEMENT:
			return validateExternalElement((ExternalElement) value, diagnostics, context);
		case TRADESPackage.IMPACT_CONFIGURATION:
			return validateImpactConfiguration((ImpactConfiguration) value, diagnostics, context);
		case TRADESPackage.EXTERNAL_CONTROL:
			return validateExternalControl((ExternalControl) value, diagnostics, context);
		case TRADESPackage.THREATS_OWNER:
			return validateThreatsOwner((ThreatsOwner) value, diagnostics, context);
		case TRADESPackage.CONTROL_OWNER:
			return validateControlOwner((ControlOwner) value, diagnostics, context);
		case TRADESPackage.ABSTRACT_CONTROL_OWNER:
			return validateAbstractControlOwner((AbstractControlOwner) value, diagnostics, context);
		case TRADESPackage.DATA_OWNER:
			return validateDataOwner((DataOwner) value, diagnostics, context);
		case TRADESPackage.ASSESSMENT_ENUM:
			return validateAssessmentENUM((AssessmentENUM) value, diagnostics, context);
		case TRADESPackage.AFFECTED_ENUM:
			return validateAffectedENUM((AffectedENUM) value, diagnostics, context);
		case TRADESPackage.THREAT_TYPE_ENUM:
			return validatethreatTypeENUM((threatTypeENUM) value, diagnostics, context);
		case TRADESPackage.RGB_COLOR:
			return validateRGBColor((RGBColor) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysis(Analysis analysis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(analysis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreat(Threat threat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(threat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControl(Control control, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(control, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreatAllocationRelation(ThreatAllocationRelation threatAllocationRelation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(threatAllocationRelation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(threatAllocationRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreatAllocationRelation_checkComputedDifficultyConstraint(threatAllocationRelation,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkComputedDifficultyConstraint constraint of '<em>Threat Allocation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreatAllocationRelation_checkComputedDifficultyConstraint(
			ThreatAllocationRelation threatAllocationRelation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return threatAllocationRelation.checkComputedDifficultyConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreatMitigationRelation(ThreatMitigationRelation threatMitigationRelation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(threatMitigationRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffectRelation(AffectRelation affectRelation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affectRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttackChain(AttackChain attackChain, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attackChain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttackChainStep(AttackChainStep attackChainStep, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attackChainStep, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(attackChainStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAttackChainStep_checkAllocationValue(attackChainStep, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkAllocationValue constraint of '<em>Attack Chain Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttackChainStep_checkAllocationValue(AttackChainStep attackChainStep,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attackChainStep.checkAllocationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreSystem(ScoreSystem scoreSystem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scoreSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactScore(ImpactScore impactScore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(impactScore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDifficultyScore(DifficultyScore difficultyScore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(difficultyScore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOwnerElement(DataOwnerElement dataOwnerElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataOwnerElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentOwner(ComponentOwner componentOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalThreat(ExternalThreat externalThreat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalThreat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalElement(ExternalElement externalElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactConfiguration(ImpactConfiguration impactConfiguration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(impactConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalControl(ExternalControl externalControl, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreatsOwner(ThreatsOwner threatsOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(threatsOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlOwner(ControlOwner controlOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractControlOwner(AbstractControlOwner abstractControlOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractControlOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOwner(DataOwner dataOwner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentENUM(AssessmentENUM assessmentENUM, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffectedENUM(AffectedENUM affectedENUM, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatethreatTypeENUM(threatTypeENUM threatTypeENUM, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRGBColor(RGBColor rgbColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TRADESValidator
