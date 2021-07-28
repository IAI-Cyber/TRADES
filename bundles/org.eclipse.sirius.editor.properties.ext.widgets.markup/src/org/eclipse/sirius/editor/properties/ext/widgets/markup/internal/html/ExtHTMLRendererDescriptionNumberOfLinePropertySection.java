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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.editor.properties.ext.widgets.markup.internal.Messages;
import org.eclipse.sirius.editor.properties.sections.common.AbstractSpinnerPropertySection;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage;

/**
 * Property section for "number of line" feature of the HTML renderer widget description.
 * 
 * @author Arthur Daussy
 *
 */
public class ExtHTMLRendererDescriptionNumberOfLinePropertySection extends AbstractSpinnerPropertySection {

    @Override
    protected boolean isEqual(String newText) {
        boolean equal = true;
        if (toInteger(newText) != null) {
            equal = getFeatureAsText().equals(toInteger(newText).toString());
        } else {
            refresh();
        }
        return equal;
    }

    @Override
    protected EAttribute getFeature() {
        return PropertiesMarkupWidgetsPackage.eINSTANCE.getExtHTMLRendererDescription_NumberOfLines();
    }

    @Override
    protected Object getFeatureValue(String newText) {
        return toInteger(newText);
    }

    /**
     * Converts the given text to the integer it represents if applicable.
     *
     * @return The integer the given text represents if applicable, <code>null</code> otherwise.
     */
    private Integer toInteger(String text) {
        Integer integerValue = null;
        try {
            integerValue = Integer.valueOf(text);
        } catch (NumberFormatException e) {
            // Not a Integer
        }
        return integerValue;
    }

    @Override
    protected String getDefaultLabelText() {
        return Messages.ExtHTMLRendererDescriptionNumberOfLinePropertySection_DefaultLabelText;
    }

}
