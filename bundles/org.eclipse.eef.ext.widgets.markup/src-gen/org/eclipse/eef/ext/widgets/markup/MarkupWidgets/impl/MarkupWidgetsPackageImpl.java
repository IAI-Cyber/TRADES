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

import org.eclipse.eef.EefPackage;

import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsFactory;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkupWidgetsPackageImpl extends EPackageImpl implements MarkupWidgetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) Obeo, Eclipse contributors and others 2021.\n This program and the accompanying materials\n are made available under the terms of the Eclipse Public License 2.0\n which accompanies this distribution, and is available at\n https://www.eclipse.org/legal/epl-2.0/\n\n SPDX-License-Identifier: EPL-2.0\n\n Contributors:\n    Obeo and Israel Aerospace Industries - initial API and implementation\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefExtHTMLRendererDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eefExtMarkdownWidgetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MarkupWidgetsPackageImpl() {
		super(eNS_URI, MarkupWidgetsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MarkupWidgetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MarkupWidgetsPackage init() {
		if (isInited)
			return (MarkupWidgetsPackage) EPackage.Registry.INSTANCE.getEPackage(MarkupWidgetsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMarkupWidgetsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MarkupWidgetsPackageImpl theMarkupWidgetsPackage = registeredMarkupWidgetsPackage instanceof MarkupWidgetsPackageImpl
				? (MarkupWidgetsPackageImpl) registeredMarkupWidgetsPackage
				: new MarkupWidgetsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		EefPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMarkupWidgetsPackage.createPackageContents();

		// Initialize created meta-data
		theMarkupWidgetsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMarkupWidgetsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MarkupWidgetsPackage.eNS_URI, theMarkupWidgetsPackage);
		return theMarkupWidgetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFExtHTMLRendererDescription() {
		return eefExtHTMLRendererDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtHTMLRendererDescription_ToHtmlExpression() {
		return (EAttribute) eefExtHTMLRendererDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtHTMLRendererDescription_ValueExpression() {
		return (EAttribute) eefExtHTMLRendererDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtHTMLRendererDescription_NumberOfLine() {
		return (EAttribute) eefExtHTMLRendererDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtHTMLRendererDescription_EditExpression() {
		return (EAttribute) eefExtHTMLRendererDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtHTMLRendererDescription_EditionToolExpression() {
		return (EAttribute) eefExtHTMLRendererDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtHTMLRendererDescription_CssExpression() {
		return (EAttribute) eefExtHTMLRendererDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEFExtMarkdownWidget() {
		return eefExtMarkdownWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtMarkdownWidget_ValueExpression() {
		return (EAttribute) eefExtMarkdownWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtMarkdownWidget_NumberOfLine() {
		return (EAttribute) eefExtMarkdownWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEFExtMarkdownWidget_EditExpression() {
		return (EAttribute) eefExtMarkdownWidgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupWidgetsFactory getMarkupWidgetsFactory() {
		return (MarkupWidgetsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eefExtHTMLRendererDescriptionEClass = createEClass(EEF_EXT_HTML_RENDERER_DESCRIPTION);
		createEAttribute(eefExtHTMLRendererDescriptionEClass, EEF_EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION);
		createEAttribute(eefExtHTMLRendererDescriptionEClass, EEF_EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION);
		createEAttribute(eefExtHTMLRendererDescriptionEClass, EEF_EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINE);
		createEAttribute(eefExtHTMLRendererDescriptionEClass, EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION);
		createEAttribute(eefExtHTMLRendererDescriptionEClass, EEF_EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION);
		createEAttribute(eefExtHTMLRendererDescriptionEClass, EEF_EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION);

		eefExtMarkdownWidgetEClass = createEClass(EEF_EXT_MARKDOWN_WIDGET);
		createEAttribute(eefExtMarkdownWidgetEClass, EEF_EXT_MARKDOWN_WIDGET__VALUE_EXPRESSION);
		createEAttribute(eefExtMarkdownWidgetEClass, EEF_EXT_MARKDOWN_WIDGET__NUMBER_OF_LINE);
		createEAttribute(eefExtMarkdownWidgetEClass, EEF_EXT_MARKDOWN_WIDGET__EDIT_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EefPackage theEefPackage = (EefPackage) EPackage.Registry.INSTANCE.getEPackage(EefPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eefExtHTMLRendererDescriptionEClass.getESuperTypes().add(theEefPackage.getEEFWidgetDescription());
		eefExtMarkdownWidgetEClass.getESuperTypes().add(theEefPackage.getEEFWidgetDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(eefExtHTMLRendererDescriptionEClass, EEFExtHTMLRendererDescription.class, "EEFExtHTMLRendererDescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFExtHTMLRendererDescription_ToHtmlExpression(), theEcorePackage.getEString(), "toHtmlExpression", null, 1, 1,
				EEFExtHTMLRendererDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFExtHTMLRendererDescription_ValueExpression(), theEcorePackage.getEString(), "valueExpression", null, 1, 1,
				EEFExtHTMLRendererDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFExtHTMLRendererDescription_NumberOfLine(), theEcorePackage.getEInt(), "numberOfLine", "5", 1, 1,
				EEFExtHTMLRendererDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFExtHTMLRendererDescription_EditExpression(), theEcorePackage.getEString(), "editExpression", null, 0, 1,
				EEFExtHTMLRendererDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFExtHTMLRendererDescription_EditionToolExpression(), theEcorePackage.getEString(), "editionToolExpression", null, 0, 1,
				EEFExtHTMLRendererDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEFExtHTMLRendererDescription_CssExpression(), theEcorePackage.getEString(), "cssExpression", null, 0, 1,
				EEFExtHTMLRendererDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eefExtMarkdownWidgetEClass, EEFExtMarkdownWidget.class, "EEFExtMarkdownWidget", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEFExtMarkdownWidget_ValueExpression(), theEcorePackage.getEString(), "valueExpression", null, 1, 1,
				EEFExtMarkdownWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFExtMarkdownWidget_NumberOfLine(), theEcorePackage.getEInt(), "numberOfLine", "5", 1, 1, EEFExtMarkdownWidget.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEFExtMarkdownWidget_EditExpression(), theEcorePackage.getEString(), "editExpression", null, 0, 1,
				EEFExtMarkdownWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MarkupWidgetsPackageImpl
