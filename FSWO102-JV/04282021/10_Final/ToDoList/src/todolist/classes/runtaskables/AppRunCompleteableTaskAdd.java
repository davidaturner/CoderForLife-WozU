package todolist.classes.runtaskables;

import todolist.classes.tasks.CompleteableTask;
import todolist.classes.tasks.TaskManager;
import todolist.classes.tasks.TaskableFactory;
import todolist.interfaces.IManagerTaskable;
import todolist.interfaces.ITaskable;

public class AppRunCompleteableTaskAdd {

	public static boolean run(ITaskable taskable, IManagerTaskable manager) {
		try {
			CompleteableTask toBeAdded = 
					(CompleteableTask)TaskableFactory
					.getCompleteableTask(
							taskable.getId(), 
							taskable.getDescription(), 
							((CompleteableTask)taskable).isComplete());
			manager.addToManaged(toBeAdded);
		} catch(Exception ex) {
			return false;
		}
		
		return true;
	}
	
	public static boolean add(int nextManageableId, String description, 
			IManagerTaskable manager) {
		return run( 
				TaskableFactory.getCompleteableTask(
						nextManageableId, description, false),
				manager);
	}
	
	public static void main(String[] args) {
		
		TaskManager manager = TaskableFactory.getBasicTaskManager();
		int i = 1;
		AppRunCompleteableTaskAdd.add(i, "Eat a peach", manager);
		
		for(String taskstr : manager.ManagedtoString()) {
			System.out.println(taskstr);
		}

	}

}
