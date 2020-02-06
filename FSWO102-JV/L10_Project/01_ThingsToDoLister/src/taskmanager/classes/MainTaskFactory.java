package taskmanager.classes;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.ListableTask;

public class MainTaskFactory extends SimpleTask {

	public static String ADD_TASK = "Add a task";
	public static String REMOVE_TASK = "Remove a task";
	public static String MARK_TASK_COMPLETE = "Mark task as complete";
	public static String LIST_TASKS = "List the tasks";
	
	public static List<ListableTask> getTasks() {
		
		List<ListableTask>mainTasks = new ArrayList<>();
		
		int i = 1;
		SimpleTask task = new SimpleTask();
		task.setDescription(ADD_TASK);
		task.setListNumber(i++);
		mainTasks.add(task);
		
		task = new SimpleTask();
		task.setDescription(REMOVE_TASK);
		task.setListNumber(i++);
		mainTasks.add(task);
		
		task = new SimpleTask();
		task.setDescription(MARK_TASK_COMPLETE);
		task.setListNumber(i++);
		mainTasks.add(task);
		
		task = new SimpleTask();
		task.setDescription(LIST_TASKS);
		task.setListNumber(i++);
		mainTasks.add(task);
		
		return mainTasks;
	}


}
