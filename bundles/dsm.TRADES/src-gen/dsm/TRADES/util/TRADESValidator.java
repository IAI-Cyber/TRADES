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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Is Used' of 'Threat'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int THREAT__CHECK_IS_USED = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Computed Difficulty Constraint' of 'Threat Allocation Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int THREAT_ALLOCATION_RELATION__CHECK_COMPUTED_DIFFICULTY_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Data Scope' of 'Affect Relation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AFFECT_RELATION__CHECK_DATA_SCOPE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Allocation Value' of 'Attack Chain Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTACK_CHAIN_STEP__CHECK_ALLOCATION_VALUE = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

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
		case TRADESPackage.LINK:
			return validateLink((Link) value, diagnostics, context);
		case TRADESPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case TRADESPackage.CONTROL_DEFINITION:
			return validateControlDefinition((ControlDefinition) value, diagnostics, context);
		case TRADESPackage.ADDRESS:
			return validateAddress((Address) value, diagnostics, context);
		case TRADESPackage.ROLE:
			return validateRole((Role) value, diagnostics, context);
		case TRADESPackage.REMARK:
			return validateRemark((Remark) value, diagnostics, context);
		case TRADESPackage.CATALOG:
			return validateCatalog((Catalog) value, diagnostics, context);
		case TRADESPackage.BACK_MATTER:
			return validateBackMatter((BackMatter) value, diagnostics, context);
		case TRADESPackage.REVISION:
			return validateRevision((Revision) value, diagnostics, context);
		case TRADESPackage.GROUP:
			return validateGroup((Group) value, diagnostics, context);
		case TRADESPackage.LOCATION:
			return validateLocation((Location) value, diagnostics, context);
		case TRADESPackage.ANNOTATION:
			return validateAnnotation((Annotation) value, diagnostics, context);
		case TRADESPackage.DOCUMENT_ID:
			return validateDocumentId((DocumentId) value, diagnostics, context);
		case TRADESPackage.PROPERTY:
			return validateProperty((Property) value, diagnostics, context);
		case TRADESPackage.METADATA:
			return validateMetadata((Metadata) value, diagnostics, context);
		case TRADESPackage.REVISIONS:
			return validateRevisions((Revisions) value, diagnostics, context);
		case TRADESPackage.TELEPHONE_NUMBER:
			return validateTelephoneNumber((TelephoneNumber) value, diagnostics, context);
		case TRADESPackage.PARTY:
			return validateParty((Party) value, diagnostics, context);
		case TRADESPackage.EXTERNAL_ID:
			return validateExternalId((ExternalId) value, diagnostics, context);
		case TRADESPackage.RESPONSIBLE_PARTY:
			return validateResponsibleParty((ResponsibleParty) value, diagnostics, context);
		case TRADESPackage.CONSTRAINT:
			return validateConstraint((Constraint) value, diagnostics, context);
		case TRADESPackage.TEST:
			return validateTest((Test) value, diagnostics, context);
		case TRADESPackage.PARTITION:
			return validatePartition((Partition) value, diagnostics, context);
		case TRADESPackage.SELECT:
			return validateSelect((Select) value, diagnostics, context);
		case TRADESPackage.RESOURCE:
			return validateResource((Resource) value, diagnostics, context);
		case TRADESPackage.CITATION:
			return validateCitation((Citation) value, diagnostics, context);
		case TRADESPackage.RLINK:
			return validateRlink((Rlink) value, diagnostics, context);
		case TRADESPackage.HASH:
			return validateHash((Hash) value, diagnostics, context);
		case TRADESPackage.PROPERTY_OWNER:
			return validatePropertyOwner((PropertyOwner) value, diagnostics, context);
		case TRADESPackage.PARAMETER_OWNER:
			return validateParameterOwner((ParameterOwner) value, diagnostics, context);
		case TRADESPackage.ANNOTATION_OWNER:
			return validateAnnotationOwner((AnnotationOwner) value, diagnostics, context);
		case TRADESPackage.LINK_OWNER:
			return validateLinkOwner((LinkOwner) value, diagnostics, context);
		case TRADESPackage.BASE64:
			return validateBase64((Base64) value, diagnostics, context);
		case TRADESPackage.ASSESSMENT_ENUM:
			return validateAssessmentENUM((AssessmentENUM) value, diagnostics, context);
		case TRADESPackage.AFFECTED_ENUM:
			return validateAffectedENUM((AffectedENUM) value, diagnostics, context);
		case TRADESPackage.THREAT_TYPE_ENUM:
			return validatethreatTypeENUM((threatTypeENUM) value, diagnostics, context);
		case TRADESPackage.RGB_COLOR:
			return validateRGBColor((RGBColor) value, diagnostics, context);
		case TRADESPackage.MARKUP_LINE:
			return validateMarkupLine((String) value, diagnostics, context);
		case TRADESPackage.MARKUP_MULTILINE:
			return validateMarkupMultiline((String) value, diagnostics, context);
		case TRADESPackage.BASE64_BINARY:
			return validateBase64Binary((byte[]) value, diagnostics, context);
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
		if (!validate_NoCircularContainment(threat, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(threat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreat_checkIsUsed(threat, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkIsUsed constraint of '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreat_checkIsUsed(Threat threat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return threat.checkIsUsed(diagnostics, context);
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
		if (!validate_NoCircularContainment(affectRelation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(affectRelation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAffectRelation_checkDataScope(affectRelation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkDataScope constraint of '<em>Affect Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffectRelation_checkDataScope(AffectRelation affectRelation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return affectRelation.checkDataScope(diagnostics, context);
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
		if (!validate_NoCircularContainment(externalThreat, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(externalThreat, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateThreat_checkIsUsed(externalThreat, diagnostics, context);
		return result;
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
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(link, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlDefinition(ControlDefinition controlDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemark(Remark remark, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remark, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalog(Catalog catalog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackMatter(BackMatter backMatter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backMatter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevision(Revision revision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(revision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentId(DocumentId documentId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadata(Metadata metadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevisions(Revisions revisions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(revisions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumber(TelephoneNumber telephoneNumber, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telephoneNumber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParty(Party party, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(party, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalId(ExternalId externalId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibleParty(ResponsibleParty responsibleParty, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsibleParty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(test, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelect(Select select, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(select, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCitation(Citation citation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRlink(Rlink rlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rlink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHash(Hash hash, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hash, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyOwner(PropertyOwner propertyOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterOwner(ParameterOwner parameterOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationOwner(AnnotationOwner annotationOwner, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkOwner(LinkOwner linkOwner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64(Base64 base64, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base64, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkupLine(String markupLine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkupMultiline(String markupMultiline, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Binary(byte[] base64Binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
