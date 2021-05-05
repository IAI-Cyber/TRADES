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

package dsm.oscal.design.wizards;

import static java.util.stream.Collectors.toList;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.session.UserSession;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import dsm.oscal.design.Activator;
import dsm.oscal.design.EmbeddedCatalogRegistry;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.transform.OSCALTransformer;
import dsm.trades.rcp.internal.wizards.ImportTradesModelWizard;
import dsm.trades.rcp.internal.wizards.ProjectSelectionPage;

/**
 * Wizard use to import an OSCAL catalog
 * 
 * @author Arthur Daussy
 *
 */
public class ImportEmbeddedCatalogWizard extends Wizard implements IImportWizard {

	private IStructuredSelection selection;
	private ProjectSelectionPage projectSelectionPage;
	private CatalogSelectionPage catalogSelectionPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		super.addPages();
		List<IProject> modelingProjects = Stream.of(ResourcesPlugin.getWorkspace().getRoot().getProjects())
				.filter(p -> ModelingProject.asModelingProject(p).some()).collect(toList());
		this.projectSelectionPage = new ProjectSelectionPage(modelingProjects, getSelectedProject(selection));
		addPage(projectSelectionPage);
		this.catalogSelectionPage = new CatalogSelectionPage();
		addPage(catalogSelectionPage);
	}

	@Override
	public boolean performFinish() {
		IProject selectedProject0 = projectSelectionPage.getSelectedProject();
		if (selectedProject0 != null) {
			ModelingProject selectedProject = ModelingProject.asModelingProject(selectedProject0).get();
			if (selectedProject != null) {
				Option<URI> mainRepURI = selectedProject.getMainRepresentationsFileURI(new NullProgressMonitor());
				if (mainRepURI.some()) {
					URI repUri = mainRepURI.get();

					Session[] session = new Session[1];
					try {
						getContainer().run(false, false, monitor -> {

							session[0] = SessionManager.INSTANCE.getSession(repUri, monitor);
							if (!session[0].isOpen()) {
								session[0].open(monitor);
							}

							ImportTradesModelWizard.createCatalogFolder(selectedProject0, monitor);
						});
					} catch (InvocationTargetException | InterruptedException e) {
						Activator.logError("Error occured while loading the session : " + e.getMessage(), e);
					}

					return importCatalog(repUri, session[0]);

				}
			}
		}

		return false;

	}

	private boolean importCatalog(URI repUri, Session session) {
		String catalog = catalogSelectionPage.getCatalog();
		Path catalogPath = null;
		String oscalLibName = null;
		if (catalog != null) {
			if (catalogSelectionPage.isEmbedded()) {
				try {
					InputStream stream = EmbeddedCatalogRegistry.getInstance().getCatalog(catalog);
					if (stream != null) {
						File tmpFile = File.createTempFile(catalog, ".xml");
						tmpFile.deleteOnExit();
						byte[] buffer = new byte[stream.available()];
						stream.read(buffer);
						catalogPath = tmpFile.toPath();
						oscalLibName = catalog;
						Files.write(catalogPath, buffer);
					}

				} catch (IOException e) {
					Activator.logError("Unable to read embedded catalog " + e.getMessage(), e);
				}
			} else {
				catalogPath = Path.of(catalog);
				String fileName = catalogPath.toFile().getName();
				oscalLibName = fileName.replaceAll("\\.xml", "");
			}
		}
		if (catalogPath != null) {

			return importOscalCatalog(repUri, session, oscalLibName, catalogPath);
		}
		return false;
	}

	private boolean importOscalCatalog(URI repUri, Session session, String oscalLibName, Path libPath) {

		URI oscalLibURI = ImportTradesModelWizard.getCatalogFolderURI(repUri)
				.appendSegment(URI.encodeSegment(oscalLibName, false) + ".oscal");
		TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();
		ResourceSet resourceSet = transactionalEditingDomain.getResourceSet();
		Resource existingResource = resourceSet.getResource(oscalLibURI, false);
		if (existingResource != null) {
			catalogSelectionPage.setErrorMessage("This catalog already exist");
			return false;
		}
		catalogSelectionPage.setErrorMessage(null);
		try {
			getContainer().run(false, false, monitor -> {

				monitor.beginTask("Importing " + oscalLibName, 3);

				RecordingCommand cmd = new RecordingCommand(transactionalEditingDomain, "Import Oscal catalog") {

					@Override
					protected void doExecute() {
						Resource newResource = resourceSet.createResource(oscalLibURI);
						monitor.setTaskName("Converting to EMF Model");
						Catalog migratedCatalog = new OSCALTransformer().importCatalog(libPath);
						newResource.getContents().add(migratedCatalog);
						session.addSemanticResource(oscalLibURI, new NullProgressMonitor());
						monitor.worked(1);
						try {
							monitor.setTaskName("Saving the resource");
							newResource.save(Collections.emptyMap());
							monitor.worked(1);
						} catch (IOException e) {
							Activator.logError("Problem while saving catalog " + e.getMessage(), e);
						}

					}
				};
				transactionalEditingDomain.getCommandStack().execute(cmd);

				if (session.getSelectedViewpoints(true).stream()
						.noneMatch(v -> Activator.OSCAL_VIEWPOINT_NAME.equals(v.getName()))) {
					monitor.setTaskName("Activating missing viewpoint");
					List<String> existingViewpoints = session.getSelectedViewpoints(true).stream()
							.map(Viewpoint::getName).collect(toList());
					existingViewpoints.add(Activator.OSCAL_VIEWPOINT_NAME);
					new UserSession(session).selectViewpoints(existingViewpoints);
					monitor.worked(1);
				}
				monitor.done();
			});
			return true;
		} catch (InvocationTargetException | InterruptedException e) {
			Activator.logError("Problem while importing catalog" + e.getMessage(), e);
		}
		return false;
	}

	@Override
	public boolean canFinish() {
		return projectSelectionPage.getSelectedProject() != null && catalogSelectionPage.getCatalog() != null;
	}

	private IProject getSelectedProject(IStructuredSelection selection) {
		for (Object o : selection.toArray()) {
			if (o instanceof IProject) {
				Option<ModelingProject> opt = ModelingProject.asModelingProject((IProject) o);
				if (opt.some()) {
					return (IProject) o;
				}

			}
		}

		return null;
	}

}
