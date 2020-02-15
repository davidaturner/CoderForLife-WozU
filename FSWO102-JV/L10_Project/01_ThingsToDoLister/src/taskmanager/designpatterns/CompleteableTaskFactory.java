package taskmanager.designpatterns;

import java.util.List;

import taskmanager.classes.CompleteableTask;
import taskmanager.interfaces.Task;
import taskmanager.interfaces.TaskFactory;

public class CompleteableTaskFactory extends TaskFactory {

	public static String COMPLETEABLE_TASK = "completeable";
	
	@Override
	public Task createTask() {
		return createTask(COMPLETEABLE_TASK);
	}
	@Override
	public Task createTask(String type) {
		if (type.equals(COMPLETEABLE_TASK)) {
			return new CompleteableTask();
		}
		return null;
	}	
	
	public static void main(String[]args) {
		RunTest01();
		System.out.println();
		
		RunTest02();
		System.out.println();
		
		RunTest03();
		System.out.println();
		
		System.out.println("\r\n...DONE!");
	}
	public static boolean RunTest01() {	
		CompleteableTaskFactory factory = new CompleteableTaskFactory();
		int i = 23;
		CompleteableTask task = (CompleteableTask)factory.createTask();
		task.setDescription("Eat a peach");
		task.setNumber(i++);
		task.setComplete(true);
		System.out.println(task.listing());
		
		task = (CompleteableTask)factory.createTask(COMPLETEABLE_TASK);
		task.setDescription("Eat a pear");
		task.setNumber(i++);
		task.setComplete(false);
		System.out.println(task.listing());
		
		return true;
	}
	public static boolean RunTest02() {
		CompleteableTaskFactory factory = new CompleteableTaskFactory();
		int listsize = 4;
		int starting = 12;
		int i = 0;
		List<Task>tasks = factory.createTasks(COMPLETEABLE_TASK, listsize);
		if (tasks != null && !tasks.isEmpty()) {
			
			CompleteableTask toBeListed = (CompleteableTask)tasks.get(i++);
			toBeListed.setDescription("Shower");
			toBeListed.setNumber(starting++);
			toBeListed.setComplete(true);
			
			toBeListed = (CompleteableTask)tasks.get(i++);
			toBeListed.setDescription("Brush my teeth");
			toBeListed.setNumber(starting++);
			toBeListed.setComplete(true);
			
			toBeListed = (CompleteableTask)tasks.get(i++);
			toBeListed.setDescription("Get dressed");
			toBeListed.setNumber(starting++);
			toBeListed.setComplete(true);
			
			toBeListed = (CompleteableTask)tasks.get(i++);
			toBeListed.setDescription("Code");
			toBeListed.setNumber(starting++);
			toBeListed.setComplete(false);;
			
			for(Task list : tasks) {
				System.out.println(list.listing());
			}
			
		}		
		return true;
	}
	public static boolean RunTest03() {
		String[] taskstore = { 	"Add a task", 
								"Remove a task", 
								"Mark task as complete", 
								"Show tasks" };
		
		CompleteableTaskFactory factory = new CompleteableTaskFactory();
		List<Task>mainPage = factory.createSimplePage(taskstore);
		if (mainPage != null && !mainPage.isEmpty()) {
			for(Task task : mainPage) {
				System.out.println(task.listing());
			}

		}		
		return true;
	}

}
