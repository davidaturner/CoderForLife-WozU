package project;

import java.util.List;

public interface IPageItemFactory {
	
	IPageItem createPageItem(String item);
	List<IPageItem> createPageItems(String[] items);	
}
