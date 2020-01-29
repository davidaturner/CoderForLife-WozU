package taskmanager.interfaces;

public interface ListableTask {

	boolean readyToList();
	
	String listing();
	String listing(int listNumber);
}
