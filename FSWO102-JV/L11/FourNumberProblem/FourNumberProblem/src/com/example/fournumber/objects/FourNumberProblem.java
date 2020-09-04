package com.example.fournumber.objects;

public class FourNumberProblem {

	private int goal;
	private int[] corners;	

	public static final String NOOP = "No Operand";
	
	public static final String OPERAND_ADD = "Add";
	public static final String OPERAND_SUBTRACT = "Subtract";
	public static final String OPERAND_MULTIPLY= "Multiply";
	public static final String OPERAND_DIVIDE = "Divide";
	
	public static final String REMAINDER = "Leaves";

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public int[] getCorners() {
		return corners;
	}

	public void setCorners(int[] corners) {
		this.corners = corners;
	}
	
	public static void main(String[] args) {
		
		int goal = 41;
		int[] corners = {4, 9, 3, 5};
		
		FourNumberProblem problem = new FourNumberProblem();
		problem.setGoal(goal);
		problem.setCorners(corners);

		System.out.println("Goal: " + problem.getGoal());
		corners = problem.getCorners();
		String str = new String();
		for(int i=0; i<corners.length;i++) {
			str += " " + corners[i];
		}
		System.out.println("Corners: " + str);

	}
	
}
