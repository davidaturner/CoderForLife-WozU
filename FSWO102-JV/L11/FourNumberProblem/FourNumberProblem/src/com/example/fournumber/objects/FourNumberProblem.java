package com.example.fournumber.objects;

import com.example.fournumber.interfaces.ISolvable;

public class FourNumberProblem implements ISolvable {

	private int goal;
	private int[] corners;	
	private String prestep;

	public static final String OPERAND_ADD = "Add";
	public static final String OPERAND_SUBTRACT = "Subtract";
	public static final String OPERAND_MULTIPLY= "Multiply";
	public static final String OPERAND_DIVIDE = "Divide";
	
	public static final String REMAINDER = "Leaves";

	@Override
	public String toString() {
		String str = "Goal: " + goal;
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
	
	@Override
	public String getPrestep() {
		return prestep;
	}

	@Override
	public void setPrestep(String prestep) {
		this.prestep = prestep;
	}
	

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
