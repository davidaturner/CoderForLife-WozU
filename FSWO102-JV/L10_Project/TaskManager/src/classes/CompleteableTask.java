package classes;

import interfaces.Completeable;

public class CompleteableTask extends Task implements Completeable {

	boolean completed;
	
	public CompleteableTask(int id, String description) {
		this(id, description, false);
	}
	public CompleteableTask(int id, String description, boolean completed) {
		super(id, description);
		this.completed = completed;
	}

	// Extends
	@Override
	public String print() {
		return super.print() + ((isCompleted())?" (COMPLETE)":"");
	}
	@Override
	public String printAs(int taskNumber) {
		return super.printAs(taskNumber) + ((isCompleted())?" (COMPLETE)":"");
	}	
	
	// Interface
	@Override
	public boolean isCompleted() {
		return completed;
	}

	@Override
	public void complete() {
		completed = true;

	}

	public static void main(String[] args) {
		
		CompleteableTask dohomework = new CompleteableTask(1, "Do Homework", false);
		CompleteableTask readblog = new CompleteableTask(1, "Read programming blog", true);
		CompleteableTask familytime = new CompleteableTask(3, "Spend time with family", false);
		CompleteableTask watchshow = new CompleteableTask(4, "Watch the new season of a cool show", true);

		System.out.println(dohomework.print());
		System.out.println(readblog.print());
		System.out.println(familytime.printAs(3));
		System.out.println(watchshow.printAs(4));
	}

}
