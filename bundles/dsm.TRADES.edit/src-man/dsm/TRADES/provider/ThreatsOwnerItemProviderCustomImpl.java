package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class ThreatsOwnerItemProviderCustomImpl extends ThreatsOwnerItemProvider {

	public ThreatsOwnerItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return "Threats";
	}

}
