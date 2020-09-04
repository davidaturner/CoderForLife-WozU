package com.taskmanager.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.taskmanager.factory.CompleteableTaskFactory;
import com.taskmanager.interfaces.ITaskFactory;
import com.taskmanager.interfaces.ITaskManager;
import com.taskmanager.interfaces.ITaskManagerViews;
import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.views.TaskManagerViewsConsole;

public class CompleteableTaskManagerConsole implements ITaskManager {

	private final CompleteableTaskFactory factory;
	private final TaskManagerViewsConsole views;

	public static final int ADD_TASK = 1;
	public static final int REMOVE_TASK = 2;
	public static final int MARK_TASK = 3;
	public static final int LIST_TASKS = 4;
	
	public static final String MAIN_PROMPT = "What would you like to do?";
	
	public static final String[] MAIN_PAGE = {
			"Add a Task",
			"Remove a Task",
			"Mark a Task Complete",
			"List the Tasks"
	};
	
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public CompleteableTaskManagerConsole() {
		this.factory = new CompleteableTaskFactory();
		this.views = new TaskManagerViewsConsole();
	}

	@Override
	public void run() {
	    
		boolean isDone = false;
		int choice;
		
		instruct();
		
		do {
			
			mainpage();
			choice = choose();
			
			
			switch(choice) {
			case ADD_TASK:
				addTask();
				break;
			case REMOVE_TASK:
				removeTask();
				break;
			case MARK_TASK:
				markTask();
				break;
			case LIST_TASKS:
				listTasks();
				break;
			default:
				System.out.println("Quitting..");
				isDone = true;
				break;
				
			}	
		} while (!isDone);
		
		done();
	}
	
	public void mainpage() {
		System.out.println("\r\n<<Main Page>>\r\n");
	}
	
	public int choose() {
		try {
			return Integer.parseInt(br.readLine());
		} catch(Exception e) {
			System.out.println("Unable to read buffered reader.");
		}
		return 0;
	}

	public void addTask() {
		System.out.println("Adding a task.");
	}
	public void removeTask() {
		System.out.println("Removing a task.");
	}
	public void markTask() {
		System.out.println("Marking a task complete.");
	}
	public void listTasks() {
		System.out.println("List the tasks.");
	}

	public void instruct() {
		System.out.println("Welcome to the ACME Things-To-Do Manager!");
		System.out.println("Enter the number next to your choice of task.");
	}
	public void done() {	
		try {
			br.close();
		} catch(Exception e) {
			System.out.println("Unable to close buffered reader.");
		} finally {
			System.out.println("\r\n...Done!");			
		}
	}
	
	public String input() {
		try {
			return br.readLine();
		} catch(Exception e) {
			System.out.println("Unable to read buffered reader.");
		}
		return null;
	}	
		
	public static void main(String[] args) {

		CompleteableTaskManagerConsole manager = new CompleteableTaskManagerConsole();
		manager.run();

	}
}
