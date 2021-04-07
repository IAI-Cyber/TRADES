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
package dsm.oscal.ext.matchers;

import java.util.function.Predicate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

public class FeatureMatchers {

	public static Predicate<EStructuralFeature> hasName(String name) {
		return f -> name.equals(f.getName());
	}

	public static Predicate<EStructuralFeature> isRequired() {
		return f -> f.getLowerBound() == 1;
	}

	public static Predicate<EStructuralFeature> isUnique() {
		return f -> f.getUpperBound() == 1;
	}

	public static Predicate<EStructuralFeature> isAttributeTyped(String instanceClassName) {
		return f -> f instanceof EAttribute
				&& instanceClassName.equals(((EAttribute) f).getEAttributeType().getInstanceClassName());
	}

}