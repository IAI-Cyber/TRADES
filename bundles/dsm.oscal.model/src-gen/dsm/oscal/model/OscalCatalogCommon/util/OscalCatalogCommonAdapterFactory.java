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
package dsm.oscal.model.OscalCatalogCommon.util;

import dsm.oscal.model.OscalCatalogCommon.*;

import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.ElementWithClazz;
import dsm.oscal.model.OscalMetadata.ElementWithRemarks;
import dsm.oscal.model.OscalMetadata.LinkOwner;
import dsm.oscal.model.OscalMetadata.OscalElement;
import dsm.oscal.model.OscalMetadata.PropertyOwner;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage
 * @generated
 */
public class OscalCatalogCommonAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OscalCatalogCommonPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscalCatalogCommonAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OscalCatalogCommonPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OscalCatalogCommonSwitch<Adapter> modelSwitch =
		new OscalCatalogCommonSwitch<Adapter>() {
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterConstraint(ParameterConstraint object) {
				return createParameterConstraintAdapter();
			}
			@Override
			public Adapter caseParameterConstraintTest(ParameterConstraintTest object) {
				return createParameterConstraintTestAdapter();
			}
			@Override
			public Adapter caseParameterGuideline(ParameterGuideline object) {
				return createParameterGuidelineAdapter();
			}
			@Override
			public Adapter caseParameterSelection(ParameterSelection object) {
				return createParameterSelectionAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter caseOscalElement(OscalElement object) {
				return createOscalElementAdapter();
			}
			@Override
			public Adapter caseAnnotationOwner(AnnotationOwner object) {
				return createAnnotationOwnerAdapter();
			}
			@Override
			public Adapter casePropertyOwner(PropertyOwner object) {
				return createPropertyOwnerAdapter();
			}
			@Override
			public Adapter caseLinkOwner(LinkOwner object) {
				return createLinkOwnerAdapter();
			}
			@Override
			public Adapter caseElementWithRemarks(ElementWithRemarks object) {
				return createElementWithRemarksAdapter();
			}
			@Override
			public Adapter caseElementWithClazz(ElementWithClazz object) {
				return createElementWithClazzAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalCatalogCommon.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalCatalogCommon.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalCatalogCommon.ParameterConstraint <em>Parameter Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterConstraint
	 * @generated
	 */
	public Adapter createParameterConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest <em>Parameter Constraint Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest
	 * @generated
	 */
	public Adapter createParameterConstraintTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalCatalogCommon.ParameterGuideline <em>Parameter Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterGuideline
	 * @generated
	 */
	public Adapter createParameterGuidelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalCatalogCommon.ParameterSelection <em>Parameter Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalCatalogCommon.ParameterSelection
	 * @generated
	 */
	public Adapter createParameterSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalCatalogCommon.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalCatalogCommon.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.OscalElement <em>Oscal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.OscalElement
	 * @generated
	 */
	public Adapter createOscalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.AnnotationOwner <em>Annotation Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.AnnotationOwner
	 * @generated
	 */
	public Adapter createAnnotationOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.PropertyOwner <em>Property Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.PropertyOwner
	 * @generated
	 */
	public Adapter createPropertyOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.LinkOwner <em>Link Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.LinkOwner
	 * @generated
	 */
	public Adapter createLinkOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.ElementWithRemarks <em>Element With Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithRemarks
	 * @generated
	 */
	public Adapter createElementWithRemarksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.ElementWithClazz <em>Element With Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithClazz
	 * @generated
	 */
	public Adapter createElementWithClazzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OscalCatalogCommonAdapterFactory
