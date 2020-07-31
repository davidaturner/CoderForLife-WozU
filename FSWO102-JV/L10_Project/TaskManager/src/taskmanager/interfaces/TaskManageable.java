package taskmanager.interfaces;

public interface TaskManageable {
	
	Taskable[] getListing(String prompt);
	
	void addToListing(String description);
	void removeFromListing(int taskid);
	
	void updateListing(int taskid, Taskable task);
	
	public TaskableFactory getTaskFactory();

}
