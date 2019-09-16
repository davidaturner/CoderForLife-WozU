package project;

import java.util.List;

public class ListMenuPage {

	public static String[] menuItems = {
			"Add a task",
			"Remove a task",
			"Mark a task as complete",
			"List the tasks"
	};
	
	public static String pageQuestion = "What would you like to do";
	
	IPageItemFactory factory;
	IConsoleReader reader;
	List<PageItem> tasks;
	
	
	public ListMenuPage(IPageItemFactory factory, IConsoleReader reader, List<PageItem> tasks) {
		this.factory = factory;
		this.reader = reader;
		this.tasks = tasks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
