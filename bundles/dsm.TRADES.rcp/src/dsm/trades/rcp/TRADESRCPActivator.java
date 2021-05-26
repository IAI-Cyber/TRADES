/******************************************************************************************************
* Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
* This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
* 
* SPDX-License-Identifier: EPL-2.0
* 
* Contributors:
*     ELTA Ltd - initial API and implementation
* 
*******************************************************************************************************/
package dsm.trades.rcp;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import dsm.trades.rcp.databases.ICatalogRegistry;
import dsm.trades.rcp.databases.ICatalogRegistryConfigurator;
import dsm.trades.rcp.internal.databases.CatalogRegistryImpl;

/**
 * The activator class controls the plug-in life cycle
 */
public class TRADESRCPActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "dsm.TRADES.rcp"; //$NON-NLS-1$

	// The shared instance
	private static TRADESRCPActivator plugin;

	private CatalogRegistryImpl catalogRegistry = new CatalogRegistryImpl();

	/**
	 * The constructor
	 */
	public TRADESRCPActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		Job.create("Init TRADES external catalog registry", monitor -> {
			try {
				@SuppressWarnings("unchecked")
				ServiceReference<?>[] providerRefs = context
						.getAllServiceReferences(ICatalogRegistryConfigurator.class.getCanonicalName(), null);
				if (providerRefs != null) {
					for (ServiceReference<?> ref : providerRefs) {
						ICatalogRegistryConfigurator tmpProvider = (ICatalogRegistryConfigurator) context
								.getService(ref);
						tmpProvider.configure(catalogRegistry);
						context.ungetService(ref);
					}
				}
			} catch (InvalidSyntaxException e) {
				logError("Error during registration of external templates", e);

			}
		}).schedule(1000);

	}

	public ICatalogRegistry getCatalogRegistry() {
		return catalogRegistry;
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
	public static TRADESRCPActivator getDefault() {
		return plugin;
	}

	private void doLogInfo(String message) {
		getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message));
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
