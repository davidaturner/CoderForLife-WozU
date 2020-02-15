package taskmanager.interfaces;

import java.util.List;

import taskmanager.classes.SimpleTask;

public abstract class OrderListableFactory {

	public List<String>getMainPageViewer() {
		List<OrderListable> mainPage = getMainPage();
		return (new SimpleTask()).listing(1, mainPage);
	}
	
	abstract public List<OrderListable>getMainPage();
	
	abstract public OrderListable getOrderListable(String type);
}
