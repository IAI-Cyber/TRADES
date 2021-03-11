/******************************************************************************************************
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
*******************************************************************************************************/
package dsm.trades.m2doc;

import java.util.List;

import org.eclipse.emf.common.util.URI;

public interface IM2DocTemplateRegistry {

	List<IM2DocTemplate> getTemplates();

	IM2DocTemplateRegistry addTemplate(URI template, String name);

	IM2DocTemplateRegistry removeTemplate(URI template);

}
