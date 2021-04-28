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
package dsm.oscal.model.OscalMetadata;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Citation</h1>
 * <h2>Description</h2>
 * <p>A citation consisting of end note text and optional structured bibliographic data.</p>
 * <h2>Remarks</h2>
 * <p>The <code>text</code> is used to define the endnote text, without any required bibliographic structure. If structured bibliographic data is needed, then the <code>biblio</code> can be used for this purpose.</p>
 * <p>A <code>biblio</code> can be used to capture a structured bibliographical citation in an appropriate format.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalMetadata.ResourceCitation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResourceCitation()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;citation'"
 * @generated
 */
public interface ResourceCitation extends OscalElement, PropertyOwner {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Citation Text</h1>
	 * <h2>Description</h2>
	 * <p>A line of citation text.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(MarkupLine)
	 * @see dsm.oscal.model.OscalMetadata.OscalMetadataPackage#getResourceCitation_Text()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-metadata.&lt;AssemblyDefinition&gt;citation.&lt;FieldInstance&gt;text'"
	 * @generated
	 */
	MarkupLine getText();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalMetadata.ResourceCitation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(MarkupLine value);

} // ResourceCitation
