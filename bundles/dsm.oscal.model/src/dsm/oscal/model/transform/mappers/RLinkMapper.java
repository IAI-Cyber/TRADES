package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.ResourceRlink;

public class RLinkMapper extends AbstractObjectMapper<ResourceRlink, gov.nist.secauto.oscal.lib.model.BackMatter.Resource.Rlink> {

	private RLinkMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static RLinkMapper instance = new RLinkMapper();
	}

	/** Get unique instance of RLinkMapper */
	public static RLinkMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.model.BackMatter.Resource.Rlink safeToOscal(ResourceRlink tradesObject) {
		gov.nist.secauto.oscal.lib.model.BackMatter.Resource.Rlink rLink = new gov.nist.secauto.oscal.lib.model.BackMatter.Resource.Rlink();

		buildXMLChildList(HashMapper.getInstance(), tradesObject.getHashes(), rLink::setHashes);
		rLink.setHref(tradesObject.getEHref());
		rLink.setMediaType(tradesObject.getMediaType());

		return rLink;
	}

	@Override
	protected ResourceRlink safeToTrades(gov.nist.secauto.oscal.lib.model.BackMatter.Resource.Rlink oscalObject) {
		ResourceRlink rLink = OscalMetadataFactory.eINSTANCE.createResourceRlink();

		buildChildList(HashMapper.getInstance(), oscalObject.getHashes(), rLink::getHashes);
		rLink.setEHref(oscalObject.getHref());
		rLink.setMediaType(oscalObject.getMediaType());

		return rLink;
	}

}
