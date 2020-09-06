package com.taskmanager.factories;

import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.interfaces.TaskFactory;

public class SimpleTaskFactory extends TaskFactory {

	@Override
	public ITaskable create() {
		return create(SIMPLE);
	}

	@Override
	public ITaskable[] createAll(int toCreate) {
		return createAll(SIMPLE, toCreate);
	}
	
	// Additional methods
	public ITaskable[]create(String[] descriptions) {
		ITaskable[] tasks = createAll(descriptions.length);
		for(int i=0;i<descriptions.length;i++) {
			tasks[i].setId(i+1);
			tasks[i].setDescription(descriptions[i]);
		}
		return tasks;
	}
	
	public static void main(String[] args) {
		SimpleTaskFactory factory = new SimpleTaskFactory();
		
		final String ADD_TASK = "Add a task";
		final String REMOVE_TASK = "Remove a task";
		final String MARK_TASK = "Mark a task";
		final String LIST_TASKS = "List the tasks";
		
		ITaskable task1 = factory.create(TaskFactory.SIMPLE);
		task1.setId(1);
		task1.setDescription(ADD_TASK);
		System.out.println(task1.toString());
		
		ITaskable task2 = factory.create();
		task2.setId(2);
		task2.setDescription(REMOVE_TASK);
		System.out.println(task2.toString());
		
		int toCreate = 2;
		ITaskable[] tasks = factory.createAll(toCreate);
		tasks[0].setId(3);
		tasks[0].setDescription(MARK_TASK);
		System.out.println(tasks[0].toString());
		
		tasks[1].setId(4);
		tasks[1].setDescription(LIST_TASKS);
		System.out.println(tasks[1].toString());
		System.out.println();
		
		String[] DESCRIPTIONS = {
				ADD_TASK,
				REMOVE_TASK,
				MARK_TASK,
				LIST_TASKS
		};
		ITaskable[] mainpage = factory.create(DESCRIPTIONS);
		for(int i=0; i<mainpage.length;i++) {
			System.out.println(mainpage[i]);
		}
		
	}



}
