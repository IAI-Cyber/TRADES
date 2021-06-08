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

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.widgets.WidgetFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import dsm.TRADES.Control;

/**
 * Page used to select {@link Control}s from a list a candidates
 * 
 * @author Arthur Daussy
 *
 */
public class ControlSelectionPage extends WizardPage {

	private List<Control> selection;

	private AdapterFactoryLabelProvider labelProvider;

	private List<Control> allControls;

	public ControlSelectionPage(AdapterFactory adapterFactory, List<Control> allControls,
			List<Control> initialSelection) {
		super("Control selection page");
		setMessage("Select the control to export.");
		this.allControls = allControls;
		this.selection = initialSelection;
		this.labelProvider = new AdapterFactoryLabelProvider(adapterFactory);

	}

	@Override
	public void createControl(Composite parent) {
		Composite cc = WidgetFactory.composite(SWT.NONE).layout(new GridLayout(2, false))
				.layoutData(new GridData(GridData.FILL_BOTH)).create(parent);

		CheckboxTableViewer viewer = CheckboxTableViewer.newCheckList(cc, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setLabelProvider(labelProvider);
		viewer.addCheckStateListener(e -> {
			setSelection(viewer.getCheckedElements());
		});
		viewer.setInput(allControls);
		viewer.setCheckedElements(selection.toArray());

		setControl(cc);

	}

	private void setSelection(Object[] sel) {
		if (sel != null) {
			selection = Stream.of(sel).filter(e -> e instanceof Control).map(e -> ((Control) e)).collect(toList());
		} else {
			selection = Collections.emptyList();
		}
		getContainer().updateButtons();
	}

	public List<Control> getSelection() {
		return selection;
	}

	@Override
	public boolean isPageComplete() {
		return !selection.isEmpty();
	}

	@Override
	public void dispose() {
		super.dispose();
		labelProvider.dispose();
	}
}
