package it.ranieri.workflow.model;

public abstract class AbstractActivity<T extends ProcessContext> implements Activity<T> {

	private ProcessEndHandler processEndHandler;

	public ProcessEndHandler getProcessEndHandler() {
		return processEndHandler;
	}

	public void setProcessEndHandler(ProcessEndHandler processEndHandler) {
		this.processEndHandler = processEndHandler;
	}

}
