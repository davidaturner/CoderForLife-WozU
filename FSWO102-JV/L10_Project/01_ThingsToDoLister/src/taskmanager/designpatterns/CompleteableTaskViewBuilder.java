package taskmanager.designpatterns;

import java.util.ArrayList;
import java.util.List;

import taskmanager.classes.CompleteableTask;
import taskmanager.interfaces.ModelViewBuilder;
import taskmanager.interfaces.Task;

public class CompleteableTaskViewBuilder implements ModelViewBuilder {

	protected List<Task>model;
	
	protected Task candidate;
	
	protected List<Task>view;	
	
	@Override
	public void buildView() {
		if (this.model != null && this.model.size()>0) {
			this.view = new ArrayList<>();
			for(Task task : this.model) {
				this.view.add(task);
			}
		}
	}

	@Override
	public ModelViewBuilder addtoModel() {
		if (this.model == null) {
			this.model = new ArrayList<Task>();
		}
		if (this.candidate != null) {
			this.model.add(this.candidate);
			relistModel();
			this.view = null;
			this.candidate = null;
		} else {
			System.out.println("Cannot update model. Candidate missing.");
		}
		return this;
	}

	@Override
	public ModelViewBuilder removefromModel() {
		if (this.model != null) {
			if (this.candidate != null) {
				Task taskToBeRemoved = findTaskInModel(this.candidate);
				if (taskToBeRemoved != null) {
					this.model.remove(taskToBeRemoved);
					relistModel();
					this.view = null;
					this.candidate = null;					
				} else {
					System.out.println("Cannot update model. Task not found.");
				}
			} else {
				System.out.println("Cannot update model. Candidate missing.");
			}
		}
		return this;
	}
	private Task findTaskInModel(Task candidate) {
		if ( this.model != null && candidate != null) {
			for(Task task : this.model) {
				if (task.getNumber() == candidate.getNumber()) {
					return task;
				}
			}
		}
		return null;
	}
	
	@Override
	public ModelViewBuilder clearModel() {
		this.model = null;
		this.view = null;
		this.candidate = null;
		
		return this;
	}
	
	@Override
	public ModelViewBuilder relistModel() {
		if (this.model != null && this.model.size()>0) {
			int starting = 1;
			for(int i=0; i<this.model.size(); i++) {
				Task task = this.model.get(i);
				task.setNumber(starting++);
			}
		}
		return this;
	}

	@Override
	public ModelViewBuilder updateModel() {
		if (this.model != null) {
			if (this.candidate != null) {
				CompleteableTask taskToBeUpdated = 
						(CompleteableTask)findTaskInModel(this.candidate);
				if (taskToBeUpdated != null) {
					taskToBeUpdated.setComplete(true);
					// relistModel(); -- No reason to relist here.
					this.view = null;
					this.candidate = null;					
				} else {
					System.out.println("Cannot update model. Task not found.");
				}
			} else {
				System.out.println("Cannot update model. Candidate missing.");
			}
		}
		return this;

	}
	
	
	// Getters and setters
	public List<Task> getModel() {
		return model;
	}


	public void setModel(List<Task> model) {
		this.model = model;
	}


	public Task getCandidate() {
		return candidate;
	}


	public void setCandidate(Task candidate) {
		this.candidate = candidate;
	}


	public List<Task> getView() {
		return view;
	}


	public void setView(List<Task> view) {
		this.view = view;
	}



	// Testing
	public static void main(String[] args) {
		
		CompleteableTaskFactory factory = new CompleteableTaskFactory();
		CompleteableTaskViewBuilder viewBuilder = new CompleteableTaskViewBuilder();

		RunTest01(factory, viewBuilder);
		RunTest02(factory, viewBuilder);
		printlnList(viewBuilder.getView());	
		println();

		RunTest03(factory, viewBuilder);
		printlnList(viewBuilder.getView());	
		println();
		
		RunTest04(factory, viewBuilder);
		printlnList(viewBuilder.getView());	
		println();
		
	}
	
	public static boolean RunTest01(CompleteableTaskFactory factory, 
			CompleteableTaskViewBuilder viewBuilder) {
				
		//Add
		Task taskToBeAdded = factory.createTask();
		taskToBeAdded.setDescription("Shower");		
		viewBuilder.setCandidate(taskToBeAdded);
		viewBuilder.addtoModel();
		
		taskToBeAdded = factory.createTask();
		taskToBeAdded.setDescription("Brush my teeth");		
		viewBuilder.setCandidate(taskToBeAdded);
		viewBuilder.addtoModel();
		
		taskToBeAdded = factory.createTask();
		taskToBeAdded.setDescription("Get dressed");		
		viewBuilder.setCandidate(taskToBeAdded);
		viewBuilder.addtoModel();
		
		taskToBeAdded = factory.createTask();
		taskToBeAdded.setDescription("Eat breakfast");		
		viewBuilder.setCandidate(taskToBeAdded);
		viewBuilder.addtoModel();		
		viewBuilder.buildView();
		
		return true;
	}
	public static boolean RunTest02(CompleteableTaskFactory factory, 
			CompleteableTaskViewBuilder viewBuilder) {
				
		//Add
		Task taskToBeAdded = factory.createTask();
		taskToBeAdded.setDescription("Work out on the weights");		
		viewBuilder.setCandidate(taskToBeAdded);
		viewBuilder.addtoModel();
		
		taskToBeAdded = factory.createTask();
		taskToBeAdded.setDescription("Jog 10 miles");		
		viewBuilder.setCandidate(taskToBeAdded);
		viewBuilder.addtoModel();
		
		taskToBeAdded = factory.createTask();
		taskToBeAdded.setDescription("Have breakfast with coffee");		
		viewBuilder.setCandidate(taskToBeAdded);
		viewBuilder.addtoModel();
		
		taskToBeAdded = factory.createTask();
		taskToBeAdded.setDescription("Check my email on my phone");		
		viewBuilder.setCandidate(taskToBeAdded);
		viewBuilder.addtoModel();		
		viewBuilder.buildView();
				
		return true;
	}
	public static boolean RunTest03(CompleteableTaskFactory factory, 
			CompleteableTaskViewBuilder viewBuilder) {
		
		int taskIndex = 6;
		int outOf = viewBuilder.getModel().size();
		println("Attempting to remove ONE task... " + taskIndex + ". out of... " + outOf);
		println();
		
		if (taskIndex > outOf) {
			return false;
		}
		Task toBeRemoved = factory.createTask();
		toBeRemoved.setNumber(taskIndex);
		viewBuilder.setCandidate(toBeRemoved);
		viewBuilder.removefromModel();
		viewBuilder.buildView();
		
		return true;		
	}
	public static boolean RunTest04(CompleteableTaskFactory factory, 
			CompleteableTaskViewBuilder viewBuilder) {
		
		int taskIndex = 3;
		int outOf = viewBuilder.getModel().size();
		println("Attempting to complete ONE task... " + taskIndex + ". out of... " + outOf);
		println();
		
		if (taskIndex > outOf) {
			return false;
		}
		Task toBeUpdated = factory.createTask();
		toBeUpdated.setNumber(taskIndex);
		viewBuilder.setCandidate(toBeUpdated);
		viewBuilder.updateModel();
		viewBuilder.buildView();
		
		return true;		
	}	
	
	// Auxiliary
	public static void println() {
		System.out.println();
	}
	public static void println(String message) {
		System.out.println(message);
	}
	public static void printlnList(List<Task>tasks) {
		if (tasks != null && !tasks.isEmpty()) {
			for(Task task : tasks) {
				System.out.println(task.listing());
			}			
		}
	}

}
