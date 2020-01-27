package taskmanager.classes;

import taskmanager.interfaces.IsTaskable;

public class SimpleTask implements IsTaskable {
	private int number;
	private String description;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String lister() {
		return (number+1) + ". " + description;
	}

}
