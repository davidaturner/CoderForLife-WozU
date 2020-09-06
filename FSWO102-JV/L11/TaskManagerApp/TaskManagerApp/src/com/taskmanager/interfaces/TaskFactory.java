package com.taskmanager.interfaces;

import com.taskmanager.classes.CompleteableTask;
import com.taskmanager.classes.SimpleTask;

public abstract class TaskFactory implements ITaskFactory {

	public static final String SIMPLE = "Simple";
	public static final String COMPLETEABLE = "Completeable";
	
	@Override
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
	
	@Override
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
