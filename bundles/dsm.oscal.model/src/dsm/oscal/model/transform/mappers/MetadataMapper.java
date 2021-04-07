package dsm.oscal.model.transform.mappers;

import static java.util.stream.Collectors.toList;

import java.util.LinkedHashMap;

import dsm.oscal.model.OscalMetadata.Metadata;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.ResponsibleParty;

public class MetadataMapper extends AbstractObjectMapper<Metadata, gov.nist.secauto.oscal.lib.Metadata> {

	private MetadataMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static MetadataMapper instance = new MetadataMapper();
	}

	/** Get unique instance of MetadataMapper */
	public static MetadataMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Metadata safeToOscal(Metadata tradesObject) {
		gov.nist.secauto.oscal.lib.Metadata metadata = new gov.nist.secauto.oscal.lib.Metadata();

		buildXMLChildList(AnnotationMapper.getInstance(), tradesObject.getAnnotations(), metadata::setAnnotations);
		buildXMLChildList(DocumentIdMapper.getInstance(), tradesObject.getDocumentIds(), metadata::setDocumentIds);
		metadata.setLastModified(tradesObject.getLastModified());
		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), metadata::setLinks);
		buildXMLChildList(LocationMapper.getInstance(), tradesObject.getLocations(), metadata::setLocations);

		metadata.setOscalVersion(tradesObject.getOscalVersion());
		buildXMLChildList(PartyMapper.getInstance(), tradesObject.getParties(), metadata::setParties);

		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), metadata::setProps);
		metadata.setPublished(tradesObject.getPublished());
		metadata.setRemarks(tradesObject.getRemarks());

		LinkedHashMap<String, gov.nist.secauto.oscal.lib.ResponsibleParty> rParties = new LinkedHashMap<>();
		for (ResponsibleParty r : tradesObject.getResponsibleParties()) {
			if (r.getRoleId() != null) {
				rParties.put(r.getRoleId(), ResponsiblePartyMapper.getInstance().toOscal(r));
			}
		}
		metadata.setResponsibleParties(rParties);

		buildXMLChildList(RevisionMapper.getInstance(), tradesObject.getRevisions(), metadata::setRevisions);
		buildXMLChildList(RoleMapper.getInstance(), tradesObject.getRoles(), metadata::setRoles);
		metadata.setTitle(tradesObject.getTitle());
		metadata.setVersion(tradesObject.getVersion());

		return metadata;
	}

	@Override
	protected Metadata safeToTrades(gov.nist.secauto.oscal.lib.Metadata oscalObject) {
		Metadata metadata = OscalMetadataFactory.eINSTANCE.createMetadata();

		buildChildList(AnnotationMapper.getInstance(), oscalObject.getAnnotations(), metadata::getAnnotations);
		buildChildList(DocumentIdMapper.getInstance(), oscalObject.getDocumentIds(), metadata::getDocumentIds);
		metadata.setLastModified(oscalObject.getLastModified());
		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), metadata::getLinks);
		buildChildList(LocationMapper.getInstance(), oscalObject.getLocations(), metadata::getLocations);

		metadata.setOscalVersion(oscalObject.getOscalVersion());
		buildChildList(PartyMapper.getInstance(), oscalObject.getParties(), metadata::getParties);

		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), metadata::getProps);
		metadata.setPublished(oscalObject.getPublished());
		metadata.setRemarks(oscalObject.getRemarks());
		buildChildList(ResponsiblePartyMapper.getInstance(),
				oscalObject.getResponsibleParties().values().stream().collect(toList()),
				metadata::getResponsibleParties);

		buildChildList(RevisionMapper.getInstance(), oscalObject.getRevisions(), metadata::getRevisions);
		buildChildList(RoleMapper.getInstance(), oscalObject.getRoles(), metadata::getRoles);
		metadata.setTitle(oscalObject.getTitle());
		metadata.setVersion(oscalObject.getVersion());

		return metadata;
	}

}
