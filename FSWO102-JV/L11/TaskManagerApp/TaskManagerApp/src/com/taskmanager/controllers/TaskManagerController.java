package com.taskmanager.controllers;

import com.taskmanager.interfaces.ITaskableView;
import com.taskmanager.interfaces.TaskableManager;

public class TaskManagerController {

	private TaskableManager manager;
	private ITaskableView view;
	
	public static final String ADD_TASK = "Add";
	public static final String REMOVE_TASK = "Remove";
	public static final String UPDATE_TASK = "Update";
	public static final String LIST_TASKS = "List";
	
	public static final String MAIN_TASKS = "Main";

	public String[] MAIN_PAGE = {
			"Add a task",
			"Remove a task",
			"Mark a task complete",
			"List all tasks"
	};
	public String MAIN_PROMPT = "What would you like to do (1, 2, 3, 4, 5)?";
	
	public TaskableManager getManager() {
		return manager;
	}
	public void setManager(TaskableManager manager) {
		this.manager = manager;
	}
	public ITaskableView getView() {
		return view;
	}
	public void setView(ITaskableView view) {
		this.view = view;
	}	
}
