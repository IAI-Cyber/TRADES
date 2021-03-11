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
package dsm.oscal.model.Oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Merge element merges controls in resolution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Merge#getCombine <em>Combine</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getMerge()
 * @model
 * @generated
 */
public interface Merge extends EObject {
	/**
	 * Returns the value of the '<em><b>Combine</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Combine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combine</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getMerge_Combine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Combine> getCombine();

} // Merge
