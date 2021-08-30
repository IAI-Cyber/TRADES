package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.BackMatter;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;

public class BackMatterMapper extends AbstractObjectMapper<BackMatter, gov.nist.secauto.oscal.lib.model.BackMatter> {
	private BackMatterMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static BackMatterMapper instance = new BackMatterMapper();
	}

	/** Get unique instance of BackMatterMapper */
	public static BackMatterMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.model.BackMatter safeToOscal(BackMatter tradesObject) {
		gov.nist.secauto.oscal.lib.model.BackMatter backmatter = new gov.nist.secauto.oscal.lib.model.BackMatter();
		buildXMLChildList(ResourceMapper.getInstance(), tradesObject.getResources(), backmatter::setResources);
		return backmatter;
	}

	@Override
	protected BackMatter safeToTrades(gov.nist.secauto.oscal.lib.model.BackMatter oscalObject) {
		BackMatter backmatter = OscalMetadataFactory.eINSTANCE.createBackMatter();
		buildChildList(ResourceMapper.getInstance(), oscalObject.getResources(), backmatter::getResources);
		return backmatter;
	}

}
