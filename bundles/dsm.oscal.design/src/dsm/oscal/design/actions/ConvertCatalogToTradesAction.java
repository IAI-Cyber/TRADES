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

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.session.UserSession;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Event;

import dsm.TRADES.Analysis;
import dsm.TRADES.ExternalControl;
import dsm.TRADES.SemanticUtil;
import dsm.TRADES.TRADESFactory;
import dsm.oscal.design.Activator;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalCatalog.Control;
import dsm.oscal.model.OscalMetadata.Metadata;
import dsm.oscal.model.edit.LabelUtils;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

public class ConvertCatalogToTradesAction extends Action {

	private Catalog catalog;

	public ConvertCatalogToTradesAction(Catalog catalog) {
		super("Convert to TRADES definition");
		this.catalog = catalog;
	}

	@Override
	public void runWithEvent(Event event) {
		Session session = SessionManager.INSTANCE.getSession(catalog);
		if (session.isOpen()) {

			Metadata metadata = catalog.getMetadata();
			String catalogName = "NewCatalog";
			if (metadata != null) {
				catalogName = LabelUtils.toSimpleLabel(metadata.getTitle());
			}

			InputDialog dialog = new InputDialog(event.display.getActiveShell(), "Catalog name",
					"Set the name of the TRADEs catalog", catalogName, null);
			if (dialog.open() == IDialogConstants.OK_ID) {
				URI sessionURI = session.getSessionResource().getURI();
				String analysisName = dialog.getValue();
				
				URI uri = sessionURI.trimSegments(1).appendSegment(URI.encodeSegment(analysisName + ".trades", false));

				TransactionalEditingDomain transactionalEditionDomain = session.getTransactionalEditingDomain();

				RecordingCommand cmd = new RecordingCommand(transactionalEditionDomain) {

					@Override
					protected void doExecute() {
						ResourceSet rs = transactionalEditionDomain.getResourceSet();

						Resource resource = rs.getResource(uri, false);
						if (resource == null) {
							resource = rs.createResource(uri);
						}

						Analysis analysis = SemanticUtil.createInitialModel(analysisName);
						resource.getContents().add(analysis);
						analysis.getControlOwner().getExternals().addAll(collectControl(catalog,analysisName));

						try {
							resource.save(Collections.emptyMap());
						} catch (IOException e) {
							Activator.logError("Problem while saving trades catalog " + e.getMessage(), e);
						}
					}
				};

				transactionalEditionDomain.getCommandStack().execute(cmd);
				
				if (session.getSelectedViewpoints(true).stream()
						.noneMatch(v -> TRADES.design.Activator.VIEWPOINT_NAME.equals(v.getName()))) {
					List<String> existingViewpoints = session.getSelectedViewpoints(true).stream()
							.map(Viewpoint::getName).collect(toList());
					existingViewpoints.add(TRADES.design.Activator.VIEWPOINT_NAME);
					new UserSession(session).selectViewpoints(existingViewpoints);
				}
			}
		}
	}

	private List<ExternalControl> collectControl(Catalog c, String analysisName) {
		TreeIterator<EObject> ite = c.eAllContents();
		List<ExternalControl> result = new ArrayList<ExternalControl>();

		while (ite.hasNext()) {
			EObject next = ite.next();
			if (next instanceof Control) {
				Control control = (Control) next;

				ExternalControl extControl = TRADESFactory.eINSTANCE.createExternalControl();
				MarkupLine title = control.getTitle();
				if(title != null) {
					extControl.setName(title.toMarkdown());
				}
				extControl.setDescription(control.computeDocumentation(true));
				extControl.setId(control.getId());
				extControl.setSource(analysisName);
				UUID uuid = c.getUuid();
				if (uuid != null) {
					extControl.setSourceID(uuid.toString());
				} else {
					extControl.setSourceID(analysisName);
				}
				result.add(extControl);

			}
		}

		return result;
	}

}
