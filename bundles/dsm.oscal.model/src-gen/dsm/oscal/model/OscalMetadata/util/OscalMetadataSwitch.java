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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage
 * @generated
 */
public class OscalMetadataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OscalMetadataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscalMetadataSwitch() {
		if (modelPackage == null) {
			modelPackage = OscalMetadataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OscalMetadataPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseOscalElement(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.BACK_MATTER: {
				BackMatter backMatter = (BackMatter)theEObject;
				T result = caseBackMatter(backMatter);
				if (result == null) result = caseOscalElement(backMatter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.BACK_MATTER_RESOURCE: {
				BackMatterResource backMatterResource = (BackMatterResource)theEObject;
				T result = caseBackMatterResource(backMatterResource);
				if (result == null) result = caseOscalElement(backMatterResource);
				if (result == null) result = caseUUIDElement(backMatterResource);
				if (result == null) result = casePropertyOwner(backMatterResource);
				if (result == null) result = caseElementWithRemarks(backMatterResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.BASE64: {
				Base64 base64 = (Base64)theEObject;
				T result = caseBase64(base64);
				if (result == null) result = caseOscalElement(base64);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.CONTROL_OWNER: {
				ControlOwner controlOwner = (ControlOwner)theEObject;
				T result = caseControlOwner(controlOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.DOCUMENT_ID: {
				DocumentId documentId = (DocumentId)theEObject;
				T result = caseDocumentId(documentId);
				if (result == null) result = caseOscalElement(documentId);
				if (result == null) result = caseElementWithValue(documentId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.DOCUMENTATION_COMPUTER: {
				DocumentationComputer documentationComputer = (DocumentationComputer)theEObject;
				T result = caseDocumentationComputer(documentationComputer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.ELEMENT_WITH_CLAZZ: {
				ElementWithClazz elementWithClazz = (ElementWithClazz)theEObject;
				T result = caseElementWithClazz(elementWithClazz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.ELEMENT_WITH_ID: {
				ElementWithId elementWithId = (ElementWithId)theEObject;
				T result = caseElementWithId(elementWithId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.ELEMENT_WITH_REMARKS: {
				ElementWithRemarks elementWithRemarks = (ElementWithRemarks)theEObject;
				T result = caseElementWithRemarks(elementWithRemarks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.ELEMENT_WITH_VALUE: {
				ElementWithValue elementWithValue = (ElementWithValue)theEObject;
				T result = caseElementWithValue(elementWithValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.EXTERNAL_ID: {
				ExternalId externalId = (ExternalId)theEObject;
				T result = caseExternalId(externalId);
				if (result == null) result = caseOscalElement(externalId);
				if (result == null) result = caseElementWithValue(externalId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.HASH: {
				Hash hash = (Hash)theEObject;
				T result = caseHash(hash);
				if (result == null) result = caseOscalElement(hash);
				if (result == null) result = caseElementWithValue(hash);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseOscalElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.LINK_OWNER: {
				LinkOwner linkOwner = (LinkOwner)theEObject;
				T result = caseLinkOwner(linkOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseOscalElement(location);
				if (result == null) result = caseUUIDElement(location);
				if (result == null) result = casePropertyOwner(location);
				if (result == null) result = caseLinkOwner(location);
				if (result == null) result = caseElementWithRemarks(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = caseOscalElement(metadata);
				if (result == null) result = casePropertyOwner(metadata);
				if (result == null) result = caseLinkOwner(metadata);
				if (result == null) result = caseElementWithRemarks(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.OSCAL_ELEMENT: {
				OscalElement oscalElement = (OscalElement)theEObject;
				T result = caseOscalElement(oscalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.PARAMETER_OWNER: {
				ParameterOwner parameterOwner = (ParameterOwner)theEObject;
				T result = caseParameterOwner(parameterOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.PART_OWNER: {
				PartOwner partOwner = (PartOwner)theEObject;
				T result = casePartOwner(partOwner);
				if (result == null) result = caseDocumentationComputer(partOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.PARTY: {
				Party party = (Party)theEObject;
				T result = caseParty(party);
				if (result == null) result = caseOscalElement(party);
				if (result == null) result = caseUUIDElement(party);
				if (result == null) result = casePropertyOwner(party);
				if (result == null) result = caseLinkOwner(party);
				if (result == null) result = caseElementWithRemarks(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseOscalElement(property);
				if (result == null) result = caseUUIDElement(property);
				if (result == null) result = caseElementWithRemarks(property);
				if (result == null) result = caseElementWithValue(property);
				if (result == null) result = caseElementWithClazz(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.PROPERTY_OWNER: {
				PropertyOwner propertyOwner = (PropertyOwner)theEObject;
				T result = casePropertyOwner(propertyOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.RESOURCE_CITATION: {
				ResourceCitation resourceCitation = (ResourceCitation)theEObject;
				T result = caseResourceCitation(resourceCitation);
				if (result == null) result = caseOscalElement(resourceCitation);
				if (result == null) result = casePropertyOwner(resourceCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.RESOURCE_RLINK: {
				ResourceRlink resourceRlink = (ResourceRlink)theEObject;
				T result = caseResourceRlink(resourceRlink);
				if (result == null) result = caseOscalElement(resourceRlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.RESPONSIBLE_PARTY: {
				ResponsibleParty responsibleParty = (ResponsibleParty)theEObject;
				T result = caseResponsibleParty(responsibleParty);
				if (result == null) result = caseOscalElement(responsibleParty);
				if (result == null) result = casePropertyOwner(responsibleParty);
				if (result == null) result = caseLinkOwner(responsibleParty);
				if (result == null) result = caseElementWithRemarks(responsibleParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.RESPONSIBLE_ROLE: {
				ResponsibleRole responsibleRole = (ResponsibleRole)theEObject;
				T result = caseResponsibleRole(responsibleRole);
				if (result == null) result = caseOscalElement(responsibleRole);
				if (result == null) result = casePropertyOwner(responsibleRole);
				if (result == null) result = caseLinkOwner(responsibleRole);
				if (result == null) result = caseElementWithRemarks(responsibleRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.REVISION: {
				Revision revision = (Revision)theEObject;
				T result = caseRevision(revision);
				if (result == null) result = caseOscalElement(revision);
				if (result == null) result = casePropertyOwner(revision);
				if (result == null) result = caseLinkOwner(revision);
				if (result == null) result = caseElementWithRemarks(revision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseOscalElement(role);
				if (result == null) result = casePropertyOwner(role);
				if (result == null) result = caseLinkOwner(role);
				if (result == null) result = caseElementWithRemarks(role);
				if (result == null) result = caseElementWithId(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.TELEPHONE_NUMBER: {
				TelephoneNumber telephoneNumber = (TelephoneNumber)theEObject;
				T result = caseTelephoneNumber(telephoneNumber);
				if (result == null) result = caseOscalElement(telephoneNumber);
				if (result == null) result = caseElementWithValue(telephoneNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OscalMetadataPackage.UUID_ELEMENT: {
				UUIDElement uuidElement = (UUIDElement)theEObject;
				T result = caseUUIDElement(uuidElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back Matter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back Matter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackMatter(BackMatter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back Matter Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back Matter Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackMatterResource(BackMatterResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base64</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base64</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBase64(Base64 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlOwner(ControlOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentId(DocumentId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationComputer(DocumentationComputer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element With Clazz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element With Clazz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementWithClazz(ElementWithClazz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element With Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element With Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementWithId(ElementWithId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element With Remarks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element With Remarks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementWithRemarks(ElementWithRemarks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element With Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element With Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementWithValue(ElementWithValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalId(ExternalId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hash</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hash</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHash(Hash object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkOwner(LinkOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oscal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oscal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscalElement(OscalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterOwner(ParameterOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartOwner(PartOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParty(Party object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyOwner(PropertyOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceCitation(ResourceCitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Rlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Rlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRlink(ResourceRlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibleParty(ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibleRole(ResponsibleRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision(Revision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telephone Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telephone Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelephoneNumber(TelephoneNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UUID Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UUID Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUUIDElement(UUIDElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OscalMetadataSwitch
