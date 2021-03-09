/**
 */
package dsm.oscal.model.Oscal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see dsm.oscal.model.Oscal.OscalFactory
 * @model kind="package"
 * @generated
 */
public interface OscalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Oscal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsm.oscal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oscal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OscalPackage eINSTANCE = dsm.oscal.model.Oscal.impl.OscalPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.LinkImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = 0;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = 1;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MEDIA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXT = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.PropertyOwnerImpl <em>Property Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.PropertyOwnerImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getPropertyOwner()
	 * @generated
	 */
	int PROPERTY_OWNER = 28;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OWNER__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Property Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ParameterImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLASS = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEPENDS_ON = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LABEL = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__USAGE = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONSTRAINTS = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Guideline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GUIDELINE = PROPERTY_OWNER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = PROPERTY_OWNER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SELECT = PROPERTY_OWNER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ControlDefinitionImpl <em>Control Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ControlDefinitionImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getControlDefinition()
	 * @generated
	 */
	int CONTROL_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION__PARAMETERS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION__NAME = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION__ID = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION__TITLE = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION__PARTS = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Controls Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION__CONTROLS_DEFINITION = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Control Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Control Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_DEFINITION_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.AddressImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Addr Line</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADDR_LINE = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = 2;

	/**
	 * The feature id for the '<em><b>Posta Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTA_CODE = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.RoleImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TITLE = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SHORT_NAME = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__REMARK = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.RemarkImpl <em>Remark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.RemarkImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRemark()
	 * @generated
	 */
	int REMARK = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Remark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Remark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMARK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ParameterOwnerImpl <em>Parameter Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ParameterOwnerImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getParameterOwner()
	 * @generated
	 */
	int PARAMETER_OWNER = 29;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OWNER__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parameter Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.CatalogImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__PARAMETERS = PARAMETER_OWNER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__UUID = PARAMETER_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__METADATA = PARAMETER_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__GROUPS = PARAMETER_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Backmatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__BACKMATTER = PARAMETER_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Controls Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONTROLS_DEFINITION = PARAMETER_OWNER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = PARAMETER_OWNER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = PARAMETER_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.BackMatterImpl <em>Back Matter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.BackMatterImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getBackMatter()
	 * @generated
	 */
	int BACK_MATTER = 7;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>Back Matter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Back Matter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_MATTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.RevisionImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__TITLE = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PUBLISHED = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LAST_MODIFIED = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__VERSION = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__OSCAL_VERSION = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REMARK = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.GroupImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARAMETERS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARTITIONS = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPS = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Controls Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTROLS_DEFINITION = PROPERTY_OWNER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.LocationImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TITLE = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ADDRESS = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Email Addresses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__EMAIL_ADDRESSES = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__UUID = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Telephone Numbers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TELEPHONE_NUMBERS = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__URL = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REMARK = PROPERTY_OWNER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.AnnotationImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__UUID = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NS = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__REMARK = 4;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.DocumentIdImpl <em>Document Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.DocumentIdImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getDocumentId()
	 * @generated
	 */
	int DOCUMENT_ID = 12;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID__SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Document Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.PropertyImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UUID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NS = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.AnnotationOwnerImpl <em>Annotation Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.AnnotationOwnerImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAnnotationOwner()
	 * @generated
	 */
	int ANNOTATION_OWNER = 30;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OWNER__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotation Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotation Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.MetadataImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ANNOTATIONS = ANNOTATION_OWNER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LINKS = ANNOTATION_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PROPERTIES = ANNOTATION_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PUBLISHED = ANNOTATION_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LAST_MODIFIED = ANNOTATION_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VERSION = ANNOTATION_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Oscal Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__OSCAL_VERSION = ANNOTATION_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Document Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__DOCUMENT_ID = ANNOTATION_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ROLES = ANNOTATION_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__REVISION = ANNOTATION_OWNER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LOCATIONS = ANNOTATION_OWNER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__PARTIES = ANNOTATION_OWNER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Responsible Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__RESPONSIBLE_PARTIES = ANNOTATION_OWNER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__REMARK = ANNOTATION_OWNER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__TITLE = ANNOTATION_OWNER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = ANNOTATION_OWNER_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = ANNOTATION_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.RevisionsImpl <em>Revisions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.RevisionsImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRevisions()
	 * @generated
	 */
	int REVISIONS = 15;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONS__REVISIONS = 0;

	/**
	 * The number of structural features of the '<em>Revisions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Revisions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.TelephoneNumberImpl <em>Telephone Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.TelephoneNumberImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getTelephoneNumber()
	 * @generated
	 */
	int TELEPHONE_NUMBER = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Telephone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_NUMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.PartyImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__NAME = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__UUID = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__NEW_ATTRIBUTE = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__SHORT_NAME = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>External Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__EXTERNAL_IDS = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Email Addresses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__EMAIL_ADDRESSES = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Telephone Numbers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__TELEPHONE_NUMBERS = PROPERTY_OWNER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__ADDRESSES = PROPERTY_OWNER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Location Uuids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LOCATION_UUIDS = PROPERTY_OWNER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Member Of Organizations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__MEMBER_OF_ORGANIZATIONS = PROPERTY_OWNER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ExternalIdImpl <em>External Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ExternalIdImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getExternalId()
	 * @generated
	 */
	int EXTERNAL_ID = 18;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID__SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID__TEXT = 1;

	/**
	 * The number of structural features of the '<em>External Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ResponsiblePartyImpl <em>Responsible Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ResponsiblePartyImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getResponsibleParty()
	 * @generated
	 */
	int RESPONSIBLE_PARTY = 19;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__ROLE_ID = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Uuid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__PARTY_UUID = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__REMARK = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Responsible Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Responsible Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ConstraintImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TESTS = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.TestImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 21;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__REMARK = 1;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.PartitionImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 22;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NAME = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ID = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NS = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CLASS = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__TITLE = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.SelectImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 23;

	/**
	 * The feature id for the '<em><b>How Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__HOW_MANY = 0;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CHOICE = 1;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ResourceImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 24;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__UUID = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TITLE = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOCUMENT_IDS = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CITATION = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__REMARKS = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Base64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__BASE64 = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>RLinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RLINKS = PROPERTY_OWNER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.CitationImpl <em>Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.CitationImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCitation()
	 * @generated
	 */
	int CITATION = 25;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__TEXT = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Biblio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__BIBLIO = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.RlinkImpl <em>Rlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.RlinkImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRlink()
	 * @generated
	 */
	int RLINK = 26;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK__HREF = 0;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK__MEDIA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Hashes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK__HASHES = 2;

	/**
	 * The number of structural features of the '<em>Rlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RLINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.HashImpl <em>Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.HashImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getHash()
	 * @generated
	 */
	int HASH = 27;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.LinkOwnerImpl <em>Link Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.LinkOwnerImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getLinkOwner()
	 * @generated
	 */
	int LINK_OWNER = 31;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OWNER__LINKS = 0;

	/**
	 * The number of structural features of the '<em>Link Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.Base64Impl <em>Base64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.Base64Impl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getBase64()
	 * @generated
	 */
	int BASE64 = 32;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64__MEDIA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64__CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Base64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ProfileImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 33;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MERGE = 2;

	/**
	 * The feature id for the '<em><b>Modify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MODIFY = 3;

	/**
	 * The feature id for the '<em><b>Backmatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__BACKMATTER = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__UUID = 5;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ImportImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 34;

	/**
	 * The feature id for the '<em><b>Herf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__HERF = 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__INCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__EXCLUDE = 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.MergeImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 35;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__COMBINE = 0;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ModifyImpl <em>Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ModifyImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getModify()
	 * @generated
	 */
	int MODIFY = 36;

	/**
	 * The feature id for the '<em><b>Setparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__SETPARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Alters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY__ALTERS = 1;

	/**
	 * The number of structural features of the '<em>Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.IncludeImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 37;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__ALL = 0;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__CALLS = 1;

	/**
	 * The feature id for the '<em><b>Matchs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__MATCHS = 2;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.ExcludeImpl <em>Exclude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.ExcludeImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getExclude()
	 * @generated
	 */
	int EXCLUDE = 38;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE__CALLS = 0;

	/**
	 * The feature id for the '<em><b>Matchs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE__MATCHS = 1;

	/**
	 * The number of structural features of the '<em>Exclude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exclude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.AllImpl <em>All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.AllImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAll()
	 * @generated
	 */
	int ALL = 39;

	/**
	 * The number of structural features of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.CallImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 40;

	/**
	 * The feature id for the '<em><b>Contro Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__CONTRO_ID = 0;

	/**
	 * The feature id for the '<em><b>With Child Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__WITH_CHILD_CONTROLS = 1;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.MatchImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 41;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ORDER = 1;

	/**
	 * The feature id for the '<em><b>With Child Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__WITH_CHILD_CONTROLS = 2;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.CombineImpl <em>Combine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.CombineImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCombine()
	 * @generated
	 */
	int COMBINE = 42;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__METHOD = 0;

	/**
	 * The feature id for the '<em><b>As Is</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__AS_IS = 1;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE__CUSTOM = 2;

	/**
	 * The number of structural features of the '<em>Combine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Combine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.CustomImpl <em>Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.CustomImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCustom()
	 * @generated
	 */
	int CUSTOM = 43;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__CALLS = 1;

	/**
	 * The feature id for the '<em><b>Matchs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__MATCHS = 2;

	/**
	 * The number of structural features of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.SetParameterImpl <em>Set Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.SetParameterImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getSetParameter()
	 * @generated
	 */
	int SET_PARAMETER = 44;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__PROPERTIES = PROPERTY_OWNER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__ANNOTATIONS = PROPERTY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__LINKS = PROPERTY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__PARAM_ID = PROPERTY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__CLASS = PROPERTY_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__DEPENDS_ON = PROPERTY_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__LABEL = PROPERTY_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__USAGE = PROPERTY_OWNER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__CONSTRAINTS = PROPERTY_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Guideline</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__GUIDELINE = PROPERTY_OWNER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__VALUE = PROPERTY_OWNER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER__SELECT = PROPERTY_OWNER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Set Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER_FEATURE_COUNT = PROPERTY_OWNER_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Set Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PARAMETER_OPERATION_COUNT = PROPERTY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.OSCALConstraintImpl <em>OSCAL Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.OSCALConstraintImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getOSCALConstraint()
	 * @generated
	 */
	int OSCAL_CONSTRAINT = 45;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAL_CONSTRAINT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAL_CONSTRAINT__TESTS = 1;

	/**
	 * The number of structural features of the '<em>OSCAL Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAL_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OSCAL Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCAL_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.AlterImpl <em>Alter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.AlterImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAlter()
	 * @generated
	 */
	int ALTER = 46;

	/**
	 * The feature id for the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER__CONTROL_ID = 0;

	/**
	 * The feature id for the '<em><b>Removes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER__REMOVES = 1;

	/**
	 * The feature id for the '<em><b>Adds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER__ADDS = 2;

	/**
	 * The number of structural features of the '<em>Alter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Alter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.RemoveImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 47;

	/**
	 * The feature id for the '<em><b>Name Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__NAME_REF = 0;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__CLASS_REF = 1;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__ID_REF = 2;

	/**
	 * The feature id for the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__ITEM_NAME = 3;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.AdditionImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 48;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__PARAMETERS = PARAMETER_OWNER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__PROPERTIES = PARAMETER_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__ANNOTATIONS = PARAMETER_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LINKS = PARAMETER_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__POSITION = PARAMETER_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__ID_REF = PARAMETER_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__TITLE = PARAMETER_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__PARTITIONS = PARAMETER_OWNER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = PARAMETER_OWNER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = PARAMETER_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.oscal.model.Oscal.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.NamedElementImpl
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Markup Line</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMarkupLine()
	 * @generated
	 */
	int MARKUP_LINE = 50;

	/**
	 * The meta object id for the '<em>Markup Multiline</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMarkupMultiline()
	 * @generated
	 */
	int MARKUP_MULTILINE = 51;

	/**
	 * The meta object id for the '<em>Base64 Binary</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getBase64Binary()
	 * @generated
	 */
	int BASE64_BINARY = 52;

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see dsm.oscal.model.Oscal.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see dsm.oscal.model.Oscal.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see dsm.oscal.model.Oscal.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Link#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see dsm.oscal.model.Oscal.Link#getMediaType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Link#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dsm.oscal.model.Oscal.Link#getText()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Text();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Parameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter#getId()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Parameter#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter#getClass_()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Class();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Parameter#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends On</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter#getDependsOn()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DependsOn();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Parameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter#getLabel()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Label();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Parameter#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter#getUsage()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Usage();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Parameter#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter#getConstraints()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Constraints();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.Parameter#getGuideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Guideline</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter#getGuideline()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Guideline();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Parameter#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see dsm.oscal.model.Oscal.Parameter#getSelect()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Select();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.ControlDefinition <em>Control Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Definition</em>'.
	 * @see dsm.oscal.model.Oscal.ControlDefinition
	 * @generated
	 */
	EClass getControlDefinition();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.ControlDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.oscal.model.Oscal.ControlDefinition#getId()
	 * @see #getControlDefinition()
	 * @generated
	 */
	EAttribute getControlDefinition_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.ControlDefinition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.Oscal.ControlDefinition#getTitle()
	 * @see #getControlDefinition()
	 * @generated
	 */
	EAttribute getControlDefinition_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.ControlDefinition#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see dsm.oscal.model.Oscal.ControlDefinition#getParts()
	 * @see #getControlDefinition()
	 * @generated
	 */
	EReference getControlDefinition_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.ControlDefinition#getControlsDefinition <em>Controls Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls Definition</em>'.
	 * @see dsm.oscal.model.Oscal.ControlDefinition#getControlsDefinition()
	 * @see #getControlDefinition()
	 * @generated
	 */
	EReference getControlDefinition_ControlsDefinition();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see dsm.oscal.model.Oscal.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.Address#getAddrLine <em>Addr Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Addr Line</em>'.
	 * @see dsm.oscal.model.Oscal.Address#getAddrLine()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_AddrLine();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see dsm.oscal.model.Oscal.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see dsm.oscal.model.Oscal.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Address#getPostaCode <em>Posta Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posta Code</em>'.
	 * @see dsm.oscal.model.Oscal.Address#getPostaCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_PostaCode();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see dsm.oscal.model.Oscal.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Address#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsm.oscal.model.Oscal.Address#getType()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Type();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see dsm.oscal.model.Oscal.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Role#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.Oscal.Role#getTitle()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Title();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Role#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see dsm.oscal.model.Oscal.Role#getShortName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.oscal.model.Oscal.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Description();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Role#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see dsm.oscal.model.Oscal.Role#getRemark()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Remark();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Role#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.oscal.model.Oscal.Role#getId()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Id();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Remark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remark</em>'.
	 * @see dsm.oscal.model.Oscal.Remark
	 * @generated
	 */
	EClass getRemark();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Remark#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.oscal.model.Oscal.Remark#getDescription()
	 * @see #getRemark()
	 * @generated
	 */
	EAttribute getRemark_Description();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see dsm.oscal.model.Oscal.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Catalog#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see dsm.oscal.model.Oscal.Catalog#getUuid()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_Uuid();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Catalog#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see dsm.oscal.model.Oscal.Catalog#getMetadata()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Catalog#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see dsm.oscal.model.Oscal.Catalog#getGroups()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Groups();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Catalog#getBackmatter <em>Backmatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Backmatter</em>'.
	 * @see dsm.oscal.model.Oscal.Catalog#getBackmatter()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Backmatter();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Catalog#getControlsDefinition <em>Controls Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls Definition</em>'.
	 * @see dsm.oscal.model.Oscal.Catalog#getControlsDefinition()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_ControlsDefinition();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.BackMatter <em>Back Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back Matter</em>'.
	 * @see dsm.oscal.model.Oscal.BackMatter
	 * @generated
	 */
	EClass getBackMatter();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.BackMatter#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see dsm.oscal.model.Oscal.BackMatter#getResources()
	 * @see #getBackMatter()
	 * @generated
	 */
	EReference getBackMatter_Resources();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see dsm.oscal.model.Oscal.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Revision#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.Oscal.Revision#getTitle()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Title();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Revision#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see dsm.oscal.model.Oscal.Revision#getPublished()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Published();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Revision#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see dsm.oscal.model.Oscal.Revision#getLastModified()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Revision#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dsm.oscal.model.Oscal.Revision#getVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Version();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Revision#getOscalVersion <em>Oscal Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscal Version</em>'.
	 * @see dsm.oscal.model.Oscal.Revision#getOscalVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_OscalVersion();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Revision#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see dsm.oscal.model.Oscal.Revision#getRemark()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Remark();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see dsm.oscal.model.Oscal.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Group#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.oscal.model.Oscal.Group#getId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Group#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.Oscal.Group#getTitle()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Group#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partitions</em>'.
	 * @see dsm.oscal.model.Oscal.Group#getPartitions()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Partitions();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Group#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see dsm.oscal.model.Oscal.Group#getGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Group#getControlsDefinition <em>Controls Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls Definition</em>'.
	 * @see dsm.oscal.model.Oscal.Group#getControlsDefinition()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_ControlsDefinition();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see dsm.oscal.model.Oscal.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Location#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.Oscal.Location#getTitle()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Title();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Location#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see dsm.oscal.model.Oscal.Location#getAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Address();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.Location#getEmailAddresses <em>Email Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email Addresses</em>'.
	 * @see dsm.oscal.model.Oscal.Location#getEmailAddresses()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_EmailAddresses();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Location#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see dsm.oscal.model.Oscal.Location#getUuid()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Uuid();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Location#getTelephoneNumbers <em>Telephone Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Numbers</em>'.
	 * @see dsm.oscal.model.Oscal.Location#getTelephoneNumbers()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_TelephoneNumbers();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.Location#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Url</em>'.
	 * @see dsm.oscal.model.Oscal.Location#getUrl()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Url();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Location#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see dsm.oscal.model.Oscal.Location#getRemark()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Remark();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see dsm.oscal.model.Oscal.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.oscal.model.Oscal.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Annotation#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see dsm.oscal.model.Oscal.Annotation#getUuid()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Annotation#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see dsm.oscal.model.Oscal.Annotation#getNs()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Ns();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dsm.oscal.model.Oscal.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Annotation#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see dsm.oscal.model.Oscal.Annotation#getRemark()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Remark();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.DocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Id</em>'.
	 * @see dsm.oscal.model.Oscal.DocumentId
	 * @generated
	 */
	EClass getDocumentId();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.DocumentId#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see dsm.oscal.model.Oscal.DocumentId#getScheme()
	 * @see #getDocumentId()
	 * @generated
	 */
	EAttribute getDocumentId_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.DocumentId#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dsm.oscal.model.Oscal.DocumentId#getText()
	 * @see #getDocumentId()
	 * @generated
	 */
	EAttribute getDocumentId_Text();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see dsm.oscal.model.Oscal.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Property#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see dsm.oscal.model.Oscal.Property#getUuid()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.oscal.model.Oscal.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Property#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see dsm.oscal.model.Oscal.Property#getNs()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Ns();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Property#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see dsm.oscal.model.Oscal.Property#getClass_()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Class();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.oscal.model.Oscal.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Metadata#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getPublished()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Published();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Metadata#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getLastModified()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Metadata#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getVersion()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Version();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Metadata#getOscalVersion <em>Oscal Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscal Version</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getOscalVersion()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_OscalVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Metadata#getDocumentId <em>Document Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Id</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getDocumentId()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_DocumentId();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Metadata#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getRoles()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Roles();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Metadata#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revision</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getRevision()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Revision();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Metadata#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getLocations()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Metadata#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parties</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getParties()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Parties();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Metadata#getResponsibleParties <em>Responsible Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Parties</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getResponsibleParties()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_ResponsibleParties();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Metadata#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getRemark()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Remark();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Metadata#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.Oscal.Metadata#getTitle()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Title();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Revisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revisions</em>'.
	 * @see dsm.oscal.model.Oscal.Revisions
	 * @generated
	 */
	EClass getRevisions();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Revisions#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see dsm.oscal.model.Oscal.Revisions#getRevisions()
	 * @see #getRevisions()
	 * @generated
	 */
	EReference getRevisions_Revisions();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.TelephoneNumber <em>Telephone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone Number</em>'.
	 * @see dsm.oscal.model.Oscal.TelephoneNumber
	 * @generated
	 */
	EClass getTelephoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.TelephoneNumber#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsm.oscal.model.Oscal.TelephoneNumber#getType()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_Type();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.TelephoneNumber#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see dsm.oscal.model.Oscal.TelephoneNumber#getNumber()
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	EAttribute getTelephoneNumber_Number();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see dsm.oscal.model.Oscal.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Party#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see dsm.oscal.model.Oscal.Party#getUuid()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Party#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute</em>'.
	 * @see dsm.oscal.model.Oscal.Party#getNewAttribute()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_NewAttribute();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Party#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see dsm.oscal.model.Oscal.Party#getShortName()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Party#getExternalIds <em>External Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Ids</em>'.
	 * @see dsm.oscal.model.Oscal.Party#getExternalIds()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_ExternalIds();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.Party#getEmailAddresses <em>Email Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email Addresses</em>'.
	 * @see dsm.oscal.model.Oscal.Party#getEmailAddresses()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_EmailAddresses();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Party#getTelephoneNumbers <em>Telephone Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone Numbers</em>'.
	 * @see dsm.oscal.model.Oscal.Party#getTelephoneNumbers()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_TelephoneNumbers();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Party#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see dsm.oscal.model.Oscal.Party#getAddresses()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Addresses();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.Party#getLocationUuids <em>Location Uuids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location Uuids</em>'.
	 * @see dsm.oscal.model.Oscal.Party#getLocationUuids()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_LocationUuids();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.Party#getMemberOfOrganizations <em>Member Of Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Member Of Organizations</em>'.
	 * @see dsm.oscal.model.Oscal.Party#getMemberOfOrganizations()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_MemberOfOrganizations();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.ExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Id</em>'.
	 * @see dsm.oscal.model.Oscal.ExternalId
	 * @generated
	 */
	EClass getExternalId();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.ExternalId#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see dsm.oscal.model.Oscal.ExternalId#getScheme()
	 * @see #getExternalId()
	 * @generated
	 */
	EAttribute getExternalId_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.ExternalId#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dsm.oscal.model.Oscal.ExternalId#getText()
	 * @see #getExternalId()
	 * @generated
	 */
	EAttribute getExternalId_Text();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Party</em>'.
	 * @see dsm.oscal.model.Oscal.ResponsibleParty
	 * @generated
	 */
	EClass getResponsibleParty();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.ResponsibleParty#getRoleId <em>Role Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Id</em>'.
	 * @see dsm.oscal.model.Oscal.ResponsibleParty#getRoleId()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EAttribute getResponsibleParty_RoleId();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.ResponsibleParty#getPartyUuid <em>Party Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Uuid</em>'.
	 * @see dsm.oscal.model.Oscal.ResponsibleParty#getPartyUuid()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EAttribute getResponsibleParty_PartyUuid();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.ResponsibleParty#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remark</em>'.
	 * @see dsm.oscal.model.Oscal.ResponsibleParty#getRemark()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_Remark();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see dsm.oscal.model.Oscal.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Constraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.oscal.model.Oscal.Constraint#getDescription()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Constraint#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see dsm.oscal.model.Oscal.Constraint#getTests()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Tests();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see dsm.oscal.model.Oscal.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Test#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see dsm.oscal.model.Oscal.Test#getExpression()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Expression();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Test#getRemark <em>Remark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remark</em>'.
	 * @see dsm.oscal.model.Oscal.Test#getRemark()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Remark();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see dsm.oscal.model.Oscal.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Partition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.oscal.model.Oscal.Partition#getName()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Partition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsm.oscal.model.Oscal.Partition#getId()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Partition#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns</em>'.
	 * @see dsm.oscal.model.Oscal.Partition#getNs()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Ns();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Partition#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see dsm.oscal.model.Oscal.Partition#getClass_()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Class();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Partition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.Oscal.Partition#getTitle()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Title();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see dsm.oscal.model.Oscal.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Select#getHowMany <em>How Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>How Many</em>'.
	 * @see dsm.oscal.model.Oscal.Select#getHowMany()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_HowMany();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.Select#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Choice</em>'.
	 * @see dsm.oscal.model.Oscal.Select#getChoice()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Choice();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see dsm.oscal.model.Oscal.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Resource#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see dsm.oscal.model.Oscal.Resource#getUuid()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Resource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.Oscal.Resource#getTitle()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Title();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Resource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.oscal.model.Oscal.Resource#getDescription()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Resource#getDocumentIds <em>Document Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Ids</em>'.
	 * @see dsm.oscal.model.Oscal.Resource#getDocumentIds()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_DocumentIds();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Resource#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation</em>'.
	 * @see dsm.oscal.model.Oscal.Resource#getCitation()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Citation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Resource#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see dsm.oscal.model.Oscal.Resource#getRemarks()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Remarks();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Resource#getBase64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base64</em>'.
	 * @see dsm.oscal.model.Oscal.Resource#getBase64()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Base64();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Resource#getRLinks <em>RLinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RLinks</em>'.
	 * @see dsm.oscal.model.Oscal.Resource#getRLinks()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_RLinks();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation</em>'.
	 * @see dsm.oscal.model.Oscal.Citation
	 * @generated
	 */
	EClass getCitation();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Citation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dsm.oscal.model.Oscal.Citation#getText()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Text();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Citation#getBiblio <em>Biblio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biblio</em>'.
	 * @see dsm.oscal.model.Oscal.Citation#getBiblio()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Biblio();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Rlink <em>Rlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rlink</em>'.
	 * @see dsm.oscal.model.Oscal.Rlink
	 * @generated
	 */
	EClass getRlink();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Rlink#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see dsm.oscal.model.Oscal.Rlink#getHref()
	 * @see #getRlink()
	 * @generated
	 */
	EAttribute getRlink_Href();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Rlink#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see dsm.oscal.model.Oscal.Rlink#getMediaType()
	 * @see #getRlink()
	 * @generated
	 */
	EAttribute getRlink_MediaType();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Rlink#getHashes <em>Hashes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hashes</em>'.
	 * @see dsm.oscal.model.Oscal.Rlink#getHashes()
	 * @see #getRlink()
	 * @generated
	 */
	EReference getRlink_Hashes();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash</em>'.
	 * @see dsm.oscal.model.Oscal.Hash
	 * @generated
	 */
	EClass getHash();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Hash#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see dsm.oscal.model.Oscal.Hash#getAlgorithm()
	 * @see #getHash()
	 * @generated
	 */
	EAttribute getHash_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Hash#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see dsm.oscal.model.Oscal.Hash#getContent()
	 * @see #getHash()
	 * @generated
	 */
	EAttribute getHash_Content();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.PropertyOwner <em>Property Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Owner</em>'.
	 * @see dsm.oscal.model.Oscal.PropertyOwner
	 * @generated
	 */
	EClass getPropertyOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.PropertyOwner#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see dsm.oscal.model.Oscal.PropertyOwner#getProperties()
	 * @see #getPropertyOwner()
	 * @generated
	 */
	EReference getPropertyOwner_Properties();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.ParameterOwner <em>Parameter Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Owner</em>'.
	 * @see dsm.oscal.model.Oscal.ParameterOwner
	 * @generated
	 */
	EClass getParameterOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.ParameterOwner#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see dsm.oscal.model.Oscal.ParameterOwner#getParameters()
	 * @see #getParameterOwner()
	 * @generated
	 */
	EReference getParameterOwner_Parameters();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.AnnotationOwner <em>Annotation Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Owner</em>'.
	 * @see dsm.oscal.model.Oscal.AnnotationOwner
	 * @generated
	 */
	EClass getAnnotationOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.AnnotationOwner#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see dsm.oscal.model.Oscal.AnnotationOwner#getAnnotations()
	 * @see #getAnnotationOwner()
	 * @generated
	 */
	EReference getAnnotationOwner_Annotations();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.LinkOwner <em>Link Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Owner</em>'.
	 * @see dsm.oscal.model.Oscal.LinkOwner
	 * @generated
	 */
	EClass getLinkOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.LinkOwner#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see dsm.oscal.model.Oscal.LinkOwner#getLinks()
	 * @see #getLinkOwner()
	 * @generated
	 */
	EReference getLinkOwner_Links();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Base64 <em>Base64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64</em>'.
	 * @see dsm.oscal.model.Oscal.Base64
	 * @generated
	 */
	EClass getBase64();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Base64#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see dsm.oscal.model.Oscal.Base64#getFileName()
	 * @see #getBase64()
	 * @generated
	 */
	EAttribute getBase64_FileName();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Base64#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media Type</em>'.
	 * @see dsm.oscal.model.Oscal.Base64#getMediaType()
	 * @see #getBase64()
	 * @generated
	 */
	EAttribute getBase64_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Base64#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see dsm.oscal.model.Oscal.Base64#getContent()
	 * @see #getBase64()
	 * @generated
	 */
	EAttribute getBase64_Content();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see dsm.oscal.model.Oscal.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Profile#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see dsm.oscal.model.Oscal.Profile#getMetadata()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Profile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see dsm.oscal.model.Oscal.Profile#getImports()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Profile#getMerge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Merge</em>'.
	 * @see dsm.oscal.model.Oscal.Profile#getMerge()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Merge();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Profile#getModify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modify</em>'.
	 * @see dsm.oscal.model.Oscal.Profile#getModify()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Modify();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Profile#getBackmatter <em>Backmatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Backmatter</em>'.
	 * @see dsm.oscal.model.Oscal.Profile#getBackmatter()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Backmatter();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Profile#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see dsm.oscal.model.Oscal.Profile#getUuid()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Uuid();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see dsm.oscal.model.Oscal.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Import#getHerf <em>Herf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Herf</em>'.
	 * @see dsm.oscal.model.Oscal.Import#getHerf()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Herf();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Import#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include</em>'.
	 * @see dsm.oscal.model.Oscal.Import#getInclude()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Include();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Import#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude</em>'.
	 * @see dsm.oscal.model.Oscal.Import#getExclude()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Exclude();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see dsm.oscal.model.Oscal.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Merge#getCombine <em>Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combine</em>'.
	 * @see dsm.oscal.model.Oscal.Merge#getCombine()
	 * @see #getMerge()
	 * @generated
	 */
	EReference getMerge_Combine();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Modify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modify</em>'.
	 * @see dsm.oscal.model.Oscal.Modify
	 * @generated
	 */
	EClass getModify();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Modify#getSetparameters <em>Setparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setparameters</em>'.
	 * @see dsm.oscal.model.Oscal.Modify#getSetparameters()
	 * @see #getModify()
	 * @generated
	 */
	EReference getModify_Setparameters();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Modify#getAlters <em>Alters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alters</em>'.
	 * @see dsm.oscal.model.Oscal.Modify#getAlters()
	 * @see #getModify()
	 * @generated
	 */
	EReference getModify_Alters();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see dsm.oscal.model.Oscal.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Include#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see dsm.oscal.model.Oscal.Include#getAll()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_All();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Include#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see dsm.oscal.model.Oscal.Include#getCalls()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_Calls();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Include#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchs</em>'.
	 * @see dsm.oscal.model.Oscal.Include#getMatchs()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_Matchs();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Exclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude</em>'.
	 * @see dsm.oscal.model.Oscal.Exclude
	 * @generated
	 */
	EClass getExclude();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Exclude#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see dsm.oscal.model.Oscal.Exclude#getCalls()
	 * @see #getExclude()
	 * @generated
	 */
	EReference getExclude_Calls();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Exclude#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchs</em>'.
	 * @see dsm.oscal.model.Oscal.Exclude#getMatchs()
	 * @see #getExclude()
	 * @generated
	 */
	EReference getExclude_Matchs();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All</em>'.
	 * @see dsm.oscal.model.Oscal.All
	 * @generated
	 */
	EClass getAll();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see dsm.oscal.model.Oscal.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Call#getControId <em>Contro Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contro Id</em>'.
	 * @see dsm.oscal.model.Oscal.Call#getControId()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_ControId();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Call#getWithChildControls <em>With Child Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Child Controls</em>'.
	 * @see dsm.oscal.model.Oscal.Call#getWithChildControls()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_WithChildControls();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see dsm.oscal.model.Oscal.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Match#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see dsm.oscal.model.Oscal.Match#getPattern()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Match#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see dsm.oscal.model.Oscal.Match#getOrder()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Order();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Match#getWithChildControls <em>With Child Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Child Controls</em>'.
	 * @see dsm.oscal.model.Oscal.Match#getWithChildControls()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_WithChildControls();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Combine <em>Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combine</em>'.
	 * @see dsm.oscal.model.Oscal.Combine
	 * @generated
	 */
	EClass getCombine();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Combine#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see dsm.oscal.model.Oscal.Combine#getMethod()
	 * @see #getCombine()
	 * @generated
	 */
	EAttribute getCombine_Method();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Combine#isAsIs <em>As Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Is</em>'.
	 * @see dsm.oscal.model.Oscal.Combine#isAsIs()
	 * @see #getCombine()
	 * @generated
	 */
	EAttribute getCombine_AsIs();

	/**
	 * Returns the meta object for the containment reference '{@link dsm.oscal.model.Oscal.Combine#getCustom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom</em>'.
	 * @see dsm.oscal.model.Oscal.Combine#getCustom()
	 * @see #getCombine()
	 * @generated
	 */
	EReference getCombine_Custom();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom</em>'.
	 * @see dsm.oscal.model.Oscal.Custom
	 * @generated
	 */
	EClass getCustom();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Custom#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see dsm.oscal.model.Oscal.Custom#getGroups()
	 * @see #getCustom()
	 * @generated
	 */
	EReference getCustom_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Custom#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see dsm.oscal.model.Oscal.Custom#getCalls()
	 * @see #getCustom()
	 * @generated
	 */
	EReference getCustom_Calls();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Custom#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchs</em>'.
	 * @see dsm.oscal.model.Oscal.Custom#getMatchs()
	 * @see #getCustom()
	 * @generated
	 */
	EReference getCustom_Matchs();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.SetParameter <em>Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Parameter</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter
	 * @generated
	 */
	EClass getSetParameter();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.SetParameter#getParamId <em>Param Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Id</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter#getParamId()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_ParamId();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.SetParameter#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter#getClass_()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_Class();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.SetParameter#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends On</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter#getDependsOn()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_DependsOn();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.SetParameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter#getLabel()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_Label();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.SetParameter#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter#getUsage()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_Usage();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.SetParameter#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter#getConstraints()
	 * @see #getSetParameter()
	 * @generated
	 */
	EReference getSetParameter_Constraints();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.SetParameter#getGuideline <em>Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Guideline</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter#getGuideline()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_Guideline();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.oscal.model.Oscal.SetParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter#getValue()
	 * @see #getSetParameter()
	 * @generated
	 */
	EAttribute getSetParameter_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.SetParameter#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select</em>'.
	 * @see dsm.oscal.model.Oscal.SetParameter#getSelect()
	 * @see #getSetParameter()
	 * @generated
	 */
	EReference getSetParameter_Select();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.OSCALConstraint <em>OSCAL Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSCAL Constraint</em>'.
	 * @see dsm.oscal.model.Oscal.OSCALConstraint
	 * @generated
	 */
	EClass getOSCALConstraint();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.OSCALConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dsm.oscal.model.Oscal.OSCALConstraint#getDescription()
	 * @see #getOSCALConstraint()
	 * @generated
	 */
	EAttribute getOSCALConstraint_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.OSCALConstraint#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see dsm.oscal.model.Oscal.OSCALConstraint#getTests()
	 * @see #getOSCALConstraint()
	 * @generated
	 */
	EReference getOSCALConstraint_Tests();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Alter <em>Alter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alter</em>'.
	 * @see dsm.oscal.model.Oscal.Alter
	 * @generated
	 */
	EClass getAlter();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Alter#getControlId <em>Control Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Id</em>'.
	 * @see dsm.oscal.model.Oscal.Alter#getControlId()
	 * @see #getAlter()
	 * @generated
	 */
	EAttribute getAlter_ControlId();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Alter#getRemoves <em>Removes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Removes</em>'.
	 * @see dsm.oscal.model.Oscal.Alter#getRemoves()
	 * @see #getAlter()
	 * @generated
	 */
	EReference getAlter_Removes();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Alter#getAdds <em>Adds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adds</em>'.
	 * @see dsm.oscal.model.Oscal.Alter#getAdds()
	 * @see #getAlter()
	 * @generated
	 */
	EReference getAlter_Adds();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see dsm.oscal.model.Oscal.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Remove#getNameRef <em>Name Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Ref</em>'.
	 * @see dsm.oscal.model.Oscal.Remove#getNameRef()
	 * @see #getRemove()
	 * @generated
	 */
	EAttribute getRemove_NameRef();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Remove#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see dsm.oscal.model.Oscal.Remove#getClassRef()
	 * @see #getRemove()
	 * @generated
	 */
	EAttribute getRemove_ClassRef();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Remove#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see dsm.oscal.model.Oscal.Remove#getIdRef()
	 * @see #getRemove()
	 * @generated
	 */
	EAttribute getRemove_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Remove#getItemName <em>Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Name</em>'.
	 * @see dsm.oscal.model.Oscal.Remove#getItemName()
	 * @see #getRemove()
	 * @generated
	 */
	EAttribute getRemove_ItemName();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see dsm.oscal.model.Oscal.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Addition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see dsm.oscal.model.Oscal.Addition#getPosition()
	 * @see #getAddition()
	 * @generated
	 */
	EAttribute getAddition_Position();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Addition#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see dsm.oscal.model.Oscal.Addition#getIdRef()
	 * @see #getAddition()
	 * @generated
	 */
	EAttribute getAddition_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.Addition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see dsm.oscal.model.Oscal.Addition#getTitle()
	 * @see #getAddition()
	 * @generated
	 */
	EAttribute getAddition_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.oscal.model.Oscal.Addition#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partitions</em>'.
	 * @see dsm.oscal.model.Oscal.Addition#getPartitions()
	 * @see #getAddition()
	 * @generated
	 */
	EReference getAddition_Partitions();

	/**
	 * Returns the meta object for class '{@link dsm.oscal.model.Oscal.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see dsm.oscal.model.Oscal.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link dsm.oscal.model.Oscal.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.oscal.model.Oscal.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Markup Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Markup Line</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getMarkupLine();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Markup Multiline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Markup Multiline</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getMarkupMultiline();

	/**
	 * Returns the meta object for data type '<em>Base64 Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base64 Binary</em>'.
	 * @model instanceClass="byte[]"
	 * @generated
	 */
	EDataType getBase64Binary();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OscalFactory getOscalFactory();

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
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.LinkImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__MEDIA_TYPE = eINSTANCE.getLink_MediaType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TEXT = eINSTANCE.getLink_Text();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ParameterImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ID = eINSTANCE.getParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CLASS = eINSTANCE.getParameter_Class();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEPENDS_ON = eINSTANCE.getParameter_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LABEL = eINSTANCE.getParameter_Label();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__USAGE = eINSTANCE.getParameter_Usage();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__CONSTRAINTS = eINSTANCE.getParameter_Constraints();

		/**
		 * The meta object literal for the '<em><b>Guideline</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__GUIDELINE = eINSTANCE.getParameter_Guideline();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__SELECT = eINSTANCE.getParameter_Select();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ControlDefinitionImpl <em>Control Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ControlDefinitionImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getControlDefinition()
		 * @generated
		 */
		EClass CONTROL_DEFINITION = eINSTANCE.getControlDefinition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_DEFINITION__ID = eINSTANCE.getControlDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_DEFINITION__TITLE = eINSTANCE.getControlDefinition_Title();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_DEFINITION__PARTS = eINSTANCE.getControlDefinition_Parts();

		/**
		 * The meta object literal for the '<em><b>Controls Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_DEFINITION__CONTROLS_DEFINITION = eINSTANCE.getControlDefinition_ControlsDefinition();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.AddressImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Addr Line</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADDR_LINE = eINSTANCE.getAddress_AddrLine();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Posta Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__POSTA_CODE = eINSTANCE.getAddress_PostaCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__TYPE = eINSTANCE.getAddress_Type();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.RoleImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__TITLE = eINSTANCE.getRole_Title();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__SHORT_NAME = eINSTANCE.getRole_ShortName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__REMARK = eINSTANCE.getRole_Remark();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ID = eINSTANCE.getRole_Id();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.RemarkImpl <em>Remark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.RemarkImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRemark()
		 * @generated
		 */
		EClass REMARK = eINSTANCE.getRemark();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMARK__DESCRIPTION = eINSTANCE.getRemark_Description();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.CatalogImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__UUID = eINSTANCE.getCatalog_Uuid();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__METADATA = eINSTANCE.getCatalog_Metadata();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__GROUPS = eINSTANCE.getCatalog_Groups();

		/**
		 * The meta object literal for the '<em><b>Backmatter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__BACKMATTER = eINSTANCE.getCatalog_Backmatter();

		/**
		 * The meta object literal for the '<em><b>Controls Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__CONTROLS_DEFINITION = eINSTANCE.getCatalog_ControlsDefinition();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.BackMatterImpl <em>Back Matter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.BackMatterImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getBackMatter()
		 * @generated
		 */
		EClass BACK_MATTER = eINSTANCE.getBackMatter();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACK_MATTER__RESOURCES = eINSTANCE.getBackMatter_Resources();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.RevisionImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__TITLE = eINSTANCE.getRevision_Title();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__PUBLISHED = eINSTANCE.getRevision_Published();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__LAST_MODIFIED = eINSTANCE.getRevision_LastModified();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__VERSION = eINSTANCE.getRevision_Version();

		/**
		 * The meta object literal for the '<em><b>Oscal Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__OSCAL_VERSION = eINSTANCE.getRevision_OscalVersion();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__REMARK = eINSTANCE.getRevision_Remark();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.GroupImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ID = eINSTANCE.getGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TITLE = eINSTANCE.getGroup_Title();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__PARTITIONS = eINSTANCE.getGroup_Partitions();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUPS = eINSTANCE.getGroup_Groups();

		/**
		 * The meta object literal for the '<em><b>Controls Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CONTROLS_DEFINITION = eINSTANCE.getGroup_ControlsDefinition();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.LocationImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__TITLE = eINSTANCE.getLocation_Title();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__ADDRESS = eINSTANCE.getLocation_Address();

		/**
		 * The meta object literal for the '<em><b>Email Addresses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__EMAIL_ADDRESSES = eINSTANCE.getLocation_EmailAddresses();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__UUID = eINSTANCE.getLocation_Uuid();

		/**
		 * The meta object literal for the '<em><b>Telephone Numbers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__TELEPHONE_NUMBERS = eINSTANCE.getLocation_TelephoneNumbers();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__URL = eINSTANCE.getLocation_Url();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__REMARK = eINSTANCE.getLocation_Remark();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.AnnotationImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__UUID = eINSTANCE.getAnnotation_Uuid();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NS = eINSTANCE.getAnnotation_Ns();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__REMARK = eINSTANCE.getAnnotation_Remark();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.DocumentIdImpl <em>Document Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.DocumentIdImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getDocumentId()
		 * @generated
		 */
		EClass DOCUMENT_ID = eINSTANCE.getDocumentId();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ID__SCHEME = eINSTANCE.getDocumentId_Scheme();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ID__TEXT = eINSTANCE.getDocumentId_Text();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.PropertyImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UUID = eINSTANCE.getProperty_Uuid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NS = eINSTANCE.getProperty_Ns();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CLASS = eINSTANCE.getProperty_Class();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.MetadataImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__PUBLISHED = eINSTANCE.getMetadata_Published();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__LAST_MODIFIED = eINSTANCE.getMetadata_LastModified();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__VERSION = eINSTANCE.getMetadata_Version();

		/**
		 * The meta object literal for the '<em><b>Oscal Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__OSCAL_VERSION = eINSTANCE.getMetadata_OscalVersion();

		/**
		 * The meta object literal for the '<em><b>Document Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__DOCUMENT_ID = eINSTANCE.getMetadata_DocumentId();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__ROLES = eINSTANCE.getMetadata_Roles();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__REVISION = eINSTANCE.getMetadata_Revision();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__LOCATIONS = eINSTANCE.getMetadata_Locations();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__PARTIES = eINSTANCE.getMetadata_Parties();

		/**
		 * The meta object literal for the '<em><b>Responsible Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__RESPONSIBLE_PARTIES = eINSTANCE.getMetadata_ResponsibleParties();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__REMARK = eINSTANCE.getMetadata_Remark();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__TITLE = eINSTANCE.getMetadata_Title();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.RevisionsImpl <em>Revisions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.RevisionsImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRevisions()
		 * @generated
		 */
		EClass REVISIONS = eINSTANCE.getRevisions();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISIONS__REVISIONS = eINSTANCE.getRevisions_Revisions();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.TelephoneNumberImpl <em>Telephone Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.TelephoneNumberImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getTelephoneNumber()
		 * @generated
		 */
		EClass TELEPHONE_NUMBER = eINSTANCE.getTelephoneNumber();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__TYPE = eINSTANCE.getTelephoneNumber_Type();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE_NUMBER__NUMBER = eINSTANCE.getTelephoneNumber_Number();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.PartyImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__UUID = eINSTANCE.getParty_Uuid();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__NEW_ATTRIBUTE = eINSTANCE.getParty_NewAttribute();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__SHORT_NAME = eINSTANCE.getParty_ShortName();

		/**
		 * The meta object literal for the '<em><b>External Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__EXTERNAL_IDS = eINSTANCE.getParty_ExternalIds();

		/**
		 * The meta object literal for the '<em><b>Email Addresses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__EMAIL_ADDRESSES = eINSTANCE.getParty_EmailAddresses();

		/**
		 * The meta object literal for the '<em><b>Telephone Numbers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__TELEPHONE_NUMBERS = eINSTANCE.getParty_TelephoneNumbers();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__ADDRESSES = eINSTANCE.getParty_Addresses();

		/**
		 * The meta object literal for the '<em><b>Location Uuids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__LOCATION_UUIDS = eINSTANCE.getParty_LocationUuids();

		/**
		 * The meta object literal for the '<em><b>Member Of Organizations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__MEMBER_OF_ORGANIZATIONS = eINSTANCE.getParty_MemberOfOrganizations();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ExternalIdImpl <em>External Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ExternalIdImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getExternalId()
		 * @generated
		 */
		EClass EXTERNAL_ID = eINSTANCE.getExternalId();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ID__SCHEME = eINSTANCE.getExternalId_Scheme();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ID__TEXT = eINSTANCE.getExternalId_Text();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ResponsiblePartyImpl <em>Responsible Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ResponsiblePartyImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getResponsibleParty()
		 * @generated
		 */
		EClass RESPONSIBLE_PARTY = eINSTANCE.getResponsibleParty();

		/**
		 * The meta object literal for the '<em><b>Role Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY__ROLE_ID = eINSTANCE.getResponsibleParty_RoleId();

		/**
		 * The meta object literal for the '<em><b>Party Uuid</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY__PARTY_UUID = eINSTANCE.getResponsibleParty_PartyUuid();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBLE_PARTY__REMARK = eINSTANCE.getResponsibleParty_Remark();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ConstraintImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__DESCRIPTION = eINSTANCE.getConstraint_Description();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__TESTS = eINSTANCE.getConstraint_Tests();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.TestImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__EXPRESSION = eINSTANCE.getTest_Expression();

		/**
		 * The meta object literal for the '<em><b>Remark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__REMARK = eINSTANCE.getTest_Remark();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.PartitionImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__NAME = eINSTANCE.getPartition_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__ID = eINSTANCE.getPartition_Id();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__NS = eINSTANCE.getPartition_Ns();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__CLASS = eINSTANCE.getPartition_Class();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__TITLE = eINSTANCE.getPartition_Title();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.SelectImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>How Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__HOW_MANY = eINSTANCE.getSelect_HowMany();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__CHOICE = eINSTANCE.getSelect_Choice();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ResourceImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__UUID = eINSTANCE.getResource_Uuid();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TITLE = eINSTANCE.getResource_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

		/**
		 * The meta object literal for the '<em><b>Document Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__DOCUMENT_IDS = eINSTANCE.getResource_DocumentIds();

		/**
		 * The meta object literal for the '<em><b>Citation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CITATION = eINSTANCE.getResource_Citation();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__REMARKS = eINSTANCE.getResource_Remarks();

		/**
		 * The meta object literal for the '<em><b>Base64</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__BASE64 = eINSTANCE.getResource_Base64();

		/**
		 * The meta object literal for the '<em><b>RLinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RLINKS = eINSTANCE.getResource_RLinks();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.CitationImpl <em>Citation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.CitationImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCitation()
		 * @generated
		 */
		EClass CITATION = eINSTANCE.getCitation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITATION__TEXT = eINSTANCE.getCitation_Text();

		/**
		 * The meta object literal for the '<em><b>Biblio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITATION__BIBLIO = eINSTANCE.getCitation_Biblio();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.RlinkImpl <em>Rlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.RlinkImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRlink()
		 * @generated
		 */
		EClass RLINK = eINSTANCE.getRlink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLINK__HREF = eINSTANCE.getRlink_Href();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RLINK__MEDIA_TYPE = eINSTANCE.getRlink_MediaType();

		/**
		 * The meta object literal for the '<em><b>Hashes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RLINK__HASHES = eINSTANCE.getRlink_Hashes();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.HashImpl <em>Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.HashImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getHash()
		 * @generated
		 */
		EClass HASH = eINSTANCE.getHash();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH__ALGORITHM = eINSTANCE.getHash_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH__CONTENT = eINSTANCE.getHash_Content();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.PropertyOwnerImpl <em>Property Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.PropertyOwnerImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getPropertyOwner()
		 * @generated
		 */
		EClass PROPERTY_OWNER = eINSTANCE.getPropertyOwner();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OWNER__PROPERTIES = eINSTANCE.getPropertyOwner_Properties();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ParameterOwnerImpl <em>Parameter Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ParameterOwnerImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getParameterOwner()
		 * @generated
		 */
		EClass PARAMETER_OWNER = eINSTANCE.getParameterOwner();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_OWNER__PARAMETERS = eINSTANCE.getParameterOwner_Parameters();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.AnnotationOwnerImpl <em>Annotation Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.AnnotationOwnerImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAnnotationOwner()
		 * @generated
		 */
		EClass ANNOTATION_OWNER = eINSTANCE.getAnnotationOwner();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_OWNER__ANNOTATIONS = eINSTANCE.getAnnotationOwner_Annotations();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.LinkOwnerImpl <em>Link Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.LinkOwnerImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getLinkOwner()
		 * @generated
		 */
		EClass LINK_OWNER = eINSTANCE.getLinkOwner();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_OWNER__LINKS = eINSTANCE.getLinkOwner_Links();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.Base64Impl <em>Base64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.Base64Impl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getBase64()
		 * @generated
		 */
		EClass BASE64 = eINSTANCE.getBase64();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64__FILE_NAME = eINSTANCE.getBase64_FileName();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64__MEDIA_TYPE = eINSTANCE.getBase64_MediaType();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64__CONTENT = eINSTANCE.getBase64_Content();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ProfileImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__METADATA = eINSTANCE.getProfile_Metadata();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__IMPORTS = eINSTANCE.getProfile_Imports();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__MERGE = eINSTANCE.getProfile_Merge();

		/**
		 * The meta object literal for the '<em><b>Modify</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__MODIFY = eINSTANCE.getProfile_Modify();

		/**
		 * The meta object literal for the '<em><b>Backmatter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__BACKMATTER = eINSTANCE.getProfile_Backmatter();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__UUID = eINSTANCE.getProfile_Uuid();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ImportImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Herf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__HERF = eINSTANCE.getImport_Herf();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__INCLUDE = eINSTANCE.getImport_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__EXCLUDE = eINSTANCE.getImport_Exclude();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.MergeImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '<em><b>Combine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE__COMBINE = eINSTANCE.getMerge_Combine();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ModifyImpl <em>Modify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ModifyImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getModify()
		 * @generated
		 */
		EClass MODIFY = eINSTANCE.getModify();

		/**
		 * The meta object literal for the '<em><b>Setparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY__SETPARAMETERS = eINSTANCE.getModify_Setparameters();

		/**
		 * The meta object literal for the '<em><b>Alters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFY__ALTERS = eINSTANCE.getModify_Alters();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.IncludeImpl <em>Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.IncludeImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getInclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getInclude();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__ALL = eINSTANCE.getInclude_All();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__CALLS = eINSTANCE.getInclude_Calls();

		/**
		 * The meta object literal for the '<em><b>Matchs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__MATCHS = eINSTANCE.getInclude_Matchs();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.ExcludeImpl <em>Exclude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.ExcludeImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getExclude()
		 * @generated
		 */
		EClass EXCLUDE = eINSTANCE.getExclude();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE__CALLS = eINSTANCE.getExclude_Calls();

		/**
		 * The meta object literal for the '<em><b>Matchs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE__MATCHS = eINSTANCE.getExclude_Matchs();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.AllImpl <em>All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.AllImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAll()
		 * @generated
		 */
		EClass ALL = eINSTANCE.getAll();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.CallImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Contro Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__CONTRO_ID = eINSTANCE.getCall_ControId();

		/**
		 * The meta object literal for the '<em><b>With Child Controls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__WITH_CHILD_CONTROLS = eINSTANCE.getCall_WithChildControls();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.MatchImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__PATTERN = eINSTANCE.getMatch_Pattern();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__ORDER = eINSTANCE.getMatch_Order();

		/**
		 * The meta object literal for the '<em><b>With Child Controls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__WITH_CHILD_CONTROLS = eINSTANCE.getMatch_WithChildControls();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.CombineImpl <em>Combine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.CombineImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCombine()
		 * @generated
		 */
		EClass COMBINE = eINSTANCE.getCombine();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINE__METHOD = eINSTANCE.getCombine_Method();

		/**
		 * The meta object literal for the '<em><b>As Is</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINE__AS_IS = eINSTANCE.getCombine_AsIs();

		/**
		 * The meta object literal for the '<em><b>Custom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINE__CUSTOM = eINSTANCE.getCombine_Custom();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.CustomImpl <em>Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.CustomImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getCustom()
		 * @generated
		 */
		EClass CUSTOM = eINSTANCE.getCustom();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM__GROUPS = eINSTANCE.getCustom_Groups();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM__CALLS = eINSTANCE.getCustom_Calls();

		/**
		 * The meta object literal for the '<em><b>Matchs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM__MATCHS = eINSTANCE.getCustom_Matchs();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.SetParameterImpl <em>Set Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.SetParameterImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getSetParameter()
		 * @generated
		 */
		EClass SET_PARAMETER = eINSTANCE.getSetParameter();

		/**
		 * The meta object literal for the '<em><b>Param Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARAMETER__PARAM_ID = eINSTANCE.getSetParameter_ParamId();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARAMETER__CLASS = eINSTANCE.getSetParameter_Class();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARAMETER__DEPENDS_ON = eINSTANCE.getSetParameter_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARAMETER__LABEL = eINSTANCE.getSetParameter_Label();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARAMETER__USAGE = eINSTANCE.getSetParameter_Usage();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_PARAMETER__CONSTRAINTS = eINSTANCE.getSetParameter_Constraints();

		/**
		 * The meta object literal for the '<em><b>Guideline</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARAMETER__GUIDELINE = eINSTANCE.getSetParameter_Guideline();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PARAMETER__VALUE = eINSTANCE.getSetParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_PARAMETER__SELECT = eINSTANCE.getSetParameter_Select();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.OSCALConstraintImpl <em>OSCAL Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.OSCALConstraintImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getOSCALConstraint()
		 * @generated
		 */
		EClass OSCAL_CONSTRAINT = eINSTANCE.getOSCALConstraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSCAL_CONSTRAINT__DESCRIPTION = eINSTANCE.getOSCALConstraint_Description();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSCAL_CONSTRAINT__TESTS = eINSTANCE.getOSCALConstraint_Tests();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.AlterImpl <em>Alter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.AlterImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAlter()
		 * @generated
		 */
		EClass ALTER = eINSTANCE.getAlter();

		/**
		 * The meta object literal for the '<em><b>Control Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTER__CONTROL_ID = eINSTANCE.getAlter_ControlId();

		/**
		 * The meta object literal for the '<em><b>Removes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTER__REMOVES = eINSTANCE.getAlter_Removes();

		/**
		 * The meta object literal for the '<em><b>Adds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTER__ADDS = eINSTANCE.getAlter_Adds();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.RemoveImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

		/**
		 * The meta object literal for the '<em><b>Name Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE__NAME_REF = eINSTANCE.getRemove_NameRef();

		/**
		 * The meta object literal for the '<em><b>Class Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE__CLASS_REF = eINSTANCE.getRemove_ClassRef();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE__ID_REF = eINSTANCE.getRemove_IdRef();

		/**
		 * The meta object literal for the '<em><b>Item Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE__ITEM_NAME = eINSTANCE.getRemove_ItemName();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.AdditionImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITION__POSITION = eINSTANCE.getAddition_Position();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITION__ID_REF = eINSTANCE.getAddition_IdRef();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITION__TITLE = eINSTANCE.getAddition_Title();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITION__PARTITIONS = eINSTANCE.getAddition_Partitions();

		/**
		 * The meta object literal for the '{@link dsm.oscal.model.Oscal.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.NamedElementImpl
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em>Markup Line</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMarkupLine()
		 * @generated
		 */
		EDataType MARKUP_LINE = eINSTANCE.getMarkupLine();

		/**
		 * The meta object literal for the '<em>Markup Multiline</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getMarkupMultiline()
		 * @generated
		 */
		EDataType MARKUP_MULTILINE = eINSTANCE.getMarkupMultiline();

		/**
		 * The meta object literal for the '<em>Base64 Binary</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.oscal.model.Oscal.impl.OscalPackageImpl#getBase64Binary()
		 * @generated
		 */
		EDataType BASE64_BINARY = eINSTANCE.getBase64Binary();

	}

} //OscalPackage
