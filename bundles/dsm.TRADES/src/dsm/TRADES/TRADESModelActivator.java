package dsm.TRADES;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class TRADESModelActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "dsm.TRADES"; //$NON-NLS-1$

	// The shared instance
	private static TRADESModelActivator plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static TRADESModelActivator getDefault() {
		return plugin;
	}

	public void log(IStatus status) {
		if (status != null) {
			getLog().log(status);
		}
	}

	public static void logInfo(String msg) {
		TRADESModelActivator act = getDefault();
		if (act != null) {
			act.log(new Status(IStatus.INFO, PLUGIN_ID, msg));
		} else {
			System.out.println(msg);
		}
	}

	public static void logWarning(String msg) {
		TRADESModelActivator act = getDefault();
		if (act != null) {
			act.log(new Status(IStatus.WARNING, PLUGIN_ID, msg));
		} else {
			System.out.println(msg);
		}
	}

}
