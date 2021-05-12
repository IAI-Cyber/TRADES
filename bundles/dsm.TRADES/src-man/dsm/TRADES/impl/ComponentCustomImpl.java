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

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import dsm.TRADES.Control;
import dsm.TRADES.Data;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.SemanticHelper;

public class ComponentCustomImpl extends ComponentImpl {

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
		return DataOwnerElementCustomImpl.getInheritedData(this);
	}

	@Override
	public EList<ExternalControl> getExternalControls(String id, String sourceId) {
		if (id == null || getControlOwner() == null) {
			return ECollections.emptyEList();
		}
		return ECollections.asEList(getControlOwner().getExternals().stream()
				.filter(ext -> id.equals(ext.getId()) && Objects.equals(sourceId, ext.getSourceID()))
				.collect(toList()));
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
}
