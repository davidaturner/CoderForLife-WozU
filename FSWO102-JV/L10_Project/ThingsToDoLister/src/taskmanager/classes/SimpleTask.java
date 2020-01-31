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
	public void display(List<ListableTask> listing) {
		if (listing != null) {
			for(ListableTask toBeDisplayed : listing) {
				System.out.println(toBeDisplayed.listing());
			}
		}	
	}
	@Override
	public void display(int starting, List<ListableTask> listing) {
		if (listing != null) {
			int i = starting;
			for(ListableTask toBeDisplayed : listing) {
				System.out.println(toBeDisplayed.listing(i));
			}
		}	
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
		List<ListableTask>listing = new ArrayList<>();
		
		SimpleTask taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription("Add a task");
		listing.add(taskToBeAdded);
		
		taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription("Remove a task");
		listing.add(taskToBeAdded);
		
		taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription("Mark a task complete");
		listing.add(taskToBeAdded);
		
		taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription("List the tasks");
		listing.add(taskToBeAdded);
		
		if (listing != null && !listing.isEmpty()) {
			
			int i=1; // Initial task listing.			
			for(ListableTask toBeListed : listing) {
				String theListed = ((SimpleTask)toBeListed).listing(i++);
				if (theListed == null) {
					return false;
				}
				System.out.println(theListed);
			}
		}
		
		return true;

	}
	
}
