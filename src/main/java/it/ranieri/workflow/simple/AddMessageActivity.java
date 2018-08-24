package it.ranieri.workflow.simple;

import it.ranieri.workflow.model.AbstractActivity;

public class AddMessageActivity extends AbstractActivity<SimpleContext>{
	
	@Override
	public SimpleContext execute(SimpleContext context) throws Exception {
		context.getMessages().add("A");
		return context;
	}
}
