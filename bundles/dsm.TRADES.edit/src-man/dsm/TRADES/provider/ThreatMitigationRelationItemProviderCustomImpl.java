package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.TRADES.ThreatMitigationRelation;

public class ThreatMitigationRelationItemProviderCustomImpl extends ThreatMitigationRelationItemProvider {
	
	public ThreatMitigationRelationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		String label = ((ThreatMitigationRelation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ThreatMitigationRelation_type") : label;
		}

}
