package taskmanager;

import java.util.ArrayList;
import java.util.List;

import taskmanager.classes.SimpleTask;

public class TaskManager {

	public static void main(String[] args) {

		List<SimpleTask> tasks = new ArrayList<>();

		int i = 0;
		SimpleTask candidate = new SimpleTask();
		
		candidate.setNumber(i++);
		candidate.setDescription("Add a task");
		tasks.add(candidate);
		
		candidate = new SimpleTask();
		candidate.setNumber(i++);
		candidate.setDescription("Remove a task");	
		tasks.add(candidate);
		
		candidate = new SimpleTask();
		candidate.setNumber(i++);
		candidate.setDescription("Mark a task complete");
		tasks.add(candidate);
		
		candidate = new SimpleTask();
		candidate.setNumber(i++);
		candidate.setDescription("List the tasks");
		tasks.add(candidate);
		
		for(SimpleTask task : tasks) {
			System.out.println(task.lister());
		}

	}

}
