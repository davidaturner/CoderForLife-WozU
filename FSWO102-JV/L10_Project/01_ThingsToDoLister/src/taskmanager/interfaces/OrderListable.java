package taskmanager.interfaces;

import java.util.List;

public interface OrderListable {	
	static int ITEM_NOT_FOUND = -1;
	
	int getListNumber();
	String getDescription();
	
	int getNextNumber(List<OrderListable>ordered);
		
	String findByListNumber(int selected, List<OrderListable>ordered);
	
	String listing();
	List<String>listing(List<OrderListable>ordered);
	List<String>listing(int starting, List<OrderListable>ordered);
}
