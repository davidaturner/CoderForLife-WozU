package com.tictactoe.interfaces;

public interface ISolvableValidator {

	public static final String VALID = "Valid";
	public static final String INVALID = "Invalid";
	
	String validate(ISolvable solvable);
}
