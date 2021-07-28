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

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;

import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.ext.widgets.markup.EEFExtMarkupUIPlugin;
import org.eclipse.eef.ide.ui.ext.widgets.markup.internal.Messages;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * AbstractEEFWidgetLifecycleManager for the HTML renderer widget.
 *
 * @author Arthur Daussy
 *
 */
public class HTMLRendererLifeCycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * Location listener that prevents changing the browser location and instead open an external browser.
	 *
	 * @author Arthur Daussy
	 *
	 */
	private final class ExternalLinkHandler implements LocationListener {
		@Override
		public void changing(LocationEvent event) {
			// Prevents any change of location except when location is "about:blank" since it is used by the
			// browser.setText method. If a change to another location is required then open an external browser
			String location = event.location;
			if (!ABOUT_BLANK.equals(location)) {
				try {
					URL url = new URL(location);
					PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser().openURL(url);
				} catch (MalformedURLException e) {
					EEFExtMarkupUIPlugin.logWarning(MessageFormat.format(Messages.HTMLLifeCycleManager_Warning_InvalidURL, event.location), e);
				} catch (PartInitException e) {
					EEFExtMarkupUIPlugin.logError(MessageFormat.format(Messages.HTMLLifeCycleManager_Error_UnableToOpenURLInBrowser, location), e);
				}
				event.doit = false; // Prevent changing location
			}

		}

		@Override
		public void changed(LocationEvent event) {
			// Nothing to do
		}
	}

	/**
	 * Input source default.
	 */
	private static final String ABOUT_BLANK = "about:blank"; //$NON-NLS-1$
	/**
	 * Widget description.
	 */
	private EEFExtHTMLRendererDescription controlDescription;
	/**
	 * The controller.
	 */
	private HTMLRendererController controller;
	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;
	/**
	 * The widget rendering the HTML content.
	 */
	private Browser browser;
	/**
	 * Parent composite.
	 */
	private Composite composite;
	/**
	 * Button to push to activate edit tool.
	 */
	private Button editButton;
	/**
	 * Edit button section adapter.
	 */
	private SelectionAdapter editButtonListener;
	/**
	 * Browser location change listener used to prevent changing location.
	 */
	private LocationListener locationChangeListener;

	/**
	 * Simple constructor.
	 *
	 * @param controlDescription
	 *            the widget description
	 * @param variableManager
	 *            the variable manager
	 * @param interpreter
	 *            the {@link IInterpreter}
	 * @param editingContextAdapter
	 *            the {@link EditingContextAdapter}
	 */
	public HTMLRendererLifeCycleManager(EEFExtHTMLRendererDescription controlDescription, IVariableManager variableManager, IInterpreter interpreter,
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
		if (editButton != null) {
			editButton.setEnabled(isEnabled);
		}
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		widgetFactory = formContainer.getWidgetFactory();
		composite = widgetFactory.createComposite(parent, SWT.NONE);

		boolean hasEditButton = controlDescription.getEditExpression() != null && !controlDescription.getEditExpression().isBlank();

		int nbColumns;
		if (hasEditButton) {
			nbColumns = 2;
		} else {
			nbColumns = 1;
		}

		GridLayout layout = new GridLayout(nbColumns, false);
		composite.setLayout(layout);

		GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		composite.setLayoutData(layoutData);

		browser = new Browser(composite, SWT.NONE);
		browser.setJavascriptEnabled(false);

		GridData browserLayoutData = new GridData(GridData.FILL_BOTH);

		browser.setLayoutData(browserLayoutData);

		this.browser.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		GC gc = new GC(parent.getShell().getDisplay());
		gc.setFont(browser.getFont());

		// Approximation here since the size of the font used in the renderer depends on
		// the CSS
		int fontHeight = gc.getFontMetrics().getHeight();
		browserLayoutData.minimumHeight = fontHeight * controlDescription.getNumberOfLine();

		if (hasEditButton) {
			editButton = widgetFactory.createButton(composite, "", SWT.PUSH); //$NON-NLS-1$
			editButton.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
			editButton.setImage(EEFExtMarkupUIPlugin.getPlugin().getImage("icons/edit.png")); //$NON-NLS-1$
		}

		this.controller = new HTMLRendererController(variableManager, interpreter, editingContextAdapter, controlDescription);

	}

	@Override
	public void aboutToBeHidden() {

		removeLocationListener();

		if (editButton != null && !editButton.isDisposed()) {
			editButton.removeSelectionListener(editButtonListener);
			editButtonListener = null;
		}

		super.aboutToBeHidden();
	}

	/**
	 * Remove location listener.
	 */
	private void removeLocationListener() {
		if (browser != null & !browser.isDisposed() && locationChangeListener != null) {
			browser.removeLocationListener(locationChangeListener);
		}
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.controller.onNewValue((value) -> {
			if (!browser.isDisposed()) {
				this.variableManager.put(EEFExpressionUtils.EEFText.NEW_VALUE, value);
				String toHtmlExpression = this.controlDescription.getToHtmlExpression();
				Object result = EvalFactory.of(this.interpreter, this.variableManager).evaluate(toHtmlExpression);
				if (result instanceof String) {
					String htmlContent = (String) result;

					String cssExpression = controlDescription.getCssExpression();
					if (cssExpression != null && !cssExpression.isEmpty()) {
						htmlContent = aggregateCss(htmlContent, cssExpression);
					}

					browser.setText(htmlContent, false);
				}
				composite.layout(true, true);
			}

		});

		addLocationListener();

		if (editButton != null) {

			editButtonListener = new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					String editionToolExpression = controlDescription.getEditionToolExpression();
					Object result = EvalFactory.of(interpreter, variableManager).evaluate(editionToolExpression);
					if (result instanceof String) {
						controller.updateValue((String) result);
					}
				}
			};
			editButton.addSelectionListener(editButtonListener);
		}
	}

	/**
	 * Aggregate the CSS content to the given HTML body content.
	 *
	 * @param htmlContent
	 *            the HTML body content
	 * @param cssExpression
	 *            the CSS Expression
	 * @return a HTML document content
	 */
	private String aggregateCss(String htmlContent, String cssExpression) {
		Object cssRsult = EvalFactory.of(this.interpreter, this.variableManager).evaluate(cssExpression);
		if (cssRsult instanceof String) {
			// If CSS result a valid result then the toHTML expression is expected to return on the
			// content of the body
			String cssContent = (String) cssRsult;
			if (!cssContent.isBlank()) {
				return "<!DOCTYPE html>\r\n" //$NON-NLS-1$
						+ "<html>\r\n"//$NON-NLS-1$
						+ "<head>\r\n" //$NON-NLS-1$
						+ "<style>\r\n" //$NON-NLS-1$
						+ cssContent + "\r\n" //$NON-NLS-1$
						+ "</style>\r\n" //$NON-NLS-1$
						+ "</head>\r\n" //$NON-NLS-1$
						+ "<body>\r\n" //$NON-NLS-1$
						+ htmlContent + "</body>\r\n" //$NON-NLS-1$
						+ "</html>"; //$NON-NLS-1$
			}
		}
		return htmlContent;
	}

	/**
	 * Add a location listener.
	 */
	private void addLocationListener() {
		if (browser != null & !browser.isDisposed()) {
			/*
			 * This widget is only used for rendering. We want to forbid the user from changing the location. Instead
			 * when clicking into a external link it should open the external browser
			 */
			this.locationChangeListener = new ExternalLinkHandler();
			browser.addLocationListener(locationChangeListener);
		}
	}

	@Override
	protected Control getValidationControl() {
		return browser;
	}

}
