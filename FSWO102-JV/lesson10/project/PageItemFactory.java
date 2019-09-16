package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PageItemFactory implements IPageItemFactory {

	@Override
	public IPageItem createPageItem(String item) {
		return new PageItem(item);
	}

	@Override
	public List<IPageItem> createPageItems(String[] items) {
		List<IPageItem> pageItems = new ArrayList<>();
		for(int i=0; i<items.length; i++) {
			pageItems.add(new PageItem(items[i]));
		}
		
		return pageItems;
	}

	
	
	public static void main(String[] args) {
		
		Test01();

	}
	
	public static void Test01() {
		String[] items = {
				"Add a task",
				"Remove a task",
				"Mark a task as complete",
				"List the tasks"
		};
		
		String question = "What would you like to do";
		
		PageItemFactory factory = new PageItemFactory();
		List<IPageItem> pageItems = factory.createPageItems(items);
		IPageItem pageQuestion = factory.createPageItem(question);
		
		for(int i=0; i<pageItems.size(); i++) {
			PageItem item = (PageItem)pageItems.get(i);
			item.displayAsaChoice(i);
		}
		PageItem item = (PageItem)pageQuestion;
		item.displayAsaQuestion();
	}

}
