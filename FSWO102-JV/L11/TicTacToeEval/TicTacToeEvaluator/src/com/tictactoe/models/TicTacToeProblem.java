package com.tictactoe.models;

import com.tictactoe.interfaces.ISolvable;

public class TicTacToeProblem implements ISolvable {

	protected int rowsize =  DEFAULT_ROWSIZE;
	protected String[][] position;
	protected String prestep;
	protected String status;
	
	public static final int DEFAULT_ROWSIZE = 3;
	
	@Override
	public String toString() {
		String str = positionToString();
		return "Rowsize: " + rowsize + ((str!= null)?str:"") + 
				" Prestep: " + prestep;
	}
	
	@Override
	public String getPrestep() {
		return prestep;
	}

	@Override
	public void setPrestep(String prestep) {
		this.prestep = prestep;	
	}
	
	// Getters and Setters
	public int getRowsize() {
		return rowsize;
	}

	public void setRowsize(int rowsize) {
		this.rowsize = rowsize;
		resize();
	}

	public String[][] getPosition() {
		if (position == null) {
			resize();
		}
		return position;
	}

	public void setPosition(String[][] position) {
		int rowsize = position[0].length;
		if (rowsize == this.rowsize) {
			this.position = position;
		}
	}

	// Support operations
	private void resize() {
		if (rowsize > DEFAULT_ROWSIZE) {
			position = new String[rowsize][rowsize];
		} else {
			rowsize = DEFAULT_ROWSIZE;
			position = new String[DEFAULT_ROWSIZE][DEFAULT_ROWSIZE];
		}
	}
	
	private String positionToString() {
		if (position != null) {
			int rowsize = position[0].length;
			if (rowsize == this.rowsize) {
				String str = " Position:";
				for(int i=0; i<rowsize; i++) {
					for(int j=0;j<rowsize; j++) {
						str += " " + i + j + ": " + position[j][i];
					}
				}
				return str;
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		TicTacToeProblem problem = new TicTacToeProblem();
		problem.setRowsize(DEFAULT_ROWSIZE);
		System.out.println(problem.toString());
		
		String[][]positionToUpdate = problem.getPosition();
		positionToUpdate[1][1] = "X";
		problem.setPosition(positionToUpdate);
		problem.setPrestep("11 = X");
		System.out.println(problem.toString());

	}


}
