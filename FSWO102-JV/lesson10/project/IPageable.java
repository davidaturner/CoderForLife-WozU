package project;

public interface IPageable {

	void setup();
	void execute();
	
	boolean top();
	boolean forward();
	boolean backward();
}
