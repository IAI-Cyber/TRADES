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

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EcoreFactory;

import gov.nist.secauto.metaschema.model.definitions.InfoElementDefinition;

public class MigrationEcoreUtils {

	private static final String GEN_MODEL_ANNOT = "http://www.eclipse.org/emf/2002/GenModel";

	/**
	 * Set the documentation to the given {@link EModelElement} from a
	 * {@link InfoElementDefinition}
	 * 
	 * @param element the element to set documentation on
	 * @param def     the documentation owner
	 */
	public static void setDocumentation(EModelElement element, String doc) {
		EAnnotation anotation = element.getEAnnotation(GEN_MODEL_ANNOT);
		if (anotation == null) {
			anotation = EcoreFactory.eINSTANCE.createEAnnotation();
			anotation.setSource(GEN_MODEL_ANNOT);
			element.getEAnnotations().add(anotation);
		}

		anotation.getDetails().put("documentation", doc);

	}
}
