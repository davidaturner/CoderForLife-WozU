package com.davidaturner.l09.classes;

public class Name {

	protected String firstName;
	protected String lastName;
	
	public String getFullName() {
		StringBuilder result = new StringBuilder();
		if (firstName != null) {
			result.append(firstName);
		}
		if (firstName != null && lastName != null) {
			result.append(" " + lastName);
		}
		else if (lastName != null) {
			result.append(lastName);
		}
		return result.toString();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
