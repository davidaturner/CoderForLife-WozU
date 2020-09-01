package com.example.fournumber.objects;

import com.example.fournumber.interfaces.IProblem;

public class FourNumberProblem implements IProblem {

	private final int goal;
	private final int[] corners;
	private String prestep;
	private boolean noMoreSteps;

	public static String OPERAND_ADD = "Add";
	public static String OPERAND_SUBTRACT = "Subtract";
	public static String OPERAND_MULTIPLY = "Multiply";
	public static String OPERAND_DIVIDE = "Divide";
	
	public FourNumberProblem(int goal, int[] corners) {
		this.goal = goal;
		this.corners = corners;
		prestep = "" + IProblem.NOOP;
		noMoreSteps = false;
	}
	
	@Override
	public String toString() {
		String str = "Goal: " + goal;
		if (corners != null) {
			str += " Corners:";
			for(int i=0; i<corners.length;i++) {
				str += " " + corners[i];
			}
		}
		if (prestep != null && !prestep.equals(IProblem.NOOP)) {
			str += " " + prestep;
		}
		str += " noMoreSteps: " + noMoreSteps;
		return str;
	}
	
	public int getGoal() {
		return goal;
	}

	public int[] getCorners() {
		return corners;
	}

	@Override
	public String getPrestep() {
		return prestep;
	}

	@Override
	public void setPrestep(String prestep) {
		this.prestep = prestep;
	}
	
	@Override
	public boolean noMoreSteps() {
		return (corners == null || corners.length <= 1);
	}

	public static void main(String[] args) {
		
		int goal = 41;
		int[] corners = {4, 9, 3, 5};
		
		FourNumberProblem problem = new FourNumberProblem(goal, corners);
		System.out.println(problem.toString());
	}



	
}
