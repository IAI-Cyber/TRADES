package TRADES.design;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.Analysis;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.ControlType;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactConfiguration;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.ThreatType;
import dsm.TRADES.ThreatsOwner;

public class ProjectFactory {

	public static Analysis createInitialModel(String rootObjectName) {
		Analysis analysis = TRADESFactory.eINSTANCE.createAnalysis();
		analysis.setName(rootObjectName);

		ScoreSystem scoreSystem = TRADESFactory.eINSTANCE.createScoreSystem();
		analysis.setScoresystem(scoreSystem);

		ThreatsOwner threatOwner = TRADESFactory.eINSTANCE.createThreatsOwner();
		analysis.setThreatOwner(threatOwner);

		ThreatType internalThreatFolder = threatOwner.getExternal();
		internalThreatFolder = TRADESFactory.eINSTANCE.createThreatType();
		internalThreatFolder.setName("Internals");
		threatOwner.setInternal(internalThreatFolder);

		ThreatType externalThreatFolder = threatOwner.getExternal();
		externalThreatFolder = TRADESFactory.eINSTANCE.createThreatType();
		externalThreatFolder.setName("Externals");
		threatOwner.setExternal(externalThreatFolder);

		createControlOwner(analysis);

		createDifficulty("Low", 1, scoreSystem);
		createDifficulty("Medium", 2, scoreSystem);
		createDifficulty("High", 3, scoreSystem);

		createImpact("Low", 1, scoreSystem);
		createImpact("Medium", 2, scoreSystem);
		createImpact("High", 3, scoreSystem);

		return analysis;
	}

	public static void createControlOwner(AbstractControlOwner analysis) {
		ControlOwner controlOwner = TRADESFactory.eINSTANCE.createControlOwner();
		analysis.setControlOwner(controlOwner);

		ControlType internalControlFolder = TRADESFactory.eINSTANCE.createControlType();
		internalControlFolder.setName("Internals");
		controlOwner.setInternal(internalControlFolder);

		ControlType externalControlFolder = TRADESFactory.eINSTANCE.createControlType();
		externalControlFolder.setName("Externals");
		controlOwner.setExternal(externalControlFolder);
	}

	private static void createDifficulty(String name, int score, ScoreSystem system) {
		DifficultyScore diff = TRADESFactory.eINSTANCE.createDifficultyScore();
		system.getDifficultyscore().add(diff);
		diff.setName(name);
		diff.setDifficulty(score);

	}

	private static void createImpact(String name, int score, ScoreSystem system) {
		ImpactScore impact = TRADESFactory.eINSTANCE.createImpactScore();
		system.getImpactscore().add(impact);
		impact.setName(name);
		impact.setImpact(score);
		for (DifficultyScore dif : system.getDifficultyscore()) {
			ImpactConfiguration conf = TRADESFactory.eINSTANCE.createImpactConfiguration();
			impact.getConfigurations().add(conf);
			conf.setDifficulty(dif);
		}
	}
}
