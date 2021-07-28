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
package org.eclipse.sirius.editor.properties.ext.widgets.markup.internal.html;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.filters.common.ViewpointPropertyFilter;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage;

/**
 * Property filter for "to HTML" feature of the HTML renderer widget description.
 * 
 * @author Arthur Daussy
 *
 */
public class ExtHTMLRendererDescriptionToHTMLExpressionFilter extends ViewpointPropertyFilter {

    @Override
    protected EStructuralFeature getFeature() {
        return PropertiesMarkupWidgetsPackage.eINSTANCE.getExtHTMLRendererDescription_ToHtmlExpression();
    }

    @Override
    protected boolean isRightInputType(Object arg0) {
        return arg0 instanceof ExtHTMLRendererDescription;
    }

}
