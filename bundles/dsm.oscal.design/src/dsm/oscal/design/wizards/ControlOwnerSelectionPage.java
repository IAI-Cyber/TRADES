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
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.widgets.WidgetFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalMetadata.ControlOwner;

/**
 * Page used to select a {@link ControlOwner} inside {@link Catalog}
 * 
 * @author Arthur Daussy
 *
 */
public class ControlOwnerSelectionPage extends WizardPage {

	private List<Catalog> catalogs;
	private ControlOwner selectedOwner;
	private AdapterFactoryLabelProvider labelProvider;
	private AdapterFactoryContentProvider contentProvider;

	public ControlOwnerSelectionPage(AdapterFactory adapterFactory, List<Catalog> catalogs) {
		super("Container selection page");
		setMessage("Select the container of the OSCAL controls.");
		this.catalogs = catalogs;
		this.labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		this.contentProvider = new AdapterFactoryContentProvider(adapterFactory) {
			@Override
			public Object[] getElements(Object object) {
				if (object instanceof List<?>) {
					return ((List<?>) object).toArray();
				}
				return super.getElements(object);
			}
		};
	}

	@Override
	public void createControl(Composite parent) {
		Composite cc = WidgetFactory.composite(SWT.NONE).layout(new GridLayout(2, false))
				.layoutData(new GridData(GridData.FILL_BOTH)).create(parent);

		TreeViewer viewer = new TreeViewer(cc, SWT.SINGLE);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(labelProvider);
		viewer.setInput(catalogs);
		viewer.addSelectionChangedListener(e -> setSelection(e.getStructuredSelection()));

		setControl(cc);

	}

	private void setSelection(IStructuredSelection sel) {
		if (sel != null) {
			selectedOwner = (ControlOwner) Stream.of(((IStructuredSelection) sel).toArray())
					.filter(e -> e instanceof ControlOwner).findFirst().orElse(null);
		} else {
			selectedOwner = null;
		}
		getContainer().updateButtons();
	}

	@Override
	public boolean isPageComplete() {
		return selectedOwner != null;
	}

	public ControlOwner getSelectedOwner() {
		return selectedOwner;
	}

	@Override
	public void dispose() {
		super.dispose();
		labelProvider.dispose();
		contentProvider.dispose();
	}

}
