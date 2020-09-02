package com.example.fournumber.solvable;

import java.util.ArrayList;

import com.example.fournumber.interfaces.IProblemSolvable;
import com.example.fournumber.objects.FourNumberProblem;

public class FourNumberProblemRecursive implements IProblemSolvable {

	private FourNumberProblem problem;
	
	private ArrayList<String> solution = new ArrayList<>();
	private String evaluation = new String();
	
	public FourNumberProblemRecursive(int goal, int[]corners) {
		problem = new FourNumberProblem();
		problem.setGoal(goal);
		problem.setCorners(corners);
	}
	
	@Override
	public String describe() {
		String str = "Goal: " + problem.getGoal();
		int[] corners = problem.getCorners();
		if (corners != null && corners.length>0) {
			str += " Corners:";
			for(int i=0; i<corners.length;i++) {
				str += " " + corners[i];
			}			
		}
		return str;
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
	public String evaluate() {
		return null;
	}
	
	public static void main(String[] args) {
		int goal = 41;
		int[] corners = {4, 9, 3, 5};
		
		FourNumberProblemRecursive solver = new FourNumberProblemRecursive(goal, corners);
		System.out.println(solver.describe());
		
		System.out.println(solver.validate());
		
		// solver.evaluate();
		
		// solver.solve();
		
	}

}
