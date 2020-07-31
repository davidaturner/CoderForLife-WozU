package taskmanager.interfaces;

public interface Frameable {

	boolean isFramed();
	
	void turnFraming(boolean on);
	
	int getStartWith();
	int getNumOfTasksInFrame();
	
	boolean topOfListing();
	boolean lastOfListing();
	
	int firstOnFrame();
	int lastOnFrame();
}
