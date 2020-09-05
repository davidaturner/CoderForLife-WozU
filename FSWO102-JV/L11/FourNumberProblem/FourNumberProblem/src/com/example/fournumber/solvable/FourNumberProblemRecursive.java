package com.example.fournumber.solvable;

import java.util.ArrayList;

import com.example.fournumber.interfaces.IProblemSolvable;
import com.example.fournumber.interfaces.ISolvable;
import com.example.fournumber.objects.FourNumberProblem;

public class FourNumberProblemRecursive implements IProblemSolvable {

	private FourNumberProblem problem;
	private boolean nofurther = false;
	
	private static ArrayList<String>solution = new ArrayList<String>();
	
	public FourNumberProblemRecursive(ISolvable problem) {
		this.problem = (FourNumberProblem)problem;
	}
	
	@Override
	public ISolvable get() {
		return problem;
	}
	
	@Override
	public String describe() {
		return problem.toString();
	}

	@Override
	public boolean validate() {
		return validate(this.problem);
	}

	@Override
	public String solve() {
		System.out.println(problem.toString());
		solution.add(problem.getPrestep());
		
		FourNumberProblem step1 = solve(problem, 1, FourNumberProblem.OPERAND_SUBTRACT);
		System.out.println(step1.toString());
		solution.add(step1.getPrestep());
		
		FourNumberProblem step2 = solve(step1, 0, FourNumberProblem.OPERAND_DIVIDE);
		System.out.println(step2.toString());
		solution.add(step2.getPrestep());
		
		FourNumberProblem step3 = solve(step2, 0, FourNumberProblem.OPERAND_SUBTRACT);
		System.out.println(step3.toString());
		solution.add(step3.getPrestep());
		
		return null;
	}
	
	@Override
	public String evaluate() {
		int[] corners = problem.getCorners();
		if (corners != null && (corners.length==1)) {
			if (corners[0] == problem.getGoal()) {
				return IProblemSolvable.SOLVED;
			}
			else {
				return IProblemSolvable.RESOLVED;
			}
		}
		return IProblemSolvable.NOT_SOLVED;
	}
	
	@Override
	public boolean isResolved() {
		return nofurther;
	}
	
	// Additional Supportive Operations
	private boolean validate(FourNumberProblem problem) {
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

	public FourNumberProblem solve(FourNumberProblem problem, int cornerSelected, String operand) {
		FourNumberProblemRecursive solver = new FourNumberProblemRecursive(problem);
		return (FourNumberProblem) (new FourNumberProblemRecursive(
				(ISolvable)solver
				.reduce(cornerSelected, operand))).get();
	}
	
	private FourNumberProblem reduce(int corner, String operand) {
		
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
		if (noFurtherReduce(reduced)) {
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
	
	private boolean noFurtherReduce(FourNumberProblem problem) {
		nofurther = (validate(problem) && problem.getCorners().length==1);
		return nofurther;
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
		solver.solve();
		System.out.println();
		for(int i=0; i<solution.size(); i++) {
			System.out.println(solution.get(i));
		}
		
		
	}


}
