/**
 */
package dsm.TRADES.provider;

import dsm.TRADES.Party;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsm.TRADES.Party} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartyItemProvider extends PropertyOwnerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addUuidPropertyDescriptor(object);
			addNewAttributePropertyDescriptor(object);
			addShortNamePropertyDescriptor(object);
			addEmailAddressesPropertyDescriptor(object);
			addLocationUuidsPropertyDescriptor(object);
			addMemberOfOrganizationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NamedElement_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature",
								"_UI_NamedElement_type"),
						TRADESPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Uuid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Party_uuid_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Party_uuid_feature", "_UI_Party_type"),
						TRADESPackage.Literals.PARTY__UUID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the New Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Party_newAttribute_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Party_newAttribute_feature",
								"_UI_Party_type"),
						TRADESPackage.Literals.PARTY__NEW_ATTRIBUTE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Short Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Party_shortName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Party_shortName_feature",
								"_UI_Party_type"),
						TRADESPackage.Literals.PARTY__SHORT_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Email Addresses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailAddressesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Party_emailAddresses_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Party_emailAddresses_feature",
								"_UI_Party_type"),
						TRADESPackage.Literals.PARTY__EMAIL_ADDRESSES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Location Uuids feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationUuidsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Party_locationUuids_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Party_locationUuids_feature",
								"_UI_Party_type"),
						TRADESPackage.Literals.PARTY__LOCATION_UUIDS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Member Of Organizations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberOfOrganizationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Party_memberOfOrganizations_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Party_memberOfOrganizations_feature",
								"_UI_Party_type"),
						TRADESPackage.Literals.PARTY__MEMBER_OF_ORGANIZATIONS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TRADESPackage.Literals.ANNOTATION_OWNER__ANNOTATIONS);
			childrenFeatures.add(TRADESPackage.Literals.LINK_OWNER__LINKS);
			childrenFeatures.add(TRADESPackage.Literals.PARTY__EXTERNAL_IDS);
			childrenFeatures.add(TRADESPackage.Literals.PARTY__TELEPHONE_NUMBERS);
			childrenFeatures.add(TRADESPackage.Literals.PARTY__ADDRESSES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Party.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Party"));
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
		String label = ((Party) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Party_type")
				: getString("_UI_Party_type") + " " + label;
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

		switch (notification.getFeatureID(Party.class)) {
		case TRADESPackage.PARTY__NAME:
		case TRADESPackage.PARTY__UUID:
		case TRADESPackage.PARTY__NEW_ATTRIBUTE:
		case TRADESPackage.PARTY__SHORT_NAME:
		case TRADESPackage.PARTY__EMAIL_ADDRESSES:
		case TRADESPackage.PARTY__LOCATION_UUIDS:
		case TRADESPackage.PARTY__MEMBER_OF_ORGANIZATIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TRADESPackage.PARTY__ANNOTATIONS:
		case TRADESPackage.PARTY__LINKS:
		case TRADESPackage.PARTY__EXTERNAL_IDS:
		case TRADESPackage.PARTY__TELEPHONE_NUMBERS:
		case TRADESPackage.PARTY__ADDRESSES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ANNOTATION_OWNER__ANNOTATIONS,
				TRADESFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.LINK_OWNER__LINKS, TRADESFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.PARTY__EXTERNAL_IDS,
				TRADESFactory.eINSTANCE.createExternalId()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.PARTY__TELEPHONE_NUMBERS,
				TRADESFactory.eINSTANCE.createTelephoneNumber()));

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.PARTY__ADDRESSES, TRADESFactory.eINSTANCE.createAddress()));
	}

}
