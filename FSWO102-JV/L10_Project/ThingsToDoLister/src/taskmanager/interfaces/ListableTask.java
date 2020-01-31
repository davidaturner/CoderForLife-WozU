package taskmanager.interfaces;

import java.util.List;

public interface ListableTask {

	boolean listReady();
	
	String listing();
	String listing(int listNumber);
	
	void display(List<ListableTask> listing);
	void display(int starting, List<ListableTask> listing);
}
