package dsm.oscal.model.transform.mappers;

import static java.util.stream.Collectors.toList;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonFactory;
import gov.nist.secauto.oscal.lib.ParameterSelection;

public class SelectMapper
		extends AbstractObjectMapper<dsm.oscal.model.OscalCatalogCommon.ParameterSelection, ParameterSelection> {

	private SelectMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static SelectMapper instance = new SelectMapper();
	}

	/** Get unique instance of SelectMapper */
	public static SelectMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected dsm.oscal.model.OscalCatalogCommon.ParameterSelection safeToTrades(ParameterSelection oscalObject) {
		dsm.oscal.model.OscalCatalogCommon.ParameterSelection select = OscalCatalogCommonFactory.eINSTANCE
				.createParameterSelection();

		setList(oscalObject.getChoice().stream().collect(toList()), select.getChoice());
		select.setHowMany(oscalObject.getHowMany());

		return select;
	}

	@Override
	protected ParameterSelection safeToOscal(dsm.oscal.model.OscalCatalogCommon.ParameterSelection tradesObject) {
		ParameterSelection select = new ParameterSelection();

		setXMLList(tradesObject.getChoice().stream().collect(toList()), select::setChoice);
		select.setHowMany(tradesObject.getHowMany());

		return select;
	}

}
