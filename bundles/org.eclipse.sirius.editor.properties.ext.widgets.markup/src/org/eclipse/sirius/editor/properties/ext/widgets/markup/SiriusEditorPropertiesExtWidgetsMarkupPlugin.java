/**
 * Copyright (c) Obeo, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo and Israel Aerospace Industries - initial API and implementation
 *
 */
package org.eclipse.sirius.editor.properties.ext.widgets.markup;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;

/**
 * 
 * Activator of the plugin.
 * 
 * @author Arthur Daussy
 *
 */
public class SiriusEditorPropertiesExtWidgetsMarkupPlugin extends EMFPlugin {

    /**
     * Id of the plugin.
     */
    public static final String PLUGIN_ID = "org.eclipse.sirius.editor.properties.ext.widgets.markup"; //$NON-NLS-1$

    /**
     * Instance of this plugin.
     */
    public static final SiriusEditorPropertiesExtWidgetsMarkupPlugin INSTANCE = new SiriusEditorPropertiesExtWidgetsMarkupPlugin();

    /**
     * The one instance of this class.
     */
    private static Implementation plugin;

    /**
     * The constructor.
     */
    public SiriusEditorPropertiesExtWidgetsMarkupPlugin() {
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
     * The actual implementation of the Eclipse Activator.
     *
     * @author Arthur Daussy
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

    }

}
