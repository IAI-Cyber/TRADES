package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.BackMatterResource;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.transform.MigrationUtils;

public class ResourceMapper
		extends AbstractObjectMapper<BackMatterResource, gov.nist.secauto.oscal.lib.BackMatter.Resource> {

	private ResourceMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static ResourceMapper instance = new ResourceMapper();
	}

	/** Get unique instance of ResourceMapper */
	public static ResourceMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.BackMatter.Resource safeToOscal(BackMatterResource tradesObject) {
		gov.nist.secauto.oscal.lib.BackMatter.Resource resource = new gov.nist.secauto.oscal.lib.BackMatter.Resource();

		buildXMLChildList(AnnotationMapper.getInstance(), tradesObject.getAnnotations(), resource::setAnnotations);
		resource.setBase64(Base64Mapper.getInstance().toOscal(tradesObject.getBase64()));
		resource.setCitation(CitationWrapper.getInstance().toOscal(tradesObject.getCitation()));
		resource.setDescription(tradesObject.getDescription());
		buildXMLChildList(DocumentIdMapper.getInstance(), tradesObject.getDocumentIds(), resource::setDocumentIds);
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), resource::setProps);
		resource.setRemarks(tradesObject.getRemarks());

		buildXMLChildList(RLinkMapper.getInstance(), tradesObject.getRlinks(), resource::setRlinks);
		resource.setTitle(tradesObject.getTitle());
		resource.setUuid(tradesObject.getUuid());
		return resource;
	}

	@Override
	protected BackMatterResource safeToTrades(gov.nist.secauto.oscal.lib.BackMatter.Resource oscalObject) {
		BackMatterResource resource = OscalMetadataFactory.eINSTANCE.createBackMatterResource();

		buildChildList(AnnotationMapper.getInstance(), oscalObject.getAnnotations(), resource::getAnnotations);
		resource.setBase64(Base64Mapper.getInstance().toTrades(oscalObject.getBase64()));
		resource.setCitation(CitationWrapper.getInstance().toTrades(oscalObject.getCitation()));
		resource.setDescription(oscalObject.getDescription());
		buildChildList(DocumentIdMapper.getInstance(), oscalObject.getDocumentIds(), resource::getDocumentIds);
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), resource::getProps);
		resource.setRemarks(oscalObject.getRemarks());

		buildChildList(RLinkMapper.getInstance(), oscalObject.getRlinks(), resource::getRlinks);
		resource.setTitle(oscalObject.getTitle());
		MigrationUtils.setUUID(oscalObject.getUuid(), resource);
		return resource;
	}

}
