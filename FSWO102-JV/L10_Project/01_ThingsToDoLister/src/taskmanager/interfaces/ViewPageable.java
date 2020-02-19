package taskmanager.interfaces;

public interface ViewPageable {

	void topPage();
	
	void nextPage();
	void prevPage();
	
	boolean isTopPage();
	boolean isLastPage();
}
