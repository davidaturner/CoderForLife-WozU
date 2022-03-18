package todolist.classes.runtaskables;

import todolist.classes.tasks.TaskManager;
import todolist.classes.tasks.TaskableFactory;
import todolist.interfaces.IManagerTaskable;
import todolist.interfaces.ITaskable;

public class AppRunCompleteableTaskUpdate {

	public static boolean run(int index, ITaskable manageable, IManagerTaskable manager) {
		try {
			manager.updateInManaged(index, manageable);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public static boolean markComplete(int manageableId, IManagerTaskable manager) {
//		ITaskable manageable = AppRunCompleteableTaskFind.find(manageableId, manager);
////		int index = AppRunCompleteableTaskFind.index(manageable, manager);
//		if (manageable!= null && index>=0) {
//			((CompleteableTask)manageable).setComplete(true);
//		}
//		return run(index, manageable, manager);
		return false;
	}
	
	public static void main(String[] args) {
		TaskManager manager = TaskableFactory.getBasicTaskManager();
		
		AppRunCompleteableTaskAdd.add(
				manager.determineNextManageableId(),
				"Wash my face", manager);
		AppRunCompleteableTaskAdd.add(
				manager.determineNextManageableId(),
				"Brush my teeth", manager);
		AppRunCompleteableTaskRemove.remove(1, manager);
		if ( !manager.isManagedEmpty()) {
			for(String manageable : manager.ManagedtoString()) {
				System.out.println(manageable);				
			}
		}
		System.out.println("Marking 2 complete...");
		boolean success = AppRunCompleteableTaskUpdate.markComplete(2, manager);
		if ( !manager.isManagedEmpty()) {
			for(String manageable : manager.ManagedtoString()) {
				System.out.println(manageable);				
			}
		}
		if (!success) {
			System.out.println("Unable to mark complete");
		}
		System.out.println("Managed size: " + manager.getManaged().size());
	}

}
