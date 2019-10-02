package org.davidaturner.classes;

import org.davidaturner.interfaces.ITask;

public class SimpleTask implements ITask {

	protected int id;
	protected String description;
	protected boolean isMarkComplete;
	
	public SimpleTask(int id, String description) {
		this(id, description, false);
	}
	public SimpleTask(int id, String description, boolean isMarkComplete) {
		this.id = id;
		this.description = description;
		this.isMarkComplete = isMarkComplete;
	}
	
	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return id + ". " + description + " " + 
					((isMarkComplete)?"(Complete)":"");
	}
	
	@Override
	public void markComplete() {
		isMarkComplete = true;	
	}
	
	
	public static void main(String[] args) {
		
		SimpleTask task1 = new SimpleTask(1, "Add a Task");
		SimpleTask task2 = new SimpleTask(2, "Remove a Task");
		SimpleTask task3 = new SimpleTask(3, "Mark a Task Complete", true);
		SimpleTask task4 = new SimpleTask(4, "List the Tasks");
		
		System.out.println(task1.toString());
		System.out.println(task2.toString());
		System.out.println(task3.toString());
		System.out.println(task4.toString());

	}




}
