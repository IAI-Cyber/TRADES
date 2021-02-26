package TRADES.design;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactConfiguration;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.testlib.AbstractTest;

public class SemanticServiceTest extends AbstractTest {

	@Test
	public void testImpactScoreInit_NoDifficulty() {

		ScoreSystem scoreSystem = TRADESFactory.eINSTANCE.createScoreSystem();

		ImpactScore impactScore = TRADESFactory.eINSTANCE.createImpactScore();
		scoreSystem.getImpactScores().add(impactScore);

		SemanticService.initImpactScore(impactScore);
		assertThat(impactScore.getImpact()).isEqualTo(0);
		assertThat(impactScore.getConfigurations()).isEmpty();

		ImpactScore impactScore2 = TRADESFactory.eINSTANCE.createImpactScore();
		scoreSystem.getImpactScores().add(impactScore2);

		SemanticService.initImpactScore(impactScore2);
		assertThat(impactScore2.getImpact()).isEqualTo(1);
		assertThat(impactScore2.getConfigurations()).isEmpty();
	}

	@Test
	public void testImpactScoreInit_WithDifficulty() {
		ScoreSystem scoreSystem = TRADESFactory.eINSTANCE.createScoreSystem();

		DifficultyScore diff1 = TRADESFactory.eINSTANCE.createDifficultyScore();
		scoreSystem.getDifficultyScores().add(diff1);
		DifficultyScore diff2 = TRADESFactory.eINSTANCE.createDifficultyScore();
		scoreSystem.getDifficultyScores().add(diff2);

		ImpactScore impactScore = TRADESFactory.eINSTANCE.createImpactScore();
		scoreSystem.getImpactScores().add(impactScore);

		SemanticService.initImpactScore(impactScore);
		assertThat(impactScore.getImpact()).isEqualTo(0);
		assertThat(impactScore.getConfigurations()).hasSize(2);

		ImpactConfiguration conf1 = impactScore.getConfigurations().get(0);
		assertImpactConfiguration(conf1, diff1);

		ImpactConfiguration conf2 = impactScore.getConfigurations().get(1);
		assertImpactConfiguration(conf2, diff2);
	}

	private void assertImpactConfiguration(ImpactConfiguration conf, DifficultyScore expected) {
		assertThat(conf.getDifficulty()).isEqualTo(expected);
		assertThat(conf.getColor()).isNotNull();
	}

	@Test
	public void testSifficultyScoreInit_NoImpact() {

		ScoreSystem scoreSystem = TRADESFactory.eINSTANCE.createScoreSystem();

		DifficultyScore diffScore = TRADESFactory.eINSTANCE.createDifficultyScore();
		scoreSystem.getDifficultyScores().add(diffScore);

		SemanticService.initDifficulty(diffScore);
		assertThat(diffScore.getDifficulty()).isEqualTo(0);

		DifficultyScore diffScore2 = TRADESFactory.eINSTANCE.createDifficultyScore();
		scoreSystem.getDifficultyScores().add(diffScore2);

		SemanticService.initDifficulty(diffScore2);
		assertThat(diffScore2.getDifficulty()).isEqualTo(1);

	}

	@Test
	public void testDifficultyScoreInit_WithImpact() {
		ScoreSystem scoreSystem = TRADESFactory.eINSTANCE.createScoreSystem();

		ImpactScore impactScore = TRADESFactory.eINSTANCE.createImpactScore();
		scoreSystem.getImpactScores().add(impactScore);
		ImpactScore impactScore2 = TRADESFactory.eINSTANCE.createImpactScore();
		scoreSystem.getImpactScores().add(impactScore2);

		DifficultyScore diffScore = TRADESFactory.eINSTANCE.createDifficultyScore();
		scoreSystem.getDifficultyScores().add(diffScore);

		SemanticService.initDifficulty(diffScore);
		assertThat(diffScore.getDifficulty()).isEqualTo(0);

		assertImpactConfiguration(impactScore.getConfigurations().get(0), diffScore);
		assertImpactConfiguration(impactScore2.getConfigurations().get(0), diffScore);

		DifficultyScore diffScore2 = TRADESFactory.eINSTANCE.createDifficultyScore();
		scoreSystem.getDifficultyScores().add(diffScore2);

		SemanticService.initDifficulty(diffScore2);
		assertThat(diffScore2.getDifficulty()).isEqualTo(1);

		assertImpactConfiguration(impactScore.getConfigurations().get(0), diffScore);
		assertImpactConfiguration(impactScore.getConfigurations().get(1), diffScore2);
		assertImpactConfiguration(impactScore2.getConfigurations().get(0), diffScore);
		assertImpactConfiguration(impactScore2.getConfigurations().get(1), diffScore2);

	}

}
