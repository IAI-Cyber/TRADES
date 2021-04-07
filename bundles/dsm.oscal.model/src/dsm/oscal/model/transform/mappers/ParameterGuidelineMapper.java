package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonFactory;
import dsm.oscal.model.OscalCatalogCommon.ParameterGuideline;

public class ParameterGuidelineMapper
		extends AbstractObjectMapper<ParameterGuideline, gov.nist.secauto.oscal.lib.ParameterGuideline> {

	private ParameterGuidelineMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static ParameterGuidelineMapper instance = new ParameterGuidelineMapper();
	}

	/** Get unique instance of ParameterGuidelineMapper */
	public static ParameterGuidelineMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected ParameterGuideline safeToTrades(gov.nist.secauto.oscal.lib.ParameterGuideline oscalObject) {
		ParameterGuideline result = OscalCatalogCommonFactory.eINSTANCE.createParameterGuideline();
		result.setProse(oscalObject.getProse());
		return result;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.ParameterGuideline safeToOscal(ParameterGuideline tardesObject) {
		gov.nist.secauto.oscal.lib.ParameterGuideline result = new gov.nist.secauto.oscal.lib.ParameterGuideline();
		result.setProse(tardesObject.getProse());
		return result;
	}

}
