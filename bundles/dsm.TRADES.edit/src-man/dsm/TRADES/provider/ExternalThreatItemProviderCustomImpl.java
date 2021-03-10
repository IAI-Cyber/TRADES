package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.TRADES.ExternalThreat;

public class ExternalThreatItemProviderCustomImpl extends ExternalThreatItemProvider {

	public ExternalThreatItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String label = ((ExternalThreat) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ExternalThreat_type") : label;
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/ExternalThreat.png"));
	}
}
