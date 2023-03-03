/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */
package dsm.TRADES.util;

import dsm.TRADES.*;

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
 * @see dsm.TRADES.TRADESPackage
 * @generated
 */
public class TRADESSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TRADESPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRADESSwitch() {
		if (modelPackage == null) {
			modelPackage = TRADESPackage.eINSTANCE;
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
		case TRADESPackage.ANALYSIS: {
			Analysis analysis = (Analysis) theEObject;
			T result = caseAnalysis(analysis);
			if (result == null)
				result = caseComponentOwner(analysis);
			if (result == null)
				result = caseDataOwnerElement(analysis);
			if (result == null)
				result = caseNamedElement(analysis);
			if (result == null)
				result = caseAbstractControlOwner(analysis);
			if (result == null)
				result = caseAbstractThreatOwner(analysis);
			if (result == null)
				result = caseElementWithId(analysis);
			if (result == null)
				result = caseVulnerabilityOwner(analysis);
			if (result == null)
				result = caseComponentTypeOwner(analysis);
			if (result == null)
				result = caseVAOwner(analysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.THREAT: {
			Threat threat = (Threat) theEObject;
			T result = caseThreat(threat);
			if (result == null)
				result = caseNamedElement(threat);
			if (result == null)
				result = caseIThreatDefinition(threat);
			if (result == null)
				result = caseElementWithId(threat);
			if (result == null)
				result = caseIElementWithSource(threat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseComponentOwner(component);
			if (result == null)
				result = caseDataOwnerElement(component);
			if (result == null)
				result = caseAbstractControlOwner(component);
			if (result == null)
				result = caseDomainAsset(component);
			if (result == null)
				result = caseAsset(component);
			if (result == null)
				result = caseNamedElement(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.CONTROL: {
			Control control = (Control) theEObject;
			T result = caseControl(control);
			if (result == null)
				result = caseNamedElement(control);
			if (result == null)
				result = caseIControlDefinition(control);
			if (result == null)
				result = caseElementWithId(control);
			if (result == null)
				result = caseIElementWithSource(control);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.THREAT_ALLOCATION_RELATION: {
			ThreatAllocationRelation threatAllocationRelation = (ThreatAllocationRelation) theEObject;
			T result = caseThreatAllocationRelation(threatAllocationRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.THREAT_MITIGATION_RELATION: {
			ThreatMitigationRelation threatMitigationRelation = (ThreatMitigationRelation) theEObject;
			T result = caseThreatMitigationRelation(threatMitigationRelation);
			if (result == null)
				result = caseIMitigationLink(threatMitigationRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = caseDomainAsset(data);
			if (result == null)
				result = caseAsset(data);
			if (result == null)
				result = caseNamedElement(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.AFFECT_RELATION: {
			AffectRelation affectRelation = (AffectRelation) theEObject;
			T result = caseAffectRelation(affectRelation);
			if (result == null)
				result = caseNamedElement(affectRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.ATTACK_CHAIN: {
			AttackChain attackChain = (AttackChain) theEObject;
			T result = caseAttackChain(attackChain);
			if (result == null)
				result = caseNamedElement(attackChain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.ATTACK_CHAIN_STEP: {
			AttackChainStep attackChainStep = (AttackChainStep) theEObject;
			T result = caseAttackChainStep(attackChainStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.SCORE_SYSTEM: {
			ScoreSystem scoreSystem = (ScoreSystem) theEObject;
			T result = caseScoreSystem(scoreSystem);
			if (result == null)
				result = caseNamedElement(scoreSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.IMPACT_SCORE: {
			ImpactScore impactScore = (ImpactScore) theEObject;
			T result = caseImpactScore(impactScore);
			if (result == null)
				result = caseNamedElement(impactScore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.DIFFICULTY_SCORE: {
			DifficultyScore difficultyScore = (DifficultyScore) theEObject;
			T result = caseDifficultyScore(difficultyScore);
			if (result == null)
				result = caseNamedElement(difficultyScore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.DATA_OWNER_ELEMENT: {
			DataOwnerElement dataOwnerElement = (DataOwnerElement) theEObject;
			T result = caseDataOwnerElement(dataOwnerElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.COMPONENT_OWNER: {
			ComponentOwner componentOwner = (ComponentOwner) theEObject;
			T result = caseComponentOwner(componentOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.EXTERNAL_THREAT: {
			ExternalThreat externalThreat = (ExternalThreat) theEObject;
			T result = caseExternalThreat(externalThreat);
			if (result == null)
				result = caseThreat(externalThreat);
			if (result == null)
				result = caseExternalElement(externalThreat);
			if (result == null)
				result = caseNamedElement(externalThreat);
			if (result == null)
				result = caseIThreatDefinition(externalThreat);
			if (result == null)
				result = caseElementWithId(externalThreat);
			if (result == null)
				result = caseIElementWithSource(externalThreat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.EXTERNAL_ELEMENT: {
			ExternalElement externalElement = (ExternalElement) theEObject;
			T result = caseExternalElement(externalElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.IMPACT_CONFIGURATION: {
			ImpactConfiguration impactConfiguration = (ImpactConfiguration) theEObject;
			T result = caseImpactConfiguration(impactConfiguration);
			if (result == null)
				result = caseColoredElement(impactConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.EXTERNAL_CONTROL: {
			ExternalControl externalControl = (ExternalControl) theEObject;
			T result = caseExternalControl(externalControl);
			if (result == null)
				result = caseExternalElement(externalControl);
			if (result == null)
				result = caseControl(externalControl);
			if (result == null)
				result = caseNamedElement(externalControl);
			if (result == null)
				result = caseIControlDefinition(externalControl);
			if (result == null)
				result = caseElementWithId(externalControl);
			if (result == null)
				result = caseIElementWithSource(externalControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.THREATS_OWNER: {
			ThreatsOwner threatsOwner = (ThreatsOwner) theEObject;
			T result = caseThreatsOwner(threatsOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.CONTROL_OWNER: {
			ControlOwner controlOwner = (ControlOwner) theEObject;
			T result = caseControlOwner(controlOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.ABSTRACT_CONTROL_OWNER: {
			AbstractControlOwner abstractControlOwner = (AbstractControlOwner) theEObject;
			T result = caseAbstractControlOwner(abstractControlOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.DATA_OWNER: {
			DataOwner dataOwner = (DataOwner) theEObject;
			T result = caseDataOwner(dataOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.LINK: {
			Link link = (Link) theEObject;
			T result = caseLink(link);
			if (result == null)
				result = caseNamedElement(link);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.LINK_TYPE: {
			LinkType linkType = (LinkType) theEObject;
			T result = caseLinkType(linkType);
			if (result == null)
				result = caseNamedElement(linkType);
			if (result == null)
				result = caseColoredElement(linkType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.CATALOG: {
			Catalog catalog = (Catalog) theEObject;
			T result = caseCatalog(catalog);
			if (result == null)
				result = caseAbstractThreatOwner(catalog);
			if (result == null)
				result = caseAbstractControlOwner(catalog);
			if (result == null)
				result = caseNamedElement(catalog);
			if (result == null)
				result = caseICatalogDefinition(catalog);
			if (result == null)
				result = caseElementWithId(catalog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.ABSTRACT_THREAT_OWNER: {
			AbstractThreatOwner abstractThreatOwner = (AbstractThreatOwner) theEObject;
			T result = caseAbstractThreatOwner(abstractThreatOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.ITHREAT_DEFINITION: {
			IThreatDefinition iThreatDefinition = (IThreatDefinition) theEObject;
			T result = caseIThreatDefinition(iThreatDefinition);
			if (result == null)
				result = caseIElementWithSource(iThreatDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.ICONTROL_DEFINITION: {
			IControlDefinition iControlDefinition = (IControlDefinition) theEObject;
			T result = caseIControlDefinition(iControlDefinition);
			if (result == null)
				result = caseIElementWithSource(iControlDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.ICATALOG_DEFINITION: {
			ICatalogDefinition iCatalogDefinition = (ICatalogDefinition) theEObject;
			T result = caseICatalogDefinition(iCatalogDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.IMITIGATION_LINK: {
			IMitigationLink iMitigationLink = (IMitigationLink) theEObject;
			T result = caseIMitigationLink(iMitigationLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.COLORED_ELEMENT: {
			ColoredElement coloredElement = (ColoredElement) theEObject;
			T result = caseColoredElement(coloredElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.IELEMENT_WITH_SOURCE: {
			IElementWithSource iElementWithSource = (IElementWithSource) theEObject;
			T result = caseIElementWithSource(iElementWithSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.ELEMENT_WITH_ID: {
			ElementWithId elementWithId = (ElementWithId) theEObject;
			T result = caseElementWithId(elementWithId);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.DOMAIN_ASSET: {
			DomainAsset domainAsset = (DomainAsset) theEObject;
			T result = caseDomainAsset(domainAsset);
			if (result == null)
				result = caseAsset(domainAsset);
			if (result == null)
				result = caseNamedElement(domainAsset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.VULNERABILITY_OWNER: {
			VulnerabilityOwner vulnerabilityOwner = (VulnerabilityOwner) theEObject;
			T result = caseVulnerabilityOwner(vulnerabilityOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.VULNERABILITY: {
			Vulnerability vulnerability = (Vulnerability) theEObject;
			T result = caseVulnerability(vulnerability);
			if (result == null)
				result = caseNamedElement(vulnerability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.COMPONENT_TYPE_OWNER: {
			ComponentTypeOwner componentTypeOwner = (ComponentTypeOwner) theEObject;
			T result = caseComponentTypeOwner(componentTypeOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.COMPONENT_TYPE: {
			ComponentType componentType = (ComponentType) theEObject;
			T result = caseComponentType(componentType);
			if (result == null)
				result = caseNamedElement(componentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.ASSET: {
			Asset asset = (Asset) theEObject;
			T result = caseAsset(asset);
			if (result == null)
				result = caseNamedElement(asset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.VULNERABLE_ASSET: {
			VulnerableAsset vulnerableAsset = (VulnerableAsset) theEObject;
			T result = caseVulnerableAsset(vulnerableAsset);
			if (result == null)
				result = caseAsset(vulnerableAsset);
			if (result == null)
				result = caseNamedElement(vulnerableAsset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TRADESPackage.VA_OWNER: {
			VAOwner vaOwner = (VAOwner) theEObject;
			T result = caseVAOwner(vaOwner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysis(Analysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreat(Threat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat Allocation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat Allocation Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreatAllocationRelation(ThreatAllocationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threat Mitigation Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threat Mitigation Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreatMitigationRelation(ThreatMitigationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affect Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affect Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffectRelation(AffectRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attack Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackChain(AttackChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attack Chain Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack Chain Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackChainStep(AttackChainStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScoreSystem(ScoreSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impact Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impact Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpactScore(ImpactScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difficulty Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difficulty Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifficultyScore(DifficultyScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Owner Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Owner Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOwnerElement(DataOwnerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOwner(ComponentOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Threat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Threat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalThreat(ExternalThreat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalElement(ExternalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impact Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impact Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpactConfiguration(ImpactConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalControl(ExternalControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threats Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threats Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreatsOwner(ThreatsOwner object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Control Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Control Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractControlOwner(AbstractControlOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOwner(DataOwner object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalog(Catalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Threat Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Threat Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractThreatOwner(AbstractThreatOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IThreat Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IThreat Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIThreatDefinition(IThreatDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IControl Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IControl Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIControlDefinition(IControlDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICatalog Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICatalog Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICatalogDefinition(ICatalogDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMitigation Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMitigation Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMitigationLink(IMitigationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colored Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colored Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColoredElement(ColoredElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IElement With Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IElement With Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIElementWithSource(IElementWithSource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAsset(DomainAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerability Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerability Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerabilityOwner(VulnerabilityOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerability(Vulnerability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentTypeOwner(ComponentTypeOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerable Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerable Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerableAsset(VulnerableAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VA Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VA Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVAOwner(VAOwner object) {
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

} //TRADESSwitch
