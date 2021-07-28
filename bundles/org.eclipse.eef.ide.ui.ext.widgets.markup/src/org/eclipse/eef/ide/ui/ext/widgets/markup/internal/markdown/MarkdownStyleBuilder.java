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

import static java.util.stream.Collectors.toList;

import com.vladsch.flexmark.ast.BlockQuote;
import com.vladsch.flexmark.ast.BulletList;
import com.vladsch.flexmark.ast.BulletListItem;
import com.vladsch.flexmark.ast.Code;
import com.vladsch.flexmark.ast.Emphasis;
import com.vladsch.flexmark.ast.FencedCodeBlock;
import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.ast.Link;
import com.vladsch.flexmark.ast.ListBlock;
import com.vladsch.flexmark.ast.ListItem;
import com.vladsch.flexmark.ast.OrderedList;
import com.vladsch.flexmark.ast.OrderedListItem;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.StrongEmphasis;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ext.definition.DefinitionList;
import com.vladsch.flexmark.ext.definition.DefinitionTerm;
import com.vladsch.flexmark.ext.gfm.tasklist.TaskListItem;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.swt.custom.StyleRange;

/**
 * Builder of {@link StyleDescription} for a Markdown text.
 *
 * @author Arthur Daussy
 *
 */
public class MarkdownStyleBuilder {

	/**
	 * Comparator of {@link StyleRange} that order the style by appearance order.
	 */
	private static final Comparator<StyleRange> STYLE_CMP = new Comparator<StyleRange>() {

		@Override
		public int compare(StyleRange o1, StyleRange o2) {
			final int result;
			if (o1.start < o2.start) {
				result = -1;
			} else if (o1.start > o2.start) {
				result = 1;
			} else if (o1.length < o2.length) { // Same start put shorter first
				result = -1;
			} else if (o1.length > o2.length) {
				result = 1;
			} else {
				result = 0;
			}
			return result;
		}
	};

	/**
	 * A node visitor.
	 */
	private NodeVisitor visitor;

	/**
	 * Provider of style.
	 */
	private MarkodwnStyleFactory styleProvider;

	/**
	 * List of built styles.
	 */
	private List<StyleNode> styles;

	/**
	 * The current node being handled.
	 */
	private StyleNode currentNode;

	/**
	 * Simple constructor.
	 *
	 * @param styleProvider
	 *            the style provider (not <code>null</code>)
	 */
	public MarkdownStyleBuilder(MarkodwnStyleFactory styleProvider) {
		this.styleProvider = styleProvider;
		visitor = new NodeVisitor(new VisitHandler<>(Heading.class, this::visit), //
				new VisitHandler<>(StrongEmphasis.class, this::visit), //
				new VisitHandler<>(Emphasis.class, this::visit), //
				new VisitHandler<>(FencedCodeBlock.class, this::visit), //
				new VisitHandler<>(BlockQuote.class, this::visit), //
				new VisitHandler<>(BulletList.class, this::visit), //
				new VisitHandler<>(DefinitionList.class, this::visit), //
				new VisitHandler<>(OrderedList.class, this::visit), //
				new VisitHandler<>(BulletListItem.class, this::visit), //
				new VisitHandler<>(OrderedListItem.class, this::visit), //
				new VisitHandler<>(DefinitionTerm.class, this::visit), //
				new VisitHandler<>(Paragraph.class, this::visit), //
				new VisitHandler<>(TaskListItem.class, this::visit), //
				new VisitHandler<>(Text.class, this::visit), //
				new VisitHandler<>(Image.class, this::visit), //
				new VisitHandler<>(Link.class, this::visit), //
				new VisitHandler<>(Code.class, this::visit));
	}

	/**
	 * Check if 2 {@link StyleRange}s overlap.
	 *
	 * @param r1
	 *            {@link StyleRange} 1
	 * @param r2
	 *            {@link StyleRange} 1
	 * @return <code>true</code> if the definition overlap
	 */
	public static boolean overlap(StyleRange r1, StyleRange r2) {
		if (r1 == null || r2 == null) {
			return false;
		}
		int r1s = r1.start;
		int r2s = r2.start;
		int r1e = r1.start + r1.length;
		int r2e = r2.start + r2.length;

		return r2s < r1e && r1s < r2e;

	}

	/**
	 * Add a style to the list of built style.
	 *
	 * @param inputNode
	 *            the input node
	 * @param newStyle
	 *            a new style to be associated to this node (can be <code>null</code>)
	 * @param backGroundColor
	 *            a new {@link LineBackground} to be associated with this not (can be <code>null</code>)
	 */
	private void addStyle(Node inputNode, StyleRange newStyle, LineBackground backGroundColor) {
		StyleNode styleNode = new StyleNode(newStyle, backGroundColor, inputNode);
		if (currentNode != null) {
			currentNode.children.add(styleNode);
		} else {
			styles.add(styleNode);
		}
		StyleNode oldParent = currentNode;
		currentNode = styleNode;
		visitor.visitChildren(inputNode);
		currentNode = oldParent;
	}

	/**
	 * Visit a {@link ListBlock}.
	 *
	 * @param listBlock
	 *            a {@link ListBlock}
	 */
	private void visit(ListBlock listBlock) {
		addStyle(listBlock, null, null);
	}

	/**
	 * Visit a {@link ListItem}.
	 *
	 * @param listItem
	 *            a {@link ListItem}
	 */
	private void visit(ListItem listItem) {
		addStyle(listItem, styleProvider.buildListItemMarkerStyle(listItem.getStartOffset(), listItem.getOpeningMarker().length()), null);
	}

	/**
	 * Visit an {@link Image}.
	 *
	 * @param image
	 *            a {@link Image}
	 */
	private void visit(Image image) {
		addStyle(image, null, null);
	}

	/**
	 * Visit a {@link Heading}.
	 *
	 * @param heading
	 *            a {@link Heading}
	 */
	private void visit(Heading heading) {
		addStyle(heading, styleProvider.buildHeaderStyle(heading.getStartOffset(), heading.getTextLength(), heading.getLevel()), null);
	}

	/**
	 * Visit a {@link Text}.
	 *
	 * @param text
	 *            a {@link Text}
	 */
	private void visit(Text text) {
		if (currentNode != null && (currentNode.inputNode instanceof Link || currentNode.inputNode instanceof Image)) {
			addStyle(text, styleProvider.buildLinkLabelStyle(text.getStartOffset(), text.getTextLength()), null);
		} else {
			addStyle(text, null, null);
		}
	}

	/**
	 * Visit a {@link StrongEmphasis}.
	 *
	 * @param sEmphasis
	 *            a {@link StrongEmphasis}
	 */
	private void visit(StrongEmphasis sEmphasis) {
		addStyle(sEmphasis, styleProvider.buildBoldStyle(sEmphasis.getStartOffset(), sEmphasis.getTextLength()), null);
	}

	/**
	 * Visit an {@link Emphasis}.
	 *
	 * @param emphasis
	 *            a {@link Emphasis}
	 */
	private void visit(Emphasis emphasis) {
		addStyle(emphasis, styleProvider.buildItalicStyle(emphasis.getStartOffset(), emphasis.getTextLength()), null);
	}

	/**
	 * Visit a {@link Link}.
	 *
	 * @param link
	 *            a {@link Link}
	 */
	private void visit(Link link) {
		addStyle(link, styleProvider.buildLinkStyle(link.getStartOffset(), link.getTextLength()), null);
	}

	/**
	 * Visit a {@link Code}.
	 *
	 * @param code
	 *            a {@link Code}
	 */
	private void visit(Code code) {
		addStyle(code, styleProvider.buildCodeStyle(code.getStartOffset(), code.getTextLength()), null);
	}

	/**
	 * Visit a {@link FencedCodeBlock}.
	 *
	 * @param codeBlock
	 *            a {@link FencedCodeBlock}
	 */
	private void visit(FencedCodeBlock codeBlock) {
		addStyle(codeBlock, null, new LineBackground(codeBlock.getStartLineNumber(), codeBlock.getEndLineNumber(), styleProvider.getCodeColor()));
	}

	/**
	 * Visit a {@link Paragraph}.
	 *
	 * @param paragraph
	 *            a {@link Paragraph}
	 */
	private void visit(Paragraph paragraph) {
		addStyle(paragraph, null, null);
	}

	/**
	 * Visit a {@link BlockQuote}.
	 *
	 * @param quote
	 *            a {@link BlockQuote}
	 */
	private void visit(BlockQuote quote) {
		addStyle(quote, null, new LineBackground(quote.getStartLineNumber(), quote.getEndLineNumber(), styleProvider.getQuoteColor()));
	}

	/**
	 * Builds a {@link StyleDescription} for the given document. (Should not be called in parallel)
	 *
	 * @param doc
	 *            a document
	 * @return a {@link StyleDescription} for this document
	 */
	public StyleDescription buildStyles(Document doc) {

		if (doc == null) {
			return StyleDescription.EMPTY;
		}

		styles = new ArrayList<>();

		visitor.visit(doc);

		List<StyleRange> styleRanges = styles.stream().flatMap(s -> s.getStyles().stream()).collect(toList());
		List<LineBackground> lineBackGround = styles.stream().flatMap(s -> s.getBackgroundLine().stream()).collect(toList());
		Collections.sort(styleRanges, STYLE_CMP);
		return new StyleDescription(styleRanges, lineBackGround);
	}

	/**
	 * Node a style that match a {@link Node} from the AST.
	 *
	 * @author Arthur Daussy
	 *
	 */
	private static final class StyleNode {

		/**
		 * The style to be applied (can be <code>null</code>).
		 */
		private final StyleRange style;

		/**
		 * The color background to be applied (can be <code>null</code>).
		 */
		private final LineBackground lineBackgroundColor;

		/**
		 * List of children nodes.
		 */
		private final List<StyleNode> children = new ArrayList<>();

		/**
		 * AST node.
		 */
		private Node inputNode;

		/**
		 * Simple constructor.
		 *
		 * @param style
		 *            the style to be applied (can be <code>null</code>)
		 * @param lineBackgroundColor
		 *            the background color to be applied (can be <code>null</code>)
		 * @param inputNode
		 *            the AST node
		 */
		private StyleNode(StyleRange style, LineBackground lineBackgroundColor, Node inputNode) {
			super();
			this.style = style;
			this.lineBackgroundColor = lineBackgroundColor;
			this.inputNode = inputNode;
		}

		/**
		 * Copy the given style from into a new range.
		 *
		 * @param r1
		 *            style to copy
		 * @param start
		 *            starting index
		 * @param end
		 *            ending index
		 * @return a new {@link StyleRange}
		 */
		private StyleRange copy(StyleRange r1, int start, int end) {
			StyleRange newStyle = new StyleRange();
			newStyle.start = start;
			newStyle.length = end - start;
			newStyle.background = r1.background;
			newStyle.borderColor = r1.borderColor;
			newStyle.borderStyle = r1.borderStyle;
			newStyle.data = r1.data;
			newStyle.font = r1.font;
			newStyle.fontStyle = r1.fontStyle;
			newStyle.foreground = r1.foreground;
			newStyle.metrics = r1.metrics;
			newStyle.rise = r1.rise;
			newStyle.strikeout = r1.strikeout;
			newStyle.strikeoutColor = r1.strikeoutColor;
			newStyle.underline = r1.underline;
			newStyle.underlineColor = r1.underlineColor;
			newStyle.underlineStyle = r1.underlineStyle;
			return newStyle;
		}

		/**
		 * Merge two styles in a given range. If two styles have conflicting definition, then the child definition will
		 * be used.
		 *
		 * @param parent
		 *            the parent style
		 * @param child
		 *            the children style
		 * @param start
		 *            starting index
		 * @param end
		 *            ending index
		 * @return a new {@link StyleRange}
		 */
		private StyleRange merge(StyleRange parent, StyleRange child, int start, int end) {
			StyleRange newStyle = new StyleRange();
			newStyle.start = start;
			newStyle.length = end - start;

			if (child.background != null) {
				newStyle.background = child.background;
			} else {
				newStyle.background = parent.background;

			}
			if (child.borderColor != null) {
				newStyle.borderColor = child.borderColor;
			} else {
				newStyle.borderColor = parent.borderColor;
			}

			newStyle.borderStyle = parent.borderStyle | child.borderStyle;

			if (child.data != null) {
				newStyle.data = child.data;
			} else {
				newStyle.data = parent.data;
			}
			if (child.font != null) {
				newStyle.font = child.font;
			} else {
				newStyle.font = parent.font;
			}
			newStyle.fontStyle = parent.fontStyle | child.fontStyle;

			if (child.foreground != null) {
				newStyle.foreground = child.foreground;
			} else {
				newStyle.foreground = parent.foreground;
			}
			if (child.metrics != null) {
				newStyle.metrics = child.metrics;
			} else {
				newStyle.metrics = parent.metrics;
			}

			if (child.rise != 0) {
				newStyle.rise = child.rise;
			} else {
				newStyle.rise = parent.rise;
			}

			newStyle.strikeout = parent.strikeout || parent.strikeout;

			if (child.strikeoutColor != null) {
				newStyle.strikeoutColor = child.strikeoutColor;
			} else {
				newStyle.strikeoutColor = parent.strikeoutColor;
			}
			newStyle.underline = parent.underline || child.underline;
			if (child.underlineColor != null) {
				newStyle.underlineColor = child.underlineColor;
			} else {
				newStyle.underlineColor = parent.underlineColor;
			}
			newStyle.underlineStyle = parent.underlineStyle | child.underlineStyle;

			return newStyle;
		}

		/**
		 * Gets the list of background color for this node. If a background definition is defined for this node, the
		 * children background definitions are discarded.
		 *
		 * @return a list
		 */
		public List<LineBackground> getBackgroundLine() {
			if (lineBackgroundColor != null) {
				return Collections.singletonList(lineBackgroundColor);
			} else {
				return children.stream().flatMap(c -> c.getBackgroundLine().stream()).collect(toList());
			}
		}

		/**
		 * Get all the styles for this node and all its children.
		 *
		 * @return a list of style
		 */
		public List<StyleRange> getStyles() {

			final List<StyleRange> result;
			if (children.isEmpty()) {
				if (style != null) {
					result = Collections.singletonList(style);
				} else {
					result = Collections.emptyList();
				}
			} else if (style == null) {
				result = children.stream().flatMap(c -> c.getStyles().stream()).collect(toList());
			} else {
				result = doMergeWithChildren();
			}
			return result;
		}

		/**
		 * Do merge this non null style with the children styles.
		 *
		 * @return a list of style
		 */
		private List<StyleRange> doMergeWithChildren() {
			List<StyleRange> styles = new ArrayList<StyleRange>();
			StyleRange currentStyle = style;

			// Merge all children style with this style
			for (StyleNode child : children) {
				for (StyleRange childStyle : child.getStyles()) {

					if (currentStyle == null) {
						styles.add(childStyle);
					} else {
						if (overlap(style, childStyle)) {

							int parentStyleStart = currentStyle.start;
							int parentStyleEnd = parentStyleStart + currentStyle.length;

							int childStart = childStyle.start;
							int childEnd = childStart + childStyle.length;

							if (childStart > parentStyleStart) {
								StyleRange fistStyle = copy(currentStyle, parentStyleStart, childStart);
								styles.add(fistStyle);
							}

							int mergeEnd = Math.min(parentStyleEnd, childEnd);
							StyleRange secondStyle = merge(currentStyle, childStyle, childStart, mergeEnd);
							styles.add(secondStyle);

							if (mergeEnd < parentStyleEnd) {
								StyleRange thirdStyle = copy(currentStyle, mergeEnd, parentStyleEnd);
								currentStyle = thirdStyle;
							} else {
								currentStyle = null;
							}

						} else {
							styles.add(childStyle);
						}
					}

				}
			}

			if (currentStyle != null) {
				styles.add(currentStyle);
			}

			return styles;
		}

	}

}
