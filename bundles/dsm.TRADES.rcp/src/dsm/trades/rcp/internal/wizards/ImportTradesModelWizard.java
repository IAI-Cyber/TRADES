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

package dsm.trades.rcp.internal.wizards;

import static java.util.stream.Collectors.toList;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.Analysis;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatsOwner;
import dsm.trades.rcp.Activator;

/**
 * Wizard use to import an OSCAL catalog
 * 
 * @author Arthur Daussy
 *
 */
public class ImportTradesModelWizard extends Wizard implements IImportWizard {

	private IStructuredSelection selection;
	private ProjectSelectionPage projectSelectionPage;
	private TradesLoadingPage fileSelectionPage;
	private EObjectSelectionPage<Threat> threatSelectionPage;
	private EObjectSelectionPage<dsm.TRADES.Control> controlSelectionPage;

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
		this.fileSelectionPage = new TradesLoadingPage("*.trades", this::loadModel);
		addPage(fileSelectionPage);

		this.threatSelectionPage = new EObjectSelectionPage<Threat>();
		addPage(threatSelectionPage);

		this.controlSelectionPage = new EObjectSelectionPage<dsm.TRADES.Control>();
		addPage(controlSelectionPage);
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
						});
					} catch (InvocationTargetException | InterruptedException e) {
						Activator.logError("Error occured while loading the session : " + e.getMessage(), e);
					}

					return importTradesCatalog(repUri, session[0]);

				}
			}
		}

		return false;

	}

	boolean loadModel(Path p) {

		try {
			getContainer().run(false, false, monitor -> {
				ResourceSet rs = new ResourceSetImpl();
				Resource tradesResource = rs
						.getResource(URI.createFileURI(fileSelectionPage.getPath().toUri().getPath()), true);
				if (tradesResource == null || tradesResource.getContents().isEmpty()
						|| !(tradesResource.getContents().get(0) instanceof Analysis)) {
					fileSelectionPage.setMessage("Invalid model");
					throw new RuntimeException("Invalid model");
				}

				Analysis analysis = (Analysis) tradesResource.getContents().get(0);

				List<Threat> threats = new ArrayList<>();
				ThreatsOwner threatOwner = analysis.getThreatOwner();
				if (threatOwner != null) {
					threats.addAll(threatOwner.getInternals());
					threats.addAll(analysis.getThreatOwner().getExternals());
				}
				threatSelectionPage.setInput(threats);

				List<dsm.TRADES.Control> controls = new ArrayList<>();
				controls.addAll(analysis.getAllControls());

				TreeIterator<EObject> ite = analysis.eAllContents();
				while (ite.hasNext()) {
					EObject next = ite.next();
					if (next instanceof AbstractControlOwner) {
						AbstractControlOwner aControlOwner = (AbstractControlOwner) next;
						controls.addAll(aControlOwner.getAllControls());
					}
				}

				controlSelectionPage.setInput(controls);
			});
		} catch (InvocationTargetException | InterruptedException e) {
			Activator.logError("Error while laoding model " + e.getMessage(), e);
			return false;
		}

		return true;
	}

	private boolean importTradesCatalog(URI repUri, Session session) {

		try {
			getContainer().run(false, false, monitor -> {

				// Copy threat and control into a new resources
			});
		} catch (InvocationTargetException | InterruptedException e) {
			Activator.logError("Error while importing model " + e.getMessage(), e);
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canFinish() {
		return projectSelectionPage.getSelectedProject() != null && fileSelectionPage.getPath() != null
				&& fileSelectionPage.getPath().toFile().exists()
				&& (!threatSelectionPage.getSelection().isEmpty() || !controlSelectionPage.getSelection().isEmpty());
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
