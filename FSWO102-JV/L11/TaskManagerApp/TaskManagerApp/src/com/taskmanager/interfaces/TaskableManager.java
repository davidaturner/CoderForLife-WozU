package com.taskmanager.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class TaskableManager {
	
	protected List<ITaskable> tasks = new ArrayList<ITaskable>();
	
	private int perPage;
	private int original, current;
	
	public void add(ITaskable toBeAdded) {
		toBeAdded.setId(getNextId());
		tasks.add(toBeAdded);
	}
	
	public ITaskable find(int toBeFound) {
		for(ITaskable task : tasks) {
			if (task.getId() == toBeFound) {
				return task;
			}
		}
		return null;
	}
	
	public ITaskable remove(int toBeRemoved) {
		ITaskable taskToBeRemoved = find(toBeRemoved);
		if (taskToBeRemoved != null) {
			tasks.remove(taskToBeRemoved);
		}
		return null;
	}
	
	public void update(ITaskable toBeUpdated) {
		ITaskable toBeRemoved = find(toBeUpdated.getId());
		if (toBeRemoved != null) {
			tasks.remove(toBeRemoved);
			tasks.add(toBeUpdated);
			sort();
		}
	}
	
	public ITaskable[] list() {
		if (tasks != null && !tasks.isEmpty()) {
			ITaskable[] listing = new ITaskable[tasks.size()];
			int i=0;
			for(ITaskable task : tasks) {
				listing[i] = task;
				i++;
			}
			return listing;
		}
		return null;
	}
	
	public boolean isPaged() {
		return (perPage > 0);
	}
	
	public ITaskable[] top() {
		current = 0;
		original = 0;
		return null;
	}
	
	public ITaskable[] next() {
		ITaskable[] page = new ITaskable[pagelength()];
		return null;
	}

	public ITaskable[] previous() {
		current = original;
		return null;
	}
	
	// Getters and Setters
	public List<ITaskable> getTasks() {
		return tasks;
	}
	public void setTasks(List<ITaskable> tasks) {
		this.tasks = tasks;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}

	// Support
	private int pagelength() {
		if (tasks == null || tasks.isEmpty()) {
			return 0;
		}
		return ((tasks.size()-current) < perPage)
				? tasks.size()-current : perPage;
	}
	private int getNextId() {
		int nextId = 1;
		if (tasks != null && !tasks.isEmpty()) {
			for(ITaskable task : tasks) {
				if (task.getId() >= nextId) {
					nextId = task.getId()+1;
				}
			}
		}
		return nextId;
	}
	
	//TODO: Improve sort() performance.
	private void sort() {
		int[] taskIds = new int[tasks.size()];
		int i=0;
		for(ITaskable task : tasks) {
			taskIds[i] = task.getId();
			i++;
		}
		Arrays.sort(taskIds);
		List<ITaskable>sorted = new ArrayList<>();
		for(i=0;i<taskIds.length;i++) {
			ITaskable taskToBeSorted = find(taskIds[i]);
			sorted.add(taskToBeSorted);
		}
		tasks = sorted;
	}
}
