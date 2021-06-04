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

import org.eclipse.jface.widgets.WidgetFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class CatalogInfoPage extends WizardPage {

	private String catalogFileName;

	private String catalogTitle;

	protected CatalogInfoPage() {
		super("Catalog information page");
	}

	@Override
	public void createControl(Composite parent) {
		// File Name
		Composite cc = WidgetFactory.composite(SWT.NONE).layout(new GridLayout(2, false))
				.layoutData(new GridData(GridData.FILL_BOTH)).create(parent);

		WidgetFactory.label(SWT.None).text("File name").tooltip("Text to create the file to store the new catalog")
				.layoutData(new GridData(GridData.BEGINNING)).create(cc);
		WidgetFactory.text(SWT.BORDER).layoutData(new GridData(GridData.FILL_HORIZONTAL))
				.onModify(e -> setCatalogFileName(((Text) e.widget).getText())).create(cc);

		// Title
		WidgetFactory.label(SWT.None).text("Catalog title").tooltip("Title of the catalog")
				.layoutData(new GridData(GridData.BEGINNING)).create(cc);
		WidgetFactory.text(SWT.BORDER).onModify(e -> setCatalogTitle(((Text) e.widget).getText()))
				.layoutData(new GridData(GridData.FILL_HORIZONTAL)).create(cc);

		setControl(cc);

	}

	public String getCatalogFileName() {
		return catalogFileName;
	}

	public String getCatalogTitle() {
		return catalogTitle;
	}

	private void setCatalogFileName(String catalogFileName) {
		this.catalogFileName = catalogFileName;
		getContainer().updateButtons();
	}

	private void setCatalogTitle(String catalogTitle) {
		this.catalogTitle = catalogTitle;
		getContainer().updateButtons();
	}

	@Override
	public boolean isPageComplete() {
		return super.isPageComplete() && catalogFileName != null && !catalogFileName.isBlank() && catalogTitle != null
				&& !catalogTitle.isBlank();
	}
}
