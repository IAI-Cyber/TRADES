package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dsm.TRADES.AffectRelation;
import dsm.TRADES.Component;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatAllocationRelation;

public class ComponentItemProviderCustomImpl extends ComponentItemProvider {

	public ComponentItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		String label = ((Component) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Component_type") : label;
	}

	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
		if (notification.getFeature() == TRADESPackage.eINSTANCE.getNamedElement_Name()) {
			Object notifier = notification.getNotifier();
			if (notifier instanceof Component) {
				Component new_name = (Component) notifier;
				for (ThreatAllocationRelation rel : new_name.getThreatAllocations()) {
					fireNotifyChanged(new ViewerNotification(notification, rel, false, true));
				}
				for (AffectRelation affect : new_name.getAffectrelation()) {
					fireNotifyChanged(new ViewerNotification(notification, affect, false, true));
				}

				ECrossReferenceAdapter crossRef = new_name.eAdapters().stream()
						.filter(e -> e instanceof ECrossReferenceAdapter).findAny()
						.map(opt -> (ECrossReferenceAdapter) opt).orElse(null);
				if (crossRef != null) {
					crossRef.getInverseReferences(new_name).stream()//
							.filter(s -> s.getEObject() instanceof AffectRelation
									&& s.getEStructuralFeature() == TRADESPackage.eINSTANCE
											.getAffectRelation_TargetComponent())//
							.map(s -> s.getEObject())//
							.forEach(rel -> fireNotifyChanged(new ViewerNotification(notification, rel, false, true)));
					;

				}
			}
		}

	}

}
