package taskmanager.interfaces;

public interface ViewPageable {

	void topPage();
	
	void nextPage();
	void prevPage();
	
	int getStarting();
	int getEnding();
	
	int getPageNumber();
	
	boolean isTopPage();
	boolean isLastPage();
}
