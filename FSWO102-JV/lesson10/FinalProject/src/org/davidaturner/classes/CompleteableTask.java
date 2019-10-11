package org.davidaturner.classes;

import org.davidaturner.interfaces.ICompleteable;
import org.davidaturner.interfaces.ITaskable;

public class CompleteableTask extends Task implements ICompleteable {

	protected boolean markedComplete;

	public CompleteableTask(String description) {
		super(description);
		markedComplete = false;
	}


	@Override
	public boolean isCompleted() {
		return (markedComplete)?true:false;
	}


	@Override
	public void markComplete() {
		markedComplete = true;		
	}
	
	@Override
	public void list() {
		System.out.println(description + 
				(isCompleted()?" (Complete)":""));
	}
	
	public static void main(String[] args) {
		ICompleteable icompleteable = new CompleteableTask("Wash your face");
		ITaskable itask = new CompleteableTask("Wash your clothes");
		CompleteableTask task = (CompleteableTask)itask;
		CompleteableTask completeableTask = (CompleteableTask)icompleteable;
		
		// Using ICompleteable interface.
		completeableTask.list();
		completeableTask.markComplete();
		System.out.print("1. ");
		completeableTask.list();
		
		// Using ITaskable interface.
		task.list();
		task.markComplete();
		System.out.print("1. ");
		task.list();
	}




}
