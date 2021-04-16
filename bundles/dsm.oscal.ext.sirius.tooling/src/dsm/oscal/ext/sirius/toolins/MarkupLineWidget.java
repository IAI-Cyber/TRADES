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

package dsm.oscal.ext.sirius.toolins;

import java.text.MessageFormat;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.api.DefaultWidgetDescription;
import org.eclipse.sirius.editor.properties.api.IDefaultWidgetDescriptionFactory;
import org.eclipse.sirius.editor.properties.internal.Messages;
import org.eclipse.sirius.properties.PropertiesFactory;
import org.eclipse.sirius.properties.TextDescription;
import org.eclipse.sirius.properties.TextWidgetConditionalStyle;
import org.eclipse.sirius.properties.TextWidgetStyle;
import org.eclipse.sirius.viewpoint.FontFormat;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.sirius.viewpoint.description.tool.ToolFactory;

import gov.nist.secauto.metaschema.datatypes.markup.MarkupLine;

import static dsm.oscal.ext.matchers.FeatureMatchers.*;
public class MarkupLineWidget implements IDefaultWidgetDescriptionFactory {
	
	private static Predicate<EStructuralFeature> MARKUP_LINE_PRED = isUnique().and(isAttributeTyped(MarkupLine.class.getName()));

	public MarkupLineWidget() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(EClass domainClass, EStructuralFeature eStructuralFeature) {
		return MARKUP_LINE_PRED.test(eStructuralFeature);
	}

	public boolean isOscal(EClass domainClass) {
		return domainClass.getEAllSuperTypes().stream().anyMatch(e -> "OscalElement".equals(e.getName()));
	}

	@Override
	public DefaultWidgetDescription create(EClass domainClass, EStructuralFeature eStructuralFeature) {
		
		TextDescription description = PropertiesFactory.eINSTANCE.createTextDescription();

		description.setName(MessageFormat.format(Messages.DefaultMonolineTextDescriptionFactory_widgetLabel,
				domainClass.getEPackage().getName(), domainClass.getName(), eStructuralFeature.getName()));
		description.setIsEnabledExpression(
				"aql:self.eClass().getEStructuralFeature('" + eStructuralFeature.getName() + "').changeable");
		description.setHelpExpression(
				"aql:input.emfEditServices(self).getDescription(self.eClass().getEStructuralFeature('"
						+ eStructuralFeature.getName() + "'))");
		description.setLabelExpression("aql:input.emfEditServices(self).getText(self.eClass().getEStructuralFeature('"
				+ eStructuralFeature.getName() + "')) + ':'");
		description.setValueExpression("aql:self.getMarkupAttribute('" + eStructuralFeature.getName()+"')");

		InitialOperation initialOperation = ToolFactory.eINSTANCE.createInitialOperation();
		ChangeContext changeContext = ToolFactory.eINSTANCE.createChangeContext();
		changeContext.setBrowseExpression("aql:self.setMarkupAttribute('"+eStructuralFeature.getName()+"',newValue)");
		initialOperation.setFirstModelOperations(changeContext);

		description.setInitialOperation(initialOperation);
		if (eStructuralFeature.getLowerBound() == 1) {
			TextWidgetConditionalStyle conditionalStyle = PropertiesFactory.eINSTANCE
					.createTextWidgetConditionalStyle();
			conditionalStyle.setPreconditionExpression(
					"aql:self.eClass().getEStructuralFeature('" + eStructuralFeature.getName() + "').lowerBound = 1");
			TextWidgetStyle widgetStyle = PropertiesFactory.eINSTANCE.createTextWidgetStyle();
			widgetStyle.getLabelFontFormat().add(FontFormat.BOLD_LITERAL);
			conditionalStyle.setStyle(widgetStyle);
			description.getConditionalStyles().add(conditionalStyle);
		}

		String label = MessageFormat.format(Messages.DefaultMonolineTextDescriptionFactory_name,
				eStructuralFeature.eClass().getName(), eStructuralFeature.getName());
		return new DefaultWidgetDescription("[OSCAL] "+eStructuralFeature.eClass().getName()+" - "+eStructuralFeature.getName(), description);
	}

}
