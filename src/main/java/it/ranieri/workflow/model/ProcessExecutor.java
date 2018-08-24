package it.ranieri.workflow.model;

public interface ProcessExecutor {

	public void execute(ProcessContext context, Process process) throws Exception;

	public void setDefaultProcessEndHandler(ProcessEndHandler defaulProcessEndHandler);

	public ProcessEndHandler getDefaultProcessEndHandler();

}
