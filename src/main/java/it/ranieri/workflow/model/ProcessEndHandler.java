package it.ranieri.workflow.model;

public interface ProcessEndHandler<C extends ProcessContext> {

	public void handleProcessEnd(C context, Process<C> process);

}
