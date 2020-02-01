package taskmanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
			return Integer.parseInt(result);
		} catch (Exception e) {
			e.getStackTrace();
		}
		return -1;
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
			System.out.print(undoArray[i] + " ");
		}
		System.out.println();
		
		// Print tasks in forward order
		System.out.println("\r\nNow. Enter five new tasks: ");
		for(int i=0; i<descriptArray.length; i++) {
			descriptArray[i] = TaskManagerHelper.readUserInput();
		}
		
		// Print in reverse order (last in first out).
		int i=1;
		for(String descript : descriptArray) {
			System.out.println(i++ + ". " + descript);
		}
		System.out.println();

		// Print task description
		TaskManagerHelper.closeReader();
		
		return true;
	}
}
