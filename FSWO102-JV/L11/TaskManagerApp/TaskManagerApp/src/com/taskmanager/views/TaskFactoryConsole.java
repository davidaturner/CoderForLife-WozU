package com.taskmanager.views;

import com.taskmanager.classes.SimpleTask;
import com.taskmanager.factories.SimpleTaskFactory;
import com.taskmanager.interfaces.ITaskFactoryViews;
import com.taskmanager.interfaces.ITaskable;

public class TaskFactoryConsole implements ITaskFactoryViews {

	SimpleTask[] mainpage;
	String mainprompt;
	
	ITaskable[] listpage;
	String listprompt;
	
	int current, linesPerPage;
	
	public TaskFactoryConsole(String[] mainpage, String mainprompt) {
		SimpleTaskFactory factory = new SimpleTaskFactory();
		this.mainpage = (SimpleTask[]) factory.create(mainpage);
		this.mainprompt = mainprompt;
		listpage = null;
		listprompt = null;
		current = 0;
		linesPerPage = 0;
	}

	@Override
	public void mainpage() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listpage(ITaskable[] tasks) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean listTop() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean listNext() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean listPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	// Additional methods
	public void setCurrent(int current) {
		this.current = current;
	}
	public void setLinesPerPage(int linesPerPage) {
		this.linesPerPage = linesPerPage;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
