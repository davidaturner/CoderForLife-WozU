package taskmanager.designpatterns;

import java.util.ArrayList;
import java.util.List;

import taskmanager.classes.CompleteableTask;
import taskmanager.classes.SimpleTask;
import taskmanager.interfaces.OrderListable;
import taskmanager.interfaces.OrderListableFactory;

public class AllTasksFactory extends OrderListableFactory {

	public static String SIMPLE_TASK = "simple";
	public static String COMPLETEABLE_TASK = "completeable";
	
	public static String ADD_TASK = "Add a task";
	public static String REMOVE_TASK = "Remove a task";
	public static String MARK_TASK = "Mark a task complete";
	public static String SHOW_TASKS = "Show tasks";
	
	@Override
	public List<OrderListable> getMainPage() {
		List<OrderListable>tasks = new ArrayList<>();
		
		SimpleTask taskToBeAdded = new SimpleTask();
		
		taskToBeAdded.setDescription(ADD_TASK);
		tasks.add(taskToBeAdded);
		
		taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription(REMOVE_TASK);
		tasks.add(taskToBeAdded);
		
		taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription(MARK_TASK);
		tasks.add(taskToBeAdded);
		
		taskToBeAdded = new SimpleTask();
		taskToBeAdded.setDescription(SHOW_TASKS);
		tasks.add(taskToBeAdded);
				
		return tasks;
	}

	@Override
	public OrderListable getOrderListable(String type) {
		if (type.equals(SIMPLE_TASK)) {
			return new SimpleTask();
		} else if (type.equals(COMPLETEABLE_TASK)) {
			return new CompleteableTask();
		} else {
			System.out.println("Task cannot be created. Type unknown.");
		}
		return null;
	}

	public static void main(String[] args) {
		RunTest01();
		System.out.println();
		
		RunTest02();

	}
	public static boolean RunTest01() {
		List<OrderListable>mainTasks = (new AllTasksFactory()).getMainPage();
		SimpleTask viewer = new SimpleTask();
		List<String>mainPage = viewer.listing(1, mainTasks);
		for(String cmdTask : mainPage) {
			System.out.println(cmdTask);
		}
		return true;
	}
	public static boolean RunTest02() {
		
		AllTasksFactory factory = new AllTasksFactory();
		SimpleTask simpleTask = (SimpleTask)factory.getOrderListable(AllTasksFactory.SIMPLE_TASK);
		simpleTask.setDescription(AllTasksFactory.ADD_TASK);
		simpleTask.setListNumber(1);
		System.out.println(simpleTask.listing());
		
		CompleteableTask completeableTask = (CompleteableTask)factory
												.getOrderListable(AllTasksFactory.COMPLETEABLE_TASK);
		completeableTask.setDescription("Eat a peach");
		completeableTask.setListNumber(22);
		completeableTask.setComplete(true);
		System.out.println(completeableTask.listing());
		return true;
	}

}
