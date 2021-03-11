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
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A textual label that provides a sub-type or characterization of the group
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Group#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Group#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Group#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Group#getGroups <em>Groups</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Group#getControlsDefinition <em>Controls Definition</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends PropertyOwner, ParameterOwner, AnnotationOwner, LinkOwner, NamedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for a specific group instance that can be used to reference the group within this and in other OSCAL documents. This identifier's uniqueness is document scoped and is intended to be consistent for the same group across minor revisions of the document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getGroup_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Group#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getGroup_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Group#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Partition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getGroup_Partitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partition> getPartitions();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getGroup_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Controls Definition</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.ControlDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls Definition</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getGroup_ControlsDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlDefinition> getControlsDefinition();

} // Group
