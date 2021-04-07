package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;

public class DocumentIdMapper extends AbstractObjectMapper<dsm.oscal.model.OscalMetadata.DocumentId, gov.nist.secauto.oscal.lib.DocumentId> {

	private DocumentIdMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static DocumentIdMapper instance = new DocumentIdMapper();
	}

	/** Get unique instance of DocumentIdMapper */
	public static DocumentIdMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.DocumentId safeToOscal(dsm.oscal.model.OscalMetadata.DocumentId tradesObject) {
		gov.nist.secauto.oscal.lib.DocumentId docId = new gov.nist.secauto.oscal.lib.DocumentId();
		docId.setScheme(tradesObject.getScheme());
		docId.setValue(tradesObject.getValue());
		return docId;
	}

	@Override
	protected dsm.oscal.model.OscalMetadata.DocumentId safeToTrades(gov.nist.secauto.oscal.lib.DocumentId oscalObject) {
		dsm.oscal.model.OscalMetadata.DocumentId docId = OscalMetadataFactory.eINSTANCE.createDocumentId();
		docId.setScheme(oscalObject.getScheme());
		docId.setValue(oscalObject.getValue());
		return docId;
	}

}
