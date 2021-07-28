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

import org.eclipse.sirius.properties.AbstractWidgetDescription;
import org.eclipse.sirius.properties.WidgetDescription;

import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ext HTML Renderer Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getToHtmlExpression <em>To Html Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getNumberOfLines <em>Number Of Lines</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getInitialOperation <em>Initial Operation</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getEditionToolExpression <em>Edition Tool Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getCssExpression <em>Css Expression</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage#getExtHTMLRendererDescription()
 * @model
 * @generated
 */
public interface ExtHTMLRendererDescription extends WidgetDescription, AbstractWidgetDescription {
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
     * @return the value of the '<em>To Html Expression</em>' attribute.
     * @see #setToHtmlExpression(String)
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage#getExtHTMLRendererDescription_ToHtmlExpression()
     * @model dataType="org.eclipse.sirius.viewpoint.description.InterpretedExpression"
     * @generated
     */
    String getToHtmlExpression();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getToHtmlExpression <em>To Html Expression</em>}' attribute.
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
     * @return the value of the '<em>Value Expression</em>' attribute.
     * @see #setValueExpression(String)
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage#getExtHTMLRendererDescription_ValueExpression()
     * @model dataType="org.eclipse.sirius.viewpoint.description.InterpretedExpression"
     * @generated
     */
    String getValueExpression();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getValueExpression <em>Value Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Expression</em>' attribute.
     * @see #getValueExpression()
     * @generated
     */
    void setValueExpression(String value);

    /**
     * Returns the value of the '<em><b>Number Of Lines</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Number Of Lines</em>' attribute.
     * @see #setNumberOfLines(int)
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage#getExtHTMLRendererDescription_NumberOfLines()
     * @model
     * @generated
     */
    int getNumberOfLines();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getNumberOfLines <em>Number Of Lines</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number Of Lines</em>' attribute.
     * @see #getNumberOfLines()
     * @generated
     */
    void setNumberOfLines(int value);

    /**
     * Returns the value of the '<em><b>Initial Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Operation</em>' containment reference.
     * @see #setInitialOperation(InitialOperation)
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage#getExtHTMLRendererDescription_InitialOperation()
     * @model containment="true"
     * @generated
     */
    InitialOperation getInitialOperation();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getInitialOperation <em>Initial Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Operation</em>' containment reference.
     * @see #getInitialOperation()
     * @generated
     */
    void setInitialOperation(InitialOperation value);

    /**
     * Returns the value of the '<em><b>Edition Tool Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Edition Tool Expression</em>' attribute.
     * @see #setEditionToolExpression(String)
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage#getExtHTMLRendererDescription_EditionToolExpression()
     * @model dataType="org.eclipse.sirius.viewpoint.description.InterpretedExpression"
     * @generated
     */
    String getEditionToolExpression();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getEditionToolExpression <em>Edition Tool Expression</em>}' attribute.
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
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage#getExtHTMLRendererDescription_CssExpression()
     * @model dataType="org.eclipse.sirius.viewpoint.description.InterpretedExpression"
     * @generated
     */
    String getCssExpression();

    /**
     * Sets the value of the '{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription#getCssExpression <em>Css Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Css Expression</em>' attribute.
     * @see #getCssExpression()
     * @generated
     */
    void setCssExpression(String value);

} // ExtHTMLRendererDescription
