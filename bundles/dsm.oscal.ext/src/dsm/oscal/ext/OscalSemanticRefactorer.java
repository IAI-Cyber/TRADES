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
import static dsm.oscal.ext.matchers.FeatureMatchers.*;
import static dsm.oscal.ext.matchers.FeatureMatchers.isContainmentTyped;
import static dsm.oscal.ext.matchers.FeatureMatchers.isMany;
import static dsm.oscal.ext.matchers.FeatureMatchers.isUnique;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.common.base.CaseFormat;

import dsm.oscal.ext.matchers.EClassifierMatchers;
import gov.nist.secauto.metaschema.datatypes.markup.MarkupMultiline;

public class OscalSemanticRefactorer implements ISemanticRefactorer {

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

	@Override
	public void init(EPackage rootEPackage) {
		this.rootEPackage = rootEPackage;
		this.uuidDataType = (EDataType) rootEPackage.getEClassifiers().stream()
				.filter(hasInstanceClass(UUID.class.getName())).findFirst().get();
		this.markupMultilineType = (EDataType) rootEPackage.getEClassifiers().stream()
				.filter(hasInstanceClass(MarkupMultiline.class.getName())).findFirst().get();
	}

	@Override
	public void refactorSemantic(Collection<EClass> eClasses) {

		this.eClasses = eClasses;
		System.out.println("* Starting semantic refactoring");
		createUUIDElements();
		createAbstractOwnerClass(getEClass("Annotation"), "annotations");
		createAbstractOwnerClass(getEClass("Property"), "props");
		createAbstractOwnerClass(getEClass("Link"), "links");

		createElementWith(markupMultilineType, "remarks", false);
		createElementWith(EcorePackage.eINSTANCE.getEString(), "value", false);
		createElementWith(EcorePackage.eINSTANCE.getEString(), "clazz", false);

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

	private void createAbstractOwnerClass(EClass targetType, String refName) {
		Predicate<EStructuralFeature> refPredicate = isContainmentTyped(targetType.getName()).and(isMany())
				.and(hasName(refName));
		List<EClass> elementOwningAnnotations = eClasses.stream()
				.filter(e -> e.getEStructuralFeatures().stream().filter(refPredicate).count() == 1).collect(toList());
		if (!elementOwningAnnotations.isEmpty()) {
			EClass annotOwner = createAbstractOwnerEClass(targetType, refName);
			for (EClass e : elementOwningAnnotations) {
				e.getEStructuralFeatures()
						.remove(e.getEStructuralFeatures().stream().filter(refPredicate).findFirst().get());
				e.getESuperTypes().add(annotOwner);
			}
		}

	}

	private void createElementWith(EDataType targetType, String refName, boolean many) {
		Predicate<EStructuralFeature> refPredicate = buildAttributeFilter(targetType, refName, many);
		List<EClass> elementOwningAnnotations = eClasses.stream()
				.filter(e -> e.getEStructuralFeatures().stream().filter(refPredicate).count() == 1).collect(toList());
		if (!elementOwningAnnotations.isEmpty()) {
			EClass annotOwner = createElementWithEClass(targetType, refName, many);
			for (EClass e : elementOwningAnnotations) {
				e.getEStructuralFeatures()
						.remove(e.getEStructuralFeatures().stream().filter(refPredicate).findFirst().get());
				e.getESuperTypes().add(annotOwner);
			}
		}

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

	private EClass createAbstractOwnerEClass(EClass targetType, String refName) {
		EClass annotOwner = createEClass(targetType.getName() + "Owner");
		hiddenContainementReferences.add(createManyContainmentRef(annotOwner, refName, targetType));
		return annotOwner;
	}

	private EClass createElementWithEClass(EDataType targetType, String featureName, boolean many) {
		EClass annotOwner = createEClass("ElementWith" + NameHelper.getProperEClassName(featureName) + (many ? "s" : ""));
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
	public void refactorGenModel(List<GenClass> genClasses) {
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
