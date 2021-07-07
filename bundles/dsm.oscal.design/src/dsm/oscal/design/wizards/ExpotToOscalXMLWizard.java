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
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

import dsm.oscal.design.Activator;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.transform.OSCALTransformer;
import gov.nist.secauto.metaschema.binding.io.Format;

public class ExpotToOscalXMLWizard extends Wizard implements IExportWizard {

	private ModelCatalogExportPage catalogPage;

	private Catalog initialSelection;

	public ExpotToOscalXMLWizard() {
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		this.catalogPage = new ModelCatalogExportPage(getModelingProject());
		if (initialSelection != null) {
			catalogPage.setInitialSelection(initialSelection);
		}
		addPage(catalogPage);
		super.addPages();
	}

	private List<ModelingProject> getModelingProject() {
		return Stream.of(ResourcesPlugin.getWorkspace().getRoot().getProjects())
				.map(p -> ModelingProject.asModelingProject(p)).filter(opt -> opt.some())//
				.map(opt -> opt.get())//
				.collect(toList());
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		if (selection != null) {
			Object first = selection.getFirstElement();
			if (first instanceof IFile) {
				URI fileURI = URI.createPlatformResourceURI(((IFile) first).getFullPath().toString(), true);
				for (ModelingProject p : getModelingProject()) {
					Session session = p.getSession();
					if (session != null) {
						Optional<Catalog> selectedCatalog = session.getSemanticResources().stream()
								.filter(r -> r.getURI().equals(fileURI) && !r.getContents().isEmpty()
										&& r.getContents().get(0) instanceof Catalog)
								.map(r -> (Catalog) r.getContents().get(0)).findFirst();
						if (selectedCatalog.isPresent()) {
							initialSelection = selectedCatalog.get();
						}
					}
				}
			}
		}
	}

	@Override
	public boolean performFinish() {
		Catalog catalog = catalogPage.getSelectedCatalog();
		Path targetFile = catalogPage.getTargetFile();
		Format selectedFormat = catalogPage.getSelectedFormat();
		if (catalog != null && targetFile != null && selectedFormat != null) {
			if (targetFile.toFile().exists()) {
				if (!MessageDialog.openConfirm(getShell(), "Override",
						"The file '" + targetFile + "' already exist. Do you want to override it?")) {
					return false;
				}
			}
			try {
				getContainer().run(true, false, monitor -> {
					monitor.beginTask("Exporting catalog", IProgressMonitor.UNKNOWN);
					new OSCALTransformer().exportCatalog(catalog, targetFile, selectedFormat);
					monitor.done();
				});
				return true;
			} catch (InvocationTargetException e) {
				Throwable cause = e.getCause();
				Activator.logError(cause.getMessage(), cause);
			} catch (InterruptedException e) {

			}
		}
		return false;
	}

}
