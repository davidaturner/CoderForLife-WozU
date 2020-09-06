package com.example.fournumber.interfaces;

public interface IProblemSolvable {

	public static String SOLVED = "Solved";
	public static String NOT_SOLVED = "Not Solved";
	
	public static String RESOLVED = "Resolved";

	ISolvable get();
	
	String describe();
	
	boolean validate();
	
	void solve();
	
	String evaluate();
	
	String[] listing();
	
}
