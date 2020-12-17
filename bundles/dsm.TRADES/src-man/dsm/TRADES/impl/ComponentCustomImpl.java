package dsm.TRADES.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import dsm.TRADES.Control;
import dsm.TRADES.SemanticHelper;

public class ComponentCustomImpl extends ComponentImpl {

	@Override
	public EList<Control> getAllControls() {
		return ECollections.asEList(SemanticHelper.getAllControls(this));
	}
}
