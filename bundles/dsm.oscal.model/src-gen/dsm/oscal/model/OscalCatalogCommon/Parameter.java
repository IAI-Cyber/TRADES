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
package dsm.oscal.model.OscalCatalogCommon;

import dsm.oscal.model.OscalMetadata.ElementWithClazz;
import dsm.oscal.model.OscalMetadata.ElementWithId;
import dsm.oscal.model.OscalMetadata.ElementWithRemarks;
import dsm.oscal.model.OscalMetadata.LinkOwner;
import dsm.oscal.model.OscalMetadata.OscalElement;
import dsm.oscal.model.OscalMetadata.PropertyOwner;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Parameter</h1>
 * <h2>Description</h2>
 * <p>Parameters provide a mechanism for the dynamic assignment of value(s) in a control.</p>
 * <h2>Remarks</h2>
 * <p>In a catalog, a parameter is typically used as a placeholder for the future assignment of a parameter value, although the OSCAL model allows for the direct assignment of a value if desired by the control author. The <code>value</code> may be optionally used to specify one or more values. If no value is provided, then it is expected that the value will be provided at the Profile or Implementation layer.</p>
 * <p>A parameter can include a variety of metadata options that support the future solicitation of one or more values. A <code>label</code> provides a textual placeholder that can be used in a tool to solicit parameter value input, or to display in catalog documentation. The <code>desc</code> provides a short description of what the parameter is used for, which can be used in tooling to help a user understand how to use the parameter. A <code>constraint</code> can be used to provide criteria for the allowed values. A <code>guideline</code> provides a recommendation for the use of a parameter.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getGuidelines <em>Guidelines</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getLabel <em>Label</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getSelect <em>Select</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getUsage <em>Usage</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameter()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter'"
 * @generated
 */
public interface Parameter extends OscalElement, PropertyOwner, LinkOwner, ElementWithRemarks, ElementWithClazz, ElementWithId {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalogCommon.ParameterConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameter_Constraints()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter-constraint'"
	 * @generated
	 */
	EList<ParameterConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Depends on</h1>
	 * <h2>Description</h2>
	 * <p>Another parameter invoking this one</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' attribute.
	 * @see #setDependsOn(String)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameter_DependsOn()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter.&lt;FlagInstance&gt;depends-on'"
	 * @generated
	 */
	String getDependsOn();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getDependsOn <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' attribute.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(String value);

	/**
	 * Returns the value of the '<em><b>Guidelines</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalogCommon.ParameterGuideline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guidelines</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameter_Guidelines()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter-guideline'"
	 * @generated
	 */
	EList<ParameterGuideline> getGuidelines();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Parameter Label</h1>
	 * <h2>Description</h2>
	 * <p>A short, placeholder name for the parameter, which can be used as a substitute for a <code>value</code> if no value is assigned.</p>
	 * <h2>Remarks</h2>
	 * <p>The label value should be suitable for inline display in a rendered catalog.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(MarkupLine)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameter_Label()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter.&lt;FieldInstance&gt;label'"
	 * @generated
	 */
	MarkupLine getLabel();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(MarkupLine value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(ParameterSelection)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameter_Select()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter-selection'"
	 * @generated
	 */
	ParameterSelection getSelect();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(ParameterSelection value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Parameter Usage Description</h1>
	 * <h2>Description</h2>
	 * <p>Describes the purpose and use of a parameter</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(MarkupMultiline)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameter_Usage()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter.&lt;FieldInstance&gt;usage'"
	 * @generated
	 */
	MarkupMultiline getUsage();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.Parameter#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(MarkupMultiline value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Parameter Value</h1>
	 * <h2>Description</h2>
	 * <p>A parameter value or set of values.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameter_Values()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter.&lt;FieldInstance&gt;parameter-value'"
	 * @generated
	 */
	EList<String> getValues();

} // Parameter
