package taskmanager.interfaces;

import java.util.ArrayList;
import java.util.List;

import taskmanager.classes.SimpleTask;

public abstract class TaskFactory {

	public static String SIMPLE_TASK = "simple";
	public static String COMPLETEABLE_TASK = "completeable";
	
	abstract public Task createTask(String type);
	
	abstract public List<Task>createTasks(String type, int listsize);
	
	public List<Task>createTaskPage(List<String>taskDescriptions) {
		if (taskDescriptions != null && !taskDescriptions.isEmpty()) {
			int listsize = taskDescriptions.size();
			List<Task>tasks = createTasks(TaskFactory.SIMPLE_TASK, listsize);
			int listNumber = 1;
			for(int i=0; i<listsize; i++) {
				SimpleTask task = (SimpleTask)tasks.get(i);
				task.setDescription(taskDescriptions.get(i));
				task.setNumber(listNumber++);				
			}
			return tasks;
		}
		return null;
	}
}
