/**
 */
package dsm.TRADES.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import dsm.TRADES.Component;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;
import dsm.TRADES.Threat;
import dsm.TRADES.ThreatAllocationRelation;

/**
 * This is the item provider adapter for a {@link dsm.TRADES.ThreatAllocationRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreatAllocationRelationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatAllocationRelationItemProvider(AdapterFactory adapterFactory) {
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
			addComponentPropertyDescriptor(object);
			addThreatPropertyDescriptor(object);
			addImpactscorePropertyDescriptor(object);
			addDifficultyscorePropertyDescriptor(object);
			addThreatRelatedPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_ThreatAllocationRelation_assessment_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ThreatAllocationRelation_assessment_feature", "_UI_ThreatAllocationRelation_type"),
						TRADESPackage.Literals.THREAT_ALLOCATION_RELATION__ASSESSMENT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ThreatAllocationRelation_component_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ThreatAllocationRelation_component_feature",
						"_UI_ThreatAllocationRelation_type"),
				TRADESPackage.Literals.THREAT_ALLOCATION_RELATION__COMPONENT, true, false, true, null, null, null));
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
				getString("_UI_ThreatAllocationRelation_threat_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ThreatAllocationRelation_threat_feature",
						"_UI_ThreatAllocationRelation_type"),
				TRADESPackage.Literals.THREAT_ALLOCATION_RELATION__THREAT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Impactscore feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpactscorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ThreatAllocationRelation_impactscore_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ThreatAllocationRelation_impactscore_feature",
						"_UI_ThreatAllocationRelation_type"),
				TRADESPackage.Literals.THREAT_ALLOCATION_RELATION__IMPACTSCORE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Difficultyscore feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDifficultyscorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ThreatAllocationRelation_difficultyscore_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ThreatAllocationRelation_difficultyscore_feature",
						"_UI_ThreatAllocationRelation_type"),
				TRADESPackage.Literals.THREAT_ALLOCATION_RELATION__DIFFICULTYSCORE, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Threat Related feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreatRelatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ThreatAllocationRelation_threatRelated_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ThreatAllocationRelation_threatRelated_feature",
						"_UI_ThreatAllocationRelation_type"),
				TRADESPackage.Literals.THREAT_ALLOCATION_RELATION__THREAT_RELATED, true, false, true, null, null,
				null));
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
			childrenFeatures.add(TRADESPackage.Literals.THREAT_ALLOCATION_RELATION__ATTACK_CHAINS);
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
	 * This returns ThreatAllocationRelation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ThreatAllocationRelation"));
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
		String label = "";
		ThreatAllocationRelation relation = ((ThreatAllocationRelation) object);
		Threat threat = relation.getThreat();
		if (threat != null && threat.getName() != null) {
			label += threat.getName();
		}
		label += " on ";
		Component component = relation.getComponent();
		if (component != null && component.getName() != null) {
			label += component.getName();
		}
		return label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ThreatAllocationRelation.class)) {
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ASSESSMENT:
		case TRADESPackage.THREAT_ALLOCATION_RELATION__THREAT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TRADESPackage.THREAT_ALLOCATION_RELATION__ATTACK_CHAINS:
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

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.THREAT_ALLOCATION_RELATION__ATTACK_CHAINS,
				TRADESFactory.eINSTANCE.createAttackChain()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
