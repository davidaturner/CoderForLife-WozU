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
	public void topPage() {		
		this.pageNumber = 1;
	}

	@Override
	public void nextPage() {
		if (!isLastPage()) {
			this.pageNumber++;			
		}
	}

	@Override
	public void prevPage() {
		if (!isTopPage()) {
			this.pageNumber--;
		}
	}

	@Override
	public boolean isTopPage() {
		return 	(calculatePageNumber() == 1)?true : false;
	}

	@Override
	public boolean isLastPage() {
		return (((this.pageNumber + 1) * this.numberataTime) > this.model.size())?true : false;
	}

	@Override
	public int getStarting() {
		return 1 + (this.pageNumber-1) * this.numberataTime;
	}

	@Override
	public int getEnding() {
		return getStarting() + this.numberataTime - 1;
	}

	@Override
	public int getPageNumber() {
		return this.pageNumber;
	}

	@Override
	public void buildView() {
		if (this.model != null && this.model.size()>0) {
			this.view = new ArrayList<>();
			for(Task task : this.model) {
				if (task.getNumber()>=getStarting() && 
						task.getNumber()<=getEnding()) {
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
	private int calculatePageNumber() {
		return (int)this.model.size() / this.numberataTime;
	}
	
	@Override
	public ModelViewBuilder removefromModel() {
		super.removefromModel();
		return this;		
	}
	
	// Testing
	public static void main(String[] args) {
		// RunTest01();
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
	private static void checkView(ModelViewBuilder viewBuilder) {
		if (viewBuilder == null) {
			return;
		}
		AdvancedCompleteableTaskViewer advanced = (AdvancedCompleteableTaskViewer)viewBuilder;

		System.out.println("Model: Size: " + advanced.model.size());
		
		System.out.println("View: Page: " + advanced.pageNumber);
		System.out.println("View: Starting: " + advanced.getStarting());
		System.out.println("View: Ending: " + advanced.getEnding());
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

}
