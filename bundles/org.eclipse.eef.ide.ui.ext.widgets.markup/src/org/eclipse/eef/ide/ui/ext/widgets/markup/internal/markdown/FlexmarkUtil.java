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

import com.vladsch.flexmark.ext.abbreviation.AbbreviationExtension;
import com.vladsch.flexmark.ext.admonition.AdmonitionExtension;
import com.vladsch.flexmark.ext.definition.DefinitionExtension;
import com.vladsch.flexmark.ext.emoji.EmojiExtension;
import com.vladsch.flexmark.ext.emoji.EmojiImageType;
import com.vladsch.flexmark.ext.emoji.EmojiShortcutType;
import com.vladsch.flexmark.ext.enumerated.reference.EnumeratedReferenceExtension;
import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughExtension;
import com.vladsch.flexmark.ext.gfm.tasklist.TaskListExtension;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.ext.typographic.TypographicExtension;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.data.MutableDataSet;

import java.util.Arrays;

/**
 * Flexmark util methods.
 *
 * @author Arthur Daussy
 *
 */
public final class FlexmarkUtil {

	/**
	 * Default options.
	 */
	private static final MutableDataSet FLEX_OPTIONS = new MutableDataSet()
			.set(Parser.EXTENSIONS, Arrays.asList(AbbreviationExtension.create(), EnumeratedReferenceExtension.create(), //
					EmojiExtension.create(), //
					TypographicExtension.create(), //
					AdmonitionExtension.create(), //
					TaskListExtension.create(), //
					DefinitionExtension.create(), //
					StrikethroughExtension.create(), //
					TablesExtension.create()))
			.set(TablesExtension.WITH_CAPTION, Boolean.FALSE)//
			.set(TablesExtension.COLUMN_SPANS, Boolean.FALSE)//
			.set(TablesExtension.MIN_HEADER_ROWS, Integer.valueOf(1))//
			.set(TablesExtension.MAX_HEADER_ROWS, Integer.valueOf(1))//
			.set(TablesExtension.APPEND_MISSING_COLUMNS, Boolean.TRUE)//
			.set(TablesExtension.DISCARD_EXTRA_COLUMNS, Boolean.TRUE)//
			.set(TablesExtension.HEADER_SEPARATOR_COLUMN_MATCH, Boolean.TRUE)//
			.set(EmojiExtension.USE_SHORTCUT_TYPE, EmojiShortcutType.GITHUB)//
			.set(EmojiExtension.USE_IMAGE_TYPE, EmojiImageType.IMAGE_ONLY);

	/**
	 * Private constructor.
	 */
	private FlexmarkUtil() {
	}

	/**
	 * Creates a FlexMark parser.
	 *
	 * @return a new parser with default option
	 */
	public static Parser builFlexParser() {
		return Parser.builder(FLEX_OPTIONS).build();
	}

	/**
	 * Builds a Flexmark HTML renderer.
	 *
	 * @return a new renderer
	 */
	public static HtmlRenderer builFlexdRenderer() {
		return HtmlRenderer.builder(FLEX_OPTIONS).build();
	}
}
