package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.TRADES.ExternalControl;

public class ExternalControlItemProviderCustomImpl extends ExternalControlItemProvider {

	public ExternalControlItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String label = ((ExternalControl) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ExternalControl_type") : label;
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/ExternalControl.png"));
	}
}
