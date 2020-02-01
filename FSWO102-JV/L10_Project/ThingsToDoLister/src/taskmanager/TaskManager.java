package taskmanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import taskmanager.classes.CompleteableTask;
import taskmanager.classes.SimpleTask;
import taskmanager.interfaces.ListableTask;

public class TaskManager {
	
	public static int ERROR = -1;
		
	public static List<ListableTask>mainPage;	
	public static List<ListableTask>theListing;
	
	public static void main(String[] args) {


		
 		System.out.println("\r\n" + TaskManager.RunMain());
		
//		System.out.println("\r\n" + SimpleTask.RunTest01());
//		System.out.println("\r\n" + CompleteableTask.RunTest01());
//		System.out.println("\r\n" + TaskManagerHelper.RunTest01());
		
	}
	
	public static boolean RunMain() {
				
		TaskManagerHelper.openReader();
		
		initializeMainPage();

		printCRLF("Welcome to Your-Things-To-Do!");	
						
		boolean done = false;
		while ( !done) {
			
			displayMainPage();			
		
			int choice = TaskManagerHelper.readUserSelect();
			switch(choice) {
			case 1:
					doAddTask();
					break;
			case 2:
					doRemoveTask();
					break;
			case 3:
					doMarkTaskComplete();
					break;
			case 4:
					doListTasks();
					break;
			default:
					doQuit();
					done = true;
			}		
		}
		
		TaskManagerHelper.closeReader();
		return true;
	}
	
	public static void doAddTask() {
		printCRLF("Task added");
	}
	public static void doRemoveTask() {
		printCRLF("Task added");
	}
	public static void doMarkTaskComplete() {
		printCRLF("Task marked complete");
	}
	public static void doListTasks() {
		printCRLF("Tasks shown");
	}
	public static void doQuit() {
		printCRLF("DONE!");
	}
	
	public static void initializeMainPage() {
		
		mainPage = new ArrayList<>();
		
		int i = 1;
		SimpleTask mainTask  = new SimpleTask();
		mainTask.setDescription("Add a task");
		mainTask.setListNumber(i++);
		mainPage.add(mainTask);
		
		mainTask = new SimpleTask();
		mainTask.setDescription("Remove a task");
		mainTask.setListNumber(i++);
		mainPage.add(mainTask);
		
		mainTask = new SimpleTask();
		mainTask.setDescription("Mark a task complete");
		mainTask.setListNumber(i++);
		mainPage.add(mainTask);
		
		mainTask = new SimpleTask();
		mainTask.setDescription("List the tasks");
		mainTask.setListNumber(i);
		mainPage.add(mainTask);	
	}
	
	public static void displayMainPage() {
		
		SimpleTask viewer = new SimpleTask();
		List<String>listing = viewer.listing(mainPage);
		for(String taskstr : listing) {
			print(taskstr);
		}
		prompt("What would you like to do? ");
	}
		
	public static void print(String message) {
		if (message != null && !message.isEmpty()) {
			System.out.println(message);			
		} else {
			System.out.println("Nothing to print.");
		}
	}
	public static void print() {
		print("\r\n");
	}
	public static void printCRLF(String message) {
		print(message + "\r\n");
	}
	public static void prompt(String message) {
		print("\r\n" + message);
	}

	
}
