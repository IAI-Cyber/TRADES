package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonFactory;
import dsm.oscal.model.OscalCatalogCommon.ParameterConstraintTest;

public class TestMapper
		extends
		AbstractObjectMapper<ParameterConstraintTest, gov.nist.secauto.oscal.lib.model.ParameterConstraint.Test> {

	private TestMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static TestMapper instance = new TestMapper();
	}

	/** Get unique instance of TestMapper */
	public static TestMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected ParameterConstraintTest safeToTrades(
			gov.nist.secauto.oscal.lib.model.ParameterConstraint.Test oscalObject) {
		ParameterConstraintTest test = OscalCatalogCommonFactory.eINSTANCE.createParameterConstraintTest();

		test.setRemarks(oscalObject.getRemarks());
		test.setExpression(oscalObject.getExpression());
		return test;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.model.ParameterConstraint.Test safeToOscal(
			ParameterConstraintTest tradesObject) {
		gov.nist.secauto.oscal.lib.model.ParameterConstraint.Test test = new gov.nist.secauto.oscal.lib.model.ParameterConstraint.Test();

		test.setRemarks(tradesObject.getRemarks());
		test.setExpression(tradesObject.getExpression());
		return test;
	}

}
