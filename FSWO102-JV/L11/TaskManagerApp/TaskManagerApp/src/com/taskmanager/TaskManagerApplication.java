package com.taskmanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.taskmanager.controllers.TaskManagerController;

public class TaskManagerApplication {

	private TaskManagerController controller;
	
	public static final int ADD_TASK = 1;
	public static final int REMOVE_TASK = 2;
	public static final int MARK_TASK = 3;
	public static final int LIST_TASKS = 4;
	
	public static final String MAIN_PROMPT = "What would you like to do (1,2,3,4,5)?";
	
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
	
	private void gotoAddTaskPage() {
		System.out.println("Adding a task...");		
	}
	
	private void gotoRemoveTaskPage() {
		System.out.println("Removing a task...");
	}
	
	private void gotoMarkTaskPage() {
		System.out.println("Mark a task complete...");
	}
	
	private void gotoListTasksPage() {
		System.out.println("List all tasks...");
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
	private static void displayPage(String[]tasks) {
		System.out.println();
		for(int i=1;i<tasks.length;i++) {
			System.out.println(tasks[i]);
		}
		System.out.println("\r\n" + tasks[0]);
	}
}
