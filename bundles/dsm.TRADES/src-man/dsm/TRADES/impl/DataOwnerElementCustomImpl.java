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

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import dsm.TRADES.Data;
import dsm.TRADES.DataOwner;
import dsm.TRADES.DataOwnerElement;

public class DataOwnerElementCustomImpl extends DataOwnerElementImpl {

	public static EList<Data> getDatas(DataOwnerElement element) {
		DataOwner owner = element.getDataOwner();
		if (owner != null) {
			return owner.getData();
		}
		return ECollections.emptyEList();
	}

	public static EList<Data> getInheritedData(DataOwnerElement owner) {
		List<Data> results = new ArrayList<>();
		collectData(owner.eContainer(), results);
		return ECollections.asEList(results);
	}

	private static void collectData(EObject object, List<Data> collector) {
		if (object == null) {
			return;
		}
		if (object instanceof DataOwnerElement) {
			collector.addAll(((DataOwnerElement) object).getDatas());
		}

		collectData(object.eContainer(), collector);
	}

	@Override
	public EList<Data> getDatas() {
		return getDatas(this);
	}

	@Override
	public EList<Data> getInheritedDatas() {
		return getInheritedData(this);
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
