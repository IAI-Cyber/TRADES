/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.model.OscalCatalogCommon.impl;

import dsm.oscal.model.OscalCatalogCommon.*;

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
public class OscalCatalogCommonFactoryImpl extends EFactoryImpl implements OscalCatalogCommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OscalCatalogCommonFactory init() {
		try {
			OscalCatalogCommonFactory theOscalCatalogCommonFactory = (OscalCatalogCommonFactory)EPackage.Registry.INSTANCE.getEFactory(OscalCatalogCommonPackage.eNS_URI);
			if (theOscalCatalogCommonFactory != null) {
				return theOscalCatalogCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OscalCatalogCommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscalCatalogCommonFactoryImpl() {
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
			case OscalCatalogCommonPackage.PARAMETER: return createParameter();
			case OscalCatalogCommonPackage.PARAMETER_CONSTRAINT: return createParameterConstraint();
			case OscalCatalogCommonPackage.PARAMETER_CONSTRAINT_TEST: return createParameterConstraintTest();
			case OscalCatalogCommonPackage.PARAMETER_GUIDELINE: return createParameterGuideline();
			case OscalCatalogCommonPackage.PARAMETER_SELECTION: return createParameterSelection();
			case OscalCatalogCommonPackage.PART: return createPart();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterConstraint createParameterConstraint() {
		ParameterConstraintImpl parameterConstraint = new ParameterConstraintImpl();
		return parameterConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterConstraintTest createParameterConstraintTest() {
		ParameterConstraintTestImpl parameterConstraintTest = new ParameterConstraintTestImpl();
		return parameterConstraintTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterGuideline createParameterGuideline() {
		ParameterGuidelineImpl parameterGuideline = new ParameterGuidelineImpl();
		return parameterGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterSelection createParameterSelection() {
		ParameterSelectionImpl parameterSelection = new ParameterSelectionImpl();
		return parameterSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OscalCatalogCommonPackage getOscalCatalogCommonPackage() {
		return (OscalCatalogCommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OscalCatalogCommonPackage getPackage() {
		return OscalCatalogCommonPackage.eINSTANCE;
	}

} //OscalCatalogCommonFactoryImpl
