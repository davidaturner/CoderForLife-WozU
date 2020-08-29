package com.example.fournumber.interfaces;

public interface INumericProblem {

	public static String NOOP = "NoOp";
	
	public static String ADD = "Add";
	public static String SUBTRACT = "Subtract";
	public static String MULTIPLY = "Multiply";
	public static String DIVIDE = "Divide";
	
	public static String REMAINDER = "Leave";
	
	int getGoal();
	int[] getChoices();
	String getPrestep();

}
