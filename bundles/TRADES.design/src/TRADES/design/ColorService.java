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
package TRADES.design;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import dsm.TRADES.ImpactConfiguration;
import dsm.TRADES.RGBColor;

/**
 * Services used to handle color
 * 
 * @author Arthur Daussy
 *
 */
public class ColorService {

	public static final RGBColor RED = new RGBColor(255, 0, 0);
	public static final RGBColor BLUE = new RGBColor(0, 0, 255);
	public static final RGBColor GREEN = new RGBColor(0, 255, 0);
	public static final RGBColor WHITE = new RGBColor(255, 255, 255);
	public static final RGBColor BLACK = new RGBColor(0, 0, 0);

	/**
	 * @see RGBColor#encode()
	 */
	public String toColorString(RGBColor c) {
		return c.encode();
	}

	public int getRed(RGBColor c) {
		return c.getRed();
	}

	public int getBlue(RGBColor c) {
		return c.getBlue();
	}

	public int getGreen(RGBColor c) {
		return c.getGreen();
	}

	/**
	 * Computes a color from a ratio and two bounding color
	 * @param start the starting color
	 * @param end the ending color
	 * @param min the min value (color of the start)
	 * @param max the max color (color of the end)
	 * @param current the current value to be represented
	 * @return a new {@link RGBColor}
	 */
	public static RGBColor computeColor(RGBColor start, RGBColor end, double min, double max, double current) {
		if (current <= min) {
			return start.copy();
		} else if (current >= max) {
			return end.copy();
		} else {
			double range = max - min;
			double ratio = Math.abs(current) / range;
			return doComputeColor(start, end, ratio);
		}
	}

	private static RGBColor doComputeColor(RGBColor c0, RGBColor c1, double ratio) {
		return new RGBColor(//
				(int) (c1.getRed() * ratio + c0.getRed() * (1.0f - ratio)), //
				(int) (c1.getGreen() * ratio + c0.getGreen() * (1.0f - ratio)), //
				(int) (c1.getBlue() * ratio + c0.getBlue() * (1.0f - ratio))); // no transparency
	}


	/**
	 * Return the color to be used as a foreground color when the background color
	 * is the given color
	 * 
	 * @param backGround a color
	 * @return
	 */
	public RGBColor getForegroundColorForColor(RGBColor backGround) {
		if (computeLuminance(backGround) < 140) {
			return WHITE;
		} else {
			return BLACK;
		}
	}

	/**
	 * Compute
	 * 
	 * @param color a color
	 * 
	 * @return a luminance score
	 */
	private float computeLuminance(RGBColor color) {
		return (float) (0.2126 * color.getRed() + 0.7152 * color.getGreen() + 0.0722 * color.getBlue());
	}

	/**
	 * Service use to ask the user to pick a color and set it to the
	 * {@link ImpactConfiguration}
	 * 
	 * @param conf the context
	 */
	public void setRGBColorByUI(ImpactConfiguration conf) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		ColorDialog colorDialog = new ColorDialog(shell);
		RGBColor current = conf.getColor();
		colorDialog.setRGB(new RGB(current.getRed(), current.getGreen(), current.getBlue()));
		colorDialog.setText("Pick a color");
		RGB newColor = colorDialog.open();
		if (newColor != null) {
			conf.setColor(new RGBColor(newColor.red, newColor.green, newColor.blue));
		}
	}

}
