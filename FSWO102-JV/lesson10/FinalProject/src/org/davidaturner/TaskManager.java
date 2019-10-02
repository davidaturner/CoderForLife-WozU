package org.davidaturner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.davidaturner.interfaces.IListbox;
import org.davidaturner.interfaces.ITask;
import org.davidaturner.factories.ListboxFactory;
import org.davidaturner.factories.TaskFactory;


public class TaskManager {

	public static ArrayList<ITask> tasks = new ArrayList<>();
	public static IListbox mainpage, listpage;
	public static int choice = 0;
	
	public static void run() throws Exception {
		
		mainpage = createMainPage();
		
		boolean done = false;
		while( !done) {
			
			mainpage.display();
			
			choice = getUserChoice();
			
			switch (choice) {		
			case 1:
				addTask();
				break;
			case 2:
				removeTask();
				break;
			case 3:
				markTaskComplete();
				break;
			case 4:
				listAllTasks();
				break;
			default:
				done=true;
				break;
			}

		}
	}
	
	public static void addTask() {
		System.out.println("Do task 1()");		
	}
	public static void removeTask() {
		System.out.println("Do task 2()");		
	}
	public static void markTaskComplete() {
		System.out.println("Do task 3()");		
	}
	public static void listAllTasks() {
		System.out.println("Do task 4()");
	}	
	
	public static IListbox createMainPage() {
		return ListboxFactory.createforMain( TaskFactory.createforMain());
	}
	
	public static IListbox createListPage(String optPrompt) {		
		return ListboxFactory.createforSimple(tasks, optPrompt);
	}
	

	public static int getUserChoice() throws NumberFormatException, IOException {
		return Integer.parseInt(new BufferedReader( new InputStreamReader(System.in)).readLine());
	}
	
	public static String getUserInput() throws IOException {
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}
	
	public static void main(String[] args) {
		
		try {
			run();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("Exiting application...");
			System.out.println("\r\n...DONE!");
		}
	}

}
