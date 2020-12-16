package TRADES.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.PlatformUI;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ControlType;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactConfiguration;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.RGBColor;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;

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
	
	public List<Control> getAllControls(AbstractControlOwner owner){
		ControlOwner cOwner = owner.getControlOwner();
		if(cOwner == null) {
			return Collections.emptyList();
		}
		
		List<Control> result = new ArrayList<Control>();
		
		Optional.ofNullable(cOwner.getInternal()).ifPresent(t -> result.addAll(t.getControls()));
		Optional.ofNullable(cOwner.getExternal()).ifPresent(t -> result.addAll(t.getControls()));
		return result;
	}
	
	

	public void createInternalControl(AbstractControlOwner cmp) {
		Control control = TRADESFactory.eINSTANCE.createControl();
		
		ControlOwner owner = cmp.getControlOwner();
		if(owner == null) {
			owner = TRADESFactory.eINSTANCE.createControlOwner();
			cmp.setControlOwner(owner);
		}
		
		ControlType internal = owner.getInternal();
		if(internal == null) {
			internal = TRADESFactory.eINSTANCE.createControlType();
			owner.setInternal(internal);
		}
		
		internal.getControls().add(control);
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
			RGBColor impactColor = ColorService.computeColor(new RGBColor(154, 255, 77), new RGBColor(252, 86, 86), minImpact, maxImpact,
					impact2);
			for (ImpactConfiguration conf : impact.getConfigurations()) {
				int difficulty = conf.getDifficulty().getDifficulty();
				RGBColor diffColor = ColorService.computeColor(new RGBColor(252, 86, 86), new RGBColor(154, 255, 77), minDiff, maxDiff,
						difficulty);
				conf.setColor(impactColor.merge(diffColor));

			}
		}
	}

}
