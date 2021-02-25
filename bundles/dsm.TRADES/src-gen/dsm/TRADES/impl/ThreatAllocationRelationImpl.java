/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AssessmentENUM;
import dsm.TRADES.AttackChain;
import dsm.TRADES.Component;
import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;

import dsm.TRADES.util.TRADESValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Allocation Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getImpactscore <em>Impactscore</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getDifficultyscore <em>Difficultyscore</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatAllocationRelationImpl#getAttackChain <em>Attack Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatAllocationRelationImpl extends MinimalEObjectImpl.Container implements ThreatAllocationRelation {
	/**
	 * The default value of the '{@link #getAssessment() <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final AssessmentENUM ASSESSMENT_EDEFAULT = AssessmentENUM.UNDECIDED;

	/**
	 * The cached value of the '{@link #getAssessment() <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected AssessmentENUM assessment = ASSESSMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThreat() <em>Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat()
	 * @generated
	 * @ordered
	 */
	protected Threat threat;

	/**
	 * The cached value of the '{@link #getImpactscore() <em>Impactscore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactscore()
	 * @generated
	 * @ordered
	 */
	protected ImpactScore impactscore;

	/**
	 * The cached value of the '{@link #getDifficultyscore() <em>Difficultyscore</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficultyscore()
	 * @generated
	 * @ordered
	 */
	protected DifficultyScore difficultyscore;

	/**
	 * The cached value of the '{@link #getAttackChain() <em>Attack Chain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackChain()
	 * @generated
	 * @ordered
	 */
	protected AttackChain attackChain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatAllocationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.THREAT_ALLOCATION_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentENUM getAssessment() {
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessment(AssessmentENUM newAssessment) {
		AssessmentENUM oldAssessment = assessment;
		assessment = newAssessment == null ? ASSESSMENT_EDEFAULT : newAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT,
					oldAssessment, assessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponent() {
		if (eContainerFeatureID() != TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT)
			return null;
		return (Component) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newComponent, TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer()
				|| (eContainerFeatureID() != TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT
						&& newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject) newComponent).eInverseAdd(this, TRADESPackage.COMPONENT__THREAT_ALLOCATIONS,
						Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT,
					newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threat getThreat() {
		if (threat != null && threat.eIsProxy()) {
			InternalEObject oldThreat = (InternalEObject) threat;
			threat = (Threat) eResolveProxy(oldThreat);
			if (threat != oldThreat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT, oldThreat, threat));
			}
		}
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat basicGetThreat() {
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreat(Threat newThreat, NotificationChain msgs) {
		Threat oldThreat = threat;
		threat = newThreat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT, oldThreat, newThreat);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreat(Threat newThreat) {
		if (newThreat != threat) {
			NotificationChain msgs = null;
			if (threat != null)
				msgs = ((InternalEObject) threat).eInverseRemove(this, TRADESPackage.THREAT__THREAT_ALLOCATIONS,
						Threat.class, msgs);
			if (newThreat != null)
				msgs = ((InternalEObject) newThreat).eInverseAdd(this, TRADESPackage.THREAT__THREAT_ALLOCATIONS,
						Threat.class, msgs);
			msgs = basicSetThreat(newThreat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT,
					newThreat, newThreat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactScore getImpactscore() {
		if (impactscore != null && impactscore.eIsProxy()) {
			InternalEObject oldImpactscore = (InternalEObject) impactscore;
			impactscore = (ImpactScore) eResolveProxy(oldImpactscore);
			if (impactscore != oldImpactscore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACTSCORE, oldImpactscore, impactscore));
			}
		}
		return impactscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactScore basicGetImpactscore() {
		return impactscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpactscore(ImpactScore newImpactscore) {
		ImpactScore oldImpactscore = impactscore;
		impactscore = newImpactscore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACTSCORE,
					oldImpactscore, impactscore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifficultyScore getDifficultyscore() {
		if (difficultyscore != null && difficultyscore.eIsProxy()) {
			InternalEObject oldDifficultyscore = (InternalEObject) difficultyscore;
			difficultyscore = (DifficultyScore) eResolveProxy(oldDifficultyscore);
			if (difficultyscore != oldDifficultyscore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE, oldDifficultyscore,
							difficultyscore));
			}
		}
		return difficultyscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifficultyScore basicGetDifficultyscore() {
		return difficultyscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficultyscore(DifficultyScore newDifficultyscore) {
		DifficultyScore oldDifficultyscore = difficultyscore;
		difficultyscore = newDifficultyscore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE, oldDifficultyscore, difficultyscore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttackChain getAttackChain() {
		return attackChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttackChain(AttackChain newAttackChain, NotificationChain msgs) {
		AttackChain oldAttackChain = attackChain;
		attackChain = newAttackChain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN, oldAttackChain, newAttackChain);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttackChain(AttackChain newAttackChain) {
		if (newAttackChain != attackChain) {
			NotificationChain msgs = null;
			if (attackChain != null)
				msgs = ((InternalEObject) attackChain).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN, null, msgs);
			if (newAttackChain != null)
				msgs = ((InternalEObject) newAttackChain).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN, null, msgs);
			msgs = basicSetAttackChain(newAttackChain, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN, newAttackChain, newAttackChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkComputedDifficultyConstraint(DiagnosticChain chain, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (chain != null) {
				chain.add(
						new BasicDiagnostic(Diagnostic.ERROR, TRADESValidator.DIAGNOSTIC_SOURCE,
								TRADESValidator.THREAT_ALLOCATION_RELATION__CHECK_COMPUTED_DIFFICULTY_CONSTRAINT,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "checkComputedDifficultyConstraint",
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetComponent((Component) otherEnd, msgs);
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			if (threat != null)
				msgs = ((InternalEObject) threat).eInverseRemove(this, TRADESPackage.THREAT__THREAT_ALLOCATIONS,
						Threat.class, msgs);
			return basicSetThreat((Threat) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			return basicSetComponent(null, msgs);
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			return basicSetThreat(null, msgs);
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			return basicSetAttackChain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			return eInternalContainer().eInverseRemove(this, TRADESPackage.COMPONENT__THREAT_ALLOCATIONS,
					Component.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT:
			return getAssessment();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			return getComponent();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			if (resolve)
				return getThreat();
			return basicGetThreat();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACTSCORE:
			if (resolve)
				return getImpactscore();
			return basicGetImpactscore();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE:
			if (resolve)
				return getDifficultyscore();
			return basicGetDifficultyscore();
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			return getAttackChain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT:
			setAssessment((AssessmentENUM) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			setComponent((Component) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			setThreat((Threat) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACTSCORE:
			setImpactscore((ImpactScore) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE:
			setDifficultyscore((DifficultyScore) newValue);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			setAttackChain((AttackChain) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT:
			setAssessment(ASSESSMENT_EDEFAULT);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			setComponent((Component) null);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			setThreat((Threat) null);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACTSCORE:
			setImpactscore((ImpactScore) null);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE:
			setDifficultyscore((DifficultyScore) null);
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			setAttackChain((AttackChain) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT:
			return assessment != ASSESSMENT_EDEFAULT;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__COMPONENT:
			return getComponent() != null;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			return threat != null;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__IMPACTSCORE:
			return impactscore != null;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE:
			return difficultyscore != null;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAIN:
			return attackChain != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION___CHECK_COMPUTED_DIFFICULTY_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return checkComputedDifficultyConstraint((DiagnosticChain) arguments.get(0), (Map) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (assessment: ");
		result.append(assessment);
		result.append(')');
		return result.toString();
	}

} //ThreatAllocationRelationImpl
