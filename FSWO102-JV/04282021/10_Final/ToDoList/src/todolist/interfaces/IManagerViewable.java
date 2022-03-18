package todolist.interfaces;

public interface IManagerViewable {

//	String[]view(int listSize);
	boolean isViewInManagedSet();
	
	public String[] viewInManagedtoString();
	
	void forwardInManaged();
	
	void backwardInManaged();
	
	boolean isTopOfManaged();
	
	boolean isBottomOfManaged();
}
