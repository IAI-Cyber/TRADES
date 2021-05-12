/**
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
 */
package dsm.TRADES;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colored Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.ColoredElement#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getColoredElement()
 * @model abstract="true"
 * @generated
 */
public interface ColoredElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"#AAAAAA"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(RGBColor)
	 * @see dsm.TRADES.TRADESPackage#getColoredElement_Color()
	 * @model default="#AAAAAA" dataType="dsm.TRADES.RGBColor"
	 * @generated
	 */
	RGBColor getColor();

	/**
	 * Sets the value of the '{@link dsm.TRADES.ColoredElement#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(RGBColor value);

} // ColoredElement
