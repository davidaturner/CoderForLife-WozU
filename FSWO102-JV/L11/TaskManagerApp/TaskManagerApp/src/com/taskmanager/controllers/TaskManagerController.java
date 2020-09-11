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
	public static final String ENTER_PROMPT = "Press ENTER key to continue.";
	
	public static final String MISSING = "Task not found.";
	
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
				displayPage(getTaskPage(ADD_TASK));
				displayPage(addTask(getInput()));
				break;
			case REMOVE_TASK:
				displayPage(getTaskPage(REMOVE_TASK));
				displayPage(removeTask(getChoice()));
				break;
			case MARK_TASK:
				displayPage(getTaskPage(MARK_TASK));
				displayPage(markTask(getChoice()));
				break;
			case LIST_TASKS:
				displayPage(getTaskPage(LIST_TASKS));
				getInput();
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
	private String[] page(ITaskable[]tasks, String prompt) {
		int pagesize = (tasks != null && tasks.length>0)
						? tasks.length + 1: 1;
		String[] page = new String[pagesize];
		if (pagesize > 1) {
			int i=1;
			for(ITaskable task : tasks) {
				page[i] = task.toString();
				i++;
			}					
		}
		page[0] = prompt;
		return page;	
	}
	
	public void setMainPage() {
		setMainPage(page((new SimpleTaskFactory()).createAll(MAIN_PAGE), MAIN_PROMPT));
	}
	
	public String[] getTaskPage(int pageRequested) {
		switch (pageRequested) {
		case ADD_TASK:
			return page(null, ADD_PROMPT);
		case REMOVE_TASK:
			return page(manager.list(), REMOVE_PROMPT);
		case LIST_TASKS:
			return page(manager.list(), ENTER_PROMPT);
		case MARK_TASK:
			return page(manager.list(), MARK_PROMPT);
		default:
			return getMainPage();	
		}
	}
		
	public String addTask(String description) {
		ITaskable taskToBeAdded = ((CompleteableTaskManager)manager).add(description);
		return taskToBeAdded.toString();
	}
	
	public String removeTask(int taskId) {
		ITaskable taskToBeRemoved = ((CompleteableTaskManager)manager).remove(taskId);
		taskToBeRemoved.setId(-1);
		return (taskToBeRemoved != null)?taskToBeRemoved.toString() : MISSING;
	}
	
	public String markTask(int taskId) {
		ITaskable taskToBeMarked = ((CompleteableTaskManager)manager).markComplete(taskId);
		return (taskToBeMarked != null)?taskToBeMarked.toString() : MISSING;
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
	
	// Additional / Support
	public void displayPage(String toBeDisplayed) {
		String[] tasks = new String[1];
		tasks[0] = toBeDisplayed;
		displayPage(tasks);
	}
	
	public void displayPage(String[]tasks) {
		System.out.println();
		for(int i=1;i<tasks.length;i++) {
			System.out.println(tasks[i]);
		}
		System.out.println("\r\n" + tasks[0]);
	}

	//Testing 
	public static void main(String[] args) {
	
		TaskManagerController controller = new TaskManagerController();
		controller.setManager(new CompleteableTaskManager());
		controller.setMainPage();
		
		controller.run();

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

