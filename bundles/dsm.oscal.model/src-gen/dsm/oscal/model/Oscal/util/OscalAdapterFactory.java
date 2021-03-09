/**
 */
package dsm.oscal.model.Oscal.util;

import dsm.oscal.model.Oscal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dsm.oscal.model.Oscal.OscalPackage
 * @generated
 */
public class OscalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OscalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OscalPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OscalSwitch<Adapter> modelSwitch = new OscalSwitch<Adapter>() {
		@Override
		public Adapter caseLink(Link object) {
			return createLinkAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseControlDefinition(ControlDefinition object) {
			return createControlDefinitionAdapter();
		}

		@Override
		public Adapter caseAddress(Address object) {
			return createAddressAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseRemark(Remark object) {
			return createRemarkAdapter();
		}

		@Override
		public Adapter caseCatalog(Catalog object) {
			return createCatalogAdapter();
		}

		@Override
		public Adapter caseBackMatter(BackMatter object) {
			return createBackMatterAdapter();
		}

		@Override
		public Adapter caseRevision(Revision object) {
			return createRevisionAdapter();
		}

		@Override
		public Adapter caseGroup(Group object) {
			return createGroupAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter caseDocumentId(DocumentId object) {
			return createDocumentIdAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseMetadata(Metadata object) {
			return createMetadataAdapter();
		}

		@Override
		public Adapter caseRevisions(Revisions object) {
			return createRevisionsAdapter();
		}

		@Override
		public Adapter caseTelephoneNumber(TelephoneNumber object) {
			return createTelephoneNumberAdapter();
		}

		@Override
		public Adapter caseParty(Party object) {
			return createPartyAdapter();
		}

		@Override
		public Adapter caseExternalId(ExternalId object) {
			return createExternalIdAdapter();
		}

		@Override
		public Adapter caseResponsibleParty(ResponsibleParty object) {
			return createResponsiblePartyAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseTest(Test object) {
			return createTestAdapter();
		}

		@Override
		public Adapter casePartition(Partition object) {
			return createPartitionAdapter();
		}

		@Override
		public Adapter caseSelect(Select object) {
			return createSelectAdapter();
		}

		@Override
		public Adapter caseResource(Resource object) {
			return createResourceAdapter();
		}

		@Override
		public Adapter caseCitation(Citation object) {
			return createCitationAdapter();
		}

		@Override
		public Adapter caseRlink(Rlink object) {
			return createRlinkAdapter();
		}

		@Override
		public Adapter caseHash(Hash object) {
			return createHashAdapter();
		}

		@Override
		public Adapter casePropertyOwner(PropertyOwner object) {
			return createPropertyOwnerAdapter();
		}

		@Override
		public Adapter caseParameterOwner(ParameterOwner object) {
			return createParameterOwnerAdapter();
		}

		@Override
		public Adapter caseAnnotationOwner(AnnotationOwner object) {
			return createAnnotationOwnerAdapter();
		}

		@Override
		public Adapter caseLinkOwner(LinkOwner object) {
			return createLinkOwnerAdapter();
		}

		@Override
		public Adapter caseBase64(Base64 object) {
			return createBase64Adapter();
		}

		@Override
		public Adapter caseProfile(Profile object) {
			return createProfileAdapter();
		}

		@Override
		public Adapter caseImport(Import object) {
			return createImportAdapter();
		}

		@Override
		public Adapter caseMerge(Merge object) {
			return createMergeAdapter();
		}

		@Override
		public Adapter caseModify(Modify object) {
			return createModifyAdapter();
		}

		@Override
		public Adapter caseInclude(Include object) {
			return createIncludeAdapter();
		}

		@Override
		public Adapter caseExclude(Exclude object) {
			return createExcludeAdapter();
		}

		@Override
		public Adapter caseAll(All object) {
			return createAllAdapter();
		}

		@Override
		public Adapter caseCall(Call object) {
			return createCallAdapter();
		}

		@Override
		public Adapter caseMatch(Match object) {
			return createMatchAdapter();
		}

		@Override
		public Adapter caseCombine(Combine object) {
			return createCombineAdapter();
		}

		@Override
		public Adapter caseCustom(Custom object) {
			return createCustomAdapter();
		}

		@Override
		public Adapter caseSetParameter(SetParameter object) {
			return createSetParameterAdapter();
		}

		@Override
		public Adapter caseOSCALConstraint(OSCALConstraint object) {
			return createOSCALConstraintAdapter();
		}

		@Override
		public Adapter caseAlter(Alter object) {
			return createAlterAdapter();
		}

		@Override
		public Adapter caseRemove(Remove object) {
			return createRemoveAdapter();
		}

		@Override
		public Adapter caseAddition(Addition object) {
			return createAdditionAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.ControlDefinition <em>Control Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.ControlDefinition
	 * @generated
	 */
	public Adapter createControlDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Remark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Remark
	 * @generated
	 */
	public Adapter createRemarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.BackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.BackMatter
	 * @generated
	 */
	public Adapter createBackMatterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.DocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.DocumentId
	 * @generated
	 */
	public Adapter createDocumentIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Revisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Revisions
	 * @generated
	 */
	public Adapter createRevisionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.TelephoneNumber
	 * @generated
	 */
	public Adapter createTelephoneNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.ExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.ExternalId
	 * @generated
	 */
	public Adapter createExternalIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.ResponsibleParty
	 * @generated
	 */
	public Adapter createResponsiblePartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Select
	 * @generated
	 */
	public Adapter createSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Citation
	 * @generated
	 */
	public Adapter createCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Rlink <em>Rlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Rlink
	 * @generated
	 */
	public Adapter createRlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Hash
	 * @generated
	 */
	public Adapter createHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.PropertyOwner <em>Property Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.PropertyOwner
	 * @generated
	 */
	public Adapter createPropertyOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.ParameterOwner <em>Parameter Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.ParameterOwner
	 * @generated
	 */
	public Adapter createParameterOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.AnnotationOwner <em>Annotation Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.AnnotationOwner
	 * @generated
	 */
	public Adapter createAnnotationOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.LinkOwner <em>Link Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.LinkOwner
	 * @generated
	 */
	public Adapter createLinkOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Base64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Base64
	 * @generated
	 */
	public Adapter createBase64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Merge
	 * @generated
	 */
	public Adapter createMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Modify
	 * @generated
	 */
	public Adapter createModifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Exclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Exclude
	 * @generated
	 */
	public Adapter createExcludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.All
	 * @generated
	 */
	public Adapter createAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Call
	 * @generated
	 */
	public Adapter createCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Combine <em>Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Combine
	 * @generated
	 */
	public Adapter createCombineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Custom
	 * @generated
	 */
	public Adapter createCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.SetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.SetParameter
	 * @generated
	 */
	public Adapter createSetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.OSCALConstraint <em>OSCAL Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.OSCALConstraint
	 * @generated
	 */
	public Adapter createOSCALConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Alter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Alter
	 * @generated
	 */
	public Adapter createAlterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Remove
	 * @generated
	 */
	public Adapter createRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.Addition
	 * @generated
	 */
	public Adapter createAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsm.oscal.model.Oscal.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsm.oscal.model.Oscal.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
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

} //OscalAdapterFactory
