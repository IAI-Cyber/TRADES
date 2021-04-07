package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;

public class HashMapper
		extends AbstractObjectMapper<dsm.oscal.model.OscalMetadata.Hash, gov.nist.secauto.oscal.lib.Hash> {

	private HashMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static HashMapper instance = new HashMapper();
	}

	/** Get unique instance of HashMapper */
	public static HashMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Hash safeToOscal(dsm.oscal.model.OscalMetadata.Hash tradesObject) {
		gov.nist.secauto.oscal.lib.Hash hash = new gov.nist.secauto.oscal.lib.Hash();
		hash.setAlgorithm(tradesObject.getAlgorithm());
		hash.setValue(tradesObject.getValue());
		return hash;
	}

	@Override
	protected dsm.oscal.model.OscalMetadata.Hash safeToTrades(gov.nist.secauto.oscal.lib.Hash oscalObject) {
		dsm.oscal.model.OscalMetadata.Hash hash = OscalMetadataFactory.eINSTANCE.createHash();
		hash.setAlgorithm(oscalObject.getAlgorithm());
		hash.setValue(oscalObject.getValue());
		return hash;
	}

}
