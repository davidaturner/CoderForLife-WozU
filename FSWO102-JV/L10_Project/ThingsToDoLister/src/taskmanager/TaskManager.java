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

//		System.out.println("\r\n" + SimpleTask.RunTest01());
//		System.out.println("\r\n" + CompleteableTask.RunTest01());
		System.out.println("\r\n" + TaskManager.RunMain());
		
	}
	
	public static boolean RunMain() {
				
		System.out.println("Welcome to Your-Things-To-Do!\r\n");	
		
		initializeMainPage();
				
		boolean done = false;
		while ( !done) {
			
			displayMainPage();
			
			print("What would you like to do?", false);
			int choice = getUserInput();
			
			switch(choice) {
			case 1:
					print("Task added", true);
					break;
			case 2:
					print("Task removed", true);
					break;
			case 3:
					print("Task completed", true);
					break;
			case 4:
					print("Tasks shown", true);
					break;
			default:
					done = true;
			}		
		}
		
		return true;
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
		viewer.display(mainPage);
	}
	
	public static int getUserInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = ERROR;
		try {
			choice = Integer.parseInt(br.readLine());
			
		} catch(Exception e) {
			e.getStackTrace();			
		}
		
		return choice;
	}
	
	public static void print(String message, boolean endCRLF) {
		
		if (message != null && !message.isEmpty()) {
			System.out.println("\r\n" + 
								message +
								((endCRLF)? "\r\n" : ""));
		} else {
			System.out.println("\r\n");
		}
	}
	
}
