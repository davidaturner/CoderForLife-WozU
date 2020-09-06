package com.tictactoe.interfaces;

public interface ISolvableEvaluator {

	public static final String NO_EVAL = "Not Evaluated";
	public static final String EVAL = "Evaluated";
	
	String evaluate(ISolvable solvable);
}
