/**
 */
package dsm.oscal.model.Oscal.provider;

import dsm.oscal.model.Oscal.Metadata;
import dsm.oscal.model.Oscal.OscalFactory;
import dsm.oscal.model.Oscal.OscalPackage;

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
 * This is the item provider adapter for a {@link dsm.oscal.model.Oscal.Metadata} object.
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
						OscalPackage.Literals.METADATA__PUBLISHED, true, false, false,
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
						OscalPackage.Literals.METADATA__LAST_MODIFIED, true, false, false,
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
						OscalPackage.Literals.METADATA__VERSION, true, false, false,
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
						OscalPackage.Literals.METADATA__OSCAL_VERSION, true, false, false,
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
						OscalPackage.Literals.METADATA__TITLE, true, false, false,
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
			childrenFeatures.add(OscalPackage.Literals.LINK_OWNER__LINKS);
			childrenFeatures.add(OscalPackage.Literals.PROPERTY_OWNER__PROPERTIES);
			childrenFeatures.add(OscalPackage.Literals.METADATA__DOCUMENT_ID);
			childrenFeatures.add(OscalPackage.Literals.METADATA__ROLES);
			childrenFeatures.add(OscalPackage.Literals.METADATA__REVISION);
			childrenFeatures.add(OscalPackage.Literals.METADATA__LOCATIONS);
			childrenFeatures.add(OscalPackage.Literals.METADATA__PARTIES);
			childrenFeatures.add(OscalPackage.Literals.METADATA__RESPONSIBLE_PARTIES);
			childrenFeatures.add(OscalPackage.Literals.METADATA__REMARK);
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
		case OscalPackage.METADATA__PUBLISHED:
		case OscalPackage.METADATA__LAST_MODIFIED:
		case OscalPackage.METADATA__VERSION:
		case OscalPackage.METADATA__OSCAL_VERSION:
		case OscalPackage.METADATA__TITLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case OscalPackage.METADATA__LINKS:
		case OscalPackage.METADATA__PROPERTIES:
		case OscalPackage.METADATA__DOCUMENT_ID:
		case OscalPackage.METADATA__ROLES:
		case OscalPackage.METADATA__REVISION:
		case OscalPackage.METADATA__LOCATIONS:
		case OscalPackage.METADATA__PARTIES:
		case OscalPackage.METADATA__RESPONSIBLE_PARTIES:
		case OscalPackage.METADATA__REMARK:
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
				createChildParameter(OscalPackage.Literals.LINK_OWNER__LINKS, OscalFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(OscalPackage.Literals.PROPERTY_OWNER__PROPERTIES,
				OscalFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(OscalPackage.Literals.METADATA__DOCUMENT_ID,
				OscalFactory.eINSTANCE.createDocumentId()));

		newChildDescriptors
				.add(createChildParameter(OscalPackage.Literals.METADATA__ROLES, OscalFactory.eINSTANCE.createRole()));

		newChildDescriptors.add(createChildParameter(OscalPackage.Literals.METADATA__REVISION,
				OscalFactory.eINSTANCE.createRevisions()));

		newChildDescriptors.add(createChildParameter(OscalPackage.Literals.METADATA__LOCATIONS,
				OscalFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add(
				createChildParameter(OscalPackage.Literals.METADATA__PARTIES, OscalFactory.eINSTANCE.createParty()));

		newChildDescriptors.add(createChildParameter(OscalPackage.Literals.METADATA__RESPONSIBLE_PARTIES,
				OscalFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add(
				createChildParameter(OscalPackage.Literals.METADATA__REMARK, OscalFactory.eINSTANCE.createRemark()));
	}

}
