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
package dsm.trades.m2doc;

import java.net.URL;
import java.util.Iterator;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.obeonetwork.m2doc.ide.M2DocPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import dsm.trades.m2doc.internal.M2DocTemplateRegistry;

/**
 * The activator class controls the plug-in life cycle
 */
public class TradesM2docActivator extends AbstractUIPlugin {

	public static final String DOCX = "docx";

	private static final String TEMPLATES_FOLDER = "/templates";

	// The plug-in ID
	public static final String PLUGIN_ID = "dsm.TRADES.m2doc"; //$NON-NLS-1$

	// The shared instance
	private static TradesM2docActivator plugin;

	private IM2DocTemplateRegistry templateRegistry;

	/**
	 * The constructor
	 */
	public TradesM2docActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		templateRegistry = new M2DocTemplateRegistry();

		Iterator<String> ite = plugin.getBundle().getEntryPaths(TEMPLATES_FOLDER).asIterator();
		while (ite.hasNext()) {
			String entry = ite.next();
			if (entry.endsWith(DOCX) && !entry.startsWith("~")) {
				URI uri = URI.createPlatformPluginURI("/" + PLUGIN_ID + "/" + entry, true);
				templateRegistry.addTemplate(uri, entry.substring(TEMPLATES_FOLDER.length(), entry.length() - 5));
			}

		}

		Job.create("Init TRADES external template provider", monitor -> {
			try {
				@SuppressWarnings("unchecked")
				ServiceReference<IM2docTemplateRegistryConfigurator>[] providerRefs = (ServiceReference<IM2docTemplateRegistryConfigurator>[]) context
						.getServiceReferences(IM2docTemplateRegistryConfigurator.class.getCanonicalName(), null);
				if (providerRefs != null) {
					for (ServiceReference<IM2docTemplateRegistryConfigurator> ref : providerRefs) {
						IM2docTemplateRegistryConfigurator tmpProvider = context.getService(ref);
						tmpProvider.configure(templateRegistry);
						context.ungetService(ref);
					}
				}
			} catch (InvalidSyntaxException e) {
				TradesM2docActivator.logError("Error during registration of external templates", e);

			}
		}).schedule();

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
	public static TradesM2docActivator getDefault() {
		return plugin;
	}

	private void doLogInfo(String message) {
		getLog().log(createInfoStatus(message));
	}

	public static Status createInfoStatus(String message) {
		return new Status(IStatus.INFO, PLUGIN_ID, message);
	}

	private void doLogWarning(String message) {
		getLog().log(createWarningStatus(message));
	}

	public static Status createWarningStatus(String message) {
		return new Status(IStatus.WARNING, PLUGIN_ID, message);
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

	public Image getImage(String path) {
		Image img = getImageRegistry().get(path);
		if (img == null) {

			URL url = FileLocator.find(getBundle(), new org.eclipse.core.runtime.Path(path), null);
			if (url != null) {
				getImageRegistry().put(path, ImageDescriptor.createFromURL(url));
				img = getImageRegistry().get(path);
			}
		}
		return img;
	}

	public ImageDescriptor getImageDescriptor(String path) {
		ImageDescriptor img = getImageRegistry().getDescriptor(path);
		if (img == null) {

			URL url = FileLocator.find(getBundle(), new org.eclipse.core.runtime.Path(path), null);
			if (url != null) {
				getImageRegistry().put(path, ImageDescriptor.createFromURL(url));
				img = getImageRegistry().getDescriptor(path);
			}
		}
		return img;
	}

	private void doLogError(String string, Throwable e) {
		getLog().log(createErrorStatus(string, e));
	}

	public static Status createErrorStatus(String string, Throwable e) {
		return new Status(IStatus.ERROR, PLUGIN_ID, string, e);
	}

	public static Status createErrorStatus(String string) {
		return new Status(IStatus.ERROR, PLUGIN_ID, string);
	}

}
