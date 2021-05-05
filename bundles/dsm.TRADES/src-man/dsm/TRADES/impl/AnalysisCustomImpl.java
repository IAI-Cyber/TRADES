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

package dsm.TRADES.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.Data;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.ExternalThreat;
import dsm.TRADES.SemanticHelper;
import dsm.TRADES.ThreatsOwner;
import dsm.TRADES.util.EcoreUtils;

public class AnalysisCustomImpl extends AnalysisImpl {
	@Override
	public EList<Control> getAllControls() {
		return ECollections.asEList(SemanticHelper.getAllControls(this));
	}

	@Override
	public EList<Data> getDatas() {
		return DataOwnerElementCustomImpl.getDatas(this);
	}

	@Override
	public EList<Data> getInheritedDatas() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<Data> getAllDatas() {
		EList<Data> ownedData = getDatas();
		EList<Data> inheritedData = getInheritedDatas();
		List<Data> result = new ArrayList<>(ownedData.size() + inheritedData.size());
		result.addAll(ownedData);
		result.addAll(inheritedData);
		return ECollections.asEList(result);
	}

	private Stream<ExternalControl> getAllExternalControls() {
		return EcoreUtils.eAllContentSteamWithSelf(this).flatMap(i -> {
			if (i instanceof AbstractControlOwner) {
				ControlOwner controlOwner = ((AbstractControlOwner) i).getControlOwner();
				if (controlOwner != null) {
					return controlOwner.getExternals().stream().filter(e -> e instanceof ExternalControl)
							.map(e -> ((ExternalControl) e));
				}
			}
			return Stream.empty();
		}).filter(t -> t.getId() != null);
	}


	@Override
	public ExternalControl getExternalControl(String id, String source) {
		if (id == null) {
			return null;
		}
		return getAllExternalControls().filter(ext -> id.equals(ext.getId()) && Objects.equals(source, ext.getSource()))
				.findFirst()
				.orElse(null);
	}

	@Override
	public ExternalThreat getExternalThreat(String id, String source) {
		ThreatsOwner owner = getThreatOwner();
		if (owner == null || id == null) {
			return null;
		}
		return (ExternalThreat) owner.getExternals().stream().filter(
				e -> e instanceof ExternalThreat && id.equals(e.getId())
						&& Objects.equals(source, ((ExternalThreat) e).getSource()))
				.findFirst().orElse(null);
	}
}
