package taskmanager;

import java.util.List;

import taskmanager.designpatterns.CompleteableTaskFactory;
import taskmanager.interfaces.Task;

public class TaskManager {
	
	public static int ERROR = -1;
		
	public static String[] mainPageTasks = {
			"Add a task",
			"Remove a task",
			"Mark task as complete",
			"Show tasks"	
	};
	public static List<Task> mainPage = null;
	public static CompleteableTaskFactory factory = new CompleteableTaskFactory();
	
	public static void main(String[] args) {

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
			mainPage = factory.createSimplePage(mainPageTasks);
		}
		printlnTasks(mainPage);
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
	public static void printlnTasks(List<Task>tasks) {
		TaskManagerHelper.printlnTasks(tasks);
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
