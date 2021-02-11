package com.example.fournumber.objects;

import com.example.fournumber.interfaces.IProblemSolvable;

public class FourNumberProblem implements IProblemSolvable {

	private int[] numbers;
	private int goal;
	
	// Getters and setters
	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	// Interface methods
	@Override
	public String describe() {
		StringBuffer description = new StringBuffer();
		if ( !evaluate().equals(NOTREADY)) {
			description.append("NUMBERS: ");
			for(int i=0;i<numbers.length;i++) {
				description.append(numbers[i] + " ");					
			}
			description.append("GOAL: " + goal + " " + evaluate());
			return description.substring(0);
		}		
		return null;
	}

	@Override
	public String evaluate() {
		
		if (numbers != null && numbers.length > 0 && goal > 0) {
			if (numbers.length == 1) {
				if (numbers[0] == goal ||
						-numbers[0] == goal) {
					return SOLVED;					
				} else {
					return RESOLVED;
				}
			} else {
				return VALIDATED;
			}
		}

		return NOTREADY;
	}
	
	@Override
	public void display() {
		System.out.println(describe());		
	}
	
	public static void main(String[] args) {
		
		FourNumberProblem problem = new FourNumberProblem();
		int[] numbers = {9, 10, 9, 3};
		int goal = 28;
		
		problem.setNumbers(numbers);
		problem.setGoal(goal);
		problem.evaluate();
		problem.display();

	}
}
