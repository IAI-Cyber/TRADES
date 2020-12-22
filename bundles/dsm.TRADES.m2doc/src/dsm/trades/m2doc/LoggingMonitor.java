package dsm.trades.m2doc;

import org.eclipse.emf.common.util.BasicMonitor;

public class LoggingMonitor extends BasicMonitor {

	public void beginTask(String name, int totalWork) {
		log("Begin task : " + name);
	}

	public void setTaskName(String name) {
		log("Task : " + name);
	}

	public void subTask(String name) {
		log("sub task : " + name);
	}

	public void worked(int work) {
		// Do nothing.
	}

	public void internalWorked(double work) {
		// Do nothing.
	}

	public void done() {
		log("Generation done");
	}

	private void log(String message) {
		Activator.logInfo(message);
	}

}
