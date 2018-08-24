package it.ranieri.workflow.model;

public interface Activity<T extends ProcessContext> {

	public T execute(T context) throws Exception;

	public ProcessEndHandler getProcessEndHandler();

}
