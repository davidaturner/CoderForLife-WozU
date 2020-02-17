package taskmanager.interfaces;

public interface CanViewPaginate {

	void topPage();
	
	void nextPage();
	void prevPage();
	
	boolean isLastPage();
}
