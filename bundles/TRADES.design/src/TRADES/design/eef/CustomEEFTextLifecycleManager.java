/*******************************************************************************
 * Copyright (c) 2015, 2021 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package TRADES.design.eef;

import java.text.MessageFormat;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.common.ui.api.SWTUtils;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFTextController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.eef.ide.ui.internal.preferences.EEFPreferences;
import org.eclipse.eef.ide.ui.internal.widgets.EEFStyledTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.widgets.EEFTextLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.EEFTextMemento;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * Workaround for bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=574077.
 * 
 * Please remove this class when a new version a Sirius is used with a fix
 * 
 * Copy of org.eclipse.eef.ide.ui.internal.widgets.EEFTextLifecycleManager
 * 
 * @author sbegaudeau
 * @author Arthur Daussy
 *
 */
public class CustomEEFTextLifecycleManager extends AbstractEEFWidgetLifecycleManager {
	/**
	 * The different ways an edition conflict can be resolved. Used by the default
	 * implementation of
	 * {@link EEFTextLifecycleManager#resolveEditionConflict(Shell, String, String, String)}.
	 */
	public enum ConflictResolutionMode {
		/**
		 * Use the version being edited in the widget, overriding the new version
		 * computed from the current model state.
		 */
		USE_LOCAL_VERSION,
		/**
		 * Use the version computed from the current model state, replacing the text
		 * being edited by the user in the widget.
		 */
		USE_MODEL_VERSION,
		/**
		 * Ask the user through a simple dialog which version to keep.
		 */
		ASK_USER
	}

	/**
	 * This constant is used in order to tell SWT that the text area should be 300px
	 * wide even if it is not useful. The layout data should work by themselves but
	 * it seems that there is a bug with SWT so, this useless information on the
	 * width of the text area make it work. Don't ask me why :)
	 */
	private static final int TEXT_AREA_WIDTH_HINT = 300;

	/**
	 * The description.
	 */
	private EEFTextDescription description;

	/**
	 * The text.
	 */
	private StyledText text;

	/**
	 * The controller.
	 */
	private IEEFTextController controller;

	/**
	 * The listener on the text field.
	 */
	private FocusListener focusListener;

	/**
	 * The key listener on the text field (unused for a multi-line text field).
	 */
	private KeyListener keyListener;

	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * The default background color of the text field.
	 */
	private Color defaultBackgroundColor;

	/**
	 * The listener used to indicate that the text field is dirty.
	 */
	private ModifyListener modifyListener;

	/**
	 * Used to make the SelectionListener reentrant, to avoid infinite loops when we
	 * need to revert the UI state on error (as reverting the UI re-triggers the
	 * SelectionListener).
	 */
	private AtomicBoolean updateInProgress = new AtomicBoolean(false);

	/**
	 * True only while we are reacting to a notification that the underlying element
	 * has been locked by someone else. When this is the case, we must avoid any
	 * attempt to apply our current widget state to the model (it will fail).
	 */
	private AtomicBoolean lockedByOtherInProgress = new AtomicBoolean(false);

	/**
	 * The reference value of the text, as last rendered from the state of the
	 * actual model.
	 */
	private String referenceValue = ""; //$NON-NLS-1$

	/**
	 * Indicates that the text field is dirty.
	 */
	private boolean isDirty;

	/**
	 * The constructor.
	 *
	 * @param description           The description
	 * @param variableManager       The variable manager
	 * @param interpreter           The interpreter
	 * @param editingContextAdapter The editing context adapter
	 */
	public CustomEEFTextLifecycleManager(EEFTextDescription description, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#createMainControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		widgetFactory = formContainer.getWidgetFactory();
		defaultBackgroundColor = parent.getBackground();

		// Get text area line count
		int lineCount = description.getLineCount();

		// Create text or text area according to the defined line count
		if (lineCount > 1) {
			this.text = widgetFactory.createStyledText(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP | SWT.MULTI);
			GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
			gridData.heightHint = lineCount * text.getLineHeight();
			gridData.widthHint = TEXT_AREA_WIDTH_HINT;
			gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
			this.text.setLayoutData(gridData);
		} else {
			this.text = widgetFactory.createStyledText(parent, SWT.SINGLE);
			GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
			gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
			this.text.setLayoutData(gridData);
		}

		this.text.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createTextController(this.description, this.variableManager,
				this.interpreter, this.editingContextAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getLabelVerticalAlignment()
	 */
	@Override
	protected int getLabelVerticalAlignment() {
		if (this.description.getLineCount() > 1) {
			return GridData.VERTICAL_ALIGN_BEGINNING;
		}
		return GridData.VERTICAL_ALIGN_CENTER;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getController()
	 */
	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#getWidgetDescription()
	 */
	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.modifyListener = (event) -> {
			if (!this.container.isRenderingInProgress() && !updateInProgress.get()) {
				this.isDirty = true;
				Object self = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
				String userInput = ((StyledText) event.widget).getText();
				EEFTextMemento memento = new EEFTextMemento(this.description, self, this.referenceValue, userInput);
				memento.store(event.widget);
			}
		};
		this.text.addModifyListener(this.modifyListener);

		this.focusListener = SWTUtils.focusLostAdapter((event) -> {
			if (!this.lockedByOtherInProgress.get() && !this.container.isRenderingInProgress() && this.isDirty) {
				this.updateValue(false);
			}
		});
		this.text.addFocusListener(this.focusListener);

		if (this.description.getLineCount() <= 1) {
			this.keyListener = SWTUtils.keyReleasedAdapter((event) -> {
				if (event.character == '\r' || event.character == '\n') {
					this.updateValue(false);
				}
			});
			this.text.addKeyListener(this.keyListener);
		}

		this.controller.onNewValue((value) -> {
			if (!text.isDisposed()) {
				String newDisplayText = computeNewText(value);
				if (!(text.getText() != null && text.getText().equals(newDisplayText))) {
					text.setText(newDisplayText);
					referenceValue = text.getText();
				}
				this.setStyle();
				if (!text.isEnabled()) {
					text.setEnabled(true);
				}
			}

		});
	}

	/**
	 * Determine the new textual value to display in the widget.
	 *
	 * @param value the value computed from the model.
	 * @return the textual value to display in the widget.
	 */
	private String computeNewText(Object value) {
		String[] newDisplayText = { "" }; //$NON-NLS-1$
		if (value != null) {
			newDisplayText[0] = Util.firstNonNull(value.toString(), newDisplayText[0]);
		}
		EEFTextMemento memento = EEFTextMemento.of(text);
		if (memento != null) {
			boolean resettingToPreviousReferenceValue = Objects.equals(newDisplayText[0], memento.getReferenceValue());
			boolean userHasUncommitedInput = !Objects.equals(newDisplayText[0], memento.getUserInput());
			if (memento.appliesTo(this.description, this.variableManager.getVariables()) && userHasUncommitedInput) {
				if (resettingToPreviousReferenceValue) {
					// Custom user input overrides resetting the same previous referenceValue.
					newDisplayText[0] = memento.getUserInput();
				} else if (!Objects.equals(memento.getUserInput(), newDisplayText[0])) {
					// Conflict must be resolved somehow.
					newDisplayText[0] = resolveEditionConflict(this.text.getShell(), memento.getReferenceValue(),
							memento.getUserInput(), newDisplayText[0]);
				}
			}
			EEFTextMemento.remove(text);
		}
		return newDisplayText[0];
	}

	/**
	 * Handle conflicts between un-commited changes in the widget and concurrent
	 * changes in the model that produce a different value than the original one
	 * seen by the user.
	 *
	 * @param shell              the shell to use if user interaction is needed.
	 * @param originalValue      the original, common value, before the user started
	 *                           editing and before the concurrent model change
	 *                           produced a new text.
	 * @param localEditedVersion the value as edited by the user, and seen in the
	 *                           UI.
	 * @param newValueFromModel  the new value produced from the new model state.
	 * @return the new value to use in the text field.
	 */
	protected String resolveEditionConflict(Shell shell, String originalValue, String localEditedVersion,
			final String newValueFromModel) {
		String result;
		switch (EEFPreferences.getTextConflictResolutionMode()) {
		case USE_LOCAL_VERSION:
			result = localEditedVersion;
			break;
		case USE_MODEL_VERSION:
			result = newValueFromModel;
			break;
		case ASK_USER:
			result = askUserToResolveConflict(shell, originalValue, localEditedVersion, newValueFromModel);
			break;
		default:
			throw new IllegalStateException();
		}
		return result;
	}

	/**
	 * Open a simple dialog to inform the user of a conflict and ask him which
	 * version to keep.
	 *
	 * @param shell              the shell to use if user interaction is needed.
	 * @param originalValue      the original, common value, before the user started
	 *                           editing and before the concurrent model change
	 *                           produced a new text.
	 * @param localEditedVersion the value as edited by the user, and seen in the
	 *                           UI.
	 * @param newValueFromModel  the new value produced from the new model state.
	 * @return the value chosen by the user.
	 */
	protected String askUserToResolveConflict(Shell shell, String originalValue, String localEditedVersion,
			String newValueFromModel) {
		final String[] result = { localEditedVersion };
		// @formatter:off
		final String[] choices = {
				Messages.EEFTextLifecycleManager_conflictDialog_choiceNewModelValue,
				Messages.EEFTextLifecycleManager_conflictDialog_choiceLocalEditedValue,
		};
		// @formatter:on
		shell.getDisplay().syncExec(() -> {
			String title = Messages.EEFTextLifecycleManager_conflictDialog_title;
			String message = MessageFormat.format(Messages.EEFTextLifecycleManager_conflictDialog_message,
					newValueFromModel, localEditedVersion);
			Image img = shell.getDisplay().getSystemImage(SWT.ICON_QUESTION);
			MessageDialog dialog = new MessageDialog(shell, title, img, message, MessageDialog.QUESTION, 0, choices);
			switch (dialog.open()) {
			case 0:
				result[0] = newValueFromModel;
				break;
			case 1:
				result[0] = localEditedVersion;
				break;
			default:
				throw new IllegalStateException();
			}
		});
		return result[0];
	}

	/**
	 * Updates the value.
	 *
	 * @param force if <code>true</code>, update even if we are in the render phase.
	 */
	private void updateValue(boolean force) {
		boolean shouldUpdateWhileRendering = !CustomEEFTextLifecycleManager.this.container.isRenderingInProgress()
				|| force;
		if (!this.text.isDisposed() && this.isDirty && shouldUpdateWhileRendering
				&& updateInProgress.compareAndSet(false, true)) {
			try {
				IStatus result = controller.updateValue(text.getText());
				if (result != null && result.getSeverity() == IStatus.ERROR) {
					EEFIdeUiPlugin.INSTANCE.log(result);
					text.setText(referenceValue);
				} else {
					referenceValue = text.getText();
					refresh();
				}
				this.isDirty = false;
				EEFTextMemento.remove(this.text);
				this.setStyle();
			} finally {
				updateInProgress.set(false);
			}
		}
	}

	/**
	 * Set the style.
	 */
	private void setStyle() {
		EEFStyleHelper styleHelper = new EEFStyleHelper(this.interpreter, this.variableManager);
		EEFWidgetStyle widgetStyle = styleHelper.getWidgetStyle(this.description);
		if (widgetStyle instanceof EEFTextStyle) {
			EEFTextStyle textStyle = (EEFTextStyle) widgetStyle;

			Font defaultFont = this.text.getShell().getFont();

			IEEFTextStyleCallback callback = new EEFStyledTextStyleCallback(this.text);
			styleHelper.applyTextStyle(textStyle.getFontNameExpression(), textStyle.getFontSizeExpression(),
					textStyle.getFontStyleExpression(), defaultFont, textStyle.getBackgroundColorExpression(),
					textStyle.getForegroundColorExpression(), callback);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.text;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		if (this.isDirty) {
			this.updateValue(true);
		}

		super.aboutToBeHidden();

		if (!text.isDisposed()) {
			this.text.removeFocusListener(this.focusListener);
		}
		this.controller.removeNewValueConsumer();

		if (!this.text.isDisposed()) {
			this.text.removeModifyListener(this.modifyListener);
		}

		if (!this.text.isDisposed() && this.description.getLineCount() <= 1) {
			this.text.removeKeyListener(this.keyListener);
		}
	}

	@Override
	protected void lockedByOther() {
		this.lockedByOtherInProgress.set(true);
		try {
			/*
			 * Disabling the widget will prevent the user to recover any local version of
			 * the text widget. Detect this case and open a popup with the option to copy
			 * the local text to the clipboard.
			 */
			String textFromModel = computeTextFromModel();
			EEFTextMemento memento = EEFTextMemento.of(text);
			if (memento != null) {
				boolean userHasUncommitedInput = !Objects.equals(textFromModel, memento.getUserInput());
				if (memento.appliesTo(this.description, this.variableManager.getVariables())
						&& userHasUncommitedInput) {
					notifyTextLossOnLock(memento.getUserInput(), textFromModel);
					// Update the displayed text to avoid confusion.
					this.text.setText(textFromModel);
				}
				EEFTextMemento.remove(text);
			}
			super.lockedByOther();
		} finally {
			this.lockedByOtherInProgress.set(false);
		}
	}

	/**
	 * Notify the end user that his current input will be lost as the underlying
	 * widget (and model element) has been locked by a remote/async change.
	 *
	 * @param userInput     the current text entered by the user.
	 * @param textFromModel the text that will replace the current input.
	 */
	protected void notifyTextLossOnLock(String userInput, String textFromModel) {
		Shell shell = this.text.getShell();
		if (MessageDialog.openQuestion(shell, Messages.EEFTextLifecycleManager_textLossByLocking_title,
				MessageFormat.format(Messages.EEFTextLifecycleManager_textLossByLocking_message, userInput))) {
			Clipboard clipboard = new Clipboard(shell.getDisplay());
			clipboard.setContents(new Object[] { userInput }, new Transfer[] { TextTransfer.getInstance() });
			clipboard.dispose();
		}
	}

	/**
	 * Compute the text the widget should display given the current state of the
	 * underlying model (independently of any potential user input in the widget).
	 *
	 * @return the text to display according to the model's current state.
	 */
	private String computeTextFromModel() {
		String valueExpression = this.description.getValueExpression();
		Object result = EvalFactory.of(this.interpreter, this.variableManager).evaluate(valueExpression);

		// @formatter:off
		return Optional.ofNullable(result)
				.filter(String.class::isInstance)
				.map(String.class::cast)
				.orElse(""); //$NON-NLS-1$
		// @formatter:on
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		if (!this.text.isDisposed()) {
			this.text.setEditable(isEnabled);
			this.text.setBackground(this.getBackgroundColor(isEnabled));
		}
	}

	/**
	 * Get the background color according to the current valid style.
	 *
	 * @param isEnabled <code>true</code> to indicate that the widget is currently
	 *                  enabled, <code>false</code> otherwise
	 *
	 * @return The background color to use in the text field.
	 */
	private Color getBackgroundColor(boolean isEnabled) {
		Color color = defaultBackgroundColor;
		if (!isEnabled) {
			color = widgetFactory.getColors().getInactiveBackground();
		} else {
			EEFWidgetStyle widgetStyle = new EEFStyleHelper(this.interpreter, this.variableManager)
					.getWidgetStyle(this.description);
			if (widgetStyle instanceof EEFTextStyle) {
				EEFTextStyle style = (EEFTextStyle) widgetStyle;
				String backgroundColorCode = style.getBackgroundColorExpression();
				if (!Util.isBlank(backgroundColorCode)) {
					EEFColor backgroundColor = new EEFColor(backgroundColorCode);
					color = backgroundColor.getColor();
				}
			}
		}
		return color;
	}

}
