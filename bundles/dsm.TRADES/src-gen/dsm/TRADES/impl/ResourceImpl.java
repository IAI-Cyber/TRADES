/**
 */
package dsm.TRADES.impl;

import dsm.TRADES.Annotation;
import dsm.TRADES.AnnotationOwner;
import dsm.TRADES.Base64;
import dsm.TRADES.Citation;
import dsm.TRADES.DocumentId;
import dsm.TRADES.Resource;
import dsm.TRADES.Rlink;
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
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.impl.ResourceImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResourceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResourceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResourceImpl#getDocumentIds <em>Document Ids</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResourceImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResourceImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResourceImpl#getBase64 <em>Base64</em>}</li>
 *   <li>{@link dsm.TRADES.impl.ResourceImpl#getRLinks <em>RLinks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends PropertyOwnerImpl implements Resource {
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
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

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
	 * The cached value of the '{@link #getDocumentIds() <em>Document Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIds()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentId> documentIds;

	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected Citation citation;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase64() <em>Base64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase64()
	 * @generated
	 * @ordered
	 */
	protected Base64 base64;

	/**
	 * The cached value of the '{@link #getRLinks() <em>RLinks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Rlink> rLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TRADESPackage.Literals.RESOURCE;
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
					TRADESPackage.RESOURCE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.RESOURCE__UUID, oldUuid, uuid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.RESOURCE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.RESOURCE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentId> getDocumentIds() {
		if (documentIds == null) {
			documentIds = new EObjectContainmentEList<DocumentId>(DocumentId.class, this,
					TRADESPackage.RESOURCE__DOCUMENT_IDS);
		}
		return documentIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Citation getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(Citation newCitation, NotificationChain msgs) {
		Citation oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.RESOURCE__CITATION, oldCitation, newCitation);
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
	public void setCitation(Citation newCitation) {
		if (newCitation != citation) {
			NotificationChain msgs = null;
			if (citation != null)
				msgs = ((InternalEObject) citation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.RESOURCE__CITATION, null, msgs);
			if (newCitation != null)
				msgs = ((InternalEObject) newCitation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.RESOURCE__CITATION, null, msgs);
			msgs = basicSetCitation(newCitation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.RESOURCE__CITATION, newCitation,
					newCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.RESOURCE__REMARKS, oldRemarks,
					remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64 getBase64() {
		return base64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64(Base64 newBase64, NotificationChain msgs) {
		Base64 oldBase64 = base64;
		base64 = newBase64;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TRADESPackage.RESOURCE__BASE64, oldBase64, newBase64);
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
	public void setBase64(Base64 newBase64) {
		if (newBase64 != base64) {
			NotificationChain msgs = null;
			if (base64 != null)
				msgs = ((InternalEObject) base64).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.RESOURCE__BASE64, null, msgs);
			if (newBase64 != null)
				msgs = ((InternalEObject) newBase64).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TRADESPackage.RESOURCE__BASE64, null, msgs);
			msgs = basicSetBase64(newBase64, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TRADESPackage.RESOURCE__BASE64, newBase64,
					newBase64));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rlink> getRLinks() {
		if (rLinks == null) {
			rLinks = new EObjectContainmentEList<Rlink>(Rlink.class, this, TRADESPackage.RESOURCE__RLINKS);
		}
		return rLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TRADESPackage.RESOURCE__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		case TRADESPackage.RESOURCE__DOCUMENT_IDS:
			return ((InternalEList<?>) getDocumentIds()).basicRemove(otherEnd, msgs);
		case TRADESPackage.RESOURCE__CITATION:
			return basicSetCitation(null, msgs);
		case TRADESPackage.RESOURCE__BASE64:
			return basicSetBase64(null, msgs);
		case TRADESPackage.RESOURCE__RLINKS:
			return ((InternalEList<?>) getRLinks()).basicRemove(otherEnd, msgs);
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
		case TRADESPackage.RESOURCE__ANNOTATIONS:
			return getAnnotations();
		case TRADESPackage.RESOURCE__UUID:
			return getUuid();
		case TRADESPackage.RESOURCE__TITLE:
			return getTitle();
		case TRADESPackage.RESOURCE__DESCRIPTION:
			return getDescription();
		case TRADESPackage.RESOURCE__DOCUMENT_IDS:
			return getDocumentIds();
		case TRADESPackage.RESOURCE__CITATION:
			return getCitation();
		case TRADESPackage.RESOURCE__REMARKS:
			return getRemarks();
		case TRADESPackage.RESOURCE__BASE64:
			return getBase64();
		case TRADESPackage.RESOURCE__RLINKS:
			return getRLinks();
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
		case TRADESPackage.RESOURCE__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case TRADESPackage.RESOURCE__UUID:
			setUuid((String) newValue);
			return;
		case TRADESPackage.RESOURCE__TITLE:
			setTitle((String) newValue);
			return;
		case TRADESPackage.RESOURCE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TRADESPackage.RESOURCE__DOCUMENT_IDS:
			getDocumentIds().clear();
			getDocumentIds().addAll((Collection<? extends DocumentId>) newValue);
			return;
		case TRADESPackage.RESOURCE__CITATION:
			setCitation((Citation) newValue);
			return;
		case TRADESPackage.RESOURCE__REMARKS:
			setRemarks((String) newValue);
			return;
		case TRADESPackage.RESOURCE__BASE64:
			setBase64((Base64) newValue);
			return;
		case TRADESPackage.RESOURCE__RLINKS:
			getRLinks().clear();
			getRLinks().addAll((Collection<? extends Rlink>) newValue);
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
		case TRADESPackage.RESOURCE__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case TRADESPackage.RESOURCE__UUID:
			setUuid(UUID_EDEFAULT);
			return;
		case TRADESPackage.RESOURCE__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case TRADESPackage.RESOURCE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TRADESPackage.RESOURCE__DOCUMENT_IDS:
			getDocumentIds().clear();
			return;
		case TRADESPackage.RESOURCE__CITATION:
			setCitation((Citation) null);
			return;
		case TRADESPackage.RESOURCE__REMARKS:
			setRemarks(REMARKS_EDEFAULT);
			return;
		case TRADESPackage.RESOURCE__BASE64:
			setBase64((Base64) null);
			return;
		case TRADESPackage.RESOURCE__RLINKS:
			getRLinks().clear();
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
		case TRADESPackage.RESOURCE__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case TRADESPackage.RESOURCE__UUID:
			return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		case TRADESPackage.RESOURCE__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case TRADESPackage.RESOURCE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TRADESPackage.RESOURCE__DOCUMENT_IDS:
			return documentIds != null && !documentIds.isEmpty();
		case TRADESPackage.RESOURCE__CITATION:
			return citation != null;
		case TRADESPackage.RESOURCE__REMARKS:
			return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
		case TRADESPackage.RESOURCE__BASE64:
			return base64 != null;
		case TRADESPackage.RESOURCE__RLINKS:
			return rLinks != null && !rLinks.isEmpty();
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
		if (baseClass == AnnotationOwner.class) {
			switch (derivedFeatureID) {
			case TRADESPackage.RESOURCE__ANNOTATIONS:
				return TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS;
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
		if (baseClass == AnnotationOwner.class) {
			switch (baseFeatureID) {
			case TRADESPackage.ANNOTATION_OWNER__ANNOTATIONS:
				return TRADESPackage.RESOURCE__ANNOTATIONS;
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
