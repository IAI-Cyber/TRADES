/**
 *  Copyright (c) Obeo, Eclipse contributors and others 2021.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *     Obeo and Israel Aerospace Industries - initial API and implementation
 * 
 */
package org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.sirius.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsFactory
 * @model kind="package"
 * @generated
 */
public interface PropertiesMarkupWidgetsPackage extends EPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String copyright = " Copyright (c) Obeo, Eclipse contributors and others 2021.\n This program and the accompanying materials\n are made available under the terms of the Eclipse Public License 2.0\n which accompanies this distribution, and is available at\n https://www.eclipse.org/legal/epl-2.0/\n\n SPDX-License-Identifier: EPL-2.0\n\n Contributors:\n    Obeo and Israel Aerospace Industries - initial API and implementation\n";

    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "PropertiesMarkupWidgets";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.eclipse.org/sirius/properties/1.0.0/ext/widgets/markupWidgets";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "PropertiesMarkupWidgets";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PropertiesMarkupWidgetsPackage eINSTANCE = org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.PropertiesMarkupWidgetsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtHTMLRendererDescriptionImpl <em>Ext HTML Renderer Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtHTMLRendererDescriptionImpl
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.PropertiesMarkupWidgetsPackageImpl#getExtHTMLRendererDescription()
     * @generated
     */
    int EXT_HTML_RENDERER_DESCRIPTION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__NAME = PropertiesPackage.WIDGET_DESCRIPTION__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__LABEL = PropertiesPackage.WIDGET_DESCRIPTION__LABEL;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__DOCUMENTATION = PropertiesPackage.WIDGET_DESCRIPTION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Label Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Help Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>To Html Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Value Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Number Of Lines</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINES = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Initial Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Edition Tool Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Css Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Ext HTML Renderer Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_HTML_RENDERER_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 9;

    /**
     * The meta object id for the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl <em>Ext Markdown Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.PropertiesMarkupWidgetsPackageImpl#getExtMarkdownDescription()
     * @generated
     */
    int EXT_MARKDOWN_DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION__NAME = PropertiesPackage.WIDGET_DESCRIPTION__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION__LABEL = PropertiesPackage.WIDGET_DESCRIPTION__LABEL;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION__DOCUMENTATION = PropertiesPackage.WIDGET_DESCRIPTION__DOCUMENTATION;

    /**
     * The feature id for the '<em><b>Label Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION__LABEL_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Help Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION__HELP_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION__IS_ENABLED_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION__VALUE_EXPRESSION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Number Of Lines</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION__NUMBER_OF_LINES = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Initial Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Ext Markdown Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_MARKDOWN_DESCRIPTION_FEATURE_COUNT = PropertiesPackage.WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

    /**
     * Returns the meta object for class '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription <em>Ext HTML Renderer Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ext HTML Renderer Description</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription
     * @generated
     */
    EClass getExtHTMLRendererDescription();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getToHtmlExpression <em>To Html Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To Html Expression</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getToHtmlExpression()
     * @see #getExtHTMLRendererDescription()
     * @generated
     */
    EAttribute getExtHTMLRendererDescription_ToHtmlExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getValueExpression <em>Value Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value Expression</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getValueExpression()
     * @see #getExtHTMLRendererDescription()
     * @generated
     */
    EAttribute getExtHTMLRendererDescription_ValueExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getNumberOfLines <em>Number Of Lines</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number Of Lines</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getNumberOfLines()
     * @see #getExtHTMLRendererDescription()
     * @generated
     */
    EAttribute getExtHTMLRendererDescription_NumberOfLines();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getInitialOperation <em>Initial Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Initial Operation</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getInitialOperation()
     * @see #getExtHTMLRendererDescription()
     * @generated
     */
    EReference getExtHTMLRendererDescription_InitialOperation();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getEditionToolExpression <em>Edition Tool Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Edition Tool Expression</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getEditionToolExpression()
     * @see #getExtHTMLRendererDescription()
     * @generated
     */
    EAttribute getExtHTMLRendererDescription_EditionToolExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getCssExpression <em>Css Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Css Expression</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getCssExpression()
     * @see #getExtHTMLRendererDescription()
     * @generated
     */
    EAttribute getExtHTMLRendererDescription_CssExpression();

    /**
     * Returns the meta object for class '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription <em>Ext Markdown Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ext Markdown Description</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription
     * @generated
     */
    EClass getExtMarkdownDescription();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription#getValueExpression <em>Value Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value Expression</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription#getValueExpression()
     * @see #getExtMarkdownDescription()
     * @generated
     */
    EAttribute getExtMarkdownDescription_ValueExpression();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription#getNumberOfLines <em>Number Of Lines</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number Of Lines</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription#getNumberOfLines()
     * @see #getExtMarkdownDescription()
     * @generated
     */
    EAttribute getExtMarkdownDescription_NumberOfLines();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription#getInitialOperation <em>Initial Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Initial Operation</em>'.
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription#getInitialOperation()
     * @see #getExtMarkdownDescription()
     * @generated
     */
    EReference getExtMarkdownDescription_InitialOperation();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PropertiesMarkupWidgetsFactory getPropertiesMarkupWidgetsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtHTMLRendererDescriptionImpl <em>Ext HTML Renderer Description</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtHTMLRendererDescriptionImpl
         * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.PropertiesMarkupWidgetsPackageImpl#getExtHTMLRendererDescription()
         * @generated
         */
        EClass EXT_HTML_RENDERER_DESCRIPTION = eINSTANCE.getExtHTMLRendererDescription();

        /**
         * The meta object literal for the '<em><b>To Html Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION = eINSTANCE.getExtHTMLRendererDescription_ToHtmlExpression();

        /**
         * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getExtHTMLRendererDescription_ValueExpression();

        /**
         * The meta object literal for the '<em><b>Number Of Lines</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINES = eINSTANCE.getExtHTMLRendererDescription_NumberOfLines();

        /**
         * The meta object literal for the '<em><b>Initial Operation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXT_HTML_RENDERER_DESCRIPTION__INITIAL_OPERATION = eINSTANCE.getExtHTMLRendererDescription_InitialOperation();

        /**
         * The meta object literal for the '<em><b>Edition Tool Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION = eINSTANCE.getExtHTMLRendererDescription_EditionToolExpression();

        /**
         * The meta object literal for the '<em><b>Css Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION = eINSTANCE.getExtHTMLRendererDescription_CssExpression();

        /**
         * The meta object literal for the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl <em>Ext Markdown Description</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl
         * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.PropertiesMarkupWidgetsPackageImpl#getExtMarkdownDescription()
         * @generated
         */
        EClass EXT_MARKDOWN_DESCRIPTION = eINSTANCE.getExtMarkdownDescription();

        /**
         * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXT_MARKDOWN_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getExtMarkdownDescription_ValueExpression();

        /**
         * The meta object literal for the '<em><b>Number Of Lines</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXT_MARKDOWN_DESCRIPTION__NUMBER_OF_LINES = eINSTANCE.getExtMarkdownDescription_NumberOfLines();

        /**
         * The meta object literal for the '<em><b>Initial Operation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION = eINSTANCE.getExtMarkdownDescription_InitialOperation();

    }

} //PropertiesMarkupWidgetsPackage
