package project;

import java.util.ArrayList;
import java.util.List;

public class TaskItem extends PageItem {

	boolean isComplete;
	
	// Constructors
	public TaskItem(String description) {
		this(description, false);
	}
	public TaskItem(String description, boolean isComplete) {
		super(description);
		this.isComplete = isComplete;
	}
	
	// Getters and Setters.
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	
	public static void main(String[] args) {
		
		TaskItem.Test01();

	}
	
	private static List<IPageItem> Test01 () {
		
		List<IPageItem>tasks = new ArrayList<>();
		
		tasks.add(new TaskItem("Get cleaned up", true));
		tasks.add(new TaskItem("Have breakfast", true));
		tasks.add(new TaskItem("Drive to work", false));
		tasks.add(new TaskItem("Check email from business account", false));
		tasks.add(new TaskItem("Go to morning meeting", false));
		tasks.add(new TaskItem("Work on Javascript bugs", false));
		
		for(int i=0; i<tasks.size(); i++) {
			TaskItem item = (TaskItem)tasks.get(i);
			System.out.println((i+1) + ". " + item.getItemDescription() + 
					((item.isComplete())?" (COMPLETED)"
							: ""));
		}
		
		
		return tasks;
	}

}
