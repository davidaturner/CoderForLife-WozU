package taskmanager.interfaces;

public abstract class Task {

	protected int number;
	protected String description;
	
	abstract public String listing();

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
}
