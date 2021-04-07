package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;

public class ExternalIdMapper extends
		AbstractObjectMapper<dsm.oscal.model.OscalMetadata.ExternalId, gov.nist.secauto.oscal.lib.Party.ExternalId> {

	private ExternalIdMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static ExternalIdMapper instance = new ExternalIdMapper();
	}

	/** Get unique instance of ExternalIdMapper */
	public static ExternalIdMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Party.ExternalId safeToOscal(
			dsm.oscal.model.OscalMetadata.ExternalId tradesObject) {
		gov.nist.secauto.oscal.lib.Party.ExternalId extId = new gov.nist.secauto.oscal.lib.Party.ExternalId();
		extId.setScheme(tradesObject.getScheme());
		extId.setValue(tradesObject.getValue());
		return extId;
	}

	@Override
	protected dsm.oscal.model.OscalMetadata.ExternalId safeToTrades(
			gov.nist.secauto.oscal.lib.Party.ExternalId oscalObject) {
		dsm.oscal.model.OscalMetadata.ExternalId extId = OscalMetadataFactory.eINSTANCE.createExternalId();
		extId.setScheme(oscalObject.getScheme());
		extId.setValue(oscalObject.getValue());
		return extId;
	}

}
