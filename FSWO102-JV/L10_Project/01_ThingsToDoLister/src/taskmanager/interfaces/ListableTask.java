package taskmanager.interfaces;

import java.util.List;

public interface ListableTask {

	boolean listReady();
	
	String listing();
	String listing(int listNumber);
	List<String> listing(List<ListableTask> list);
	List<String> listing(int listNumber, List<ListableTask> list);
}
