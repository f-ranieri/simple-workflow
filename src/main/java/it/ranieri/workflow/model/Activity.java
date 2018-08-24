package it.ranieri.workflow.model;

public interface Activity<C extends ProcessContext> {

	public C execute(C context) throws Exception;

	public ProcessEndHandler<C> getProcessEndHandler();

}
