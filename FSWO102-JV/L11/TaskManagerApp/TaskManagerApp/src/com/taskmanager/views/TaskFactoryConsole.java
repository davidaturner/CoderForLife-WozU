package com.taskmanager.views;

import com.taskmanager.factories.SimpleTaskFactory;
import com.taskmanager.interfaces.ITaskFactoryViews;
import com.taskmanager.interfaces.ITaskable;

public class TaskFactoryConsole implements ITaskFactoryViews {

	private ITaskable[] mainPage;
	private String mainPrompt;
	
	private ITaskable[] listPage;
	private String listPrompt;
	
	private int original, current, numberToList;	
	
	public TaskFactoryConsole() {				
		current = 0;
		numberToList = 0;	
	}
	
	@Override
	public void setMainPage(ITaskable[] tasks, String prompt) {
		setMainPage(tasks);
		setMainPrompt(prompt);
	}
	
	@Override
	public void setListPage(ITaskable[] listing, String prompt) {	
		setListPage(listing);
		setListPrompt(prompt);
	}

	@Override
	public void setNumberToList(int numberToList) {
		this.numberToList = numberToList;
	}
	
	// Additional operations.
	public void setMainPage(String[] descriptions, String prompt) {
		SimpleTaskFactory simple = new SimpleTaskFactory();
		ITaskable[] tasks = simple.createAll(descriptions);
		setMainPage(tasks, prompt);
	}
	
	public ITaskable[] top() {
		original = 0;
		current = 0;
		return next();
	}	
	public ITaskable[] next() {
		int number = (numberToList > listPage.length - current)?
				listPage.length - current : numberToList;
		original = current;
		ITaskable[] view = new ITaskable[number];
		for(int i=0; i<number; i++) {
			view[i] = listPage[current++];
		}
		if (current >= listPage.length) {
			current = original;
		} 
		return view;
	}	
	public ITaskable[] previous() {
		current = original;
		current = (current < numberToList)
						? 0 : current - numberToList;
		return next();
	}
	
	//Getters and Setters
	public ITaskable[] getMainPage() {
		return mainPage;
	}

	public void setMainPage(ITaskable[] mainPage) {
		this.mainPage = mainPage;
	}

	public String getMainPrompt() {
		return mainPrompt;
	}

	public void setMainPrompt(String mainPrompt) {
		this.mainPrompt = mainPrompt;
	}

	public ITaskable[] getListPage() {
		return listPage;
	}

	public void setListPage(ITaskable[] listPage) {
		this.listPage = listPage;
	}

	public String getListPrompt() {
		return listPrompt;
	}

	public void setListPrompt(String listPrompt) {
		this.listPrompt = listPrompt;
	}

	//Testing
	public static void main(String[] args) {
		SimpleTaskFactory factory = new SimpleTaskFactory();
		String[] TEST = {
				"Wash my face",
				"Brush my teeth",
				"Put on a suit",
				"Eat breakfast",
				"Drive to work", 
				"Check work emails"
		};
		String PROMPT = "Go top (t), next (n) or previous (p)?";
		
		TaskFactoryConsole views = new TaskFactoryConsole();
		views.setListPage(
				factory.createAll(TEST), 
				PROMPT);

		ITaskable[] page = views.getListPage();
		displayPage(page);
		System.out.println();
		
		int numberToList = 2;
		
		System.out.println("Top() " + numberToList);	
		views.setNumberToList(numberToList);
		page = views.top();
		displayPage(page);
		System.out.println();
		
		System.out.println("Next()");
		page = views.next();
		displayPage(page);
		System.out.println();

		System.out.println("Next()");
		page = views.next();
		displayPage(page);
		System.out.println();

		System.out.println("Prev()");
		page = views.previous();
		displayPage(page);
		System.out.println();
		
		System.out.println("Next()");
		page = views.next();
		displayPage(page);
		System.out.println();

	}
	
	private static void displayPage(ITaskable[] page) {
		for(int i=0; i<page.length; i++) {
			System.out.println(page[i]);
		}
	}
	
	private static void pageInfo(int current, int numberToList) {
		System.out.println("Current: " + current + " Max: " + numberToList);
	}

}
