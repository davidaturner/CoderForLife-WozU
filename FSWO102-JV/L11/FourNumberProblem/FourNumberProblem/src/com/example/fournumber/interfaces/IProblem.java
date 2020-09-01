package com.example.fournumber.interfaces;

public interface IProblem {

	public static String NOOP = "NoOp";
	
	String getPrestep();
	void setPrestep(String prestep);
	
	boolean noMoreSteps();

}
