package com.example.fournumber.objects;

import java.util.ArrayList;

import com.example.fournumber.interfaces.INumericProblem;
import com.example.fournumber.interfaces.INumericProblemSolvable;

public class FourNumberProblemRecursive implements INumericProblemSolvable {

	private static ArrayList<INumericProblem> solutions = new ArrayList<>();
	
	@Override
	public String describe(INumericProblem problem) {
		return (problem != null)?problem.toString():null;
	}

	@Override
	public boolean validate(INumericProblem problem) {
		if (problem == null) {
			return false;
		}
		int[] corners = problem.getChoices();
		if (corners == null || corners.length != 4) {
			return false;
		}
		for(int i=0;i<corners.length;i++) {
			if (corners[0] == 0) return false;
		}
		return true;
	}

	@Override
	public INumericProblem[] solve(INumericProblem problem) {
		solutions.add(solveOneStep(problem));
		return convertSolutions();
	}
	private INumericProblem[] convertSolutions() {
		if (solutions != null || solutions.size()>0) {
			INumericProblem[] steps = new INumericProblem[solutions.size()];
			for(int i=0;i<solutions.size();i++) {
				steps[i] = solutions.get(i);
			}
			return steps;
		}
		return null;
	}
	
	@Override
	public INumericProblem solveOneStep(INumericProblem problem) {
		return problem;
	}
	
	public static void main(String[] args) {
		
		int goal = 41;
		int[]corners = {4, 9, 3, 5};
		
		FourNumberProblemRecursive solvable = new FourNumberProblemRecursive();
		System.out.println("Starting solver...");
		FourNumberProblem problem = new FourNumberProblem(goal, corners);
		if (solvable.validate(problem)) {
			INumericProblem[] solution = solvable.solve(problem);
			if (solution == null || solution.length == 0) {
				System.out.println("Sorry. Cannot be solved.");
				System.out.println(solvable.describe(problem));
			} else {
				System.out.println("Solved!");
				for(int i=0;i<solution.length;i++) {
					System.out.println(solvable.describe(solution[i]));
				}			
			}
		} else {
			System.out.println("Sorry. Unable to solve.");
			solvable.describe(problem);
		}
	}

}
