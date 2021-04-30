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

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.model.AdaptableList;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class ProjectSelectionPage extends WizardPage {

	private TableViewer projectViewer;
	private List<IProject> projects;
	private IProject initialSelection;
	private IProject selectedProject;

	protected ProjectSelectionPage(List<IProject> projects, IProject initialSelection) {
		super("Trades project selection page");
		setMessage("Select a TRADES project");
		this.projects = projects;
		this.initialSelection = initialSelection;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.None);
		composite.setLayout(new GridLayout(1, true));
		projectViewer = new TableViewer(composite, SWT.SINGLE | SWT.BORDER);
		projectViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		projectViewer.setContentProvider(new BaseWorkbenchContentProvider());
		projectViewer.setLabelProvider(new WorkbenchLabelProvider());
		projectViewer.setInput(new AdaptableList(projects));
		if (initialSelection != null) {
			selectedProject = initialSelection;
			projectViewer.setSelection(new StructuredSelection(initialSelection));
		}
		projectViewer.addSelectionChangedListener(event -> {
			selectedProject = (IProject) projectViewer.getStructuredSelection().getFirstElement();
			getContainer().updateButtons();
		});
		setControl(composite);

	}

	@Override
	public boolean canFlipToNextPage() {
		return selectedProject != null;
	}

	public IProject getSelectedProject() {
		return selectedProject;
	}

}
