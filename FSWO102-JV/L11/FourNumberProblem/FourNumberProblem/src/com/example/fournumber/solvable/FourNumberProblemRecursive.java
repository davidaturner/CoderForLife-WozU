package com.example.fournumber.solvable;

import java.util.ArrayList;

import com.example.fournumber.interfaces.IProblemSolvable;
import com.example.fournumber.objects.FourNumberProblem;

public class FourNumberProblemRecursive implements IProblemSolvable {

	private final FourNumberProblem problem;
	private ArrayList<FourNumberProblem>solution = new ArrayList<>();
	
	public FourNumberProblemRecursive(int goals, int[] corners) {
		this.problem = new FourNumberProblem(goals, corners);
	}
	
	@Override
	public String describe() {
		return problem.toString();
	}

	@Override
	public boolean validate() {
		if (problem == null) {
			return false;
		}
		int[] corners = problem.getCorners();
		if (corners == null || corners.length == 0) {
			return false;
		}
		for(int i=0; i<corners.length; i++) {
			if (corners[i] == 0) return false;
		}
		return true;
	}

	@Override
	public String[] solve() {
		return null;
	}

	@Override
	public boolean noMoreSteps() {
		return problem.noMoreSteps();
	}
	
	public static void main(String[] args) {
		int goal = 41;
		int[] corners = {4, 9, 3, 5};
		
		FourNumberProblemRecursive solvable = new FourNumberProblemRecursive(goal, corners);
		System.out.println(solvable.describe());
		
		if (solvable.validate()) {
			System.out.println("Solution good. Let's Solve it!");
		}
	}

}
