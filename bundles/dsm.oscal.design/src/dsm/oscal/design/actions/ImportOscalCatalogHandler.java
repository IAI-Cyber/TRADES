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
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.session.UserSession;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;

import dsm.oscal.design.Activator;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.transform.OSCALTransformer;

public class ImportOscalCatalogHandler extends Action {

	public ImportOscalCatalogHandler() {
		super("Import Oscal catalog");
	}

	@Override
	public void runWithEvent(Event event) {
		ModelingProject selectedProject = getSelectedProject();
		if (selectedProject != null) {
			Option<URI> mainRepURI = selectedProject.getMainRepresentationsFileURI(new NullProgressMonitor());
			if (mainRepURI.some()) {
				URI repUri = mainRepURI.get();

				Session session = SessionManager.INSTANCE.getExistingSession(repUri);
				if (session.isOpen()) {

					FileDialog dialog = new FileDialog(event.display.getActiveShell());
					dialog.setFilterExtensions(new String[] { "*.xml" });
					String targetFile = dialog.open();
					if (targetFile != null) {
						String fileName = Path.of(targetFile).toFile().getName();
						String oscalLibName = fileName.replaceAll("\\.xml", ".oscal");
						URI oscalLibURI = repUri.trimSegments(1).appendSegment(oscalLibName);
						TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();
						ResourceSet resourceSet = transactionalEditingDomain.getResourceSet();
						Resource existingResource = resourceSet.getResource(oscalLibURI, false);
						if (existingResource == null) {
							RecordingCommand cmd = new RecordingCommand(transactionalEditingDomain,
									"Import Oscal catalog") {

								@Override
								protected void doExecute() {
									Resource newResource = resourceSet.createResource(oscalLibURI);
									Catalog migratedCatalog = new OSCALTransformer().importCatalog(Path.of(targetFile));
									newResource.getContents().add(migratedCatalog);
									session.addSemanticResource(oscalLibURI, new NullProgressMonitor());
									try {
										newResource.save(Collections.emptyMap());
									} catch (IOException e) {
										Activator.logError("Problem while saving catalog " + e.getMessage(), e);
									}

								}
							};
							transactionalEditingDomain.getCommandStack().execute(cmd);
							if (session.getSelectedViewpoints(true).stream()
									.noneMatch(v -> Activator.OSCAL_VIEWPOINT_NAME.equals(v.getName()))) {
								List<String> existingViewpoints = session.getSelectedViewpoints(true).stream()
										.map(Viewpoint::getName).collect(toList());
								existingViewpoints.add(Activator.OSCAL_VIEWPOINT_NAME);
								new UserSession(session).selectViewpoints(existingViewpoints);
							}
						} else {
							// TODO suggest an update??
							Activator.logError("The library is already imported");
						}
					}
				} else {
					Activator.logError("The session is not opened");
				}
			}
		}

	}

	private ModelingProject getSelectedProject() {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
				.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection strcutSelection = (IStructuredSelection) selection;
			for (Object o : strcutSelection.toArray()) {
				if (o instanceof IProject) {
					Option<ModelingProject> opt = ModelingProject.asModelingProject((IProject) o);
					if (opt.some()) {
						return opt.get();
					}

				}
			}
		}

		return null;
	}

}
