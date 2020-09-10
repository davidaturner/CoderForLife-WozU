package com.taskmanager.controllers;

import com.taskmanager.factories.CompleteableTaskFactory;
import com.taskmanager.factories.SimpleTaskFactory;
import com.taskmanager.interfaces.ITaskFactoryViews;
import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.interfaces.TaskFactory;
import com.taskmanager.views.TaskFactoryConsole;

public class TaskManagerController {

	TaskFactory factory;
	ITaskFactoryViews views;
		
	public String[] MAIN_PAGE = {
			"Add a task",
			"Remove a task",
			"Mark a task complete",
			"List all tasks"
	};
	public String MAIN_PROMPT = "What would you like to do?";
	
	public TaskManagerController(TaskFactory factory, ITaskFactoryViews views) {
		this.factory = factory;
		this.views = views;
		
		views.setMainPage( (new SimpleTaskFactory()).createAll(MAIN_PAGE), 
				            MAIN_PROMPT);
	}
	
	public String[] mainpage() {
		
		return promptlisting(((TaskFactoryConsole)views).getMainPage(), 
							((TaskFactoryConsole)views).getMainPrompt());
	}
	
	public static void main(String[] args) {
		
		TaskManagerController controller = new TaskManagerController(
												new CompleteableTaskFactory(),
												new TaskFactoryConsole());
		displayPage(controller.mainpage());
	}
	
	private String[] promptlisting(ITaskable[] tasks, String prompt) {
		String[] page = new String[tasks.length+1];
		page[0] = prompt;
		for(int i=1; i<tasks.length+1; i++) {
			page[i] = tasks[i-1].toString();
		}
		return page;
	}
	
	private static void displayPage(String[] page) {
		for(int i=1; i<page.length;i++) {
			System.out.println(page[i]);
		}
		System.out.println("\r\n" + page[0]);
	}

}
