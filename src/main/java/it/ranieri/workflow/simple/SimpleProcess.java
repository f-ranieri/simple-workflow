package it.ranieri.workflow.simple;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import it.ranieri.workflow.model.Activity;
import it.ranieri.workflow.model.Process;
import it.ranieri.workflow.model.ProcessContext;

public class SimpleProcess implements Process{
	
	private List<Activity> activities;
	
	public SimpleProcess() {
		activities = new LinkedList<>();
	}

	@Override
	public Iterator<Activity> iterator() {
		return getActivities().iterator();
	}

	@Override
	public boolean isEnded(ProcessContext context) {
		return ((SimpleContext)context).getMessages().size()>=3;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

}