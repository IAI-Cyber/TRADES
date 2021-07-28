/**
 * Copyright (c) Obeo, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo and Israel Aerospace Industries - initial API and implementation
 *
 */
package org.eclipse.sirius.editor.properties.ext.widgets.markup.internal;

import org.eclipse.osgi.util.NLS;
import org.eclipse.sirius.editor.properties.ext.widgets.markup.SiriusEditorPropertiesExtWidgetsMarkupPlugin;
import org.eclipse.sirius.ext.base.I18N;
import org.eclipse.sirius.ext.base.I18N.TranslatableMessage;

/**
 * Helper class to obtains translated strings.
 * 
 * @author Arthur Daussy
 *
 */
public final class Messages extends NLS {

    // CHECKSTYLE:OFF
    static {
        I18N.initializeMessages(Messages.class, SiriusEditorPropertiesExtWidgetsMarkupPlugin.INSTANCE);
    }

    @TranslatableMessage
    public static String ExtHTMLRendererDescriptionCSSExpressionPropertySection_DefaultLabel;

    @TranslatableMessage
    public static String ExtHTMLRendererDescriptionCSSExpressionPropertySection_Tooltip;

    @TranslatableMessage
    public static String ExtHTMLRendererDescriptionEditionToolExpressionPropertySection_DefaultLabel;

    @TranslatableMessage
    public static String ExtHTMLRendererDescriptionEditionToolExpressionPropertySection_Tooltip;

    @TranslatableMessage
    public static String ExtHTMLRendererDescriptionNumberOfLinePropertySection_DefaultLabelText;

    @TranslatableMessage
    public static String ExtHTMLRendererDescriptionToHTMLExpressionPropertySection_DefaultLabel;

    @TranslatableMessage
    public static String ExtHTMLRendererDescriptionToHTMLExpressionPropertySection_Tooltip;

    @TranslatableMessage
    public static String ExtHTMLRendererDescriptionValueExpressionPropertySection_DefaultLabel;

    @TranslatableMessage
    public static String ExtHTMLRendererDescriptionValueExpressionPropertySection_Tooltip;

    @TranslatableMessage
    public static String ExtMarkdownDescriptionNumberOfLinePropertySection_Label_NbLine;

    @TranslatableMessage
    public static String ExtMarkdownDescriptionValueExpressionPropertySection_DefaultLabel;

    @TranslatableMessage
    public static String ExtMarkdownDescriptionValueExpressionPropertySection_Tooltip;

    private Messages() {
    }

    // CHECKSTYLE:ON
}
