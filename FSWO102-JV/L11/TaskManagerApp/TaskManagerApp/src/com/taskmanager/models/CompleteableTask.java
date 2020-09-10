package com.taskmanager.models;

public class CompleteableTask extends SimpleTask {

	private boolean complete;
	
	@Override
	public String toString() {
		String str = new String();
		str += super.toString() +  (isComplete()?" (COMPLETE)":"");
		return str;
	}
	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public static void main(String[] args) {
		int id = 1;
		String description = "Wash my face";
		
		CompleteableTask task = new CompleteableTask();
		task.setId(id);
		task.setDescription(description);
		task.setComplete(false);
		System.out.println(task.toString());
		
		task.setComplete(true);
		System.out.println(task.toString());

	}

}
