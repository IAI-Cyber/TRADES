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

import org.eclipse.eef.EEFWidgetDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Ext HTML Renderer Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Widget that renders HTML and offers edition capacities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getToHtmlExpression <em>To Html Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getNumberOfLine <em>Number Of Line</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getEditionToolExpression <em>Edition Tool Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getCssExpression <em>Css Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage#getEEFExtHTMLRendererDescription()
 * @model
 * @generated
 */
public interface EEFExtHTMLRendererDescription extends EEFWidgetDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) Obeo, Eclipse contributors and others 2021.\n This program and the accompanying materials\n are made available under the terms of the Eclipse Public License 2.0\n which accompanies this distribution, and is available at\n https://www.eclipse.org/legal/epl-2.0/\n\n SPDX-License-Identifier: EPL-2.0\n\n Contributors:\n    Obeo and Israel Aerospace Industries - initial API and implementation\n";

	/**
	 * Returns the value of the '<em><b>To Html Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression that returns either an HTML document. If the CSS feature is filled this expression should only return the body of the HTML document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Html Expression</em>' attribute.
	 * @see #setToHtmlExpression(String)
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage#getEEFExtHTMLRendererDescription_ToHtmlExpression()
	 * @model required="true"
	 * @generated
	 */
	String getToHtmlExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getToHtmlExpression <em>To Html Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Html Expression</em>' attribute.
	 * @see #getToHtmlExpression()
	 * @generated
	 */
	void setToHtmlExpression(String value);

	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value as an input for the HTML convertion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage#getEEFExtHTMLRendererDescription_ValueExpression()
	 * @model required="true"
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getValueExpression <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Line</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of line to be displayed. This is an approximation since the side of each line will depend on the CSS in used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Line</em>' attribute.
	 * @see #setNumberOfLine(int)
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage#getEEFExtHTMLRendererDescription_NumberOfLine()
	 * @model default="5" required="true"
	 * @generated
	 */
	int getNumberOfLine();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getNumberOfLine <em>Number Of Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Line</em>' attribute.
	 * @see #getNumberOfLine()
	 * @generated
	 */
	void setNumberOfLine(int value);

	/**
	 * Returns the value of the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression set a new value (same type as the valueExpression returned type).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage#getEEFExtHTMLRendererDescription_EditExpression()
	 * @model
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getEditExpression <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>Edition Tool Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression used to edit the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edition Tool Expression</em>' attribute.
	 * @see #setEditionToolExpression(String)
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage#getEEFExtHTMLRendererDescription_EditionToolExpression()
	 * @model
	 * @generated
	 */
	String getEditionToolExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getEditionToolExpression <em>Edition Tool Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Tool Expression</em>' attribute.
	 * @see #getEditionToolExpression()
	 * @generated
	 */
	void setEditionToolExpression(String value);

	/**
	 * Returns the value of the '<em><b>Css Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css Expression</em>' attribute.
	 * @see #setCssExpression(String)
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage#getEEFExtHTMLRendererDescription_CssExpression()
	 * @model
	 * @generated
	 */
	String getCssExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription#getCssExpression <em>Css Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Css Expression</em>' attribute.
	 * @see #getCssExpression()
	 * @generated
	 */
	void setCssExpression(String value);

} // EEFExtHTMLRendererDescription
