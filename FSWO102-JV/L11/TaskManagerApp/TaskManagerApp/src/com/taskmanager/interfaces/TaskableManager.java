package com.taskmanager.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class TaskableManager {

	private List<ITaskable> tasks = new ArrayList<ITaskable>();
	
	private int perPage = 0;
	private int current = 0;
	
	public void add(ITaskable task) {
		tasks.add(task);
	}

	public ITaskable remove(int taskId) {
		ITaskable taskToBeRemoved = null;
		for (ITaskable task : tasks) {
			if (task.getId() == taskId) {
				taskToBeRemoved = task;
				break;
			}
		}
		if( taskToBeRemoved != null) {
			tasks.remove(taskToBeRemoved);
		}
		return taskToBeRemoved;
	}

	public ITaskable[] list() {
		perPage = 0;
		current = 0;
		if (tasks != null && !tasks.isEmpty()) {
			return (ITaskable[])tasks.toArray();
		}
		return null;
	}
	
	public ITaskable[] list(ITaskable[] newtasks) {
		tasks = new ArrayList<ITaskable>();
		for(int i=0;i<newtasks.length;i++) {
			tasks.add(newtasks[i]);
		}
		return list();
	}
	
	public ITaskable[] top() {
		return null;
	}
	public ITaskable[] next() {
		return null;
	}
	public ITaskable[] previous() {
		return null;
	}
	
	abstract public ITaskable update(ITaskable task);
	
	// Getters and setters
	public List<ITaskable> getTasks() {
		return tasks;
	}

	public void setTasks(List<ITaskable> tasks) {
		this.tasks = tasks;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	

}
