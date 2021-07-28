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

package org.eclipse.eef.ide.ui.ext.widgets.markup.markdown;

import org.eclipse.eef.ide.ui.ext.widgets.markup.internal.markdown.FlexmarkUtil;
import org.eclipse.eef.ide.ui.ext.widgets.markup.internal.markdown.MarkdownEditDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.ui.PlatformUI;

/**
 * Service that gather methods to handle Markdown text.
 *
 * @author Arthur Daussy
 *
 */
public final class MarkdownService {

	/**
	 * Empty.
	 */
	private static final String EMPTY = ""; //$NON-NLS-1$

	/**
	 * Private constructor.
	 */
	private MarkdownService() {
	}

	/**
	 * Transform a Markdown text into a HTML body.
	 *
	 * @param markdown
	 *            Markdown content
	 * @return a String
	 */
	public static String markdownToHTMLBody(String markdown) {
		if (markdown == null) {
			return EMPTY;
		}
		return FlexmarkUtil.builFlexdRenderer().render(FlexmarkUtil.builFlexParser().parse(markdown));
	}

	/**
	 * Call the edition tool for editing a Markdown text.
	 *
	 * @param markdown
	 *            a Markdown text
	 * @param multiLine
	 *            holds <code>true</code> if the widget should handle multiline
	 * @return a new value
	 */
	public static String editMarkdownExpression(String markdown, boolean multiLine) {

		final String initialContent;
		if (markdown != null) {
			initialContent = markdown;
		} else {
			initialContent = EMPTY;
		}

		MarkdownEditDialog markdownEditDialog = new MarkdownEditDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), multiLine,
				initialContent);
		if (markdownEditDialog.open() == IDialogConstants.OK_ID) {
			return markdownEditDialog.getMarkdown();
		} else {
			return markdown;
		}

	}

}
