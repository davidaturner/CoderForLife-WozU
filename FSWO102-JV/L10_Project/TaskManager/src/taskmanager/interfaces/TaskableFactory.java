package taskmanager.interfaces;

import java.util.ArrayList;

public abstract class TaskableFactory {
	
	public static String PROMPT_DEFAULT = "\r\nPress Enter.";
	public static int PROMPT_LINE=0;
	
	protected Taskable[] taskpage;
	
	abstract public Taskable createTask(int taskid, String description);
	abstract public Taskable destroyTask(int taskid, Taskable[]listing);
	
	public Taskable findTask(int taskid, Taskable[] listing) {
		if (checkListing(taskid, listing)) {
			for(int i=1;i<listing.length;i++) {
				if (listing[i].taskid()==taskid) {
					return listing[i];
				}
			}			
		}
		return null;
	}
	
	public void createTaskPage(String[] descriptions) {
		taskpage = new Taskable[descriptions.length];
		for(int i=1;i<descriptions.length;i++) {
			Taskable task = createTask(i, descriptions[i]);
			taskpage[i] = task;
		}
		Taskable prompt = createTask(PROMPT_LINE, descriptions[PROMPT_LINE]);
		taskpage[PROMPT_LINE] = prompt;
	}
	
	public void createTaskPage(String[] descriptions, String prompt) {
		if (prompt == null || prompt.isEmpty()) {
			createTaskPage(descriptions);
			return;
		}		
		taskpage = new Taskable[descriptions.length];
		for(int i=0;i<descriptions.length;i++) {
			Taskable task = createTask(i+1, descriptions[i]);
			taskpage[i+1] = task;
		}
		Taskable pt = createTask(PROMPT_LINE, prompt);
		taskpage[PROMPT_LINE] = pt;
	}
	
	public Taskable[] getTaskPage() {
		return taskpage;
	}
	
	public Taskable[] snapshot(ArrayList<Taskable>listing) {
		Taskable[] listingToBeUpdated = new Taskable[listing.size()];
		for(Taskable task : listing) {
			listingToBeUpdated[task.taskid()] = task;
		}
		return listingToBeUpdated;
	}
	
	protected boolean checkTaskid(int taskid) {
		return (taskid>1)?true:false;
	}
	
	protected boolean checkListing(int taskid, Taskable[]listing) {
		return (checkTaskid(taskid) && listing != null && listing.length>1)?true:false;
	}

}
