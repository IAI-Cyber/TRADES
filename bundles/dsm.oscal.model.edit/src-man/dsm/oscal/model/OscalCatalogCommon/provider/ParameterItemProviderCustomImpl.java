package dsm.oscal.model.OscalCatalogCommon.provider;

import static java.util.stream.Collectors.joining;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.oscal.model.OscalCatalogCommon.Parameter;

public class ParameterItemProviderCustomImpl extends ParameterItemProviderBaseCustomImpl {

	public ParameterItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Parameter param = (Parameter) object;
		// TODO = Label or = values?
		return "["+param.getId()+"] " +(param.getLabel() != null ? param.getLabel().toMarkdown() : "")+ " = " + param.getValues().stream().collect(joining(", "));
	}

}
