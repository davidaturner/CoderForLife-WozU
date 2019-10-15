package org.codercamps.FSWO1043JV.models;

import java.sql.Timestamp;

public class Actor {

	private int actionID;
	private String firstName;
	private String lastName;
	private Timestamp lastUpdate;
	

	public int getActionID() {
		return actionID;
	}


	public void setActionID(int actionID) {
		this.actionID = actionID;
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


	public Timestamp getLastUpdate() {
		return lastUpdate;
	}


	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
