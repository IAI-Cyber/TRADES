package TRADES.design.eef;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * Workaround for bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=574077.
 * 
 * Please remove this class when a new version a Sirius is used with a fix
 * 
 * @author Arthur Daussy
 *
 */
public class EEFLifecycleManagerProvider implements IEEFLifecycleManagerProvider {

	public EEFLifecycleManagerProvider() {
	}

	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		return controlDescription instanceof EEFTextDescription;
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription,
			IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		if (controlDescription instanceof EEFTextDescription) {
			return new CustomEEFTextLifecycleManager((EEFTextDescription) controlDescription, variableManager,
					interpreter, editingContextAdapter);
		}
		return null;
	}

}
