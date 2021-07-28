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

import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkupWidgetsFactoryImpl extends EFactoryImpl implements MarkupWidgetsFactory {
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
	public static MarkupWidgetsFactory init() {
		try {
			MarkupWidgetsFactory theMarkupWidgetsFactory = (MarkupWidgetsFactory) EPackage.Registry.INSTANCE
					.getEFactory(MarkupWidgetsPackage.eNS_URI);
			if (theMarkupWidgetsFactory != null) {
				return theMarkupWidgetsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MarkupWidgetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupWidgetsFactoryImpl() {
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
		case MarkupWidgetsPackage.EEF_EXT_HTML_RENDERER_DESCRIPTION:
			return createEEFExtHTMLRendererDescription();
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET:
			return createEEFExtMarkdownWidget();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtHTMLRendererDescription createEEFExtHTMLRendererDescription() {
		EEFExtHTMLRendererDescriptionImpl eefExtHTMLRendererDescription = new EEFExtHTMLRendererDescriptionImpl();
		return eefExtHTMLRendererDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtMarkdownWidget createEEFExtMarkdownWidget() {
		EEFExtMarkdownWidgetImpl eefExtMarkdownWidget = new EEFExtMarkdownWidgetImpl();
		return eefExtMarkdownWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupWidgetsPackage getMarkupWidgetsPackage() {
		return (MarkupWidgetsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MarkupWidgetsPackage getPackage() {
		return MarkupWidgetsPackage.eINSTANCE;
	}

} //MarkupWidgetsFactoryImpl
