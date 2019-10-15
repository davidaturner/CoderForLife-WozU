package org.davidaturner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskManagerApplication {

	public static String[] MAIN_TASKS_LIST = {
			"Add a task",
			"Remove a task",
			"Mark a task as Complete",
			"Show tasks"
	};
	
	public static int ADD_A_TASK = 0;
	public static int REMOVE_A_TASK = 1;
	public static int MARK_A_TASK_COMPLETE = 2;
	public static int SHOW_TASKS = 3;
	
	public static String MAIN_TASKS_LIST_PROMPT = "\r\nWhat would you like to do? ";
	
	public static String[] OTHER_TASKS_LIST_PROMPTS = {
			"",
			"Which task do you want to remove? ",
			"Which task do you want to complete? ",
			""
	};
	
	public static String EXIT_COMMAND = "exit";
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   
		boolean isDone = false;
		
		try {
			while( !isDone) {
				
				createMainPage();
				
				String command = readCommand(reader);
				if (command.equalsIgnoreCase(EXIT_COMMAND)) {
					isDone = true;
					continue;
				}
				
				int selectedTask = Integer.parseInt(command);
				switch (selectedTask) {
				
				case 1:
					addTaskToList(reader);
					break;
				case 2: 
					removeTaskFromList(reader);
					break;
				case 3:
					markTaskAsComplete(reader);
					break;
				case 4:
					listTasks(reader);
					break;
				default:
					taskNotRecognized();
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("\r\nError in User Input!");
			System.out.println(e.toString());
		} finally {
			System.out.println("\r\nDONE!");
			reader = null;
		}	
		
	}
	
	public static void createMainPage() {
		System.out.print(MAIN_TASKS_LIST_PROMPT);
	}
	
	public static String readCommand(BufferedReader reader) throws Exception {
		String command = reader.readLine();
		char[] array = command.toCharArray();
		int beginindex = 0, endindex = command.length()-1;
		boolean stripbegin = true;
		for(int ch : array) {
			if ( isUppercase(ch) || isLowercase(ch) || isNumerical(ch)) {
				if (stripbegin != false) {
					stripbegin = false;
				}
			} else {
				if (stripbegin) beginindex++;
				else endindex--;					
			}
		}
		if (beginindex <= endindex) {
			return command.substring(beginindex, endindex+1);
		}
		return command;
	}
	
	public static boolean isUppercase(int ch) {
		return (ch >= 65 && ch<= 90)?true:false;
	}
	public static boolean isLowercase(int ch) {
		return (ch >= 97 && ch <= 122)?true:false;
	}
	public static boolean isNumerical(int ch) {
		return (ch >= 48 && ch<= 57)?true: false;
		
	}
	public static void addTaskToList(BufferedReader reader) throws Exception {
		System.out.println("New Task Added! See List.");
	}
	public static void removeTaskFromList(BufferedReader reader) throws Exception {
		System.out.println("Existing Task Removed! See List.");
	}
	public static void markTaskAsComplete(BufferedReader reader) throws Exception {
		System.out.println("Task Marked As Completed! See List.");
	}
	public static void listTasks(BufferedReader reader) throws Exception {
		System.out.println("Displaying Task List.");
	}
	public static void taskNotRecognized() throws Exception {
		System.out.println("Command/Task Not Found! Try again.");
	}

}
