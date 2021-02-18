package dsm.TRADES.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

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

	@Override
	public EList<Data> getDatas() {
		return getDatas(this);
	}
}
