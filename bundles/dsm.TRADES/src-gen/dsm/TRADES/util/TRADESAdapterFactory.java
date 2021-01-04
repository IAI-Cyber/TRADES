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
		public Adapter caseDataOwner(DataOwner object) {
			return createDataOwnerAdapter();
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
