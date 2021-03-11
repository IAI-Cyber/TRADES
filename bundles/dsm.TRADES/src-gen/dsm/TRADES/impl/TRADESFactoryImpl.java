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
package dsm.TRADES.impl;

import dsm.TRADES.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class TRADESFactoryImpl extends EFactoryImpl implements TRADESFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TRADESFactory init() {
		try {
			TRADESFactory theTRADESFactory = (TRADESFactory) EPackage.Registry.INSTANCE
					.getEFactory(TRADESPackage.eNS_URI);
			if (theTRADESFactory != null) {
				return theTRADESFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TRADESFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRADESFactoryImpl() {
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
		case TRADESPackage.ANALYSIS:
			return createAnalysis();
		case TRADESPackage.THREAT:
			return createThreat();
		case TRADESPackage.COMPONENT:
			return createComponent();
		case TRADESPackage.CONTROL:
			return createControl();
		case TRADESPackage.THREAT_ALLOCATION_RELATION:
			return createThreatAllocationRelation();
		case TRADESPackage.THREAT_MITIGATION_RELATION:
			return createThreatMitigationRelation();
		case TRADESPackage.DATA:
			return createData();
		case TRADESPackage.AFFECT_RELATION:
			return createAffectRelation();
		case TRADESPackage.ATTACK_CHAIN:
			return createAttackChain();
		case TRADESPackage.ATTACK_CHAIN_STEP:
			return createAttackChainStep();
		case TRADESPackage.SCORE_SYSTEM:
			return createScoreSystem();
		case TRADESPackage.IMPACT_SCORE:
			return createImpactScore();
		case TRADESPackage.DIFFICULTY_SCORE:
			return createDifficultyScore();
		case TRADESPackage.EXTERNAL_THREAT:
			return createExternalThreat();
		case TRADESPackage.IMPACT_CONFIGURATION:
			return createImpactConfiguration();
		case TRADESPackage.EXTERNAL_CONTROL:
			return createExternalControl();
		case TRADESPackage.THREATS_OWNER:
			return createThreatsOwner();
		case TRADESPackage.CONTROL_OWNER:
			return createControlOwner();
		case TRADESPackage.DATA_OWNER:
			return createDataOwner();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TRADESPackage.ASSESSMENT_ENUM:
			return createAssessmentENUMFromString(eDataType, initialValue);
		case TRADESPackage.AFFECTED_ENUM:
			return createAffectedENUMFromString(eDataType, initialValue);
		case TRADESPackage.THREAT_TYPE_ENUM:
			return createthreatTypeENUMFromString(eDataType, initialValue);
		case TRADESPackage.RGB_COLOR:
			return createRGBColorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TRADESPackage.ASSESSMENT_ENUM:
			return convertAssessmentENUMToString(eDataType, instanceValue);
		case TRADESPackage.AFFECTED_ENUM:
			return convertAffectedENUMToString(eDataType, instanceValue);
		case TRADESPackage.THREAT_TYPE_ENUM:
			return convertthreatTypeENUMToString(eDataType, instanceValue);
		case TRADESPackage.RGB_COLOR:
			return convertRGBColorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Analysis createAnalysis() {
		AnalysisCustomImpl analysis = new AnalysisCustomImpl();
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threat createThreat() {
		ThreatCustomImpl threat = new ThreatCustomImpl();
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentCustomImpl component = new ComponentCustomImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatAllocationRelation createThreatAllocationRelation() {
		ThreatAllocationRelationCustomImpl threatAllocationRelation = new ThreatAllocationRelationCustomImpl();
		return threatAllocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatMitigationRelation createThreatMitigationRelation() {
		ThreatMitigationRelationImpl threatMitigationRelation = new ThreatMitigationRelationImpl();
		return threatMitigationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffectRelation createAffectRelation() {
		AffectRelationCustomImpl affectRelation = new AffectRelationCustomImpl();
		return affectRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChain createAttackChain() {
		AttackChainCustomImpl attackChain = new AttackChainCustomImpl();
		return attackChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChainStep createAttackChainStep() {
		AttackChainStepCustomImpl attackChainStep = new AttackChainStepCustomImpl();
		return attackChainStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScoreSystem createScoreSystem() {
		ScoreSystemImpl scoreSystem = new ScoreSystemImpl();
		return scoreSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactScore createImpactScore() {
		ImpactScoreImpl impactScore = new ImpactScoreImpl();
		return impactScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifficultyScore createDifficultyScore() {
		DifficultyScoreImpl difficultyScore = new DifficultyScoreImpl();
		return difficultyScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalThreat createExternalThreat() {
		ExternalThreatImpl externalThreat = new ExternalThreatImpl();
		return externalThreat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactConfiguration createImpactConfiguration() {
		ImpactConfigurationImpl impactConfiguration = new ImpactConfigurationImpl();
		return impactConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalControl createExternalControl() {
		ExternalControlImpl externalControl = new ExternalControlImpl();
		return externalControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatsOwner createThreatsOwner() {
		ThreatsOwnerImpl threatsOwner = new ThreatsOwnerImpl();
		return threatsOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlOwner createControlOwner() {
		ControlOwnerImpl controlOwner = new ControlOwnerImpl();
		return controlOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataOwner createDataOwner() {
		DataOwnerImpl dataOwner = new DataOwnerImpl();
		return dataOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentENUM createAssessmentENUMFromString(EDataType eDataType, String initialValue) {
		AssessmentENUM result = AssessmentENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssessmentENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectedENUM createAffectedENUMFromString(EDataType eDataType, String initialValue) {
		AffectedENUM result = AffectedENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffectedENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public threatTypeENUM createthreatTypeENUMFromString(EDataType eDataType, String initialValue) {
		threatTypeENUM result = threatTypeENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertthreatTypeENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor createRGBColor(final String it) {
		return RGBColor.decode(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBColor createRGBColorFromString(EDataType eDataType, String initialValue) {
		return createRGBColor(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRGBColor(final RGBColor it) {
		return it == null ? "" : it.encode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRGBColorToString(EDataType eDataType, Object instanceValue) {
		return convertRGBColor((RGBColor) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRADESPackage getTRADESPackage() {
		return (TRADESPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TRADESPackage getPackage() {
		return TRADESPackage.eINSTANCE;
	}

} //TRADESFactoryImpl
