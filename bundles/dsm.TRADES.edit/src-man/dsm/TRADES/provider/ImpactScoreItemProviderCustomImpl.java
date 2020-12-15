package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.TRADES.ImpactScore;

public class ImpactScoreItemProviderCustomImpl extends ImpactScoreItemProvider {

	public ImpactScoreItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		ImpactScore impactScore = (ImpactScore) object;
		String label = impactScore.getName() == null ? "" : " " + impactScore.getName();
		String score = "[" + String.valueOf(impactScore.getImpact()) + "]";
		return "Impact" + label + " " + score;
	}

}
