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
		return describe(this.problem, null);
	}

	@Override
	public boolean validate() {
		return validate(this.problem);
	}

	@Override
	public String[] solve() {
		return null;
	}
	
	@Override
	public String evaluate() {
		return evaluate(this.problem);
	}
		
	// Getters
	public FourNumberProblem getProblem() {
		return problem;
	}
	
	public static void main(String[] args) {
		int goal = 41;
		int[] corners = {4, 9, 3, 5};
		
		FourNumberProblemRecursive solver = new FourNumberProblemRecursive(goal, corners);
		System.out.println(solver.describe());
		
		String operand = FourNumberProblem.NOOP;
		String prestep = FourNumberProblem.NOOP;
		
		operand = FourNumberProblem.OPERAND_SUBTRACT;
		FourNumberProblem step1 = solver.reduce(solver.getProblem(), 1, operand);
		prestep = solver.prestep(solver.getProblem(), 1, operand);
		System.out.println(solver.describe(step1, prestep));
		
		operand = FourNumberProblem.OPERAND_DIVIDE;
		FourNumberProblem step2 = solver.reduce(step1, 0, operand);
		prestep = solver.prestep(step1, 0, operand);
		System.out.println(solver.describe(step2, prestep));
		
		operand = FourNumberProblem.OPERAND_SUBTRACT;
		FourNumberProblem step3 = solver.reduce(step2, 0, operand);
		prestep = solver.prestep(step2, 0, operand);
		System.out.println(solver.describe(step3, prestep));
		
		System.out.println("\r\n" + solver.evaluate(step3));
		operand = FourNumberProblem.REMAINDER;
		prestep = solver.prestep(step3,  0, operand);
		System.out.println(prestep);
				
	}
	
	// Support
	private String describe(FourNumberProblem problem, String prestep) {
		String str = "Goal: " + problem.getGoal();
		int[] corners = problem.getCorners();
		if (corners != null && corners.length>0) {
			str += " Corners:";
			for(int i=0; i<corners.length;i++) {
				str += " " + corners[i];
			}			
		}
		if (prestep != null && !prestep.isEmpty()) {
			str += " Prestep: " + prestep;
		}
		return str;
	}

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
	
	private String evaluate(FourNumberProblem problem) {
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
	private int getCorner(FourNumberProblem problem, int corner) {
		return problem.getCorners()[corner];
	}
	private String prestep(FourNumberProblem problem, int corner, String operand) {
		return operand + " " + getCorner(problem, corner);
	}
	
	private FourNumberProblem reduce(FourNumberProblem problem, int corner, String operand) {
		
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
		
		return reduced;
	}
	
	private static int[] unshift(int corner, int[] corners) {
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

	// Tests
	private static void RunTest01() {
		int goal = 41;
		int[] corners = {4, 9, 3, 5};
		
		FourNumberProblemRecursive solver = new FourNumberProblemRecursive(goal, corners);
		System.out.println(solver.describe());
		
		String operand = FourNumberProblem.NOOP;
		String prestep = FourNumberProblem.NOOP;
		
		operand = FourNumberProblem.OPERAND_SUBTRACT;
		FourNumberProblem step1 = solver.reduce(solver.getProblem(), 1, operand);
		prestep = solver.prestep(solver.getProblem(), 1, operand);
		System.out.println(solver.describe(step1, prestep));
		
		operand = FourNumberProblem.OPERAND_DIVIDE;
		FourNumberProblem step2 = solver.reduce(step1, 0, operand);
		prestep = solver.prestep(step1, 0, operand);
		System.out.println(solver.describe(step2, prestep));
		
		operand = FourNumberProblem.OPERAND_SUBTRACT;
		FourNumberProblem step3 = solver.reduce(step2, 0, operand);
		prestep = solver.prestep(step2, 0, operand);
		System.out.println(solver.describe(step3, prestep));
		
		System.out.println("\r\n" + solver.evaluate(step3));
		operand = FourNumberProblem.REMAINDER;
		prestep = solver.prestep(step3,  0, operand);
		System.out.println(prestep);
	}
}
