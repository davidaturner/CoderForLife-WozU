package com.taskmanager.views;

import com.taskmanager.factory.SimpleTaskFactory;
import com.taskmanager.factory.TaskFactory;
import com.taskmanager.interfaces.ITaskManagerViews;
import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.objects.CompleteableTask;

public class TaskManagerViewsConsole implements ITaskManagerViews {

	private SimpleTaskFactory factory;
	
	ITaskable[] mainpage = null;
	ITaskable[] listpage = null;

	public TaskManagerViewsConsole() {
		this.factory = new SimpleTaskFactory();
	}

	@Override
	public String mainPage(String[] tasks, String prompt) {
		if (mainpage == null) {
			mainpage = factory.createMain(tasks);			
		}
		for(int i=0; i<mainpage.length;i++) {
			System.out.println(mainpage[i].toString());
		}
		System.out.println("\r\n" + prompt);

		return null;
	}

	@Override
	public String listPage(ITaskable[] tasks, String prompt) {
		listpage = tasks;
		for(int i=0; i<listpage.length;i++) {
			System.out.println(listpage[i].toString());
		}
		System.out.println("\r\n" + prompt);
		
		return null;
	}

	@Override
	public String listPage(ITaskable[] tasks, int start, int pageSize, String prompt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String instructionPage(String[] instructions, String prompt) {
		// TODO Auto-generated method stub
		return null;
	}


	public static void main(String[] args) {
		RunTest01();
	}
	
	public static void RunTest01() {
		TaskManagerViewsConsole views = new TaskManagerViewsConsole();
		String[] MAIN_PAGE = {
				"Add a task",
				"Remove a task",
				"Mark a task complete",
				"List the tasks"
		};
		String prompt =  "What would you like to do?";
		
		views.mainPage(MAIN_PAGE, prompt);		
	}
	
	public static void RunTest02() {
		TaskManagerViewsConsole views = new TaskManagerViewsConsole();
		String [] DESCRIPTIONS = {
				"Wash my face",
				"Wear a suit",
				"Eat breakfast",
				"Drive to work"
		};
		CompleteableTask[] tasks = (CompleteableTask[]) views
									.factory.create(TaskFactory.COMPLETEABLE, DESCRIPTIONS.length);
		boolean[] COMPLETE = { true, true, true, false };
		String prompt = "Press ANY key to continue";
		for(int i=0;i<tasks.length;i++) {
			tasks[i].setId(i+1);
			tasks[i].setDescription(DESCRIPTIONS[i]);
			tasks[i].setComplete(COMPLETE[i]);
		}
		
		views.listPage(tasks, prompt);
	}

}
