package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.TRADES.DifficultyScore;

public class DifficultyScoreItemProviderCustomImpl extends DifficultyScoreItemProvider {

	public DifficultyScoreItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		DifficultyScore difficultyScore = (DifficultyScore) object;
		String label = difficultyScore.getName() == null ? "Difficulty" : " " + difficultyScore.getName();
		String score = "[" + String.valueOf(difficultyScore.getDifficulty()) + "]";
		return label + " " + score;
	}

}
