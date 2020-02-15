package taskmanager.interfaces;

import java.util.ArrayList;
import java.util.List;

import taskmanager.classes.SimpleTask;

public abstract class TaskFactory {

	abstract public Task createTask();
	
	abstract public Task createTask(String type);
	
	public List<Task> createTasks(String type, int listsize) {
		if (type != null && !type.isEmpty() && listsize > 0) {
			List<Task>tasks = new ArrayList<>();
			for(int i=0; i<listsize; i++) {
				Task task = createTask(type);
				if (task != null) {
					tasks.add(task);
				}
			}
			return tasks;
		}
		return null;
	}
	
	public List<Task>createSimplePage(String[] taskDescriptions) {
		if (taskDescriptions != null && taskDescriptions.length>0) {
			List<Task>tasks = new ArrayList<>();
			int listsize = taskDescriptions.length;
			int listNumber = 1;
			for(int i=0; i<listsize; i++) {
				Task task = new SimpleTask();
				task.setDescription(taskDescriptions[i]);
				task.setNumber(listNumber++);
				tasks.add(task);
			}
			return tasks;
		}
		return null;
	}
}
