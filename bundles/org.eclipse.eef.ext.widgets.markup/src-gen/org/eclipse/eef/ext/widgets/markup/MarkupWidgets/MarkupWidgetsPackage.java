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
package org.eclipse.eef.ext.widgets.markup.MarkupWidgets;

import org.eclipse.eef.EefPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsFactory
 * @model kind="package"
 * @generated
 */
public interface MarkupWidgetsPackage extends EPackage {
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
	String eNAME = "MarkupWidgets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/eef/ext/widgets/eef-markup-widgets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EefHTMLRenderer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MarkupWidgetsPackage eINSTANCE = org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.MarkupWidgetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl <em>EEF Ext HTML Renderer Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.MarkupWidgetsPackageImpl#getEEFExtHTMLRendererDescription()
	 * @generated
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>To Html Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Edition Tool Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Css Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EEF Ext HTML Renderer Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_HTML_RENDERER_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtMarkdownWidgetImpl <em>EEF Ext Markdown Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtMarkdownWidgetImpl
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.MarkupWidgetsPackageImpl#getEEFExtMarkdownWidget()
	 * @generated
	 */
	int EEF_EXT_MARKDOWN_WIDGET = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_MARKDOWN_WIDGET__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_MARKDOWN_WIDGET__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_MARKDOWN_WIDGET__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_MARKDOWN_WIDGET__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_MARKDOWN_WIDGET__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_MARKDOWN_WIDGET__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_MARKDOWN_WIDGET__NUMBER_OF_LINE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_MARKDOWN_WIDGET__EDIT_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Ext Markdown Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_MARKDOWN_WIDGET_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription <em>EEF Ext HTML Renderer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Ext HTML Renderer Description</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription
	 * @generated
	 */
	EClass getEEFExtHTMLRendererDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getToHtmlExpression <em>To Html Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Html Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getToHtmlExpression()
	 * @see #getEEFExtHTMLRendererDescription()
	 * @generated
	 */
	EAttribute getEEFExtHTMLRendererDescription_ToHtmlExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getValueExpression()
	 * @see #getEEFExtHTMLRendererDescription()
	 * @generated
	 */
	EAttribute getEEFExtHTMLRendererDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getNumberOfLine <em>Number Of Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Line</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getNumberOfLine()
	 * @see #getEEFExtHTMLRendererDescription()
	 * @generated
	 */
	EAttribute getEEFExtHTMLRendererDescription_NumberOfLine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getEditExpression()
	 * @see #getEEFExtHTMLRendererDescription()
	 * @generated
	 */
	EAttribute getEEFExtHTMLRendererDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getEditionToolExpression <em>Edition Tool Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Tool Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getEditionToolExpression()
	 * @see #getEEFExtHTMLRendererDescription()
	 * @generated
	 */
	EAttribute getEEFExtHTMLRendererDescription_EditionToolExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getCssExpression <em>Css Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getCssExpression()
	 * @see #getEEFExtHTMLRendererDescription()
	 * @generated
	 */
	EAttribute getEEFExtHTMLRendererDescription_CssExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget <em>EEF Ext Markdown Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Ext Markdown Widget</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget
	 * @generated
	 */
	EClass getEEFExtMarkdownWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget#getValueExpression()
	 * @see #getEEFExtMarkdownWidget()
	 * @generated
	 */
	EAttribute getEEFExtMarkdownWidget_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget#getNumberOfLine <em>Number Of Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Line</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget#getNumberOfLine()
	 * @see #getEEFExtMarkdownWidget()
	 * @generated
	 */
	EAttribute getEEFExtMarkdownWidget_NumberOfLine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget#getEditExpression()
	 * @see #getEEFExtMarkdownWidget()
	 * @generated
	 */
	EAttribute getEEFExtMarkdownWidget_EditExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarkupWidgetsFactory getMarkupWidgetsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl <em>EEF Ext HTML Renderer Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl
		 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.MarkupWidgetsPackageImpl#getEEFExtHTMLRendererDescription()
		 * @generated
		 */
		EClass EEF_EXT_HTML_RENDERER_DESCRIPTION = eINSTANCE.getEEFExtHTMLRendererDescription();

		/**
		 * The meta object literal for the '<em><b>To Html Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION = eINSTANCE.getEEFExtHTMLRendererDescription_ToHtmlExpression();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFExtHTMLRendererDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Number Of Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE = eINSTANCE.getEEFExtHTMLRendererDescription_NumberOfLine();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE.getEEFExtHTMLRendererDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Edition Tool Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION = eINSTANCE.getEEFExtHTMLRendererDescription_EditionToolExpression();

		/**
		 * The meta object literal for the '<em><b>Css Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION = eINSTANCE.getEEFExtHTMLRendererDescription_CssExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtMarkdownWidgetImpl <em>EEF Ext Markdown Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtMarkdownWidgetImpl
		 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.MarkupWidgetsPackageImpl#getEEFExtMarkdownWidget()
		 * @generated
		 */
		EClass EEF_EXT_MARKDOWN_WIDGET = eINSTANCE.getEEFExtMarkdownWidget();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_MARKDOWN_WIDGET__VALUE_EXPRESSION = eINSTANCE.getEEFExtMarkdownWidget_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Number Of Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_MARKDOWN_WIDGET__NUMBER_OF_LINE = eINSTANCE.getEEFExtMarkdownWidget_NumberOfLine();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_MARKDOWN_WIDGET__EDIT_EXPRESSION = eINSTANCE.getEEFExtMarkdownWidget_EditExpression();

	}

} //MarkupWidgetsPackage
