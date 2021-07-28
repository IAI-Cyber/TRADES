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
package org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl;

import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage;

import org.eclipse.eef.impl.EEFWidgetDescriptionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Ext HTML Renderer Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl#getToHtmlExpression <em>To Html Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl#getNumberOfLine <em>Number Of Line</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl#getEditionToolExpression <em>Edition Tool Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtHTMLRendererDescriptionImpl#getCssExpression <em>Css Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFExtHTMLRendererDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFExtHTMLRendererDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) Obeo, Eclipse contributors and others 2021.\n This program and the accompanying materials\n are made available under the terms of the Eclipse Public License 2.0\n which accompanies this distribution, and is available at\n https://www.eclipse.org/legal/epl-2.0/\n\n SPDX-License-Identifier: EPL-2.0\n\n Contributors:\n    Obeo and Israel Aerospace Industries - initial API and implementation\n";

	/**
	 * The default value of the '{@link #getToHtmlExpression() <em>To Html Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToHtmlExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_HTML_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToHtmlExpression() <em>To Html Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToHtmlExpression()
	 * @generated
	 * @ordered
	 */
	protected String toHtmlExpression = TO_HTML_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected String valueExpression = VALUE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfLine() <em>Number Of Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLine()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_LINE_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getNumberOfLine() <em>Number Of Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLine()
	 * @generated
	 * @ordered
	 */
	protected int numberOfLine = NUMBER_OF_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditExpression() <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditExpression() <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditExpression()
	 * @generated
	 * @ordered
	 */
	protected String editExpression = EDIT_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditionToolExpression() <em>Edition Tool Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionToolExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_TOOL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditionToolExpression() <em>Edition Tool Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionToolExpression()
	 * @generated
	 * @ordered
	 */
	protected String editionToolExpression = EDITION_TOOL_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCssExpression() <em>Css Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCssExpression() <em>Css Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssExpression()
	 * @generated
	 * @ordered
	 */
	protected String cssExpression = CSS_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFExtHTMLRendererDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupWidgetsPackage.Literals.EEF_EXT_HTML_RENDERER_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToHtmlExpression() {
		return toHtmlExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToHtmlExpression(String newToHtmlExpression) {
		String oldToHtmlExpression = toHtmlExpression;
		toHtmlExpression = newToHtmlExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION,
					oldToHtmlExpression, toHtmlExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueExpression(String newValueExpression) {
		String oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION,
					oldValueExpression, valueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfLine() {
		return numberOfLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfLine(int newNumberOfLine) {
		int oldNumberOfLine = numberOfLine;
		numberOfLine = newNumberOfLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE,
					oldNumberOfLine, numberOfLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditExpression() {
		return editExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditExpression(String newEditExpression) {
		String oldEditExpression = editExpression;
		editExpression = newEditExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION,
					oldEditExpression, editExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditionToolExpression() {
		return editionToolExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditionToolExpression(String newEditionToolExpression) {
		String oldEditionToolExpression = editionToolExpression;
		editionToolExpression = newEditionToolExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION,
					oldEditionToolExpression, editionToolExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssExpression() {
		return cssExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssExpression(String newCssExpression) {
		String oldCssExpression = cssExpression;
		cssExpression = newCssExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION,
					oldCssExpression, cssExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION:
			return getToHtmlExpression();
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE:
			return getNumberOfLine();
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION:
			return getEditionToolExpression();
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION:
			return getCssExpression();
		default:
			return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION:
			setToHtmlExpression((String) newValue);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE:
			setNumberOfLine((Integer) newValue);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION:
			setEditionToolExpression((String) newValue);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION:
			setCssExpression((String) newValue);
			return;
		default:
			super.eSet(featureID, newValue);
			return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION:
			setToHtmlExpression(TO_HTML_EXPRESSION_EDEFAULT);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(VALUE_EXPRESSION_EDEFAULT);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE:
			setNumberOfLine(NUMBER_OF_LINE_EDEFAULT);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EDIT_EXPRESSION_EDEFAULT);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION:
			setEditionToolExpression(EDITION_TOOL_EXPRESSION_EDEFAULT);
			return;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION:
			setCssExpression(CSS_EXPRESSION_EDEFAULT);
			return;
		default:
			super.eUnset(featureID);
			return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION:
			return TO_HTML_EXPRESSION_EDEFAULT == null ? toHtmlExpression != null : !TO_HTML_EXPRESSION_EDEFAULT.equals(toHtmlExpression);
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION:
			return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null : !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE:
			return numberOfLine != NUMBER_OF_LINE_EDEFAULT;
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION:
			return EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null : !EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION:
			return EDITION_TOOL_EXPRESSION_EDEFAULT == null ? editionToolExpression != null
					: !EDITION_TOOL_EXPRESSION_EDEFAULT.equals(editionToolExpression);
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION:
			return CSS_EXPRESSION_EDEFAULT == null ? cssExpression != null : !CSS_EXPRESSION_EDEFAULT.equals(cssExpression);
		default:
			return super.eIsSet(featureID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (toHtmlExpression: ");
		result.append(toHtmlExpression);
		result.append(", valueExpression: ");
		result.append(valueExpression);
		result.append(", numberOfLine: ");
		result.append(numberOfLine);
		result.append(", editExpression: ");
		result.append(editExpression);
		result.append(", editionToolExpression: ");
		result.append(editionToolExpression);
		result.append(", cssExpression: ");
		result.append(cssExpression);
		result.append(')');
		return result.toString();
	}

} //EEFExtHTMLRendererDescriptionImpl
