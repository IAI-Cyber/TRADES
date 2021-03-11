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
package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

import dsm.TRADES.Control;

public class ControlItemProviderCustomImpl extends ControlItemProvider {

	public ControlItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getText(Object object) {
		String label = ((Control) object).getName();;
		return label == null || label.length() == 0 ? getString("_UI_Control_type") : label;
		
	} 

}
