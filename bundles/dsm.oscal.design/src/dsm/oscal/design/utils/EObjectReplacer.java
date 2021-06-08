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

package dsm.oscal.design.utils;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

/**
 * object that can replace an object with a compliant {@link EObject}. It
 * replaces all incomming reference from soure to target
 * 
 * @author Arthur Daussy
 *
 */
public class EObjectReplacer {

	private final ECrossReferenceAdapter crossRef;

	public EObjectReplacer(ECrossReferenceAdapter crossRef) {
		super();
		this.crossRef = crossRef;
	}

	public void replaceAll(EObject source, EObject target) {
		for (Setting setting : crossRef.getInverseReferences(source)) {

			EStructuralFeature feature = setting.getEStructuralFeature();
			EObject featureSource = setting.getEObject();
			if (feature.isChangeable() && !feature.isDerived()) {
				if (feature.isMany()) {

					@SuppressWarnings("unchecked")
					List<EObject> values = (List<EObject>) featureSource.eGet(feature);
					int index = values.indexOf(source);
					values.remove(index);
					values.add(index, target);
				} else {
					featureSource.eSet(feature, target);
				}
			}
		}
	}

}
