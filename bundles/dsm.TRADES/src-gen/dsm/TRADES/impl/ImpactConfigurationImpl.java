/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.DifficultyScore;
import dsm.TRADES.ImpactConfiguration;
import dsm.TRADES.ImpactScore;
import dsm.TRADES.RGBColor;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ImpactConfigurationImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ImpactConfigurationImpl#getImpact <em>Impact</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ImpactConfigurationImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpactConfigurationImpl extends MinimalEObjectImpl.Container implements ImpactConfiguration {
	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected DifficultyScore difficulty;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final RGBColor COLOR_EDEFAULT = (RGBColor) TRADESFactory.eINSTANCE
			.createFromString(TRADESPackage.eINSTANCE.getRGBColor(), "#FFFFFF");

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected RGBColor color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpactConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.IMPACT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DifficultyScore getDifficulty() {
		if (difficulty != null && difficulty.eIsProxy()) {
			InternalEObject oldDifficulty = (InternalEObject) difficulty;
			difficulty = (DifficultyScore) eResolveProxy(oldDifficulty);
			if (difficulty != oldDifficulty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.IMPACT_CONFIGURATION__DIFFICULTY, oldDifficulty, difficulty));
			}
		}
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifficultyScore basicGetDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficulty(DifficultyScore newDifficulty) {
		DifficultyScore oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.IMPACT_CONFIGURATION__DIFFICULTY,
					oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImpactScore getImpact() {
		if (eContainerFeatureID() != TRADESPackage.IMPACT_CONFIGURATION__IMPACT)
			return null;
		return (ImpactScore) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpact(ImpactScore newImpact, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newImpact, TRADESPackage.IMPACT_CONFIGURATION__IMPACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImpact(ImpactScore newImpact) {
		if (newImpact != eInternalContainer()
				|| (eContainerFeatureID() != TRADESPackage.IMPACT_CONFIGURATION__IMPACT && newImpact != null)) {
			if (EcoreUtil.isAncestor(this, newImpact))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImpact != null)
				msgs = ((InternalEObject) newImpact).eInverseAdd(this, TRADESPackage.IMPACT_SCORE__CONFIGURATIONS,
						ImpactScore.class, msgs);
			msgs = basicSetImpact(newImpact, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.IMPACT_CONFIGURATION__IMPACT, newImpact,
					newImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RGBColor getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(RGBColor newColor) {
		RGBColor oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.IMPACT_CONFIGURATION__COLOR, oldColor,
					color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.IMPACT_CONFIGURATION__IMPACT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetImpact((ImpactScore) otherEnd, msgs);
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
		case TRADESPackage.IMPACT_CONFIGURATION__IMPACT:
			return basicSetImpact(null, msgs);
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
		case TRADESPackage.IMPACT_CONFIGURATION__IMPACT:
			return eInternalContainer().eInverseRemove(this, TRADESPackage.IMPACT_SCORE__CONFIGURATIONS,
					ImpactScore.class, msgs);
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
		case TRADESPackage.IMPACT_CONFIGURATION__DIFFICULTY:
			if (resolve)
				return getDifficulty();
			return basicGetDifficulty();
		case TRADESPackage.IMPACT_CONFIGURATION__IMPACT:
			return getImpact();
		case TRADESPackage.IMPACT_CONFIGURATION__COLOR:
			return getColor();
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
		case TRADESPackage.IMPACT_CONFIGURATION__DIFFICULTY:
			setDifficulty((DifficultyScore) newValue);
			return;
		case TRADESPackage.IMPACT_CONFIGURATION__IMPACT:
			setImpact((ImpactScore) newValue);
			return;
		case TRADESPackage.IMPACT_CONFIGURATION__COLOR:
			setColor((RGBColor) newValue);
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
		case TRADESPackage.IMPACT_CONFIGURATION__DIFFICULTY:
			setDifficulty((DifficultyScore) null);
			return;
		case TRADESPackage.IMPACT_CONFIGURATION__IMPACT:
			setImpact((ImpactScore) null);
			return;
		case TRADESPackage.IMPACT_CONFIGURATION__COLOR:
			setColor(COLOR_EDEFAULT);
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
		case TRADESPackage.IMPACT_CONFIGURATION__DIFFICULTY:
			return difficulty != null;
		case TRADESPackage.IMPACT_CONFIGURATION__IMPACT:
			return getImpact() != null;
		case TRADESPackage.IMPACT_CONFIGURATION__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
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
		result.append(" (color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //ImpactConfigurationImpl
