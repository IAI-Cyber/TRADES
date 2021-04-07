package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonFactory;
import gov.nist.secauto.oscal.lib.Part;

public class PartitionMapper extends AbstractObjectMapper<dsm.oscal.model.OscalCatalogCommon.Part, Part> {

	private PartitionMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static PartitionMapper instance = new PartitionMapper();
	}

	/** Get unique instance of PartitionMapper */
	public static PartitionMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected dsm.oscal.model.OscalCatalogCommon.Part safeToTrades(Part oscalObject) {
		dsm.oscal.model.OscalCatalogCommon.Part partition = OscalCatalogCommonFactory.eINSTANCE.createPart();

		buildChildList(AnnotationMapper.getInstance(), oscalObject.getAnnotations(), partition::getAnnotations);
		partition.setClazz(oscalObject.getClazz());
		partition.setId(oscalObject.getId());
		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), partition::getLinks);
		partition.setName(oscalObject.getName());
		partition.setNs(oscalObject.getNs());
		buildChildList(this, oscalObject.getParts(), partition::getParts);
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), partition::getProps);
		partition.setProse(oscalObject.getProse());
		partition.setTitle(oscalObject.getTitle());
		return partition;
	}

	@Override
	protected Part safeToOscal(dsm.oscal.model.OscalCatalogCommon.Part tradesObject) {
		Part partition = new Part();

		buildXMLChildList(AnnotationMapper.getInstance(), tradesObject.getAnnotations(), partition::setAnnotations);
		partition.setClazz(tradesObject.getClazz());
		partition.setId(tradesObject.getId());
		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), partition::setLinks);
		partition.setName(tradesObject.getName());
		partition.setNs(tradesObject.getNs());
		buildXMLChildList(this, tradesObject.getParts(), partition::setParts);
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), partition::setProps);
		partition.setProse(tradesObject.getProse());
		partition.setTitle(tradesObject.getTitle());

		return partition;
	}

}
