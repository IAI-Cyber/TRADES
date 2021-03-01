/**
 */
package dsm.TRADES.util;

import dsm.TRADES.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dsm.TRADES.TRADESPackage
 * @generated
 */
public class TRADESAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TRADESPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRADESAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TRADESPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRADESSwitch<Adapter> modelSwitch = new TRADESSwitch<Adapter>() {
		@Override
		public Adapter caseAnalysis(Analysis object) {
			return createAnalysisAdapter();
		}

		@Override
		public Adapter caseThreat(Threat object) {
			return createThreatAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseControl(Control object) {
			return createControlAdapter();
		}

		@Override
		public Adapter caseThreatAllocationRelation(ThreatAllocationRelation object) {
			return createThreatAllocationRelationAdapter();
		}

		@Override
		public Adapter caseThreatMitigationRelation(ThreatMitigationRelation object) {
			return createThreatMitigationRelationAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseAffectRelation(AffectRelation object) {
			return createAffectRelationAdapter();
		}

		@Override
		public Adapter caseAttackChain(AttackChain object) {
			return createAttackChainAdapter();
		}

		@Override
		public Adapter caseAttackChainStep(AttackChainStep object) {
			return createAttackChainStepAdapter();
		}

		@Override
		public Adapter caseScoreSystem(ScoreSystem object) {
			return createScoreSystemAdapter();
		}

		@Override
		public Adapter caseImpactScore(ImpactScore object) {
			return createImpactScoreAdapter();
		}

		@Override
		public Adapter caseDifficultyScore(DifficultyScore object) {
			return createDifficultyScoreAdapter();
		}

		@Override
		public Adapter caseDataOwnerElement(DataOwnerElement object) {
			return createDataOwnerElementAdapter();
		}

		@Override
		public Adapter caseComponentOwner(ComponentOwner object) {
			return createComponentOwnerAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseExternalThreat(ExternalThreat object) {
			return createExternalThreatAdapter();
		}

		@Override
		public Adapter caseExternalElement(ExternalElement object) {
			return createExternalElementAdapter();
		}

		@Override
		public Adapter caseImpactConfiguration(ImpactConfiguration object) {
			return createImpactConfigurationAdapter();
		}

		@Override
		public Adapter caseExternalControl(ExternalControl object) {
			return createExternalControlAdapter();
		}

		@Override
		public Adapter caseThreatsOwner(ThreatsOwner object) {
			return createThreatsOwnerAdapter();
		}

		@Override
		public Adapter caseControlOwner(ControlOwner object) {
			return createControlOwnerAdapter();
		}

		@Override
		public Adapter caseAbstractControlOwner(AbstractControlOwner object) {
			return createAbstractControlOwnerAdapter();
		}

		@Override
		public Adapter caseDataOwner(DataOwner object) {
			return createDataOwnerAdapter();
		}

		@Override
		public Adapter caseLink(Link object) {
			return createLinkAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseControlDefinition(ControlDefinition object) {
			return createControlDefinitionAdapter();
		}

		@Override
		public Adapter caseAddress(Address object) {
			return createAddressAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseRemark(Remark object) {
			return createRemarkAdapter();
		}

		@Override
		public Adapter caseCatalog(Catalog object) {
			return createCatalogAdapter();
		}

		@Override
		public Adapter caseBackMatter(BackMatter object) {
			return createBackMatterAdapter();
		}

		@Override
		public Adapter caseRevision(Revision object) {
			return createRevisionAdapter();
		}

		@Override
		public Adapter caseGroup(Group object) {
			return createGroupAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter caseDocumentId(DocumentId object) {
			return createDocumentIdAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseMetadata(Metadata object) {
			return createMetadataAdapter();
		}

		@Override
		public Adapter caseRevisions(Revisions object) {
			return createRevisionsAdapter();
		}

		@Override
		public Adapter caseTelephoneNumber(TelephoneNumber object) {
			return createTelephoneNumberAdapter();
		}

		@Override
		public Adapter caseParty(Party object) {
			return createPartyAdapter();
		}

		@Override
		public Adapter caseExternalId(ExternalId object) {
			return createExternalIdAdapter();
		}

		@Override
		public Adapter caseResponsibleParty(ResponsibleParty object) {
			return createResponsiblePartyAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseTest(Test object) {
			return createTestAdapter();
		}

		@Override
		public Adapter casePartition(Partition object) {
			return createPartitionAdapter();
		}

		@Override
		public Adapter caseSelect(Select object) {
			return createSelectAdapter();
		}

		@Override
		public Adapter caseResource(Resource object) {
			return createResourceAdapter();
		}

		@Override
		public Adapter caseCitation(Citation object) {
			return createCitationAdapter();
		}

		@Override
		public Adapter caseRlink(Rlink object) {
			return createRlinkAdapter();
		}

		@Override
		public Adapter caseHash(Hash object) {
			return createHashAdapter();
		}

		@Override
		public Adapter casePropertyOwner(PropertyOwner object) {
			return createPropertyOwnerAdapter();
		}

		@Override
		public Adapter caseParameterOwner(ParameterOwner object) {
			return createParameterOwnerAdapter();
		}

		@Override
		public Adapter caseAnnotationOwner(AnnotationOwner object) {
			return createAnnotationOwnerAdapter();
		}

		@Override
		public Adapter caseLinkOwner(LinkOwner object) {
			return createLinkOwnerAdapter();
		}

		@Override
		public Adapter caseBase64(Base64 object) {
			return createBase64Adapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Analysis
	 * @generated
	 */
	public Adapter createAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Threat
	 * @generated
	 */
	public Adapter createThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ThreatAllocationRelation <em>Threat Allocation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ThreatAllocationRelation
	 * @generated
	 */
	public Adapter createThreatAllocationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ThreatMitigationRelation <em>Threat Mitigation Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ThreatMitigationRelation
	 * @generated
	 */
	public Adapter createThreatMitigationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.AffectRelation <em>Affect Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.AffectRelation
	 * @generated
	 */
	public Adapter createAffectRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.AttackChain <em>Attack Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.AttackChain
	 * @generated
	 */
	public Adapter createAttackChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.AttackChainStep <em>Attack Chain Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.AttackChainStep
	 * @generated
	 */
	public Adapter createAttackChainStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ScoreSystem <em>Score System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ScoreSystem
	 * @generated
	 */
	public Adapter createScoreSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ImpactScore <em>Impact Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ImpactScore
	 * @generated
	 */
	public Adapter createImpactScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.DifficultyScore <em>Difficulty Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.DifficultyScore
	 * @generated
	 */
	public Adapter createDifficultyScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.DataOwnerElement <em>Data Owner Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.DataOwnerElement
	 * @generated
	 */
	public Adapter createDataOwnerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ComponentOwner <em>Component Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ComponentOwner
	 * @generated
	 */
	public Adapter createComponentOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ExternalThreat <em>External Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ExternalThreat
	 * @generated
	 */
	public Adapter createExternalThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ExternalElement <em>External Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ExternalElement
	 * @generated
	 */
	public Adapter createExternalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ImpactConfiguration <em>Impact Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ImpactConfiguration
	 * @generated
	 */
	public Adapter createImpactConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ExternalControl <em>External Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ExternalControl
	 * @generated
	 */
	public Adapter createExternalControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ThreatsOwner <em>Threats Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ThreatsOwner
	 * @generated
	 */
	public Adapter createThreatsOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ControlOwner <em>Control Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ControlOwner
	 * @generated
	 */
	public Adapter createControlOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.AbstractControlOwner <em>Abstract Control Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.AbstractControlOwner
	 * @generated
	 */
	public Adapter createAbstractControlOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.DataOwner <em>Data Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.DataOwner
	 * @generated
	 */
	public Adapter createDataOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ControlDefinition <em>Control Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ControlDefinition
	 * @generated
	 */
	public Adapter createControlDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Remark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Remark
	 * @generated
	 */
	public Adapter createRemarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.BackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.BackMatter
	 * @generated
	 */
	public Adapter createBackMatterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.DocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.DocumentId
	 * @generated
	 */
	public Adapter createDocumentIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Revisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Revisions
	 * @generated
	 */
	public Adapter createRevisionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.TelephoneNumber
	 * @generated
	 */
	public Adapter createTelephoneNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ExternalId
	 * @generated
	 */
	public Adapter createExternalIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ResponsibleParty
	 * @generated
	 */
	public Adapter createResponsiblePartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Select
	 * @generated
	 */
	public Adapter createSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Citation
	 * @generated
	 */
	public Adapter createCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Rlink <em>Rlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Rlink
	 * @generated
	 */
	public Adapter createRlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Hash
	 * @generated
	 */
	public Adapter createHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.PropertyOwner <em>Property Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.PropertyOwner
	 * @generated
	 */
	public Adapter createPropertyOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.ParameterOwner <em>Parameter Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.ParameterOwner
	 * @generated
	 */
	public Adapter createParameterOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.AnnotationOwner <em>Annotation Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.AnnotationOwner
	 * @generated
	 */
	public Adapter createAnnotationOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.LinkOwner <em>Link Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.LinkOwner
	 * @generated
	 */
	public Adapter createLinkOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.TRADES.Base64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.TRADES.Base64
	 * @generated
	 */
	public Adapter createBase64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TRADESAdapterFactory
