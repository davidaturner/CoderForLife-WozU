package classes;

import java.util.ArrayList;

public class TaskFrame {

	ArrayList<Task> full, tasks;
	int tasksPerFrame;
	int current;
	String prompt;
	
	public TaskFrame(int tasksPerFrame) {
		full = new ArrayList<Task>();
		tasks = new ArrayList<Task>();
		this.tasksPerFrame = tasksPerFrame;
		current = 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
