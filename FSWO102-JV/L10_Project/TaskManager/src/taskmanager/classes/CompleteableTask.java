package taskmanager.classes;

public class CompleteableTask extends SimpleTask {

	public static String TASK_COMPLETED = "TASK COMPLETED";
	
	protected boolean complete;
	protected boolean archived;
	
	protected String timeToComplete;
	protected String full;
	protected SimpleTask[] necessaryItems;
	
	@Override
	public String listing() {
		if (id>0) {
			if (archived == true) {
				return id+ ". " + TASK_COMPLETED+".";
			}
			return id+". "+description+(complete?"(COMPLETE)":"")+".";
		}
		return description;
	}
	
	// Getters and Setters
	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	public String getTimeToComplete() {
		return timeToComplete;
	}

	public void setTimeToComplete(String timeToComplete) {
		this.timeToComplete = timeToComplete;
	}

	public String getFull() {
		return full;
	}

	public void setFull(String full) {
		this.full = full;
	}

	public SimpleTask[] getNecessaryItems() {
		return necessaryItems;
	}

	public void setNecessaryItems(SimpleTask[] necessaryItems) {
		this.necessaryItems = necessaryItems;
	}


	public static void main(String[] args) {
	}
	
	private static void runTest01 () {
		String taskDescription = "Wash my face";
		CompleteableTask task = new CompleteableTask();
		task.setId(1);
		task.setDescription(taskDescription);
		task.setComplete(false);
		task.setArchived(false);
		System.out.println(task.listing());
	}
	private static void runTest02 () {
		String taskDescription = "Wash my face";
		CompleteableTask task = new CompleteableTask();
		task.setId(1);
		task.setDescription(taskDescription);
		task.setComplete(true);
		task.setArchived(false);
		System.out.println(task.listing());
	}

}
