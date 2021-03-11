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
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameters provide a mechanism for the dynamic assignment of value(s) in a control
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Parameter#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Parameter#getClass_ <em>Class</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Parameter#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Parameter#getLabel <em>Label</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Parameter#getUsage <em>Usage</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Parameter#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Parameter#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Parameter#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends PropertyOwner, AnnotationOwner, LinkOwner {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for a specific parameter instance. This identifier's uniqueness is document scoped and is intended to be consistent for the same parameter across minor revisions of the document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(short)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter_Id()
	 * @model required="true"
	 * @generated
	 */
	short getId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Parameter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(short value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual label that provides a characterization of the parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Parameter#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another parameter invoking this one
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute.
	 * @see #setDependsOn(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter_DependsOn()
	 * @model
	 * @generated
	 */
	String getDependsOn();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Parameter#getDependsOn <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' attribute.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter_Label()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupLine"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Parameter#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter_Usage()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupMultiline"
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Parameter#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Guideline</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A prose statement that provides a recommendation for the use of a parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guideline</em>' attribute list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter_Guideline()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupMultiline"
	 * @generated
	 */
	EList<String> getGuideline();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter value or set of values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(Select)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getParameter_Select()
	 * @model containment="true"
	 * @generated
	 */
	Select getSelect();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Parameter#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(Select value);

} // Parameter
