/**
 */
package dsm.TRADES.provider;

import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatMitigationRelation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsm.TRADES.ThreatMitigationRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreatMitigationRelationItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatMitigationRelationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAssessmentPropertyDescriptor(object);
			addControlPropertyDescriptor(object);
			addThreatPropertyDescriptor(object);
			addMitigatesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Assessment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssessmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ThreatMitigationRelation_assessment_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ThreatMitigationRelation_assessment_feature", "_UI_ThreatMitigationRelation_type"),
						TRADESPackage.Literals.THREAT_MITIGATION_RELATION__ASSESSMENT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ThreatMitigationRelation_control_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ThreatMitigationRelation_control_feature",
						"_UI_ThreatMitigationRelation_type"),
				TRADESPackage.Literals.THREAT_MITIGATION_RELATION__CONTROL, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Threat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ThreatMitigationRelation_threat_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ThreatMitigationRelation_threat_feature",
						"_UI_ThreatMitigationRelation_type"),
				TRADESPackage.Literals.THREAT_MITIGATION_RELATION__THREAT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Mitigates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMitigatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ThreatMitigationRelation_mitigates_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ThreatMitigationRelation_mitigates_feature",
						"_UI_ThreatMitigationRelation_type"),
				TRADESPackage.Literals.THREAT_MITIGATION_RELATION__MITIGATES, true, false, true, null, null, null));
	}

	/**
	 * This returns ThreatMitigationRelation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ThreatMitigationRelation"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ThreatMitigationRelation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ThreatMitigationRelation_type")
				: getString("_UI_ThreatMitigationRelation_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ThreatMitigationRelation.class)) {
		case TRADESPackage.THREAT_MITIGATION_RELATION__ASSESSMENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
