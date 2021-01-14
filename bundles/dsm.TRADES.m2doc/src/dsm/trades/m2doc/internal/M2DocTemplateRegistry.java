package dsm.trades.m2doc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.obeonetwork.m2doc.properties.TemplateCustomProperties;

import dsm.TRADES.TRADESPackage;
import dsm.trades.m2doc.Activator;
import dsm.trades.m2doc.IM2DocTemplate;
import dsm.trades.m2doc.IM2DocTemplateRegistry;

/**
 * Registry used to keep tracks of all available {@link IM2DocTemplate}
 * 
 * @author Arthur Daussy
 *
 */
public class M2DocTemplateRegistry implements IM2DocTemplateRegistry {

	private static final String TRADES_PKG_PREFIX = "TRADES::";
	private List<IM2DocTemplate> templates = new ArrayList<IM2DocTemplate>();

	@Override
	public List<IM2DocTemplate> getTemplates() {
		return templates;
	}

	@Override
	public IM2DocTemplateRegistry addTemplate(URI newTemplate, String name) {

		try (InputStream input = new ExtensibleURIConverterImpl().createInputStream(newTemplate)) {
			OPCPackage pkg = OPCPackage.open(input);
			try (XWPFDocument res = new XWPFDocument(pkg)) {
				final TemplateCustomProperties customProperties = new TemplateCustomProperties(res);
				String selfType = customProperties.getVariables().get(IM2DocTemplate.SELF_VAR);
				if (selfType == null) {
					Activator.logError("Unkown type of self for the template" + newTemplate);
					return this;
				}

				EClassifier selfTypeEClass = TRADESPackage.eINSTANCE
						.getEClassifier(selfType.replace(TRADES_PKG_PREFIX, ""));
				if (!(selfTypeEClass instanceof EClass)) {
					Activator.logError("Unkown type of self for the template" + newTemplate);
					return this;
				}

				EClass self = (EClass) selfTypeEClass;

				GenerationTemplate gen = new GenerationTemplate(name, newTemplate, self);
				templates.add(gen);
				return this;
			}

		} catch (RuntimeException | IOException | InvalidFormatException e2) {
			Activator.logError("Error while reading template " + newTemplate, e2);
		}
		return this;
	}

	@Override
	public IM2DocTemplateRegistry removeTemplate(URI toRemove) {
		List<IM2DocTemplate> toRemoves = templates.stream()
				.filter(f -> f.getTemplateURI() != null && f.getTemplateURI().equals(toRemove))
				.collect(Collectors.toList());
		templates.removeAll(toRemoves);
		return this;
	}

}
