/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AffectRelation;
import dsm.TRADES.Analysis;
import dsm.TRADES.AnalysisDiagram;
import dsm.TRADES.AttackChain;
import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.Data;
import dsm.TRADES.ScoreSystem;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;
import dsm.TRADES.ThreatMitigationRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getControl <em>Control</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getThreatallocation <em>Threatallocation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getThreatmitigation <em>Threatmitigation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getData <em>Data</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getAffectrelation <em>Affectrelation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getAnalysisdiagram <em>Analysisdiagram</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getAttackchain <em>Attackchain</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisImpl#getScoresystem <em>Scoresystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisImpl extends MinimalEObjectImpl.Container implements Analysis {
	/**
	 * The cached value of the '{@link #getThreat() <em>Threat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> threat;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> control;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThreatallocation() <em>Threatallocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatallocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatAllocationRelation> threatallocation;

	/**
	 * The cached value of the '{@link #getThreatmitigation() <em>Threatmitigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatmitigation()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatMitigationRelation> threatmitigation;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getAffectrelation() <em>Affectrelation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectrelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AffectRelation> affectrelation;

	/**
	 * The cached value of the '{@link #getAnalysisdiagram() <em>Analysisdiagram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisdiagram()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisDiagram> analysisdiagram;

	/**
	 * The cached value of the '{@link #getAttackchain() <em>Attackchain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackchain()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackChain> attackchain;

	/**
	 * The cached value of the '{@link #getScoresystem() <em>Scoresystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoresystem()
	 * @generated
	 * @ordered
	 */
	protected ScoreSystem scoresystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getThreat() {
		if (threat == null) {
			threat = new EObjectContainmentEList<Threat>(Threat.class, this, TRADESPackage.ANALYSIS__THREAT);
		}
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this,
					TRADESPackage.ANALYSIS__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControl() {
		if (control == null) {
			control = new EObjectContainmentEList<Control>(Control.class, this, TRADESPackage.ANALYSIS__CONTROL);
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatAllocationRelation> getThreatallocation() {
		if (threatallocation == null) {
			threatallocation = new EObjectContainmentEList<ThreatAllocationRelation>(ThreatAllocationRelation.class,
					this, TRADESPackage.ANALYSIS__THREATALLOCATION);
		}
		return threatallocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatMitigationRelation> getThreatmitigation() {
		if (threatmitigation == null) {
			threatmitigation = new EObjectContainmentEList<ThreatMitigationRelation>(ThreatMitigationRelation.class,
					this, TRADESPackage.ANALYSIS__THREATMITIGATION);
		}
		return threatmitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, TRADESPackage.ANALYSIS__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AffectRelation> getAffectrelation() {
		if (affectrelation == null) {
			affectrelation = new EObjectContainmentEList<AffectRelation>(AffectRelation.class, this,
					TRADESPackage.ANALYSIS__AFFECTRELATION);
		}
		return affectrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnalysisDiagram> getAnalysisdiagram() {
		if (analysisdiagram == null) {
			analysisdiagram = new EObjectContainmentEList<AnalysisDiagram>(AnalysisDiagram.class, this,
					TRADESPackage.ANALYSIS__ANALYSISDIAGRAM);
		}
		return analysisdiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackChain> getAttackchain() {
		if (attackchain == null) {
			attackchain = new EObjectContainmentEList<AttackChain>(AttackChain.class, this,
					TRADESPackage.ANALYSIS__ATTACKCHAIN);
		}
		return attackchain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScoreSystem getScoresystem() {
		return scoresystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoresystem(ScoreSystem newScoresystem, NotificationChain msgs) {
		ScoreSystem oldScoresystem = scoresystem;
		scoresystem = newScoresystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.ANALYSIS__SCORESYSTEM, oldScoresystem, newScoresystem);
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
	public void setScoresystem(ScoreSystem newScoresystem) {
		if (newScoresystem != scoresystem) {
			NotificationChain msgs = null;
			if (scoresystem != null)
				msgs = ((InternalEObject) scoresystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__SCORESYSTEM, null, msgs);
			if (newScoresystem != null)
				msgs = ((InternalEObject) newScoresystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.ANALYSIS__SCORESYSTEM, null, msgs);
			msgs = basicSetScoresystem(newScoresystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.ANALYSIS__SCORESYSTEM, newScoresystem,
					newScoresystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.ANALYSIS__THREAT:
			return ((InternalEList<?>) getThreat()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__CONTROL:
			return ((InternalEList<?>) getControl()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__THREATALLOCATION:
			return ((InternalEList<?>) getThreatallocation()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__THREATMITIGATION:
			return ((InternalEList<?>) getThreatmitigation()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			return ((InternalEList<?>) getAffectrelation()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__ANALYSISDIAGRAM:
			return ((InternalEList<?>) getAnalysisdiagram()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__ATTACKCHAIN:
			return ((InternalEList<?>) getAttackchain()).basicRemove(otherEnd, msgs);
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			return basicSetScoresystem(null, msgs);
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
		case TRADESPackage.ANALYSIS__THREAT:
			return getThreat();
		case TRADESPackage.ANALYSIS__COMPONENT:
			return getComponent();
		case TRADESPackage.ANALYSIS__CONTROL:
			return getControl();
		case TRADESPackage.ANALYSIS__NAME:
			return getName();
		case TRADESPackage.ANALYSIS__THREATALLOCATION:
			return getThreatallocation();
		case TRADESPackage.ANALYSIS__THREATMITIGATION:
			return getThreatmitigation();
		case TRADESPackage.ANALYSIS__DATA:
			return getData();
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			return getAffectrelation();
		case TRADESPackage.ANALYSIS__ANALYSISDIAGRAM:
			return getAnalysisdiagram();
		case TRADESPackage.ANALYSIS__ATTACKCHAIN:
			return getAttackchain();
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			return getScoresystem();
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
		case TRADESPackage.ANALYSIS__THREAT:
			getThreat().clear();
			getThreat().addAll((Collection<? extends Threat>) newValue);
			return;
		case TRADESPackage.ANALYSIS__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case TRADESPackage.ANALYSIS__CONTROL:
			getControl().clear();
			getControl().addAll((Collection<? extends Control>) newValue);
			return;
		case TRADESPackage.ANALYSIS__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.ANALYSIS__THREATALLOCATION:
			getThreatallocation().clear();
			getThreatallocation().addAll((Collection<? extends ThreatAllocationRelation>) newValue);
			return;
		case TRADESPackage.ANALYSIS__THREATMITIGATION:
			getThreatmitigation().clear();
			getThreatmitigation().addAll((Collection<? extends ThreatMitigationRelation>) newValue);
			return;
		case TRADESPackage.ANALYSIS__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			getAffectrelation().clear();
			getAffectrelation().addAll((Collection<? extends AffectRelation>) newValue);
			return;
		case TRADESPackage.ANALYSIS__ANALYSISDIAGRAM:
			getAnalysisdiagram().clear();
			getAnalysisdiagram().addAll((Collection<? extends AnalysisDiagram>) newValue);
			return;
		case TRADESPackage.ANALYSIS__ATTACKCHAIN:
			getAttackchain().clear();
			getAttackchain().addAll((Collection<? extends AttackChain>) newValue);
			return;
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			setScoresystem((ScoreSystem) newValue);
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
		case TRADESPackage.ANALYSIS__THREAT:
			getThreat().clear();
			return;
		case TRADESPackage.ANALYSIS__COMPONENT:
			getComponent().clear();
			return;
		case TRADESPackage.ANALYSIS__CONTROL:
			getControl().clear();
			return;
		case TRADESPackage.ANALYSIS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.ANALYSIS__THREATALLOCATION:
			getThreatallocation().clear();
			return;
		case TRADESPackage.ANALYSIS__THREATMITIGATION:
			getThreatmitigation().clear();
			return;
		case TRADESPackage.ANALYSIS__DATA:
			getData().clear();
			return;
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			getAffectrelation().clear();
			return;
		case TRADESPackage.ANALYSIS__ANALYSISDIAGRAM:
			getAnalysisdiagram().clear();
			return;
		case TRADESPackage.ANALYSIS__ATTACKCHAIN:
			getAttackchain().clear();
			return;
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			setScoresystem((ScoreSystem) null);
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
		case TRADESPackage.ANALYSIS__THREAT:
			return threat != null && !threat.isEmpty();
		case TRADESPackage.ANALYSIS__COMPONENT:
			return component != null && !component.isEmpty();
		case TRADESPackage.ANALYSIS__CONTROL:
			return control != null && !control.isEmpty();
		case TRADESPackage.ANALYSIS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.ANALYSIS__THREATALLOCATION:
			return threatallocation != null && !threatallocation.isEmpty();
		case TRADESPackage.ANALYSIS__THREATMITIGATION:
			return threatmitigation != null && !threatmitigation.isEmpty();
		case TRADESPackage.ANALYSIS__DATA:
			return data != null && !data.isEmpty();
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
			return affectrelation != null && !affectrelation.isEmpty();
		case TRADESPackage.ANALYSIS__ANALYSISDIAGRAM:
			return analysisdiagram != null && !analysisdiagram.isEmpty();
		case TRADESPackage.ANALYSIS__ATTACKCHAIN:
			return attackchain != null && !attackchain.isEmpty();
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			return scoresystem != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AnalysisImpl
