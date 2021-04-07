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
package dsm.oscal.ext;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenDataTypeImpl;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;
import gov.nist.secauto.metaschema.model.MetaschemaException;
import gov.nist.secauto.metaschema.model.MetaschemaLoader;
import gov.nist.secauto.metaschema.model.definitions.AssemblyDefinition;
import gov.nist.secauto.metaschema.model.definitions.DataType;
import gov.nist.secauto.metaschema.model.definitions.FieldDefinition;
import gov.nist.secauto.metaschema.model.definitions.FlagDefinition;
import gov.nist.secauto.metaschema.model.definitions.InfoElementDefinition;
import gov.nist.secauto.metaschema.model.instances.AssemblyInstance;
import gov.nist.secauto.metaschema.model.instances.FieldInstance;
import gov.nist.secauto.metaschema.model.instances.FlagInstance;
import gov.nist.secauto.metaschema.model.xml.XmlMetaschema;

/**
 * Transformer that transform metaschema definition into ecore models
 * 
 * @author Arthur Daussy
 *
 */
public class MetaschemaToEcoreTransformer {

	private static final String MODEL_FOLDER = "model";

	private static final String JAVA_HEADER = "/**\r\n"
			+ " * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.\r\n"
			+ " * This program and the accompanying materials\r\n"
			+ " * are made available under the terms of the Eclipse Public License 2.0\r\n"
			+ " * which accompanies this distribution, and is available at\r\n"
			+ " * https://www.eclipse.org/legal/epl-2.0/\r\n" + " * \r\n" + " * SPDX-License-Identifier: EPL-2.0\r\n"
			+ " * \r\n" + " * Contributors:\r\n" + " *     ELTA Ltd - initial API and implementation\r\n" + " * \r\n"
			+ " */";

	private static final String HEADER = "\r\n"
			+ " Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.\r\n"
			+ " This program and the accompanying materials\r\n"
			+ " are made available under the terms of the Eclipse Public License 2.0\r\n"
			+ " which accompanies this distribution, and is available at\r\n"
			+ " https://www.eclipse.org/legal/epl-2.0/\r\n" + " \r\n" + " SPDX-License-Identifier: EPL-2.0\r\n"
			+ " \r\n" + " Contributors:\r\n" + "     ELTA Ltd - initial API and implementation\r\n" + " \r\n";

	private static final String SOURCE = "source";

	private static final String METASCHEMA_SOURCE = "Metaschema";

	private static final String GEN_MODEL_ANNOT = "http://www.eclipse.org/emf/2002/GenModel";

	private Map<DataType, EDataType> dataTypes = new HashMap<>();
	private Map<EDataType, DataType> dataTypesReverse = new HashMap<>();

	private MetaschemaLoader loader = new MetaschemaLoader();;

	private Map<java.net.URI, EPackage> schemaToPackage = new HashMap<>();

	private Map<String, EClass> defToEClass = new HashMap<>();

	private ResourceSetImpl rs;

	private EPackage rootEPackage = null;
	
	private BiFunction<String, String, String> imageProvider;

	/**
	 * Command line application to use for the migration
	 * 
	 * @param args only contains only one argument that is a path to an existing
	 *             plugin that will contain the generated models (and code)
	 * @throws MalformedURLException
	 * @throws MetaschemaException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static void main(String[] args)
			throws MalformedURLException, MetaschemaException, IOException, URISyntaxException {
		if (args.length == 0) {
			throw new IllegalArgumentException("Expecting one argument that target the model plugin");
		}
		new MetaschemaToEcoreTransformer(new OSCALImageProvider()).transform(List.of(//
//				"metaschema/oscal_assessment-common_metaschema.xml", //
//				"metaschema/oscal_assessment-plan_metaschema.xml", //
//				"metaschema/oscal_assessment-results_metaschema.xml", //
				"metaschema/oscal_catalog_metaschema.xml", //
//				"metaschema/oscal_component_metaschema.xml", //
				"metaschema/oscal_control-common_metaschema.xml", //
//				"metaschema/oscal_implementation-common_metaschema.xml", //
				"metaschema/oscal_metadata_metaschema.xml" //
//				"metaschema/oscal_poam_metaschema.xml", //
//				"metaschema/oscal_profile_metaschema.xml" //
//				"metaschema/oscal_ssp_metaschema.xml"//
		), Path.of(args[0]));

	}

	/**
	 * Simple constructor
	 * 
	 * @param imageProvider <EPackage name,EClass name,Optional path to an image
	 *                      contained in the icon folder of the edit plugin>
	 */
	public MetaschemaToEcoreTransformer(BiFunction<String, String, String> imageProvider) {
		this.imageProvider = imageProvider;
		this.rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
	}

	/**
	 * Transforms the given metaschema in ecore models
	 * 
	 * @param metaSchemaPaths a list of schema to transform (relative path to this
	 *                        class need to be embed into the jar file)
	 * @param pluginFolder
	 * @throws MalformedURLException
	 * @throws MetaschemaException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public void transform(List<String> metaSchemaPaths, Path pluginFolder)
			throws MalformedURLException, MetaschemaException, IOException, URISyntaxException {

		Path modelFolder = pluginFolder.resolve(MODEL_FOLDER);

		if (!modelFolder.toFile().exists()) {
			modelFolder.toFile().mkdirs();
		}

		for (String schemaPath : metaSchemaPaths) {
			importSchema(this.getClass().getResource(schemaPath).toURI(), modelFolder);
		}

		// Make all EClass inherits from OSCAlElements
		EClass oscalElement = EcoreFactory.eINSTANCE.createEClass();
		oscalElement.setName("OscalElement");
		oscalElement.setAbstract(true);
		oscalElement.setInterface(true);
		rootEPackage.getEClassifiers().add(oscalElement);

		for (EClass eClass : defToEClass.values()) {
			eClass.getESuperTypes().add(oscalElement);
		}

		for (Resource r : rs.getResources()) {
			try {
				r.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
		}

		createGenModel(rs, modelFolder, pluginFolder);

	}

	private void createGenModel(ResourceSet rs, Path modelFolderLocation, Path pluginFolder) {

		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK70_LITERAL);
		genModel.setModelDirectory("/dsm.oscal.model/src-gen");
		genModel.setEditDirectory("/dsm.oscal.model.edit/src-gen");
		genModel.setEditorDirectory("/dsm.oscal.model.editor/src-gen");
		genModel.setModelPluginID("dsm.oscal.model");
		genModel.setModelName("Oscal");
		genModel.setRootExtendsClass("org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container");
		genModel.setImporterID("org.eclipse.emf.importer.ecore");
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setOperationReflection(true);
		genModel.setImportOrganizing(true);
		genModel.setCopyrightText(HEADER);

		List<EPackage> ePackages = new ArrayList<>();
		for (Resource r : rs.getResources()) {
			EList<EObject> content = r.getContents();
			if (!content.isEmpty() && content.get(0) instanceof EPackage) {
				genModel.getForeignModel().add(r.getURI().lastSegment());
				ePackages.add((EPackage) content.get(0));

			}
		}
		genModel.initialize(ePackages);

		List<DataType> eDataToGenerate = new ArrayList<>();
		Collection<EPackage> oscalSchemas = schemaToPackage.values();
		for (Entry<DataType, EDataType> entry : dataTypes.entrySet()) {
			if (oscalSchemas.contains(entry.getValue().getEPackage())) {
				eDataToGenerate.add(entry.getKey());
			}
		}

		OscalDataTypeHandlerGenerator genTypeGenerator = new OscalDataTypeHandlerGenerator("dsm.oscal.model", (msg,
				exVariable) -> "dsm.oscal.model.OSCALModelActivator.logError(\"" + msg + "\", " + exVariable + ")",
				eDataToGenerate, JAVA_HEADER);
		Path srcGenFolder = pluginFolder.resolve("src-gen");
		genTypeGenerator.generate(srcGenFolder);

		List<GenPackage> genPacks = new ArrayList<>();
		for (GenPackage genPack : genModel.getGenPackages()) {
			genPack.setBasePackage("dsm.oscal.model");
			genPacks.add(genPack);
			for (GenDataType genType : genPack.getGenDataTypes()) {
				DataType oscalDataType = dataTypesReverse.get(genType.getEcoreDataType());
				if (oscalDataType != null) {
					((GenDataTypeImpl) genType).setCreate(genTypeGenerator.getFromStringCode(oscalDataType));
					((GenDataTypeImpl) genType).setConvert(genTypeGenerator.getToStringCode(oscalDataType));
				}
			}
		}

		try {
			Resource genModelResource = rs.createResource(
					URI.createFileURI(modelFolderLocation.resolve("oscal.genmodel").toFile().toURI().getPath()));
			genModelResource.getContents().add(genModel);
			genModelResource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

		String editPlugin = genModel.getEditPluginDirectory().substring(1);
		Path srcEditGenFolder = pluginFolder.getParent().resolve(editPlugin);
		Path manEditGenFolder = srcEditGenFolder.getParent().resolve("src-man");
		ItemProviderGenerator itemProviderGenerator = new ItemProviderGenerator(srcEditGenFolder, manEditGenFolder,
				JAVA_HEADER, imageProvider);

		for (GenPackage genPackage : genPacks) {
			for (GenClass genClass : genPackage.getGenClasses()) {
				if (!genClass.isAbstract() && !genClass.isInterface()) {
					itemProviderGenerator.generate((GenClassImpl) genClass);
				}
			}
		}
	}

	private void importSchema(java.net.URI schemaURI, Path targetFolder)
			throws MalformedURLException, MetaschemaException, IOException {

		// Do not transform twi the same metaschema
		if (schemaToPackage.get(schemaURI) != null) {
			return;
		}

		System.out.println("Transforming " + schemaURI);
		XmlMetaschema schema = loader.loadXmlMetaschema(schemaURI.toURL());

		// First import all dependent schemas
		// Not really safe in case there is aloop
		for (java.net.URI imported : schema.getImportedMetaschema().keySet()) {
			EPackage importedSchema = schemaToPackage.get(imported);
			if (importedSchema == null) {
				importSchema(imported, targetFolder);
			}
		}

		// Add the data types in the less dependent EPackage
		if (rootEPackage == null) {
			createDataType();
		}

		EPackage ePackages = toEPackage(schema);

		if (rootEPackage == null) {
			rootEPackage = ePackages;
			List<EDataType> eData = dataTypes.values().stream()
					.filter(d -> d.eContainer() == null /* Do not include ecore data type */).collect(toList());
			ePackages.getEClassifiers().addAll(0, eData);
		}

		Resource resource = rs
				.createResource(URI.createFileURI(targetFolder.toString() + "/" + schema.getShortName() + ".ecore"));

		resource.getContents().add(ePackages);
	}

	/**
	 * Creates the default data types
	 */
	private void createDataType() {
		// Map simple data types to the one provided by Ecore
		for (DataType type : DataType.values()) {

			EDataType eDataType;
			switch (type) {
			case STRING:
				eDataType = EcorePackage.eINSTANCE.getEString();
				break;
			case BOOLEAN:
				eDataType = EcorePackage.eINSTANCE.getEBoolean();
				break;
			case DECIMAL:
				eDataType = EcorePackage.eINSTANCE.getEDouble();
				break;
			case INTEGER:
				eDataType = EcorePackage.eINSTANCE.getEInt();
				break;
			case POSITIVE_INTEGER:
			case NON_NEGATIVE_INTEGER:
				eDataType = EcorePackage.eINSTANCE.getELong();
				break;
			default:
				eDataType = null;

			}

			// Fallback for more complexe type
			if (eDataType == null) {
				gov.nist.secauto.metaschema.codegen.type.DataType genType = gov.nist.secauto.metaschema.codegen.type.DataType
						.lookupByDatatype(type);
				String instanceClassName = genType.getTypeName().toString();

				// For type mapped to String use UString
				eDataType = switch (instanceClassName) {
				case "java.lang.String" -> EcorePackage.eINSTANCE.getEString();
				default -> null;
				};

				// Only creates a new data types when required
				if (eDataType == null) {
					eDataType = EcoreFactory.eINSTANCE.createEDataType();
					eDataType.setName(NameHelper.getProperEDataTypeName(genType));
					eDataType.setInstanceClassName(instanceClassName);
				}
			}

			dataTypes.put(type, eDataType);
			dataTypesReverse.put(eDataType, type);
		}

	}

	/**
	 * Transform the given XmlMetaschema into a {@link EPackage}
	 * 
	 * @param metadata a non null {@link XmlMetaschema}
	 * @return an new {@link EPackage}
	 */
	private EPackage toEPackage(XmlMetaschema metadata) {
		EPackage ePack = EcoreFactory.eINSTANCE.createEPackage();
		schemaToPackage.put(metadata.getLocation(), ePack);

		ePack.setName(NameHelper.getProperEPackageName(metadata));
		ePack.setNsURI(metadata.getXmlNamespace() + "/" + metadata.getShortName());
		ePack.setNsPrefix(metadata.getShortName());

		createEClasses(metadata, ePack);

		ECollections.sort(ePack.getEClassifiers(), Comparator.comparing(EClassifier::getName));

		return ePack;
	}

	private void createEClasses(XmlMetaschema metadata, EPackage ePack) {

		// Collect all AssemblyDefinition and FieldDefinition (fields with flags) that
		// will be transformed into EClass
		List<AssemblyDefinition> defs = new ArrayList<>();
		List<FieldDefinition> complexeFielDefs = new ArrayList<>();
		collectAssemblyDefinition(metadata.getAssemblyDefinitions().values(), defs, complexeFielDefs, null);

		// Create EClass for assembly definition (and simple attributes only)
		for (AssemblyDefinition def : defs) {
			EClass eClass = toEClass(def);
			if (eClass != null) {
				ePack.getEClassifiers().add(eClass);
			}
		}

		// Create EClass for complex field
		for (FieldDefinition def : complexeFielDefs) {
			EClass eClass = toEClass(def);
			if (eClass != null) {
				ePack.getEClassifiers().add(eClass);
			}
		}

		// Then create all references
		for (AssemblyDefinition definition : defs) {

			EClass eClass = defToEClass.get(QualifiedNameHelper.getQualifiedName(definition));
			if (eClass != null) {
				fillReferences(eClass, definition);
			}
		}
	}

	/**
	 * Collects all {@link AssemblyDefinition} (root and nested) and all complex
	 * 
	 * @param assemblyCollector     collector of {@link AssemblyDefinition}
	 * @param complexeFielCollector collector of {@link FieldDefinition}
	 * @param parent                optional parent {@link AssemblyDefinition}
	 */
	private void collectAssemblyDefinition(Collection<AssemblyDefinition> defs,
			List<AssemblyDefinition> assemblyCollector, List<FieldDefinition> complexeFielCollector,
			AssemblyDefinition parent) {

		for (AssemblyDefinition def : defs) {
			String qn = QualifiedNameHelper.getQualifiedName(def);
			if (!defToEClass.containsKey(qn)) {
				EClass eClass = EcoreFactory.eINSTANCE.createEClass();

				setMigrationAnnotation(eClass, SOURCE, QualifiedNameHelper.getQualifiedName(def));
				if (!def.isGlobal()) {
					if (parent != null) {
						eClass.setName(NameHelper.getProperEClassName(parent.getName())
								+ NameHelper.getProperEClassName(def.getName()));
					} else {
						throw new IllegalStateException("Local definition without parent");
					}
				} else {
					eClass.setName(NameHelper.getProperEClassName(def.getName()));
				}

				defToEClass.put(qn, eClass);
				assemblyCollector.add(def);

				for (Entry<String, FieldInstance<?>> entry : def.getFieldInstances().entrySet()) {
					FieldInstance<?> inst = entry.getValue();
					if (!inst.isSimple()) {
						addComplexeFieldDefinition(complexeFielCollector, inst.getDefinition());
					}
				}

				List<AssemblyDefinition> childrenDefinition = def.getAssemblyInstances().values().stream()
						.filter(i -> !i.isSimple()).map(i -> i.getDefinition()).collect(toList());
				collectAssemblyDefinition(childrenDefinition, assemblyCollector, complexeFielCollector, def);
			}
		}
	}

	private void addComplexeFieldDefinition(List<FieldDefinition> complexeFielDefs, FieldDefinition cfd) {
		String fqn = QualifiedNameHelper.getQualifiedName(cfd);
		if (!defToEClass.containsKey(fqn)) {
			EClass feClass = EcoreFactory.eINSTANCE.createEClass();
			defToEClass.put(fqn, feClass);
			complexeFielDefs.add(cfd);

			// Create the value field from type
			EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
			feClass.getEStructuralFeatures().add(attr);
			attr.setName("value");

			DataType dataType = cfd.getDatatype();
			attr.setEType(dataTypes.get(dataType));

		}
	}

	/**
	 * Creates all {@link EReference} for the given {@link EClass}
	 * 
	 * @param eClass     {@link EClass} to fill
	 * @param definition {@link AssemblyDefinition}
	 */
	private void fillReferences(EClass eClass, AssemblyDefinition definition) {
		for (Entry<String, AssemblyInstance<?>> entry : definition.getAssemblyInstances().entrySet()) {
			AssemblyInstance<?> assInstance = entry.getValue();
			toContainmentRef(eClass, assInstance);

		}

		for (Entry<String, FieldInstance<?>> entry : definition.getFieldInstances().entrySet()) {
			FieldInstance<?> fieldInstance = entry.getValue();
			if (!fieldInstance.isSimple()) {
				toContainmentRef(eClass, fieldInstance);
			}
		}

	}

	/**
	 * Creates a containment {@link EReference} in the given {@link EClass} to the
	 * {@link EClass} defined by the given {@link FieldInstance}
	 * 
	 * @param eClass        owning {@link EClass}
	 * @param fieldInstance field definition (for complex type only)
	 */
	private void toContainmentRef(EClass eClass, FieldInstance<?> fieldInstance) {
		FieldDefinition fieldDefinition = fieldInstance.getDefinition();

		EReference containmentRef = EcoreFactory.eINSTANCE.createEReference();
		setMigrationAnnotation(containmentRef, SOURCE, QualifiedNameHelper.getQualifiedName(fieldDefinition));
		eClass.getEStructuralFeatures().add(containmentRef);
		containmentRef.setContainment(true);
		containmentRef.setName(NameHelper.getProperEStructuralFeatureName(NameHelper.getFieldName(fieldInstance)));

		String defQualifiedName = QualifiedNameHelper.getQualifiedName(fieldDefinition);
		EClass targetEClass = defToEClass.get(defQualifiedName);
		if (targetEClass == null) {
			// Locally defined type
			System.err.println("Unknown definition " + defQualifiedName);
		} else {
			containmentRef.setEType(targetEClass);
		}

		containmentRef.setUpperBound(fieldInstance.getMaxOccurs());
		containmentRef.setLowerBound(fieldInstance.getMinOccurs());

	}

	/**
	 * Creates a containment {@link EReference} in the given {@link EClass} to the
	 * {@link EClass} defined by the given {@link AssemblyInstance}
	 * 
	 * @param eClass      owning {@link EClass}
	 * @param assInstance assembly definition
	 */
	private void toContainmentRef(EClass eClass, AssemblyInstance<?> assInstance) {
		AssemblyDefinition childDef = assInstance.getDefinition();

		if (assInstance.isSimple()) {
			System.err.println("Warning: " + eClass.getName() + "." + childDef.getName()
					+ "is a simple AssemblyDefinition. We do not handle them well now.");

		} else {
			EReference containmentRef = EcoreFactory.eINSTANCE.createEReference();
			setMigrationAnnotation(containmentRef, SOURCE, QualifiedNameHelper.getQualifiedName(childDef));
			eClass.getEStructuralFeatures().add(containmentRef);
			containmentRef.setContainment(true);
			containmentRef.setName(NameHelper.getProperEStructuralFeatureName(NameHelper.getFieldName(assInstance)));

			String defQualifiedName = QualifiedNameHelper.getQualifiedName(childDef);
			EClass targetEClass = defToEClass.get(defQualifiedName);
			if (targetEClass == null) {
				// Locally defined type
				System.err.println("Unknown definition " + defQualifiedName);
			} else {
				containmentRef.setEType(targetEClass);
			}

			containmentRef.setUpperBound(assInstance.getMaxOccurs());
			containmentRef.setLowerBound(assInstance.getMinOccurs());
		}
	}

	/**
	 * Creates an {@link EClass} for the given {@link AssemblyDefinition} (and add
	 * simple {@link EAttribute})
	 * 
	 * @param def the definition
	 * 
	 * @return the new EClass
	 */
	private EClass toEClass(AssemblyDefinition def) {
		EClass eClass = defToEClass.get(QualifiedNameHelper.getQualifiedName(def));

		setDocumentation(eClass, def);
		transformFlags(def.getFlagInstances(), eClass);

		for (Entry<String, FieldInstance<?>> entry : def.getFieldInstances().entrySet()) {
			FieldInstance<?> fieldInstance = entry.getValue();
			if (fieldInstance.isSimple()) {
				toEAttribute(eClass, fieldInstance);
			}
		}

		return eClass;

	}

	/**
	 * Creates an {@link EClass} for the given {@link FieldDefinition} (and add
	 * simple {@link EAttribute})
	 * 
	 * @param def the definition
	 * 
	 * @return the new EClass
	 */
	private EClass toEClass(FieldDefinition def) {
		EClass eClass = defToEClass.get(QualifiedNameHelper.getQualifiedName(def));

		setMigrationAnnotation(eClass, SOURCE, QualifiedNameHelper.getQualifiedName(def));
		eClass.setName(NameHelper.getProperEClassName(def.getName()));
		setDocumentation(eClass, def);
		transformFlags(def.getFlagInstances(), eClass);

		return eClass;
	}

	/**
	 * Creates a {@link EAttribute} for the given {@link FieldDefinition}
	 * 
	 * @param eClass        the owning {@link EClass}
	 * @param fieldInstance the field instance
	 */
	private void toEAttribute(EClass eClass, FieldInstance<?> fieldInstance) {
		FieldDefinition fieldDef = fieldInstance.getDefinition();

		EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
		setMigrationAnnotation(attr, SOURCE, QualifiedNameHelper.getQualifiedName(fieldInstance));
		eClass.getEStructuralFeatures().add(attr);
		attr.setName(NameHelper.getProperEStructuralFeatureName(NameHelper.getFieldName(fieldInstance)));

		DataType dataType = fieldDef.getDatatype();
		attr.setEType(dataTypes.get(dataType));
		setDocumentation(attr, fieldDef);

		attr.setUpperBound(fieldInstance.getMaxOccurs());
		attr.setLowerBound(fieldInstance.getMinOccurs());
	}

	/**
	 * Add migration annotation
	 * 
	 * @param element the owning element
	 * @param key     the key
	 * @param value   the value
	 */
	private void setMigrationAnnotation(EModelElement element, String key, String value) {
		EAnnotation annot = element.getEAnnotation(METASCHEMA_SOURCE);
		if (annot == null) {
			annot = EcoreFactory.eINSTANCE.createEAnnotation();
			element.getEAnnotations().add(annot);
			annot.setSource(METASCHEMA_SOURCE);
		}

		annot.getDetails().put(key, value);
	}

	/**
	 * Transforms the given {@link FlagInstance} into {@link EAttribute}s
	 * 
	 * @param flags  the flag instance with the attribute name
	 * @param eClass the owning {@link EClass}
	 */
	private void transformFlags(Map<String, ? extends FlagInstance<?>> flags, EClass eClass) {
		for (Entry<String, ? extends FlagInstance<?>> flagEntry : flags.entrySet()) {
			EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
			eClass.getEStructuralFeatures().add(attr);
			FlagInstance<?> entry = flagEntry.getValue();

			attr.setName(NameHelper.getProperEStructuralFeatureName(flagEntry.getKey()));

			FlagDefinition flagDef = entry.getDefinition();
			setMigrationAnnotation(attr, SOURCE, QualifiedNameHelper.getQualifiedName(entry));

			DataType dataType = flagDef.getDatatype();
			EDataType tDataType = dataTypes.get(dataType);
			if (tDataType == null) {
				System.err.println("Unkown data type " + tDataType);
			} else {
				attr.setEType(tDataType);
			}
			setDocumentation(attr, flagDef);

			if (entry.isRequired()) {
				attr.setLowerBound(1);
			}

		}
	}

	/**
	 * Set the documentation to the given {@link EModelElement} from a
	 * {@link InfoElementDefinition}
	 * 
	 * @param element the element to set documentation on
	 * @param def     the documentation owner
	 */
	private void setDocumentation(EModelElement element, InfoElementDefinition def) {
		EAnnotation anotation = element.getEAnnotation(GEN_MODEL_ANNOT);
		if (anotation == null) {
			anotation = EcoreFactory.eINSTANCE.createEAnnotation();
			anotation.setSource(GEN_MODEL_ANNOT);
			element.getEAnnotations().add(anotation);
		}
		String doc = "";

		doc += "<h1>" + def.getFormalName() + "</h1>\n";
		MarkupLine description = def.getDescription();
		if (description != null) {
			doc += "<h2>Description</h2>\n";
			doc += description.toHtml();
		}
		MarkupMultiline remarks = def.getRemarks();
		if (remarks != null) {
			doc += "<h2>Remarks</h2>\n";
			doc += remarks.toHtml();
		}

		anotation.getDetails().put("documentation", doc);

	}

}
