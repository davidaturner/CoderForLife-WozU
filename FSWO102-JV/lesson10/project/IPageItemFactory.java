package project;

public interface IPageItemFactory {
	
	IPageItem createPageItem(String item);
	IPageItem[] createPageItems(String[] items);	
}
