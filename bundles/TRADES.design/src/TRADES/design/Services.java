package TRADES.design;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		return self;
	}

	public void openInBrowser(String link) {
		try {
			Desktop.getDesktop().browse(URI.create(link));
		} catch (IOException e) {
			Activator.logError("Problem while open link " + link, e);
		}
	}

}
