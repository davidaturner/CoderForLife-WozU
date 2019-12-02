package org.codercamps.FSWO1043JV.tictactoe.classes;

import java.util.ArrayList;

import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.ITicTacToeImportable;

public class TicTacToeExportSimpleArray implements ITicTacToeImportable {

	private String[] position;
	
	public static int ROWSIZE_POS = 0;
	public static int CELLS_START_POS = 1;
	
	public static String NO_PLAYER = " ";
	
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getCells() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getPlayers() {
		ArrayList<String> array = new ArrayList<>();
		for(int i=CELLS_START_POS; i<position.length; i++) {
			String candidate = position[i];
			boolean isAlreadyIn = false;
			for(String player : array) {
				if (player.equals(candidate) && !player.equals(NO_PLAYER)) {
					isAlreadyIn = true;
					break;
				}
			}
			if (!isAlreadyIn) {
				array.add(candidate);
			}
		}
		String[] players = null;
		if (array.size()>0) {
			players = new String[array.size()];
			for(int i=0; i<array.size(); i++) {
				players[i] = array.get(i);
			}
		}

		return players;
	}

	@Override
	public void display() {
		System.out.println("Position: ");
		for(int i=0; i<position.length; i++) {
			System.out.print(position[i] + " ");
		}
		System.out.println();	
	}

	@Override
	public int getRowsize() {
		return Integer.parseInt(position[0]);
	}
	
	public static void main(String args[]) {
		String[] position01 = {"3", "X", "X", "X", " ", "O", "O", " ", " ", " ", " "};
		
		RunTest01(position01);
	}
	
	public static void RunTest01(String[] position) {
		TicTacToeExportSimpleArray export = new TicTacToeExportSimpleArray();
		
		System.out.println("Building players array:");
		export.setPosition(position);
		
		export.display();
		
	}

}
