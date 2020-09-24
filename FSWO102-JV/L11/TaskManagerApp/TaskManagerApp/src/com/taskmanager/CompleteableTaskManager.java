package com.taskmanager;

import com.taskmanager.factories.CompleteableTaskFactory;
import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.interfaces.TaskableManager;
import com.taskmanager.models.CompleteableTask;

public class CompleteableTaskManager extends TaskableManager {

	private CompleteableTaskFactory factory = new CompleteableTaskFactory();

	public ITaskable add(String description) {
		CompleteableTask taskToBeAdded = (CompleteableTask)factory
											.create(0, description, false);
		return add(taskToBeAdded);
	}	
	public ITaskable markComplete(int toBeMarked) {
		ITaskable taskToBeUpdated = find(toBeMarked);
		if (taskToBeUpdated != null) {
			((CompleteableTask)taskToBeUpdated).setComplete(true);
			return update(taskToBeUpdated);
		}	
		return null;
	}
	
	public static void main(String[] args) {
		
		CompleteableTaskManager manager = new CompleteableTaskManager();
		manager.add("Wash my face");
		manager.add("Brush my teeth");
		manager.add("Put on a suit");
		manager.add("Eat breakfast");
//		manager.add("Drive my car");

		manager.setPerPage(1);
		
		display(manager.list("t"));
		System.out.println();

		manager.setPerPage(0);
		
		display(manager.list("f"));
		System.out.println();

		display(manager.list(null));
		System.out.println();
		
		display(manager.list("b"));
		
	}
	
	private static void display(ITaskable[]listing) {
		if (listing != null && listing.length>0) {
			for(int i=0; i<listing.length; i++) {
				if (listing[i] != null) {
					System.out.println(listing[i]);					
				}
				else {
					System.out.println("Error: Empty list!");
				}
			}			
		} else {
			System.out.println("No listing to display");
		}
	}
	
	private static void runTest01() {
		
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
	
	private static void runTest02() {
		CompleteableTaskManager manager = new CompleteableTaskManager();
		manager.add("Wash my face");
		manager.add("Brush my teeth");
		manager.add("Put on a suit");
		manager.add("Eat breakfast");
		manager.add("Drive my car");
		
		display(manager.list());
		System.out.println();
		
		manager.setPerPage(2);
		
		display(manager.list("t"));
		System.out.println();
		
		display(manager.list("f"));
		System.out.println();

		display(manager.list("f"));
		System.out.println();
		
		display(manager.list("f"));
		System.out.println();
		
		display(manager.list("b"));
		System.out.println();
		
		display(manager.list("f"));
		System.out.println();
		
		display(manager.list("b"));
		System.out.println();
		
	}
	
	private static void RunTest03() {
		
		CompleteableTaskManager manager = new CompleteableTaskManager();
		manager.add("Wash my face");
		manager.add("Brush my teeth");
		manager.add("Put on a suit");
		manager.add("Eat breakfast");
//		manager.add("Drive my car");

		manager.setPerPage(1);
		
		display(manager.list("t"));
		System.out.println();

		manager.setPerPage(0);
		
		display(manager.list("f"));
		System.out.println();

		display(manager.list(null));
		System.out.println();
		
		display(manager.list("b"));
	}
}
