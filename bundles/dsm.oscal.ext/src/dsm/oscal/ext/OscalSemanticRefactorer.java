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

import static dsm.oscal.ext.matchers.EClassifierMatchers.hasInstanceClass;
import static dsm.oscal.ext.matchers.FeatureMatchers.hasName;
import static dsm.oscal.ext.matchers.FeatureMatchers.isAttributeTyped;
import static dsm.oscal.ext.matchers.FeatureMatchers.isContainmentTyped;
import static dsm.oscal.ext.matchers.FeatureMatchers.isMany;
import static dsm.oscal.ext.matchers.FeatureMatchers.isUnique;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.base.CaseFormat;

import dsm.oscal.ext.matchers.EClassifierMatchers;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

public class OscalSemanticRefactorer implements ISemanticRefactorer {

	private static final org.eclipse.emf.common.util.URI tradesMMuri = org.eclipse.emf.common.util.URI
			.createPlatformPluginURI("/dsm.TRADES/model/TRADES.ecore", true);
	private static final org.eclipse.emf.common.util.URI tradesGEnMMuri = org.eclipse.emf.common.util.URI
			.createPlatformPluginURI("/dsm.TRADES/model/TRADES.genmodel", true);

	private static final Predicate<EStructuralFeature> UUID_ATTR = isUnique()/*
																				 * Also take non unique and for them to
																				 * be unique it will be easier to use
																				 */
			.and(isAttributeTyped(UUID.class.getName()));

	private EPackage rootEPackage;

	private EDataType uuidDataType;
	private Collection<EClass> eClasses;

	private List<EReference> hiddenContainementReferences = new ArrayList<>();
	private List<GenClass> genClasses;
	private EDataType markupMultilineType;

	private EDataType uriType;

	private ResourceSet rs;



	private EPackage tradesEPackage;

	private EClass controlDelf;

	private EClass catalogDelf;
	private GenModel genModel;

	@Override
	public void init(EPackage rootEPackage, ResourceSet rs) {
		this.rootEPackage = rootEPackage;
		this.rs = rs;

		this.tradesEPackage = (EPackage) rs.getResource(tradesMMuri, true).getContents().get(0);

		this.controlDelf = (EClass) tradesEPackage.getEClassifier("IControlDefinition");
		this.catalogDelf = (EClass) tradesEPackage.getEClassifier("ICatalogDefinition");

		this.uuidDataType = (EDataType) rootEPackage.getEClassifiers().stream()
				.filter(hasInstanceClass(UUID.class.getName())).findFirst().get();
		this.markupMultilineType = (EDataType) rootEPackage.getEClassifiers().stream()
				.filter(hasInstanceClass(MarkupMultiline.class.getName())).findFirst().get();
		this.uriType = (EDataType) rootEPackage.getEClassifiers().stream().filter(hasInstanceClass(URI.class.getName()))
				.findFirst().get();
	}

	@Override
	public void refactorSemantic(Collection<EClass> eClasses) {
		this.eClasses = eClasses;

		System.out.println("* Starting semantic refactoring");

		// Make all EClass inherits from OSCAlElements
		EClass oscalElement = EcoreFactory.eINSTANCE.createEClass();
		oscalElement.setName("OscalElement");
		oscalElement.setAbstract(true);
		EOperation resolveOperation = createResolveOperation();
		oscalElement.getEOperations().add(resolveOperation);
		rootEPackage.getEClassifiers().add(oscalElement);

		for (EClass eClass : eClasses) {
			eClass.getESuperTypes().add(oscalElement);
		}

		createUUIDElements();
		EClass paramOwner = createAbstractOwnerClass(getEClass("Parameter"), "params", true);
		EOperation getParamOperation = createGetParameterOperation();
		paramOwner.getEOperations().add(getParamOperation);

		createAbstractOwnerClass(getEClass("Property"), "props", true);
		createAbstractOwnerClass(getEClass("Link"), "links", true);
		createAbstractOwnerClass(getEClass("Control"), "controls", false);

		// Create documentation owner
		EClass docComputer = createEClass("DocumentationComputer");
		docComputer.setInterface(true);
		docComputer.setAbstract(true);
		docComputer.getEOperations()
				.add(createOperation("computeDocumentation", EcorePackage.eINSTANCE.getEString(), false));

		EClass partOwner = createAbstractOwnerClass(getEClass("Part"), "parts", false);
		partOwner.getESuperTypes().add(docComputer);

		getEClass("Part").getESuperTypes().add(docComputer);
		getEClass("Control").getESuperTypes().add(controlDelf);
		getEClass("Catalog").getESuperTypes().add(catalogDelf);

		createElementWith(markupMultilineType, "remarks", false);
		createElementWith(EcorePackage.eINSTANCE.getEString(), "value", false);
		createElementWith(EcorePackage.eINSTANCE.getEString(), "clazz", false);
		createElementWith(EcorePackage.eINSTANCE.getEString(), "id", false);

		Map<FeatureBucket, List<EStructuralFeature>> features = eClasses.stream()
				.flatMap(e -> e.getEStructuralFeatures().stream()).collect(groupingBy(f -> FeatureBucket.create(f)));

		for (List<EStructuralFeature> commonFeatures : features.values()) {
			if (commonFeatures.size() > 2) {
				EClass eClass = EcoreFactory.eINSTANCE.createEClass();
				eClass.setInterface(true);
				EStructuralFeature feature = commonFeatures.get(0);
				eClass.setName(toEClassName(feature));

				EStructuralFeature f = commonFeatures.get(0);
				System.out.println(f.getName() + "[" + f.getLowerBound() + "-" + f.getUpperBound() + "]" + " - "
						+ commonFeatures.size() + " : " + feature.getEType().getName());
			}
		}
	}

	public EOperation createGetParameterOperation() {
		EOperation getParamOperation = createOperation("getParameterValues", null, false);

		EGenericType mapType = EcoreFactory.eINSTANCE.createEGenericType();
		mapType.setEClassifier(EcorePackage.eINSTANCE.getEMap());

		EGenericType key = EcoreFactory.eINSTANCE.createEGenericType();
		key.setEClassifier(EcorePackage.eINSTANCE.getEString());
		mapType.getETypeArguments().add(key);

		EGenericType value = EcoreFactory.eINSTANCE.createEGenericType();
		value.setEClassifier(EcorePackage.eINSTANCE.getEString());
		mapType.getETypeArguments().add(value);

		getParamOperation.setEGenericType(mapType);
		return getParamOperation;
	}

	private EOperation createResolveOperation() {
		EOperation resolveOperation = createOperation("resolve", EcorePackage.eINSTANCE.getEObject(), false);
		EParameter param = EcoreFactory.eINSTANCE.createEParameter();
		param.setName("uri");
		param.setEType(uriType);
		resolveOperation.getEParameters().add(param);
		return resolveOperation;
	}

	private EOperation createOperation(String name, EClassifier type, boolean many) {
		EOperation resolveOperation = EcoreFactory.eINSTANCE.createEOperation();
		resolveOperation.setName(name);
		resolveOperation.setEType(type);
		if (many) {
			resolveOperation.setUpperBound(-1);
		} else {

			resolveOperation.setLowerBound(0);
			resolveOperation.setUpperBound(1);
		}
		return resolveOperation;
	}

	private EClass createAbstractOwnerClass(EClass targetType, String refName, boolean hideChildrenInTree) {
		Predicate<EStructuralFeature> refPredicate = isContainmentTyped(targetType.getName()).and(isMany())
				.and(hasName(refName));
		List<EClass> elementOwningAnnotations = eClasses.stream()
				.filter(e -> e.getEStructuralFeatures().stream().filter(refPredicate).count() == 1).collect(toList());
		if (!elementOwningAnnotations.isEmpty()) {
			EClass newClass = createAbstractOwnerEClass(targetType, refName, hideChildrenInTree);
			for (EClass e : elementOwningAnnotations) {
				e.getEStructuralFeatures()
						.remove(e.getEStructuralFeatures().stream().filter(refPredicate).findFirst().get());
				e.getESuperTypes().add(newClass);
			}
			return newClass;
		}
		return null;

	}

	private EClass createElementWith(EDataType targetType, String refName, boolean many) {
		Predicate<EStructuralFeature> refPredicate = buildAttributeFilter(targetType, refName, many);
		List<EClass> elementOwningAnnotations = eClasses.stream()
				.filter(e -> e.getEStructuralFeatures().stream().filter(refPredicate).count() == 1).collect(toList());
		if (!elementOwningAnnotations.isEmpty()) {
			EClass newClass = createElementWithEClass(targetType, refName, many);
			for (EClass e : elementOwningAnnotations) {
				e.getEStructuralFeatures()
						.remove(e.getEStructuralFeatures().stream().filter(refPredicate).findFirst().get());
				e.getESuperTypes().add(newClass);
			}
			return newClass;
		}
		return null;

	}

	public Predicate<EStructuralFeature> buildAttributeFilter(EDataType targetType, String refName, boolean many) {
		Predicate<EStructuralFeature> refPredicate = isAttributeTyped(targetType).and(hasName(refName));
		if (many) {
			refPredicate = refPredicate.and(isMany());
		} else {
			refPredicate = refPredicate.and(isMany().negate());

		}
		return refPredicate;
	}

	private void createUUIDElements() {
		List<EClass> elementWithUniqueId = eClasses.stream()
				.filter(e -> e.getEStructuralFeatures().stream().filter(UUID_ATTR).count() == 1).collect(toList());
		if (!elementWithUniqueId.isEmpty()) {
			EClass withIdEclass = createUUIDElementEClass();
			for (EClass e : elementWithUniqueId) {
				e.getEStructuralFeatures()
						.remove(e.getEStructuralFeatures().stream().filter(UUID_ATTR).findFirst().get());
				e.getESuperTypes().add(withIdEclass);
			}
		}
	}

	private EClass createUUIDElementEClass() {
		EClass withIdEclass = createEClass("UUIDElement");
		EAttribute idAttribute = createAttribute(withIdEclass, "uuid", uuidDataType);
		idAttribute.setID(true);
		idAttribute.setLowerBound(1);
		idAttribute.setUpperBound(1);
		MigrationEcoreUtils.setDocumentation(idAttribute, "Unique UUID identifying this element");
		return withIdEclass;
	}

	private EClass createAbstractOwnerEClass(EClass targetType, String refName, boolean hideChildrenInTree) {
		EClass annotOwner = createEClass(targetType.getName() + "Owner");
		EReference ref = createManyContainmentRef(annotOwner, refName, targetType);
		if (hideChildrenInTree) {
			hiddenContainementReferences.add(ref);
		}
		return annotOwner;
	}

	private EClass createElementWithEClass(EDataType targetType, String featureName, boolean many) {
		EClass annotOwner = createEClass(
				"ElementWith" + NameHelper.getProperEClassName(featureName) + (many ? "s" : ""));
		EAttribute feature = createAttribute(annotOwner, featureName, targetType);
		if (many) {
			feature.setUpperBound(-1);
		}
		return annotOwner;
	}

	private EClass getEClass(String name) {
		return eClasses.stream().filter(EClassifierMatchers.hasName(name)).findFirst().get();
	}

	private EReference createManyContainmentRef(EClass owner, String name, EClass type) {
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		owner.getEStructuralFeatures().add(ref);
		ref.setName(name);
		ref.setEType(type);
		ref.setContainment(true);
		ref.setUpperBound(-1);
		return ref;
	}

	private EAttribute createAttribute(EClass withIdEclass, String name, EClassifier type) {
		EAttribute idAttribute = EcoreFactory.eINSTANCE.createEAttribute();
		withIdEclass.getEStructuralFeatures().add(idAttribute);
		idAttribute.setName(name);
		idAttribute.setEType(type);
		return idAttribute;
	}

	private EClass createEClass(String name) {
		EClass withIdEclass = EcoreFactory.eINSTANCE.createEClass();
		withIdEclass.setName(name);
		rootEPackage.getEClassifiers().add(withIdEclass);

		return withIdEclass;
	}

	private String toEClassName(EStructuralFeature feature) {
		return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, feature.getName()) + "Owner";
	}

	@Override
	public void refactorGenModel(GenModel genModel) {
		this.genModel = genModel;
		genModel.getForeignModel().add("../../dsm.TRADES/model/TRADES.ecore");
		genModel.getUsedGenPackages()
				.add(((GenModel) rs.getResource(tradesGEnMMuri, true).getContents().get(0)).getGenPackages().get(0));

	}

	@Override
	public void refactorGenClasses(List<GenClass> genClasses) {

		for (GenPackage genPackage : genModel.getGenPackages()) {
			genPackage.setFileExtensions("oscal");
		}

		this.genClasses = genClasses;
		for (EReference ref : hiddenContainementReferences) {
			getGenFeaure(ref).setChildren(false);
		}
	}

	private GenFeature getGenFeaure(EReference ref) {
		return genClasses.stream().flatMap(g -> g.getGenFeatures().stream()).filter(gf -> gf.getEcoreFeature() == ref)
				.findFirst().get();
	}

}
