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

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class EObjectSelectionPage<T extends EObject> extends WizardPage {

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);


	private CheckboxTableViewer viewer;

	private Consumer<List<T>> objectConsumer;

	private List<T> input;

	public EObjectSelectionPage(Consumer<List<T>> objectConsumer, String message) {
		super("Threat selection page");
		setMessage(message);
		this.objectConsumer = objectConsumer;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.None);
		composite.setLayout(new GridLayout(2, false));

		viewer = CheckboxTableViewer.newCheckList(composite, SWT.NONE);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.minimumHeight = 100;
		layoutData.minimumWidth = 100;
		viewer.getControl().setLayoutData(layoutData);
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.addCheckStateListener(new ICheckStateListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				objectConsumer.accept(Stream.of(viewer.getCheckedElements()).map(e -> (T) e).collect(toList()));
			}
		});

		Composite buttons = new Composite(composite, SWT.NONE);
		buttons.setLayoutData(new GridData(GridData.FILL_VERTICAL));
		buttons.setLayout(new GridLayout(1, false));

		Button selectAll = new Button(buttons, SWT.PUSH);
		selectAll.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		selectAll.setText("Select all");
		selectAll.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				viewer.setAllChecked(true);
				objectConsumer.accept(input);
			};
		});
		Button deselectAll = new Button(buttons, SWT.PUSH);
		deselectAll.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		deselectAll.setText("Deselect all");
		deselectAll.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				viewer.setAllChecked(false);
				objectConsumer.accept(Collections.emptyList());
			};
		});

		setControl(composite);

	}

	@Override
	public void dispose() {
		super.dispose();
		adapterFactory.dispose();
	}

	public void setInput(List<T> input) {
		this.input = input;
		objectConsumer.accept(input);
		viewer.setInput(input);
		viewer.setAllChecked(true);
		getContainer().updateButtons();
	}


}
