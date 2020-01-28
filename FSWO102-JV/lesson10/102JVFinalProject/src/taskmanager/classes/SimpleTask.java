package taskmanager.classes;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.Taskable;

public class SimpleTask implements Taskable {
	protected String description;

	@Override
	public String display() {
		return (isReady())? description : null;
	}
	@Override
	public boolean isReady() {
		return (description != null && !description.isEmpty())?
				true : false;
	}
	
	// Getters and setters
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	// Tests
	public static boolean SimpleTaskTest01() {
		
		List<Taskable>tasks = new ArrayList<>();
		
		SimpleTask task = new SimpleTask();
		task.setDescription("Add a task");
		tasks.add(task);
		
		task = new SimpleTask();
		task.setDescription("Remove a task");
		tasks.add(task);
		
		task = new SimpleTask();
		task.setDescription("Mark a task complete");
		tasks.add(task);
		
		task = new SimpleTask();
		task.setDescription("List the tasks");
		tasks.add(task);
		
		for(Taskable atask : tasks) {
			String teststr = atask.display();
			if (teststr == null) {
				return false;
			}
			System.out.println(teststr);
		}
		
		return true;
	}

}
