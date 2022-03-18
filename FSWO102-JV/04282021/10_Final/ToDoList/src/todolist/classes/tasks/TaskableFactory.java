package todolist.classes.tasks;

import java.util.ArrayList;
import java.util.List;

import todolist.interfaces.ITaskable;

public class TaskableFactory {

	// task manager creation
	public static TaskManager getBasicTaskManager()
	{
		TaskManager manager = new TaskManager();
		manager.setManaged(new ArrayList<ITaskable>());
		return manager;
	}
	
	public static TaskManagerWithView getBasicTaskManagerWithView()
	{
		TaskManagerWithView manager = new TaskManagerWithView();
		manager.setManaged(new ArrayList<ITaskable>());
		return manager;
	}
	
	// simple task creation
	public static ITaskable getSimpleTask(int id, String description) {
		return new SimpleTask(id, description);
	}

	// completeable task creation.
	public static ITaskable getCompleteableTask(int id, String description, 
			boolean complete) {
		return new CompleteableTask(id, description, complete);
	}
	
	public static ITaskable getCompleteableTask(ITaskable simple) {
		return new CompleteableTask(simple.getId(), simple.getDescription(), false);
	}
	
	// main page creation.	
	public static List<ITaskable>getMainPage(String[] descriptions) {
		List<ITaskable>tasks = new ArrayList<ITaskable>();

		int i=1;
		for(String description : descriptions) {
			tasks.add(getSimpleTask(i++, description));	
		}	
		
		return tasks;
	}
	
	// for testing purposes.	
	public static List<ITaskable>getTestMainPage()
	{
		String[] mainpage = new String[] {
				"Add a task",
				"Remove a task",
				"Set task to COMPLETE",
				"List all tasks"
		};
		return getMainPage(mainpage);
		
	}
	
	public static List<ITaskable>getTestTaskPage()
	{
		List<ITaskable>completeables = new ArrayList<ITaskable>();
		
		int i=1;
		completeables.add( getCompleteableTask(i++, "Wash my face", true));
		completeables.add( getCompleteableTask(i++, "Brush my teeth", false));
		completeables.add( getCompleteableTask(i++, "Put on a suit", false));
		completeables.add( getCompleteableTask(i++, "Eat breakfast", false));
		completeables.add( getCompleteableTask(i++, "Do the laundry", false));
		
		return completeables;
		
	}
	
	public static void main(String[] args) {
		int myid = 0;
		String mydescription = "Add a Task";
		SimpleTask simpleTask = (SimpleTask)TaskableFactory.getSimpleTask(myid, mydescription);
		System.out.println(simpleTask.toString());
		
		myid = 1;
		mydescription = "Wash my face";
		CompleteableTask completeableTask = (CompleteableTask)TaskableFactory.getCompleteableTask(myid, mydescription, true);
		System.out.println(completeableTask.toString());
		System.out.println("\r\n");
	}

}
