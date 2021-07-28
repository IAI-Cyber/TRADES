/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Israel Aerospace Industries - initial API and implementation
 */

package org.eclipse.eef.ide.ui.ext.widgets.markup.internal.markdown;

import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * AbstractEEFWidgetLifecycleManager for the Markdown widget.
 *
 * @author Arthur Daussy
 *
 */
public class MarkdownWidgetLifeCycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * Empty.
	 */
	private static final String EMPTY = ""; //$NON-NLS-1$

	/**
	 * Widget description.
	 */
	private EEFExtMarkdownWidget controlDescription;

	/**
	 * Widget controller.
	 */
	private MarkdownWidgetController controller;

	/**
	 * Widget Factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * Parent composite.
	 */
	private Composite composite;

	/**
	 * The widget.
	 */
	private MarkdownWidget mdWidget;

	/**
	 * Simple constructor.
	 *
	 * @param controlDescription
	 *            the widget description
	 * @param variableManager
	 *            the variable manager
	 * @param interpreter
	 *            the interpreter
	 * @param editingContextAdapter
	 *            the editing context
	 */
	public MarkdownWidgetLifeCycleManager(EEFExtMarkdownWidget controlDescription, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.controlDescription = controlDescription;
	}

	@Override
	protected IEEFWidgetController getController() {
		return controller;
	}

	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return controlDescription;
	}

	@Override
	protected void setEnabled(boolean isEnabled) {
		mdWidget.setEnable(isEnabled);
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		widgetFactory = formContainer.getWidgetFactory();
		composite = widgetFactory.createComposite(parent, SWT.NONE);

		GridLayout layout = new GridLayout(1, false);
		composite.setLayout(layout);

		GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		composite.setLayoutData(layoutData);

		this.controller = new MarkdownWidgetController(variableManager, interpreter, editingContextAdapter, controlDescription);

		int numberOfLine = controlDescription.getNumberOfLine();
		boolean isMultiLine = numberOfLine > 1;
		mdWidget = new MarkdownWidget(parent.getDisplay(), EMPTY, isMultiLine)//
				.setUpdateOnFocusLost(true)//
				.setValueConsumer(v -> {
					controller.updateValue(v);
				});
		mdWidget.buildWidget(composite);
		GridData browserLayoutData = new GridData(GridData.FILL_HORIZONTAL);

		mdWidget.getControl().setLayoutData(browserLayoutData);

		mdWidget.getControl().setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		if (isMultiLine) {
			browserLayoutData.heightHint = mdWidget.getControl().getLineHeight() * numberOfLine;
		}

	}

	@Override
	public void aboutToBeHidden() {

		this.controller.removeValueConsumer();
		mdWidget.aboutToBeHidden();
		super.aboutToBeHidden();
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.controller.onNewValue((value) -> {
			if (!mdWidget.getControl().isDisposed()) {
				final String sValue;
				if (value instanceof String) {
					sValue = (String) value;
				} else {
					sValue = EMPTY;
				}
				mdWidget.setText(sValue);
			}

		});

		mdWidget.aboutToBeShown();

	}

	@Override
	protected Control getValidationControl() {
		return mdWidget.getControl();
	}

}
