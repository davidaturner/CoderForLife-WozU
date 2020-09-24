package com.taskmanager.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.taskmanager.factories.SimpleTaskFactory;

public abstract class TaskableManager {
	
	protected List<ITaskable> tasks = new ArrayList<ITaskable>();
	
	private int perPage;
	private int current;
	
	final static String FORWARD_PAGE = "f";
	final static String BACKWARD_PAGE = "b";
	final static String TOP_PAGE = "t";
	
	private int remainder;	
	
	public ITaskable add(ITaskable toBeAdded) {
		if (toBeAdded.getId() == 0) {
			toBeAdded.setId(getNextId());			
		}
		tasks.add(toBeAdded);
		return toBeAdded;
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
			return taskToBeRemoved;
		}
		return null;
	}
	
	public ITaskable update(ITaskable toBeUpdated) {
		ITaskable toBeRemoved = find(toBeUpdated.getId());
		if (toBeRemoved != null) {
			remove(toBeRemoved.getId());
			ITaskable updated = add(toBeUpdated);
			sort();
			return updated;
		}
		return null;
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
	
	public ITaskable[] list(String direction) {		
		if (direction == null || !isPaged()) {
			return list();
		}	
		if (tasks != null && !tasks.isEmpty()) {			
			int numberOfTasks = determinePagelength(direction);
			switch(direction) {
			case FORWARD_PAGE:
				return next(numberOfTasks);
			case BACKWARD_PAGE:
				return previous(numberOfTasks);
			case TOP_PAGE:
				return top(numberOfTasks);
			default:
				break;				
			}		
		}		
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
	public boolean isPaged() {
		boolean result = perPage > 0;
		if ( !result) {
			current = 0;
			remainder = 0;
		}
		return result;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getRemainder() {
		return remainder;
	}
	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}

	// Support
	private ITaskable[] top(int pagelength) {
		current = 0;
		return next(pagelength);
	}
	
	private ITaskable[] next(int pagelength) {
		
		if (pagelength == 0) {
			current -= remainder;
			pagelength = remainder;
		}
		
		if (pagelength > 0) {
			ITaskable[] listing = new ITaskable[pagelength];
			int i = 0;
			for(int index=current; index<current+pagelength; index++) {
				listing[i] = tasks.get(index);
				i++;
			}
			current +=pagelength;
			determineRemainder();

			return listing;			
		}
				
		return null;

	}
	
	private ITaskable[] previous(int pagelength) {
		if (current <= perPage) {
			current -= remainder;
		}
		else {
			current -= remainder + pagelength;
		}
		return next(pagelength);
	}
	
	private void determineRemainder() {
		remainder = 0;		
		if (perPage > 0) {
			if (perPage == 1) {
				remainder = 1;
			}
			else {
				remainder = current % perPage;
				if (remainder == 0 && current >= perPage) {
					remainder = perPage;
				}				
			}
		}
	}

	private int determinePagelength(String direction) {
		if (tasks != null && !tasks.isEmpty() && isPaged()) {			
			switch(direction) {
			case TOP_PAGE:
				return (tasks.size() > perPage)?perPage:tasks.size();
			case FORWARD_PAGE:
				return (tasks.size() > current + perPage)?perPage:tasks.size() - current;
			case BACKWARD_PAGE:
				return (current - perPage > 0)?perPage: current;
			default:
				break;
			}
		}
		return 0;
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
