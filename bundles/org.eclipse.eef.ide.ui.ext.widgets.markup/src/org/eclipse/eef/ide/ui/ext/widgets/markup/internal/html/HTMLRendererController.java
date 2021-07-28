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
package org.eclipse.eef.ide.ui.ext.widgets.markup.internal.html;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * Widget controller for the HTML widget.
 *
 * @author Arthur Daussy
 *
 */
public class HTMLRendererController extends AbstractEEFWidgetController {

	/**
	 * Control description.
	 */
	private EEFExtHTMLRendererDescription description;

	/**
	 * Consumer used for new values.
	 */
	private Consumer<Object> newValueConsumer;

	/**
	 * Simple constructor.
	 *
	 * @param variableManager
	 *            the variable manager
	 * @param interpreter
	 *            the interpreter
	 * @param editingContextAdapter
	 *            an {@link EditingContextAdapter}
	 * @param description
	 *            the widget description
	 */
	public HTMLRendererController(IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter editingContextAdapter,
			EEFExtHTMLRendererDescription description) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	@Override
	protected EEFWidgetDescription getDescription() {
		return description;
	}

	@Override
	public void refresh() {
		super.refresh();
		this.newEval().call(description.getValueExpression(), this.newValueConsumer);
	}

	/**
	 * Update the value of the widget.
	 *
	 * @param text
	 *            the new text
	 * @return a {@link IStatus}
	 */
	public IStatus updateValue(final String text) {
		return this.editingContextAdapter.performModelChange(() -> {
			String editExpression = this.description.getEditExpression();
			EAttribute eAttribute = MarkupWidgetsPackage.Literals.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);

			EvalFactory.of(this.interpreter, variables).logIfBlank(eAttribute).call(editExpression);
		});
	}

	/**
	 * Sets the onNewValue consumer.
	 *
	 * @param consumer
	 *            a non <code>null</code> consumer
	 */
	public void onNewValue(Consumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * Remove the onValueConsumer.
	 */
	public void removeValueConsumer() {
		this.newValueConsumer = null;
	}

}
