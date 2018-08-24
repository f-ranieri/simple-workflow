package it.ranieri.workflow.model;

public interface ProcessExecutor<C extends ProcessContext, P extends Process<C>> {

	public void execute(C context, P process) throws Exception;

	public void setDefaultProcessEndHandler(ProcessEndHandler<C> defaulProcessEndHandler);

	public ProcessEndHandler<C> getDefaultProcessEndHandler();
}
