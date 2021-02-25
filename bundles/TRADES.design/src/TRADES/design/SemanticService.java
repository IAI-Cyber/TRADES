package TRADES.design;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.collections.api.factory.Sets;
import org.eclipse.collections.api.set.FixedSizeSet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.ui.PlatformUI;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.AffectRelation;
import dsm.TRADES.Analysis;
import dsm.TRADES.AttackChain;
import dsm.TRADES.Component;
import dsm.TRADES.ComponentOwner;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DataOwnerElement;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ImpactConfiguration;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.RGBColor;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.util.EcoreUtils;

/**
 * Services used to compute business logic operations
 * 
 * @author Arthur Daussy
 *
 */
public class SemanticService {

	/**
	 * Initialize a new {@link ImpactScore}
	 * 
	 * <p>
	 * <ul>
	 * <li>Increment the score from the last create impact score</li>
	 * <li>Auto create a {@link ImpactConfiguration} for each
	 * {@link DifficultyScore} of this model</li>
	 * </ul>
	 * 
	 * <p>
	 * 
	 * @param score the context
	 */
	public void initImpactScore(ImpactScore score) {
		ScoreSystem scoreSystem = (ScoreSystem) score.eContainer();

		int index = scoreSystem.getImpactScores().indexOf(score);
		if (index > 0) {
			score.setImpact(scoreSystem.getImpactScores().get(index - 1).getImpact() + 1);
		}

		for (DifficultyScore dif : scoreSystem.getDifficultyScores()) {
			ImpactConfiguration conf = TRADESFactory.eINSTANCE.createImpactConfiguration();
			score.getConfigurations().add(conf);
			conf.setDifficulty(dif);
		}
	}

	public void synchronizeDifficulty(ThreatAllocationRelation rel) {

		AttackChain attackChain = rel.getAttackChain();

		if (attackChain != null) {
			int cmpDiff = attackChain.getComputedDifficulty();

			if (rel.getDifficultyScore() == null || rel.getDifficultyScore().getDifficulty() != cmpDiff) {
				ScoreSystem scoresystem = EcoreUtils.getAncestor(rel, Analysis.class).getScoresystem();
				DifficultyScore diffScore = scoresystem.getDifficultyScores().stream()
						.filter(d -> d.getDifficulty() == cmpDiff).findFirst().orElseGet(() -> {
							DifficultyScore diff = TRADESFactory.eINSTANCE.createDifficultyScore();
							scoresystem.getDifficultyScores().add(diff);
							diff.setDifficulty(cmpDiff);
							updateImpactWithNewDifficulty(diff, scoresystem);
							return diff;
						});
				rel.setDifficultyScore(diffScore);
			}
		}

	}

	/**
	 * Gets all the element that can contain data
	 * 
	 * @param analysis the root analysis
	 * @return a list of container
	 */
	public List<DataOwnerElement> getDataOwnerElements(Analysis analysis) {
		List<DataOwnerElement> results = new ArrayList<>();
		results.add(analysis);
		getSubDataOwners(analysis, results);
		return results;

	}

	private void getSubDataOwners(ComponentOwner o, List<DataOwnerElement> collector) {
		for (Component sub : o.getComponents()) {
			collector.add(sub);
			getSubDataOwners(sub, collector);
		}
	}

	public List<Data> getInheritedData(DataOwnerElement owner) {
		List<Data> results = new ArrayList<>();
		collectData(owner.eContainer(), results);
		return results;
	}

	public void collectData(EObject object, List<Data> collector) {
		if (object == null) {
			return;
		}
		if (object instanceof DataOwnerElement) {
			collector.addAll(((DataOwnerElement) object).getDatas());
		}

		collectData(object.eContainer(), collector);

	}

	public void moveData(Data toMove, DataOwnerElement owner) {
		DataOwner dataOwner = owner.getDataOwner();
		if (dataOwner == null) {
			dataOwner = TRADESFactory.eINSTANCE.createDataOwner();
			owner.setDataOwner(dataOwner);
		}
		dataOwner.getData().add(toMove);
	}

	public void createInternalControl(AbstractControlOwner cmp) {
		Control control = TRADESFactory.eINSTANCE.createControl();

		ControlOwner owner = cmp.getControlOwner();
		if (owner == null) {
			owner = TRADESFactory.eINSTANCE.createControlOwner();
			cmp.setControlOwner(owner);
		}

		owner.getInternals().add(control);
	}

	public Data createData(DataOwnerElement element) {
		DataOwner owner = element.getDataOwner();

		if (owner == null) {
			owner = TRADESFactory.eINSTANCE.createDataOwner();
			element.setDataOwner(owner);
		}

		Data result = TRADESFactory.eINSTANCE.createData();
		result.setName("New data");
		owner.getData().add(result);

		return result;

	}

	public DataOwner getOrCreateDataOwner(DataOwnerElement element) {

		DataOwner owner = element.getDataOwner();
		if (owner == null) {
			owner = TRADESFactory.eINSTANCE.createDataOwner();
			element.setDataOwner(owner);
		}

		return owner;
	}

	/**
	 * Gets all {@link ImpactConfiguration} linked to a {@link DifficultyScore}
	 * 
	 * @param diff the context
	 * @return a list of {@link ImpactConfiguration}
	 */
	public List<ImpactConfiguration> getLinkedConfigurations(DifficultyScore diff) {
		return Session.of(diff).get().getSemanticCrossReferencer()
				.getInverseReferences(diff, TRADESPackage.eINSTANCE.getImpactConfiguration_Difficulty(), true).stream()
				.map(s -> (ImpactConfiguration) s.getEObject()).collect(Collectors.toList());

	}

	/**
	 * Initialize a new {@link DifficultyScore}
	 * 
	 * <p>
	 * <ul>
	 * <li>Increment the score from the last created difficulty score</li>
	 * <li>Auto create a {@link ImpactConfiguration} for each {@link ImpactScore} of
	 * this model</li>
	 * </ul>
	 * 
	 * <p>
	 * 
	 * @param diff the context
	 */
	public void initDifficulty(DifficultyScore diff) {
		ScoreSystem scoreSystem = (ScoreSystem) diff.eContainer();

		int index = scoreSystem.getDifficultyScores().indexOf(diff);
		if (index > 0) {
			diff.setDifficulty(scoreSystem.getDifficultyScores().get(index - 1).getDifficulty() + 1);
		}

		updateImpactWithNewDifficulty(diff, scoreSystem);
	}

	private void updateImpactWithNewDifficulty(DifficultyScore diff, ScoreSystem scoreSystem) {
		for (ImpactScore impact : scoreSystem.getImpactScores()) {
			ImpactConfiguration conf = TRADESFactory.eINSTANCE.createImpactConfiguration();
			impact.getConfigurations().add(conf);
			conf.setDifficulty(diff);
		}
	}

	/**
	 * Initialize all the color for each {@link ImpactConfiguration} contained in
	 * the current {@link ScoreSystem}
	 * 
	 * @param scoreSystem the context
	 */
	public void initColors(ScoreSystem scoreSystem) {

		if (!MessageDialog.openConfirm(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Override colors",
				"Your are about to override all colors from the 'Risk management summary' tab. Do you want to continue")) {
			return;
		}
		double minImpact = Double.MAX_VALUE;
		double maxImpact = 0;
		double minDiff = Double.MAX_VALUE;
		double maxDiff = 0;

		for (ImpactScore impact : scoreSystem.getImpactScores()) {
			int impact2 = impact.getImpact();
			minImpact = Math.min(minImpact, impact2);
			maxImpact = Math.max(maxImpact, impact2);
			for (ImpactConfiguration conf : impact.getConfigurations()) {
				int difficulty = conf.getDifficulty().getDifficulty();
				minDiff = Math.min(minDiff, difficulty);
				maxDiff = Math.max(maxDiff, difficulty);
			}
		}

		for (ImpactScore impact : scoreSystem.getImpactScores()) {
			int impact2 = impact.getImpact();
			RGBColor impactColor = ColorService.computeColor(new RGBColor(154, 255, 77), new RGBColor(252, 86, 86),
					minImpact, maxImpact, impact2);
			for (ImpactConfiguration conf : impact.getConfigurations()) {
				int difficulty = conf.getDifficulty().getDifficulty();
				RGBColor diffColor = ColorService.computeColor(new RGBColor(252, 86, 86), new RGBColor(154, 255, 77),
						minDiff, maxDiff, difficulty);
				conf.setColor(impactColor.merge(diffColor));

			}
		}
	}

	public Control moveControl(AbstractControlOwner newOnwer, Control control) {
		ControlOwner owner = newOnwer.getControlOwner();
		if (owner == null) {
			owner = TRADESFactory.eINSTANCE.createControlOwner();
			newOnwer.setControlOwner(owner);
		}
		if (control instanceof ExternalControl) {
			owner.getExternals().add(control);
		} else {
			owner.getInternals().add(control);
		}

		return control;
	}

	public void affectThreatToComponent(Component owner, Threat threat) {

		if (owner.getThreatAllocations().stream().noneMatch(rel -> rel.getThreat() == threat)) {
			ThreatAllocationRelation rel = TRADESFactory.eINSTANCE.createThreatAllocationRelation();
			owner.getThreatAllocations().add(rel);
			rel.setThreat(threat);

		}
	}

	/**
	 * Features to ignore when computing the usage of a {@link DifficultyScore}
	 */
	private static FixedSizeSet<EReference> USAGE_REF_TO_IGNORE_DIFF_SCORE = Sets.fixedSize
			.of(TRADESPackage.eINSTANCE.getImpactConfiguration_Difficulty());
	/**
	 * Features to ignore when computing the usage of a {@link ImpactScore}
	 */
	private static FixedSizeSet<EReference> USAGE_REF_TO_IGNORE_IMPACT_SCORE = Sets.fixedSize
			.of(TRADESPackage.eINSTANCE.getImpactConfiguration_Impact());

	public void clearUnusedDifficulties(ScoreSystem scoreSystem) {
		ECrossReferenceAdapter crossRef = SessionManager.INSTANCE.getSession(scoreSystem).getSemanticCrossReferencer();
		List<EObject> toRemove = new ArrayList<>();

		for (DifficultyScore diff : scoreSystem.getDifficultyScores()) {

			if (!isSemanticallyUsed(diff, crossRef, USAGE_REF_TO_IGNORE_DIFF_SCORE)) {
				toRemove.add(diff);
				toRemove.addAll(EcoreUtils.getInverse(diff, ImpactConfiguration.class, crossRef,
						TRADESPackage.eINSTANCE.getImpactConfiguration_Difficulty()));
			}
		}

		for (EObject rm : toRemove) {
			SiriusPlugin.getDefault().getModelAccessorRegistry().getModelAccessor(rm).eRemove(rm);
		}
	}

	public void clearUnusedImpacts(ScoreSystem scoreSystem) {
		ECrossReferenceAdapter crossRef = SessionManager.INSTANCE.getSession(scoreSystem).getSemanticCrossReferencer();
		List<EObject> toRemove = new ArrayList<>();

		for (ImpactScore impact : scoreSystem.getImpactScores()) {

			if (!isSemanticallyUsed(impact, crossRef, USAGE_REF_TO_IGNORE_IMPACT_SCORE)) {
				toRemove.add(impact);
			}
		}

		for (EObject rm : toRemove) {
			SiriusPlugin.getDefault().getModelAccessorRegistry().getModelAccessor(rm).eRemove(rm);
		}
	}

	public boolean isSemanticallyUsed(EObject o, ECrossReferenceAdapter crossRef, Collection<EReference> toIgnore) {
		return crossRef.getInverseReferences(o).stream().anyMatch(s -> {
			EStructuralFeature feature = s.getEStructuralFeature();

			EObject notifier = s.getEObject();
			if (notifier != null && notifier.eClass().getEPackage() != TRADESPackage.eINSTANCE) {
				return false;
			}

			if (feature instanceof EReference) {
				EReference eReference = (EReference) feature;
				// Ignore containment
				// them also
				if (eReference.isContainment()) {
					return false;
				}

				if (toIgnore.contains(eReference)) {
					return false;
				}
			}

			return true;
		});
	}

	public List<AffectRelation> getAffectRelationsBy(Data data) {
		return EcoreUtils.getInverse(data, AffectRelation.class, TRADESPackage.eINSTANCE.getAffectRelation_Data());
	}

	/**
	 * Check if the given component is affected by a data. The data is retrieve by
	 * accessing the {@link DSemanticDiagram#getTarget()} value
	 * 
	 * @param component the component to test
	 * @param node      the node that belong to a {@link DSemanticDiagram} that is
	 *                  linked to a data
	 * @return
	 */
	public boolean isComponentDataPassThrough(Component component, AbstractDNode node) {
		DSemanticDiagram diagram = DiagramService.getContainingDiagram(node);
		if (diagram == null) {
			return false;
		}

		EObject target = diagram.getTarget();
		if (!(target instanceof Data)) {
			return false;
		}

		Data data = (Data) target;
		List<AffectRelation> affectRelations = getAffectRelationsBy(data);
		return affectRelations.stream()
				.flatMap(affect -> Stream.of(affect.getSourceComponent(), affect.getTargetComponent()))
				.noneMatch(c -> c == component);
	}

	/**
	 * Gets the root components affected by the data. A root component is defined by
	 * a component that is affected by the date but which is not contained by
	 * another affected component
	 * 
	 * @param data the queried data
	 * @return a list of component
	 */
	public List<Component> getRootAffectedComponentsByData(Data data) {

		List<AffectRelation> affectRelations = getAffectRelationsBy(data);
		Set<Component> allComponents = affectRelations.stream()
				.flatMap(affect -> Stream.of(affect.getSourceComponent(), affect.getTargetComponent()))
				.filter(c -> c != null).collect(toCollection(LinkedHashSet::new));

		// Filter sub components

		List<Component> rootComponents = new ArrayList<>();
		Iterator<Component> cmpItge = allComponents.iterator();
		while (cmpItge.hasNext()) {
			Component component = cmpItge.next();
			if (!isContainedBy(component, allComponents)) {
				rootComponents.add(component);
			}
		}

		return rootComponents;
	}

	/**
	 * Gets the list of children component that are either affected by the given
	 * data or owning another affected component
	 * 
	 * @param parent the parent component
	 * @param data   the current data
	 * @return a list of children
	 */
	public List<Component> getSubComponentAffectBy(Component parent, Data data) {

		List<AffectRelation> affectRelations = getAffectRelationsBy(data);
		Set<Component> allComponents = affectRelations.stream()
				.flatMap(affect -> Stream.of(affect.getSourceComponent(), affect.getTargetComponent()))
				.filter(c -> c != null).collect(toSet());

		return parent.getComponents().stream().filter(child -> contains(child, allComponents)).collect(toList());

	}

	/**
	 * Checks if the given component contains at least one of the given components
	 * 
	 * @param c          the component to test
	 * @param components list of possible children (or itself)
	 * @return <code>true</code> if the component or one of its children belongs to
	 *         the given set
	 */
	private boolean contains(Component c, Set<Component> components) {
		if (components.contains(c)) {
			return true;
		}
		for (Component child : c.getComponents()) {
			if (contains(child, components)) {
				return true;
			}
		}

		return false;

	}

	/**
	 * Checks if the given component is contained by at least on of the given
	 * component (returns false if c belongs to the given set)
	 * 
	 * @param c          the component to test
	 * @param components the set of potential container
	 * @return <code>true</code> if contained by at least of of the given component
	 */
	private boolean isContainedBy(Component c, Set<Component> components) {
		EObject container = c.eContainer();
		while (container != null) {
			if (components.contains(container)) {
				return true;
			}
			container = container.eContainer();
		}
		return false;
	}

}
