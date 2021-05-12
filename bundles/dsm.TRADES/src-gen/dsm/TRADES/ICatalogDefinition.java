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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICatalog Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dsm.TRADES.TRADESPackage#getICatalogDefinition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ICatalogDefinition extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IThreatDefinition getThreatById(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IControlDefinition getControlById(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get all the threat definition (with valid id) contained by this catalog definition
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<IThreatDefinition> getThreatDefinitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get all the control definition (with valid id) contained by this catalog definition
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<IControlDefinition> getControlDefinitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

} // ICatalogDefinition
