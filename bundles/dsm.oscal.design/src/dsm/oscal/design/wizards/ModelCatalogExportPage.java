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

import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.widgets.WidgetFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import dsm.oscal.design.Activator;
import dsm.oscal.model.OscalCatalog.Catalog;
import gov.nist.secauto.metaschema.binding.io.Format;

public class ModelCatalogExportPage extends WizardPage {

	private Catalog selectedCatalog;

	private Path targetFile;

	private List<ModelingProject> tradesProject;

	private ComposedAdapterFactory adapterFactory;

	private AdapterFactoryLabelProvider emfLabelProvider;

	private LabelProvider labelProvider;

	private Format selectedFormat;

	private Text fileSelectionLabel;

	private TreeViewer viewer;

	private static final ITreeContentProvider CONTENT_PROVIDER = new ITreeContentProvider() {

		@Override
		public boolean hasChildren(Object element) {
			return element instanceof ModelingProject;
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return ((List<?>) inputElement).toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof ModelingProject) {
				Session session = ((ModelingProject) parentElement).getSession();
				if (session != null) {
					return session.getSemanticResources().stream().map(r -> {
						if (!r.getContents().isEmpty()) {
							EObject root = r.getContents().get(0);
							if (root instanceof Catalog) {
								return (Catalog) root;

							}
						}
						return null;
					}).filter(e -> e != null).toArray();
				}
			}
			return new Object[] {};
		}
	};


	public ModelCatalogExportPage(List<ModelingProject> tradesProject) {
		super("Export configuration");
		this.tradesProject = tradesProject;
		setMessage("Select the catalog to export and a target file");
		this.adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		this.emfLabelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		this.labelProvider = new LabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof ModelingProject) {
					return ((ModelingProject) element).getProject().getName();
				} else {
					return emfLabelProvider.getText(element);
				}
			}

			@Override
			public Image getImage(Object element) {
				if (element instanceof ModelingProject) {
					return Activator.getDefault().getImage("icons/ModelingProject.gif");
				} else {
					return emfLabelProvider.getImage(element);
				}
			}

		};
	}

	@Override
	public void dispose() {
		super.dispose();
		emfLabelProvider.dispose();
		adapterFactory.dispose();
	}

	@Override
	public void createControl(Composite parent) {
		Composite cc = WidgetFactory.composite(SWT.NONE).layout(new GridLayout(2, false))
				.layoutData(new GridData(GridData.FILL_BOTH)).create(parent);

		this.viewer = new TreeViewer(cc, SWT.SINGLE);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.horizontalSpan = 2;
		viewer.getControl().setLayoutData(layoutData);
		viewer.setContentProvider(CONTENT_PROVIDER);
		viewer.setLabelProvider(labelProvider);
		viewer.setInput(tradesProject);
		viewer.addSelectionChangedListener(e -> setSelection(e.getStructuredSelection()));
		viewer.expandAll();
		if (selectedCatalog != null) {
			viewer.setSelection(new StructuredSelection(selectedCatalog), true);
		}

		createFormatGroup(cc);
		// Browse button
		createBrowseGroup(cc);

		setControl(cc);

	}

	private void createFormatGroup(Composite cc) {
		Group formatGroup = new Group(cc, SWT.NONE);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.horizontalSpan = 2;
		formatGroup.setText("Export format");
		formatGroup.setLayoutData(layoutData);
		formatGroup.setLayout(new RowLayout(SWT.HORIZONTAL));

		createFormatButton(formatGroup, Format.XML, true);
		createFormatButton(formatGroup, Format.JSON, false);
		createFormatButton(formatGroup, Format.YAML, false);
	}

	private void createFormatButton(Group formatGroup, Format format, boolean defaultValue) {
		Button xmlButton = new Button(formatGroup, SWT.RADIO);
		xmlButton.setText(format.toString());
		xmlButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				selectedFormat = format;
			};
		});
		if (defaultValue) {
			selectedFormat = format;
			xmlButton.setSelection(true);
		}
	}

	public void createBrowseGroup(Composite parent) {

		Button browseButton = new Button(parent, SWT.PUSH);
		browseButton.setLayoutData(new GridData(GridData.END));
		browseButton.setText("Target");
		browseButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);
				if (selectedFormat != null) {
					switch (selectedFormat) {
					case XML:
						dialog.setFilterExtensions(new String[] { "*.xml" });
						break;
					case JSON:
						dialog.setFilterExtensions(new String[] { "*.json" });
						break;
					case YAML:
						dialog.setFilterExtensions(new String[] { "*.yml" });
						break;

					default:
						break;
					}
				}
				String file = dialog.open();
				if (file != null) {
					targetFile = Path.of(file);
					fileSelectionLabel.setText(file);
				} else {
					targetFile = null;
					fileSelectionLabel.setText("");
				}
				getContainer().updateButtons();
			}
		});

		this.fileSelectionLabel = new Text(parent, SWT.READ_ONLY | SWT.BORDER);
		fileSelectionLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	}

	private void setSelection(IStructuredSelection structuredSelection) {
		Object first = structuredSelection.getFirstElement();
		if (first instanceof Catalog) {
			selectedCatalog = (Catalog) first;
		} else {
			selectedCatalog = null;
		}

		getContainer().updateButtons();
	}

	public Format getSelectedFormat() {
		return selectedFormat;
	}

	@Override
	public boolean isPageComplete() {
		return selectedCatalog != null && targetFile != null && selectedFormat != null;
	}

	public Catalog getSelectedCatalog() {
		return selectedCatalog;
	}

	public Path getTargetFile() {
		return targetFile;
	}

	public void setInitialSelection(Catalog initialSelection) {
		if (initialSelection != null) {
			if (viewer != null && !viewer.getControl().isDisposed()) {
				viewer.setSelection(new StructuredSelection(initialSelection));
			}
			selectedCatalog = initialSelection;
		}

	}
}
