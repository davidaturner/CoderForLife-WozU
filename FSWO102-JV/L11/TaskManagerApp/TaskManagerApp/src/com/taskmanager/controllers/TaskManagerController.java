package com.taskmanager.controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.taskmanager.CompleteableTaskManager;
import com.taskmanager.factories.SimpleTaskFactory;
import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.interfaces.TaskableManager;

public class TaskManagerController {

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	private TaskableManager manager;	
	private String[] mainPage;
	
	public static final int ADD_TASK = 1;
	public static final int REMOVE_TASK = 2;
	public static final int MARK_TASK = 3;
	public static final int LIST_TASKS = 4;
	
	public static final String[] MAIN_PAGE = {
			"Add a task",
			"Remove a task",
			"Mark a task complete",
			"List all tasks"
	};
	public static final String MAIN_PROMPT = "What would you like to do (1,2,3,4,5)?";
	public static final String ADD_PROMPT = "Enter new task: ";
	public static final String REMOVE_PROMPT = "Which task do you want to remove?";
	public static final String MARK_PROMPT = "Which task do you want to mark complete?";
	public static final String ANY_KEY_PROMPT = "Press ANY key to continue.";
	

	// Controller run()
	public void run() {
		System.out.println("Welcome to Task Manager!");
		
		boolean isDone = false;
		int choice = 0;
		while( !isDone) {
			
			displayPage(getMainPage());
			
			choice = getChoice();
			switch(choice) {
			case ADD_TASK:
				System.out.println("\r\nAdding a task...");
				break;
			case REMOVE_TASK:
				System.out.println("\r\nRemoving a task...");
				break;
			case MARK_TASK:
				System.out.println("\r\nMark a task complete...");
				break;
			case LIST_TASKS:
				System.out.println("\r\nList all tasks...");
				break;
			default:
				isDone = true;
				break;
			}
		}
		
		System.out.println("\r\nQuitting...");
		System.out.println("\r\n...Done!");
	}
	
	// Controller functions/API
	public void setMainPage() {
		setMainPage(page((new SimpleTaskFactory()).createAll(MAIN_PAGE), MAIN_PROMPT));
	}
	
	public String[] getAddPage() {
		return null;
	}
	public String[] getRemovePage() {
		return null;
	}
	public String[] getListPage() {
		return null;
	}
	
	public void addTask(String description) {
	}
	
	public void removeTask(int taskId) {
	}
	
	public void markTask(int taskId) {
	}
	
	public String[] page(ITaskable[]tasks, String prompt) {
		int pagesize = 1;
		if (tasks != null && tasks.length>0) {
			pagesize += tasks.length;
		}
		String[] page = new String[pagesize];
		if (tasks.length>0) {
			int i=1;
			for(ITaskable task : tasks) {
				page[i] = task.toString();
				i++;
			}			
		}
		page[0] = prompt;
		return page;	
	}
	
	// Getters and Setters
	public TaskableManager getManager() {
		return manager;
	}

	public void setManager(TaskableManager manager) {
		this.manager = manager;
	}

	public String[] getMainPage() {
		return mainPage;
	}
	
	public void setMainPage(String[] mainPage) {
		this.mainPage = mainPage;
	}
	
	//Testing 
	public static void main(String[] args) {
	
		TaskManagerController controller = new TaskManagerController();
		controller.setManager(new CompleteableTaskManager());
		controller.setMainPage();
		
		controller.run();

	}
	
	//Support
	private static void displayPage(String[]tasks) {
		System.out.println();
		for(int i=1;i<tasks.length;i++) {
			System.out.println(tasks[i]);
		}
		System.out.println("\r\n" + tasks[0]);
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
}

