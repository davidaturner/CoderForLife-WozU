package taskmanager.interfaces;

public interface ViewPageable {

	ModelViewBuilder topPage();
	
	ModelViewBuilder nextPage();
	ModelViewBuilder prevPage();
	
	int getPageNumber();
	
	int getViewStarting();
	int getViewEnding();
	
	boolean isTopPage();
	boolean isLastPage();
}
