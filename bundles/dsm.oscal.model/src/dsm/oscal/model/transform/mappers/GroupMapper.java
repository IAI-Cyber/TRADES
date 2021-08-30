package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalCatalog.Group;
import dsm.oscal.model.OscalCatalog.OscalCatalogFactory;

public class GroupMapper extends AbstractObjectMapper<Group, gov.nist.secauto.oscal.lib.model.GrouposcalCatalog> {

	private GroupMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static GroupMapper instance = new GroupMapper();
	}

	/** Get unique instance of GroupMapper */
	public static GroupMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected Group safeToTrades(gov.nist.secauto.oscal.lib.model.GrouposcalCatalog oscalObject) {
		Group group = OscalCatalogFactory.eINSTANCE.createGroup();
		group.setId(oscalObject.getId());
		group.setTitle(oscalObject.getTitle());
		group.setClazz(oscalObject.getClazz());

		buildChildList(ControlMapper.getInstance(), oscalObject.getControls(), group::getControls);
		buildChildList(this, oscalObject.getGroups(), group::getGroups);
		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), group::getLinks);
		buildChildList(ParameterMapper.getInstance(), oscalObject.getParams(), group::getParams);
		buildChildList(PartitionMapper.getInstance(), oscalObject.getParts(), group::getParts);
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), group::getProps);

		return group;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.model.GrouposcalCatalog safeToOscal(Group tradesObject) {
		gov.nist.secauto.oscal.lib.model.GrouposcalCatalog group = new gov.nist.secauto.oscal.lib.model.GrouposcalCatalog();
		group.setId(tradesObject.getId());
		group.setTitle(tradesObject.getTitle());
		group.setClazz(tradesObject.getClazz());

		buildXMLChildList(ControlMapper.getInstance(), tradesObject.getControls(), group::setControls);
		buildXMLChildList(this, tradesObject.getGroups(), group::setGroups);
		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), group::setLinks);
		buildXMLChildList(ParameterMapper.getInstance(), tradesObject.getParams(), group::setParams);
		buildXMLChildList(PartitionMapper.getInstance(), tradesObject.getParts(), group::setParts);
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), group::setProps);

		return group;
	}

}
