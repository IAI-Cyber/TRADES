package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.ResponsibleParty;

public class ResponsiblePartyMapper
		extends AbstractObjectMapper<ResponsibleParty, gov.nist.secauto.oscal.lib.model.ResponsibleParty> {

	private ResponsiblePartyMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static ResponsiblePartyMapper instance = new ResponsiblePartyMapper();
	}

	/** Get unique instance of ResponsiblePartyMapper */
	public static ResponsiblePartyMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.model.ResponsibleParty safeToOscal(ResponsibleParty tradesObject) {
		gov.nist.secauto.oscal.lib.model.ResponsibleParty respParty = new gov.nist.secauto.oscal.lib.model.ResponsibleParty();

		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), respParty::setLinks);
		setXMLList(tradesObject.getPartyUuids(), respParty::setPartyUuids);
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), respParty::setProps);
		respParty.setRemarks(tradesObject.getRemarks());
		respParty.setRoleId(tradesObject.getRoleId());

		return respParty;
	}

	@Override
	protected ResponsibleParty safeToTrades(gov.nist.secauto.oscal.lib.model.ResponsibleParty oscalObject) {
		ResponsibleParty respParty = OscalMetadataFactory.eINSTANCE.createResponsibleParty();

		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), respParty::getLinks);
		setList(oscalObject.getPartyUuids(), respParty.getPartyUuids());
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), respParty::getProps);
		respParty.setRemarks(oscalObject.getRemarks());
		respParty.setRoleId(oscalObject.getRoleId());

		return respParty;
	}

}
