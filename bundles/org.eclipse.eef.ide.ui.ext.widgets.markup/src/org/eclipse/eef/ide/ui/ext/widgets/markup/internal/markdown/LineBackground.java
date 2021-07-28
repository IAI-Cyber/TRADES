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

import org.eclipse.swt.graphics.Color;

/**
 * Description of line background color.
 *
 * @author Arthur Daussy
 *
 */
public class LineBackground {

	/**
	 * Start line number.
	 */
	private final int startLine;

	/**
	 * End line number.
	 */
	private final int endLine;

	/**
	 * The color to be applied.
	 */
	private final Color color;

	/***
	 * Simple constructor.
	 *
	 * @param startLine
	 *            start line number
	 * @param endLine
	 *            end line number
	 * @param color
	 *            the color to apply on the background
	 */
	public LineBackground(int startLine, int endLine, Color color) {
		super();
		this.startLine = startLine;
		this.endLine = endLine;
		this.color = color;
	}

	public int getStartLine() {
		return startLine;
	}

	public int getEndLine() {
		return endLine;
	}

	public Color getColor() {
		return color;
	}
}