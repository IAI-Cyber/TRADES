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

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import dsm.oscal.design.EmbeddedCatalogRegistry;

/**
 * Page used to select an OSCAL catalog to import
 * 
 * @author Arthur Daussy
 *
 */
public class CatalogSelectionPage extends WizardPage {

	private boolean embedded = true;
	private Group embeddedGroup;
	private String catalog;
	private Group browseGroup;
	private Text fileSelectionLabel;

	protected CatalogSelectionPage() {
		super("Catalog selection page");
		setMessage("Select a import type and choose a catalog.");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.None);
		composite.setLayout(new GridLayout(1, true));

		// Create a group to contain 2 radio (Male & Female)
		createButtonGroup(composite);

		// Embedded lib view
		createEmbeddedCatalogViewer(composite);

		// Browse button
		createBrowseGroup(composite);

		setControl(composite);

	}

	public void createBrowseGroup(Composite parent) {
		browseGroup = new Group(parent, SWT.NONE);
		browseGroup.setText("External catalog selection :");
		browseGroup.setLayout(new GridLayout(2, false));
		browseGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		this.fileSelectionLabel = new Text(browseGroup, SWT.READ_ONLY);
		fileSelectionLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Button browseButton = new Button(browseGroup, SWT.PUSH);
		browseButton.setLayoutData(new GridData(GridData.END));
		browseButton.setText("Browse");
		browseButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell());
				dialog.setFilterExtensions(new String[] { "*.xml" });
				String targetFile = dialog.open();
				if (targetFile != null) {
					catalog = targetFile;
					fileSelectionLabel.setText(catalog);
				}
				getContainer().updateButtons();
			}
		});
		enableGroup(browseGroup, false);
	}

	public void createEmbeddedCatalogViewer(Composite parent) {
		this.embeddedGroup = new Group(parent, SWT.NONE);
		embeddedGroup.setText("Embedded catalog selection : ");
		embeddedGroup.setLayout(new FillLayout());
		embeddedGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		ListViewer emCatalogView = new ListViewer(embeddedGroup);
		emCatalogView.setContentProvider(ArrayContentProvider.getInstance());
		emCatalogView.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return (String) element;
			}
		});
		emCatalogView.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection structuredSelection = emCatalogView.getStructuredSelection();
				if (!structuredSelection.isEmpty()) {
					catalog = (String) structuredSelection.getFirstElement();
				} else {
					catalog = null;
				}
				getContainer().updateButtons();

			}
		});
		emCatalogView.setInput(EmbeddedCatalogRegistry.getInstance().getAvailableLibraries());
	}

	public void createButtonGroup(Composite parent) {
		Group typeGroup = new Group(parent, SWT.NONE);
		typeGroup.setText("Catalog type :");
		typeGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
		typeGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label label = new Label(typeGroup, SWT.NONE);
		label.setText("Catalog source : ");

		Button embeddedButton = new Button(typeGroup, SWT.RADIO);
		embeddedButton.setText("Embedded");
		embeddedButton.setSelection(true);
		embeddedButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				embedded = true;
				enableGroup(embeddedGroup, true);
				enableGroup(browseGroup, false);
				catalog = null;
				fileSelectionLabel.setText("");
				getContainer().updateButtons();
			}

		});

		Button externalButton = new Button(typeGroup, SWT.RADIO);
		externalButton.setText("External");
		externalButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				embedded = false;
				enableGroup(embeddedGroup, false);
				enableGroup(browseGroup, true);
				catalog = null;
				fileSelectionLabel.setText("");
				getContainer().updateButtons();
			}
		});
	}

	private void enableGroup(Composite c, boolean value) {
		if (c != null && !c.isDisposed()) {
			for (Control control : c.getChildren()) {
				control.setEnabled(value);
			}
			c.setEnabled(value);
		}
	}

	public boolean isEmbedded() {
		return embedded;
	}

	public String getCatalog() {
		return catalog;
	}

}
