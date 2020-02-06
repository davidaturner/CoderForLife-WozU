package taskmanager.classes;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.ListableTask;

public class CompleteableTask extends SimpleTask {

	protected boolean completed;
	
	@Override
	public String listing() {
		return (listReady() && completed == true) ?
				super.listing() + " (Completed)!" : super.listing();
	}
	
	// Getters and Setters
	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	// Tests
	public static boolean RunTest01 () {
		List<ListableTask>listing = new ArrayList<>();
		
		CompleteableTask toBeAdded = new CompleteableTask();
		toBeAdded.setDescription("Make my bed");
		listing.add(toBeAdded);
		
		toBeAdded = new CompleteableTask();
		toBeAdded.setDescription("Brush my teeth");
		listing.add(toBeAdded);
		
		toBeAdded = new CompleteableTask();
		toBeAdded.setDescription("Eat breakfast");
		listing.add(toBeAdded);
		
		toBeAdded = new CompleteableTask();
		toBeAdded.setDescription("Code - Morning session");
		listing.add(toBeAdded);
		
		toBeAdded = new CompleteableTask();
		toBeAdded.setDescription("Eat lunch");
		listing.add(toBeAdded);
		
		toBeAdded = new CompleteableTask();
		toBeAdded.setDescription("Break - Afternoon session");
		listing.add(toBeAdded);
		
		int i=1;
		for(ListableTask toBeListed : listing) {
			String theListed = ((CompleteableTask)toBeListed).listing(i++);
			if (theListed == null) {
				return false;
			}
			System.out.println(theListed);
		}

		return true;
	}

}
