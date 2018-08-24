package it.ranieri.workflow.simple;

import java.util.Arrays;
import java.util.logging.Logger;

import it.ranieri.workflow.model.DefaultProcessExecutor;

public class SimpleWorkflowTest {
	
	private static Logger logger = Logger.getLogger(SimpleWorkflowTest.class.getName());

	public static void main(String[] args) throws Exception {
		
		logger.info("starting process!");
		
		AddMessageActivity a0 = new AddMessageActivity();
		AddMessageActivity a1 = new AddMessageActivity();
		AddMessageActivity a2 = new AddMessageActivity();
		AddMessageActivity a3 = new AddMessageActivity();
		AddMessageActivity a4 = new AddMessageActivity();
		AddMessageActivity a5 = new AddMessageActivity();
		
		SimpleProcess process = new SimpleProcess();
		
		process.getActivities().addAll(Arrays.asList(a0, a1, a2, a3, a4, a5));
		
		SimpleContext context = new SimpleContext();
		
		logger.info(String.format("before execution messages are: %s",context.getMessages()));
		
		new DefaultProcessExecutor<SimpleContext, SimpleProcess>().execute(context, process);
		
		logger.info(String.format("after execution messages are: %s",context.getMessages()));
		
		logger.info("process ended!");
		

	}

}
