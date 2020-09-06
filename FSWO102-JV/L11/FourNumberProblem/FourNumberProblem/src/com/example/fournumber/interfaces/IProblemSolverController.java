package com.example.fournumber.interfaces;

public interface IProblemSolverController {

	public static final String READY = "Controller Ready";
	public static final String NOT_READY = "Controller Not Ready";
	
	String run();
	
	void solve();
	String ready();
	
	String evaluation();
	String[] listing();
}
