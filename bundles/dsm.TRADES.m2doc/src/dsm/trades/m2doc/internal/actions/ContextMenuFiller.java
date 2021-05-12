/**
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
 */

package dsm.trades.m2doc.internal.actions;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuListener2;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;

import dsm.trades.m2doc.IM2DocTemplate;
import dsm.trades.m2doc.IM2DocTemplateRegistry;
import dsm.trades.m2doc.TradesM2docActivator;

/**
 * Provide some trades action
 * 
 * @author Arthur Daussy
 *
 */
public class ContextMenuFiller implements IMenuListener, IMenuListener2 {

	private static final String REPORT_SUB_MENU_ID = "dsm.trades.m2doc.report.menu";
	private ISelection selection;

	@Override
	public void menuAboutToHide(IMenuManager manager) {
		selection = null;
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {

		EObject item = getFirstSelectElement(EObject.class);

		if (item != null) {

			Optional<Session> optSession = Session.of(item);
			if (optSession.isPresent()) {

				createReportSubMenu(manager, item);
			}

		}
	}

	private void createReportSubMenu(IMenuManager manager, EObject item) {
		MenuManager subMenu = new MenuManager("Reports",
				TradesM2docActivator.getDefault().getImageDescriptor("icons/m2doc.gif"), REPORT_SUB_MENU_ID);
		subMenu.setRemoveAllWhenShown(true);
		subMenu.addMenuListener(new IMenuListener() {

			@Override
			public void menuAboutToShow(IMenuManager manager) {
				IM2DocTemplateRegistry templateRegistry = TradesM2docActivator.getDefault().getTemplateRegistry();
				EClass type = item.eClass();
				List<IM2DocTemplate> availableTemplates = templateRegistry.getTemplates().stream()
						.filter(t -> t.getMainType().isSuperTypeOf(type))
						.sorted(Comparator.comparing(IM2DocTemplate::getTemplateName)).collect(toList());

				for (final IM2DocTemplate template : availableTemplates) {
					manager.add(new GenerateReportAction(item, template));
				}

				subMenu.add(new NewTemplateAction(item));

			}
		});
		subMenu.add(new Separator("ReportGroup"));

		manager.add(subMenu);
	}

	public void fillContextMenu(IMenuManager menu, ISelection selection) {
		this.selection = selection;
		menu.addMenuListener(this);

	}

	private <T> T getFirstSelectElement(Class<T> type) {
		if (selection instanceof IStructuredSelection) {
			Object first = ((IStructuredSelection) selection).getFirstElement();
			if (type.isInstance(first)) {
				return type.cast(first);
			}
		}
		return null;
	}

	public void dispose() {
		selection = null;
	}

}
