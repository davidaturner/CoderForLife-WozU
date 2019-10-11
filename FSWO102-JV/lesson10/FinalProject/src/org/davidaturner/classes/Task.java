package org.davidaturner.classes;

import org.davidaturner.interfaces.ITaskable;

public class Task implements ITaskable {

	protected String description;
	
	public Task(String description) {
		this.description = description;
	}
	
	@Override
	public String getDescription() {
		return description;
	}


	@Override
	public void list() {
		System.out.println(description);
		
	}
	
	public static void main(String[] args) {
		ITaskable task = new Task("Wash your clothes");
		task.list();
		System.out.println("1. " + task.getDescription());
	}



}
