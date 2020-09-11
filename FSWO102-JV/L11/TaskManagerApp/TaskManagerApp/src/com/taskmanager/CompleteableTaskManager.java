package com.taskmanager;

import com.taskmanager.factories.CompleteableTaskFactory;
import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.interfaces.TaskableManager;
import com.taskmanager.models.CompleteableTask;

public class CompleteableTaskManager extends TaskableManager {

	private CompleteableTaskFactory factory = new CompleteableTaskFactory();

	public void add(String description) {
		CompleteableTask taskToBeAdded = (CompleteableTask)factory
											.create(0, description, false);
		add(taskToBeAdded);
	}	
	public void markComplete(int toBeMarked) {
		ITaskable taskToBeUpdated = find(toBeMarked);
		if (taskToBeUpdated != null) {
			((CompleteableTask)taskToBeUpdated).setComplete(true);
			update(taskToBeUpdated);
		}	
	}
	
	public static void main(String[] args) {
		
		CompleteableTaskManager manager = new CompleteableTaskManager();
		manager.add("Wash my face");
		manager.add("Brush my teeth");
		manager.add("Put on a suit");
		manager.add("Eat breakfast");
		
		display(manager.list());
		
		int taskToBeRemoved = 2;
		manager.remove(taskToBeRemoved);
		
		display(manager.list());
		
		int taskToBeMarked = 1;
		manager.markComplete(taskToBeMarked);
		
		display(manager.list());
	}
	
	private static void display(ITaskable[]listing) {
		for(int i=0; i<listing.length; i++) {
			System.out.println(listing[i]);
		}
		System.out.println();
	}
}
