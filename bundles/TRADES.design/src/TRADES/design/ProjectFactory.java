package TRADES.design;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.Analysis;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactConfiguration;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.ThreatsOwner;

public class ProjectFactory {

	public static Analysis createInitialModel(String rootObjectName) {
		Analysis analysis = TRADESFactory.eINSTANCE.createAnalysis();
		analysis.setName(rootObjectName);

		ScoreSystem scoreSystem = TRADESFactory.eINSTANCE.createScoreSystem();
		analysis.setScoreSystem(scoreSystem);

		ThreatsOwner threatOwner = TRADESFactory.eINSTANCE.createThreatsOwner();
		analysis.setThreatOwner(threatOwner);

		createControlOwner(analysis);

		createDataOwner(analysis);

		createDifficulty("Low", 1, scoreSystem);
		createDifficulty("Medium", 2, scoreSystem);
		createDifficulty("High", 3, scoreSystem);

		createImpact("Low", 1, scoreSystem);
		createImpact("Medium", 2, scoreSystem);
		createImpact("High", 3, scoreSystem);

		return analysis;
	}

	public static void createDataOwner(Analysis analysis) {
		DataOwner dataOwner = TRADESFactory.eINSTANCE.createDataOwner();
		analysis.setDataOwner(dataOwner);
	}

	public static void createControlOwner(AbstractControlOwner analysis) {
		ControlOwner controlOwner = TRADESFactory.eINSTANCE.createControlOwner();
		analysis.setControlOwner(controlOwner);

	}

	private static void createDifficulty(String name, int score, ScoreSystem system) {
		DifficultyScore diff = TRADESFactory.eINSTANCE.createDifficultyScore();
		system.getDifficultyScores().add(diff);
		diff.setName(name);
		diff.setDifficulty(score);

	}

	private static void createImpact(String name, int score, ScoreSystem system) {
		ImpactScore impact = TRADESFactory.eINSTANCE.createImpactScore();
		system.getImpactScores().add(impact);
		impact.setName(name);
		impact.setImpact(score);
		for (DifficultyScore dif : system.getDifficultyScores()) {
			ImpactConfiguration conf = TRADESFactory.eINSTANCE.createImpactConfiguration();
			impact.getConfigurations().add(conf);
			conf.setDifficulty(dif);
		}
	}
}
