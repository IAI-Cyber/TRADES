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

import dsm.TRADES.AffectRelation;
import dsm.TRADES.AffectedENUM;
import dsm.TRADES.Component;
import dsm.TRADES.Data;
import dsm.TRADES.Link;
import dsm.TRADES.TRADESPackage;

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

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affect Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getData <em>Data</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getAnalysisStatus <em>Analysis Status</em>}</li>
 *   <li>{@link dsm.TRADES.impl.AffectRelationImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffectRelationImpl extends NamedElementImpl implements AffectRelation {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getTargetComponent() <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComponent()
	 * @generated
	 * @ordered
	 */
	protected Component targetComponent;

	/**
	 * The default value of the '{@link #getAnalysisStatus() <em>Analysis Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisStatus()
	 * @generated
	 * @ordered
	 */
	protected static final AffectedENUM ANALYSIS_STATUS_EDEFAULT = AffectedENUM.CONFIRMED;

	/**
	 * The cached value of the '{@link #getAnalysisStatus() <em>Analysis Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisStatus()
	 * @generated
	 * @ordered
	 */
	protected AffectedENUM analysisStatus = ANALYSIS_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Link link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.AFFECT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Data>(Data.class, this, TRADESPackage.AFFECT_RELATION__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getSourceComponent() {
		if (eContainerFeatureID() != TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT)
			return null;
		return (Component) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceComponent(Component newSourceComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSourceComponent, TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceComponent(Component newSourceComponent) {
		if (newSourceComponent != eInternalContainer()
				|| (eContainerFeatureID() != TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT
						&& newSourceComponent != null)) {
			if (EcoreUtil.isAncestor(this, newSourceComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceComponent != null)
				msgs = ((InternalEObject) newSourceComponent).eInverseAdd(this,
						TRADESPackage.COMPONENT__AFFECT_RELATIONS, Component.class, msgs);
			msgs = basicSetSourceComponent(newSourceComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT,
					newSourceComponent, newSourceComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getTargetComponent() {
		if (targetComponent != null && targetComponent.eIsProxy()) {
			InternalEObject oldTargetComponent = (InternalEObject) targetComponent;
			targetComponent = (Component) eResolveProxy(oldTargetComponent);
			if (targetComponent != oldTargetComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT, oldTargetComponent, targetComponent));
			}
		}
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetTargetComponent() {
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetComponent(Component newTargetComponent) {
		Component oldTargetComponent = targetComponent;
		targetComponent = newTargetComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT,
					oldTargetComponent, targetComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffectedENUM getAnalysisStatus() {
		return analysisStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnalysisStatus(AffectedENUM newAnalysisStatus) {
		AffectedENUM oldAnalysisStatus = analysisStatus;
		analysisStatus = newAnalysisStatus == null ? ANALYSIS_STATUS_EDEFAULT : newAnalysisStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS,
					oldAnalysisStatus, analysisStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject) link;
			link = (Link) eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TRADESPackage.AFFECT_RELATION__LINK,
							oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(Link newLink, NotificationChain msgs) {
		Link oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.AFFECT_RELATION__LINK, oldLink, newLink);
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
	public void setLink(Link newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject) link).eInverseRemove(this, TRADESPackage.LINK__AFFECT_RELATIONS, Link.class,
						msgs);
			if (newLink != null)
				msgs = ((InternalEObject) newLink).eInverseAdd(this, TRADESPackage.LINK__AFFECT_RELATIONS, Link.class,
						msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.AFFECT_RELATION__LINK, newLink,
					newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkDataScope(DiagnosticChain chain, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR, TRADESValidator.DIAGNOSTIC_SOURCE,
						TRADESValidator.AFFECT_RELATION__CHECK_DATA_SCOPE,
						EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
								new Object[] { "checkDataScope", EObjectValidator.getObjectLabel(this, context) }),
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
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSourceComponent((Component) otherEnd, msgs);
		case TRADESPackage.AFFECT_RELATION__LINK:
			if (link != null)
				msgs = ((InternalEObject) link).eInverseRemove(this, TRADESPackage.LINK__AFFECT_RELATIONS, Link.class,
						msgs);
			return basicSetLink((Link) otherEnd, msgs);
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
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			return basicSetSourceComponent(null, msgs);
		case TRADESPackage.AFFECT_RELATION__LINK:
			return basicSetLink(null, msgs);
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
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			return eInternalContainer().eInverseRemove(this, TRADESPackage.COMPONENT__AFFECT_RELATIONS, Component.class,
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
		case TRADESPackage.AFFECT_RELATION__DATA:
			return getData();
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			return getSourceComponent();
		case TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT:
			if (resolve)
				return getTargetComponent();
			return basicGetTargetComponent();
		case TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS:
			return getAnalysisStatus();
		case TRADESPackage.AFFECT_RELATION__LINK:
			if (resolve)
				return getLink();
			return basicGetLink();
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
		case TRADESPackage.AFFECT_RELATION__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			setSourceComponent((Component) newValue);
			return;
		case TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT:
			setTargetComponent((Component) newValue);
			return;
		case TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS:
			setAnalysisStatus((AffectedENUM) newValue);
			return;
		case TRADESPackage.AFFECT_RELATION__LINK:
			setLink((Link) newValue);
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
		case TRADESPackage.AFFECT_RELATION__DATA:
			getData().clear();
			return;
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			setSourceComponent((Component) null);
			return;
		case TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT:
			setTargetComponent((Component) null);
			return;
		case TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS:
			setAnalysisStatus(ANALYSIS_STATUS_EDEFAULT);
			return;
		case TRADESPackage.AFFECT_RELATION__LINK:
			setLink((Link) null);
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
		case TRADESPackage.AFFECT_RELATION__DATA:
			return data != null && !data.isEmpty();
		case TRADESPackage.AFFECT_RELATION__SOURCE_COMPONENT:
			return getSourceComponent() != null;
		case TRADESPackage.AFFECT_RELATION__TARGET_COMPONENT:
			return targetComponent != null;
		case TRADESPackage.AFFECT_RELATION__ANALYSIS_STATUS:
			return analysisStatus != ANALYSIS_STATUS_EDEFAULT;
		case TRADESPackage.AFFECT_RELATION__LINK:
			return link != null;
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
		case TRADESPackage.AFFECT_RELATION___CHECK_DATA_SCOPE__DIAGNOSTICCHAIN_MAP:
			return checkDataScope((DiagnosticChain) arguments.get(0), (Map) arguments.get(1));
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
		result.append(" (analysisStatus: ");
		result.append(analysisStatus);
		result.append(')');
		return result.toString();
	}

} //AffectRelationImpl
