package dsm.oscal.model.OscalCatalog.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.oscal.model.OscalCatalog.Catalog;
import dsm.oscal.model.OscalMetadata.Metadata;
import dsm.oscal.model.edit.LabelUtils;

public class CatalogItemProviderCustomImpl extends CatalogItemProvider {

	public CatalogItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Catalog catalog = (Catalog) object;

		Metadata metadata = catalog.getMetadata();
		if (metadata != null) {
			return LabelUtils.toSimpleLabel(metadata.getTitle());
		}
		return "Catalog " + catalog.getUuid();
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("custom/bookmarks_view.png"));

	}

}
