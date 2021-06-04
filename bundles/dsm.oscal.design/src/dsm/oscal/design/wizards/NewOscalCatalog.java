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

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import TRADES.design.DiagramService;
import dsm.oscal.design.Activator;
import dsm.oscal.design.actions.OSCALUtils;
import dsm.oscal.model.SemanticUtil;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.trades.rcp.internal.wizards.ProjectSelectionPage;
import dsm.trades.rcp.utils.CatalogUtils;

public class NewOscalCatalog extends Wizard implements INewWizard {

	private ProjectSelectionPage projectSelectionPage;
	private IStructuredSelection selection;
	private CatalogInfoPage infoPage;

	public NewOscalCatalog() {
		setNeedsProgressMonitor(true);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;

	}

	@Override
	public void addPages() {
		super.addPages();
		List<IProject> modelingProjects = Stream.of(ResourcesPlugin.getWorkspace().getRoot().getProjects())
				.filter(p -> ModelingProject.asModelingProject(p).some()).collect(toList());
		this.projectSelectionPage = new ProjectSelectionPage(modelingProjects,
				OSCALUtils.getSelectedProject(selection));
		addPage(projectSelectionPage);

		this.infoPage = new CatalogInfoPage();
		addPage(infoPage);
	}

	@Override
	public boolean performFinish() {

		String fileName = infoPage.getCatalogFileName();
		String catalogTitle = infoPage.getCatalogTitle();
		if (fileName != null && !fileName.isBlank() && catalogTitle != null && !catalogTitle.isBlank()) {

			ModelingProject modelingProject = ModelingProject
					.asModelingProject(projectSelectionPage.getSelectedProject()).get();
			Session session = modelingProject.getSession();

			Catalog catalog = SemanticUtil.createCatalog(fileName);

			try {
				getContainer().run(false, false, progress -> {

					progress.beginTask("Create new OSCAL catalog", IProgressMonitor.UNKNOWN);

					CatalogUtils.createCatalogFolder(modelingProject.getProject(), progress);
					URI catalogFolderURI = CatalogUtils.getCatalogFolderURI(session.getSessionResource().getURI());

					final URI catalogURI;
					if (!fileName.endsWith(".oscal")) {
						catalogURI = catalogFolderURI.appendSegment(URI.encodeSegment(fileName + ".oscal", false));
					} else {
						catalogURI = catalogFolderURI.appendSegment(URI.encodeSegment(fileName, false));
					}

					TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();
					ResourceSet resourceSet = transactionalEditingDomain.getResourceSet();
					Resource existinURI = resourceSet.getResource(catalogURI, false);
					if (existinURI != null) {
						infoPage.setErrorMessage("A OSCAL file with the same name already exist");
						return;
					} else {
						infoPage.setErrorMessage(null);
					}
					RecordingCommand cmd = new RecordingCommand(transactionalEditingDomain) {

						@Override
						protected void doExecute() {
							Resource catalogResource = resourceSet.createResource(catalogURI);
							catalogResource.getContents().add(catalog);
							session.addSemanticResource(catalogURI, new NullProgressMonitor());

						}
					};
					transactionalEditingDomain.getCommandStack().execute(cmd);
					OSCALUtils.activateOscalViewpointIfMissing(session, progress);
					session.save(progress);
					if (catalog != null) {
						DiagramService.revealInModelExplorer(catalog);
					}
				});
				return true;
			} catch (InterruptedException | InvocationTargetException e) {
				Activator.logError("Problem while creating new catalog", e);
			}
		}
		return false;
	}

}
