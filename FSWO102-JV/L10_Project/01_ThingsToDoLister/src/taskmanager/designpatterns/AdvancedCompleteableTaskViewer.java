package taskmanager.designpatterns;

import java.util.ArrayList;
import java.util.List;

import taskmanager.interfaces.ModelViewBuilder;
import taskmanager.interfaces.Task;
import taskmanager.interfaces.TaskFactory;
import taskmanager.interfaces.ViewPageable;

public class AdvancedCompleteableTaskViewer extends CompleteableTaskViewBuilder implements ViewPageable {

	private int size;
	
	private int pageNumber;
	private int starting;
	private int numberataTime;

	public AdvancedCompleteableTaskViewer(int numberataTime) {
		this.size = 0;
		
		this.pageNumber = 1;
		this.starting = 0;
		this.numberataTime = numberataTime;		
	}
	
	@Override
	public void topPage() {
	}

	@Override
	public void nextPage() {		
	}

	@Override
	public void prevPage() {
	}

	@Override
	public boolean isTopPage() {
		return true;
	}

	@Override
	public boolean isLastPage() {
		return true;
	}

	@Override
	public void buildView() {
		if (this.model != null && this.model.size()>0) {
			this.view = new ArrayList<>();
			for(Task task : this.model) {
				if (task.getNumber()>=starting && 
						task.getNumber()<this.starting+this.numberataTime) {
					this.view.add(task);					
				}
			}
		}
	}
	
	@Override
	public ModelViewBuilder addtoModel() {
		super.addtoModel();
		this.size++;
		this.starting = 1;
		return this;		
	}
	
	@Override
	public ModelViewBuilder removefromModel() {
		super.removefromModel();
		return this;		
	}
	
	// Getters
	public int getSize() {
		return size;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public int getStarting() {
		return starting;
	}

	public int getNumberataTime() {
		return numberataTime;
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

		System.out.println("View: Size: " + advanced.getSize());
		System.out.println("View: Page: " + advanced.getPageNumber());
		System.out.println("View: Starting: " + advanced.getStarting());
		System.out.println("View: AtaTime: " + advanced.getNumberataTime());
		System.out.println();
		System.out.println("Next Page: Starting : " + (advanced.getStarting() 
								+ advanced.getNumberataTime()));
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
