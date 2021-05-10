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
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import dsm.TRADES.AbstractControlOwner;
import dsm.TRADES.AbstractThreatOwner;
import dsm.TRADES.Analysis;
import dsm.TRADES.Catalog;
import dsm.TRADES.Control;
import dsm.TRADES.ControlOwner;
import dsm.TRADES.NamedElement;
import dsm.TRADES.SemanticUtil;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatsOwner;
import dsm.TRADES.util.EcoreUtils;
import dsm.trades.rcp.Activator;
import dsm.trades.rcp.utils.ControlCopier;
import dsm.trades.rcp.utils.ThreatCopier;

/**
 * Wizard use to import an OSCAL catalog
 * 
 * @author Arthur Daussy
 *
 */
public class ImportTradesModelWizard extends Wizard implements IImportWizard {

	private static final String CATALOGS_FOLDER = "Catalogs";
	private IStructuredSelection selection;
	private ProjectSelectionPage projectSelectionPage;
	private TradesLoadingPage fileSelectionPage;
	private EObjectSelectionPage<Threat> threatSelectionPage;
	private EObjectSelectionPage<dsm.TRADES.Control> controlSelectionPage;

	private List<Threat> selectedThreats = Collections.emptyList();
	private List<Control> selectedControl = Collections.emptyList();
	private String importedAnalysisName;

	public static void createCatalogFolder(IProject selectedProject0, IProgressMonitor monitor) {
		IFolder catalogFolder = selectedProject0.getFolder(CATALOGS_FOLDER);
		if (!catalogFolder.exists()) {
			try {
				catalogFolder.create(false, true, monitor);
			} catch (CoreException e) {
				Activator.logError("Unable to create 'catalogs' fodler " + e.getMessage(), e);
			}
		}
	}

	public static URI getCatalogFolderURI(URI sessionURI) {
		return sessionURI.trimSegments(1).appendSegment(CATALOGS_FOLDER);
	}

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

		this.threatSelectionPage = new EObjectSelectionPage<Threat>(this::setSelectedThreats,
				"Select the threats to import (only threats with unique id can be imported)");
		addPage(threatSelectionPage);

		this.controlSelectionPage = new EObjectSelectionPage<dsm.TRADES.Control>(this::setSelectedControl,
				"Select the controls to import (only controls with unique id can be imported)");
		addPage(controlSelectionPage);
	}

	private void setSelectedControl(List<Control> selectedControl) {
		this.selectedControl = selectedControl;
	}

	private void setSelectedThreats(List<Threat> selectedThreats) {
		this.selectedThreats = selectedThreats;
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
							createCatalogFolder(selectedProject0, monitor);
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
				if (tradesResource == null || tradesResource.getContents().isEmpty() || isCatalog(tradesResource)) {
					fileSelectionPage.setMessage("Invalid model");
					throw new RuntimeException("Invalid model");
				}

				EObject root = tradesResource.getContents().get(0);
				if (root instanceof NamedElement) {
					importedAnalysisName = ((NamedElement) root).getName();
				} else {
					importedAnalysisName = "Catalog";
				}

				Set<String> threatIds = new HashSet<>();
				List<Threat> threats = new ArrayList<>();
				if (root instanceof AbstractThreatOwner) {
					AbstractThreatOwner aThreatOwner = (AbstractThreatOwner) root;
					ThreatsOwner threatOwner = aThreatOwner.getThreatOwner();
					if (threatOwner != null) {
						Stream.concat(threatOwner.getInternals().stream(), threatOwner.getExternals().stream())
								.filter(t -> t.getId() != null && !t.getId().isBlank()).forEach(t -> {
									String id = t.getId();
									if (!threatIds.contains(id)) {
										threatIds.add(id);
										threats.add(t);
									}
								});
					}
					threatSelectionPage.setInput(threats);
				} else {
					threatSelectionPage.setInput(Collections.emptyList());
				}
				List<dsm.TRADES.Control> controls = new ArrayList<>();
				Set<String> controlIds = new HashSet<>();
				EcoreUtils.eAllContentSteamWithSelf(root).filter(e -> e instanceof AbstractControlOwner)
						.forEach(acontrolOwner -> {
							((AbstractControlOwner) acontrolOwner).getAllControls().stream()
									.filter(c -> c.getId() != null && !c.getId().isBlank()).forEach(c -> {
										if (!controlIds.contains(c.getId())) {
											controlIds.add(c.getId());
											controls.add(c);
						}
									});
						});
				controlSelectionPage.setInput(controls);

			});
		} catch (InvocationTargetException | InterruptedException e) {
			Activator.logError("Error while laoding model " + e.getMessage(), e);
			return false;
		}

		return true;
	}

	public boolean isCatalog(Resource tradesResource) {
		return !(tradesResource.getContents().get(0) instanceof Analysis)
				&& !(tradesResource.getContents().get(0) instanceof Catalog);
	}

	private boolean importTradesCatalog(URI repUri, Session session) {
		URI tradesLibURI = getCatalogFolderURI(repUri)
				.appendSegment(URI.encodeSegment(importedAnalysisName, false) + ".trades");
		TransactionalEditingDomain transactionalEditingDomain = session.getTransactionalEditingDomain();
		ResourceSet resourceSet = transactionalEditingDomain.getResourceSet();
		Resource existingResource = resourceSet.getResource(tradesLibURI, false);
		if (existingResource != null) {
			controlSelectionPage.setErrorMessage("This import already exist");
			return false;
		}
		controlSelectionPage.setErrorMessage(null);
		try {
			getContainer().run(false, false, monitor -> {
				TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();
				RecordingCommand cmd = new RecordingCommand(editingDomain) {

					@Override
					protected void doExecute() {

						// Create a analysis with the same name
						Catalog catalog = SemanticUtil.createInitialCatalog(importedAnalysisName);

						ThreatsOwner threatOwner = catalog.getThreatOwner();

						ControlOwner controlOwner = catalog.getControlOwner();

						// For each selected threat create an external threat

						ThreatCopier threatImporter = new ThreatCopier();

						for (Threat t : selectedThreats) {
							threatOwner.getExternals().add(threatImporter.copy(t, importedAnalysisName));
						}

						// For each selected control create an external control + a threat mitigation
						ControlCopier controlImporter = new ControlCopier(threatImporter.getOldToNewThreats());

						for (Control c : selectedControl) {
							controlOwner.getExternals().add(controlImporter.copy(c, importedAnalysisName));
						}

						Resource newResource = resourceSet.createResource(tradesLibURI);

						newResource.getContents().add(catalog);
						session.addSemanticResource(tradesLibURI, new NullProgressMonitor());

						session.save(new NullProgressMonitor());
					}
				};

				editingDomain.getCommandStack().execute(cmd);
			});
		} catch (InvocationTargetException | InterruptedException e) {
			Activator.logError("Error while importing model " + e.getMessage(), e);
			return false;
		}
		return true;
	}

	@Override
	public boolean canFinish() {
		return projectSelectionPage.getSelectedProject() != null && fileSelectionPage.getPath() != null
				&& importedAnalysisName != null && !importedAnalysisName.isBlank()
				&& fileSelectionPage.getPath().toFile().exists()
				&& (!selectedThreats.isEmpty() || !selectedControl.isEmpty());
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