/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.AnalysisDiagram;
import dsm.TRADES.Component;
import dsm.TRADES.Control;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AnalysisDiagramImpl#getThreat <em>Threat</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisDiagramImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AnalysisDiagramImpl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisDiagramImpl extends NamedElementImpl implements AnalysisDiagram {
	/**
	 * The cached value of the '{@link #getThreat() <em>Threat</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> threat;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> control;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.ANALYSIS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Threat> getThreat() {
		if (threat == null) {
			threat = new EObjectResolvingEList<Threat>(Threat.class, this, TRADESPackage.ANALYSIS_DIAGRAM__THREAT);
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
			component = new EObjectResolvingEList<Component>(Component.class, this,
					TRADESPackage.ANALYSIS_DIAGRAM__COMPONENT);
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
			control = new EObjectResolvingEList<Control>(Control.class, this, TRADESPackage.ANALYSIS_DIAGRAM__CONTROL);
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TRADESPackage.ANALYSIS_DIAGRAM__THREAT:
			return getThreat();
		case TRADESPackage.ANALYSIS_DIAGRAM__COMPONENT:
			return getComponent();
		case TRADESPackage.ANALYSIS_DIAGRAM__CONTROL:
			return getControl();
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
		case TRADESPackage.ANALYSIS_DIAGRAM__THREAT:
			getThreat().clear();
			getThreat().addAll((Collection<? extends Threat>) newValue);
			return;
		case TRADESPackage.ANALYSIS_DIAGRAM__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case TRADESPackage.ANALYSIS_DIAGRAM__CONTROL:
			getControl().clear();
			getControl().addAll((Collection<? extends Control>) newValue);
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
		case TRADESPackage.ANALYSIS_DIAGRAM__THREAT:
			getThreat().clear();
			return;
		case TRADESPackage.ANALYSIS_DIAGRAM__COMPONENT:
			getComponent().clear();
			return;
		case TRADESPackage.ANALYSIS_DIAGRAM__CONTROL:
			getControl().clear();
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
		case TRADESPackage.ANALYSIS_DIAGRAM__THREAT:
			return threat != null && !threat.isEmpty();
		case TRADESPackage.ANALYSIS_DIAGRAM__COMPONENT:
			return component != null && !component.isEmpty();
		case TRADESPackage.ANALYSIS_DIAGRAM__CONTROL:
			return control != null && !control.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnalysisDiagramImpl
