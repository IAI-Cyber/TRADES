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
package dsm.oscal.model.OscalMetadata.util;

import dsm.oscal.model.OscalMetadata.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage
 * @generated
 */
public class OscalMetadataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OscalMetadataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscalMetadataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OscalMetadataPackage.eINSTANCE;
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
	protected OscalMetadataSwitch<Adapter> modelSwitch =
		new OscalMetadataSwitch<Adapter>() {
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationOwner(AnnotationOwner object) {
				return createAnnotationOwnerAdapter();
			}
			@Override
			public Adapter caseBackMatter(BackMatter object) {
				return createBackMatterAdapter();
			}
			@Override
			public Adapter caseBackMatterResource(BackMatterResource object) {
				return createBackMatterResourceAdapter();
			}
			@Override
			public Adapter caseBase64(Base64 object) {
				return createBase64Adapter();
			}
			@Override
			public Adapter caseDocumentId(DocumentId object) {
				return createDocumentIdAdapter();
			}
			@Override
			public Adapter caseDocumentationComputer(DocumentationComputer object) {
				return createDocumentationComputerAdapter();
			}
			@Override
			public Adapter caseElementWithClazz(ElementWithClazz object) {
				return createElementWithClazzAdapter();
			}
			@Override
			public Adapter caseElementWithId(ElementWithId object) {
				return createElementWithIdAdapter();
			}
			@Override
			public Adapter caseElementWithRemarks(ElementWithRemarks object) {
				return createElementWithRemarksAdapter();
			}
			@Override
			public Adapter caseElementWithValue(ElementWithValue object) {
				return createElementWithValueAdapter();
			}
			@Override
			public Adapter caseExternalId(ExternalId object) {
				return createExternalIdAdapter();
			}
			@Override
			public Adapter caseHash(Hash object) {
				return createHashAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseLinkOwner(LinkOwner object) {
				return createLinkOwnerAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseOscalElement(OscalElement object) {
				return createOscalElementAdapter();
			}
			@Override
			public Adapter casePartOwner(PartOwner object) {
				return createPartOwnerAdapter();
			}
			@Override
			public Adapter caseParty(Party object) {
				return createPartyAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter casePropertyOwner(PropertyOwner object) {
				return createPropertyOwnerAdapter();
			}
			@Override
			public Adapter caseResourceCitation(ResourceCitation object) {
				return createResourceCitationAdapter();
			}
			@Override
			public Adapter caseResourceRlink(ResourceRlink object) {
				return createResourceRlinkAdapter();
			}
			@Override
			public Adapter caseResponsibleParty(ResponsibleParty object) {
				return createResponsiblePartyAdapter();
			}
			@Override
			public Adapter caseResponsibleRole(ResponsibleRole object) {
				return createResponsibleRoleAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseTelephoneNumber(TelephoneNumber object) {
				return createTelephoneNumberAdapter();
			}
			@Override
			public Adapter caseUUIDElement(UUIDElement object) {
				return createUUIDElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.BackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.BackMatter
	 * @generated
	 */
	public Adapter createBackMatterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.BackMatterResource <em>Back Matter Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.BackMatterResource
	 * @generated
	 */
	public Adapter createBackMatterResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Base64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Base64
	 * @generated
	 */
	public Adapter createBase64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.DocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.DocumentId
	 * @generated
	 */
	public Adapter createDocumentIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.DocumentationComputer <em>Documentation Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.DocumentationComputer
	 * @generated
	 */
	public Adapter createDocumentationComputerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.ElementWithId <em>Element With Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithId
	 * @generated
	 */
	public Adapter createElementWithIdAdapter() {
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
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.ElementWithValue <em>Element With Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.ElementWithValue
	 * @generated
	 */
	public Adapter createElementWithValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.ExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.ExternalId
	 * @generated
	 */
	public Adapter createExternalIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Hash
	 * @generated
	 */
	public Adapter createHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
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
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.ResourceCitation <em>Resource Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.ResourceCitation
	 * @generated
	 */
	public Adapter createResourceCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.ResourceRlink <em>Resource Rlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.ResourceRlink
	 * @generated
	 */
	public Adapter createResourceRlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.ResponsibleParty
	 * @generated
	 */
	public Adapter createResponsiblePartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.ResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.ResponsibleRole
	 * @generated
	 */
	public Adapter createResponsibleRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.TelephoneNumber
	 * @generated
	 */
	public Adapter createTelephoneNumberAdapter() {
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
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.OscalMetadata.PartOwner <em>Part Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.OscalMetadata.PartOwner
	 * @generated
	 */
	public Adapter createPartOwnerAdapter() {
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

} //OscalMetadataAdapterFactory
