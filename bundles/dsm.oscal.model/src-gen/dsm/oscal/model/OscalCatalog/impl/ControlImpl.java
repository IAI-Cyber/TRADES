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
package dsm.oscal.model.OscalCatalog.impl;

import dsm.oscal.model.OscalCatalog.Control;
import dsm.oscal.model.OscalCatalog.OscalCatalogPackage;

import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalCatalogCommon.Part;

import dsm.oscal.model.OscalMetadata.DocumentationComputer;
import dsm.oscal.model.OscalMetadata.ElementWithClazz;
import dsm.oscal.model.OscalMetadata.ElementWithId;
import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.LinkOwner;
import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;
import dsm.oscal.model.OscalMetadata.PartOwner;
import dsm.oscal.model.OscalMetadata.Property;
import dsm.oscal.model.OscalMetadata.PropertyOwner;

import dsm.oscal.model.OscalMetadata.impl.OscalElementCustomImpl;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl#getProps <em>Props</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl#getParams <em>Params</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends OscalElementCustomImpl implements Control {
	/**
	 * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> props;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * The default value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAZZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected String clazz = CLAZZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> params;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupLine TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected MarkupLine title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalCatalogPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProps() {
		if (props == null) {
			props = new EObjectContainmentEList<Property>(Property.class, this, OscalCatalogPackage.CONTROL__PROPS);
		}
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalCatalogPackage.CONTROL__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<Part>(Part.class, this, OscalCatalogPackage.CONTROL__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClazz() {
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClazz(String newClazz) {
		String oldClazz = clazz;
		clazz = newClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.CONTROL__CLAZZ, oldClazz, clazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.CONTROL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<Control>(Control.class, this, OscalCatalogPackage.CONTROL__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Parameter>(Parameter.class, this, OscalCatalogPackage.CONTROL__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLine getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(MarkupLine newTitle) {
		MarkupLine oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalCatalogPackage.CONTROL__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String computeDocumentation() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OscalCatalogPackage.CONTROL__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.CONTROL__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.CONTROL__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.CONTROL__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case OscalCatalogPackage.CONTROL__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
			case OscalCatalogPackage.CONTROL__PROPS:
				return getProps();
			case OscalCatalogPackage.CONTROL__LINKS:
				return getLinks();
			case OscalCatalogPackage.CONTROL__PARTS:
				return getParts();
			case OscalCatalogPackage.CONTROL__CLAZZ:
				return getClazz();
			case OscalCatalogPackage.CONTROL__ID:
				return getId();
			case OscalCatalogPackage.CONTROL__CONTROLS:
				return getControls();
			case OscalCatalogPackage.CONTROL__PARAMS:
				return getParams();
			case OscalCatalogPackage.CONTROL__TITLE:
				return getTitle();
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
			case OscalCatalogPackage.CONTROL__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends Property>)newValue);
				return;
			case OscalCatalogPackage.CONTROL__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case OscalCatalogPackage.CONTROL__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
				return;
			case OscalCatalogPackage.CONTROL__CLAZZ:
				setClazz((String)newValue);
				return;
			case OscalCatalogPackage.CONTROL__ID:
				setId((String)newValue);
				return;
			case OscalCatalogPackage.CONTROL__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case OscalCatalogPackage.CONTROL__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OscalCatalogPackage.CONTROL__TITLE:
				setTitle((MarkupLine)newValue);
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
			case OscalCatalogPackage.CONTROL__PROPS:
				getProps().clear();
				return;
			case OscalCatalogPackage.CONTROL__LINKS:
				getLinks().clear();
				return;
			case OscalCatalogPackage.CONTROL__PARTS:
				getParts().clear();
				return;
			case OscalCatalogPackage.CONTROL__CLAZZ:
				setClazz(CLAZZ_EDEFAULT);
				return;
			case OscalCatalogPackage.CONTROL__ID:
				setId(ID_EDEFAULT);
				return;
			case OscalCatalogPackage.CONTROL__CONTROLS:
				getControls().clear();
				return;
			case OscalCatalogPackage.CONTROL__PARAMS:
				getParams().clear();
				return;
			case OscalCatalogPackage.CONTROL__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case OscalCatalogPackage.CONTROL__PROPS:
				return props != null && !props.isEmpty();
			case OscalCatalogPackage.CONTROL__LINKS:
				return links != null && !links.isEmpty();
			case OscalCatalogPackage.CONTROL__PARTS:
				return parts != null && !parts.isEmpty();
			case OscalCatalogPackage.CONTROL__CLAZZ:
				return CLAZZ_EDEFAULT == null ? clazz != null : !CLAZZ_EDEFAULT.equals(clazz);
			case OscalCatalogPackage.CONTROL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OscalCatalogPackage.CONTROL__CONTROLS:
				return controls != null && !controls.isEmpty();
			case OscalCatalogPackage.CONTROL__PARAMS:
				return params != null && !params.isEmpty();
			case OscalCatalogPackage.CONTROL__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PropertyOwner.class) {
			switch (derivedFeatureID) {
				case OscalCatalogPackage.CONTROL__PROPS: return OscalMetadataPackage.PROPERTY_OWNER__PROPS;
				default: return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
				case OscalCatalogPackage.CONTROL__LINKS: return OscalMetadataPackage.LINK_OWNER__LINKS;
				default: return -1;
			}
		}
		if (baseClass == DocumentationComputer.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PartOwner.class) {
			switch (derivedFeatureID) {
				case OscalCatalogPackage.CONTROL__PARTS: return OscalMetadataPackage.PART_OWNER__PARTS;
				default: return -1;
			}
		}
		if (baseClass == ElementWithClazz.class) {
			switch (derivedFeatureID) {
				case OscalCatalogPackage.CONTROL__CLAZZ: return OscalMetadataPackage.ELEMENT_WITH_CLAZZ__CLAZZ;
				default: return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (derivedFeatureID) {
				case OscalCatalogPackage.CONTROL__ID: return OscalMetadataPackage.ELEMENT_WITH_ID__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PropertyOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.PROPERTY_OWNER__PROPS: return OscalCatalogPackage.CONTROL__PROPS;
				default: return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.LINK_OWNER__LINKS: return OscalCatalogPackage.CONTROL__LINKS;
				default: return -1;
			}
		}
		if (baseClass == DocumentationComputer.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PartOwner.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.PART_OWNER__PARTS: return OscalCatalogPackage.CONTROL__PARTS;
				default: return -1;
			}
		}
		if (baseClass == ElementWithClazz.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.ELEMENT_WITH_CLAZZ__CLAZZ: return OscalCatalogPackage.CONTROL__CLAZZ;
				default: return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (baseFeatureID) {
				case OscalMetadataPackage.ELEMENT_WITH_ID__ID: return OscalCatalogPackage.CONTROL__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == PropertyOwner.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == DocumentationComputer.class) {
			switch (baseOperationID) {
				case OscalMetadataPackage.DOCUMENTATION_COMPUTER___COMPUTE_DOCUMENTATION: return OscalCatalogPackage.CONTROL___COMPUTE_DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == PartOwner.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ElementWithClazz.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ElementWithId.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OscalCatalogPackage.CONTROL___COMPUTE_DOCUMENTATION:
				return computeDocumentation();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (clazz: ");
		result.append(clazz);
		result.append(", id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ControlImpl
