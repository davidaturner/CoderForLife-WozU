package todolist;

import todolist.classes.tasks.CompleteableTask;
import todolist.interfaces.app.IAppRunTaskables;

public class CompleteableToDoListApp extends BasicToDoListApp 
implements IAppRunTaskables {
	
//	protected Scanner sc;
//	
//	protected TaskManager manager;
	
//	public String PROMPT_NEW = "Enter new task";
//	public String PROMPT_REMOVE = "Which task do you want to remove?";
//	public String PROMPT_DO = "What would you like to do?";
	public String PROMPT_MARK = "Which task do you want to mark complete?";
//	public String PROMPT_ENTER = "Press [enter] to continue.";
	
//	public static String MAINPAGE_HEADER = "Main";
//	public static String TASKPAGE_HEADER = "Tasks";
	
	public CompleteableToDoListApp() {
		
//		manager = TaskableFactory.getBasicTaskManager();
//		sc = new Scanner(System.in);
	}
		
	// interface methods
//	@Override
//	public void runTaskable(boolean success, String unableTo) {
//		
//		if ( !success) {
//			System.out.println("Unable to add.");
//		} 
//		System.out.println("Managed size: " + 
//				manager.getManaged().size());
//		
//		System.out.println();		
//	}
	
	// override methods
	@Override
	public void displayMainPage() {
		String[] mainpage = {
				"Add a Task",
				"Remove a Task",
				"Mark a Task Complete",
				"List all Tasks",
		};
		
		int i = 1;
		for(String task : mainpage) {
			toConsole(i + ". " + task.toString());
			i++;
		}
		toConsole("");
	}
	
//	@Override
//	public boolean runApp()
//	{
//		// Set isDone to false.
//		boolean isDone = false;
//		
//		// While isDone not true.
//		while (!isDone) {
//			
//			isDone = runTasks();	
//		}
//		
//		return true;
//	}
	
	// public
//	public void runAddTask() {
//		
//		runTaskable(
//				AppRunCompleteableTaskAdd.add(
//						manager.determineNextManageableId(),
//						enterFromConsole(PROMPT_NEW), manager), 
//				"Unable to add."
//		);
//	}

//	public void runRemoveTask() {
//		boolean tasksAvailable = displayTasks();
//		if (tasksAvailable) {
//			
//			runTaskable(
//					AppRunCompleteableTaskRemove.remove(
//							selectFromConsole(PROMPT_REMOVE), manager), 
//					"Unable to Remove."
//			);
//		}
//	}
//	
//	public void runListAllTasks() {
//		boolean tasksAvailable = displayTasks();	
//		if (tasksAvailable) {
//			
//			System.out.println("Managed size: " + 
//								manager.getManaged().size());
//			enterFromConsole(PROMPT_ENTER); // No Integer check.
//			
//		} else {
//			System.out.println("No tasks found.");
//		}
//		System.out.println();
//	}
	
	public boolean runMarkTaskComplete() {
		boolean tasksAvailable = displayTasks();	
		if (tasksAvailable) {

			int manageableId = selectFromConsole(PROMPT_MARK);

			CompleteableTask toBeUpdated = (CompleteableTask)manager
													.findInManaged(manageableId);
			if (toBeUpdated != null) {
				toBeUpdated.setComplete(true);
				manager.updateInManaged(toBeUpdated);
				
				return true;
			}
			
		} else {
			System.out.println("No tasks found.");
		}
		System.out.println();
		return false;

	}

	// class methods
//	public int displayMainPageAndGetSelection() {
//		displayMainPage();		
//		return selectFromConsole(PROMPT_DO);
//	}
	
//	public void displayMainPage(String[]mainpage) {
//		
//		int i = 1;
//		for(String task : mainpage) {
//			toConsole(i + ". " + task.toString());
//			i++;
//		}
//		toConsole("");
//	}
	
//	public boolean displayTasks() {
//		
//		if (manager == null) {
//			return false;
//		}
//		String[] tasks = manager.ManagedtoString();
//		if (tasks != null && tasks.length>0) {
//			toConsole(tasks);
//		}	
//		return true;
//	}
	
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
					"Unable to Add");
			break;

		// Choice = Remove a task.
		case 2:
			runAppTaskable(runRemoveTask(),
					"Operation successful!",
					"Unable to Remove");			
			break;

		// Choice = Make task complete.
		case 3:
			runAppTaskable(runMarkTaskComplete(),
					"Task Marked COMPLETE!",
					"Unable to Update.");			
			break;
		
		// Choice = List all tasks.
		case 4:
			runAppTaskable(runListAllTasks(),
					"Tasks Listed!",
					"Unable to List.");
			break;
				
		// If out of range, isDone is true;
		default:
			return true;				
		}
		
		return false;
	}
		
	public static void main(String[] args) {
		
		CompleteableToDoListApp lister = new CompleteableToDoListApp();
		lister.run();
	}
	
}



	

	
