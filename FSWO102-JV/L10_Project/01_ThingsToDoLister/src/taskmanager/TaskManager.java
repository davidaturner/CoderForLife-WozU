package taskmanager;

import java.util.List;

import taskmanager.designpatterns.CompleteableTaskFactory;
import taskmanager.designpatterns.CompleteableTaskViewBuilder;
import taskmanager.interfaces.Task;

public class TaskManager {
	
	public static int ERROR = -1;
		
	public static String[] mainPageTasks = {
			"Add a task",
			"Remove a task",
			"Mark task as complete",
			"Show tasks"	
	};
	public static String PRESS_ANY_KEY = "Press Enter to continue";
	
	public static List<Task> mainPage = null;
	public static CompleteableTaskFactory factory = new CompleteableTaskFactory();
	public static CompleteableTaskViewBuilder viewer = new CompleteableTaskViewBuilder();
	
	public static void main(String[] args) {

		openReader();
		
		declare("Welcome to Your-Things-To-Do!\r\n");	
						
		boolean done = false;
		while ( !done) {
			
			doMainPage();			
		
			int choice = getSelect();
			switch(choice) {
			case 0:
					doQuit();
					done = true;
					break;
			case 1:
					doAddTask();
					break;
			case 2:
					doRemoveTask();
					break;
			case 3:
					doMarkTaskComplete();
					break;
			case 4:
					doSelectTaskFromList(PRESS_ANY_KEY);
					break;
			default:
					declare("Invalid Choice. Try again?");
					break;
			}		
		}
		
		closeReader();
	
	}
	
	public static void doAddTask() {
		prompt("Enter new task: ");
		String description = getInput();
		Task task = factory.createTask();
		task.setDescription(description);
		viewer.setCandidate(task)
				.addtoModel()
				.buildView();
		doSelectTaskFromList(PRESS_ANY_KEY);
	}
	public static void doRemoveTask() {
		int number = doSelectTaskFromList("Enter task number to remove: ");
		Task task = factory.createTask();
		task.setNumber(number);
		viewer.setCandidate(task)
				.removefromModel()
				.buildView();
		doSelectTaskFromList(PRESS_ANY_KEY);
	}
	public static void doMarkTaskComplete() {
		int number = doSelectTaskFromList("Enter task number to mark complete: ");
		Task task = factory.createTask();
		task.setNumber(number);
		viewer.setCandidate(task)
				.updateModel()
				.buildView();
		doSelectTaskFromList(PRESS_ANY_KEY);
	}
	public static int doSelectTaskFromList(String prompt) {
		declare();
		printTasks(viewer.getView());
		if (prompt != null) {
			
			prompt(prompt);			
			if ( !prompt.equals(PRESS_ANY_KEY)) {
				return getSelect();
			} else {
				getInput();
			}
		}	
		return 0;
	}
	public static void doQuit() {
		declare("...DONE!\r\n");
	}
		
	public static void doMainPage() {
		
		if (mainPage == null) {
			mainPage = factory.createSimplePage(mainPageTasks);
		}
		printTasks(mainPage);
		prompt("What would you like to do? (0 to Quit) ");
	}
	
	// TaskManagerHelper simples.
	public static void openReader() {
		TaskManagerHelper.openReader();
	}
	public static void closeReader() {
		TaskManagerHelper.closeReader();
	}
	public static int getSelect() {
		return TaskManagerHelper.readUserSelect();
	}
	public static String getInput() {
		return TaskManagerHelper.readUserInput();
	}
	
	public static void declare() {
		TaskManagerHelper.declare("");
	}
	public static void declare(String message) {
		TaskManagerHelper.declare(message);
	}
	public static void prompt(String message) {
		TaskManagerHelper.prompt(message);
	}
	public static void printTasks(List<Task>tasks) {
		TaskManagerHelper.printTasks(tasks);
	}
	
}
