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

import static dsm.oscal.ext.matchers.FeatureMatchers.isAttributeTyped;
import static dsm.oscal.ext.matchers.FeatureMatchers.isRequired;
import static dsm.oscal.ext.matchers.FeatureMatchers.isUnique;
import static dsm.oscal.ext.matchers.DataTypeMatchers.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import com.google.common.base.CaseFormat;

public class SemanticRefactoring {

	private static final Predicate<EStructuralFeature> UUID_ATTR = isRequired().and(isUnique())
			.and(isAttributeTyped(UUID.class.getName()));

	private final EPackage rootEPackage;

	private final EDataType uuidDataType;

	public SemanticRefactoring(EPackage rootEPackage) {
		super();
		this.rootEPackage = rootEPackage;
		this.uuidDataType = (EDataType) rootEPackage.getEClassifiers().stream()
				.filter(hasInstanceClass(UUID.class.getName())).findFirst().get();
	}

	public void refactor(Collection<EClass> eClasses) {

		System.out.println("* Starting semantic refactoring");
		createUUIDElements(eClasses);

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

	public void createUUIDElements(Collection<EClass> eClasses) {
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
		EClass withIdEclass = EcoreFactory.eINSTANCE.createEClass();
		withIdEclass.setName("UUIDElement");
		rootEPackage.getEClassifiers().add(withIdEclass);
		EAttribute idAttribute = EcoreFactory.eINSTANCE.createEAttribute();
		idAttribute.setName("uuid");
		idAttribute.setEType(uuidDataType);
		idAttribute.setID(true);
		idAttribute.setLowerBound(1);
		idAttribute.setUpperBound(1);
		MigrationEcoreUtils.setDocumentation(idAttribute, "Unique UUID identifying this element");
		withIdEclass.getEStructuralFeatures().add(idAttribute);
		return withIdEclass;
	}

	private String toEClassName(EStructuralFeature feature) {
		return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, feature.getName()) + "Owner";
	}

}
