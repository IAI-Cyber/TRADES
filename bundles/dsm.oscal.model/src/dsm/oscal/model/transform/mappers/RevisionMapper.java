package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.Revision;

public class RevisionMapper extends AbstractObjectMapper<Revision, gov.nist.secauto.oscal.lib.Revision> {

	private RevisionMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static RevisionMapper instance = new RevisionMapper();
	}

	/** Get unique instance of RevisionMapper */
	public static RevisionMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Revision safeToOscal(Revision tradesObject) {
		gov.nist.secauto.oscal.lib.Revision revision = new gov.nist.secauto.oscal.lib.Revision();

		revision.setLastModified(tradesObject.getLastModified());
		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), revision::setLinks);
		revision.setOscalVersion(tradesObject.getOscalVersion());
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), revision::setProps);
		revision.setPublished(tradesObject.getPublished());
		revision.setRemarks(tradesObject.getRemarks());
		revision.setTitle(tradesObject.getTitle());
		revision.setVersion(tradesObject.getVersion());

		return revision;
	}

	@Override
	protected Revision safeToTrades(gov.nist.secauto.oscal.lib.Revision oscalObject) {
		Revision revision = OscalMetadataFactory.eINSTANCE.createRevision();

		revision.setLastModified(oscalObject.getLastModified());
		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), revision::getLinks);
		revision.setOscalVersion(oscalObject.getOscalVersion());
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), revision::getProps);
		revision.setPublished(oscalObject.getPublished());
		revision.setRemarks(oscalObject.getRemarks());
		revision.setTitle(oscalObject.getTitle());
		revision.setVersion(oscalObject.getVersion());

		return revision;
	}

}
