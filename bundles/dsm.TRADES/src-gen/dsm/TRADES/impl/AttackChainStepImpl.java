/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AttackChainStep;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatAllocationRelation;

import dsm.TRADES.util.TRADESValidator;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack Chain Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getStepNum <em>Step Num</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getThreatAllocationRelation <em>Threat Allocation Relation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getImpactDescription <em>Impact Description</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getNext <em>Next</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AttackChainStepImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackChainStepImpl extends MinimalEObjectImpl.Container implements AttackChainStep {
	/**
	 * The default value of the '{@link #getStepNum() <em>Step Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepNum()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreatAllocationRelation() <em>Threat Allocation Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatAllocationRelation()
	 * @generated
	 * @ordered
	 */
	protected ThreatAllocationRelation threatAllocationRelation;

	/**
	 * The default value of the '{@link #getImpactDescription() <em>Impact Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpactDescription() <em>Impact Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactDescription()
	 * @generated
	 * @ordered
	 */
	protected String impactDescription = IMPACT_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackChainStep> next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackChainStep> previous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackChainStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ATTACK_CHAIN_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStepNum() {
		// TODO: implement this method to return the 'Step Num' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepNum(String newStepNum) {
		// TODO: implement this method to set the 'Step Num' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatAllocationRelation getThreatAllocationRelation() {
		if (threatAllocationRelation != null && threatAllocationRelation.eIsProxy()) {
			InternalEObject oldThreatAllocationRelation = (InternalEObject) threatAllocationRelation;
			threatAllocationRelation = (ThreatAllocationRelation) eResolveProxy(oldThreatAllocationRelation);
			if (threatAllocationRelation != oldThreatAllocationRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION, oldThreatAllocationRelation,
							threatAllocationRelation));
			}
		}
		return threatAllocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatAllocationRelation basicGetThreatAllocationRelation() {
		return threatAllocationRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreatAllocationRelation(ThreatAllocationRelation newThreatAllocationRelation) {
		ThreatAllocationRelation oldThreatAllocationRelation = threatAllocationRelation;
		threatAllocationRelation = newThreatAllocationRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION, oldThreatAllocationRelation,
					threatAllocationRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImpactDescription() {
		return impactDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpactDescription(String newImpactDescription) {
		String oldImpactDescription = impactDescription;
		impactDescription = newImpactDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION,
					oldImpactDescription, impactDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackChainStep> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse<AttackChainStep>(AttackChainStep.class, this,
					TRADESPackage.ATTACK_CHAIN_STEP__NEXT, TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackChainStep> getPrevious() {
		if (previous == null) {
			previous = new EObjectWithInverseResolvingEList.ManyInverse<AttackChainStep>(AttackChainStep.class, this,
					TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS, TRADESPackage.ATTACK_CHAIN_STEP__NEXT);
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatAllocationRelation> getThreatAllocationRelationCandidates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkAllocationValue(DiagnosticChain chain, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (chain != null) {
				chain.add(
						new BasicDiagnostic(Diagnostic.ERROR, TRADESValidator.DIAGNOSTIC_SOURCE,
								TRADESValidator.ATTACK_CHAIN_STEP__CHECK_ALLOCATION_VALUE,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "checkAllocationValue",
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNext()).basicAdd(otherEnd, msgs);
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPrevious()).basicAdd(otherEnd, msgs);
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
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			return ((InternalEList<?>) getNext()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			return ((InternalEList<?>) getPrevious()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			return getStepNum();
		case TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION:
			if (resolve)
				return getThreatAllocationRelation();
			return basicGetThreatAllocationRelation();
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			return getImpactDescription();
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			return getNext();
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			return getPrevious();
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			setStepNum((String) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION:
			setThreatAllocationRelation((ThreatAllocationRelation) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			setImpactDescription((String) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			getNext().clear();
			getNext().addAll((Collection<? extends AttackChainStep>) newValue);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			getPrevious().clear();
			getPrevious().addAll((Collection<? extends AttackChainStep>) newValue);
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			setStepNum(STEP_NUM_EDEFAULT);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION:
			setThreatAllocationRelation((ThreatAllocationRelation) null);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			setImpactDescription(IMPACT_DESCRIPTION_EDEFAULT);
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			getNext().clear();
			return;
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			getPrevious().clear();
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
		case TRADESPackage.ATTACK_CHAIN_STEP__STEP_NUM:
			return STEP_NUM_EDEFAULT == null ? getStepNum() != null : !STEP_NUM_EDEFAULT.equals(getStepNum());
		case TRADESPackage.ATTACK_CHAIN_STEP__THREAT_ALLOCATION_RELATION:
			return threatAllocationRelation != null;
		case TRADESPackage.ATTACK_CHAIN_STEP__IMPACT_DESCRIPTION:
			return IMPACT_DESCRIPTION_EDEFAULT == null ? impactDescription != null
					: !IMPACT_DESCRIPTION_EDEFAULT.equals(impactDescription);
		case TRADESPackage.ATTACK_CHAIN_STEP__NEXT:
			return next != null && !next.isEmpty();
		case TRADESPackage.ATTACK_CHAIN_STEP__PREVIOUS:
			return previous != null && !previous.isEmpty();
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
		case TRADESPackage.ATTACK_CHAIN_STEP___GET_THREAT_ALLOCATION_RELATION_CANDIDATES:
			return getThreatAllocationRelationCandidates();
		case TRADESPackage.ATTACK_CHAIN_STEP___CHECK_ALLOCATION_VALUE__DIAGNOSTICCHAIN_MAP:
			return checkAllocationValue((DiagnosticChain) arguments.get(0), (Map) arguments.get(1));
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
		result.append(" (impactDescription: ");
		result.append(impactDescription);
		result.append(')');
		return result.toString();
	}

} //AttackChainStepImpl
