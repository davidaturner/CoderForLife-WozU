package com.taskmanager.interfaces;

public interface ITaskFactoryViews {

	void mainpage();
	
	void listpage(ITaskable[]tasks);

	boolean listTop();
	boolean listNext();
	boolean listPrevious();

}
