package dsm.trades.m2doc;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;

public interface IGenerationTemplate {

	URI getTemplateURI();

	String getActionName();

	EClass getMainType();

	void generate(EObject self, Shell shell, boolean open);

}
