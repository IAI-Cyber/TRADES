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

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * AbstractEEFWidgetController for Markdown widget.
 *
 * @author Arthur Daussy
 *
 */
public class MarkdownWidgetController extends AbstractEEFWidgetController {

	/**
	 * Control description.
	 */
	private EEFExtMarkdownWidget description;

	/**
	 * Value consumer.
	 */
	private Consumer<Object> newValueConsumer;

	/**
	 * Simple constructor.
	 *
	 * @param variableManager
	 *            a {@link IVariableManager}
	 * @param interpreter
	 *            an {@link IInterpreter}
	 * @param editingContextAdapter
	 *            a {@link EditingContextAdapter}
	 * @param description
	 *            a EEFExtMarkdownWidget.
	 */
	public MarkdownWidgetController(IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter editingContextAdapter,
			EEFExtMarkdownWidget description) {
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

		String valueExpression = this.description.getValueExpression();
		Optional.ofNullable(this.newValueConsumer).ifPresent(consumer -> {
			this.newEval().call(valueExpression, consumer);
		});

	}

	/**
	 * Updates the text of the widget.
	 *
	 * @param text
	 *            the input value
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
	 * Set the new value consumer.
	 *
	 * @param consumer
	 *            a non <code>null</code> consumer
	 */
	public void onNewValue(Consumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * Remove the onValue consumer.
	 */
	public void removeValueConsumer() {
		this.newValueConsumer = null;
	}

}
