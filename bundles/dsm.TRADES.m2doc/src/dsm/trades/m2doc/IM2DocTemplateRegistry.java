package dsm.trades.m2doc;

import java.util.List;

import org.eclipse.emf.common.util.URI;

public interface IM2DocTemplateRegistry {

	List<IM2DocTemplate> getTemplates();

	IM2DocTemplateRegistry addTemplate(URI template, String name);

	IM2DocTemplateRegistry removeTemplate(URI template);

}
