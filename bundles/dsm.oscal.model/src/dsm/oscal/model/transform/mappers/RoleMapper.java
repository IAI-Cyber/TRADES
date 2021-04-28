package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.Role;

public class RoleMapper extends AbstractObjectMapper<Role, gov.nist.secauto.oscal.lib.Role> {

	private RoleMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static RoleMapper instance = new RoleMapper();
	}

	/** Get unique instance of RoleMapper */
	public static RoleMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Role safeToOscal(Role tradesObject) {
		gov.nist.secauto.oscal.lib.Role role = new gov.nist.secauto.oscal.lib.Role();
		role.setDescription(tradesObject.getDescription());
		role.setId(tradesObject.getId());
		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), role::setLinks);
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), role::setProps);
		role.setRemarks(tradesObject.getRemarks());
		role.setShortName(tradesObject.getShortName());
		role.setTitle(tradesObject.getTitle());
		return role;
	}

	@Override
	protected Role safeToTrades(gov.nist.secauto.oscal.lib.Role oscalObject) {
		Role role = OscalMetadataFactory.eINSTANCE.createRole();
		role.setDescription(oscalObject.getDescription());
		role.setId(oscalObject.getId());
		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), role::getLinks);
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), role::getProps);
		role.setRemarks(oscalObject.getRemarks());
		role.setShortName(oscalObject.getShortName());
		role.setTitle(oscalObject.getTitle());
		return role;
	}

}
