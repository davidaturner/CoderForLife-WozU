package com.taskmanager.controller;

import com.taskmanager.interfaces.ITaskManager;

public class TaskController {

	private ITaskManager manager;
	
	public TaskController(ITaskManager manager) {
		this.manager = manager;
	}
	
	public void run() {
		manager.run();
	}
	
	public static String getMainPage(boolean needInstruction) {
		return null;
	}
	
	public static String getCreateTaskPage() {
		return null;
	}
	
	public static String getListTaskPage() {
		return null;
	}

	public static String getUpdateTaskPage() {	
		return null;
	}

	public static String getDeleteTaskPage() {
		return null;
	}
	
	public static void create(String taskDescription) {
	}
	
	public static void submit(int choice) {
	}
	
	
	public static void main(String[] args) {
		TaskController controller = new TaskController( new CompleteableTaskManagerConsole());
		controller.run();
	}

}
