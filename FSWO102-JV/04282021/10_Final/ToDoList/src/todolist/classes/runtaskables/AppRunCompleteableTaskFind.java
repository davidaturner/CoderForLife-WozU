package todolist.classes.runtaskables;

import todolist.interfaces.IManagerTaskable;
import todolist.interfaces.ITaskable;

public class AppRunCompleteableTaskFind {

	public static ITaskable find(int manageableId, IManagerTaskable manager) {
		
		return manager.findInManaged(manageableId);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
