/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AssessmentENUM;
import dsm.TRADES.Control;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Mitigation Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getControl <em>Control</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getMitigatedAllocation <em>Mitigated Allocation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ThreatMitigationRelationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatMitigationRelationImpl extends MinimalEObjectImpl.Container implements ThreatMitigationRelation {
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
	 * The cached value of the '{@link #getMitigatedAllocation() <em>Mitigated Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigatedAllocation()
	 * @generated
	 * @ordered
	 */
	protected ThreatAllocationRelation mitigatedAllocation;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatMitigationRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.THREAT_MITIGATION_RELATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT,
					oldAssessment, assessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control getControl() {
		if (eContainerFeatureID() != TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL)
			return null;
		return (Control) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(Control newControl, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newControl, TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControl(Control newControl) {
		if (newControl != eInternalContainer()
				|| (eContainerFeatureID() != TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL && newControl != null)) {
			if (EcoreUtil.isAncestor(this, newControl))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newControl != null)
				msgs = ((InternalEObject) newControl).eInverseAdd(this, TRADESPackage.CONTROL__MITIGATION_RELATIONS,
						Control.class, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL,
					newControl, newControl));
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
							TRADESPackage.THREAT_MITIGATION_RELATION__THREAT, oldThreat, threat));
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
	@Override
	public void setThreat(Threat newThreat) {
		Threat oldThreat = threat;
		threat = newThreat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_MITIGATION_RELATION__THREAT,
					oldThreat, threat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreatAllocationRelation getMitigatedAllocation() {
		if (mitigatedAllocation != null && mitigatedAllocation.eIsProxy()) {
			InternalEObject oldMitigatedAllocation = (InternalEObject) mitigatedAllocation;
			mitigatedAllocation = (ThreatAllocationRelation) eResolveProxy(oldMitigatedAllocation);
			if (mitigatedAllocation != oldMitigatedAllocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION, oldMitigatedAllocation,
							mitigatedAllocation));
			}
		}
		return mitigatedAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatAllocationRelation basicGetMitigatedAllocation() {
		return mitigatedAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMitigatedAllocation(ThreatAllocationRelation newMitigatedAllocation) {
		ThreatAllocationRelation oldMitigatedAllocation = mitigatedAllocation;
		mitigatedAllocation = newMitigatedAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION, oldMitigatedAllocation,
					mitigatedAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.THREAT_MITIGATION_RELATION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetControl((Control) otherEnd, msgs);
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
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			return basicSetControl(null, msgs);
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
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			return eInternalContainer().eInverseRemove(this, TRADESPackage.CONTROL__MITIGATION_RELATIONS, Control.class,
					msgs);
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
		case TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT:
			return getAssessment();
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			return getControl();
		case TRADESPackage.THREAT_MITIGATION_RELATION__THREAT:
			if (resolve)
				return getThreat();
			return basicGetThreat();
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION:
			if (resolve)
				return getMitigatedAllocation();
			return basicGetMitigatedAllocation();
		case TRADESPackage.THREAT_MITIGATION_RELATION__DESCRIPTION:
			return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT:
			setAssessment((AssessmentENUM) newValue);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			setControl((Control) newValue);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__THREAT:
			setThreat((Threat) newValue);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION:
			setMitigatedAllocation((ThreatAllocationRelation) newValue);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__DESCRIPTION:
			setDescription((String) newValue);
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
		case TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT:
			setAssessment(ASSESSMENT_EDEFAULT);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			setControl((Control) null);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__THREAT:
			setThreat((Threat) null);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION:
			setMitigatedAllocation((ThreatAllocationRelation) null);
			return;
		case TRADESPackage.THREAT_MITIGATION_RELATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT:
			return assessment != ASSESSMENT_EDEFAULT;
		case TRADESPackage.THREAT_MITIGATION_RELATION__CONTROL:
			return getControl() != null;
		case TRADESPackage.THREAT_MITIGATION_RELATION__THREAT:
			return threat != null;
		case TRADESPackage.THREAT_MITIGATION_RELATION__MITIGATED_ALLOCATION:
			return mitigatedAllocation != null;
		case TRADESPackage.THREAT_MITIGATION_RELATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ThreatMitigationRelationImpl
