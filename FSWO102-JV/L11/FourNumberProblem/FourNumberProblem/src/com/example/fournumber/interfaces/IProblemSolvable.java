package com.example.fournumber.interfaces;

public interface IProblemSolvable {

	public static String NOTREADY = "NOT READY";
	
	public static String VALIDATED = "VALIDATED";
	
	public static String SOLVED = "SOLVED";
	public static String RESOLVED = "RESOLVED";

	
	String describe();
	String evaluate();
	
	void display();
}
