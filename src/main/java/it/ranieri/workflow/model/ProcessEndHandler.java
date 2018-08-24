package it.ranieri.workflow.model;

public interface ProcessEndHandler {

	public void handleProcessEnd(ProcessContext context, Process process);

}
