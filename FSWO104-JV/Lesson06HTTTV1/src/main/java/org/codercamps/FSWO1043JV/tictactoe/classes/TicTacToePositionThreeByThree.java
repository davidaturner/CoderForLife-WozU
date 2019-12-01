package org.codercamps.FSWO1043JV.tictactoe.classes;

import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.IGameImportable;
import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.IGamePositional;
import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.IGameStatus;
import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.ITicTacToeImportable;

public class TicTacToePositionThreeByThree implements IGamePositional {

	private String[] pieces;	
	private String[] cells;
	private String[] players;
	private int rowsize;	
	
	private String[][] winPaths;

	private IGameStatus status;

	private boolean allWinPathsCompleted = true;
	
	// Interface methods
	@Override
	public boolean load(IGameImportable importedGame) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {

		String[] position01 = {"3", "X", "X", "X", " ", "O", " ", "O", " ", " "}; // X Wins!
		String[] position02 = {"3", "X", "X", "O", "X", "O", " ", "O", " ", " "}; // O Wins!
		String[] position03 = {"3", "X", "X", "O", "O", "O", "X", "X", "X", "O"}; // Drawn!
		String[] position04 = {"3", "X", "X", "O", " ", "O", " ", "X", " ", " "}; // Game in Progress
		String[] position05 = {"3", "X", "X", "X", " ", "O", " ", "O", " ", " "};
		String[] position06 = {"3", "X", "X", "X", " ", "O", " ", "O", " ", " "};
		String[] position07 = {"3", "X", "X", "X", " ", "O", " ", "O", " ", " "};
		String[] position08 = {"3", "X", "X", "X", " ", "O", " ", "O", " ", " "};
		String[] position09 = {"3", "X", "X", "X", " ", "O", " ", "O", " ", " "};
		String[] position10 = {"3", "X", "X", "X", " ", "O", " ", "O", " ", " "};
		
		System.out.println("Hello World!");
		
	}



	
}
