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
package dsm.TRADES.rcp.mitre;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class TradesMitreActivator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "dsm.TRADES.rcp.mitre"; //$NON-NLS-1$

	// The shared instance
	private static TradesMitreActivator plugin;


	/**
	 * The constructor
	 */
	public TradesMitreActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static TradesMitreActivator getDefault() {
		return plugin;
	}

}
