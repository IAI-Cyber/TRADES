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
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenDataTypeImpl;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import gov.nist.secauto.metaschema.datatypes.DataTypes;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;
import gov.nist.secauto.metaschema.model.MetaschemaException;
import gov.nist.secauto.metaschema.model.MetaschemaLoader;
import gov.nist.secauto.metaschema.model.common.IModelElement;
import gov.nist.secauto.metaschema.model.common.INamedModelElement;
import gov.nist.secauto.metaschema.model.common.definition.IAssemblyDefinition;
import gov.nist.secauto.metaschema.model.common.definition.IFieldDefinition;
import gov.nist.secauto.metaschema.model.common.definition.IFlagDefinition;
import gov.nist.secauto.metaschema.model.common.instance.IAssemblyInstance;
import gov.nist.secauto.metaschema.model.common.instance.IFieldInstance;
import gov.nist.secauto.metaschema.model.common.instance.IFlagInstance;
import gov.nist.secauto.metaschema.model.definitions.AssemblyDefinition;
import gov.nist.secauto.metaschema.model.definitions.FieldDefinition;
import gov.nist.secauto.metaschema.model.definitions.MetaschemaDefinition;
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

	private Map<DataTypes, EDataType> dataTypes = new HashMap<>();
	private Map<EDataType, DataTypes> dataTypesReverse = new HashMap<>();

	private MetaschemaLoader loader = new MetaschemaLoader();;

	private Map<java.net.URI, EPackage> schemaToPackage = new HashMap<>();

	private Map<String, EClass> defToEClass = new HashMap<>();

	private ResourceSetImpl rs;

	private List<GenClass> genClasses = new ArrayList<>();

	private EPackage rootEPackage = null;

	private BiFunction<String, String, String> imageProvider;

	private ISemanticRefactorer refactorer;




	/**
	 * Simple constructor
	 * 
	 * @param imageProvider <EPackage name,EClass name,Optional path to an image
	 *                      contained in the icon folder of the edit plugin>
	 */
	public MetaschemaToEcoreTransformer(BiFunction<String, String, String> imageProvider,
			ISemanticRefactorer refactorer) {
		this.imageProvider = imageProvider;
		this.refactorer = refactorer;
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



		refactorer.init(rootEPackage, rs);
		refactorer.refactorSemantic(defToEClass.values());

		sortByName();

		for (Resource r : rs.getResources()) {
			if (r.getURI().isFile() || r.getURI().isPlatformResource()) {
				try {
					r.save(Collections.emptyMap());
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println(e.getMessage());
				}
			}
		}

		createGenModel(rs, modelFolder, pluginFolder);
		
	}


	public void sortByName() {
		for (EPackage ePack : schemaToPackage.values()) {
			ECollections.sort(ePack.getEClassifiers(), Comparator.comparing(EClassifier::getName));
			for (EClassifier eClassifier : ePack.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					ECollections.sort(eClass.getEStructuralFeatures(),
							Comparator.comparing(EStructuralFeature::getName));

				}
			}
		}
	}

	private void createGenModel(ResourceSet rs, Path modelFolderLocation, Path pluginFolder) {
		URI genModelURI = URI.createFileURI(modelFolderLocation.resolve("oscal.genmodel").toFile().toURI().getPath());
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
//		for (Resource r : rs.getResources()) {
//			EList<EObject> content = r.getContents();
//			if (!content.isEmpty() && content.get(0) instanceof EPackage) {
//				URI packURI = r.getURI();
//				if (packURI.isFile()) {
//					packURI = genModelURI.deresolve(packURI);
//				}
//				genModel.getForeignModel().add(packURI.toString());
//			}
//		}
//		ePackages.add(EcorePackage.eINSTANCE);
		for (EPackage pack : schemaToPackage.values()) {
			ePackages.add(pack);
		}
		refactorer.refactorGenModel(genModel);
		genModel.initialize(ePackages);

		List<DataTypes> eDataToGenerate = new ArrayList<>();
		Collection<EPackage> oscalSchemas = schemaToPackage.values();
		for (Entry<DataTypes, EDataType> entry : dataTypes.entrySet()) {
			if (oscalSchemas.contains(entry.getValue().getEPackage())) {
				eDataToGenerate.add(entry.getKey());
			}
		}
		
		Collections.sort(eDataToGenerate, Comparator.comparing(d -> d.toString()));

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
				DataTypes oscalDataType = dataTypesReverse.get(genType.getEcoreDataType());
				if (oscalDataType != null) {
					((GenDataTypeImpl) genType).setCreate(genTypeGenerator.getFromStringCode(oscalDataType));
					((GenDataTypeImpl) genType).setConvert(genTypeGenerator.getToStringCode(oscalDataType));
				}
			}
		}

		System.out.println("* Customizing gen features");
		for (GenPackage genPackage : genPacks) {
			for (GenClass genClass : genPackage.getGenClasses()) {
				genClasses.add(genClass);
				if (!genClass.isAbstract() && !genClass.isInterface()) {

					for (GenFeature genFeature : genClass.getGenFeatures()) {
						if (MarkupMultiline.class.getName().equals(genFeature.getType(genClass))) {
							System.out.println(genClass.getName() + "." + genFeature.getName());
							genFeature.setPropertyMultiLine(true);
						}
						// Set the property description
						genFeature.setPropertyDescription(
								MigrationEcoreUtils.getSimpleDocumentation(genFeature.getEcoreFeature()));
					}

				}
			}
		}
		refactorer.refactorGenClasses(genClasses);
		try {

			Resource genModelResource = rs.createResource(genModelURI);
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
		System.out.println("* Generating custom item providers");
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
		for (DataTypes type : DataTypes.values()) {

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
				Class<?> javaClass = type.getJavaTypeAdapter().getJavaClass();
				String instanceClassName = javaClass.getName();

				// For type mapped to String use UString
				if ("java.lang.String".equals(instanceClassName)) {
					eDataType = EcorePackage.eINSTANCE.getEString();
				}

				// Only creates a new data types when required
				if (eDataType == null) {
					eDataType = EcoreFactory.eINSTANCE.createEDataType();
					eDataType.setName(NameHelper.getProperEDataTypeName(type));
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

		return ePack;
	}

	private void createEClasses(XmlMetaschema metadata, EPackage ePack) {

		// Collect all AssemblyDefinition and FieldDefinition (fields with flags) that
		// will be transformed into EClass
		List<IAssemblyDefinition> defs = new ArrayList<>();
		List<IFieldDefinition> complexeFielDefs = new ArrayList<>();

		collectAssemblyDefinition(new ArrayList<>(metadata.getAssemblyDefinitions().values()), defs, complexeFielDefs,
				null);

		// Create EClass for assembly definition (and simple attributes only)
		for (IAssemblyDefinition def : defs) {
			EClass eClass = toEClass(def);
			if (eClass != null) {
				ePack.getEClassifiers().add(eClass);
			}
		}

		// Create EClass for complex field
		for (IFieldDefinition def : complexeFielDefs) {
			EClass eClass = toEClass(def);
			if (eClass != null) {
				ePack.getEClassifiers().add(eClass);
			}
		}

		// Then create all references
		for (IAssemblyDefinition definition : defs) {

			EClass eClass = defToEClass.get(definition.toCoordinates());
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
	private void collectAssemblyDefinition(List<IAssemblyDefinition> defs, List<IAssemblyDefinition> assemblyCollector,
			List<IFieldDefinition> complexeFielCollector, IAssemblyDefinition parent) {

		for (IAssemblyDefinition def : defs) {
			String qn = def.toCoordinates();
			if (!defToEClass.containsKey(qn)) {
				EClass eClass = EcoreFactory.eINSTANCE.createEClass();

				if (def.getClass().isMemberClass() // Only way for now to check local assembly definition
						// We need o distinguish them to avoid name collision
						&& parent != null) {
					eClass.setName(NameHelper.getProperEClassName(parent.getName())
							+ NameHelper.getProperEClassName(def.getName()));
				} else {
					eClass.setName(NameHelper.getProperEClassName(def.getName()));
				}

				defToEClass.put(qn, eClass);
				assemblyCollector.add(def);

				for (Entry<String, ? extends IFieldInstance> entry : def.getFieldInstances().entrySet()) {
					IFieldInstance inst = entry.getValue();
					if (!isSimple(inst)) {
						addComplexeFieldDefinition(complexeFielCollector, inst.getDefinition());
					}
				}

				List<IAssemblyDefinition> childrenDefinition = def.getAssemblyInstances().values().stream()
						.filter(i -> !isSimple(i)).map(i -> i.getDefinition()).collect(toList());
				collectAssemblyDefinition(childrenDefinition, assemblyCollector, complexeFielCollector, def);
			}
		}
	}

	/**
	 * Check if the given model element is a complex data type that would be
	 * represented by an EClass
	 * 
	 * @param modelElement
	 * @return
	 */
	private boolean isSimple(IModelElement modelElement) {
		final boolean result;

		if (modelElement instanceof IFieldInstance) {
			result = ((IFieldInstance) modelElement).getDefinition().getFlagInstances().isEmpty();
		} else if (modelElement instanceof IAssemblyDefinition || modelElement instanceof IAssemblyInstance) {
			result = false;
		} else if (modelElement instanceof IFieldDefinition) {
			result = ((IFieldDefinition) modelElement).getFlagInstances().isEmpty();
		} else {
			result = true;
		}

		if (result) {
			if (modelElement instanceof INamedModelElement) {
				System.out.println(((INamedModelElement) modelElement).getName() + " is simple");

			}
		}
		return result;

	}

	private void addComplexeFieldDefinition(List<IFieldDefinition> complexeFielDefs, IFieldDefinition cfd) {
		String fqn = cfd.toCoordinates();
		if (!defToEClass.containsKey(fqn)) {
			EClass feClass = EcoreFactory.eINSTANCE.createEClass();
			defToEClass.put(fqn, feClass);
			complexeFielDefs.add(cfd);

			// Create the value field from type
			EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
			feClass.getEStructuralFeatures().add(attr);
			attr.setName("value");

			DataTypes dataType = cfd.getDatatype();
			EDataType matchingType = dataTypes.get(dataType);
			if (matchingType == null) {
				System.err.println("Matching data type note found for " + dataType);
			} else {
				attr.setEType(matchingType);
			}

		}
	}

	/**
	 * Creates all {@link EReference} for the given {@link EClass}
	 * 
	 * @param eClass     {@link EClass} to fill
	 * @param definition {@link AssemblyDefinition}
	 */
	private void fillReferences(EClass eClass, IAssemblyDefinition definition) {
		for (Entry<String, ? extends IAssemblyInstance> entry : definition.getAssemblyInstances().entrySet()) {
			IAssemblyInstance assInstance = entry.getValue();
			toContainmentRef(eClass, assInstance);

		}

		for (Entry<String, ? extends IFieldInstance> entry : definition.getFieldInstances().entrySet()) {
			IFieldInstance fieldInstance = entry.getValue();
			if (!isSimple(fieldInstance)) {
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
	private void toContainmentRef(EClass eClass, IFieldInstance fieldInstance) {
		IFieldDefinition fieldDefinition = fieldInstance.getDefinition();

		EReference containmentRef = EcoreFactory.eINSTANCE.createEReference();
		eClass.getEStructuralFeatures().add(containmentRef);
		containmentRef.setContainment(true);
		containmentRef.setName(NameHelper.getProperEStructuralFeatureName(NameHelper.getFieldName(fieldInstance)));

		String defQualifiedName = fieldDefinition.toCoordinates();
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
	private void toContainmentRef(EClass eClass, IAssemblyInstance assInstance) {
		IAssemblyDefinition childDef = assInstance.getDefinition();

		EReference containmentRef = EcoreFactory.eINSTANCE.createEReference();
		eClass.getEStructuralFeatures().add(containmentRef);
		containmentRef.setContainment(true);
		containmentRef.setName(NameHelper.getProperEStructuralFeatureName(NameHelper.getFieldName(assInstance)));

		String defQualifiedName = childDef.toCoordinates();
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

	/**
	 * Creates an {@link EClass} for the given {@link AssemblyDefinition} (and add
	 * simple {@link EAttribute})
	 * 
	 * @param def the definition
	 * 
	 * @return the new EClass
	 */
	private EClass toEClass(IAssemblyDefinition def) {
		EClass eClass = defToEClass.get(def.toCoordinates());

		setDocumentation(eClass, def);
		transformFlags(def.getFlagInstances(), eClass);

		for (Entry<String, ? extends IFieldInstance> entry : def.getFieldInstances().entrySet()) {
			IFieldInstance fieldInstance = entry.getValue();
			if (isSimple(fieldInstance)) {
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
	private EClass toEClass(IFieldDefinition def) {
		EClass eClass = defToEClass.get(def.toCoordinates());

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
	private void toEAttribute(EClass eClass, IFieldInstance fieldInstance) {
		IFieldDefinition fieldDef = fieldInstance.getDefinition();

		EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
		eClass.getEStructuralFeatures().add(attr);
		attr.setName(NameHelper.getProperEStructuralFeatureName(NameHelper.getFieldName(fieldInstance)));

		DataTypes dataType = fieldDef.getDatatype();
		attr.setEType(dataTypes.get(dataType));
		setDocumentation(attr, fieldDef);

		attr.setUpperBound(fieldInstance.getMaxOccurs());
		attr.setLowerBound(fieldInstance.getMinOccurs());
	}


	/**
	 * Transforms the given {@link FlagInstance} into {@link EAttribute}s
	 * 
	 * @param flags  the flag instance with the attribute name
	 * @param eClass the owning {@link EClass}
	 */
	private void transformFlags(Map<String, ? extends IFlagInstance> flags, EClass eClass) {
		for (Entry<String, ? extends IFlagInstance> flagEntry : flags.entrySet()) {
			EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
			eClass.getEStructuralFeatures().add(attr);
			IFlagInstance entry = flagEntry.getValue();

			attr.setName(NameHelper.getProperEStructuralFeatureName(flagEntry.getKey()));

			IFlagDefinition flagDef = entry.getDefinition();

			DataTypes dataType = flagDef.getDatatype();
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
	private void setDocumentation(EModelElement element, INamedModelElement def) {
		String doc = "";

		doc += "<h1>" + def.getEffectiveName() + "</h1>\n";
		if (def instanceof MetaschemaDefinition) {
			MetaschemaDefinition metaDef = (MetaschemaDefinition) def;
			MarkupLine description = metaDef.getDescription();
			if (description != null) {
				doc += "<h2>Description</h2>\n";
				doc += description.toHtml();
			}
		}
		MarkupMultiline remarks = def.getRemarks();
		if (remarks != null) {
			doc += "<h2>Remarks</h2>\n";
			doc += remarks.toHtml();
		}
		MigrationEcoreUtils.setDocumentation(element, doc);

	}

}
