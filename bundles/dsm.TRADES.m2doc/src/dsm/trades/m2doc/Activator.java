package dsm.trades.m2doc;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.obeonetwork.m2doc.ide.M2DocPlugin;
import org.osgi.framework.BundleContext;

import dsm.trades.m2doc.internal.M2DocTemplateRegistry;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	private static final String TEMPLATES_FOLDER = "/templates";

	// The plug-in ID
	public static final String PLUGIN_ID = "dsm.TRADES.m2doc"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private IM2DocTemplateRegistry templateRegistry;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		templateRegistry = new M2DocTemplateRegistry();

		Iterator<String> ite = plugin.getBundle().getEntryPaths(TEMPLATES_FOLDER).asIterator();
		while (ite.hasNext()) {
			String entry = ite.next();
			if (entry.endsWith("docx") && !entry.startsWith("~")) {
				URI uri = URI.createPlatformPluginURI("/" + PLUGIN_ID + "/" + entry, true);
				templateRegistry.addTemplate(uri, entry.substring(TEMPLATES_FOLDER.length(), entry.length() - 5));
			}

		}

		// Force the plugin to start and read extension (and add external service)
		M2DocPlugin.getDefault();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public IM2DocTemplateRegistry getTemplateRegistry() {
		return templateRegistry;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	private void doLogInfo(String message) {
		getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message));
	}

	private void doLogWarning(String message) {
		getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, message));
	}

	private void doLogError(String message) {
		getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message));
	}

	public static void logError(String message) {
		if (plugin != null) {
			plugin.doLogError(message);
		} else {
			System.err.println(message);
		}
	}

	public static void logInfo(String message) {
		if (plugin != null) {
			plugin.doLogInfo(message);
		} else {
			System.out.println(message);
		}
	}

	public static void logWarning(String message) {
		if (plugin != null) {
			plugin.doLogWarning(message);
		} else {
			System.out.println(message);
		}
	}

	/**
	 * Tries to log and error (either in the eclipse logging system if the plugin is
	 * started or in System.err)
	 * 
	 * @param message the message
	 * @param e       an exception
	 */
	public static void logError(String message, Throwable e) {
		if (plugin != null) {
			plugin.doLogError(message, e);
		} else {
			System.err.println(message);
			e.printStackTrace();
		}
	}

	private void doLogError(String string, Throwable e) {
		getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, string, e));
	}

}
