package com.taskmanager.interfaces;

public interface ITaskFactory {
	
	ITaskable create(String type);
	ITaskable[] createAll(String type, int toCreate);
}
