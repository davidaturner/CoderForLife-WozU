package com.tictactoe.interfaces;

public interface ISolvable {

	public static final String NOT_SOLVED = "Not Solved";
	
	public static final String SOLVED = "Solved";
	public static final String RESOLVED = "Resolved";
	
	String toString();
	
	String getPrestep();
	void setPrestep(String prestep);

}
