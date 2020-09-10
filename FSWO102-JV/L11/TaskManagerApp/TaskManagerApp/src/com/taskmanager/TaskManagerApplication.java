package com.taskmanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.taskmanager.controllers.TaskManagerController;
import com.taskmanager.views.TaskManagerConsole;

public class TaskManagerApplication {

	private TaskManagerController controller;
	
	public static final int ADD_TASK = 1;
	public static final int REMOVE_TASK = 2;
	public static final int MARK_TASK = 3;
	public static final int LIST_TASKS = 4;
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public void initialize() {
		controller = new TaskManagerController();
		controller.setManager( new CompleteableTaskManager());
		controller.setView(new TaskManagerConsole());		
	}
	
	public void run() {
		
		System.out.println("Welcome to Things-To-Do Task Manager.");		
		
//		boolean isDone = false;
		boolean isDone = true;
		
		int choice = 0;
		while(!isDone) {
			
			choice = getChoice();
			switch(choice) {
			case ADD_TASK:
				gotoAddTaskPage();
				break;
			case REMOVE_TASK:
				gotoRemoveTaskPage();
				break;
			case MARK_TASK:
				gotoMarkTaskPage();
				break;
			case LIST_TASKS:
				gotoListTasksPage();
				break;
			default:
				isDone = true;
				break;
			}
			
			if (!isDone) {
				mainpage();
			}
		}
		
		displayrn("Quitting application...");
		displayrn("...Done!");
		
	}

	public static void main(String[] args) {
		TaskManagerApplication app = new TaskManagerApplication();
		app.run();
	}
	
	
	// Support
	public static void display(String message) {
		System.out.println(message);
	}
	public static void displayrn(String message) {
		System.out.println("\r\n" + message);
	}
	private void mainpage() {
		displayrn("Showing main page...");
	}
	
	private void gotoAddTaskPage() {
		displayrn("Adding a task...");		
	}
	
	private void gotoRemoveTaskPage() {
		displayrn("Removing a task...");
	}
	
	private void gotoMarkTaskPage() {
		displayrn("Mark a task complete...");
	}
	
	private void gotoListTasksPage() {
		displayrn("List all tasks...");
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
	
	private static void displayPage(String[] page) {
		for(int i=1; i<page.length;i++) {
			System.out.println(page[i]);
		}
		displayrn(page[0]);
	}


}
