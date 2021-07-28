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
 *    Obeo - initial API and implementation
 *
 */
package org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.provider;

import org.eclipse.emf.common.notify.Adapter;

public class PropertiesMarkupWidgetsItemProviderAdapterFactorySpec
		extends PropertiesMarkupWidgetsItemProviderAdapterFactory {

	@Override
	public Adapter createExtHTMLRendererDescriptionAdapter() {
		if (extHTMLRendererDescriptionItemProvider == null) {
			extHTMLRendererDescriptionItemProvider = new ExtHTMLRendererDescriptionItemProviderSpec(this);
		}

		return extHTMLRendererDescriptionItemProvider;
	}

	@Override
	public Adapter createExtMarkdownDescriptionAdapter() {
		if (extMarkdownDescriptionItemProvider == null) {
			extMarkdownDescriptionItemProvider = new ExtMarkdownDescriptionItemProviderSpec(this);
		}

		return extMarkdownDescriptionItemProvider;
	}
}
