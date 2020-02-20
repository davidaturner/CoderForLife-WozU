package taskmanager.designpatterns;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.ModelViewBuilder;
import taskmanager.interfaces.Task;
import taskmanager.interfaces.TaskFactory;
import taskmanager.interfaces.ViewPageable;

public class AdvancedCompleteableTaskViewer extends CompleteableTaskViewBuilder implements ViewPageable {

	private int numberataTime;
	private int pageNumber;

	public AdvancedCompleteableTaskViewer(int numberataTime) {
		
		if (numberataTime > 0) {
			this.numberataTime = numberataTime;				
		} else {
			this.numberataTime = 1;
		}
		this.pageNumber = 1;
	}
	
	@Override
	public ModelViewBuilder topPage() {		
		this.pageNumber = 1;
		return this;
	}

	@Override
	public ModelViewBuilder nextPage() {
		if (!isLastPage()) {
			this.pageNumber++;			
		}
		return this;
	}

	@Override
	public ModelViewBuilder prevPage() {
		if (!isTopPage()) {
			this.pageNumber--;
		}
		return this;
	}

	@Override
	public boolean isTopPage() {
		return 	(this.pageNumber == 1)?true : false;
	}

	@Override
	public boolean isLastPage() {
		return (((this.pageNumber + 1) * this.numberataTime) > this.model.size())?true : false;
	}
	
	@Override
	public int getPageNumber() {
		return this.pageNumber;
	}
	private int calculatePageNumber() {
		return (int)this.model.size() / this.numberataTime;
	}
	
	@Override
	public int getViewStarting() {
		return 1 + (this.pageNumber-1) * this.numberataTime;
	}

	@Override
	public int getViewEnding() {
		return getViewStarting() + this.numberataTime - 1;
	}

	@Override
	public void buildView() {
		if (this.model != null && this.model.size()>0) {
			this.view = new ArrayList<>();
			for(Task task : this.model) {
				if (task.getNumber()>=getViewStarting() && 
						task.getNumber()<=getViewEnding()) {
					this.view.add(task);					
				}
			}
		}
	}
	
	@Override
	public ModelViewBuilder addtoModel() {
		super.addtoModel();
		this.pageNumber = calculatePageNumber();
		return this;		
	}
	
	@Override
	public ModelViewBuilder removefromModel() {
		super.removefromModel();
		this.pageNumber = calculatePageNumber();
		return this;		
	}
	
	// Testing
	public static void main(String[] args) {
		// RunTest01();
		// RunTest02();
		// RunTest03();
		int modelsize = 11;
		int numberataTime = 5;
		AdvancedCompleteableTaskViewer viewBuilder = 
				new AdvancedCompleteableTaskViewer(numberataTime);
		List<Task>tasks = buildTaskListing("My Daily Task No.", modelsize);
		for( Task task : tasks) {
			viewBuilder.setCandidate(task)
						.addtoModel();						
		}
		viewBuilder.relistModel().buildView();
		checkView(viewBuilder);
		System.out.println("\r\n");
		displayView(viewBuilder);
		System.out.println("\r\n");
		viewBuilder.topPage().buildView();
		viewBuilder.buildView();
		checkView(viewBuilder);
		System.out.println("\r\n");
		displayView(viewBuilder);
	}
	public static boolean RunTest01() {
		int numberataTime = 5;
		AdvancedCompleteableTaskViewer viewBuilder = 
				new AdvancedCompleteableTaskViewer(numberataTime);
		viewBuilder.buildView();
		checkView(viewBuilder);
		
		return true;	
	}
	public static boolean RunTest02() {
		int numberataTime = 5;
		AdvancedCompleteableTaskViewer viewBuilder = 
				new AdvancedCompleteableTaskViewer(numberataTime);
		TaskFactory factory = new CompleteableTaskFactory();
		Task task = factory.createTask();
		task.setDescription("Shower");
		viewBuilder.setCandidate(task)
					.addtoModel()
					.buildView();
		checkView(viewBuilder);
		System.out.println("\r\n");
		displayView(viewBuilder);
		
		return true;
	}
	public static boolean RunTest03() {
		int numberataTime = 5;
		AdvancedCompleteableTaskViewer viewBuilder = 
				new AdvancedCompleteableTaskViewer(numberataTime);
		TaskFactory factory = new CompleteableTaskFactory();
		
		Task task = factory.createTask();
		task.setDescription("Shower");
		viewBuilder.setCandidate(task)
					.addtoModel();
		
		task = factory.createTask();
		task.setDescription("Brush my teeth");
		viewBuilder.setCandidate(task)
					.addtoModel();
	
		task = factory.createTask();
		task.setDescription("Get dressed");
		viewBuilder.setCandidate(task)
					.addtoModel();
	
		task = factory.createTask();
		task.setDescription("Eat breakfast");
		viewBuilder.setCandidate(task)
					.addtoModel();

		task = factory.createTask();
		task.setDescription("Code");
		viewBuilder.setCandidate(task)
					.addtoModel(); 
		
		viewBuilder.buildView();

		checkView(viewBuilder);
		System.out.println("\r\n");
		displayView(viewBuilder);
		
		return true;
	}
	private static void checkView(ModelViewBuilder viewBuilder) {
		if (viewBuilder == null) {
			return;
		}
		AdvancedCompleteableTaskViewer advanced = (AdvancedCompleteableTaskViewer)viewBuilder;

		System.out.println("Model: Size: " + advanced.model.size());
		
		System.out.println("View: Page: " + advanced.pageNumber);
		System.out.println("View: Starting: " + advanced.getViewStarting());
		System.out.println("View: Ending: " + advanced.getViewEnding());
	}
	private static void displayView(ModelViewBuilder viewBuilder) {
		if (viewBuilder == null) {
			return;
		}
		List<Task>tasks = ((CompleteableTaskViewBuilder)viewBuilder).getView();
		for(Task task : tasks) {
			System.out.println(task.listing());
		}
	}
	private static List<Task> buildTaskListing(String description, int listsize) {
		
		TaskFactory factory = new CompleteableTaskFactory();
		List<Task>tasks = new ArrayList<>();
		for(int i=0; i<listsize; i++) {
			Task task = factory.createTask();
			task.setDescription(description + " " + (i+1));
			tasks.add(task);
		}

		return (tasks != null && !tasks.isEmpty())?tasks: null;
	}

}
