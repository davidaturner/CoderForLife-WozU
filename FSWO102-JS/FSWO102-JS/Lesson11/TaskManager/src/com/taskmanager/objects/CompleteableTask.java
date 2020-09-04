package com.taskmanager.objects;

public class CompleteableTask extends SimpleTask {
	
	private boolean complete;

	@Override
	public String toString() {
		return super.toString() + ((complete == true)? " (COMPLETED)" : "");
	}
	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public static void main(String[] args) {
		int id=1;
		String description = "Wash my face";
		boolean complete = true;
		CompleteableTask task = new CompleteableTask();
		task.setId(id);
		task.setDescription(description);
		task.setComplete(complete);
		
		System.out.println(task.toString());

	}
}
