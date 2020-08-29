package com.example.fournumber.interfaces;

public interface INumericProblemSolvable {

	String describe(INumericProblem problem);
	
	boolean validate(INumericProblem problem);
	
	INumericProblem[] solve(INumericProblem problem);
	INumericProblem solveOneStep(INumericProblem problem);
	
}
