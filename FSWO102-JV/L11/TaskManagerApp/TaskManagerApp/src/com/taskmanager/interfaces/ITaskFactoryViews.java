package com.taskmanager.interfaces;

public interface ITaskFactoryViews {
	
	void setMainPage(ITaskable[]tasks, String prompt);
	void setListPage(ITaskable[]tasks, String prompt);
	
	void setNumberToList(int toList);
	
}
