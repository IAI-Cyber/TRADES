package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;

public class TelephoneNumberMapper extends
		AbstractObjectMapper<dsm.oscal.model.OscalMetadata.TelephoneNumber, gov.nist.secauto.oscal.lib.model.TelephoneNumber> {

	private TelephoneNumberMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static TelephoneNumberMapper instance = new TelephoneNumberMapper();
	}

	/** Get unique instance of TelephoneNumberMapper */
	public static TelephoneNumberMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.model.TelephoneNumber safeToOscal(dsm.oscal.model.OscalMetadata.TelephoneNumber tradesObject) {
		gov.nist.secauto.oscal.lib.model.TelephoneNumber tel = new gov.nist.secauto.oscal.lib.model.TelephoneNumber();
		tel.setType(tradesObject.getType());
		tel.setValue(tradesObject.getValue());
		return tel;
	}

	@Override
	protected dsm.oscal.model.OscalMetadata.TelephoneNumber safeToTrades(
			gov.nist.secauto.oscal.lib.model.TelephoneNumber oscalObject) {
		dsm.oscal.model.OscalMetadata.TelephoneNumber tel = OscalMetadataFactory.eINSTANCE.createTelephoneNumber();
		tel.setType(oscalObject.getType());
		tel.setValue(oscalObject.getValue());
		return tel;
	}

}
