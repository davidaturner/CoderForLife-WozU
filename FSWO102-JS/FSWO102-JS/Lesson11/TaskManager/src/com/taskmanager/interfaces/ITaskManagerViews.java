package com.taskmanager.interfaces;

public interface ITaskManagerViews {

	String mainPage(String[] tasks, String prompt);
	
	String listPage(ITaskable[] tasks, String prompt);
	String listPage(ITaskable[] tasks, int start, int pageSize, String prompt);
	
	String instructionPage(String[] instructions, String prompt);
		
}
