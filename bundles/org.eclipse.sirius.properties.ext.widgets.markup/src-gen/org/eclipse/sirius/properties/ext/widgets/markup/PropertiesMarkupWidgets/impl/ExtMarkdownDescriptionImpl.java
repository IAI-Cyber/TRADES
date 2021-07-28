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
package org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.properties.AbstractWidgetDescription;
import org.eclipse.sirius.properties.PropertiesPackage;

import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage;

import org.eclipse.sirius.properties.impl.WidgetDescriptionImpl;

import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ext Markdown Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl#getHelpExpression <em>Help Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl#getIsEnabledExpression <em>Is Enabled Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl#getNumberOfLines <em>Number Of Lines</em>}</li>
 *   <li>{@link org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.impl.ExtMarkdownDescriptionImpl#getInitialOperation <em>Initial Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtMarkdownDescriptionImpl extends WidgetDescriptionImpl implements ExtMarkdownDescription {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = " Copyright (c) Obeo, Eclipse contributors and others 2021.\n This program and the accompanying materials\n are made available under the terms of the Eclipse Public License 2.0\n which accompanies this distribution, and is available at\n https://www.eclipse.org/legal/epl-2.0/\n\n SPDX-License-Identifier: EPL-2.0\n\n Contributors:\n    Obeo and Israel Aerospace Industries - initial API and implementation\n";

    /**
     * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabelExpression()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabelExpression()
     * @generated
     * @ordered
     */
    protected String labelExpression = LABEL_EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getHelpExpression() <em>Help Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHelpExpression()
     * @generated
     * @ordered
     */
    protected static final String HELP_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHelpExpression() <em>Help Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHelpExpression()
     * @generated
     * @ordered
     */
    protected String helpExpression = HELP_EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getIsEnabledExpression() <em>Is Enabled Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsEnabledExpression()
     * @generated
     * @ordered
     */
    protected static final String IS_ENABLED_EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsEnabledExpression() <em>Is Enabled Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsEnabledExpression()
     * @generated
     * @ordered
     */
    protected String isEnabledExpression = IS_ENABLED_EXPRESSION_EDEFAULT;

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
     * The default value of the '{@link #getNumberOfLines() <em>Number Of Lines</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfLines()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_OF_LINES_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumberOfLines() <em>Number Of Lines</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfLines()
     * @generated
     * @ordered
     */
    protected int numberOfLines = NUMBER_OF_LINES_EDEFAULT;

    /**
     * The cached value of the '{@link #getInitialOperation() <em>Initial Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialOperation()
     * @generated
     * @ordered
     */
    protected InitialOperation initialOperation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtMarkdownDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesMarkupWidgetsPackage.Literals.EXT_MARKDOWN_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabelExpression() {
        return labelExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabelExpression(String newLabelExpression) {
        String oldLabelExpression = labelExpression;
        labelExpression = newLabelExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__LABEL_EXPRESSION, oldLabelExpression, labelExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHelpExpression() {
        return helpExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHelpExpression(String newHelpExpression) {
        String oldHelpExpression = helpExpression;
        helpExpression = newHelpExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__HELP_EXPRESSION, oldHelpExpression, helpExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIsEnabledExpression() {
        return isEnabledExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsEnabledExpression(String newIsEnabledExpression) {
        String oldIsEnabledExpression = isEnabledExpression;
        isEnabledExpression = newIsEnabledExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__IS_ENABLED_EXPRESSION, oldIsEnabledExpression, isEnabledExpression));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__VALUE_EXPRESSION, oldValueExpression, valueExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getNumberOfLines() {
        return numberOfLines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNumberOfLines(int newNumberOfLines) {
        int oldNumberOfLines = numberOfLines;
        numberOfLines = newNumberOfLines;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__NUMBER_OF_LINES, oldNumberOfLines, numberOfLines));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitialOperation getInitialOperation() {
        return initialOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitialOperation(InitialOperation newInitialOperation, NotificationChain msgs) {
        InitialOperation oldInitialOperation = initialOperation;
        initialOperation = newInitialOperation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION, oldInitialOperation,
                    newInitialOperation);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialOperation(InitialOperation newInitialOperation) {
        if (newInitialOperation != initialOperation) {
            NotificationChain msgs = null;
            if (initialOperation != null)
                msgs = ((InternalEObject) initialOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION, null, msgs);
            if (newInitialOperation != null)
                msgs = ((InternalEObject) newInitialOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION, null, msgs);
            msgs = basicSetInitialOperation(newInitialOperation, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION, newInitialOperation, newInitialOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION:
            return basicSetInitialOperation(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__LABEL_EXPRESSION:
            return getLabelExpression();
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__HELP_EXPRESSION:
            return getHelpExpression();
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__IS_ENABLED_EXPRESSION:
            return getIsEnabledExpression();
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__VALUE_EXPRESSION:
            return getValueExpression();
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__NUMBER_OF_LINES:
            return getNumberOfLines();
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION:
            return getInitialOperation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__LABEL_EXPRESSION:
            setLabelExpression((String) newValue);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__HELP_EXPRESSION:
            setHelpExpression((String) newValue);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__IS_ENABLED_EXPRESSION:
            setIsEnabledExpression((String) newValue);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__VALUE_EXPRESSION:
            setValueExpression((String) newValue);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__NUMBER_OF_LINES:
            setNumberOfLines((Integer) newValue);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION:
            setInitialOperation((InitialOperation) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__LABEL_EXPRESSION:
            setLabelExpression(LABEL_EXPRESSION_EDEFAULT);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__HELP_EXPRESSION:
            setHelpExpression(HELP_EXPRESSION_EDEFAULT);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__IS_ENABLED_EXPRESSION:
            setIsEnabledExpression(IS_ENABLED_EXPRESSION_EDEFAULT);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__VALUE_EXPRESSION:
            setValueExpression(VALUE_EXPRESSION_EDEFAULT);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__NUMBER_OF_LINES:
            setNumberOfLines(NUMBER_OF_LINES_EDEFAULT);
            return;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION:
            setInitialOperation((InitialOperation) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__LABEL_EXPRESSION:
            return LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null : !LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__HELP_EXPRESSION:
            return HELP_EXPRESSION_EDEFAULT == null ? helpExpression != null : !HELP_EXPRESSION_EDEFAULT.equals(helpExpression);
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__IS_ENABLED_EXPRESSION:
            return IS_ENABLED_EXPRESSION_EDEFAULT == null ? isEnabledExpression != null : !IS_ENABLED_EXPRESSION_EDEFAULT.equals(isEnabledExpression);
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__VALUE_EXPRESSION:
            return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null : !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__NUMBER_OF_LINES:
            return numberOfLines != NUMBER_OF_LINES_EDEFAULT;
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION:
            return initialOperation != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == AbstractWidgetDescription.class) {
            switch (derivedFeatureID) {
            case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__LABEL_EXPRESSION:
                return PropertiesPackage.ABSTRACT_WIDGET_DESCRIPTION__LABEL_EXPRESSION;
            case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__HELP_EXPRESSION:
                return PropertiesPackage.ABSTRACT_WIDGET_DESCRIPTION__HELP_EXPRESSION;
            case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__IS_ENABLED_EXPRESSION:
                return PropertiesPackage.ABSTRACT_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == AbstractWidgetDescription.class) {
            switch (baseFeatureID) {
            case PropertiesPackage.ABSTRACT_WIDGET_DESCRIPTION__LABEL_EXPRESSION:
                return PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__LABEL_EXPRESSION;
            case PropertiesPackage.ABSTRACT_WIDGET_DESCRIPTION__HELP_EXPRESSION:
                return PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__HELP_EXPRESSION;
            case PropertiesPackage.ABSTRACT_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION:
                return PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION__IS_ENABLED_EXPRESSION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (labelExpression: ");
        result.append(labelExpression);
        result.append(", helpExpression: ");
        result.append(helpExpression);
        result.append(", isEnabledExpression: ");
        result.append(isEnabledExpression);
        result.append(", valueExpression: ");
        result.append(valueExpression);
        result.append(", numberOfLines: ");
        result.append(numberOfLines);
        result.append(')');
        return result.toString();
    }

} //ExtMarkdownDescriptionImpl
