package it.ranieri.workflow.simple;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import it.ranieri.workflow.model.Activity;
import it.ranieri.workflow.model.Process;

public class SimpleProcess implements Process<SimpleContext>{
	
	private List<Activity<SimpleContext>> activities;
	
	public SimpleProcess() {
		setActivities(new LinkedList<>());
	}

	public List<Activity<SimpleContext>> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity<SimpleContext>> activities) {
		this.activities = activities;
	}

	@Override
	public Iterator<Activity<SimpleContext>> iterator() {
		return activities.iterator();
	}

}