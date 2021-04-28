package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.ResourceCitation;

public class CitationWrapper
		extends AbstractObjectMapper<ResourceCitation, gov.nist.secauto.oscal.lib.BackMatter.Resource.Citation> {

	private CitationWrapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static CitationWrapper instance = new CitationWrapper();
	}

	/** Get unique instance of CitationWrapper */
	public static CitationWrapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.BackMatter.Resource.Citation safeToOscal(ResourceCitation tradesObject) {
		gov.nist.secauto.oscal.lib.BackMatter.Resource.Citation citation = new gov.nist.secauto.oscal.lib.BackMatter.Resource.Citation();

		// Ask to NIST
		// citation.setBiblio(oscalObject.getBiblio());

		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), citation::setProps);
		citation.setText(tradesObject.getText());
		return citation;
	}

	@Override
	protected ResourceCitation safeToTrades(gov.nist.secauto.oscal.lib.BackMatter.Resource.Citation oscalObject) {
		ResourceCitation citation =OscalMetadataFactory.eINSTANCE.createResourceCitation();
		
		// Ask to NIST
		// citation.setBiblio(oscalObject.getBiblio());

		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), citation::getProps);
		citation.setText(oscalObject.getText());
		return citation;
	}

}
