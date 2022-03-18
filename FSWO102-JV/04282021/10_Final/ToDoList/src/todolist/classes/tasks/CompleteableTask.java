package todolist.classes.tasks;

//import todolist.interfaces.ITaskCompleteable;

public class CompleteableTask extends SimpleTask {

	protected boolean complete = false;
		
	public CompleteableTask() {		
	}
	
	public CompleteableTask(int id, String description, boolean complete)
	{
		super(id, description );
		this.complete = complete;
	}
	
	// interface methods
	@Override
	public String toString()
	{
		return super.toString() + ((complete)?" (COMPLETE)":"");
	}
	
	
	public static void main(String[] args) {
		int myid = 1;
		String mydescription = "Wash my face";
		CompleteableTask mytask = new CompleteableTask(myid, mydescription, false);
		
		System.out.println(mytask.getId());
		System.out.println(mytask.getDescription());
		System.out.println(mytask.isComplete());
		System.out.println(mytask.toString());
		
		mytask.setComplete(true);
		System.out.println(mytask.toString());
		
		myid = 1;
		mydescription = "Do Homework";
		CompleteableTask nexttask = 
				new CompleteableTask(myid, mydescription, true);
		System.out.println(nexttask.toString());
		
	}

	// getters and setters
	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

}
