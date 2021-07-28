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

import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.eclipse.eef.ide.ui.ext.widgets.markup.EEFExtMarkupUIPlugin;
import org.eclipse.eef.ide.ui.ext.widgets.markup.internal.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Widget;

/**
 * A widget used to display Markdown text with syntax coloring.
 *
 * @author Arthur Daussy
 *
 */
public class MarkdownWidget {

	/**
	 * Refresh period for the syntax coloring.
	 */
	private static final int SYNTAX_REFRESH_PERIOD = 300;
	/**
	 * Current Markdown content.
	 */
	private String markdown;

	/**
	 * Provider of style information.
	 */
	private MarkodwnStyleFactory styleFactory;

	/**
	 * Execution service in charge of parsing the Markdown text and launching UI update.
	 */
	private ScheduledExecutorService executorService;

	/**
	 * Markdown parser.
	 */
	private Parser parser;

	/**
	 * A valid display.
	 */
	private Display display;

	/**
	 * Widget used to display the Markdown text.
	 */
	private StyledText styledText;

	/**
	 * Last {@link StyleDescription} rendered.
	 */
	private StyleDescription lastUpdatedStyle;

	/**
	 * Consumer notified when the value of the text change (only used in {@link #updateOnFocusLost} is false).
	 */
	private Consumer<String> valueConsumer;

	/**
	 * Holds true to use a text with more than one line.
	 */
	private final boolean multiLine;

	/**
	 * Widget modify listener.
	 */
	private ModifyListener modifyListener;

	/**
	 * Listener used to clean this widget.
	 */
	private DisposeListener disposeListener;

	/**
	 * Holds <code>true</code> to only update the value when the focus in lost on the widget.
	 */
	private boolean updateOnFocusLost;

	/**
	 * Focus listener.
	 */
	private FocusAdapter focusListener;

	/**
	 * Holds true if the widget has changes since last update.
	 */
	private boolean hasChanged = true;

	/**
	 * Holds <code>true</code> if the value has changed but the consumer has not been called yet.
	 */
	private boolean needValueUpdate;

	/**
	 * Simple constructor.
	 *
	 * @param display
	 *            a valid Displayed
	 * @param markdown
	 *            the initial markdown text
	 * @param multiLine
	 *            set to true to handle multiline
	 */
	public MarkdownWidget(Display display, String markdown, boolean multiLine) {
		this.display = display;
		this.markdown = markdown;
		this.multiLine = multiLine;
		this.styleFactory = new MarkodwnStyleFactory(display);
	}

	/**
	 * Sets the updateOnFocusLost. Only applied after a {@link #aboutToBeShown()} call.
	 *
	 * @param anUpdateOnFocusLost
	 *            the updateOnFocusLost to set
	 * @return this for convenience
	 */
	public MarkdownWidget setUpdateOnFocusLost(boolean anUpdateOnFocusLost) {
		this.updateOnFocusLost = anUpdateOnFocusLost;
		return this;
	}

	/**
	 * Sets the valueConsumer. Only applied after a {@link #aboutToBeShown()} call.
	 *
	 * @param aValueConsumer
	 *            the valueConsumer to set
	 * @return this for convenience
	 */
	public MarkdownWidget setValueConsumer(Consumer<String> aValueConsumer) {
		this.valueConsumer = aValueConsumer;
		return this;
	}

	/**
	 * To be called just before the widget is displayed.
	 */
	public void aboutToBeShown() {
		final ScheduledExecutorService aExecutorService = Executors.newSingleThreadScheduledExecutor();

		if (styledText != null && !styledText.isDisposed()) {
			this.modifyListener = new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent e) {
					markdown = styledText.getText();
					hasChanged = true;
					needValueUpdate = true;
					if (!updateOnFocusLost) {
						valueConsumer.accept(markdown);
						needValueUpdate = false;
					}
				}

			};
			styledText.addModifyListener(modifyListener);

			// In case the about to be hidden is not called shutdown the executor service
			this.disposeListener = new DisposeListener() {

				@Override
				public void widgetDisposed(DisposeEvent e) {
					shutdownExecutor(aExecutorService);
				}
			};
			styledText.addDisposeListener(disposeListener);

			if (updateOnFocusLost) {

				this.focusListener = new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent event) {
						valueConsumer.accept(markdown);
						needValueUpdate = false;
					}
				};
				styledText.addFocusListener(focusListener);
			}
		}

		computeAndSetStyles();

		executorService = aExecutorService;
		if (!executorService.isShutdown()) {
			try {
				executorService.scheduleAtFixedRate(this::computeAndSetStyles, SYNTAX_REFRESH_PERIOD, SYNTAX_REFRESH_PERIOD, TimeUnit.MILLISECONDS);
			} catch (RejectedExecutionException e) {
				// Nothing to do. Just in case the executor is shutdown
			}
		}

	}

	/**
	 * To be called just before hiding the widget.
	 */
	public void aboutToBeHidden() {
		// Only to handle case where the lost focus was
		if (updateOnFocusLost && needValueUpdate && valueConsumer != null) {
			valueConsumer.accept(markdown);
		}

		if (styledText != null && !styledText.isDisposed()) {
			if (modifyListener != null) {
				styledText.removeModifyListener(modifyListener);
				modifyListener = null;
			}

			if (disposeListener != null) {
				styledText.removeDisposeListener(disposeListener);
				disposeListener = null;
			}

			if (updateOnFocusLost) {
				if (focusListener != null) {
					styledText.removeFocusListener(focusListener);
					focusListener = null;
				}

			}
		}

		shutdownExecutor(executorService);

	}

	/**
	 * Safely shutdown the executor.
	 *
	 * @param aExecutorService
	 *            the executor to shutdown
	 */
	private void shutdownExecutor(ScheduledExecutorService aExecutorService) {
		if (aExecutorService != null && !aExecutorService.isShutdown()) {
			aExecutorService.shutdown();
		}
		executorService = null;
	}

	/**
	 * Builds the widget.
	 *
	 * @param parent
	 *            a parent {@link Composite}
	 * @return a {@link Widget}
	 */
	public StyledText buildWidget(Composite parent) {

		final int swtStyle;
		if (multiLine) {
			swtStyle = SWT.FULL_SELECTION | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL;
		} else {
			swtStyle = SWT.FULL_SELECTION | SWT.SINGLE | SWT.WRAP;
		}
		styledText = new StyledText(parent, swtStyle);

		styledText.setText(markdown);

		parser = FlexmarkUtil.builFlexParser();

		return styledText;
	}

	/**
	 * Sets the widget text (not not notify the {@link #valueConsumer}).
	 *
	 * @param value
	 *            a new value (null value are discarded)
	 */
	public void setText(String value) {
		if (styledText != null && !styledText.isDisposed() && value != null && !value.equals(styledText.getText())) {
			styledText.setText(value);
			markdown = value;
		}

	}

	/**
	 * Computes and updates the styles of the text widget.
	 */
	private void computeAndSetStyles() {
		try {
			if (hasChanged) {
				hasChanged = false;
				final String currentMarkDown = markdown;
				Document document = parser.parse(currentMarkDown);

				StyleDescription styleDescription = new MarkdownStyleBuilder(styleFactory).buildStyles(document);

				if (styledText != null && !styledText.isDisposed() && needUpdateStyles(styleDescription)) {
					display.syncExec(() -> {
						if (styledText != null && !styledText.isDisposed() && needUpdateStyles(styleDescription)) {

							// The content of the widget may have changed between this call and the document parsing so
							// only applied the style that are in range
							StyleDescription filteredStyle = styleDescription.filterWithText(styledText.getText());

							styledText.setStyleRanges(filteredStyle.getStyles().toArray(StyleRange[]::new));

							for (LineBackground lb : filteredStyle.getLineBackgrounds()) {
								styledText.setLineBackground(lb.getStartLine(), lb.getEndLine() - lb.getStartLine() + 1, lb.getColor());
							}
							lastUpdatedStyle = filteredStyle;
						}
					});
				}
			}
		} catch (SWTError | SWTException e) { // Catch SWT to avoid future updates
			EEFExtMarkupUIPlugin.logError(Messages.MarkdownWidget_Exception_ProblemWhileUpdateStyles, e);
		}
	}

	public StyledText getControl() {
		return styledText;
	}

	/**
	 * Checks if the style needs to be updated.
	 *
	 * @param newStyle
	 *            the given new style descriptions
	 * @return <code>true</code> if the widget needs to be updated
	 */
	private boolean needUpdateStyles(StyleDescription newStyle) {
		return lastUpdatedStyle == null || !lastUpdatedStyle.equals(newStyle);
	}

	public String getMarkdown() {
		return markdown;
	}

	/**
	 * Enables or disables this widget.
	 *
	 * @param isEnabled
	 *            enable value
	 */
	public void setEnable(boolean isEnabled) {
		if (styledText != null && styledText.isDisposed()) {
			return;
		}
		styledText.setEditable(isEnabled);

	}
}
