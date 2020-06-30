package classes;

import interfaces.Taskable;

public class Task implements Taskable {

	protected int id;
	protected String description;
	protected boolean selected;
	
	public Task(int id, String description) {
		this.id = id;
		this.description = description;
		this.selected = false;
	}

	// Interface
	@Override
	public String print() {
		return this.id + ". " + this.description;
	}

	@Override
	public String printAs(int taskNumber) {
		return taskNumber + ". " + this.description;
	}	
	
	@Override
	public boolean isSelected() {
		return selected;
	}

	@Override
	public void select() {
		this.selected = true;		
	}
	
	@Override
	public void unselect() {
		this.selected = false;		
	}
	
	// Getters and Setters
	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	public static void main(String[] args) {
		
		Task addMain = new Task(1, "Add a task");
		Task removeMain = new Task(2, "Remove a task");
		Task markMain = new Task(3, "Mark Task as complete");
		Task listMain = new Task(4, "List all tasks");
		
		System.out.println(addMain.print());
		System.out.println(removeMain.printAs(2));
		System.out.println(markMain.printAs(3));
		System.out.println(listMain.getId() + ". " + listMain.getDescription());

	}


}
