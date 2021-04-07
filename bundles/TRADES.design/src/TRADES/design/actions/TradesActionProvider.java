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
package TRADES.design.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.sirius.business.api.session.Session;

import dsm.TRADES.Analysis;
import dsm.TRADES.util.TRADESSwitch;

public class TradesActionProvider extends TRADESSwitch<Object> {

	private final Session session;

	private List<IAction> genericActions = new ArrayList<IAction>();

	public TradesActionProvider(Session session) {
		super();
		this.session = session;
	}

	@Override
	public Object caseAnalysis(Analysis object) {
		genericActions.add(new ImportOscalCatalogAction(object, session));
		return super.caseAnalysis(object);
	}

	public List<IAction> getGenericActions() {
		return genericActions;
	}

}
