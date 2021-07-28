/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */
package org.eclipse.eef.ide.ui.ext.widgets.markup;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.BundleContext;

/**
 * Activator for this plugin.
 *
 * @author Arthur Daussy
 *
 */
public class EEFExtMarkupUIPlugin extends EMFPlugin {

	/**
	 * Id of the plugin.
	 */
	public static final String PLUGIN_ID = "org.eclipse.eef.ide.ui.ext.widgets.markup"; //$NON-NLS-1$

	/**
	 * Instance of this plugin.
	 */
	public static final EEFExtMarkupUIPlugin INSTANCE = new EEFExtMarkupUIPlugin();

	/**
	 * The one instance of this class.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	public EEFExtMarkupUIPlugin() {
		super(new ResourceLocator[] {});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.common.EMFPlugin#getPluginResourceLocator()
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the plugin.
	 *
	 * @return The singleton instance of the plugin
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * Log an info.
	 *
	 * @param message
	 *            a message
	 */
	public static void logInfo(String message) {
		if (plugin != null) {
			plugin.doLogInfo(message);
		} else {
			System.out.println(message);
		}
	}

	/**
	 * Log a warning.
	 *
	 * @param message
	 *            a message
	 * @param e
	 *            a {@link Throwable}
	 */
	public static void logWarning(String message, Throwable e) {
		if (plugin != null) {
			plugin.doLogWarning(message, e);
		} else {
			System.out.println(message);
		}
	}

	/**
	 * Tries to log an error (either in the eclipse logging system if the plugin is started or in System.err).
	 *
	 * @param message
	 *            the message
	 * @param e
	 *            an exception
	 */
	public static void logError(String message, Throwable e) {
		if (plugin != null) {
			plugin.doLogError(message, e);
		} else {
			System.err.println(message);
			e.printStackTrace();
		}
	}

	/**
	 * The actual implementation of the Eclipse Activator.
	 *
	 * @author sbegaudeau
	 */
	public static class Implementation extends EclipseUIPlugin {

		/**
		 * The constructor.
		 */
		public Implementation() {
			super();
			plugin = this;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
		 */
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);

		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
		 */
		@Override
		public void stop(BundleContext context) throws Exception {
			super.stop(context);
		}

		/**
		 * Gets an image form a path.
		 *
		 * @param path
		 *            relative path to the root of this plugin
		 * @return a {@link Image} or <code>null</code>
		 */
		@Override
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

		/**
		 * Do log an info.
		 *
		 * @param message
		 *            a message
		 */
		private void doLogInfo(String message) {
			getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message));
		}

		/**
		 * Do log an error.
		 *
		 * @param message
		 *            a message
		 */
		private void doLogError(String message) {
			getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message));
		}

		/**
		 * Do log a warning.
		 *
		 * @param message
		 *            a message
		 * @param e
		 *            a {@link Throwable}
		 */
		private void doLogWarning(String message, Throwable e) {
			getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, message, e));
		}

		/**
		 * Log an error.
		 *
		 * @param message
		 *            a message
		 */
		public static void logError(String message) {
			if (plugin != null) {
				plugin.doLogError(message);
			} else {
				System.err.println(message);
			}
		}

		/**
		 * Do log an error.
		 *
		 * @param message
		 *            a message
		 * @param e
		 *            a {@link Throwable}
		 */
		private void doLogError(String message, Throwable e) {
			getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message, e));
		}

	}

}
