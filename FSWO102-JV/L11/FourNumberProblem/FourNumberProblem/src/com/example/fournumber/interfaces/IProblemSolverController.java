package com.example.fournumber.interfaces;

public interface IProblemSolverController {

	String[] run();
	
	String[] solve(String problemJSON);
	
	void success(String message);
	void failure(String message);
	void invalid(String message);
}
