package taskmanager;

import java.util.ArrayList;

import taskmanager.classes.CompleteableTask;
import taskmanager.factories.CompleteableTaskFactory;
import taskmanager.interfaces.TaskManageable;
import taskmanager.interfaces.Taskable;
import taskmanager.interfaces.TaskableFactory;

public class TaskManager implements TaskManageable {

	protected TaskableFactory taskfactory;
	
	protected ArrayList<Taskable> listing;
	protected int nextTaskid;
	
	public TaskManager(TaskableFactory taskfactory) {
		this.taskfactory = taskfactory;
		
		listing = new ArrayList<Taskable>();
		nextTaskid = 1;
	}
	
	@Override
	public Taskable[] getListing(String prompt) {
		if (listing.size()>1) {
			Taskable[] tasks = new Taskable[listing.size()];
			for(int i=1;i<listing.size();i++) {
				tasks[i] = listing.get(i);
			}
			tasks[TaskableFactory.PROMPT_LINE] = taskfactory.createTask(
														TaskableFactory.PROMPT_LINE, 
														"\r\n" + prompt);
			return tasks;
		}
		return null;
	};

	@Override
	public void addToListing(String description) {
		Taskable taskToBeAdded = taskfactory.createTask(getNextTaskid(), description);
		if (listing.size()==0) {
			listing.add(taskfactory.createTask(TaskableFactory.PROMPT_LINE, TaskableFactory.PROMPT_DEFAULT));
		}
		listing.add(taskToBeAdded);
	}

	@Override
	public void removeFromListing(int taskid) {
		Taskable[] snap = taskfactory.snapshot(listing);
		Taskable taskToBeRemoved = taskfactory.destroyTask(taskid, snap);
		updateListing(taskid, taskToBeRemoved);
	}

	@Override
	public void updateListing(int taskid, Taskable task) {
		if (task == null) {
			return;
		}
		listing.set(taskid, task);		
	}
		
	private int getNextTaskid () {
		if (listing == null || listing.isEmpty()) {
			nextTaskid = 1;
		} else {
			for(Taskable task : listing) {
				if ( nextTaskid <= task.taskid()) {
					nextTaskid = task.taskid()+ 1;
				}				
			}
		}
		return nextTaskid;
	}

	@Override
	public TaskableFactory getTaskFactory() {
		return taskfactory;
	}


	public static void main(String[] args) {
		runTest02();		
	}
	
	// Tests
	public static void runTest01() {
		TaskManager tm = new TaskManager(new CompleteableTaskFactory());
		tm.addToListing("Wash my face");
		tm.addToListing("Brush my teeth");
		tm.displayListing(tm.listing);		
	}

	public static void runTest02 () {
		TaskManager tm = new TaskManager(new CompleteableTaskFactory());
		tm.addToListing("Wash my face");
		tm.addToListing("Brush my teeth");
		tm.displayListing(tm.getListing("What task would you like to mark 'complete'?"));
	}
	
	// Support Ops
	private void displayListing(ArrayList<Taskable>tasks) {
		if (tasks != null && tasks.size()>1) {
			for(int i=1;i<tasks.size();i++) {
				System.out.println(tasks.get(i).listing());
			}
			System.out.println(tasks.get(0).listing());
		}

	}
	private void displayListing(Taskable[]tasks) {
		if (tasks != null && tasks.length>1) {
			for(int i=1;i<tasks.length;i++) {
				System.out.println(tasks[i].listing());
			}
			System.out.println(tasks[0].listing());
		}

	}
}
