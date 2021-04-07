package dsm.oscal.model.OscalMetadata.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.oscal.model.LabelUtils;
import dsm.oscal.model.OscalMetadata.Link;

public class LinkItemProviderCustomImpl extends LinkItemProviderBaseCustomImpl {

	public LinkItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Link link = (Link) object;
		return "[" + link.getRel() + "] " + LabelUtils.toSimpleLabel(link.getText()) + ":" + link.getEHref();
	}

}
