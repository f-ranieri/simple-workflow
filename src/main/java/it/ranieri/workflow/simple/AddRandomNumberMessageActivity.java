package it.ranieri.workflow.simple;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import it.ranieri.workflow.model.AbstractActivity;
import it.ranieri.workflow.model.Process;
import it.ranieri.workflow.model.ProcessEndHandler;

public class AddRandomNumberMessageActivity extends AbstractActivity<SimpleContext, SimpleProcess> {
	
	private static Logger logger = Logger.getLogger(AddRandomNumberMessageActivity.class.getName());

	@Override
	public SimpleContext execute(SimpleContext context) throws Exception {
		Random rn = new Random();
		int answer = rn.nextInt(26);

		context.getMessages().add("" + answer);
		return context;
	}
	
	@Override
	public boolean terminateProcess(SimpleContext context, Process<SimpleContext> process) {
		List<String> messages = context.getMessages();
		return "13".equals(messages.get(messages.size()-1));
	}

	@Override
	public ProcessEndHandler<SimpleContext> getProcessEndHandler() {
		return new ProcessEndHandler<SimpleContext>() {

			@Override
			public void handleProcessEnd(SimpleContext context, Process<SimpleContext> process) {
				logger.info("Process terminated by lucky number terminator!");
			}
		};
	}
	
}
