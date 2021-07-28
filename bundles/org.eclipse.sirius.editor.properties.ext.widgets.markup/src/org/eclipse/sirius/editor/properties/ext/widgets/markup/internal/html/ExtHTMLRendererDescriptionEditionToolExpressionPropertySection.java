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
import org.eclipse.sirius.editor.editorPlugin.SiriusEditor;
import org.eclipse.sirius.editor.properties.ext.widgets.markup.internal.Messages;
import org.eclipse.sirius.editor.properties.sections.common.AbstractTextWithButtonPropertySection;
import org.eclipse.sirius.editor.tools.api.assist.TypeContentProposalProvider;
import org.eclipse.sirius.editor.tools.internal.presentation.TextWithContentProposalDialog;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * Property section for "edition tool expression" feature of the HTML renderer widget description.
 * 
 * @author Arthur Daussy
 *
 */
@SuppressWarnings("restriction")
public class ExtHTMLRendererDescriptionEditionToolExpressionPropertySection extends AbstractTextWithButtonPropertySection {

    @Override
    protected String getDefaultLabelText() {
        return Messages.ExtHTMLRendererDescriptionEditionToolExpressionPropertySection_DefaultLabel;
    }

    @Override
    protected String getToolTipText() {
        return Messages.ExtHTMLRendererDescriptionEditionToolExpressionPropertySection_Tooltip;
    }

    @Override
    protected String getLabelText() {
        return super.getLabelText() + ":"; //$NON-NLS-1$
    }

    @Override
    public EAttribute getFeature() {
        return PropertiesMarkupWidgetsPackage.eINSTANCE.getExtHTMLRendererDescription_EditionToolExpression();
    }

    @Override
    protected Object getFeatureValue(String newText) {
        return newText;
    }

    @Override
    protected boolean isEqual(String newText) {
        return this.getFeatureAsText().equals(newText);
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
        text.setBackground(SiriusEditor.getColorRegistry().get("yellow")); //$NON-NLS-1$
        TypeContentProposalProvider.bindPluginsCompletionProcessors(this, text);
    }

    @Override
    protected SelectionListener createButtonListener() {
        return new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                TextWithContentProposalDialog dialog = new TextWithContentProposalDialog(composite.getShell(), ExtHTMLRendererDescriptionEditionToolExpressionPropertySection.this, text.getText());
                dialog.open();
                text.setText(dialog.getResult());
                handleTextModified();
            }
        };
    }

    @Override
    protected String getPropertyDescription() {
        return ""; //$NON-NLS-1$
    }

}
