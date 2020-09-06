package com.taskmanager.classes;

import com.taskmanager.interfaces.ITaskable;

public class SimpleTask implements ITaskable {

	protected int id;
	protected String description;
	
	@Override
	public String toString() {
		return id + ". " + description + ".";
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
		
	}

	public static void main(String[] args) {
		int id=1;
		String description = "Add a task";
		
		SimpleTask task = new SimpleTask();
		task.setId(1);
		task.setDescription(description);
		System.out.println(task.toString());

	}


}
