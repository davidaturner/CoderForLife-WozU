package taskmanager.classes;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.OrderListable;

public class CompleteableTask extends SimpleTask {

	boolean complete;
	
	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	@Override
	public String listing() {
		return listNumber + ". " + description +
				(isComplete()?" (COMPLETE)":"");
	}

	public static void main(String[] args) {
		RunTest01();
	}
	
	public static boolean RunTest01() {
		List<OrderListable>toBeListed = new ArrayList<>();
		
		CompleteableTask taskToBeAdded = new CompleteableTask();
		taskToBeAdded.setDescription("Shower");
		taskToBeAdded.setComplete(true);
		toBeListed.add(taskToBeAdded);
		
		taskToBeAdded = new CompleteableTask();
		taskToBeAdded.setDescription("Brush my teeth");
		taskToBeAdded.setComplete(true);
		toBeListed.add(taskToBeAdded);
		
		taskToBeAdded = new CompleteableTask();
		taskToBeAdded.setDescription("Eat breakfast");
		taskToBeAdded.setComplete(true);
		toBeListed.add(taskToBeAdded);
		
		taskToBeAdded = new CompleteableTask();
		taskToBeAdded.setDescription("Coding for 4 hours");
		toBeListed.add(taskToBeAdded);
		
		OrderListable viewer = new CompleteableTask();
		List<String>listElements = viewer.listing(10, toBeListed);
		for(String taskstr : listElements) {
			System.out.println(taskstr);
		}
			
		return true;	
	}

}
