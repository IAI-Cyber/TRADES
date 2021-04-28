package dsm.oscal.model.OscalMetadata.provider;

import java.net.URI;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import dsm.oscal.model.OscalMetadata.Link;
import dsm.oscal.model.edit.LabelUtils;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

public class LinkItemProviderCustomImpl extends LinkItemProviderBaseCustomImpl {

	public LinkItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Link link = (Link) object;
		URI eHref = link.getEHref();
		EObject referencedElement = link.resolve(eHref);
		final String refLabel;
		if (referencedElement != null) {
			refLabel = ((IItemLabelProvider) getRootAdapterFactory().adapt(referencedElement, IItemLabelProvider.class))
					.getText(referencedElement);
		} else {
			refLabel = eHref != null ? eHref.toString() : "";
		}
		String textLabel;
		MarkupLine text = link.getText();
		if (text != null && !text.toMarkdown().isBlank()) {
			textLabel = LabelUtils.toSimpleLabel(link.getText()) + ":";
		} else {
			textLabel = "";
		}
		return "[" + link.getRel() + "] " + textLabel + refLabel;
	}

}
