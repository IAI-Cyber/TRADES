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
		case TRADESPackage.IMPACT_CONFIGURATION:
			return createImpactConfiguration();
		case TRADESPackage.EXTERNAL_CONTROL:
			return createExternalControl();
		case TRADESPackage.THREATS_OWNER:
			return createThreatsOwner();
		case TRADESPackage.CONTROL_OWNER:
			return createControlOwner();
		case TRADESPackage.DATA_OWNER:
			return createDataOwner();
		case TRADESPackage.LINK:
			return createLink();
		case TRADESPackage.PARAMETER:
			return createParameter();
		case TRADESPackage.CONTROL_DEFINITION:
			return createControlDefinition();
		case TRADESPackage.ADDRESS:
			return createAddress();
		case TRADESPackage.ROLE:
			return createRole();
		case TRADESPackage.REMARK:
			return createRemark();
		case TRADESPackage.CATALOG:
			return createCatalog();
		case TRADESPackage.BACK_MATTER:
			return createBackMatter();
		case TRADESPackage.REVISION:
			return createRevision();
		case TRADESPackage.GROUP:
			return createGroup();
		case TRADESPackage.LOCATION:
			return createLocation();
		case TRADESPackage.ANNOTATION:
			return createAnnotation();
		case TRADESPackage.DOCUMENT_ID:
			return createDocumentId();
		case TRADESPackage.PROPERTY:
			return createProperty();
		case TRADESPackage.METADATA:
			return createMetadata();
		case TRADESPackage.REVISIONS:
			return createRevisions();
		case TRADESPackage.TELEPHONE_NUMBER:
			return createTelephoneNumber();
		case TRADESPackage.PARTY:
			return createParty();
		case TRADESPackage.EXTERNAL_ID:
			return createExternalId();
		case TRADESPackage.RESPONSIBLE_PARTY:
			return createResponsibleParty();
		case TRADESPackage.CONSTRAINT:
			return createConstraint();
		case TRADESPackage.TEST:
			return createTest();
		case TRADESPackage.PARTITION:
			return createPartition();
		case TRADESPackage.SELECT:
			return createSelect();
		case TRADESPackage.RESOURCE:
			return createResource();
		case TRADESPackage.CITATION:
			return createCitation();
		case TRADESPackage.RLINK:
			return createRlink();
		case TRADESPackage.HASH:
			return createHash();
		case TRADESPackage.BASE64:
			return createBase64();
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
		case TRADESPackage.RGB_COLOR:
			return createRGBColorFromString(eDataType, initialValue);
		case TRADESPackage.MARKUP_LINE:
			return createMarkupLineFromString(eDataType, initialValue);
		case TRADESPackage.MARKUP_MULTILINE:
			return createMarkupMultilineFromString(eDataType, initialValue);
		case TRADESPackage.BASE64_BINARY:
			return createBase64BinaryFromString(eDataType, initialValue);
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
		case TRADESPackage.RGB_COLOR:
			return convertRGBColorToString(eDataType, instanceValue);
		case TRADESPackage.MARKUP_LINE:
			return convertMarkupLineToString(eDataType, instanceValue);
		case TRADESPackage.MARKUP_MULTILINE:
			return convertMarkupMultilineToString(eDataType, instanceValue);
		case TRADESPackage.BASE64_BINARY:
			return convertBase64BinaryToString(eDataType, instanceValue);
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
		AnalysisCustomImpl analysis = new AnalysisCustomImpl();
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threat createThreat() {
		ThreatCustomImpl threat = new ThreatCustomImpl();
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentCustomImpl component = new ComponentCustomImpl();
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
		ThreatAllocationRelationCustomImpl threatAllocationRelation = new ThreatAllocationRelationCustomImpl();
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
		AffectRelationCustomImpl affectRelation = new AffectRelationCustomImpl();
		return affectRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChain createAttackChain() {
		AttackChainCustomImpl attackChain = new AttackChainCustomImpl();
		return attackChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChainStep createAttackChainStep() {
		AttackChainStepCustomImpl attackChainStep = new AttackChainStepCustomImpl();
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
	@Override
	public ImpactConfiguration createImpactConfiguration() {
		ImpactConfigurationImpl impactConfiguration = new ImpactConfigurationImpl();
		return impactConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalControl createExternalControl() {
		ExternalControlImpl externalControl = new ExternalControlImpl();
		return externalControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatsOwner createThreatsOwner() {
		ThreatsOwnerImpl threatsOwner = new ThreatsOwnerImpl();
		return threatsOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlOwner createControlOwner() {
		ControlOwnerImpl controlOwner = new ControlOwnerImpl();
		return controlOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataOwner createDataOwner() {
		DataOwnerImpl dataOwner = new DataOwnerImpl();
		return dataOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlDefinition createControlDefinition() {
		ControlDefinitionImpl controlDefinition = new ControlDefinitionImpl();
		return controlDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Remark createRemark() {
		RemarkImpl remark = new RemarkImpl();
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatter createBackMatter() {
		BackMatterImpl backMatter = new BackMatterImpl();
		return backMatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Revision createRevision() {
		RevisionImpl revision = new RevisionImpl();
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentId createDocumentId() {
		DocumentIdImpl documentId = new DocumentIdImpl();
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Revisions createRevisions() {
		RevisionsImpl revisions = new RevisionsImpl();
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelephoneNumber createTelephoneNumber() {
		TelephoneNumberImpl telephoneNumber = new TelephoneNumberImpl();
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party createParty() {
		PartyImpl party = new PartyImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalId createExternalId() {
		ExternalIdImpl externalId = new ExternalIdImpl();
		return externalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsibleParty createResponsibleParty() {
		ResponsiblePartyImpl responsibleParty = new ResponsiblePartyImpl();
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Citation createCitation() {
		CitationImpl citation = new CitationImpl();
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rlink createRlink() {
		RlinkImpl rlink = new RlinkImpl();
		return rlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hash createHash() {
		HashImpl hash = new HashImpl();
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64 createBase64() {
		Base64Impl base64 = new Base64Impl();
		return base64;
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
	public RGBColor createRGBColor(final String it) {
		return RGBColor.decode(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor createRGBColorFromString(EDataType eDataType, String initialValue) {
		return createRGBColor(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRGBColor(final RGBColor it) {
		return it == null ? "" : it.encode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRGBColorToString(EDataType eDataType, Object instanceValue) {
		return convertRGBColor((RGBColor) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarkupLineFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkupLineToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMarkupMultilineFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkupMultilineToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64BinaryFromString(EDataType eDataType, String initialValue) {
		return (byte[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64BinaryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
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
