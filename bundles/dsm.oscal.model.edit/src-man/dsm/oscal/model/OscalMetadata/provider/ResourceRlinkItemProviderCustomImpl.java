package dsm.oscal.model.OscalMetadata.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.oscal.model.OscalMetadata.ResourceRlink;

public class ResourceRlinkItemProviderCustomImpl extends ResourceRlinkItemProviderBaseCustomImpl {

	public ResourceRlinkItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		ResourceRlink link = (ResourceRlink) object;
		return link.getEHref() != null ? link.getEHref().toString() : "";
	}

}
