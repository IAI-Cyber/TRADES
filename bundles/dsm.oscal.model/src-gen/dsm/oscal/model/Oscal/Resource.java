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
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource associated with content in the containing document. A resource may be directly included in the document base64 encoded or may point to one or more equavalent internet resources
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.Resource#getUuid <em>Uuid</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Resource#getTitle <em>Title</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Resource#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Resource#getDocumentIds <em>Document Ids</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Resource#getCitation <em>Citation</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Resource#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Resource#getBase64 <em>Base64</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.Resource#getRLinks <em>RLinks</em>}</li>
 * </ul>
 *
 * @see dsm.oscal.model.Oscal.OscalPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends PropertyOwner, AnnotationOwner {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A globally unique identifier that can be used to reference this defined resource elsewhere in an OSCAL document. A UUID should be consistantly used for a given resource across revisions of the document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getResource_Uuid()
	 * @model required="true"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Resource#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getResource_Title()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupLine"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Resource#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getResource_Description()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupMultiline"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Resource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Document Ids</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.DocumentId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Ids</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getResource_DocumentIds()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentId> getDocumentIds();

	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference.
	 * @see #setCitation(Citation)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getResource_Citation()
	 * @model containment="true"
	 * @generated
	 */
	Citation getCitation();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Resource#getCitation <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citation</em>' containment reference.
	 * @see #getCitation()
	 * @generated
	 */
	void setCitation(Citation value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getResource_Remarks()
	 * @model dataType="dsm.oscal.model.Oscal.MarkupMultiline"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Resource#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Base64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64</em>' containment reference.
	 * @see #setBase64(Base64)
	 * @see dsm.oscal.model.Oscal.OscalPackage#getResource_Base64()
	 * @model containment="true"
	 * @generated
	 */
	Base64 getBase64();

	/**
	 * Sets the value of the '{@link dsm.oscal.model.Oscal.Resource#getBase64 <em>Base64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64</em>' containment reference.
	 * @see #getBase64()
	 * @generated
	 */
	void setBase64(Base64 value);

	/**
	 * Returns the value of the '<em><b>RLinks</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.oscal.model.Oscal.Rlink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RLinks</em>' containment reference list.
	 * @see dsm.oscal.model.Oscal.OscalPackage#getResource_RLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rlink> getRLinks();

} // Resource
