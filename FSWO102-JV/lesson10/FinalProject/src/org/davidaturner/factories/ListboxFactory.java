package org.davidaturner.factories;

import java.util.ArrayList;

import org.davidaturner.classes.SimpleTaskListbox;
import org.davidaturner.interfaces.IListbox;
import org.davidaturner.interfaces.ITask;

public class ListboxFactory {

	public static final String MAIN_PROMPT = "What would you like to do?";
	public static final String REMOVE_PROMPT = "Which task do you want to remove?";
	public static final String MARK_COMPLETE_PROMPT = "Which task do you want to mark complete?";
	public static final String RETURN_TO_MAIN = "Return?";
	
	public static IListbox createforMain( ArrayList<ITask> maintasks) {
		return new SimpleTaskListbox(maintasks, MAIN_PROMPT);	
	}
	public static IListbox createforSimple(ArrayList<ITask> tasks, String prompt) {
		return new SimpleTaskListbox(tasks, prompt);
	}
	
	
	public static void main(String[] args) {
/*		IListbox listbox = ListboxFactory.createforMain(TaskFactory.createforMain());
		listbox.display();*/
		IListbox listbox = ListboxFactory.createforSimple(TaskFactory.createforMain(), MAIN_PROMPT);
		listbox.display();

	}

}
