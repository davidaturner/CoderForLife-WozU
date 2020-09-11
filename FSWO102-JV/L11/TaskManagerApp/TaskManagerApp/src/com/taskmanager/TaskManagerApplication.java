package com.taskmanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.taskmanager.controllers.TaskManagerController;

public class TaskManagerApplication {

	private static TaskManagerController controller;
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public TaskManagerApplication() {
		controller = new TaskManagerController();
		controller.setManager( new CompleteableTaskManager());
		controller.setMainPage();		
	}
	
	public void run() {
		
		System.out.println("Welcome to Things-To-Do Task Manager.");

		boolean isDone = false;		
		int choice = 0;
		while(!isDone) {
			
			mainpage();

			choice = getChoice();
			if (choice == ADD_TASK()) {
				doAdd();
			} else if (choice == REMOVE_TASK()) {
				doRemove();
			} else if (choice == MARK_TASK()) {
				doMark();
			} else if (choice == LIST_TASKS()) {
				doList();
			} else {
				isDone = true;
			}
		}
		
		System.out.println("\r\nQuitting application...");
		System.out.println("\r\n...Done!");
		
	}

	public static void main(String[] args) {
		TaskManagerApplication app = new TaskManagerApplication();
		app.run();
	}
	
	
	// Support
	private void mainpage() {
		displayPage(controller.getMainPage());
	}
	
	private static final int ADD_TASK() {
		return controller.ADD_TASK;
	}
	private static final int REMOVE_TASK() {
		return controller.REMOVE_TASK;
	}
	private static final int MARK_TASK() {
		return controller.MARK_TASK;
	}
	private static final int LIST_TASKS() {
		return controller.LIST_TASKS;
	}

	private void doAdd() {
		displayPage(controller.getTaskPage(ADD_TASK()));
		displayPage(controller.addTask(getInput()));
	}
	
	private void doRemove() {
		displayPage(controller.getTaskPage(REMOVE_TASK()));
		displayPage(controller.removeTask(getChoice()));
	}
	
	private void doMark() {
		displayPage(controller.getTaskPage(MARK_TASK()));
		displayPage(controller.markTask(getChoice()));
	}
	
	private void doList() {
		displayPage(controller.getTaskPage(LIST_TASKS()));
		getInput();
	}
	
	private int getChoice() {
		try {		
			return Integer.parseInt(in.readLine());			
		} catch (Exception e) {
			System.out.println("Unable to get choice");
		}
		return 0;
	}	
	private String getInput() {
		try {
			return in.readLine();
		} catch (Exception e) {
			System.out.println("Unable to get input");
		} 
		return null;
	}
	private void displayPage(String task) {
		controller.displayPage(task);
	}
	private void displayPage(String[] tasks) {
		controller.displayPage(tasks);
	}
//	private static void displayPage(String[]tasks) {
//		System.out.println();
//		for(int i=1;i<tasks.length;i++) {
//			System.out.println(tasks[i]);
//		}
//		System.out.println("\r\n" + tasks[0]);
//	}
}
