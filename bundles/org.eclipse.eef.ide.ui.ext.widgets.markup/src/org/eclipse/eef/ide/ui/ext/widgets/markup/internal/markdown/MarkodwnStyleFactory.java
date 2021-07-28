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

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * Style factory for Markdown content.
 *
 * @author Arthur Daussy
 *
 */
public class MarkodwnStyleFactory {

	/**
	 * Header color.
	 *
	 * <p>
	 * Package visibility for testing purpose
	 * </p>
	 */
	static final RGB HEADER_RGB = new RGB(128, 0, 0);

	/**
	 * Link color.
	 *
	 * <p>
	 * Package visibility for testing purpose
	 * </p>
	 */
	static final RGB LINK_LABEL_HEADER = new RGB(163, 21, 21);

	/**
	 * Underline color.
	 */
	private static final RGB UNDERLINE_COLOR = new RGB(0, 0, 161);

	/**
	 * Quote color.
	 */
	private static final RGB QUOTE_COLOR = new RGB(245, 220, 152);

	/**
	 * Color color.
	 */
	private static final RGB CODE_COLOR = new RGB(235, 235, 235);

	/**
	 * List item color.
	 */
	private static final RGB LIST_ITEM_COLOR = new RGB(4, 81, 165);

	/**
	 * Color id.
	 */
	private static final String LIST_ITEM_MARKER = "ListItemMarker"; //$NON-NLS-1$
	/**
	 * Color id.
	 */
	private static final String LINK_LABEL = "LinkLabel"; //$NON-NLS-1$
	/**
	 * Color id.
	 */
	private static final String UNDERLINE = "Underline"; //$NON-NLS-1$
	/**
	 * Color id.
	 */
	private static final String QUOTE = "Quote"; //$NON-NLS-1$
	/**
	 * Color id.
	 */
	private static final String CODE = "Code"; //$NON-NLS-1$
	/**
	 * Color id.
	 */
	private static final String H = "Header"; //$NON-NLS-1$

	/**
	 * Color registry.
	 */
	private ColorRegistry colorRegistry;

	/**
	 * Simple constructor.
	 *
	 * @param display
	 *            a display
	 */
	public MarkodwnStyleFactory(Display display) {
		colorRegistry = new ColorRegistry(display, true);
		init();
	}

	/**
	 * Initialize the color.
	 */
	private void init() {
		colorRegistry.put(LINK_LABEL, LINK_LABEL_HEADER);
		colorRegistry.put(H, HEADER_RGB);
		colorRegistry.put(LIST_ITEM_MARKER, LIST_ITEM_COLOR);
		colorRegistry.put(CODE, CODE_COLOR);
		colorRegistry.put(QUOTE, QUOTE_COLOR);
		colorRegistry.put(UNDERLINE, UNDERLINE_COLOR);

	}

	/**
	 * Builds a style of a header type.
	 *
	 * @param start
	 *            starting index
	 * @param length
	 *            length of the text
	 * @param level
	 *            header level
	 * @return a new StyleRange
	 */
	public StyleRange buildHeaderStyle(int start, int length, int level) {
		return new StyleRange(start, length, getHeadingColor(), null);
	}

	/**
	 * Builds a style of a link label type.
	 *
	 * @param start
	 *            starting index
	 * @param length
	 *            length of the text
	 * @return a new StyleRange
	 */
	public StyleRange buildLinkLabelStyle(int start, int length) {
		return new StyleRange(start, length, colorRegistry.get(LINK_LABEL), null);
	}

	/**
	 * Builds a style of a bold text type.
	 *
	 * @param start
	 *            starting index
	 * @param length
	 *            length of the text
	 * @return a new StyleRange
	 */
	public StyleRange buildBoldStyle(int start, int length) {
		return new StyleRange(start, length, null, null, SWT.BOLD);
	}

	/**
	 * Builds a style of a list item text type.
	 *
	 * @param start
	 *            starting index
	 * @param length
	 *            length of the text
	 * @return a new StyleRange
	 */
	public StyleRange buildListItemMarkerStyle(int start, int length) {
		return new StyleRange(start, length, colorRegistry.get(LIST_ITEM_MARKER), null, SWT.BOLD);
	}

	/**
	 * Builds a style of a italic text type.
	 *
	 * @param start
	 *            starting index
	 * @param length
	 *            length of the text
	 * @return a new StyleRange
	 */
	public StyleRange buildItalicStyle(int start, int length) {
		return new StyleRange(start, length, null, null, SWT.ITALIC);
	}

	/**
	 * Builds a style of a link text type.
	 *
	 * @param start
	 *            starting index
	 * @param length
	 *            length of the text
	 * @return a new StyleRange
	 */
	public StyleRange buildLinkStyle(int start, int length) {
		StyleRange styleRange = new StyleRange(start, length, colorRegistry.get(UNDERLINE), null, SWT.UNDERLINE_SINGLE);
		styleRange.underline = true;
		return styleRange;
	}

	/**
	 * Builds a style of a inline code text type.
	 *
	 * @param start
	 *            starting index
	 * @param length
	 *            length of the text
	 * @return a new StyleRange
	 */
	public StyleRange buildCodeStyle(int start, int length) {
		return new StyleRange(start, length, null, getCodeColor());
	}

	public Color getCodeColor() {
		return colorRegistry.get(CODE);
	}

	/**
	 * Builds a style of a quote text type.
	 *
	 * @param start
	 *            starting index
	 * @param length
	 *            length of the text
	 * @return a new StyleRange
	 */
	public StyleRange buildQuoteStyle(int start, int length) {
		return new StyleRange(start, length, null, getQuoteColor());
	}

	public Color getHeadingColor() {
		return colorRegistry.get(H);
	}

	public Color getQuoteColor() {
		return colorRegistry.get(QUOTE);
	}

}
