package it.ranieri.workflow.simple;

import java.util.LinkedList;
import java.util.List;

import it.ranieri.workflow.model.ProcessContext;

public class SimpleContext implements ProcessContext {

	private List<String> messages;

	public SimpleContext() {
		messages = new LinkedList<>();
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
}
