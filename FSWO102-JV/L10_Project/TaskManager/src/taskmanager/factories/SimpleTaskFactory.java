package taskmanager.factories;

import taskmanager.classes.SimpleTask;
import taskmanager.interfaces.Taskable;
import taskmanager.interfaces.TaskableFactory;

public class SimpleTaskFactory extends TaskableFactory {


	@Override
	public Taskable createTask(int id, String description) {
		SimpleTask taskToBeCreated = new SimpleTask();
		taskToBeCreated.setId(id);
		taskToBeCreated.setDescription(description);
		return taskToBeCreated;
	}

	@Override
	public Taskable destroyTask(int taskid, Taskable[]listing) {
		return findTask(taskid, listing);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
