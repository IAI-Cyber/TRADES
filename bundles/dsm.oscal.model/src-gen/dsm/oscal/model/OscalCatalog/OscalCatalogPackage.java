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

import dsm.oscal.model.OscalMetadata.OscalMetadataPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsm.oscal.model.OscalCatalog.OscalCatalogFactory
 * @model kind="package"
 * @generated
 */
public interface OscalCatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OscalCatalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://csrc.nist.gov/ns/oscal/1.0/oscal-catalog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oscal-catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OscalCatalogPackage eINSTANCE = dsm.oscal.model.OscalCatalog.impl.OscalCatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalCatalog.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalCatalog.impl.CatalogImpl
	 * @see dsm.oscal.model.OscalCatalog.impl.OscalCatalogPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__UUID = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__PARAMS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__BACK_MATTER = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONTROLS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__GROUPS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__METADATA = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___RESOLVE__URI = OscalMetadataPackage.OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The operation id for the '<em>Get Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_PARAMETER_VALUES = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Threat By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_THREAT_BY_ID__STRING = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Control By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_CONTROL_BY_ID__STRING = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Threat Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_THREAT_DEFINITIONS = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Control Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_CONTROL_DEFINITIONS = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_IDENTIFIER = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG___GET_NAME = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalCatalog.impl.ControlImpl
	 * @see dsm.oscal.model.OscalCatalog.impl.OscalCatalogPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PARAMS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PROPS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__LINKS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PARTS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CLAZZ = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROLS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TITLE = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___RESOLVE__URI = OscalMetadataPackage.OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The operation id for the '<em>Get Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_PARAMETER_VALUES = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___COMPUTE_DOCUMENTATION = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_DESCRIPTION = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_ID = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Mitigated Threat Definitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_MITIGATED_THREAT_DEFINITIONS = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___GET_NAME = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.OscalCatalog.impl.GroupImpl
	 * @see dsm.oscal.model.OscalCatalog.impl.OscalCatalogPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARAMS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PROPS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LINKS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARTS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CLAZZ = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTROLS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPS = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___RESOLVE__URI = OscalMetadataPackage.OSCAL_ELEMENT___RESOLVE__URI;

	/**
	 * The operation id for the '<em>Get Parameter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___GET_PARAMETER_VALUES = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Compute Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___COMPUTE_DOCUMENTATION = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = OscalMetadataPackage.OSCAL_ELEMENT_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalCatalog.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.OscalCatalog.Catalog#getBackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Back Matter</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Catalog#getBackMatter()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_BackMatter();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalog.Catalog#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Catalog#getControls()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalog.Catalog#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Catalog#getGroups()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Groups();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.OscalCatalog.Catalog#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Catalog#getMetadata()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Metadata();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalCatalog.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalog.Control#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Control#getControls()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Controls();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalog.Control#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Control#getTitle()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Title();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.OscalCatalog.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalog.Group#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Group#getControls()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.OscalCatalog.Group#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Group#getGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Groups();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.OscalCatalog.Group#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.OscalCatalog.Group#getTitle()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Title();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OscalCatalogFactory getOscalCatalogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalCatalog.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalCatalog.impl.CatalogImpl
		 * @see dsm.oscal.model.OscalCatalog.impl.OscalCatalogPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Back Matter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__BACK_MATTER = eINSTANCE.getCatalog_BackMatter();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__CONTROLS = eINSTANCE.getCatalog_Controls();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__GROUPS = eINSTANCE.getCatalog_Groups();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__METADATA = eINSTANCE.getCatalog_Metadata();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalCatalog.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalCatalog.impl.ControlImpl
		 * @see dsm.oscal.model.OscalCatalog.impl.OscalCatalogPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__CONTROLS = eINSTANCE.getControl_Controls();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__TITLE = eINSTANCE.getControl_Title();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.OscalCatalog.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.OscalCatalog.impl.GroupImpl
		 * @see dsm.oscal.model.OscalCatalog.impl.OscalCatalogPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CONTROLS = eINSTANCE.getGroup_Controls();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUPS = eINSTANCE.getGroup_Groups();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TITLE = eINSTANCE.getGroup_Title();

	}

} //OscalCatalogPackage
