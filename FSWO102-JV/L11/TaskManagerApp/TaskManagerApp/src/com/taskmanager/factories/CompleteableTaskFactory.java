package com.taskmanager.factories;

import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.interfaces.TaskableFactory;
import com.taskmanager.models.CompleteableTask;

public class CompleteableTaskFactory extends TaskableFactory {

	@Override
	public ITaskable create() {
		return create(COMPLETEABLE);
	}

	@Override
	public ITaskable[] createAll(int toCreate) {
		// TODO Auto-generated method stub
		return createAll(COMPLETEABLE, toCreate);
	}
 
	// Additional methods
	public ITaskable create(int id, String description, boolean complete) {
		CompleteableTask task = new CompleteableTask();
		task.setId(id);
		task.setDescription(description);
		task.setComplete(complete);
		return task;
	}
	
	public static void main(String[] args) {
		CompleteableTaskFactory factory = new CompleteableTaskFactory();
		CompleteableTask task1 = (CompleteableTask)factory.create(COMPLETEABLE);
		task1.setId(1);
		task1.setDescription("Wash my face");
		task1.setComplete(true);	
		System.out.println(task1.toString());
		
		CompleteableTask task2 = (CompleteableTask)factory.create(2, "Brush my teeth", true);
		System.out.println(task2.toString());
		
		ITaskable[] tasks = factory.createAll(2);
		CompleteableTask task3 = (CompleteableTask)tasks[0];
		task3.setId(3);
		task3.setDescription("Put on a suit");
		task3.setComplete(false);
		System.out.println(tasks[0].toString());
		
		CompleteableTask task4 = (CompleteableTask)tasks[1];
		task4.setId(4);
		task4.setDescription("Eat breakfast");
		task4.setComplete(false);
		System.out.println(tasks[1].toString());
		

	}


}
