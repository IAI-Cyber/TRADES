package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonFactory;
import gov.nist.secauto.oscal.lib.model.ParameterConstraint;

public class ConstraintMapper
		extends AbstractObjectMapper<dsm.oscal.model.OscalCatalogCommon.ParameterConstraint, ParameterConstraint> {

	private ConstraintMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static ConstraintMapper instance = new ConstraintMapper();
	}

	/** Get unique instance of ConstraintMapper */
	public static ConstraintMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected dsm.oscal.model.OscalCatalogCommon.ParameterConstraint safeToTrades(ParameterConstraint oscalObject) {
		dsm.oscal.model.OscalCatalogCommon.ParameterConstraint constraint = OscalCatalogCommonFactory.eINSTANCE
				.createParameterConstraint();

		constraint.setDescription(oscalObject.getDescription());
		buildChildList(TestMapper.getInstance(), oscalObject.getTests(), constraint::getTests);
		return constraint;
	}

	@Override
	protected ParameterConstraint safeToOscal(dsm.oscal.model.OscalCatalogCommon.ParameterConstraint tradesObject) {
		ParameterConstraint constraint = new ParameterConstraint();

		constraint.setDescription(tradesObject.getDescription());
		buildXMLChildList(TestMapper.getInstance(), tradesObject.getTests(), constraint::setTests);
		return constraint;
	}

}
