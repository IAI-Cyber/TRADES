package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dsm.TRADES.Component;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;

public class ThreatAllocationRelationItemProviderCustomImpl extends ThreatAllocationRelationItemProvider {

	public ThreatAllocationRelationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String label = "";
		ThreatAllocationRelation relation = ((ThreatAllocationRelation) object);
		Threat threat = relation.getThreat();
		if (threat != null && threat.getName() != null) {
			label += threat.getName();
		}
		label += " on ";
		Component component = relation.getComponent();
		if (component != null && component.getName() != null) {
			label += component.getName();
		}
		return label;
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		switch (notification.getFeatureID(ThreatAllocationRelation.class)) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
	}

}
