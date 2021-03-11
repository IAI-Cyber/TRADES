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
			ThreatAllocationRelation threatAlloRel = relation.getMitigatedAllocation();
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
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
	}

}
