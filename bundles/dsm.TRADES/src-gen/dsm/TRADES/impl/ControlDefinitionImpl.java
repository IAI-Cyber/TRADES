/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Annotation;
import dsm.TRADES.AnnotationOwner;
import dsm.TRADES.ControlDefinition;
import dsm.TRADES.Link;
import dsm.TRADES.LinkOwner;
import dsm.TRADES.NamedElement;
import dsm.TRADES.Parameter;
import dsm.TRADES.ParameterOwner;
import dsm.TRADES.Partition;
import dsm.TRADES.TRADESPackage;

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
 * An implementation of the model object '<em><b>Control Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ControlDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlDefinitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlDefinitionImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlDefinitionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlDefinitionImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ControlDefinitionImpl#getOscalcontrols <em>Oscalcontrols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlDefinitionImpl extends PropertyOwnerImpl implements ControlDefinition {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Partition> parts;

	/**
	 * The cached value of the '{@link #getOscalcontrols() <em>Oscalcontrols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscalcontrols()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlDefinition> oscalcontrols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.CONTROL_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					TRADESPackage.CONTROL_DEFINITION__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CONTROL_DEFINITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					TRADESPackage.CONTROL_DEFINITION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, TRADESPackage.CONTROL_DEFINITION__LINKS);
		}
		return links;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CONTROL_DEFINITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.CONTROL_DEFINITION__TITLE, oldTitle,
					title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Partition> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<Partition>(Partition.class, this,
					TRADESPackage.CONTROL_DEFINITION__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlDefinition> getOscalcontrols() {
		if (oscalcontrols == null) {
			oscalcontrols = new EObjectContainmentEList<ControlDefinition>(ControlDefinition.class, this,
					TRADESPackage.CONTROL_DEFINITION__OSCALCONTROLS);
		}
		return oscalcontrols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.CONTROL_DEFINITION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case TRADESPackage.CONTROL_DEFINITION__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		case TRADESPackage.CONTROL_DEFINITION__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case TRADESPackage.CONTROL_DEFINITION__PARTS:
			return ((InternalEList<?>) getParts()).basicRemove(otherEnd, msgs);
		case TRADESPackage.CONTROL_DEFINITION__OSCALCONTROLS:
			return ((InternalEList<?>) getOscalcontrols()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.CONTROL_DEFINITION__PARAMETERS:
			return getParameters();
		case TRADESPackage.CONTROL_DEFINITION__NAME:
			return getName();
		case TRADESPackage.CONTROL_DEFINITION__ANNOTATIONS:
			return getAnnotations();
		case TRADESPackage.CONTROL_DEFINITION__LINKS:
			return getLinks();
		case TRADESPackage.CONTROL_DEFINITION__ID:
			return getId();
		case TRADESPackage.CONTROL_DEFINITION__TITLE:
			return getTitle();
		case TRADESPackage.CONTROL_DEFINITION__PARTS:
			return getParts();
		case TRADESPackage.CONTROL_DEFINITION__OSCALCONTROLS:
			return getOscalcontrols();
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
		case TRADESPackage.CONTROL_DEFINITION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case TRADESPackage.CONTROL_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case TRADESPackage.CONTROL_DEFINITION__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case TRADESPackage.CONTROL_DEFINITION__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case TRADESPackage.CONTROL_DEFINITION__ID:
			setId((String) newValue);
			return;
		case TRADESPackage.CONTROL_DEFINITION__TITLE:
			setTitle((String) newValue);
			return;
		case TRADESPackage.CONTROL_DEFINITION__PARTS:
			getParts().clear();
			getParts().addAll((Collection<? extends Partition>) newValue);
			return;
		case TRADESPackage.CONTROL_DEFINITION__OSCALCONTROLS:
			getOscalcontrols().clear();
			getOscalcontrols().addAll((Collection<? extends ControlDefinition>) newValue);
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
		case TRADESPackage.CONTROL_DEFINITION__PARAMETERS:
			getParameters().clear();
			return;
		case TRADESPackage.CONTROL_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TRADESPackage.CONTROL_DEFINITION__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case TRADESPackage.CONTROL_DEFINITION__LINKS:
			getLinks().clear();
			return;
		case TRADESPackage.CONTROL_DEFINITION__ID:
			setId(ID_EDEFAULT);
			return;
		case TRADESPackage.CONTROL_DEFINITION__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case TRADESPackage.CONTROL_DEFINITION__PARTS:
			getParts().clear();
			return;
		case TRADESPackage.CONTROL_DEFINITION__OSCALCONTROLS:
			getOscalcontrols().clear();
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
		case TRADESPackage.CONTROL_DEFINITION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case TRADESPackage.CONTROL_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TRADESPackage.CONTROL_DEFINITION__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case TRADESPackage.CONTROL_DEFINITION__LINKS:
			return links != null && !links.isEmpty();
		case TRADESPackage.CONTROL_DEFINITION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TRADESPackage.CONTROL_DEFINITION__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case TRADESPackage.CONTROL_DEFINITION__PARTS:
			return parts != null && !parts.isEmpty();
		case TRADESPackage.CONTROL_DEFINITION__OSCALCONTROLS:
			return oscalcontrols != null && !oscalcontrols.isEmpty();
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
		if (baseClass == ParameterOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CONTROL_DEFINITION__PARAMETERS:
				return TRADESPackage.PARAMETER_OWNER__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CONTROL_DEFINITION__NAME:
				return TRADESPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == AnnotationOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CONTROL_DEFINITION__ANNOTATIONS:
				return TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.CONTROL_DEFINITION__LINKS:
				return TRADESPackage.LINK_OWNER__LINKS;
			default:
				return -1;
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
		if (baseClass == ParameterOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.PARAMETER_OWNER__PARAMETERS:
				return TRADESPackage.CONTROL_DEFINITION__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case TRADESPackage.NAMED_ELEMENT__NAME:
				return TRADESPackage.CONTROL_DEFINITION__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == AnnotationOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS:
				return TRADESPackage.CONTROL_DEFINITION__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.LINK_OWNER__LINKS:
				return TRADESPackage.CONTROL_DEFINITION__LINKS;
			default:
				return -1;
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ControlDefinitionImpl
