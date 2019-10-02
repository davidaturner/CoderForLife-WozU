package org.davidaturner.classes;

import java.util.ArrayList;

import org.davidaturner.factories.ListboxFactory;
import org.davidaturner.factories.TaskFactory;
import org.davidaturner.interfaces.IListbox;
import org.davidaturner.interfaces.ITask;

public class SimpleTaskListbox implements IListbox {

	protected ArrayList<ITask>tasks;
	protected String prompt;
	protected int nextId;
	
	public SimpleTaskListbox(ArrayList<ITask>tasks, String prompt) {
		this.tasks = tasks;
		this.prompt = prompt;
	}
	
	@Override
	public void display() {
		for(ITask task : tasks) {
			System.out.println(task.toString());
		}
		System.out.println();
		System.out.println(prompt);
	}

	@Override
	public int determineNextId() {
		if (nextId == 0) {			
			for(ITask task : tasks) {
				int id = task.getId();
				if (id > nextId) {
					nextId = id;
				}
			}
		}
		
		return ++nextId;
	}
	
	@Override
	public int size() {
		return tasks.size();
	}
	
	
	public static void main(String[] args) {
		IListbox listbox = ListboxFactory.createforMain( TaskFactory.createforMain());
		System.out.println("Next Id: " + (listbox.determineNextId()));

	}

}
