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

import dsm.TRADES.DifficultyScore;

public class DifficultyScoreItemProviderCustomImpl extends DifficultyScoreItemProvider {

	public DifficultyScoreItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		DifficultyScore difficultyScore = (DifficultyScore) object;
		String label = difficultyScore.getName() == null ? "Difficulty" : " " + difficultyScore.getName();
		String score = "[" + String.valueOf(difficultyScore.getDifficulty()) + "]";
		return label + " " + score;
	}

}
