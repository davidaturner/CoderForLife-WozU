package todolist.classes.tasks;

import todolist.interfaces.ITaskable;

public class SimpleTask implements ITaskable {

	protected int id;
	protected String description;
	
	public SimpleTask() {
	}
	
	public SimpleTask(int id, String description)	
	{
		this.id = id;
		this.description = description;
	}
	
//	@Override
//	public void onInit(int id, String description)
//	{
//		this.id = id;
//		this.description = description;
//	}
	
	@Override
	public String toString() {
		return id + ". " + description;
	}

	public static void main(String[] args) {

		int myid = 1;
		String mydescription = "Wash my face";
		
		SimpleTask task = new SimpleTask();
		task.setId(myid);
		task.setDescription(mydescription);
		
		System.out.println(task.getId());
		System.out.println(task.getDescription());
		System.out.println(task.toString());
		
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
