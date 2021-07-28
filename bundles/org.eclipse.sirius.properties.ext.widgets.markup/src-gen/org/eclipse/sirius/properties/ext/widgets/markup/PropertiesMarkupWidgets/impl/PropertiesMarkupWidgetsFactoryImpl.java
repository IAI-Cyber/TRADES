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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesMarkupWidgetsFactoryImpl extends EFactoryImpl implements PropertiesMarkupWidgetsFactory {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = " Copyright (c) Obeo, Eclipse contributors and others 2021.\n This program and the accompanying materials\n are made available under the terms of the Eclipse Public License 2.0\n which accompanies this distribution, and is available at\n https://www.eclipse.org/legal/epl-2.0/\n\n SPDX-License-Identifier: EPL-2.0\n\n Contributors:\n    Obeo and Israel Aerospace Industries - initial API and implementation\n";

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PropertiesMarkupWidgetsFactory init() {
        try {
            PropertiesMarkupWidgetsFactory thePropertiesMarkupWidgetsFactory = (PropertiesMarkupWidgetsFactory) EPackage.Registry.INSTANCE.getEFactory(PropertiesMarkupWidgetsPackage.eNS_URI);
            if (thePropertiesMarkupWidgetsFactory != null) {
                return thePropertiesMarkupWidgetsFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PropertiesMarkupWidgetsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesMarkupWidgetsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case PropertiesMarkupWidgetsPackage.EXT_HTML_RENDERER_DESCRIPTION:
            return createExtHTMLRendererDescription();
        case PropertiesMarkupWidgetsPackage.EXT_MARKDOWN_DESCRIPTION:
            return createExtMarkdownDescription();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtHTMLRendererDescription createExtHTMLRendererDescription() {
        ExtHTMLRendererDescriptionImpl extHTMLRendererDescription = new ExtHTMLRendererDescriptionImpl();
        return extHTMLRendererDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtMarkdownDescription createExtMarkdownDescription() {
        ExtMarkdownDescriptionImpl extMarkdownDescription = new ExtMarkdownDescriptionImpl();
        return extMarkdownDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesMarkupWidgetsPackage getPropertiesMarkupWidgetsPackage() {
        return (PropertiesMarkupWidgetsPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PropertiesMarkupWidgetsPackage getPackage() {
        return PropertiesMarkupWidgetsPackage.eINSTANCE;
    }

} //PropertiesMarkupWidgetsFactoryImpl
