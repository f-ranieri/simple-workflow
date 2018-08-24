package it.ranieri.workflow.simple;

import java.util.List;

import it.ranieri.workflow.model.AbstractActivity;
import it.ranieri.workflow.model.Process;

public class AddTextMessageActivity extends AbstractActivity<SimpleContext,SimpleProcess>{
		
	private String message;
	
	public AddTextMessageActivity(String message) {
		this.message=message;
	}
	
	@Override
	public SimpleContext execute(SimpleContext context) throws Exception {
		context.getMessages().add(message);
		return context;
	}

	@Override
	public boolean terminateProcess(SimpleContext context, Process<SimpleContext> process) {
		List<String> messages = context.getMessages();
		return "End".equals(messages.get(messages.size()-1));
	}

}
