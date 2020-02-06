package taskmanager.classes;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.ListableTask;

public class SimpleTask implements ListableTask {

	protected int listNumber;
	protected String description;
	
	@Override
	public boolean listReady() {
		return (listNumber  > 0 && 
				description != null && !description.isEmpty()) ?
						true : false;
	}
	@Override
	public String listing() {
		return (listReady()) ? listNumber + ". " + description : null;
	}
	@Override
	public String listing(int listNumber) {
		this.listNumber = listNumber;
		return listing();
	}
	@Override
	public List<String> listing(List<ListableTask> list) {
		if (list != null) {
			List<String> l = new ArrayList<>();
			for(ListableTask toBeDisplayed : list) {
				l.add(toBeDisplayed.listing());
			}
			return l;
		}
		return null;
	}
	@Override
	public List<String> listing(int starting, List<ListableTask> list) {
		if (list != null) {
			List<String>l = new ArrayList<>();
			int i = starting;
			for(ListableTask toBeDisplayed : list) {
				l.add(toBeDisplayed.listing(i++));
			}
			return l;
		}
		return null;
	}
	
	// Getters and Setters
	public int getListNumber() {
		return listNumber;
	}
	public void setListNumber(int listNumber) {
		this.listNumber = listNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	// Tests
	public static boolean RunTest01() {
		List<ListableTask>toBeListed = new ArrayList<>();
		
		SimpleTask taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription("Add a task");
		toBeListed.add(taskToBeAdded);
		
		taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription("Remove a task");
		toBeListed.add(taskToBeAdded);
		
		taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription("Mark a task complete");
		toBeListed.add(taskToBeAdded);
		
		taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription("List the tasks");
		toBeListed.add(taskToBeAdded);
		
		ListableTask viewer = new SimpleTask();
		List<String>listElements = viewer.listing(1, toBeListed);
		for(String taskstr : listElements) {
			System.out.println(taskstr);
		}
		
		
		return true;

	}
	
}
