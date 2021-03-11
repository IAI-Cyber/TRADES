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
 * A representation of the model object '<em><b>Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies contents to be added into controls, in resolution
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Addition#getPosition <em>Position</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Addition#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Addition#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Addition#getPartitions <em>Partitions</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getAddition()
 * @model
 * @generated
 */
public interface Addition extends ParameterOwner, PropertyOwner, AnnotationOwner, LinkOwner {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where to add the new content with respect to the targeted element (beside it or inside it)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getAddition_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Addition#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target location of the addition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id Ref</em>' attribute.
	 * @see #setIdRef(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getAddition_IdRef()
	 * @model
	 * @generated
	 */
	String getIdRef();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Addition#getIdRef <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' attribute.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getAddition_Title()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupLine"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Addition#getTitle <em>Title</em>}' attribute.
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
	 * @see dsm.oscal.model.Oscal.OscalPackage#getAddition_Partitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partition> getPartitions();

} // Addition
