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

package org.eclipse.sirius.ui.properties.ext.widgets.markup.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.properties.core.api.PreconfiguredPreprocessor;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage;

public class ExtHTMLRendererDescriptionPreprocessor extends PreconfiguredPreprocessor<ExtHTMLRendererDescription> {

	public ExtHTMLRendererDescriptionPreprocessor() {
		super(ExtHTMLRendererDescription.class,
				PropertiesMarkupWidgetsPackage.eINSTANCE.getExtHTMLRendererDescription());
	}

	@Override
	public boolean canHandle(EObject description) {
		return description instanceof ExtHTMLRendererDescription;
	}
}
