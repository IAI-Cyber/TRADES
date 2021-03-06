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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dsm.TRADES.Component;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;
import dsm.TRADES.util.EcoreUtils;

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
			// Threat mitigation can use the label of the ThreatAllocation so also refresh the label
			EcoreUtils
					.getInverse((EObject) notification.getNotifier(), ThreatMitigationRelation.class,
							TRADESPackage.eINSTANCE.getThreatMitigationRelation_MitigatedAllocation())
					.forEach(rel -> fireNotifyChanged(new ViewerNotification(notification, rel, false, true)));
			return;
		}
	}

}
