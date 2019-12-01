package org.codercamps.FSWO1043JV.tictactoe.classes;

import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.ITicTacToeImportable;

public class TicTacToeExportSimpleArray implements ITicTacToeImportable {

	private String[] position;
	
	// Getters and Setters	
	public String[] getPosition() {
		return position;
	}

	public void setPosition(String[] position) {
		this.position = position;
	}

	// Interface methods.
	@Override
	public String[] getPieces() {
		return determinePiecesInPosition();
	}
	private String[] determinePiecesInPosition() {
		return null;
	}
	
	@Override
	public String[] getCells() {
		return determineCellsInPosition();
	}
	private String[] determineCellsInPosition() {
		return null;
	}
	
	@Override
	public String[] getPlayers() {
		return determinePlayersInPosition();
	}
	private String[] determinePlayersInPosition() {
		return null;
	}
	
	@Override
	public void display() {
		if (position != null && position.length>0) {
			System.out.println("Position Array: ");
			for(int i=0; i<position.length; i++) {
				System.out.print(position[i] + " ");
			}
			System.out.println();
		}
	}

	@Override
	public int getRowsize() {
		return (position != null && position.length>0)?
							Integer.parseInt(position[0]) : 0;
	}
	
}
