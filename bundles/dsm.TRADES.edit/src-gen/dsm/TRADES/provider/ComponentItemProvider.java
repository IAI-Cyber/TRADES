/**
 */
package dsm.TRADES.provider;

import dsm.TRADES.Component;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.ThreatAllocationRelation;

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
 * This is the item provider adapter for a {@link dsm.TRADES.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends ComponentOwerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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
			addAllocatedThreatPropertyDescriptor(object);
			addImplementsPropertyDescriptor(object);
			addThreatallocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allocated Threat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllocatedThreatPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_allocatedThreat_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_allocatedThreat_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__ALLOCATED_THREAT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Implements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_implements_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_implements_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__IMPLEMENTS, true, false, true, null, null, null));
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
	 * This adds a property descriptor for the Threatallocation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreatallocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_threatallocation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_threatallocation_feature",
								"_UI_Component_type"),
						TRADESPackage.Literals.COMPONENT__THREATALLOCATION, true, false, true, null, null, null));
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
			childrenFeatures.add(TRADESPackage.Literals.DATA_OWNER__DATA);
			childrenFeatures.add(TRADESPackage.Literals.COMPONENT__CONTROL);
			childrenFeatures.add(TRADESPackage.Literals.COMPONENT__ANALYSIS);
			childrenFeatures.add(TRADESPackage.Literals.COMPONENT__AFFECTRELATION);
			childrenFeatures.add(TRADESPackage.Literals.COMPONENT__THREAT);
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
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
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Component_type") : label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		if (notification.getFeature() == TRADESPackage.eINSTANCE.getNamedElement_Name()) {
			Object notifier = notification.getNotifier();
			if (notifier instanceof Component) {
				Component new_name = (Component) notifier;
				for (ThreatAllocationRelation rel : new_name.getThreatallocation()) {
					fireNotifyChanged(new ViewerNotification(notification, rel, false, true));
				}
			}
		}

		switch (notification.getFeatureID(Component.class)) {
		case TRADESPackage.COMPONENT__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TRADESPackage.COMPONENT__DATA:
		case TRADESPackage.COMPONENT__CONTROL:
		case TRADESPackage.COMPONENT__ANALYSIS:
		case TRADESPackage.COMPONENT__AFFECTRELATION:
		case TRADESPackage.COMPONENT__THREAT:
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
				createChildParameter(TRADESPackage.Literals.DATA_OWNER__DATA, TRADESFactory.eINSTANCE.createData()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.COMPONENT__CONTROL,
				TRADESFactory.eINSTANCE.createControl()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.COMPONENT__CONTROL,
				TRADESFactory.eINSTANCE.createExternalControl()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.COMPONENT__ANALYSIS,
				TRADESFactory.eINSTANCE.createAnalysis()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.COMPONENT__AFFECTRELATION,
				TRADESFactory.eINSTANCE.createAffectRelation()));

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.COMPONENT__THREAT, TRADESFactory.eINSTANCE.createThreat()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.COMPONENT__THREAT,
				TRADESFactory.eINSTANCE.createExternalThreat()));
	}

}
