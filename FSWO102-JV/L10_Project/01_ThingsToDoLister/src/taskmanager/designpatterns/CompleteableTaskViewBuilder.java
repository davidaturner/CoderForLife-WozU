package taskmanager.designpatterns;

import java.util.List;

import taskmanager.interfaces.Task;

public class CompleteableTaskViewBuilder {

	protected List<Task>mainPage;
	
	protected List<Task>listPage;
	protected Task candidate;
	
	int starting;
	int pageLimit;
	
	// Getter and setters
	public List<Task> getMainPage() {
		return mainPage;
	}

	public void setMainPage(List<Task> mainPage) {
		this.mainPage = mainPage;
	}

	public List<Task> getListPage() {
		return listPage;
	}

	public void setListPage(List<Task> listPage) {
		this.listPage = listPage;
	}

	public Task getCandidate() {
		return candidate;
	}

	public void setCandidate(Task candidate) {
		this.candidate = candidate;
	}

	public int getStarting() {
		return starting;
	}

	public void setStarting(int starting) {
		this.starting = starting;
	}

	public int getPageLimit() {
		return pageLimit;
	}

	public void setPageLimit(int pageLimit) {
		this.pageLimit = pageLimit;
	}

	public static void main(String[] args) {

		CompleteableTaskViewBuilder builder = new CompleteableTaskViewBuilder();
		
		CompleteableTaskFactory factory = new CompleteableTaskFactory();
		

	}

}
