package com.taskmanager.factory;

import com.taskmanager.interfaces.ITaskFactory;
import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.objects.CompleteableTask;
import com.taskmanager.objects.SimpleTask;

abstract public class TaskFactory implements ITaskFactory {

	public static final String SIMPLE = "Simple";
	public static final String COMPLETEABLE = "Completeable";
	
	public static final int PROMPT_TASK = 0;
	
	@Override
	public ITaskable create(String type) {
		switch(type) {
		case SIMPLE:
			return (ITaskable) new SimpleTask();
		case COMPLETEABLE:
			return (ITaskable) new CompleteableTask();
		default:
			System.out.println("Unknown type.");
			break;
		}
		return null;
	}

	@Override
	public ITaskable[] create(String type, int numberToCreate) {
		switch(type) {
		case SIMPLE:
			ITaskable[] simple = new SimpleTask[numberToCreate];
			for(int i=0;i<numberToCreate; i++) {
				simple[i] = create(SIMPLE);
			}
			return simple;
		case COMPLETEABLE:
			ITaskable[] completeable = new CompleteableTask[numberToCreate];
			for(int i=0;i<numberToCreate; i++) {
				completeable[i] = create(COMPLETEABLE);
			}
			return completeable;

		default:
			System.out.println("Unknown type.");
			break;
		}
		return null;
	}
	
	abstract public ITaskable create();
	abstract public ITaskable[] create(int numberToCreate);
	
	abstract public ITaskable clone(ITaskable original);

}
