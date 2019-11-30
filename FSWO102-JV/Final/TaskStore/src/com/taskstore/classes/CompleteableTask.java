package com.taskstore.classes;

import com.taskstore.interfaces.ICompleteable;
import com.taskstore.interfaces.ITaskable;

public class CompleteableTask extends SimpleTask implements ICompleteable {

	boolean isCompleted;
	
	public CompleteableTask(String number, String description) {
		this(number, description, false);
	}
	public CompleteableTask(ITaskable simpleTask, boolean isCompleted) {
		this(simpleTask.getNumber(), simpleTask.getDescription(), isCompleted);
	}
	public CompleteableTask(String number, String description, boolean isCompleted) {
		super(number, description);
		this.isCompleted = isCompleted;
	}
	
	@Override
	public boolean isCompleted() {
		return isCompleted;
	}

	@Override
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String describe() {
		return number + ". " + description +
				((isCompleted==true)? "(Completed)" : "");
	}
}
