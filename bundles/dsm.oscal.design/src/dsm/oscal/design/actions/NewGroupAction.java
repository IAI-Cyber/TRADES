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

package dsm.oscal.design.actions;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import dsm.oscal.design.Activator;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalCatalog.Group;
import dsm.oscal.model.OscalCatalog.OscalCatalogFactory;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

/**
 * Action that create a new {@link Group} inside a {@link Catalog} or a
 * {@link Group}
 * 
 * @author Arthur Daussy
 *
 */
public class NewGroupAction extends Action {

	private final Catalog catalog;
	private final Group parentGroup;
	private Session session;

	public NewGroupAction(Catalog catalog) {
		super("New Group", Activator.getDefault().getImageDescriptor("icons/folderType_filter.png"));
		this.session = Session.of(catalog).get();
		this.catalog = catalog;
		this.parentGroup = null;
	}

	public NewGroupAction(Group group) {
		super("New Group", Activator.getDefault().getImageDescriptor("icons/folderType_filter.png"));
		this.session = Session.of(group).get();
		this.parentGroup = group;
		this.catalog = null;
	}

	@Override
	public void runWithEvent(Event event) {
		TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();
		RecordingCommand cmd = new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				Group group = OscalCatalogFactory.eINSTANCE.createGroup();

				InputDialog dialog = new InputDialog(event.display.getActiveShell(), "Group name",
						"Enter a name for the new group", "New group", e -> null);

				if (dialog.open() == IDialogConstants.OK_ID) {
					String groupName = dialog.getValue();
					if (groupName != null) {

						group.setTitle(MarkupLine.fromMarkdown(groupName));

						if (catalog != null) {
							catalog.getGroups().add(group);
						} else {
							parentGroup.getGroups().add(group);
						}
					}
				}

			}
		};
		editingDomain.getCommandStack().execute(cmd);
	}

}
