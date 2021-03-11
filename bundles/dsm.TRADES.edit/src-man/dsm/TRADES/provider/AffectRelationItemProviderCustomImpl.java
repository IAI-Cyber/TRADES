/******************************************************************************************************
* Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
* This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
* 
* SPDX-License-Identifier: EPL-2.0
* 
* Contributors:
*     ELTA Ltd - initial API and implementation
* 
*******************************************************************************************************/
package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dsm.TRADES.AffectRelation;
import dsm.TRADES.Component;
import dsm.TRADES.TRADESPackage;

public class AffectRelationItemProviderCustomImpl extends AffectRelationItemProvider {

	public AffectRelationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		AffectRelation rel = (AffectRelation) object;
		String name = rel.getName();
		Component sourceComponent = rel.getSourceComponent();
		Component targetComponent = rel.getTargetComponent();
		String targetNames = sourceComponent != null ? sourceComponent.getName()
				: "" + "->" + targetComponent != null ? targetComponent.getName() : "";
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
