package com.taskstore;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.taskstore.classes.CompleteableTask;
import com.taskstore.classes.SimpleTask;
import com.taskstore.interfaces.ITaskable;

public class TaskBrowser {
	
	private static int nextTaskNumber = 0;
	
	private static ArrayList<ITaskable>mainTasks;
	private static ArrayList<ITaskable>completeableTasks;
	
	public static BufferedReader reader;
	
	public static int ERROR_SELECT = -1;
	
	public static String MAIN_PROMPT = "What would you like to do?";
	public static String ADD_PROMPT = "Enter a task";
	public static String CONTINUE_PROMPT = "Press Any Key to Continue";
		
	public TaskBrowser () {
		mainTasks = new ArrayList<ITaskable>();
		mainTasks.add( new SimpleTask("1", "Add a Task"));
		mainTasks.add( new SimpleTask("2", "Remove a Task"));
		mainTasks.add( new SimpleTask("3", "Mark Task as Complete"));
		mainTasks.add( new SimpleTask("4", "List Tasks"));
		mainTasks.add( new SimpleTask("5", "Quit"));
		
		completeableTasks = new ArrayList<ITaskable>();
	}
	
	public void run(ArrayList<ITaskable>completeableTasks) {
				
		startReader();
		
		boolean isDone = false;
		
		while(!isDone) {
			
			mainPage();
			
			int selected = readSelect(MAIN_PROMPT);
			switch( selected) {
			case 1:
				addPage();
				break;
			case 2:
				removePage();
				break;	
			case 3:
				markCompletePage();
				break;
			case 4:
				listPage();
				break;
			case 5:
				quitApplication();
				isDone = true;
				break;
			default:
				choiceNotRecognized();
				break;
			}
			
		}		
		done();
		
		stopReader();
	}

	public void mainPage() {
		System.out.println("\r\nMAIN PAGE");
		for(ITaskable task : mainTasks) {
			System.out.println(task.describe());
		}
	}
	public void addPage() {
		System.out.println("\r\nADD PAGE");
		CompleteableTask newTask = new CompleteableTask("" + getNextTaskNumber(), 
										readInput(ADD_PROMPT));
		completeableTasks.add(newTask);
		listPage();
	}
	private int getNextTaskNumber() {
		int nextTaskNumber = 1;
		if (completeableTasks != null) {
			
			for(int i=0; i<completeableTasks.size(); i++) {
				CompleteableTask task = (CompleteableTask)completeableTasks.get(i);
				int taskNumber = Integer.parseInt(task.getNumber());
				if (taskNumber >= nextTaskNumber) {
					nextTaskNumber = taskNumber + 1;
				}
			}			
		}
		return nextTaskNumber;
	}
	
	public void markCompletePage() {
		System.out.println("\r\nMARK COMPLETE PAGE");
		String crLf = readInput("\r\nPress Any Key to Continue: ");
	}
	
	public void listPage() {
		System.out.println("\r\nLIST PAGE");
		System.out.print("\r\n");
		for(ITaskable task : completeableTasks) {
			System.out.println(task.describe());
		}
		String crLf = readInput(CONTINUE_PROMPT);
	}
	
	public void removePage() {
		System.out.println("\r\nREMOVE PAGE");
		String crLf = readInput("\r\nPress Any Key to Continue: ");
	}

	private void quitApplication() {
		System.out.println("\r\nQuitting application");
//		String crLf = getUserInput("\r\nPress Any Key to Continue: ");
	}
	
	// BufferedReader functions.
	private static void startReader() {
		try {
			if (reader == null) {
				reader = new BufferedReader(new InputStreamReader(System.in));
			}
		} 
		catch (Exception e) {
			e.getStackTrace();
		}
	}	
	private static void stopReader() {		
		try {
			reader.close();
		} 
		catch (Exception e) {
			e.getStackTrace();
		}
	}	
	private static int readSelect(String prompt) {	
		int choice = ERROR_SELECT;
		
		System.out.print("\r\n" + prompt + ": ");
		try {
			choice = Integer.parseInt(reader.readLine());
		}
		catch (Exception e) {
			e.getStackTrace();
		}

		return choice;	
	}	
	private static String readInput(String prompt) {
		String choice = "" + ERROR_SELECT;
		
		System.out.print("\r\n" + prompt + ": ");
		try {
			choice = reader.readLine();
		}
		catch (Exception e) {
			e.getStackTrace();
		}

		return choice;			
	}	
	
	// Private methods
	private static void choiceNotRecognized() {
		System.out.println("\r\nChoice Not Recognized. Try Again?");
		String crLf = readInput("\r\nPress Any Key to Continue: ");		
	}
	private static void done() {
		System.out.println("\r\nDONE!");
	}

	public static void main(String[] args) {

		RunTest01();
	}
	
	public static void RunTest01() {
		
		TaskBrowser tb = new TaskBrowser();
		tb.run(null);
	}

}
