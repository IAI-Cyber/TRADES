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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.properties.PropertiesPackage;

import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtHTMLRendererDescription;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.ExtMarkdownDescription;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsFactory;
import org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage;

import org.eclipse.sirius.viewpoint.ViewpointPackage;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesMarkupWidgetsPackageImpl extends EPackageImpl implements PropertiesMarkupWidgetsPackage {
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
    private EClass extHTMLRendererDescriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extMarkdownDescriptionEClass = null;

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
     * @see org.eclipse.sirius.properties.ext.widgets.markup.PropertiesMarkupWidgets.PropertiesMarkupWidgetsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PropertiesMarkupWidgetsPackageImpl() {
        super(eNS_URI, PropertiesMarkupWidgetsFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link PropertiesMarkupWidgetsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PropertiesMarkupWidgetsPackage init() {
        if (isInited)
            return (PropertiesMarkupWidgetsPackage) EPackage.Registry.INSTANCE.getEPackage(PropertiesMarkupWidgetsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredPropertiesMarkupWidgetsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        PropertiesMarkupWidgetsPackageImpl thePropertiesMarkupWidgetsPackage = registeredPropertiesMarkupWidgetsPackage instanceof PropertiesMarkupWidgetsPackageImpl
                ? (PropertiesMarkupWidgetsPackageImpl) registeredPropertiesMarkupWidgetsPackage
                : new PropertiesMarkupWidgetsPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        PropertiesPackage.eINSTANCE.eClass();
        ViewpointPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        thePropertiesMarkupWidgetsPackage.createPackageContents();

        // Initialize created meta-data
        thePropertiesMarkupWidgetsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thePropertiesMarkupWidgetsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PropertiesMarkupWidgetsPackage.eNS_URI, thePropertiesMarkupWidgetsPackage);
        return thePropertiesMarkupWidgetsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtHTMLRendererDescription() {
        return extHTMLRendererDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtHTMLRendererDescription_ToHtmlExpression() {
        return (EAttribute) extHTMLRendererDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtHTMLRendererDescription_ValueExpression() {
        return (EAttribute) extHTMLRendererDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtHTMLRendererDescription_NumberOfLines() {
        return (EAttribute) extHTMLRendererDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtHTMLRendererDescription_InitialOperation() {
        return (EReference) extHTMLRendererDescriptionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtHTMLRendererDescription_EditionToolExpression() {
        return (EAttribute) extHTMLRendererDescriptionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtHTMLRendererDescription_CssExpression() {
        return (EAttribute) extHTMLRendererDescriptionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtMarkdownDescription() {
        return extMarkdownDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtMarkdownDescription_ValueExpression() {
        return (EAttribute) extMarkdownDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtMarkdownDescription_NumberOfLines() {
        return (EAttribute) extMarkdownDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtMarkdownDescription_InitialOperation() {
        return (EReference) extMarkdownDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesMarkupWidgetsFactory getPropertiesMarkupWidgetsFactory() {
        return (PropertiesMarkupWidgetsFactory) getEFactoryInstance();
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
        extHTMLRendererDescriptionEClass = createEClass(EXT_HTML_RENDERER_DESCRIPTION);
        createEAttribute(extHTMLRendererDescriptionEClass, EXT_HTML_RENDERER_DESCRIPTION__TO_HTML_EXPRESSION);
        createEAttribute(extHTMLRendererDescriptionEClass, EXT_HTML_RENDERER_DESCRIPTION__VALUE_EXPRESSION);
        createEAttribute(extHTMLRendererDescriptionEClass, EXT_HTML_RENDERER_DESCRIPTION__NUMBER_OF_LINES);
        createEReference(extHTMLRendererDescriptionEClass, EXT_HTML_RENDERER_DESCRIPTION__INITIAL_OPERATION);
        createEAttribute(extHTMLRendererDescriptionEClass, EXT_HTML_RENDERER_DESCRIPTION__EDITION_TOOL_EXPRESSION);
        createEAttribute(extHTMLRendererDescriptionEClass, EXT_HTML_RENDERER_DESCRIPTION__CSS_EXPRESSION);

        extMarkdownDescriptionEClass = createEClass(EXT_MARKDOWN_DESCRIPTION);
        createEAttribute(extMarkdownDescriptionEClass, EXT_MARKDOWN_DESCRIPTION__VALUE_EXPRESSION);
        createEAttribute(extMarkdownDescriptionEClass, EXT_MARKDOWN_DESCRIPTION__NUMBER_OF_LINES);
        createEReference(extMarkdownDescriptionEClass, EXT_MARKDOWN_DESCRIPTION__INITIAL_OPERATION);
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
        PropertiesPackage thePropertiesPackage = (PropertiesPackage) EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);
        DescriptionPackage theDescriptionPackage = (DescriptionPackage) EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
        ToolPackage theToolPackage = (ToolPackage) EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        extHTMLRendererDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getWidgetDescription());
        extHTMLRendererDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getAbstractWidgetDescription());
        extMarkdownDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getWidgetDescription());
        extMarkdownDescriptionEClass.getESuperTypes().add(thePropertiesPackage.getAbstractWidgetDescription());

        // Initialize classes and features; add operations and parameters
        initEClass(extHTMLRendererDescriptionEClass, ExtHTMLRendererDescription.class, "ExtHTMLRendererDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExtHTMLRendererDescription_ToHtmlExpression(), theDescriptionPackage.getInterpretedExpression(), "toHtmlExpression", null, 0, 1, ExtHTMLRendererDescription.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtHTMLRendererDescription_ValueExpression(), theDescriptionPackage.getInterpretedExpression(), "valueExpression", null, 0, 1, ExtHTMLRendererDescription.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtHTMLRendererDescription_NumberOfLines(), theEcorePackage.getEInt(), "numberOfLines", null, 0, 1, ExtHTMLRendererDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtHTMLRendererDescription_InitialOperation(), theToolPackage.getInitialOperation(), null, "initialOperation", null, 0, 1, ExtHTMLRendererDescription.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtHTMLRendererDescription_EditionToolExpression(), theDescriptionPackage.getInterpretedExpression(), "editionToolExpression", null, 0, 1, ExtHTMLRendererDescription.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtHTMLRendererDescription_CssExpression(), theDescriptionPackage.getInterpretedExpression(), "cssExpression", null, 0, 1, ExtHTMLRendererDescription.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extMarkdownDescriptionEClass, ExtMarkdownDescription.class, "ExtMarkdownDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExtMarkdownDescription_ValueExpression(), theDescriptionPackage.getInterpretedExpression(), "valueExpression", null, 0, 1, ExtMarkdownDescription.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtMarkdownDescription_NumberOfLines(), theEcorePackage.getEInt(), "numberOfLines", null, 0, 1, ExtMarkdownDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtMarkdownDescription_InitialOperation(), theToolPackage.getInitialOperation(), null, "initialOperation", null, 0, 1, ExtMarkdownDescription.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //PropertiesMarkupWidgetsPackageImpl
