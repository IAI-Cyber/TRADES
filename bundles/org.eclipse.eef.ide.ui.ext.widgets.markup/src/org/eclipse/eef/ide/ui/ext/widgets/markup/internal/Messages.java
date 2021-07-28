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

package org.eclipse.eef.ide.ui.ext.widgets.markup.internal;

import org.eclipse.eef.common.api.utils.I18N;
import org.eclipse.eef.common.api.utils.I18N.TranslatableMessage;
import org.eclipse.eef.ide.ui.ext.widgets.markup.EEFExtMarkupUIPlugin;
import org.eclipse.osgi.util.NLS;

/**
 * Utility class used for the internationalization.
 *
 * @author Arthur Daussy
 */
public final class Messages extends NLS {
	// CHECKSTYLE:OFF
	@TranslatableMessage
	public static String HTMLLifeCycleManager_Error_UnableToOpenURLInBrowser;
	@TranslatableMessage
	public static String HTMLLifeCycleManager_Warning_InvalidURL;
	@TranslatableMessage
	public static String MarkdownEditDialog_DialogTitle;
	@TranslatableMessage
	public static String MarkdownWidget_Exception_ProblemWhileUpdateStyles;

	static {
		I18N.initializeMessages(Messages.class, EEFExtMarkupUIPlugin.INSTANCE);
	}

	private Messages() {
	}
}
