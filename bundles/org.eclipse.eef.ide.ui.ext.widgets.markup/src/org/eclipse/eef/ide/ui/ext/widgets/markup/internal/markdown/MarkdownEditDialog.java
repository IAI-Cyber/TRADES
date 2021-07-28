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

import org.eclipse.eef.ide.ui.ext.widgets.markup.internal.Messages;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * Dialog used to edit a Markdown text.
 *
 * @author Arthur Daussy
 *
 */
public class MarkdownEditDialog extends Dialog {

	/**
	 * Minimum screen height ratio to be used by this dialog.
	 */
	private static final double MIN_HEIGHT_RAIO = 0.8;

	/**
	 * The Markdown text current value.
	 */
	private String markdown;

	/**
	 * Holds <code>true</code> if the text to edit is multiline.
	 */
	private boolean multiLine;

	/**
	 * The Markdown widget.
	 */
	private MarkdownWidget markdownWidget;

	/**
	 * Simple constructor.
	 *
	 * @param parentShell
	 *            the parent shell
	 * @param multiLine
	 *            holds <code>true</code> if the text to edit is multiline
	 * @param markdown
	 *            the initial content of the Markdown text
	 */
	public MarkdownEditDialog(Shell parentShell, boolean multiLine, String markdown) {
		super(parentShell);
		this.multiLine = multiLine;
		this.markdown = markdown;

	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	private void setMarkdown(String markdown) {
		this.markdown = markdown;
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite composite = (Composite) super.createDialogArea(parent);
		getShell().setText(Messages.MarkdownEditDialog_DialogTitle);

		this.markdownWidget = new MarkdownWidget(parent.getDisplay(), markdown, multiLine).setValueConsumer(this::setMarkdown);
		StyledText styledText = markdownWidget.buildWidget(composite);

		markdownWidget.aboutToBeShown();
		final GridData layoutData;
		if (multiLine) {
			layoutData = new GridData(GridData.FILL_BOTH);
			layoutData.minimumHeight = (int) (getShell().getSize().y * MIN_HEIGHT_RAIO);
			layoutData.minimumWidth = (int) (getShell().getSize().x * 0.5);
		} else {
			layoutData = new GridData(GridData.FILL_HORIZONTAL);
		}
		styledText.setLayoutData(layoutData);
		return composite;
	}

	@Override
	public int open() {
		int code = super.open();

		markdownWidget.aboutToBeHidden();

		return code;
	}

	public String getMarkdown() {
		return markdown;
	}
}
