package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalCatalog.OscalCatalogFactory;
import gov.nist.secauto.oscal.lib.model.Control;

public class ControlMapper
		extends AbstractObjectMapper<dsm.oscal.model.OscalCatalog.Control, gov.nist.secauto.oscal.lib.model.Control> {

	private ControlMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static ControlMapper instance = new ControlMapper();
	}

	/** Get unique instance of ControlMapper */
	public static ControlMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected dsm.oscal.model.OscalCatalog.Control safeToTrades(Control oscalObject) {

		dsm.oscal.model.OscalCatalog.Control result = OscalCatalogFactory.eINSTANCE.createControl();

		result.setClazz(oscalObject.getClazz());
		buildChildList(this, oscalObject.getControls(), result::getControls);
		result.setId(oscalObject.getId());
		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), result::getLinks);
		buildChildList(ParameterMapper.getInstance(), oscalObject.getParams(), result::getParams);
		buildChildList(PartitionMapper.getInstance(), oscalObject.getParts(), result::getParts);
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), result::getProps);
		result.setTitle(oscalObject.getTitle());

		return result;
	}

	@Override
	protected Control safeToOscal(dsm.oscal.model.OscalCatalog.Control tradesObject) {
		Control result = new Control();

		result.setClazz(tradesObject.getClazz());
		buildXMLChildList(this, tradesObject.getControls(), result::setControls);
		result.setId(tradesObject.getId());
		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), result::setLinks);
		buildXMLChildList(ParameterMapper.getInstance(), tradesObject.getParams(), result::setParams);
		buildXMLChildList(PartitionMapper.getInstance(), tradesObject.getParts(), result::setParts);
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), result::setProps);
		result.setTitle(tradesObject.getTitle());

		return result;
	}

}
