package com.taskmanager.controllers;

import com.taskmanager.factories.CompleteableTaskFactory;
import com.taskmanager.factories.SimpleTaskFactory;
import com.taskmanager.interfaces.ITaskFactoryViews;
import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.interfaces.TaskFactory;
import com.taskmanager.views.TaskFactoryConsole;

public class TaskManagerController {

	CompleteableTaskFactory factory;
	TaskFactoryConsole views;
	
	public String[] MAIN_PAGE = {
			"Add a task",
			"Remove a task",
			"Mark a task complete",
			"List all tasks"
	};
	public String MAIN_PROMPT = "What would you like to do?";
	
	public TaskManagerController(TaskFactory factory, ITaskFactoryViews views) {
		this.factory = (CompleteableTaskFactory) factory;
		this.views = (TaskFactoryConsole) views;
		
		views.setMainPage((new SimpleTaskFactory()).createAll(MAIN_PAGE), 
							MAIN_PROMPT);
	}
	
	// Get
	public void welcome() {
		System.out.println("\r\nWelcome to Task Manager!\r\n");
		mainpage();
	}
	public void mainpage() {
		displayPage( views.getMainPage(), views.getMainPrompt());
	}
	public void select(int taskId) {
	}
	public void addPage() {
	}
	public void removePage() {
	}
	public void listPage() {
	}
	public void topOfListPage() {
	}
	public void nextInListPage() {
	}
	public void prevInListPage() {
	}
	public void markCompletePage() {
	}
	
	// Post
	public void addTask(String taskDescription) {
	}
	
	// Delete
	public void removeTask(int taskId) {
	}
	
	// Put
	public void markTask(int taskId) {
	}
	
	// Support
	private void displayPage(ITaskable[]tasks, String prompt) {
		for(int i=0;i<tasks.length;i++) {
			System.out.println(tasks[i]);
		}
		System.out.println("\r\n" + prompt);
	}
	
	public static void main(String[] args) {
		
		TaskManagerController controller = new TaskManagerController(
												new CompleteableTaskFactory(),
												new TaskFactoryConsole());
		controller.welcome();
		
	}

}
