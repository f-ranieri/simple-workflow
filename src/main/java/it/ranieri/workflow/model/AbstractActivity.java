package it.ranieri.workflow.model;

public abstract class AbstractActivity<C extends ProcessContext, P extends Process<C>> implements Activity<C> {

	private ProcessEndHandler<C> processEndHandler;

	public ProcessEndHandler<C> getProcessEndHandler() {
		return processEndHandler;
	}

	public void setProcessEndHandler(ProcessEndHandler<C> processEndHandler) {
		this.processEndHandler = processEndHandler;
	}

}
