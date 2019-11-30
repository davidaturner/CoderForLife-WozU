package org.codercamps.FSWO1043JV.tictactoe.classes;

import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.ITicTacToeExportTemplate;

public class TicTacToeExportSimpleArray implements ITicTacToeExportTemplate {

	protected int rowsize;	
	protected String[] moves;
	
	public static int ROWSIZEPOS = 0;

	public TicTacToeExportSimpleArray() {
	}
	
	// Getters and Setters
	public int getRowsize() {
		return rowsize;
	}

	public void setRowsize(int rowsize) {
		this.rowsize = rowsize;
	}

	public String[] getMoves() {
		return moves;
	}

	public void setMoves(String[] moves) {
		this.moves = moves;
	}

	@Override
	public boolean isValid() {
		if (moves != null && moves.length>0) {
			return true;
		}
		return false;
	}

	@Override
	public int determineRowsize() throws Exception {

		rowsize = Integer.parseInt(moves[ROWSIZEPOS]);
		return rowsize;
	}

	@Override
	public void display() {
		if (isValid()) {
			System.out.print("Move array: ");
			for(int i = 0; i < moves.length; i++) {
				System.out.print(moves[i] + " ");
			}
			System.out.println();			
		}
		else {
			System.out.println("Move array EMPTY!");
		}
	}
	
}
