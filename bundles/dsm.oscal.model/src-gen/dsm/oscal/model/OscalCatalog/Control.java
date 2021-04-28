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
package dsm.oscal.model.OscalCatalog;

import dsm.oscal.model.OscalCatalogCommon.Parameter;

import dsm.oscal.model.OscalMetadata.ElementWithClazz;
import dsm.oscal.model.OscalMetadata.ElementWithId;
import dsm.oscal.model.OscalMetadata.LinkOwner;
import dsm.oscal.model.OscalMetadata.OscalElement;
import dsm.oscal.model.OscalMetadata.PartOwner;
import dsm.oscal.model.OscalMetadata.PropertyOwner;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <h1>Control</h1>
 * <h2>Description</h2>
 * <p>A structured information object representing a security or privacy control. Each security or privacy control within the Catalog is defined by a distinct control instance.</p>
 * <h2>Remarks</h2>
 * <p>Controls may be grouped using <code>group</code>, and controls may be partitioned using <code>part</code> or further enhanced (extended) using <code>control</code>.</p>
 * <p>A control must have a part with the name <q>statement</q>, which represents the textual narrative of the control. This <q>statement</q> part must occur only once, but may have nested parts to allow for multiple paragraphs or sections of text.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getControls <em>Controls</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getParams <em>Params</em>}</li>
 *   <li>{@link dsm.oscal.model.OscalCatalog.Control#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl()
 * @model annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;control'"
 * @generated
 */
public interface Control extends OscalElement, PropertyOwner, LinkOwner, PartOwner, ElementWithClazz, ElementWithId {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalog.Control}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Controls()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;control'"
	 * @generated
	 */
	EList<Control> getControls();

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.OscalCatalogCommon.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Params()
	 * @model containment="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog-common.&lt;AssemblyDefinition&gt;parameter'"
	 * @generated
	 */
	EList<Parameter> getParams();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <h1>Control Title</h1>
	 * <h2>Description</h2>
	 * <p>A name given to the control, which may be used by a tool for display and navigation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(MarkupLine)
	 * @see dsm.oscal.model.OscalCatalog.OscalCatalogPackage#getControl_Title()
	 * @model dataType="dsm.oscal.model.OscalMetadata.MarkupLineType" required="true"
	 *        annotation="Metaschema source='&lt;Metaschema&gt;oscal-catalog.&lt;AssemblyDefinition&gt;control.&lt;FieldInstance&gt;title'"
	 * @generated
	 */
	MarkupLine getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.OscalCatalog.Control#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLine value);

} // Control
