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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of controls
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Catalog#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Catalog#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Catalog#getGroups <em>Groups</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Catalog#getBackmatter <em>Backmatter</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Catalog#getControlsDefinition <em>Controls Definition</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends ParameterOwner {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A globally unique identifier for this catalog instance. This UUID should be changed when this document is revised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCatalog_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Catalog#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCatalog_Metadata()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Catalog#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCatalog_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Backmatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backmatter</em>' containment reference.
	 * @see #setBackmatter(BackMatter)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCatalog_Backmatter()
	 * @model containment="true"
	 * @generated
	 */
	BackMatter getBackmatter();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Catalog#getBackmatter <em>Backmatter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backmatter</em>' containment reference.
	 * @see #getBackmatter()
	 * @generated
	 */
	void setBackmatter(BackMatter value);

	/**
	 * Returns the value of the '<em><b>Controls Definition</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.ControlDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls Definition</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getCatalog_ControlsDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlDefinition> getControlsDefinition();

} // Catalog
