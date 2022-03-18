package todolist.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import todolist.interfaces.ITaskable;
import todolist.interfaces.app.IAppConsoleable;

public class BasicConsoleApp implements IAppConsoleable {

	Scanner sc = new Scanner(System.in);
		
	@Override
	public void run() {
		
		welcome();
		about();
		
		boolean isDone = false;		
		// While isDone not true.
		while (!isDone) {
			
			isDone = runApp();	
		}
		
		done();
	}
	
	@Override
	public void toConsole(Object message) {

		System.out.println(message);		
	}

	@Override
	public void toConsole(Object[] messages) {
		if (messages == null || messages.length == 0) {
			toConsole("No results to display.");
		}
		for(int i=0; i<messages.length; i++) {
			toConsole(messages[i]);
		}
		toConsole("");
	}

	@Override
	public int selectFromConsole(String prompt) {
		if (prompt != null) {
			toConsole(prompt + " ");
		}
		int choice = 0;
		String selection = sc.nextLine();
		try {
			choice = Integer.parseInt(selection);
		} catch(NumberFormatException nfe) {
			toConsole("Bad format!");
		}
		return choice;
	}

	@Override
	public String enterFromConsole(String prompt) {
		if (prompt != null) {
			toConsole(prompt + " ");
		}
		return sc.nextLine();
	}
	
	// class methods.
	public boolean runApp() {
		String a = "Test A";
		String b = "Test B";
		String c = "Test C";
		List<String> arr = new ArrayList<String>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		toConsole(arr.toArray());
		
		String d = enterFromConsole("Add another?");
		String e = enterFromConsole("Add another?");
		System.out.print("Ok. Just one more: ");
		String f = enterFromConsole("");
		System.out.println("\r\nThanks!\r\n");
		arr.add(d);
		arr.add(e);
		arr.add(f);
		toConsole(arr.toArray());
		
		// stop looping
		return true;
	}
	
	public void welcome() {
		String WELCOME_MESSAGE = "Welcome to your To-DO list.\r\n";
		toConsole(WELCOME_MESSAGE);
	}
	
	public void about() {
		String[] INSTRUCTIONS = new String[] {
			"INSTRUCT: Select a function then",
			"a task as needed",
			""
		};
		for(String line : INSTRUCTIONS) {
			toConsole(line);
		}
	}
	
	public void done() {
		toConsole("\r\nClosing down your To-DO list...\r\n");
		
		sc.close();
		toConsole("\r\n...DONE!");
	}
	
	public static void main(String[] args) {
		
		(new BasicConsoleApp()).run();
	}
	


}
