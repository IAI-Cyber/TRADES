/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.model.OscalMetadata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element With Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ElementWithClazz#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getElementWithClazz()
 * @model
 * @generated
 */
public interface ElementWithClazz extends EObject {
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(String)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getElementWithClazz_Clazz()
	 * @model
	 * @generated
	 */
	String getClazz();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.ElementWithClazz#getClazz <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' attribute.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(String value);

} // ElementWithClazz
