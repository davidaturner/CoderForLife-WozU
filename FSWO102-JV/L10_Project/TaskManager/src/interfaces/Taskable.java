package interfaces;

public interface Taskable {
	
	String print();
	String printAs(int taskNumber);
	
	boolean isSelected();
	void select();
	void unselect();
}
