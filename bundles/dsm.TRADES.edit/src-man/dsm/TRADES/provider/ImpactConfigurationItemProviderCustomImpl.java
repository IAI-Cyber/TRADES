package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactConfiguration;

public class ImpactConfigurationItemProviderCustomImpl extends ImpactConfigurationItemProvider {

	public ImpactConfigurationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		ImpactConfiguration impactConfiguration = (ImpactConfiguration) object;

		DifficultyScore difficulty = impactConfiguration.getDifficulty();
		if (difficulty != null) {
			return ((IItemLabelProvider) getRootAdapterFactory().adapt(difficulty, IItemLabelProvider.class))
					.getText(difficulty);
		} else {
			return "";
		}
	}

}
