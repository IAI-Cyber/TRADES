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
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactConfiguration;

public class ImpactConfigurationItemProviderCustomImpl extends ImpactConfigurationItemProvider {

	public ImpactConfigurationItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		ImpactConfiguration impactConfiguration = (ImpactConfiguration) object;

		DifficultyScore difficulty = impactConfiguration.getDifficulty();
		if (difficulty != null) {
			return ((IItemLabelProvider) getRootAdapterFactory().adapt(difficulty, IItemLabelProvider.class))
					.getText(difficulty);
		} else {
			return "";
		}
	}

}
