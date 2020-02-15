package taskmanager.classes;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.Task;

public class SimpleTask extends Task {

	@Override
	public String listing() {
		return number + ". " + description;
	}

	public static void main(String[] args) {
		List<Task>tasks = new ArrayList<>();
		int i=1;
		SimpleTask task = new SimpleTask();
		task.setDescription("Add a task");
		task.setNumber(i++);
		tasks.add(task);
		
		task = new SimpleTask();
		task.setDescription("Remove a task");
		task.setNumber(i++);
		tasks.add(task);
		
		task = new SimpleTask();
		task.setDescription("Mark a task complete");
		task.setNumber(i++);
		tasks.add(task);
		
		task = new SimpleTask();
		task.setDescription("Show tasks");
		task.setNumber(i++);
		tasks.add(task);
		
		for(Task toBePrinted : tasks) {
			System.out.println(toBePrinted.listing());
		}
	}

}
