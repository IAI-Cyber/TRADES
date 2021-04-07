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
import static dsm.oscal.ext.matchers.FeatureMatchers.isAttributeTyped;
import static dsm.oscal.ext.matchers.FeatureMatchers.isContainmentTyped;
import static dsm.oscal.ext.matchers.FeatureMatchers.isMany;
import static dsm.oscal.ext.matchers.FeatureMatchers.isUnique;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import com.google.common.base.CaseFormat;

import dsm.oscal.ext.matchers.EClassifierMatchers;

public class SemanticRefactoring {

	private static final Predicate<EStructuralFeature> UUID_ATTR = isUnique()/*
																				 * Also take non unique and for them to
																				 * be unique it will be easier to use
																				 */
			.and(isAttributeTyped(UUID.class.getName()));
	private static final Predicate<EStructuralFeature> ANNOTATIONS_REF = isContainmentTyped("Annotation").and(isMany());

	private final EPackage rootEPackage;

	private final EDataType uuidDataType;
	private Collection<EClass> eClasses;

	public SemanticRefactoring(EPackage rootEPackage, Collection<EClass> eClasses) {
		super();
		this.rootEPackage = rootEPackage;
		this.eClasses = eClasses;
		this.uuidDataType = (EDataType) rootEPackage.getEClassifiers().stream()
				.filter(hasInstanceClass(UUID.class.getName())).findFirst().get();
	}

	public void refactor() {

		System.out.println("* Starting semantic refactoring");
		createUUIDElements();
		createAnnotationOwner();

		Map<FeatureBucket, List<EStructuralFeature>> features = eClasses.stream()
				.flatMap(e -> e.getEStructuralFeatures().stream()).collect(groupingBy(f -> FeatureBucket.create(f)));

		for (List<EStructuralFeature> commonFeatures : features.values()) {
			if (commonFeatures.size() > 2) {
				EClass eClass = EcoreFactory.eINSTANCE.createEClass();
				eClass.setInterface(true);
				EStructuralFeature feature = commonFeatures.get(0);
				eClass.setName(toEClassName(feature));

				System.out.println(commonFeatures.get(0).getName() + " - " + commonFeatures.size());
			}
		}
	}

	private void createAnnotationOwner() {
		List<EClass> elementOwningAnnotations = eClasses.stream()
				.filter(e -> e.getEStructuralFeatures().stream().filter(ANNOTATIONS_REF).count() == 1)
				.collect(toList());
		if (!elementOwningAnnotations.isEmpty()) {
			EClass annotOwner = createAnnotationOwnerEClass();
			for (EClass e : elementOwningAnnotations) {
				e.getEStructuralFeatures()
						.remove(e.getEStructuralFeatures().stream().filter(ANNOTATIONS_REF).findFirst().get());
				e.getESuperTypes().add(annotOwner);
			}
		}

	}

	public void createUUIDElements() {
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

	public EClass createUUIDElementEClass() {
		EClass withIdEclass = createEClass("UUIDElement");
		EAttribute idAttribute = createAttribute(withIdEclass, "uuid", uuidDataType);
		idAttribute.setID(true);
		idAttribute.setLowerBound(1);
		idAttribute.setUpperBound(1);
		MigrationEcoreUtils.setDocumentation(idAttribute, "Unique UUID identifying this element");
		return withIdEclass;
	}

	public EClass createAnnotationOwnerEClass() {
		EClass annotOwner = createEClass("AnnotationOwner");
		createManyContainmentRef(annotOwner, "annotations",
				eClasses.stream().filter(EClassifierMatchers.hasName("Annotation")).findFirst().get());
		return annotOwner;
	}

	public EReference createManyContainmentRef(EClass owner, String name, EClass type) {
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		owner.getEStructuralFeatures().add(ref);
		ref.setName(name);
		ref.setEType(type);
		ref.setUpperBound(-1);
		return ref;
	}

	public EAttribute createAttribute(EClass withIdEclass, String name, EClassifier type) {
		EAttribute idAttribute = EcoreFactory.eINSTANCE.createEAttribute();
		withIdEclass.getEStructuralFeatures().add(idAttribute);
		idAttribute.setName(name);
		idAttribute.setEType(type);
		return idAttribute;
	}

	public EClass createEClass(String name) {
		EClass withIdEclass = EcoreFactory.eINSTANCE.createEClass();
		withIdEclass.setName(name);
		rootEPackage.getEClassifiers().add(withIdEclass);

		return withIdEclass;
	}

	private String toEClassName(EStructuralFeature feature) {
		return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, feature.getName()) + "Owner";
	}

}
