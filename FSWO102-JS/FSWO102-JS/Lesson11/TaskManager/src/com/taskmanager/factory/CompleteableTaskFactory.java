package com.taskmanager.factory;

import com.taskmanager.interfaces.ITaskable;
import com.taskmanager.objects.CompleteableTask;

public class CompleteableTaskFactory extends TaskFactory {

	@Override
	public ITaskable create() {
		return create(COMPLETEABLE);
	}

	@Override
	public ITaskable[] create(int numberToCreate) {
		return create(COMPLETEABLE, numberToCreate);
	}
	
	@Override
	public ITaskable clone(ITaskable original) {
		CompleteableTask cloned = (CompleteableTask)create();
		cloned.setId(original.getId());
		cloned.setDescription(original.getDescription());
		cloned.setComplete(((CompleteableTask)original).isComplete());
		return cloned;
	}
	
	public ITaskable createCompleteable(int id, String description, boolean isComplete) {
		CompleteableTask completeable = (CompleteableTask)create();
		completeable.setId(id);
		completeable.setDescription(description);
		completeable.setComplete(isComplete);
		return completeable;
	}

	public static void main(String[] args) {
		
		int id = 1;
		String description = "Wash my face";
		boolean isComplete = false;
		
		CompleteableTaskFactory factory = new CompleteableTaskFactory();
		
		CompleteableTask completeable = (CompleteableTask) factory.create();
		completeable.setId(id);
		completeable.setDescription(description);
		completeable.setComplete(isComplete);
		System.out.println(completeable.toString());
		
		CompleteableTask cloned = (CompleteableTask) factory.clone(completeable);
		cloned.setComplete(true);
		System.out.println(cloned.toString());

	}


}
