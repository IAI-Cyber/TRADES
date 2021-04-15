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

import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element With Remarks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ElementWithRemarks#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getElementWithRemarks()
 * @model
 * @generated
 */
public interface ElementWithRemarks extends EObject {
	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(MarkupMultiline)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getElementWithRemarks_Remarks()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType"
	 * @generated
	 */
	MarkupMultiline getRemarks();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.ElementWithRemarks#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultiline value);

} // ElementWithRemarks
