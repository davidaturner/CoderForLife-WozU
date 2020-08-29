package com.example.fournumber.controllers;

import com.example.fournumber.interfaces.INumericProblem;
import com.example.fournumber.interfaces.INumericProblemSolvable;
import com.example.fournumber.interfaces.IProblemSolver;
import com.example.fournumber.objects.FourNumberProblem;

public class FourNumberProblemSolver implements IProblemSolver {

	private final INumericProblemSolvable solver;
	private final FourNumberProblem problem;
	
	public FourNumberProblemSolver(int goal, int[]corners, INumericProblemSolvable solver) {
		
		this.problem = new FourNumberProblem(goal, corners, INumericProblem.NOOP);
		this.solver = solver;
	}
	
	// Interface operations
	@Override
	public String describe() {
		return solver.describe(problem);
	}

	@Override
	public boolean validate() {
		return solver.validate(problem);
	}

	@Override
	public String[] solve() {
		INumericProblem[] steps =  solver.solve(problem);		
		return translate(steps);
	}
	private String[] translate(INumericProblem[] steps) {
		if (steps == null || steps.length == 0) {
			return null;
		}
		String[] solutions = new String[steps.length];
		for(int i=0;i<steps.length;i++) {
			solutions[i] = solver.describe(steps[i]);
		}
		return solutions;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
