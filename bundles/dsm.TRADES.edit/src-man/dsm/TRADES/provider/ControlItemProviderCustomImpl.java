package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.TRADES.Control;
import dsm.TRADES.Threat;

public class ControlItemProviderCustomImpl extends ControlItemProvider {

	public ControlItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getText(Object object) {
		String label = ((Control) object).getName();;
		return label == null || label.length() == 0 ? getString("_UI_Control_type") : label;
		
	} 

}
