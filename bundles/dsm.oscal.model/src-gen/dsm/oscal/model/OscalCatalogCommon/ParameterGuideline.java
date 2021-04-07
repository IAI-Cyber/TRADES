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

import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Guideline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Guideline</h1>
 * <h2>Description</h2>
 * <p>A prose statement that provides a recommendation for the use of a parameter.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalogCommon.ParameterGuideline#getProse <em>Prose</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameterGuideline()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter-guideline'"
 * @generated
 */
public interface ParameterGuideline extends EObject {
	/**
	 * Returns the value of the '<em><b>Prose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Guideline Text</h1>
	 * <h2>Description</h2>
	 * <p>Prose permits multiple paragraphs, lists, tables etc.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prose</em>' attribute.
	 * @see #setProse(MarkupMultiline)
	 * @see dsm.oscal.model.OscalCatalogCommon.OscalCatalogCommonPackage#getParameterGuideline_Prose()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupMultilineType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter-guideline.&lt;FieldInstance&gt;prose'"
	 * @generated
	 */
	MarkupMultiline getProse();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalogCommon.ParameterGuideline#getProse <em>Prose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prose</em>' attribute.
	 * @see #getProse()
	 * @generated
	 */
	void setProse(MarkupMultiline value);

} // ParameterGuideline
