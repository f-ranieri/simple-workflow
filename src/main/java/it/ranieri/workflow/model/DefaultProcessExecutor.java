package it.ranieri.workflow.model;

import java.util.logging.Logger;

public class DefaultProcessExecutor implements ProcessExecutor {

	private static Logger logger = Logger.getLogger(DefaultProcessExecutor.class.getName());

	private ProcessEndHandler defaultProcessEndHandler = new ProcessEndHandler() {
		
		@Override
		public void handleProcessEnd(ProcessContext context, Process process) {
			logger.info("Process terminated!");
			
		}
	};

	@Override
	public void execute(ProcessContext context, Process process) throws Exception {

		for (Activity activity : process) {

			logger.info(String.format("Executing activity %s:", activity));

			context = activity.execute(context);

			logger.info(String.format("Activity %s terminated.", activity));

			if (process.isEnded(context)) {

				ProcessEndHandler endHandler = activity.getProcessEndHandler();

				if (endHandler == null)
					endHandler = getDefaultProcessEndHandler();

				endHandler.handleProcessEnd(context, process);

				break;
			}

		}

	}

	@Override
	public ProcessEndHandler getDefaultProcessEndHandler() {
		return defaultProcessEndHandler;
	}

	@Override
	public void setDefaultProcessEndHandler(ProcessEndHandler defaultProcessEndHandler) {
		this.defaultProcessEndHandler = defaultProcessEndHandler;
	}

}
