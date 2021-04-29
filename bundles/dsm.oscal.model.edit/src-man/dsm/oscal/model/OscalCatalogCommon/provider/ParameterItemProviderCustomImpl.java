package dsm.oscal.model.OscalCatalogCommon.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;

import dsm.oscal.model.ParameterResolver;
import dsm.oscal.model.OscalCatalogCommon.Parameter;
import dsm.oscal.model.OscalCatalogCommon.ParameterSelection;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

public class ParameterItemProviderCustomImpl extends ParameterItemProviderBaseCustomImpl {

	public ParameterItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Parameter param = (Parameter) object;
		String paramValue = getParamValue(param);

		MarkupLine label = param.getLabel();
		String labelStr = "";
		if (label != null) {
			labelStr = "${" + ParameterResolver.safeToMarkdown(label) + "}";
		}

		return labelStr + " = '" + (paramValue != null ? paramValue : "") + "' [#" + param.getId() + "]";
	}

	private String getParamValue(Parameter p) {
		if (p == null) {
			return null;
		}

		EList<String> values = p.getValues();
		if (!values.isEmpty()) {
			return values.get(0);
		}

		ParameterSelection select = p.getSelect();
		if (select != null) {
			EList<MarkupLine> choices = select.getChoice();
			if (!choices.isEmpty()) {
				MarkupLine choice = choices.get(0);
				if (choice != null) {
					return ParameterResolver.safeToMarkdown(choice);
				}
			}
		}

		return null;

	}

}
