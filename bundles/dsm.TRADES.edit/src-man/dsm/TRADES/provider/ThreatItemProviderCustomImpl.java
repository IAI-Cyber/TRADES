package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.util.EcoreUtils;

public class ThreatItemProviderCustomImpl extends ThreatItemProvider {

	public ThreatItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String label = ((Threat) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Threat_type") : label;
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/Threat.png"));
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		if (notification.getFeatureID(Threat.class) == TRADESPackage.NAMED_ELEMENT__NAME) {
			Object notifier = notification.getNotifier();
			if (notifier instanceof Threat) {
				Threat new_name = (Threat) notifier;
				for (ThreatAllocationRelation rel : new_name.getThreatAllocations()) {
					fireNotifyChanged(new ViewerNotification(notification, rel, false, true));
					// Threat name can be used in the label of ThreatMitigationRelation so refresh
					// them also
					EcoreUtils
							.getInverse(rel, ThreatMitigationRelation.class,
									TRADESPackage.eINSTANCE.getThreatMitigationRelation_MitigatedAllocation())
							.forEach(
									rel2 -> fireNotifyChanged(new ViewerNotification(notification, rel2, false, true)));
				}
			}
		}

	}

}
