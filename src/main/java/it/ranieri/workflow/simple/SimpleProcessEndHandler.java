package it.ranieri.workflow.simple;

import java.util.logging.Logger;

import it.ranieri.workflow.model.Process;
import it.ranieri.workflow.model.ProcessContext;
import it.ranieri.workflow.model.ProcessEndHandler;

public class SimpleProcessEndHandler implements ProcessEndHandler{
	
	private static Logger logger = Logger.getLogger(SimpleProcessEndHandler.class.getName());

	@Override
	public void handleProcessEnd(ProcessContext context, Process process) {
		logger.info("handleProcessEnd");
	}

}
