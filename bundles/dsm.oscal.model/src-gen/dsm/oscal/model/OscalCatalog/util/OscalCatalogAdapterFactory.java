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
package dsm.oscal.model.OscalCatalog.util;

import dsm.oscal.model.OscalCatalog.*;

import dsm.oscal.model.OscalMetadata.AnnotationOwner;
import dsm.oscal.model.OscalMetadata.ElementWithClazz;
import dsm.oscal.model.OscalMetadata.LinkOwner;
import dsm.oscal.model.OscalMetadata.OscalElement;
import dsm.oscal.model.OscalMetadata.PropertyOwner;
import dsm.oscal.model.OscalMetadata.UUIDElement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage
 * @generated
 */
public class OscalCatalogAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OscalCatalogPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscalCatalogAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OscalCatalogPackage.eINSTANCE;
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
	protected OscalCatalogSwitch<Adapter> modelSwitch =
		new OscalCatalogSwitch<Adapter>() {
			@Override
			public Adapter caseCatalog(Catalog object) {
				return createCatalogAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseOscalElement(OscalElement object) {
				return createOscalElementAdapter();
			}
			@Override
			public Adapter caseUUIDElement(UUIDElement object) {
				return createUUIDElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalCatalog.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalCatalog.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalCatalog.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalCatalog.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalCatalog.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalCatalog.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
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
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.UUIDElement <em>UUID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.UUIDElement
	 * @generated
	 */
	public Adapter createUUIDElementAdapter() {
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

} //OscalCatalogAdapterFactory
