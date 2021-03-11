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

package dsm.trades.branding;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.splash.EclipseSplashHandler;
import org.osgi.framework.Version;

/**
 * Custom splash handler that add the current version of the product to the
 * splash screen
 * 
 * @author Arthur Daussy
 *
 */
public class SplashHandler extends EclipseSplashHandler {

	private static final String WHITE_COLOR = "White";

	private static final String TRADES_COLOR_NAME = "TradesColor";

	private static final int BORDER = 15;

	public SplashHandler() {
		super();
	}

	@Override
	public void init(Shell splash) {
		super.init(splash);

		JFaceResources.getColorRegistry().put(WHITE_COLOR, new RGB(255, 255, 255));
		JFaceResources.getColorRegistry().put(TRADES_COLOR_NAME, new RGB(3, 72, 141));
		FontDescriptor fontDesc = JFaceResources.getDefaultFontDescriptor();
		Font font = fontDesc.increaseHeight(15).createFont(splash.getDisplay());
		Version version = Activator.getDefault().getBundle().getVersion();
		String versionText = version.getMajor() + "." + version.getMinor() + "." + version.getMicro();
		// here you could check some condition on which decoration to show

		getContent().addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent e) {

				e.gc.setBackground(JFaceResources.getColorRegistry().get(WHITE_COLOR));
				e.gc.setForeground(JFaceResources.getColorRegistry().get(TRADES_COLOR_NAME));
				e.gc.setFont(font);
				final int xposition = splash.getSize().x - e.gc.textExtent(versionText).x - BORDER;
				final int yposition = BORDER;
				e.gc.drawString(versionText, xposition, yposition);
			}
		});
	}

}
