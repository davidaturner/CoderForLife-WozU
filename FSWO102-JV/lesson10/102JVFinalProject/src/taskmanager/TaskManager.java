package taskmanager;

import java.util.ArrayList;
import java.util.List;

import taskmanager.classes.CompleteableTask;
import taskmanager.classes.ListableTask;
import taskmanager.interfaces.Taskable;

public class TaskManager {

	public static void main(String[] args) {
		
//		System.out.println("\r\n" + SimpleTask.SimpleTaskTest01());
//		System.out.println("\r\n" + ListableTask.ListableTask01());
//		System.out.println("\r\n" + ListableTask.ListableTask02());

		List<Taskable>tasks = new ArrayList<>();
		
		CompleteableTask task = new CompleteableTask();
		task.setDescription("Make the Bed");
		task.setNumber(1);
		task.setCompleted(true);
		tasks.add(task);
		
		task = new CompleteableTask();
		task.setDescription("Brush my Teeth");
		task.setNumber(0);
		task.setCompleted(true);
		tasks.add(task);
		
		task = new CompleteableTask();
		task.setDescription("Eat breakfast");
		task.setNumber(2);
		task.setCompleted(true);
		tasks.add(task);
		
		task = new CompleteableTask();
		task.setDescription("Coding for an hour");
		task.setNumber(3);
		task.setCompleted(false);
		tasks.add(task);
		
		for(Taskable atask : tasks) {
			ListableTask listTask = (ListableTask)atask;
			System.out.println(listTask.list());
		}
		
		System.out.println("\r\n");
		
		int i=0;
		for(Taskable atask : tasks) {
			ListableTask listTask = (ListableTask)atask;
			System.out.println(listTask.list(i++));
		}
		

		
	}

}
