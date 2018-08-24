package it.ranieri.workflow.model;

public interface Activity<C extends ProcessContext> {

	public C execute(C context) throws Exception;
	
	public boolean terminateProcess(C context, Process<C> process);
	
	public ProcessEndHandler<C> getProcessEndHandler();

}
