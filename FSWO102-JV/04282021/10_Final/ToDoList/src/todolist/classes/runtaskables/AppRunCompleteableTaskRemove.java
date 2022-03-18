package todolist.classes.runtaskables;

import todolist.classes.tasks.CompleteableTask;
import todolist.classes.tasks.TaskManager;
import todolist.classes.tasks.TaskableFactory;
import todolist.interfaces.IManagerTaskable;
import todolist.interfaces.ITaskable;

public class AppRunCompleteableTaskRemove {

	public static boolean run(ITaskable manageable, IManagerTaskable manager) {
		try {
			manager.removefromManaged(((CompleteableTask)manageable).getId());
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public static boolean remove(int taskableId, IManagerTaskable manager) {
		return run(
				AppRunCompleteableTaskFind.find(taskableId, manager),
				manager
		);
	}
	
	public static void main(String[] args) {
		
		TaskManager manager = TaskableFactory.getBasicTaskManager();
		AppRunCompleteableTaskAdd.add(
				manager.determineNextManageableId(), 
				"Eat a pear", manager);
		if ( !manager.isManagedEmpty()) {
			for(String manageable : manager.ManagedtoString()) {
				System.out.println(manageable);
			}
		}
		System.out.println("Managed: " + manager.getManaged().size());
		System.out.println("Removing 1...");
		AppRunCompleteableTaskRemove.remove(1, manager);
		System.out.println("Managed: " + manager.getManaged().size());

	}

}
