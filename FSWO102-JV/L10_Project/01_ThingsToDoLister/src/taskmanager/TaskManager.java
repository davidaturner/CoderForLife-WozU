package taskmanager;

import java.util.List;

import taskmanager.classes.MainTaskFactory;
import taskmanager.classes.SimpleTask;
import taskmanager.interfaces.ListableTask;

public class TaskManager {
	
	public static int ERROR = -1;
		
	public static List<ListableTask>mainPage = null;
	public static List<ListableTask>theListing = null;
	
	public static void main(String[] args) {


		
 		System.out.println("\r\n" + TaskManager.RunMain());
		
//		System.out.println("\r\n" + SimpleTask.RunTest01());
//		System.out.println("\r\n" + CompleteableTask.RunTest01());
//		TaskManagerHelper.prompt(TaskManagerHelper.RunTest01());
		
	}
	
	public static boolean RunMain() {
				
		openReader();
		
		printlnln("Welcome to Your-Things-To-Do!");	
						
		boolean done = false;
		while ( !done) {
			
			doMainPage();			
		
			int choice = getSelect();
			switch(choice) {
			case 0:
					doQuit();
					done = true;
					break;
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
			case 5:
					doLoadTasks();
					break;
			case 6: 
					doClearTasks();
					break;
			default:
					printlnln("Invalid Choice. Try again?");
					break;
			}		
		}
		
		closeReader();
		return true;
	}
	
	public static void doAddTask() {
		printlnln("Task added");
	}
	public static void doRemoveTask() {
		printlnln("Task removed");
	}
	public static void doMarkTaskComplete() {
		printlnln("Task marked complete");
	}
	public static void doListTasks() {
		printlnln("Tasks shown");
	}
	public static void doLoadTasks() {
		printlnln("Tasks loaded");
	}
	public static void doClearTasks() {
		printlnln("Tasks clear");
	}
	public static void doQuit() {
		printlnln("...DONE!");
	}
		
	public static void doMainPage() {
		
		if (mainPage == null) {
			mainPage = MainTaskFactory.getTasks();
		}
		SimpleTask viewer = new SimpleTask();
		List<String>listing = viewer.listing(mainPage);
		for(String taskstr : listing) {
			println(taskstr);
		}
		prompt("What would you like to do? ");
	}
	
	// TaskManagerHelper simples.
	public static void openReader() {
		TaskManagerHelper.openReader();
	}
	public static void closeReader() {
		TaskManagerHelper.closeReader();
	}
	public static int getSelect() {
		return TaskManagerHelper.readUserSelect();
	}
	public static String getInput() {
		return TaskManagerHelper.readUserInput();
	}
	public static void print(String message) {
		TaskManagerHelper.print(message);
	}
	public static void println(String message) {
		TaskManagerHelper.println(message);
	}
	public static void printlnln(String message) {
		TaskManagerHelper.printlnln(message);
	}
	public static void prompt(String message) {
		TaskManagerHelper.prompt(message);
	}
	public static void prompt(boolean testResult) {
		TaskManagerHelper.prompt(testResult);
	}

	
}
