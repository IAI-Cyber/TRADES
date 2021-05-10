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
package dsm.TRADES;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affect Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AffectRelation#getData <em>Data</em>}</li>
 *   <li>{@link dsm.TRADES.AffectRelation#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link dsm.TRADES.AffectRelation#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link dsm.TRADES.AffectRelation#getAnalysisStatus <em>Analysis Status</em>}</li>
 *   <li>{@link dsm.TRADES.AffectRelation#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAffectRelation()
 * @model
 * @generated
 */
public interface AffectRelation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getAffectRelation_Data()
	 * @model
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Source Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Component#getAffectRelations <em>Affect Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Component</em>' container reference.
	 * @see #setSourceComponent(Component)
	 * @see dsm.TRADES.TRADESPackage#getAffectRelation_SourceComponent()
	 * @see dsm.TRADES.Component#getAffectRelations
	 * @model opposite="affectRelations" required="true" transient="false"
	 * @generated
	 */
	Component getSourceComponent();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AffectRelation#getSourceComponent <em>Source Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Component</em>' container reference.
	 * @see #getSourceComponent()
	 * @generated
	 */
	void setSourceComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Component</em>' reference.
	 * @see #setTargetComponent(Component)
	 * @see dsm.TRADES.TRADESPackage#getAffectRelation_TargetComponent()
	 * @model required="true"
	 * @generated
	 */
	Component getTargetComponent();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AffectRelation#getTargetComponent <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Component</em>' reference.
	 * @see #getTargetComponent()
	 * @generated
	 */
	void setTargetComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Analysis Status</b></em>' attribute.
	 * The default value is <code>"Confirmed"</code>.
	 * The literals are from the enumeration {@link dsm.TRADES.AffectedENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Status</em>' attribute.
	 * @see dsm.TRADES.AffectedENUM
	 * @see #setAnalysisStatus(AffectedENUM)
	 * @see dsm.TRADES.TRADESPackage#getAffectRelation_AnalysisStatus()
	 * @model default="Confirmed" required="true"
	 * @generated
	 */
	AffectedENUM getAnalysisStatus();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AffectRelation#getAnalysisStatus <em>Analysis Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Status</em>' attribute.
	 * @see dsm.TRADES.AffectedENUM
	 * @see #getAnalysisStatus()
	 * @generated
	 */
	void setAnalysisStatus(AffectedENUM value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see dsm.TRADES.TRADESPackage#getAffectRelation_Link()
	 * @model
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AffectRelation#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Check that the referenced data belong to correct scope.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDataScope(DiagnosticChain chain, Map context);

} // AffectRelation
