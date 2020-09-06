package com.tictactoe.interfaces;

public interface ISolvableDescriptor {

	public static final String VALID = "Valid";
	public static final String INVALID = "Invalid";
	
	String validate(ISolvable solvable);
	
	String[] describe(ISolvable solvable);
}
