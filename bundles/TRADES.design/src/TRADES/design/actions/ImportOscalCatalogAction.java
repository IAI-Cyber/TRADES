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

import java.nio.file.Path;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;

import dsm.TRADES.Analysis;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.transform.OSCALTransformer;

public class ImportOscalCatalogAction extends Action {

	private final Analysis analysis;
	private Session session;

	public ImportOscalCatalogAction(Analysis analysis, Session session) {
		this.analysis = analysis;
		this.session = session;
		setText("Import OSCAL catalog");
	}

	@Override
	public void runWithEvent(Event event) {
		super.runWithEvent(event);
		FileDialog dialog = new FileDialog(event.display.getActiveShell());
		dialog.setFilterExtensions(new String[] { "*.xml" });
		String targetFile = dialog.open();
		if (targetFile != null) {

			/*
			 * TODO: Check that the catalog does not exist yet. If it does add a migration
			 * mechanism
			 */
			Catalog migratedCatalog = new OSCALTransformer().importCatalog(Path.of(targetFile));
			if (migratedCatalog != null) {
				RecordingCommand cmd = new RecordingCommand(session.getTransactionalEditingDomain()) {

					@Override
					protected void doExecute() {
						analysis.getCatalogs().add(migratedCatalog);

					}
				};
				session.getTransactionalEditingDomain().getCommandStack().execute(cmd);
			}
		}

	}

}
