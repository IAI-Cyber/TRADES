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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Event;

import dsm.oscal.design.Activator;
import dsm.oscal.model.OscalCatalog.Catalog;

/**
 * Action that deletes the selected catalog from the project (and it matching
 * file)
 * 
 * @author Arthur Daussy
 *
 */
public class ActionRemoveCatalog extends Action {

	private Catalog catalog;

	public ActionRemoveCatalog(Catalog catalog) {
		super("Remove catalog");
		this.catalog = catalog;
	}

	@Override
	public void runWithEvent(Event event) {

		if (!MessageDialog.openConfirm(event.display.getActiveShell(), "Delete",
				"You are about to delete an OSCAL catalog. This action can't be undone." + System.lineSeparator()
						+ " Do you want to continue?")) {
			return;
		}
		Session session = SessionManager.INSTANCE.getSession(catalog);
		if (session.isOpen()) {
			TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();
			new RecordingCommand(transactionalEditingDomain) {

				@Override
				protected void doExecute() {
					session.removeSemanticResource(catalog.eResource(), new NullProgressMonitor(), false);
					session.save(new NullProgressMonitor());
				}
			};

			URI uri = catalog.eResource().getURI();
			if (uri.isPlatformResource()) {

				IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
				if (iFile.exists()) {
					try {
						iFile.delete(true, true, new NullProgressMonitor());
					} catch (CoreException e) {
						Activator.logError("Error while deleting the file " + e.getMessage(), e);
					}
				}
			}
		}
	}

}
