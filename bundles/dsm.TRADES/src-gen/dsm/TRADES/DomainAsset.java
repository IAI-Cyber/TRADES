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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.DomainAsset#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getDomainAsset()
 * @model
 * @generated
 */
public interface DomainAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute list.
	 * The list contents are of type {@link dsm.TRADES.ComponentCategoryENUM}.
	 * The literals are from the enumeration {@link dsm.TRADES.ComponentCategoryENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute list.
	 * @see dsm.TRADES.ComponentCategoryENUM
	 * @see dsm.TRADES.TRADESPackage#getDomainAsset_Category()
	 * @model
	 * @generated
	 */
	EList<ComponentCategoryENUM> getCategory();

} // DomainAsset
