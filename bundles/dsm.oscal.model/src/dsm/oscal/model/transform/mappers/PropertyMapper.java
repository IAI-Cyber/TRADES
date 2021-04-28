package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.OscalMetadata.Property;
import dsm.oscal.model.transform.MigrationUtils;

public class PropertyMapper extends AbstractObjectMapper<Property, gov.nist.secauto.oscal.lib.Property> {

	private PropertyMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static PropertyMapper instance = new PropertyMapper();
	}

	/** Get unique instance of PropertyMapper */
	public static PropertyMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected Property safeToTrades(gov.nist.secauto.oscal.lib.Property oscalObject) {
		Property property = OscalMetadataFactory.eINSTANCE.createProperty();

		property.setClazz(oscalObject.getClazz());
		property.setName(oscalObject.getName());
		property.setNs(oscalObject.getNs());
		property.setRemarks(oscalObject.getRemarks());

		// In oscal UUIDS are not mandatory by in TRADES they are for simplicity sake
		MigrationUtils.setUUID(oscalObject.getUuid(), property);
		property.setValue(oscalObject.getValue());
		return property;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Property safeToOscal(Property tradesObject) {
		gov.nist.secauto.oscal.lib.Property property = new gov.nist.secauto.oscal.lib.Property();

		property.setClazz(tradesObject.getClazz());
		property.setName(tradesObject.getName());
		property.setNs(tradesObject.getNs());
		property.setUuid(tradesObject.getUuid());
		property.setValue(tradesObject.getValue());
		property.setRemarks(tradesObject.getRemarks());
		return property;
	}

}
