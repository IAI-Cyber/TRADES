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
 * A representation of the model object '<em><b>Set Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter setting, to be propagated to points of insertion
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.SetParameter#getParamId <em>Param Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.SetParameter#getClass_ <em>Class</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.SetParameter#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.SetParameter#getLabel <em>Label</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.SetParameter#getUsage <em>Usage</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.SetParameter#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.SetParameter#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.SetParameter#getValue <em>Value</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.SetParameter#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter()
 * @model
 * @generated
 */
public interface SetParameter extends PropertyOwner, AnnotationOwner, LinkOwner {
	/**
	 * Returns the value of the '<em><b>Param Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the value of the 'id' flag on a target parameter; i.e. which parameter to set
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param Id</em>' attribute.
	 * @see #setParamId(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter_ParamId()
	 * @model required="true"
	 * @generated
	 */
	String getParamId();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.SetParameter#getParamId <em>Param Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Id</em>' attribute.
	 * @see #getParamId()
	 * @generated
	 */
	void setParamId(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual label that provides a characterization of the parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.SetParameter#getClass_ <em>Class</em>}' attribute.
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
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter_DependsOn()
	 * @model
	 * @generated
	 */
	String getDependsOn();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.SetParameter#getDependsOn <em>Depends On</em>}' attribute.
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
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter_Label()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupLine"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.SetParameter#getLabel <em>Label</em>}' attribute.
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
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter_Usage()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupLine"
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.SetParameter#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.OSCALConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<OSCALConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Guideline</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guideline</em>' attribute list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter_Guideline()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupMultiline"
	 * @generated
	 */
	EList<String> getGuideline();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter_Value()
	 * @model
	 * @generated
	 */
	EList<String> getValue();

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Select}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getSetParameter_Select()
	 * @model containment="true"
	 * @generated
	 */
	EList<Select> getSelect();

} // SetParameter
