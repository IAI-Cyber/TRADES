/**
 */
package dsm.TRADES.provider;

import dsm.TRADES.Metadata;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsm.TRADES.Metadata} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataItemProvider extends AnnotationOwnerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataItemProvider(AdapterFactory adapterFactory) {
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

			addPublishedPropertyDescriptor(object);
			addLastModifiedPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addOscalVersionPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Published feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Metadata_published_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Metadata_published_feature",
								"_UI_Metadata_type"),
						TRADESPackage.Literals.METADATA__PUBLISHED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Last Modified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastModifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Metadata_lastModified_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Metadata_lastModified_feature",
								"_UI_Metadata_type"),
						TRADESPackage.Literals.METADATA__LAST_MODIFIED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Metadata_version_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Metadata_version_feature",
								"_UI_Metadata_type"),
						TRADESPackage.Literals.METADATA__VERSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Oscal Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOscalVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Metadata_oscalVersion_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Metadata_oscalVersion_feature",
								"_UI_Metadata_type"),
						TRADESPackage.Literals.METADATA__OSCAL_VERSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Metadata_title_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Metadata_title_feature",
								"_UI_Metadata_type"),
						TRADESPackage.Literals.METADATA__TITLE, true, false, false,
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
			childrenFeatures.add(TRADESPackage.Literals.LINK_OWNER__LINKS);
			childrenFeatures.add(TRADESPackage.Literals.METADATA__DOCUMENT_ID);
			childrenFeatures.add(TRADESPackage.Literals.METADATA__PROPERTIES);
			childrenFeatures.add(TRADESPackage.Literals.METADATA__ROLES);
			childrenFeatures.add(TRADESPackage.Literals.METADATA__REVISION);
			childrenFeatures.add(TRADESPackage.Literals.METADATA__LOCATIONS);
			childrenFeatures.add(TRADESPackage.Literals.METADATA__PARTIES);
			childrenFeatures.add(TRADESPackage.Literals.METADATA__RESPONSIBLE_PARTIES);
			childrenFeatures.add(TRADESPackage.Literals.METADATA__REMARK);
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
	 * This returns Metadata.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Metadata"));
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
		Date labelValue = ((Metadata) object).getPublished();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_Metadata_type")
				: getString("_UI_Metadata_type") + " " + label;
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

		switch (notification.getFeatureID(Metadata.class)) {
		case TRADESPackage.METADATA__PUBLISHED:
		case TRADESPackage.METADATA__LAST_MODIFIED:
		case TRADESPackage.METADATA__VERSION:
		case TRADESPackage.METADATA__OSCAL_VERSION:
		case TRADESPackage.METADATA__TITLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TRADESPackage.METADATA__LINKS:
		case TRADESPackage.METADATA__DOCUMENT_ID:
		case TRADESPackage.METADATA__PROPERTIES:
		case TRADESPackage.METADATA__ROLES:
		case TRADESPackage.METADATA__REVISION:
		case TRADESPackage.METADATA__LOCATIONS:
		case TRADESPackage.METADATA__PARTIES:
		case TRADESPackage.METADATA__RESPONSIBLE_PARTIES:
		case TRADESPackage.METADATA__REMARK:
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

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.LINK_OWNER__LINKS, TRADESFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.METADATA__DOCUMENT_ID,
				TRADESFactory.eINSTANCE.createDocumentId()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.METADATA__PROPERTIES,
				TRADESFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.METADATA__ROLES, TRADESFactory.eINSTANCE.createRole()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.METADATA__REVISION,
				TRADESFactory.eINSTANCE.createRevisions()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.METADATA__LOCATIONS,
				TRADESFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.METADATA__PARTIES, TRADESFactory.eINSTANCE.createParty()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.METADATA__RESPONSIBLE_PARTIES,
				TRADESFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.METADATA__REMARK, TRADESFactory.eINSTANCE.createRemark()));
	}

}
