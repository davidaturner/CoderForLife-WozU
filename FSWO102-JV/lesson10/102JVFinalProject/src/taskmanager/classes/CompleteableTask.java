package taskmanager.classes;

import taskmanager.interfaces.IsCompleteable;

public class CompleteableTask extends SimpleTask implements IsCompleteable {

	private boolean completed;

	@Override
	public void complete() {
		this.completed = true;
		
	}

	@Override
	public boolean isCompleted() {
		return this.completed;
	}

}
