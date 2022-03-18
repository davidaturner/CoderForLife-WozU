package todolist.classes.tasks;

import todolist.interfaces.IManagerViewable;
import todolist.interfaces.ITaskable;

public class TaskManagerWithView extends TaskManager 
implements IManagerViewable {

	private int tasksPerView = 0;	
	private int beginAtTask = 0;
	
	@Override
	public boolean isViewInManagedSet() {

		return tasksPerView > 0 && tasksPerView < managed.size();
	}
	
	@Override
	public String[] viewInManagedtoString() {

		if ( isViewInManagedSet()) {
			String[] view = new String[tasksPerView];
			for(int i=0; i<tasksPerView;i++) {
				view[i] = managed.get(i).toString();
			}
			return view;			
		}
		return ManagedtoString();
	}
	
//	public String[] view(int listSize) {
//		
//		tasksPerView = listSize;		
//		beginAtTask = 0;
//
//		return (tasksPerView > 0 && tasksPerView < managed.size())?
//				viewToString(): ManagedtoString();
//	}
//	private String[] viewToString() {
//		String[] view = new String[tasksPerView];
//		for(int i=0; i<tasksPerView;i++) {
//			view[i] = managed.get(i).toString();
//		}
//		return view;
//	}
	
	@Override
	public void forwardInManaged() {
		if ( isViewInManagedSet()) {
			if (beginAtTask + tasksPerView < managed.size()) {
				beginAtTask += tasksPerView;
			}
		}		
	}

	@Override
	public void backwardInManaged() {
		if ( isViewInManagedSet()) {
			if (beginAtTask - tasksPerView >= 0) {
				beginAtTask -= tasksPerView;
			}
		}	
	}
	
	@Override
	public boolean isTopOfManaged() {	
		return (tasksPerView > 0)? 
				(beginAtTask <= 0) : true;
	}

	@Override
	public boolean isBottomOfManaged() {
		return (tasksPerView > 0)? 
				(beginAtTask + tasksPerView >= managed.size()) :
					true;
	}

	// getters and setters
	public int getTasksPerView() {
		return tasksPerView;
	}
	public void setTasksPerView(int tasksPerView) {
		this.tasksPerView = tasksPerView;
	}
	public int getBeginAtTask() {
		return beginAtTask;
	}
	public void setBeginAtTask(int beginAtTask) {
		this.beginAtTask = beginAtTask;
	}
	
	// class methods
	public void onInit(int tasksPerView) {
		setTasksPerView(tasksPerView);
		setBeginAtTask(0);
	}
	
	
	//main
	public static void main(String[] args) {
		int tasksPerView = 3;
		
		// Initialize task manager with a view.
		TaskManagerWithView viewer = new TaskManagerWithView();
		viewer.setManaged(TaskableFactory.getTestTaskPage());
		viewer.onInit(tasksPerView);
				 
		analyze(viewer.viewInManagedtoString(),
				viewer.isTopOfManaged(), viewer.isBottomOfManaged());
		
		
		
//		viewer.forward();
//		view = viewer.view();
//		analyze(view, viewer.isTopOfView(), viewer.isBottomOfView());
		
	}
	
	static void analyze(String[]view, boolean isTopOfView, boolean isBottomOfView) {
		for(String task : view) {
			System.out.println(task);
		}
		System.out.println();
		System.out.println(isTopOfView + " " +  isBottomOfView);
		System.out.println();
	}

}
