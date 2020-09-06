package com.example.fournumber.solvable;

import java.util.ArrayList;

import com.example.fournumber.interfaces.IProblemSolvable;
import com.example.fournumber.interfaces.ISolvable;
import com.example.fournumber.objects.FourNumberProblem;

public class FourNumberProblemRecursive implements IProblemSolvable {

	private FourNumberProblem problem;

	private String evaluation;
	
	private ArrayList<FourNumberProblem>solution = new ArrayList<>();
	
	public FourNumberProblemRecursive(ISolvable problem) {
		this.problem = (FourNumberProblem)problem;
		
		evaluation = IProblemSolvable.NOT_SOLVED;
	}
	
	@Override
	public ISolvable get() {
		return problem;
	}
	
	@Override
	public String describe() {
		return describe(this.problem);
	}

	@Override
	public boolean validate() {
		return validate(this.problem);
	}

	@Override
	public void solve() {

		solution.add(problem);
		
		FourNumberProblem step1 = solve(problem, 1, FourNumberProblem.OPERAND_SUBTRACT);
		solution.add(step1);
		
		FourNumberProblem step2 = solve(step1, 0, FourNumberProblem.OPERAND_DIVIDE);
		solution.add(step2);
		
		FourNumberProblem step3 = solve(step2, 0, FourNumberProblem.OPERAND_SUBTRACT);
		solution.add(step3);

	}
	
	@Override
	public String evaluate() {
		return evaluation;
	}
	
	@Override
	public String[] listing() {
		return translate();
	}


	// Additional Operations
	public int getGoal() {
		return ((FourNumberProblem)get()).getGoal();
	}
	public String getCorners() {
		String str = new String();
		int[] corners = problem.getCorners();
		for(int i=0;i<corners.length;i++) {
			if (i<corners.length-1) {
				str += corners[i] + " ";
			} else {
				str += corners[i];
			}
		}
		return str;
	}
	
	public String describe(FourNumberProblem problem) {
		return problem.toString();
	}
	public boolean validate(FourNumberProblem problem) {
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

	// Support
	private FourNumberProblem reduce(int corner, String operand) {
		
		if (problem == null || cannotReduce(problem)) {
			return problem;
		}
		int a = problem.getGoal();
		int[] corners = problem.getCorners();
		int b = corners[corner];
		
		switch(operand) {
		
		case FourNumberProblem.OPERAND_ADD:
			a += b;
			break;
		case FourNumberProblem.OPERAND_SUBTRACT:
			a -= b;
			break;
		case FourNumberProblem.OPERAND_MULTIPLY:
			a *= b;
			break;
		case FourNumberProblem.OPERAND_DIVIDE:
			if (b != 0 && (a % b == 0)) {
				a /= b;
			} else {
				return problem;
			}
		default:
			break;
		}
		
		FourNumberProblem reduced = new FourNumberProblem();
		reduced.setGoal(a);
		reduced.setCorners(unshift(corner, corners));
		reduced.setPrestep(generatePrestep(b, operand, null));
		if (cannotReduce(reduced)) {
			reduced.setPrestep(generatePrestep(a, 
					FourNumberProblem.REMAINDER, reduced.getPrestep()));
		}
		return reduced;
	}
	
	private int[] unshift(int corner, int[] corners) {
		if (corners != null && corners.length>1 &&
				corners.length>corner) {
			int[] shifted = new int[corners.length-1];
			for(int i=0; i<shifted.length;i++) {
				if (i<corner) {
					shifted[i] = corners[i];
				}
				else {
					shifted[i] = corners[i+1];
				}
			}
			return shifted;
		}
		return null;
	}
	
	private String generatePrestep(int value, String operand, String prestep) {
		String str = new String();
		if (prestep != null) {
			str += prestep + " ";
		}
		str += operand + " " + value;
		return str;
	}
	
	private boolean cannotReduce(FourNumberProblem problem) {
		return (validate(problem) && problem.getCorners().length==1);
	}

	private FourNumberProblem solve(FourNumberProblem problem, int cornerSelected, String operand) {
		FourNumberProblemRecursive solver = new FourNumberProblemRecursive(problem);
		return (FourNumberProblem) (new FourNumberProblemRecursive(
				(ISolvable)solver
				.reduce(cornerSelected, operand))).get();
	}
	
	private String[] translate() {
		if (solution == null) {
			return null;
		}
		String[] listings = new String[solution.size()];
		for(int i=0; i<solution.size(); i++) {
			FourNumberProblem lister = solution.get(i);
			listings[i] = lister.toString();
		}
		return listings;
	}

	//Testing
	public static void main(String[] args) {
		int goal = 41;
		int[] corners = {4, 9, 3, 5};
		
		FourNumberProblem problem = new FourNumberProblem();
		problem.setGoal(goal);
		problem.setCorners(corners);
		problem.setPrestep(ISolvable.START);
		
		FourNumberProblemRecursive solver = new FourNumberProblemRecursive(problem);
		
		System.out.println("Goal: " + solver.getGoal());
		System.out.print("Corners: " + solver.getCorners());
		System.out.println();
		solver.solve();
		String[] listing = solver.listing();
		System.out.println("\r\nSolution: ");
		for(int i=0;i<listing.length;i++) {
			System.out.println("   " + listing[i]);
		}
	}


}
