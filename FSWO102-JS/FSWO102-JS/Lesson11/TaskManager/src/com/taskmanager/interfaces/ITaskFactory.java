package com.taskmanager.interfaces;

public interface ITaskFactory {

	ITaskable create(String type);
	ITaskable[] create(String type, int numberToCreate);

}
