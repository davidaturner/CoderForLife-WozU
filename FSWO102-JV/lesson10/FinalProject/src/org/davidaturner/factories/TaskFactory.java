package org.davidaturner.factories;

import org.davidaturner.interfaces.ICompleteable;
import org.davidaturner.interfaces.ITaskable;

public class TaskFactory {

	public static ITaskable createTask(String task) {
		return null;
	}
	
	public static ITaskable[] createStaticTaskList( String[] tasks) {
		return null;
	}
	
	public static ICompleteable createCompleteableTask(String completeableTask) {
		return createCompleteableTask(completeableTask, false);
	}
	
	public static ICompleteable createCompleteableTask(String completeableTask, boolean markedComplete) {
		return null;
	}
	
	public static ICompleteable createCompleteableTaskList(String[] completeableTasks) {
		return null;
	}
	
	public static ICompleteable makeTasksCompleteable(ITaskable[] tasks, boolean[] completionStatuses) {
		return null;
	}
	
	public static void main(String[] args) {
		final String[]  tasks = {"Add a Task", "Remove a Task", "Mark Task as Complete", "Show Tasks"};
		
		runTest1();
		runTest2();
		runTest3();
		runTest4();
		runTest5();
	}
	
	public static void runTest1() {
		
	}
	public static void runTest2() {
		
	}
	public static void runTest3() {
		
	}
	public static void runTest4() {
		
	}
	public static void runTest5() {
		
	}
	
	public static void displayTasks(ITaskable tasks) {
	}
	public static void displayCompleteableTasks(ICompleteable tasks) {
	}

}
