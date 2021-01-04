package TRADES.design;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.PlatformUI;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.Component;
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

		int index = scoreSystem.getImpactscore().indexOf(score);
		if (index > 0) {
			score.setImpact(scoreSystem.getImpactscore().get(index - 1).getImpact() + 1);
		}

		for (DifficultyScore dif : scoreSystem.getDifficultyscore()) {
			ImpactConfiguration conf = TRADESFactory.eINSTANCE.createImpactConfiguration();
			score.getConfigurations().add(conf);
			conf.setDifficulty(dif);
		}
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

		int index = scoreSystem.getDifficultyscore().indexOf(diff);
		if (index > 0) {
			diff.setDifficulty(scoreSystem.getDifficultyscore().get(index - 1).getDifficulty() + 1);
		}

		for (ImpactScore impact : scoreSystem.getImpactscore()) {
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

		for (ImpactScore impact : scoreSystem.getImpactscore()) {
			int impact2 = impact.getImpact();
			minImpact = Math.min(minImpact, impact2);
			maxImpact = Math.max(maxImpact, impact2);
			for (ImpactConfiguration conf : impact.getConfigurations()) {
				int difficulty = conf.getDifficulty().getDifficulty();
				minDiff = Math.min(minDiff, difficulty);
				maxDiff = Math.max(maxDiff, difficulty);
			}
		}

		for (ImpactScore impact : scoreSystem.getImpactscore()) {
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

}
