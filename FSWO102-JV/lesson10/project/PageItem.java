package project;

public class PageItem implements IPageItem {

	String description;
	
	public PageItem(String description) {
		this.description = description;
	}
	
	@Override
	public String getItemDescription() {
		return description;
	}

	public void displayAsaQuestion() {
		System.out.println("\r\n" + description + "?");
	}
	
	public void displayAsaChoice(int index) {
		System.out.println((index+1) + ": " + description);
	}
	
	public static void main(String[] args) {
		
		PageItem.Test01();
		PageItem.Test02();

	}
	
	private static IPageItem[] Test01() {
		
		IPageItem[]menuItems = new PageItem[4];
		
		menuItems[0] = new PageItem("Add a task");
		menuItems[1] = new PageItem("List tasks");
		menuItems[2] = new PageItem("Mark a task complete");
		menuItems[3] = new PageItem("Remove a task");
		
		for(int i=0; i<4; i++) {
			PageItem item = (PageItem)menuItems[i];
			item.displayAsaChoice(i);
		}
		
		return menuItems;		
	}
	
	private static void Test02() {
		
		IPageItem question = new PageItem("What would you like to do");
		PageItem item = (PageItem)	question;
		item.displayAsaQuestion();
	}
	
}
