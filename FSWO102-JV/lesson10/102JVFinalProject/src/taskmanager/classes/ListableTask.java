package taskmanager.classes;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.Listable;
import taskmanager.interfaces.Taskable;

public class ListableTask extends SimpleTask implements Listable  {

	protected int number;

	@Override
	public String list() {
		return (isReady())?
				(number+1) + ". " + description : null;
	}

	@Override
	public String list(int number) {
		this.number = number;
		return list();
	}
	
	// Getter and setters
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	// Test
	public static boolean ListableTask01() {
		List<Taskable>tasks = new ArrayList<>();
		
		int i=0;
		ListableTask task = new ListableTask();
		task.setDescription("Add a task");
		task.setNumber(i++);
		String teststr = task.list();
		if (teststr == null) {
			return false;
		}
		System.out.println(teststr);
		
		task = new ListableTask();
		task.setDescription("Remove a task");
		task.setNumber(i++);
		teststr = task.list();
		if (teststr == null) {
			return false;
		}
		System.out.println(teststr);
		
		task = new ListableTask();
		task.setDescription("Make a task complete");
		task.setNumber(i++);
		teststr = task.list();
		if (teststr == null) {
			return false;
		}
		System.out.println(teststr);
		
		task = new ListableTask();
		task.setDescription("List the tasks");
		task.setNumber(i++);
		teststr = task.list();
		if (teststr == null) {
			return false;
		}
		System.out.println(teststr);
		
		return true;
	}
	
	public static boolean ListableTask02() {
		List<Taskable>tasks = new ArrayList<>();
		
		ListableTask task = new ListableTask();
		task.setDescription("Add a task");
		tasks.add(task);
		
		task = new ListableTask();
		task.setDescription("Remove a task");
		tasks.add(task);
		
		task = new ListableTask();
		task.setDescription("Make a task complete");
		tasks.add(task);
		
		task = new ListableTask();
		task.setDescription("List the tasks");
		tasks.add(task);
		
		for(int i=0; i<tasks.size(); i++) {
			ListableTask atask = (ListableTask)tasks.get(i);
			String teststr = atask.list(i);
			if (teststr == null) {
				return false;
			}
			System.out.println(teststr);
		}
		
		return true;
	}
}
