package taskmanager.classes;

import taskmanager.interfaces.Taskable;

public class SimpleTask implements Taskable {

	protected int id;
	protected String description;
	
	@Override
	public String listing() {
		if (id>0) {
			return id+". "+description+".";
		}
		return description;
	}
	@Override
	public int taskid() {
		return id;
	}
	
	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static void main(String[] args) {
	}


}
