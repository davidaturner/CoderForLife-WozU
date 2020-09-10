package com.taskmanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.taskmanager.controllers.TaskManagerController;
import com.taskmanager.factories.CompleteableTaskFactory;
import com.taskmanager.views.TaskFactoryConsole;

public class TaskManagerApplication {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	static final TaskManagerController controller = new TaskManagerController(
											new CompleteableTaskFactory(),
											new TaskFactoryConsole());
	
	public void run() {
		
		System.out.println("Welcome to Things-To-Do Task Manager.");
		System.out.println();
		
		displayPage(controller.mainpage());
	}

	public static void main(String[] args) {
		TaskManagerApplication app = new TaskManagerApplication();
		app.run();
	}
	
	
	// Support
	private int getChoice() {
		try {		
			return Integer.parseInt(in.readLine());			
		} catch (Exception e) {
			System.out.println("Unable to get choice");
		}
		return 0;
	}	
	private String getInput() {
		try {
			return in.readLine();
		} catch (Exception e) {
			System.out.println("Unable to get input");
		}
		return null;
	}
	
	private static void displayPage(String[] page) {
		for(int i=1; i<page.length;i++) {
			System.out.println(page[i]);
		}
		System.out.println("\r\n" + page[0]);
	}


}
