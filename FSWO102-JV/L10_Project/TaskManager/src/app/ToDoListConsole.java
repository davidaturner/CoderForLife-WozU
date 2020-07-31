package app;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import taskmanager.TaskManager;
import taskmanager.factories.CompleteableTaskFactory;
import taskmanager.factories.SimpleTaskFactory;
import taskmanager.interfaces.TaskManageable;
import taskmanager.interfaces.Taskable;
import taskmanager.interfaces.TaskableFactory;

public class ToDoListConsole {

	public static String[] TODO_TASKS = {
			"\r\nWhat would you like to do? (Enter 0 to quit) ",
			"Add a task",
			"Remove a task",
			"Mark a task complete",
			"List the tasks"
	};
	
	private TaskableFactory taskfactory;	
	private TaskManageable manager;
	
	private BufferedReader br = null;
	
	// Constructor
	public ToDoListConsole(TaskManageable manager) {
		this.taskfactory = new SimpleTaskFactory();
		this.manager = manager;
	}
	
	// Run
	public void run() {
		
		taskfactory.createTaskPage(TODO_TASKS);
		
		openReader();
		
		boolean done = false;
		int choice = 0; // Exit program - default.
		while( !done) {
			
			displayPage(taskfactory.getTaskPage());
			
			choice = getChoiceFromReader();
			
			switch(choice) {
			case 1:
				addToDo();
				break;
			case 2:
				removeToDo();
				break;
			case 3:
				markToDo();
				break;
			case 4:
				listAllToDo();
				break;
			default:
				System.out.println("\r\nShutting down...");
				done = true;
			}
			
			pressANYKey();

		}

		closeReader();
		displayPrompt("Done!");
		
	}
	
	// Task listing operations
	public void addToDo() {
		displayPrompt("Enter task: ");
		String description = getEntryFromReader();
		manager.addToListing(description);
		displayPrompt("Task added!");
	}
	public void removeToDo() {
		Taskable[] tasks = manager.getListing("Which task do you want to remove?");
		displayPage(tasks);
		int taskid = getChoiceFromReader();
		if (taskid>0) {
			manager.removeFromListing(taskid);
			displayPrompt("Task removed!");
		} else {
			System.out.println(prompt("Taskid not found"));
		}
	}
	public void markToDo() {
		Taskable[] tasks = manager.getListing("Which task do you want to mark complete?");
		System.out.println(tasks.length);
		System.out.println(tasks[0].listing());
//		displayPage(tasks);
//		int taskid = getChoiceFromReader();
//		if (taskid>0) {
//			Taskable taskToBeMarked = ((CompleteableTaskFactory)manager.getTaskFactory())
//											.markTaskAsComplete(taskid, tasks);
//			manager.updateListing(taskid, taskToBeMarked);
//			displayPrompt("Task updated!");
//		} else {
//			System.out.println(prompt("Taskid not found"));
//		}
	}
	public void listAllToDo() {
		displayPage( manager.getListing(prompt("End of List")));
	}
	
	// Support ops
	public String prompt(String prompt) {
		return "\r\n" + prompt + ".";
	}
	public void displayPrompt(String prompt) {
		System.out.println("\r\n" + prompt);
	}
	public void displayPage(Taskable[] tasks) {	
		for(int i=1;i<tasks.length;i++) {
			System.out.println(tasks[i].listing());
		}
		System.out.println(tasks[TaskableFactory.PROMPT_LINE].listing());
	}
	public void openReader() {
		if (br == null) {
			br = new BufferedReader( new InputStreamReader(System.in));
			
		}
	}
	public int getChoiceFromReader() {
		int choice = 0;
		try {
			choice = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(prompt("Unable to read input"));
		}
		return choice;
	}
	public String  getEntryFromReader() {
		String entry = null;
		try {
			entry = br.readLine();
		} catch (Exception e) {
			System.out.println(prompt("Unable to read input"));
		}
		return entry;
	}
	public void pressANYKey () {
		try {
			System.out.println(taskfactory.PROMPT_DEFAULT);
			br.readLine();
		} catch (Exception e) {
			System.out.println(prompt("Unable to read input"));
		}		
	}
	public void closeReader() {
		try {
			br.close();
		} catch (Exception e) {
			System.out.println(prompt("Unable to close reader"));
		}
		br = null;		
	}
	
	public static void main(String[] args) {
		
		ToDoListConsole console = new ToDoListConsole(
										new TaskManager(new CompleteableTaskFactory()));
		console.run();
	}

}
