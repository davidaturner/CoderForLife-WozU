package factories;

import java.util.ArrayList;

import classes.CompleteableTask;
import classes.Task;

public class TaskFactory {
	
	static private ArrayList<Task> completeableTasks = new ArrayList<>();
	
	// Create
	static public void addCompleteableTask(String description) {
		completeableTasks.add(createCompleteableTask(getNextTaskId(), description));
	}

	
	// Read
	static public ArrayList<Task> getMainTasks() {
		ArrayList<Task> mainTasks = new ArrayList<>();
		mainTasks.add(createSimpleTask(1, "Add a task"));
		mainTasks.add(createSimpleTask(2, "Remove a task"));
		mainTasks.add(createSimpleTask(3, "Mark Task as complete"));
		mainTasks.add(createSimpleTask(4, "List all tasks"));
		return mainTasks;
	}	
	
	static public ArrayList<Task>getCompleteableTasks() {
		return getCompleteableTasks(0, completeableTasks.size());
	}
	static public ArrayList<Task>getCompleteableTasks(int start, int numOfTasks) {
		ArrayList<Task>selected = new ArrayList<>();
		if (completeableTasks.size() > start + numOfTasks) {
			for( int i = start; i<start+numOfTasks; i++) {
				selected.add(completeableTasks.get(i));
			}
		}
		return selected;
	}
	static public boolean selectCompleteableTasks(int selected, ArrayList<Task>tasks) {
		Task selectedTask = tasks.get(selected);
		for(Task task : tasks) {
			if (task.getId() == selectedTask.getId()) {
				task.select();
				return true;
			}
		}
		return false;
	}
	static public void clearSelectCompleteableTasks() {
		for (Task task : completeableTasks) {
			task.unselect();
		}
	}

	
	// Update
	static public void completeCompleteableTasks() {
		for(Task task : completeableTasks) {
			if (task.isSelected()) {
				((CompleteableTask)task).complete();
				clearSelectCompleteableTasks();
				break;
			}
		}
	}
	
	
	// Delete
	static public Task removeCompleteableTasks() {
		for(Task task : completeableTasks) {
			if (task.isSelected()) {
				completeableTasks.remove(task);
				clearSelectCompleteableTasks();
				return task;
			}
		}
		return null;
	}
	
	
	// Private
	static public Task createSimpleTask(int id, String description) {
		return new Task(id, description);
	}
	static public Task createCompleteableTask(int id, String description) {
		return createCompleteableTask(id, description, false);
	}
	static public Task createCompleteableTask(int id, String description, boolean isCompleted) {
		return new CompleteableTask(id, description, isCompleted);
	}
	static private int getNextTaskId() {
		int getNext = 0;
		for(Task task : completeableTasks) {
			if (task.getId() > getNext) {
				getNext = task.getId();
			}
		}
		return getNext + 1;
	}

	static private void showTasks(ArrayList<Task>tasksToBeDescribed) {
		int i = 1;
		for(Task task : tasksToBeDescribed) {
			System.out.println(task.printAs(i));
			i++;
		}
	}
	
	// Main (Testing purposes only)
	public static void main(String[] args) {

		TaskFactory test = new TaskFactory();
		TaskFactory.showTasks(test.getTestCompleteables());

	}
	
	// Testing
	public ArrayList<Task> getTestCompleteables() {
		
		ArrayList<Task> testTasks = new ArrayList<>();
		testTasks.add(createCompleteableTask(1, "Do Homework", false));
		testTasks.add(createCompleteableTask(1, "Read programming blog", true));
		testTasks.add(createCompleteableTask(3, "Spend time with family", false));
		testTasks.add(createCompleteableTask(4, "Watch the new season of a cool show", true));
		
		return testTasks;
	}

}
