package todolist.interfaces;

public interface IManagerTaskable {
	
	boolean isManagedEmpty();
	
	ITaskable findInManaged(int manageableId);
	
	void addToManaged(ITaskable manageable);
		
	void removefromManaged(int manageableId);
	
	void updateInManaged(ITaskable manageable);
	
	void updateInManaged(int manageableId, ITaskable manageable);
	
	int determineNextManageableId();
	
	public String[] ManagedtoString();
	
//	List<ITaskable> getManaged();
//	void setManaged(List<ITaskable> tasks);
}
