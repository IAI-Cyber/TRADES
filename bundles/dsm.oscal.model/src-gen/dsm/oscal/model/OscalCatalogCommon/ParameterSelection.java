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

import dsm.oscal.model.OscalMetadata.OscalElement;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Selection</h1>
 * <h2>Description</h2>
 * <p>Presenting a choice among alternatives</p>
 * <h2>Remarks</h2>
 * <p>A set of parameter value choices, that may be picked from to set the parameter value.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.ParameterSelection#getChoice <em>Choice</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.ParameterSelection#getHowMany <em>How Many</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameterSelection()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter-selection'"
 * @generated
 */
public interface ParameterSelection extends OscalElement {
	/**
	 * Returns the value of the '<em><b>How Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Parameter Cardinality</h1>
	 * <h2>Description</h2>
	 * <p>Describes the number of selections that must occur.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>How Many</em>' attribute.
	 * @see #setHowMany(String)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameterSelection_HowMany()
	 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter-selection.&lt;FlagInstance&gt;how-many'"
	 * @generated
	 */
	String getHowMany();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.ParameterSelection#getHowMany <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How Many</em>' attribute.
	 * @see #getHowMany()
	 * @generated
	 */
	void setHowMany(String value);

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' attribute list.
	 * The list contents are of type {@link gov.nist.secauto.metaschema.datatypes.markup.MarkupLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Choice</h1>
	 * <h2>Description</h2>
	 * <p>A value selection among several such options</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choice</em>' attribute list.
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameterSelection_Choice()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter-selection.&lt;FieldInstance&gt;parameter-choice'"
	 * @generated
	 */
	EList<MarkupLine> getChoice();

} // ParameterSelection
