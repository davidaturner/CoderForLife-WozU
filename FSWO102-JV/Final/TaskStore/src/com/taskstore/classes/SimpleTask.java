package com.taskstore.classes;

import com.taskstore.interfaces.ITaskable;

public class SimpleTask implements ITaskable {

	protected String number;
	protected String description;
	
	public SimpleTask(String number, String description) {
		this.number = number;
		this.description = description;
	}
	
	@Override
	public String getNumber() {
		return number;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String describe() {
		return number + ". " + description;
	}

}
