package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalMetadata.Annotation;
import dsm.oscal.model.OscalMetadata.OscalMetadataFactory;
import dsm.oscal.model.transform.MigrationUtils;

public class AnnotationMapper extends AbstractObjectMapper<Annotation, gov.nist.secauto.oscal.lib.Annotation> {

	private AnnotationMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static AnnotationMapper instance = new AnnotationMapper();
	}

	/** Get unique instance of AnnotationMapper */
	public static AnnotationMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected Annotation safeToTrades(gov.nist.secauto.oscal.lib.Annotation oscalObject) {
		Annotation annotation = OscalMetadataFactory.eINSTANCE.createAnnotation();
		annotation.setNs(oscalObject.getNs());
		annotation.setName(oscalObject.getName());
		// In oscal UUIDS are not mandatory by in TRADES they are for simplicity sake
		MigrationUtils.setUUID(oscalObject.getUuid(), annotation);
		annotation.setValue(oscalObject.getValue());
		return annotation;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Annotation safeToOscal(Annotation tradesObject) {
		gov.nist.secauto.oscal.lib.Annotation annotation = new gov.nist.secauto.oscal.lib.Annotation();
		annotation.setNs(tradesObject.getNs());
		annotation.setName(tradesObject.getName());
		annotation.setUuid(tradesObject.getUuid());
		annotation.setValue(tradesObject.getValue());
		return annotation;
	}

}
