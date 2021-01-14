package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dsm.TRADES.AffectRelation;
import dsm.TRADES.TRADESPackage;

public class AffectRelationItemProviderCustomImpl extends AffectRelationItemProvider {

	public AffectRelationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		AffectRelation rel = (AffectRelation) object;
		String name = rel.getName();
		String targetNames = rel.getSourceComponent().getName() + "->" + rel.getTargetComponent().getName();
		if (name == null || name.isEmpty()) {
			return targetNames;
		} else {
			return name + " (" + targetNames + ")";
		}
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		switch (notification.getFeatureID(AffectRelation.class)) {
		case TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT:
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
	}
}
