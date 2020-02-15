package taskmanager.designpatterns;

import java.util.ArrayList;
import java.util.List;

import taskmanager.classes.CompleteableTask;
import taskmanager.classes.SimpleTask;
import taskmanager.interfaces.Task;
import taskmanager.interfaces.TaskFactory;

public class AllTasksFactory extends TaskFactory {

	@Override
	public Task createTask(String type) {
		if (type.equals(SIMPLE_TASK)) {
			return new SimpleTask();
		} else if (type.equals(COMPLETEABLE_TASK)) {
			return new CompleteableTask();
		} else {
			System.out.println("Task cannot be created. Type unknown.");
		}
		return null;
	}

	@Override
	public List<Task> createTasks(String type, int listsize) {
		List<Task>tasks = new ArrayList<>();
		if (listsize > 0) {
			for(int i=0; i<listsize; i++) {
				tasks.add(createTask(type));
			}
			return tasks;
		}
		return null;
	}

	public static void main(String[] args) {
		RunTest01();
		System.out.println();
		
		RunTest02();
		System.out.println();
		
		RunTest03();
		System.out.println();
		
		RunTest04();
		System.out.println();
		
		System.out.println("\r\n..DONE!");

	}
	public static boolean RunTest01() {
		AllTasksFactory factory = new AllTasksFactory();
		
		SimpleTask simpleTask = (SimpleTask)factory.createTask(TaskFactory.SIMPLE_TASK);
		simpleTask.setDescription("Add a task");
		simpleTask.setNumber(1);
		System.out.println(simpleTask.listing());
				
		return true;
	}
	
	public static boolean RunTest02() {
		AllTasksFactory factory = new AllTasksFactory();
		
		CompleteableTask completeableTask = (CompleteableTask)factory
											.createTask(TaskFactory.COMPLETEABLE_TASK);
		completeableTask.setDescription("Eat breakfast");
		completeableTask.setNumber(23);
		completeableTask.setComplete(true);
		System.out.println(completeableTask.listing());
		
		return true;
	}
	
	public static boolean RunTest03() {
		return true;
	}
	
	public static boolean RunTest04() {
		return true;
	}

}
