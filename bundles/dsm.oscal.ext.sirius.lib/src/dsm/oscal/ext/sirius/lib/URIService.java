package dsm.oscal.ext.sirius.lib;

import java.net.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.ext.emf.edit.EditingDomainServices;

import dsm.oscal.model.OscalMetadata.OscalElement;

public class URIService {

	private static EditingDomainServices editServices = new EditingDomainServices();

	public static String getURILabel(OscalElement context, URI uri) {

		if (uri == null) {
			return "";
		} else {
			EObject target = context.resolve(uri);
			if (target != null) {
				return editServices.getLabelProviderText(target);
			} else {
				return uri.toString();
			}

		}
	}

}
