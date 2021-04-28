package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.Party;
import dsm.oscal.model.transform.MigrationUtils;

public class PartyMapper extends AbstractObjectMapper<Party, gov.nist.secauto.oscal.lib.Party> {

	private PartyMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static PartyMapper instance = new PartyMapper();
	}

	/** Get unique instance of PartyMapper */
	public static PartyMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Party safeToOscal(Party tradesObject) {
		gov.nist.secauto.oscal.lib.Party party = new gov.nist.secauto.oscal.lib.Party();

		buildXMLChildList(AddresseMapper.getInstance(), tradesObject.getAddresses(), party::setAddresses);

		setXMLList(tradesObject.getEmailAddresses(), party::setEmailAddresses);
		buildXMLChildList(ExternalIdMapper.getInstance(), tradesObject.getExternalIds(), party::setExternalIds);
		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), party::setLinks);
		setXMLList(tradesObject.getLocationUuids(), party::setLocationUuids);
		setXMLList(tradesObject.getMemberOfOrganizations(), party::setMemberOfOrganizations);

		party.setName(tradesObject.getName());
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), party::setProps);
		party.setRemarks(tradesObject.getRemarks());
		party.setShortName(tradesObject.getShortName());

		buildXMLChildList(TelephoneNumberMapper.getInstance(), tradesObject.getTelephoneNumbers(),
				party::setTelephoneNumbers);
		party.setType(tradesObject.getType());
		party.setUuid(tradesObject.getUuid());

		return party;
	}

	@Override
	protected Party safeToTrades(gov.nist.secauto.oscal.lib.Party oscalObject) {
		Party party = OscalMetadataFactory.eINSTANCE.createParty();

		buildChildList(AddresseMapper.getInstance(), oscalObject.getAddresses(), party::getAddresses);

		setList(oscalObject.getEmailAddresses(), party.getEmailAddresses());
		buildChildList(ExternalIdMapper.getInstance(), oscalObject.getExternalIds(), party::getExternalIds);
		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), party::getLinks);
		setList(oscalObject.getLocationUuids(), party.getLocationUuids());
		setList(oscalObject.getMemberOfOrganizations(), party.getMemberOfOrganizations());
		party.setName(oscalObject.getName());
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), party::getProps);
		party.setRemarks(oscalObject.getRemarks());
		party.setShortName(oscalObject.getShortName());

		buildChildList(TelephoneNumberMapper.getInstance(), oscalObject.getTelephoneNumbers(),
				party::getTelephoneNumbers);
		party.setType(oscalObject.getType());
		MigrationUtils.setUUID(oscalObject.getUuid(), party);

		return party;
	}

}
