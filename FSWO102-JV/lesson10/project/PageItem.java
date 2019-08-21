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

	public static void main(String[] args) {
		
		PageItem.Test01();

	}
	
	private static IPageItem[] Test01() {
		
		IPageItem[]menuItems = new PageItem[4];
		
		menuItems[0] = new PageItem("Add a task");
		menuItems[1] = new PageItem("List tasks");
		menuItems[2] = new PageItem("Mark a task complete");
		menuItems[3] = new PageItem("Remove a task");
		
		for(int i=0; i<4; i++) {
			System.out.println((i+1) + ". " + menuItems[i].getItemDescription());
		}
		
		return menuItems;		
	}
	
}
