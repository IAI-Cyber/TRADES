package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.Address;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;

public class AddresseMapper extends AbstractObjectMapper<Address, gov.nist.secauto.oscal.lib.Address> {

	private AddresseMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static AddresseMapper instance = new AddresseMapper();
	}

	/** Get unique instance of AddresseMapper */
	public static AddresseMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Address safeToOscal(Address tradesObject) {
		gov.nist.secauto.oscal.lib.Address adresse = new gov.nist.secauto.oscal.lib.Address();

		setXMLList(tradesObject.getAddrLines(), adresse::setAddrLines);
		adresse.setCity(tradesObject.getCity());
		adresse.setCountry(tradesObject.getCountry());
		adresse.setPostalCode(tradesObject.getPostalCode());
		adresse.setState(tradesObject.getState());
		adresse.setType(tradesObject.getType());

		return adresse;
	}

	@Override
	protected Address safeToTrades(gov.nist.secauto.oscal.lib.Address oscalObject) {
		Address adresse = OscalMetadataFactory.eINSTANCE.createAddress();

		setList(oscalObject.getAddrLines(), adresse.getAddrLines());
		adresse.setCity(oscalObject.getCity());
		adresse.setCountry(oscalObject.getCountry());
		adresse.setPostalCode(oscalObject.getPostalCode());
		adresse.setState(oscalObject.getState());
		adresse.setType(oscalObject.getType());

		return adresse;
	}

}
