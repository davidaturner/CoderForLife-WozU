package com.taskmanager.factory;

import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.objects.SimpleTask;

public class SimpleTaskFactory extends TaskFactory {

	@Override
	public ITaskable create() {
		return create(SIMPLE);
	}

	@Override
	public ITaskable[] create(int numberToCreate) {
		return create(SIMPLE, numberToCreate);
	}
	
	@Override
	public ITaskable clone(ITaskable original) {
		SimpleTask cloned = (SimpleTask) create();
		cloned.setId(original.getId());
		cloned.setDescription(original.getDescription());
		return cloned;
	}
	
	public ITaskable createSimple(int id, String description) {
		SimpleTask simple = (SimpleTask) create();
		simple.setId(id);
		simple.setDescription(description);
		return simple;
	}
	
	public ITaskable[] createMain(String[] descriptions) {
		SimpleTask [] mainpage = (SimpleTask [])create(descriptions.length);
		for(int i=0;i<descriptions.length;i++) {
			mainpage[i].setId(i+1);
			mainpage[i].setDescription(descriptions[i]);		
		}
		return mainpage;
	}
	
	public static void main(String[] args) {
		int id = 1;
		String description = "Add a task";
		
		SimpleTaskFactory factory = new SimpleTaskFactory();
		
		ITaskable simple = (SimpleTask)factory.create();
		simple.setId(id);
		simple.setDescription(description);
		
		int newid = 18;
		ITaskable cloned = (SimpleTask)factory.clone(simple);
		cloned.setId(newid);
		
		System.out.println(simple.toString());
		System.out.println(cloned.toString());
		System.out.println();
		
		String[] descriptions = {
				"Add a task",
				"Remove a task",
				"Mark a task complete",
				"List all tasks"
		};
		
		String prompt = "What would you like to do?";
		
		ITaskable[] mainpage = factory.createMain(descriptions);
		for(int i=0; i<mainpage.length;i++) {
			System.out.println(mainpage[i].toString());
		}
		System.out.println("\r\n" + prompt);

	}
}
