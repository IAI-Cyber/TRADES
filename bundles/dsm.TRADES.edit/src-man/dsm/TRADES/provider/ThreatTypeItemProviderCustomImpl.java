package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.TRADES.ThreatType;

public class ThreatTypeItemProviderCustomImpl extends ThreatTypeItemProvider {

	public ThreatTypeItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String label = ((ThreatType) object).getName();
		return label == null || label.length() == 0 ? "" : label;
	}

}
