package taskmanager.classes;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.Task;

public class CompleteableTask extends Task {

	protected boolean complete;
	
	@Override
	public String listing() {
		return number + ". " + description + 
				((complete)?" (COMPLETE)" : "");
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public static void main(String[] args) {
		List<Task>tasks = new ArrayList<>();
		int i = 23;
		
		CompleteableTask task = new CompleteableTask();
		task.setDescription("Shower");
		task.setNumber(i++);
		task.setComplete(true);
		tasks.add(task);
		
		task = new CompleteableTask();
		task.setDescription("Shave");
		task.setNumber(i++);
		task.setComplete(false);
		tasks.add(task);
		
		task = new CompleteableTask();
		task.setDescription("Brush teeth");
		task.setNumber(i++);
		task.setComplete(true);
		tasks.add(task);
		
		task = new CompleteableTask();
		task.setDescription("Dress");
		task.setNumber(i++);
		task.setComplete(true);
		tasks.add(task);
		
		task = new CompleteableTask();
		task.setDescription("Eat breakfast");
		task.setNumber(i++);
		task.setComplete(true);
		tasks.add(task);
		
		task = new CompleteableTask();
		task.setDescription("Code");
		task.setNumber(i++);
		task.setComplete(false);
		tasks.add(task);
		
		for(Task toBePrinted : tasks) {
			System.out.println(toBePrinted.listing());
		}
	}

}
