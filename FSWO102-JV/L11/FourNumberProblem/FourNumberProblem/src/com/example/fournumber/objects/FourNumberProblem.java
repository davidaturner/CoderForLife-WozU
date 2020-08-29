package com.example.fournumber.objects;

import com.example.fournumber.interfaces.INumericProblem;

public class FourNumberProblem implements INumericProblem {

	int goal;
	int[] corners;
	String prestep;
	
	public FourNumberProblem(int goal, int[] corners) {
		this(goal, corners, INumericProblem.NOOP);
	}
	public FourNumberProblem(int goal, int[] corners, String prestep) {
		this.goal = goal;
		this.corners = corners;
		this.prestep = prestep;
	}
	
	// Interface methods
	@Override
	public int getGoal() {
		return goal;
	}

	@Override
	public int[] getChoices() {
		return corners;
	}
	
	@Override
	public String getPrestep() {
		return prestep;
	}
	
	@Override
	public String toString() {
		String str = "Goal: " + goal;
		String corners = cornersToString();
		if (corners != null && !corners.isEmpty()) {
			str += " " + corners;
		};
		str += " Prestep: " + prestep;
		return str;
	}
	
	// Additional class methods
	public int[] getCorners() {
		return getChoices();
	}
	
	public String cornersToString() {
		String str = new String();
		if (corners != null && corners.length>0) {
			str += "Corners:";
			for(int i=0; i<corners.length;i++) {
				str += " " + corners[i];
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		int goal = 41;
		int[] corners = {4, 9, 3, 5};
		
		FourNumberProblem problem = new FourNumberProblem(goal, corners);
		System.out.println(problem.cornersToString());
		System.out.println(problem.toString());

	}
	
}
