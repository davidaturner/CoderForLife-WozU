package taskmanager.factories;

import taskmanager.classes.CompleteableTask;
import taskmanager.interfaces.Taskable;
import taskmanager.interfaces.TaskableFactory;

public class CompleteableTaskFactory extends TaskableFactory {
	
	@Override
	public Taskable createTask(int id, String description) {
		CompleteableTask taskToBeCreated = new CompleteableTask();
		taskToBeCreated.setId(id);
		taskToBeCreated.setDescription(description);
		taskToBeCreated.setComplete(false);
		taskToBeCreated.setArchived(false);
		return taskToBeCreated;
	}
	
	@Override
	public Taskable destroyTask(int taskid, Taskable[] listing) {
		CompleteableTask taskToBeArchived = (CompleteableTask)findTask(taskid, listing);
		if (taskToBeArchived != null) {
			taskToBeArchived.setArchived(true);
			return taskToBeArchived;
		}
		return null;
	}
	
	public Taskable markTaskAsComplete(int taskid, Taskable[] listing) {
		CompleteableTask taskToBeCompleted = (CompleteableTask)findTask(taskid, listing);
		if (taskToBeCompleted != null) {
			taskToBeCompleted.setComplete(true);
			return taskToBeCompleted;
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
