package it.ranieri.workflow.model;

import java.util.logging.Logger;

public class DefaultProcessExecutor<C extends ProcessContext,P extends Process<C>> implements ProcessExecutor<C,P> {

	private static Logger logger = Logger.getLogger(DefaultProcessExecutor.class.getName());

	private ProcessEndHandler<C> defaultProcessEndHandler = new ProcessEndHandler<C>() {
		
		@Override
		public void handleProcessEnd(C context, Process<C> process) {
			logger.info("Process terminated!");
			
		}
	};

	@Override
	public void execute(C context, P process) throws Exception {

		for (Activity<C> activity : process) {

			logger.info(String.format("Executing activity %s:", activity));

			context =  activity.execute(context);

			logger.info(String.format("Activity %s terminated.", activity));

			if (process.isEnded(context)) {

				ProcessEndHandler<C> endHandler = activity.getProcessEndHandler();

				if (endHandler == null)
					endHandler = getDefaultProcessEndHandler();

				endHandler.handleProcessEnd(context, process);

				break;
			}

		}

	}

	@Override
	public ProcessEndHandler<C> getDefaultProcessEndHandler() {
		return defaultProcessEndHandler;
	}

	@Override
	public void setDefaultProcessEndHandler(ProcessEndHandler<C> defaultProcessEndHandler) {
		this.defaultProcessEndHandler = defaultProcessEndHandler;
	}

}
