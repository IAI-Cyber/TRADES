package dsm.oscal.model.transform.mappers;

import dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonFactory;
import dsm.oscal.model.OscalCatalogCommon.Parameter;

public class ParameterMapper extends AbstractObjectMapper<Parameter, gov.nist.secauto.oscal.lib.Parameter> {

	private ParameterMapper() {
	}

	/** Holder */
	private static class SingletonHolder {

		private final static ParameterMapper instance = new ParameterMapper();
	}

	/** Get unique instance of ParameterMapper */
	public static ParameterMapper getInstance() {
		return SingletonHolder.instance;
	}

	@Override
	protected Parameter safeToTrades(gov.nist.secauto.oscal.lib.Parameter oscalObject) {
		Parameter parameter = OscalCatalogCommonFactory.eINSTANCE.createParameter();
		parameter.setClazz(oscalObject.getClazz());
		parameter.setId(oscalObject.getId());
		parameter.setDependsOn(oscalObject.getDependsOn());
		parameter.setRemarks(oscalObject.getRemarks());

		buildChildList(LinkMapper.getInstance(), oscalObject.getLinks(), parameter::getLinks);
		buildChildList(AnnotationMapper.getInstance(), oscalObject.getAnnotations(), parameter::getAnnotations);
		buildChildList(ConstraintMapper.getInstance(), oscalObject.getConstraints(), parameter::getConstraints);
		buildChildList(ParameterGuidelineMapper.getInstance(), oscalObject.getGuidelines(), parameter::getGuidelines);

		parameter.setLabel(oscalObject.getLabel());
		buildChildList(PropertyMapper.getInstance(), oscalObject.getProps(), parameter::getProps);

		parameter.setSelect(SelectMapper.getInstance().toTrades(oscalObject.getSelect()));
		parameter.setUsage(oscalObject.getUsage());

		setList(oscalObject.getValues(), parameter.getValues());
		return parameter;
	}

	@Override
	protected gov.nist.secauto.oscal.lib.Parameter safeToOscal(Parameter tradesObject) {
		gov.nist.secauto.oscal.lib.Parameter parameter = new gov.nist.secauto.oscal.lib.Parameter();
		parameter.setClazz(tradesObject.getClazz());
		parameter.setId(tradesObject.getId());
		parameter.setDependsOn(tradesObject.getDependsOn());
		parameter.setRemarks(tradesObject.getRemarks());

		buildXMLChildList(LinkMapper.getInstance(), tradesObject.getLinks(), parameter::setLinks);
		buildXMLChildList(AnnotationMapper.getInstance(), tradesObject.getAnnotations(), parameter::setAnnotations);
		buildXMLChildList(ConstraintMapper.getInstance(), tradesObject.getConstraints(), parameter::setConstraints);
		buildXMLChildList(ParameterGuidelineMapper.getInstance(), tradesObject.getGuidelines(),
				parameter::setGuidelines);

		parameter.setLabel(tradesObject.getLabel());
		buildXMLChildList(PropertyMapper.getInstance(), tradesObject.getProps(), parameter::setProps);

		parameter.setSelect(SelectMapper.getInstance().toOscal(tradesObject.getSelect()));
		parameter.setUsage(tradesObject.getUsage());

		setXMLList(tradesObject.getValues(), parameter::setValues);
		return parameter;
	}

}
