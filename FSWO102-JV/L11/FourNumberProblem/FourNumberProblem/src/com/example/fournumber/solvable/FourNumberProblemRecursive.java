package com.example.fournumber.solvable;

import java.util.ArrayList;

import com.example.fournumber.interfaces.IProblemSolvable;
import com.example.fournumber.interfaces.IProblemSolver;
import com.example.fournumber.objects.FourNumberProblem;
import com.example.fournumber.objects.algorithms.Evaluate_R2_1_1;

public class FourNumberProblemRecursive implements IProblemSolver {
	
	private FourNumberProblem problem;

	// Getter / Setter
	public FourNumberProblem getProblem() {
		return problem;
	}

	public void setProblem(FourNumberProblem problem) {
		this.problem = problem;
	}

	// Interface methods
	@Override
	public String evaluate() {		
		// Run a set of evaluators.
		return (new Evaluate_R2_1_1()).evaluate(problem);
	}
	
	@Override
	public ArrayList<String> solve() {
		// Run a set of evaluators.
		return (new Evaluate_R2_1_1()).solve(problem);
	}
	
	public static void main(String[] args) {		
		int[] numbers = {9, 10, 9, 3};
		int goal = 28;
		
		FourNumberProblem problem = new FourNumberProblem();
		problem.setNumbers(numbers);
		problem.setGoal(goal);
		
		FourNumberProblemRecursive solver = new FourNumberProblemRecursive();
		solver.setProblem(problem);
		System.out.println("The PROBLEM:");
		System.out.println(solver.getProblem().describe());
		System.out.println("\r\nThe SOLUTION:");
		ArrayList<String>solution = solver.solve();
		display(solution);	
	}
	
	private static void display(ArrayList<String>solution) {
		for(int i=0; i<solution.size(); i++) {
			System.out.println(solution.get(i));
		}
	}

}
