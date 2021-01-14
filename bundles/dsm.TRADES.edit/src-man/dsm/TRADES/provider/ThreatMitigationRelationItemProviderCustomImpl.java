package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;

public class ThreatMitigationRelationItemProviderCustomImpl extends ThreatMitigationRelationItemProvider {

	public ThreatMitigationRelationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		ThreatMitigationRelation relation = (ThreatMitigationRelation) object;

		Threat threat = relation.getThreat();
		if (threat != null) {
			return "Mitigates '" + threat.getName() + "'";
		} else {
			ThreatAllocationRelation threatAlloRel = relation.getMitigates();
			return "Mitigate '"
					+ ((IItemLabelProvider) getAdapterFactory().adapt(threatAlloRel, IItemLabelProvider.class))
							.getText(threatAlloRel)
					+ "'";
		}

	}

	@Override
	public void notifyChanged(Notification notification) {

		switch (notification.getFeatureID(ThreatMitigationRelation.class)) {
		case TRADESPackage.THREAT_MITIGATION_RELATION__THREAT:
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
	}

}
