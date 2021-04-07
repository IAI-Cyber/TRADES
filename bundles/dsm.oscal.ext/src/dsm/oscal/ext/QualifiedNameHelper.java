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

import gov.nist.secauto.metaschema.model.Metaschema;
import gov.nist.secauto.metaschema.model.definitions.AssemblyDefinition;
import gov.nist.secauto.metaschema.model.definitions.FieldDefinition;
import gov.nist.secauto.metaschema.model.definitions.ObjectDefinition;
import gov.nist.secauto.metaschema.model.instances.FieldInstance;
import gov.nist.secauto.metaschema.model.instances.FlagInstance;

/**
 * Helps to provide unique qualified name
 * 
 * @author Arthur Daussy
 *
 */
public class QualifiedNameHelper {

	public static String getQualifiedName(AssemblyDefinition def) {
		return getQualifiedName(def.getContainingMetaschema()) + "." + "<AssemblyDefinition>" + def.getName();
	}

	public static String getQualifiedName(Metaschema def) {
		return "<Metaschema>" + def.getShortName();
	}

	public static String getQualifiedName(ObjectDefinition def) {
		if (def instanceof AssemblyDefinition) {
			return getQualifiedName((AssemblyDefinition) def);
		} else if (def instanceof FieldDefinition) {
			return getQualifiedName((FieldDefinition) def);
		}
		System.err.println("Invalid QN for object definition " + def);
		return "<ObjectDefinition>" + def.getName();
	}

	public static String getQualifiedName(FieldDefinition inst) {
		return getQualifiedName(inst.getContainingMetaschema()) + "." + "<FieldDefinition>" + inst.getName();

	}

	public static String getQualifiedName(FieldInstance<?> inst) {
		String qn = "";
		AssemblyDefinition assDef = inst.getContainingDefinition();
		if (assDef != null) {
			qn += getQualifiedName(assDef);
		} else {
			qn += getQualifiedName(inst.getContainingMetaschema());
		}
		qn += ".<FieldInstance>" + inst.getName();
		return qn;
	}

	public static String getQualifiedName(FlagInstance<?> inst) {
		String qn = "";
		ObjectDefinition assDef = inst.getContainingDefinition();
		if (assDef != null) {
			qn += getQualifiedName(assDef);
		} else {
			qn += getQualifiedName(inst.getContainingMetaschema());
		}
		qn += ".<FlagInstance>" + inst.getName();
		return qn;
	}

}
