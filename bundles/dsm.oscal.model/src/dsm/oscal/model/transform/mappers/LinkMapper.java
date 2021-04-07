package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;

public class LinkMapper extends AbstractObjectMapper<Link, gov.nist.secauto.oscal.lib.Link> {

	private LinkMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static LinkMapper instance = new LinkMapper();
	}

	/** Get unique instance of LinkMapper */
	public static LinkMapper getInstance() {
		return SingletonHolder.instance;
	}
	@Override
	protected Link safeToTrades(gov.nist.secauto.oscal.lib.Link oscalObject) {
		Link link = OscalMetadataFactory.eINSTANCE.createLink();
		link.setEHref(oscalObject.getHref());
		link.setMediaType(oscalObject.getMediaType());
		link.setRel(oscalObject.getRel());
		link.setText(oscalObject.getText());

		return link;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Link safeToOscal(Link tradesObject) {
		gov.nist.secauto.oscal.lib.Link link = new gov.nist.secauto.oscal.lib.Link();
		link.setHref(tradesObject.getEHref());
		link.setMediaType(tradesObject.getMediaType());
		link.setRel(tradesObject.getRel());
		link.setText(tradesObject.getText());

		return link;
	}

}
