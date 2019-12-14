package com.taskstore;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.taskstore.classes.CompleteableTask;
import com.taskstore.classes.SimpleTask;
import com.taskstore.interfaces.ICompleteable;
import com.taskstore.interfaces.ITaskable;

public class TaskStoreConsoleApplication {
	
	private static int nextTaskNumber = 0;
	
	private static ArrayList<ITaskable>mainTasks;
	private static ArrayList<ICompleteable>completeableTasks;
	
	public static BufferedReader reader;
	
	public static final int ERROR_SELECT = -1;
	public static final int NO_SINGLE_OP = 0;
	public static final int ADD_SELECT = 1;
	public static final int REMOVE_SELECT = 2;
	public static final int COMPLETE_SELECT = 3;
	public static final int LIST_SELECT = 4;
	public static final int QUIT_SELECT = 5;
	
	public static String NEWLINE = "\r\n";
	
	public static String MAIN_PROMPT = NEWLINE + "What would you like to do?";
	public static String ADD_PROMPT = "Enter a task";
	public static String CONTINUE_PROMPT = "Press Return to Continue";
	public static String SELECT_PROMPT = "Select a task (by number)";
	public static String QUIT_PROMPT = "Quitting application...";
	public static String NOT_RECOGNIZED_PROMPT = "Choice Not Recognized. Try Again?";
		
	public static String MAIN_PAGE = NEWLINE + "MAIN PAGE";
	public static String ADD_PAGE = NEWLINE + "ADD PAGE";
	public static String REMOVE_PAGE = NEWLINE + "REMOVE PAGE";
	public static String LIST_PAGE = NEWLINE + "LIST PAGE";
	public static String MARK_COMPLETE = NEWLINE + "MARK TASK AS COMPLETE";
	
	public TaskStoreConsoleApplication () {
		mainTasks = new ArrayList<ITaskable>();
		mainTasks.add( new SimpleTask("" + ADD_SELECT, "Add a Task"));
		mainTasks.add( new SimpleTask("" + REMOVE_SELECT, "Remove a Task"));
		mainTasks.add( new SimpleTask("" + COMPLETE_SELECT, "Mark Task as Complete"));
		mainTasks.add( new SimpleTask("" + LIST_SELECT, "List Tasks"));
		mainTasks.add( new SimpleTask("" + QUIT_SELECT, "Quit"));
		
		completeableTasks = new ArrayList<ICompleteable>();
	}
	
	public void loadSimpleTasks(String[] tasks) {
		for(int i=0; i<tasks.length;i++) {
			if (completeableTasks == null) {
				completeableTasks = new ArrayList<ICompleteable>();
			}
			completeableTasks.add(new CompleteableTask(
									new SimpleTask(
											String.valueOf(completeableTasks.size()+1), tasks[i]), 
									false));
		}
	}

	public void runApplication() {
		runSingleOp(NO_SINGLE_OP);
	}
	
	public void runSingleOp(int singleOp) {
				
		startReader();
		
		boolean isDone = false;
		
		while(!isDone) {
			
			mainPage();
			
			int selected = (singleOp != NO_SINGLE_OP)?singleOp : readSelect(MAIN_PROMPT);
			switch( selected) {
			case ADD_SELECT:
				addPage();
				break;
			case REMOVE_SELECT:
				removePage();
				break;	
			case COMPLETE_SELECT:
				markCompletePage();
				break;
			case LIST_SELECT:
				listPage();
				break;
			case QUIT_SELECT:
				quitApplication();
				isDone = true;
				break;
			default:
				choiceNotRecognized();
				break;
			}
			
			if (singleOp != NO_SINGLE_OP) {
				if (singleOp != LIST_SELECT) {
					listPage();					
				}
				quitApplication();
				isDone = true;
			}
		}		
		done();
		
		stopReader();
	}

	private void mainPage() {
		System.out.println(MAIN_PAGE);
		for(ITaskable task : mainTasks) {
			System.out.println(task.describe());
		}
		System.out.println(MAIN_PROMPT);
	}
	private void addPage() {
		System.out.println(ADD_PAGE);
		CompleteableTask newTask = new CompleteableTask("" + getNextTaskNumber(), 
										readInput(ADD_PROMPT));
		completeableTasks.add(newTask);
	}
	private void removePage() {
		System.out.println(REMOVE_PAGE);
		String crLf = readInput(CONTINUE_PROMPT);
	}
	private void markCompletePage() {
		System.out.println(MARK_COMPLETE);
		String crLf = readInput(CONTINUE_PROMPT);
	}	
	private void listPage() {
		System.out.println(LIST_PAGE);
		System.out.print(NEWLINE);
		for(ICompleteable task : completeableTasks) {
			ITaskable ctask = (CompleteableTask)task;
			System.out.println(ctask.describe());
		}
		String crLf = readInput(CONTINUE_PROMPT);
	}
	private void choiceNotRecognized() {
		System.out.println(NOT_RECOGNIZED_PROMPT);
		String crLf = readInput(CONTINUE_PROMPT);		
	}
	private void quitApplication() {
		System.out.println(QUIT_PROMPT);
//		String crLf = getUserInput("\r\nPress Any Key to Continue: ");
	}
	private void done() {
		System.out.println("\r\nDONE!");
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
	private CompleteableTask getCompleteableTask(String taskNumber) {
		int selection = Integer.parseInt(taskNumber);
		if (completeableTasks != null && completeableTasks.size()>=selection) {
			for(ICompleteable task : completeableTasks) {
				CompleteableTask ctask = (CompleteableTask)task;
				if (ctask.getNumber().equals(taskNumber)) {
					return ctask;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {

		RunTest01();
	}
	
	public static void RunTest01() {
		
		TaskStoreConsoleApplication tb = new TaskStoreConsoleApplication();
		tb.runSingleOp(ADD_SELECT);
	}
	
	public static void RunTest02() {
		
		String[] tasks = {"Eating a bug", "Learn Commoncore", "Try a Peach", "Have breakfast and coffee"};
		
		TaskStoreConsoleApplication tb = new TaskStoreConsoleApplication();
		tb.loadSimpleTasks(tasks);
		tb.runSingleOp(LIST_SELECT);
		
	}


}
