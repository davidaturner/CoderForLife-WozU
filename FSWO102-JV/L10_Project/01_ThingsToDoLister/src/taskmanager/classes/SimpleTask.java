package taskmanager.classes;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.OrderListable;

public class SimpleTask implements OrderListable {

	protected int listNumber;
	protected String description;

	@Override
	public int getNextNumber(List<OrderListable> ordered) {
		if (ordered != null && !ordered.isEmpty()) {
			OrderListable listing = ordered.get(ordered.size()-1);
			return listing.getListNumber() + 1;
		}
		return ITEM_NOT_FOUND;
	}
	@Override
	public String findByListNumber(int selected, List<OrderListable> ordered) {
		for(OrderListable listing : ordered) {
			if (listing.getListNumber() == selected) {
				return listing.getDescription();
			}
		}
		return null;
	}
	@Override
	public String listing() {
		return listNumber + ". " + description;
	}
	@Override
	public List<String> listing(List<OrderListable> ordered) {
		List<String>toBeDisplayed = new ArrayList<>();
		if (ordered != null && !ordered.isEmpty()) {
			for(OrderListable listing : ordered) {
				SimpleTask task = (SimpleTask)listing;
				toBeDisplayed.add(task.listing());
			}
			return toBeDisplayed;
		}
		return null;
	}
	@Override
	public List<String> listing(int starting, List<OrderListable> ordered) {
		if (ordered != null && !ordered.isEmpty()) {
			int listNumber = starting;
			for(OrderListable listing : ordered) {
				SimpleTask task = (SimpleTask)listing;
				task.setListNumber(listNumber++);
			}
			return listing(ordered);
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
	public static void main(String[]args) {
		RunTest01();
	}
	public static boolean RunTest01() {
		List<OrderListable>toBeListed = new ArrayList<>();
		
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
		
		OrderListable viewer = new SimpleTask();
		List<String>listElements = viewer.listing(1, toBeListed);
		for(String taskstr : listElements) {
			System.out.println(taskstr);
		}
		
		
		return true;

	}
	
}
