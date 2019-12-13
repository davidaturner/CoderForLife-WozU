package com.taskstore;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.taskstore.classes.CompleteableTask;
import com.taskstore.classes.SimpleTask;
import com.taskstore.interfaces.ITaskable;

public class TaskStoreConsoleApplication {
	
	private static int nextTaskNumber = 0;
	
	private static ArrayList<ITaskable>mainTasks;
	private static ArrayList<ITaskable>completeableTasks;
	
	public static BufferedReader reader;
	
	public static int ERROR_SELECT = -1;
	public static int QUIT_SELECT = 5;
	
	public static String NEWLINE = "\r\n";
	
	public static String MAIN_PROMPT = NEWLINE + "What would you like to do?";
	public static String ADD_PROMPT = NEWLINE + "Enter a task";
	public static String CONTINUE_PROMPT = NEWLINE + "Press Return to Continue";
	public static String SELECT_PROMPT = NEWLINE + "Select a task (by number)";
	public static String QUIT_PROMPT = NEWLINE + "Quitting application...";
	public static String NOT_RECOGNIZED_PROMPT = NEWLINE + "Choice Not Recognized. Try Again?";
		
	public static String MAIN_PAGE = NEWLINE + "MAIN PAGE";
	public static String ADD_PAGE = NEWLINE + "ADD PAGE";
	public static String REMOVE_PAGE = NEWLINE + "REMOVE PAGE";
	public static String LIST_PAGE = NEWLINE + "LIST PAGE";
	public static String MARK_COMPLETE = NEWLINE + "MARK TASK AS COMPLETE";
	
	public TaskStoreConsoleApplication () {
		mainTasks = new ArrayList<ITaskable>();
		mainTasks.add( new SimpleTask("1", "Add a Task"));
		mainTasks.add( new SimpleTask("2", "Remove a Task"));
		mainTasks.add( new SimpleTask("3", "Mark Task as Complete"));
		mainTasks.add( new SimpleTask("4", "List Tasks"));
		mainTasks.add( new SimpleTask("5", "Quit"));
		
		completeableTasks = new ArrayList<ITaskable>();
	}
	
	public void runApplication() {
				
		startReader();
		
		boolean isDone = false;
		
		while(!isDone) {
			
//			mainPage();
			
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
	public void runListPage(String[] tasks) {
		listPage(tasks);
		quitApplication();
		done();
	}

	public void mainPage() {
		System.out.println(MAIN_PAGE);
		for(ITaskable task : mainTasks) {
			System.out.println(task.describe());
		}
	}
	public void addPage() {
		System.out.println(ADD_PAGE);
		CompleteableTask newTask = new CompleteableTask("" + getNextTaskNumber(), 
										readInput(ADD_PROMPT));
		completeableTasks.add(newTask);
		listPage();
	}
	private CompleteableTask getCompleteableTask(String taskNumber) {
		int selection = Integer.parseInt(taskNumber);
		if (completeableTasks != null && completeableTasks.size()>=selection) {
			for(ITaskable task : completeableTasks) {
				CompleteableTask ctask = (CompleteableTask)task;
				if (ctask.getNumber().equals(taskNumber)) {
					return ctask;
				}
			}
		}
		return null;
	}
	public void removePage() {
		System.out.println(REMOVE_PAGE);
		listPage();
		String selection = readInput(SELECT_PROMPT);
		CompleteableTask found = getCompleteableTask(selection);
		if (found != null) {
			System.out.println(found.describe() + " is removed from that task list.");
		}
		String crLf = readInput(CONTINUE_PROMPT);
	}
	public void removePage(String[] tasks) {
		System.out.println(REMOVE_PAGE);
		listPage(tasks);
		String selection = "2";
		CompleteableTask found = getCompleteableTask(selection);
		if (found != null) {
			System.out.println(NEWLINE + NEWLINE + "Removing " + found.describe() + " from that task list.");
		}
		String crLf = readInput(CONTINUE_PROMPT);
	}
	public void markCompletePage() {
		System.out.println(MARK_COMPLETE);
		String crLf = readInput(CONTINUE_PROMPT);
	}	
	public void listPage() {
		System.out.println(LIST_PAGE);
		System.out.print(NEWLINE);
		for(ITaskable task : completeableTasks) {
			System.out.println(task.describe());
		}
		String crLf = readInput(CONTINUE_PROMPT);
	}
	public void listPage(String[] tasks) {
		for(int i=0; i<tasks.length; i++) {
			CompleteableTask newTask = new CompleteableTask("" + getNextTaskNumber(), 
					tasks[i]);
			completeableTasks.add(newTask);			
		}
		listPage();
	}
	public void quitApplication() {
		System.out.println(QUIT_PROMPT);
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
		
		if (reader != null) {

			System.out.print(NEWLINE + prompt + ": ");
			try {
				choice = Integer.parseInt(reader.readLine());
			}
			catch (Exception e) {
				e.getStackTrace();
			}
			
			return choice;
		}

		return QUIT_SELECT;	
	}	
	private static String readInput(String prompt) {

		String choice = "" + ERROR_SELECT;
		if (reader != null) {

			System.out.print(NEWLINE + prompt + ": ");
			try {
				choice = reader.readLine();
			}
			catch (Exception e) {
				e.getStackTrace();
			}

			return choice;	
		}
		
		return null;
	}
	
	// Additional support functions.
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
	private void choiceNotRecognized() {
		System.out.println(NOT_RECOGNIZED_PROMPT);
		String crLf = readInput(CONTINUE_PROMPT);		
	}
	private void done() {
		System.out.println("\r\nDONE!");
	}

	public static void main(String[] args) {

		RunTest03();
	}
	
	public static void RunTest01() {
		
		TaskStoreConsoleApplication tb = new TaskStoreConsoleApplication();
		tb.runApplication();
	}
	
	public static void RunTest02() {
		
		String[] tasks = {"Eating a bug", "Learn Commoncore", "Try a Peach", "Have breakfast and coffee"};
		
		TaskStoreConsoleApplication tb = new TaskStoreConsoleApplication();
		tb.runListPage(tasks);
	}
	
	public static void RunTest03() {
		
		String[] tasks = {"Eating a bug", "Learn Commoncore", "Try a Peach", "Have breakfast and coffee"};
		
		TaskStoreConsoleApplication tb = new TaskStoreConsoleApplication();
		tb.removePage(tasks);
	}

}
