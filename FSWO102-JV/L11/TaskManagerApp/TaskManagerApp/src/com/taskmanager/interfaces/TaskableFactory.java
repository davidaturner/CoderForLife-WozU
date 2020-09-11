package com.taskmanager.interfaces;

import com.taskmanager.models.CompleteableTask;
import com.taskmanager.models.SimpleTask;

public abstract class TaskableFactory {

	public static final String SIMPLE = "Simple";
	public static final String COMPLETEABLE = "Completeable";
	
	public ITaskable create(String type) {
		switch(type) {
		case SIMPLE:
			return new SimpleTask();
		case COMPLETEABLE:
			return new CompleteableTask();
		default:
			System.out.println("Unknown type.");
			return null;
		}
	}
	
	public ITaskable[] createAll(String type, int toCreate) {
		ITaskable[] tasks = new ITaskable[toCreate];
		for(int i=0;i<toCreate;i++) {
			tasks[i] = create(type);
		}
		return tasks;
	}
	
	abstract public ITaskable create();
	abstract public ITaskable[] createAll(int toCreate);
	
}
