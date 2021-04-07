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
package TRADES.design.menu;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.PlatformUI;

import TRADES.design.actions.TradesActionProvider;
import dsm.trades.rcp.utils.HandlerUtils;

/**
 * Object in charge of adding contextual menu entries on semantic selection
 * 
 * @author Arthur Daussy
 *
 */
public class MenuFiller extends ContributionItem {

	public MenuFiller() {

	}

	public MenuFiller(String id) {
		super(id);
	}

	@Override
	public void fill(Menu menu, int index) {
		super.fill(menu, index);
		MenuManager menuManager = (MenuManager) getParent();
		menuManager.setRemoveAllWhenShown(true);

		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
				.getSelection();

		EObject semanticSelection = HandlerUtils.getTradesSelection(selection);
		if (semanticSelection == null) {
			return;
		}

		Optional<Session> optSession = Session.of(semanticSelection);
		if (optSession.isPresent()) {
			Session session = optSession.get();
			TradesActionProvider actionProvider = new TradesActionProvider(session);
			actionProvider.doSwitch(semanticSelection);

			for (IAction action : actionProvider.getGenericActions()) {
				MenuItem m = new MenuItem(menu, SWT.PUSH);
				m.setText(action.getText());

				m.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						Event event = new Event();
						event.display = e.display;
						action.runWithEvent(event);
					}
				});

			}
		}
	}

}
