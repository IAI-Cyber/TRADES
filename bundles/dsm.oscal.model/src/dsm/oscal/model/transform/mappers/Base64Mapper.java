package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.Base64;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;

public class Base64Mapper extends AbstractObjectMapper<Base64, gov.nist.secauto.oscal.lib.BackMatter.Resource.Base64> {

	private Base64Mapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static Base64Mapper instance = new Base64Mapper();
	}

	/** Get unique instance of Base64Mapper */
	public static Base64Mapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.BackMatter.Resource.Base64 safeToOscal(Base64 tradesObject) {
		gov.nist.secauto.oscal.lib.BackMatter.Resource.Base64 base64 = new gov.nist.secauto.oscal.lib.BackMatter.Resource.Base64();
		base64.setFilename(tradesObject.getFilename());
		base64.setMediaType(tradesObject.getMediaType());
		base64.setValue(tradesObject.getValue());
		return base64;
	}

	@Override
	protected Base64 safeToTrades(gov.nist.secauto.oscal.lib.BackMatter.Resource.Base64 oscalObject) {
		Base64 base64 = OscalMetadataFactory.eINSTANCE.createBase64();
		base64.setFilename(oscalObject.getFilename());
		base64.setMediaType(oscalObject.getMediaType());
		base64.setValue(oscalObject.getValue());
		return base64;
	}

}
