package taskmanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import taskmanager.interfaces.Task;

public class TaskManagerHelper {

	private static BufferedReader br = null;
	
	public static void openReader() {
		if (br == null) {
			br = new BufferedReader( new InputStreamReader(System.in));
		}
	}
	
	public static void closeReader() {
		try {
			br.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		br = null;
	}
	
	public static String readUserInput() {
		String result = null;
		try {
			result = br.readLine();
		} catch(Exception e) {
			e.getStackTrace();
		}
		return result;
	}
	
	public static int readUserSelect() {
		String result = null;
		try {
			result = br.readLine();
			println();
			return Integer.parseInt(result);
		} catch (Exception e) {
			e.getStackTrace();
		}
		return -1;
	}
	
	public static void print(String message) {
		if (message != null && !message.isEmpty()) {
			System.out.print(message);			
		} else {
			System.out.println("Nothing to print.");
		}
	}
	
	public static void println() {
		System.out.println();
	}
	public static void println(String message) {
		print(message + "\r\n");
	}
	public static void printlnln(String message) {
		println(message + "\r\n");
	}

	public static void printlnTasks(List<Task> tasks) {
		for(Task task : tasks) {
			println(task.listing());
		}
	}
	public static void prompt(String message) {
		print("\r\n" + message);
	}
	public static void prompt(boolean testResult) {
		print("\r\n" + testResult);
	}
	
	// Tests
	public static boolean RunTest01() {
		
		int[] undoArray = {0, 0, 0, 0, 0};
		String[] descriptArray = new String[5];
		
		TaskManagerHelper.openReader();
		
		// Print selections in reverse order (last in first out).	
		System.out.println("Enter five task selections: ");
		for(int i=0; i<undoArray.length; i++) {
			undoArray[i] = TaskManagerHelper.readUserSelect();
		}		
		for(int i=undoArray.length-1; i>=0; i--) {
			print(undoArray[i] + " ");
		}
		println();
		
		// Print tasks in forward order
		println("\r\nNow. Enter five new tasks: ");
		for(int i=0; i<descriptArray.length; i++) {
			descriptArray[i] = TaskManagerHelper.readUserInput();
		}
		int i=1;
		for(String descript : descriptArray) {
			println(i++ + ". " + descript);
		}

		// Print task description
		TaskManagerHelper.closeReader();
		
		return true;
	}
}
