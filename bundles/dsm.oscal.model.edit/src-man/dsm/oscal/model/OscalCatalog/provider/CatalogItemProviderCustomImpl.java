package dsm.oscal.model.OscalCatalog.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

import dsm.oscal.model.EMarkupUtils;
import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalCatalog.OscalCatalogPackage;
import dsm.oscal.model.OscalMetadata.Metadata;

public class CatalogItemProviderCustomImpl extends CatalogItemProvider {

	public CatalogItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Catalog catalog = (Catalog) object;

		Metadata metadata = catalog.getMetadata();
		if (metadata != null) {
			return EMarkupUtils.toSimpleLabel(metadata.getTitle());
		}
		return "Catalog " + catalog.getUuid();
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/bookmarks_view.png"));

	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		Collection<? extends EStructuralFeature> result = super.getChildrenFeatures(object);

		// Do not display metadata object. All properties will be displayed in the
		// property view
		result.remove(OscalCatalogPackage.Literals.CATALOG__METADATA);
		return result;
	}

}
