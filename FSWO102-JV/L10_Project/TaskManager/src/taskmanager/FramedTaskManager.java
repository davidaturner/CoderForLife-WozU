package taskmanager;

import taskmanager.factories.CompleteableTaskFactory;
import taskmanager.interfaces.Frameable;
import taskmanager.interfaces.Taskable;
import taskmanager.interfaces.TaskableFactory;

public class FramedTaskManager extends TaskManager implements Frameable {

	public static int STARTWITH_DEFAULT = 1;
	public static int NUM_IN_FRAME_DEFAULT = 5;
	
	boolean isFramed;
	
	Taskable[] framedListing;
	int startWith, numOfTasksInFrame;
	
	public FramedTaskManager(TaskableFactory taskfactory) {
		this(taskfactory, STARTWITH_DEFAULT, NUM_IN_FRAME_DEFAULT);
	}
	public FramedTaskManager(TaskableFactory taskfactory, int startWith, int numOfTasksInFrame) {
		super(taskfactory);

		this.startWith = (startWith>0)?startWith:STARTWITH_DEFAULT;
		this.numOfTasksInFrame = (numOfTasksInFrame>0)?numOfTasksInFrame:NUM_IN_FRAME_DEFAULT;	
		this.isFramed = false;
	}

	@Override
	public Taskable[] getListing(String prompt) {
		if ( !isFramed) {
			return super.getListing(prompt);
		}
		if (listing.size()>1 && !lastOfListing()) {
			Taskable[] tasks = new Taskable[numOfTasksInFrame+1];
			for(int i=1;i<tasks.length && !lastOfListing();i++) {
				tasks[i] = listing.get(startWith);
				System.out.println(listing.get(startWith).listing()+ " " + startWith);
				startWith++;
			}
			tasks[TaskableFactory.PROMPT_LINE] = taskfactory.createTask(
														TaskableFactory.PROMPT_LINE, 
														"\r\n" + prompt);
			System.out.println(tasks[0].listing());
			return tasks;
		}
		return null;
	};
	
	@Override
	public boolean isFramed() {
		return isFramed;
	}
	@Override
	public void turnFraming(boolean on) {
		isFramed = on;
		startWith = 1;
	}
	
	// Getters
	@Override
	public int getStartWith() {
		return startWith;
	}
	@Override
	public int getNumOfTasksInFrame() {
		return numOfTasksInFrame;
	}
	@Override
	public boolean topOfListing() {
		return (startWith == 1);
	}
	@Override
	public boolean lastOfListing() {
		return (startWith >= listing.size());
	}	
	@Override
	public int firstOnFrame() {
		return startWith;
	}
	@Override
	public int lastOnFrame() {
		return (startWith + numOfTasksInFrame > listing.size())?listing.size()-1:startWith + numOfTasksInFrame -1;
	}
	
	public static void main(String[] args) {
		runTest02();
	}
	
	public static void runTest01() {	
		FramedTaskManager ftm = new FramedTaskManager( new CompleteableTaskFactory());
		ftm.addToListing("Wash my face");
		ftm.addToListing("Brush my teeth");
		ftm.addToListing("Put on a suit");
		ftm.addToListing("Eat breakfast");
		ftm.addToListing("Check my email");
		ftm.addToListing("Pick up my newspaper");
		ftm.addToListing("Drive to work");
		
		ftm.turnFraming(false);
		displayPage(ftm.getListing("End of List"));		
	}
	
	public static void runTest02() {	
		FramedTaskManager ftm = new FramedTaskManager( new CompleteableTaskFactory());
		ftm.addToListing("Wash my face");
		ftm.addToListing("Brush my teeth");
		ftm.addToListing("Put on a suit");
		ftm.addToListing("Eat breakfast");
		ftm.addToListing("Check my email");
		ftm.addToListing("Pick up my newspaper");
		ftm.addToListing("Drive to work");
		
		ftm.turnFraming(true);
		int endTask;
		String prompt;
		prompt = "["+ftm.firstOnFrame()+"-"+ftm.lastOnFrame()+"] of " + (ftm.listing.size()-1) + ".";
		ftm.getListing(prompt);
		prompt = "["+ftm.firstOnFrame()+"-"+ftm.lastOnFrame()+"] of " + (ftm.listing.size()-1) + ".";
		ftm.getListing(prompt);

	}
	
	// Support Ops
	private static void displayPage(Taskable[] tasks) {
		for(int i=1;i<tasks.length;i++) {
			System.out.println(tasks[i].listing());
		}
		System.out.println(tasks[TaskableFactory.PROMPT_LINE].listing());
	}

}
