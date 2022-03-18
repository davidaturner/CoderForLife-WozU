package todolist;

import java.util.Scanner;

import todolist.classes.BasicConsoleApp;
import todolist.classes.runtaskables.AppRunCompleteableTaskAdd;
import todolist.classes.runtaskables.AppRunCompleteableTaskRemove;
import todolist.classes.runtaskables.AppRunCompleteableTaskUpdate;
import todolist.classes.tasks.TaskManager;
import todolist.classes.tasks.TaskableFactory;
import todolist.interfaces.app.IAppRunTaskables;

public class BasicToDoListApp extends BasicConsoleApp 
implements IAppRunTaskables {
	
	protected Scanner sc;
	
	protected TaskManager manager;
			
	public String PROMPT_NEW = "Enter new task";
	public String PROMPT_REMOVE = "Which task do you want to remove?";
	public String PROMPT_DO = "What would you like to do?";
//	public String PROMPT_MARK = "Which task do you want to mark complete?";
	public String PROMPT_ENTER = "Press [enter] to continue.";
	
	public static String MAINPAGE_HEADER = "Main";
	public static String TASKPAGE_HEADER = "Tasks";
	
	public BasicToDoListApp() {
		
		manager = TaskableFactory.getBasicTaskManager();
		sc = new Scanner(System.in);
	}
		
	// interface methods
	@Override
	public void runAppTaskable(boolean success, String successStr, String failStr) {
		
		if ( !success) {
			toConsole("\r\n" + failStr);
		} 
		else {
			toConsole("\r\n" + successStr);
		}
		
		toConsole("\r\nManaged size: " + 
				manager.getManaged().size());
		
		toConsole("");
	}
	
	// override methods
	@Override
	public boolean runApp()
	{
		// Set isDone to false.
		boolean isDone = false;
		
		// While isDone not true.
		while (!isDone) {
			
			isDone = runTasks();	
		}
		
		return true;
	}
	
	// public
	public boolean runAddTask() {
		String description = enterFromConsole(PROMPT_NEW);
		int nextId = manager.determineNextManageableId();
		manager.addToManaged(
				TaskableFactory.getCompleteableTask(
						nextId, description, false)
				);
		return true;

	}
		
	public boolean runRemoveTask() {
		boolean tasksAvailable = displayTasks();	
		if (tasksAvailable) {

			int manageableId = selectFromConsole(PROMPT_REMOVE);
			manager.removefromManaged(manageableId);

			return true;
		} else {
			System.out.println("No tasks found.");
		}

		return false;
	}
	
	public boolean runListAllTasks() {
		boolean tasksAvailable = displayTasks();	
		if (tasksAvailable) {
			
			System.out.println("Managed size: " + 
								manager.getManaged().size());
			enterFromConsole(PROMPT_ENTER); // No Integer check.
			
		} else {
			System.out.println("No tasks found.");
		}
		System.out.println();
		return true;
	}
	
//	public void runMarkTaskComplete() {
//		boolean tasksAvailable = displayTasks();
//		if (tasksAvailable) {
//			
//			runTaskable(
//					AppRunCompleteableTaskUpdate.markComplete(
//							selectFromConsole(PROMPT_MARK), 
//							manager),
//					"Unable to mark complete."	
//			);
//		}
//	}

	// class methods
	public int displayMainPageAndGetSelection() {
		displayMainPage();		
		return selectFromConsole(PROMPT_DO);
	}
	
	public void displayMainPage() {
		String[] mainpage = {
				"Add a Task",
				"Remove a Task",
//				"Mark a Task Complete",
				"List all Tasks",
		};
		
		int i = 1;
		for(String task : mainpage) {
			toConsole(i + ". " + task.toString());
			i++;
		}
		toConsole("");
	}
	
	public boolean displayTasks() {
		
		if (manager.isManagedEmpty()) {
			return false;
		}
		String[] tasks = manager.ManagedtoString();
		if (tasks != null && tasks.length>0) {
			toConsole(tasks);
		}	
		return true;
	}
	
	public boolean runTasks() {
		// Display Main Page.
		// Prompt.
		// Get User Choice.			
		int choice = displayMainPageAndGetSelection();
		System.out.println();
		
		switch (choice) {
		
		// Choice = Add a task.
		case 1:
			runAppTaskable(runAddTask(),
						"Task Added!",
						"Task Not Added.");
			break;

		// Choice = Remove a task.
		case 2:
			runAppTaskable(runRemoveTask(),
					"Task Removed!",
					"Task Not Removed.");
			break;

		// Choice = Make task complete.
//		case 3:
//			runMarkTaskComplete();
//			break;
		
		// Choice = List all tasks.
		case 3:
			runAppTaskable(runListAllTasks(),
					"Tasks Listed!",
					"Tasks Not Listed.");
			break;
				
		// If out of range, isDone is true;
		default:
			return true;				
		}
		
		return false;
	}
		
	public static void main(String[] args) {
		
		BasicToDoListApp lister = new BasicToDoListApp();
		lister.run();
	}
	
}



	

	
