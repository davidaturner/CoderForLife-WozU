package org.davidaturner.factories;

import java.util.ArrayList;

import org.davidaturner.classes.SimpleTask;
import org.davidaturner.interfaces.ITask;

public class TaskFactory {

	public static final String MAIN_ADD = "Add a task";
	public static final String MAIN_REMOVE = "Remove a task";	
	public static final String MAIN_MARK_COMPLETE = "Mark a task complete";
	public static final String MAIN_LIST = "List the tasks";
	
	public static ArrayList<ITask> createforMain() {
		ArrayList<ITask> maintasks = new ArrayList<>();
		maintasks.add( TaskFactory.createforMain(MAIN_ADD));
		maintasks.add( TaskFactory.createforMain(MAIN_REMOVE));
		maintasks.add( TaskFactory.createforMain(MAIN_MARK_COMPLETE));
		maintasks.add( TaskFactory.createforMain(MAIN_LIST));
		return maintasks;
	}
	public static ITask createforMain(String description) {
		
		switch (description) {
		case MAIN_ADD:
			return new SimpleTask(1, MAIN_ADD);
		case MAIN_REMOVE:
			return new SimpleTask(2, MAIN_REMOVE);
		case MAIN_MARK_COMPLETE:
			return new SimpleTask(3, MAIN_MARK_COMPLETE);
		case MAIN_LIST:
			return new SimpleTask(4, MAIN_LIST);
		default:
			break;
		}
		
		return null;
	}
	
	public static ITask createforSimple(int id, String description) {
		return new SimpleTask(id, description);
	}
	
	public static void main(String[] args) {
		
		ArrayList<ITask>tasks = new ArrayList<>();		
		tasks.add(createforSimple(1, MAIN_ADD));
		tasks.add(createforSimple(10, MAIN_REMOVE));
		
		for(ITask task : tasks) {
			System.out.println(task.getId() + " - " + task.getDescription());
		}

	}

}
