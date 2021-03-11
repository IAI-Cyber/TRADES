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
package dsm.TRADES;

public class RGBColor {
	private static final int SHIFT = 8;

	private static final int MASK = (1 << SHIFT) - 1;

	private static final int RSHIFT = SHIFT * 2;

	private static final int GSHIFT = SHIFT * 1;

	private static final int BSHIFT = SHIFT * 0;

	private int red;

	private int blue;

	private int green;

	/**
	 * Creates an opaque sRGB color with the specified red, green, and blue values
	 * in the range (0 - 255).
	 * <p>
	 * Value ranges are not tested, and behavior is not secure when using
	 * {@link #encode()} function.
	 * </p>
	 * 
	 * @param r red
	 * @param g green
	 * @param b blue
	 */
	public RGBColor(int r, int g, int b) {
		red = r;
		blue = b;
		green = g;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof RGBColor)) {
			return false;
		}
		return toHex() == ((RGBColor) obj).toHex();
	}

	@Override
	public int hashCode() {
		return toHex();
	}

	/**
	 * Encodes the 3 parts as a single int.
	 * <p>
	 * As only 0 to 255 is usable in color code, using a right shift, it is possible
	 * to encode RGB into a integer.
	 * </p>
	 * 
	 * @return encoded color
	 */
	public int toHex() {
		return ((red & MASK) << RSHIFT) //
				| ((green & MASK) << GSHIFT)//
				| ((blue & MASK) << BSHIFT);
	}

	public String toHexString() {
		return String.format("#%06X", (0xFFFFFF & toHex()));
	}

	/**
	 * Encodes the color into String.
	 * <p>
	 * Basically, it create a String of Hex representation. The result can be used
	 * by {@link #decode(String)} to create an equivalent color.
	 * </p>
	 * 
	 * @return encoded color
	 */
	public String encode() {
		return Integer.toString(toHex());
	}

	/**
	 * Create an RGBColor using String value.
	 * 
	 * @param text to decode
	 * @return null if empty or a color
	 * @throws IllegalArgumentException if text format is not supported
	 */
	public static RGBColor decode(String text) throws IllegalArgumentException {
		if (text == null || text.isEmpty()) {
			return null;
		}
		int i = Integer.decode(text).intValue();
		return new RGBColor((i >> RSHIFT) & MASK, (i >> GSHIFT) & MASK, (i >> BSHIFT) & MASK);
	}

	/**
	 * Returns the red.
	 * 
	 * @return the red
	 */
	public int getRed() {
		return red;
	}

	/**
	 * Sets the red.
	 * 
	 * @param red the value to set
	 */
	public void setRed(int red) {
		this.red = red;
	}

	/**
	 * Returns the blue.
	 * 
	 * @return the blue
	 */
	public int getBlue() {
		return blue;
	}

	/**
	 * Sets the blue.
	 * 
	 * @param blue the value to set
	 */
	public void setBlue(int blue) {
		this.blue = blue;
	}

	/**
	 * Returns the green.
	 * 
	 * @return the green
	 */
	public int getGreen() {
		return green;
	}

	/**
	 * Sets the green.
	 * 
	 * @param green the value to set
	 */
	public void setGreen(int green) {
		this.green = green;
	}

	public RGBColor copy() {
		return new RGBColor(red, green, blue);
	}

	public RGBColor merge(RGBColor other) {

		return new RGBColor((int) Math.round((red + other.getRed()) / 2.0), //
				(int) Math.round((green + other.getGreen()) / 2.0), //
				(int) Math.round((blue + other.getBlue()) / 2.0));
	}
}
