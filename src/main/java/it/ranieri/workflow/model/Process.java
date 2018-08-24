package it.ranieri.workflow.model;

public interface Process<C extends ProcessContext> extends Iterable<Activity<C>> {

	public boolean isEnded(C context);

}
