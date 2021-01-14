package dsm.trades.m2doc;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface IM2DocTemplate {

	static final String SELF_VAR = "self";

	/**
	 * URI to the word template
	 * 
	 * @return a valid {@link URI}
	 */
	URI getTemplateURI();

	/**
	 * User readable name to identify the template
	 * 
	 * @return a String
	 */
	String getTemplateName();

	/**
	 * Gets the type of selection this template react to
	 * 
	 * @return an {@link EClass}
	 */
	EClass getMainType();

	/**
	 * Generates the reports
	 * 
	 * @param selection       the current selection (of the expected type)
	 * @param progressMonitor a {@link IProgressMonitor}
	 * @param open            hold <code>true</code> to open the file on success
	 * @return {@link Status#OK_STATUS} on success another status on error
	 */
	IStatus generate(EObject selection, IProgressMonitor progressMonitor, boolean open);

}
