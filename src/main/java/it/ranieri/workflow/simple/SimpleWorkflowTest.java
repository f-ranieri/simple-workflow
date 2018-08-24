package it.ranieri.workflow.simple;

import java.util.logging.Logger;

import it.ranieri.workflow.model.Activity;
import it.ranieri.workflow.model.DefaultProcessExecutor;

public class SimpleWorkflowTest {
	
	private static Logger logger = Logger.getLogger(SimpleWorkflowTest.class.getName());

	public static void main(String[] args) throws Exception {
		
		logger.info("Setting up tasks!");

		Activity<SimpleContext> startMsg = new AddTextMessageActivity("Start");
		Activity<SimpleContext> endMsg = new AddTextMessageActivity("End");
		
		SimpleProcess process = new SimpleProcess();
		process.getActivities().add(startMsg);
		
		for (int i = 0; i < 25; i++) {
			Activity<SimpleContext> activity = new AddRandomNumberMessageActivity();
			process.getActivities().add(activity);
		}
		
		process.getActivities().add(endMsg);
		
		SimpleContext context = new SimpleContext();
		
		logger.info("Set up completed.");
		
		logger.info("starting process!");
		
		logger.info(String.format("before execution messages are: %s",context.getMessages()));
		
		new DefaultProcessExecutor<SimpleContext, SimpleProcess>().execute(context, process);
		
		logger.info(String.format("after execution messages are: %s",context.getMessages()));
		
		logger.info("process ended!");

	}

}
