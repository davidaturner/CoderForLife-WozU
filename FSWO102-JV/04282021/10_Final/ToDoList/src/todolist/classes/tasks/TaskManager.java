package todolist.classes.tasks;

import java.util.List;

import javax.naming.ldap.ManageReferralControl;

import todolist.classes.runtaskables.AppRunCompleteableTaskAdd;
import todolist.interfaces.IManagerTaskable;
import todolist.interfaces.ITaskable;

public class TaskManager implements IManagerTaskable
{
	static int MANAGEABLE_NOT_FOUND = -1;
	
	protected List<ITaskable>managed;
		
	//interface methods	
	@Override
	public boolean isManagedEmpty() {
		return (managed != null && managed.size()>0)?false:true;
	}
	
//	@Override
	public ITaskable findInManaged(int manageableId) {
		if ( !isManagedEmpty() )
		{
			int found = placeInManaged(manageableId);
			return (found != MANAGEABLE_NOT_FOUND)?
					managed.get(found):null;				
		}
		return null;	
	}
	
	@Override
	public void addToManaged(ITaskable manageable) {
		if ( managed != null)
		{
			managed.add(manageable);
		}
	}
	
	@Override
	public int determineNextManageableId() {
		int highestTaskId = 0;	
		if ( isManagedEmpty() ) {
			return 1;
		}
		for(ITaskable task : managed) {
			SimpleTask simpleTask = (SimpleTask)task;
			if (simpleTask.getId()>highestTaskId)
			{
				highestTaskId = simpleTask.getId();
			}
		}
		return highestTaskId+1;
	}
	
	@Override
	public void updateInManaged(ITaskable manageable) {
		
		if (manageable != null) {
			
			ITaskable toBeUpdated = findInManaged(manageable.getId());
			if (toBeUpdated != null) {
				int index = managed.indexOf(toBeUpdated);
				updateInManaged(index, manageable);
			}
		}
	}
	
	@Override
	public void updateInManaged(int manageableId, ITaskable manageable) {
		if  ( !isManagedEmpty())
		{
			managed.set(manageableId, manageable);
		}	
	}
	
	@Override
	public void removefromManaged(int manageableId) {
		if ( !isManagedEmpty())
		{
			ITaskable manageable = this.findInManaged(manageableId); 
			if (manageable != null)
			{
				managed.remove(manageable);				
			}
		}
	}
	
	@Override
	public String[] ManagedtoString() {
		if ( isManagedEmpty()) {
			return null;
		}
		String[] managed = new String[this.managed.size()];
		for(int i=0; i<managed.length; i++) {
			managed[i] = this.managed.get(i).toString();
		}
		return managed;
	}
	
	// class methods
	public int placeInManaged(int manageableId) {
		if ( !isManagedEmpty()) {
			int found = 0;
			for(ITaskable managed : this.managed) {
				if (managed.getId() == manageableId) {
					return found;
				}
				found++;			
			}
		}
		return MANAGEABLE_NOT_FOUND;
	}
	
	// getters and setters
	public List<ITaskable> getManaged() {
		return managed;
	}

	public void setManaged(List<ITaskable> managed) {
		this.managed = managed;
	}
	
	public static void main(String[] args) {
		
		TaskManager manager = TaskableFactory.getBasicTaskManager();
		// Add one task.
		ITaskable aTask = TaskableFactory
									.getCompleteableTask(
									manager.determineNextManageableId(),
									"Eat a peach", false);	
		
		AppRunCompleteableTaskAdd.run(aTask, manager);
		
		// Add one task. 			
		ITaskable bTask = TaskableFactory
									.getCompleteableTask(
									manager.determineNextManageableId(),
									"Wash my face", false);	

		AppRunCompleteableTaskAdd.run(bTask, manager);
		
		// Create one task but do not add.
		ITaskable cTask = TaskableFactory
									.getCompleteableTask(
									manager.determineNextManageableId(),
									"Put on a Tie", false);	
		
		ITaskable toBeIndexed = manager.findInManaged(aTask.getId());
		if (toBeIndexed != null) {
			int index = manager.getManaged().indexOf(toBeIndexed);
			System.out.println(index);
		}
		
		for(ITaskable task : manager.getManaged()) {
			System.out.println(task.toString());
		}
		System.out.println();
		System.out.println("Managed: " + manager.getManaged().size());
		
		System.out.println(aTask.toString()+ " " + manager.placeInManaged(aTask.getId()));
		System.out.println(bTask.toString()+ " " + manager.findInManaged(bTask.getId()));
		System.out.println(cTask.toString()+ " " + manager.placeInManaged(cTask.getId()));
		
	}
	
	private static void Test1() {
		TaskManager manager = TaskableFactory.getBasicTaskManager();
		// Add one task.
		AppRunCompleteableTaskAdd.run(
				TaskableFactory
					.getCompleteableTask(
						manager.determineNextManageableId(), 
						"Wash my face", false),		
				manager);
		// Add one task. 			
		AppRunCompleteableTaskAdd.add(
				manager.determineNextManageableId(),
				"Brush my teeth", manager);
		
//		AppRunCompleteableTaskRemove.remove(1, manager);
		
		
		for(ITaskable task : manager.getManaged()) {
			System.out.println(task.toString());
		}
		System.out.println();
		System.out.println("Managed: " + manager.getManaged().size());
	}

}
