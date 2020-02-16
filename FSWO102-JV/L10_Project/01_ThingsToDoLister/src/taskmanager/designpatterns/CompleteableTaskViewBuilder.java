package taskmanager.designpatterns;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.ModelViewBuilder;
import taskmanager.interfaces.Task;

public class CompleteableTaskViewBuilder implements ModelViewBuilder {

	protected List<Task>model;
	
	protected Task candidate;
	
	protected List<Task>view;	
	int viewStarting;
	int viewMaxRecords;
	
	public static int NO_VIEWMAX = -1;
	
	@Override
	public void buildView() {
		if (this.model != null && this.model.size()>0) {
			view = new ArrayList<>();
			for(Task task : model) {
				view.add(task);
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
		} else {
			System.out.println("Cannot update model. Candidate missing.");
		}
		return this;
	}

	@Override
	public ModelViewBuilder removefromModel() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public ModelViewBuilder getFromModel() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public ModelViewBuilder puttoModel() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public ModelViewBuilder clearModel() {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public ModelViewBuilder relistModel() {
		if (model != null && model.size()>0) {
			int starting = 1;
			for(int i=0; i<model.size(); i++) {
				Task task = model.get(i);
				task.setNumber(starting++);
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


	public int getViewStarting() {
		return viewStarting;
	}


	public void setViewStarting(int viewStarting) {
		this.viewStarting = viewStarting;
	}


	public int getViewMaxRecords() {
		return viewMaxRecords;
	}


	public void setViewMaxRecords(int viewMaxRecords) {
		this.viewMaxRecords = viewMaxRecords;
	}

	// Testing
	public static void main(String[] args) {

		CompleteableTaskFactory factory = new CompleteableTaskFactory();
		CompleteableTaskViewBuilder viewBuilder = new CompleteableTaskViewBuilder();
		
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
		
		viewBuilder.relistModel();
		viewBuilder.buildView();
		
		printlnList(viewBuilder.getView());
	}
	
	public static void printlnList(List<Task>tasks) {
		for(Task task : tasks) {
			System.out.println(task.listing());
		}
	}

}
