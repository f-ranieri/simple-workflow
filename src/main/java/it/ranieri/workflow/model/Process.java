package it.ranieri.workflow.model;

public interface Process extends Iterable<Activity> {

	public boolean isEnded(ProcessContext context);

}
