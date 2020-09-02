package com.example.fournumber.objects;

public class FourNumberProblem {

	private int goal;
	private int[] corners;	

	public static String NOOP = "No Operand";
	
	public static String OPERAND_ADD = "Add";
	public static String OPERAND_SUBTRACT = "Subtract";
	public static String OPERAND_MULTIPLY= "Multiply";
	public static String OPERAND_DIVIDE = "Divide";
	
	public static String REMAINDER = "Leaves";

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
