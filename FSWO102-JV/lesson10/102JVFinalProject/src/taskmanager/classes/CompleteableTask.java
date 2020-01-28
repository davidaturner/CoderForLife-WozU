package taskmanager.classes;

public class CompleteableTask extends ListableTask {

	boolean completed;
	
	@Override
	public String list() {
		if (isReady() && isCompleted()) {
			return super.list() + " (Completed)";
		}
		return super.list();
	}


	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}


}
