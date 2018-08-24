package it.ranieri.workflow.simple;

import java.util.logging.Logger;

import it.ranieri.workflow.model.Process;
import it.ranieri.workflow.model.ProcessEndHandler;

public class SimpleProcessEndHandler implements ProcessEndHandler<SimpleContext>{
	
	private static Logger logger = Logger.getLogger(SimpleProcessEndHandler.class.getName());

	@Override
	public void handleProcessEnd(SimpleContext context, Process<SimpleContext> process) {
		logger.info("Handling Process End!");
	}

}
