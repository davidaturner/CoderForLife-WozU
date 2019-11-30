package org.codercamps.FSWO1043JV.tictactoe.classes;

import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.ITicTacToePosition;
import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.ITicTacToeResult;

public class TicTacToePositionThreeByThree implements ITicTacToePosition {

	private String[] moves;	
	private ITicTacToeResult result;
	private String[][] winPaths;
	
	private int rowsize;	
	private boolean allWinPathsCompleted = true;
	
	public static String X_WIN = "XXX";
	public static String O_WIN = "OOO";

	public TicTacToePositionThreeByThree() {
		if (result == null) {
			result = new TicTacToeTwoPlayerResult();
		}
	}
	
	// Getters and setters
	public String[] getMoves() {
		return moves;
	}

	public void setMoves(String[] moves) {
		this.moves = moves;
	}

	public ITicTacToeResult getResult() {
		return result;
	}

	public void setResult(ITicTacToeResult result) {
		this.result = result;
	}

	public String[][] getWinPaths() {
		return winPaths;
	}

	public void setWinPaths(String[][] winPaths) {
		this.winPaths = winPaths;
	}

	// Interface methods
	@Override
	public boolean load() {
		buildWinPathsFromMoves();
		return (winPaths != null)? true: false;
	}

	@Override
	public void display() {
		if (winPaths != null) {
			displayMovesByRow();
		} else {
			displayMoves();
		}
	}
	private void displayMovesByRow() {
		System.out.println("Position: ");
		for(int i=0; i<rowsize; i++) {
			String[] elements = winPaths[i];
			for(int j=0; j<rowsize; j++) {
				System.out.print(elements[j] + " ");
			}
			System.out.println();
		}
		System.out.println("DONE!");
	}
	private void displayMoves() {
		if (moves != null && moves.length>0) {
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
	
	@Override
	public String evaluate() {
		
//		displayWinPaths();
		if (winPaths != null && winPaths.length>0) {
			for(int i=0; i<winPaths.length; i++) {
				String winPathstr = buildWinPath(winPaths[i]);
				if (winPathstr.equals(X_WIN)) {
					result.setGameWon(TicTacToeTwoPlayerResult.PLAYER_X);
					break;
				} else if (winPathstr.equals(O_WIN)) {
					result.setGameWon(TicTacToeTwoPlayerResult.PLAYER_O);
					break;
				} else if ( !isCompletedWinPath(winPaths[i])) {
					allWinPathsCompleted = false;
				}
			}
			if (!result.isGameOver() && allWinPathsCompleted == true) {
				result.setGameDrawn();
			}
		}
		return result.getResult();
	}
	private boolean isCompletedWinPath(String[]winPath) {
		if (winPath != null) {
			for(int j=0; j<3; j++) {
				if (winPath[j].equals(" ")) {
					return false;
				}
			}
		}
		return true;
	}
	private String buildWinPath(String[]winPath) {
		String winPathstr = new String();
		if (winPath != null) {
			for(int j=0; j<3; j++) {
				winPathstr += winPath[j];
			}
		}
		return (!winPathstr.isEmpty())?winPathstr: null;
	}
	private void displayWinPaths() {
		if (winPaths != null && winPaths.length>0) {		
			for(int i=0; i<winPaths.length; i++) {
				String winPathstr = buildWinPath(winPaths[i]);
				System.out.println(winPathstr);
			}			
		}
	}
	
	// Support operations.
	private boolean validateMoves(String[] moves) {
		return true;
	}
	private void buildWinPathsFromMoves() {
		
		if (rowsize == 0) {
			rowsize = Integer.parseInt(moves[0]);			
		}
		int numOfPaths = rowsize * 2 + 2;
		winPaths = new String[numOfPaths][rowsize];
		
		// top row.
		winPaths[0][0] = moves[1];
		winPaths[0][1] = moves[2];
		winPaths[0][2] = moves[3];
		
		// middle row.
		winPaths[1][0] = moves[4];
		winPaths[1][1] = moves[5];
		winPaths[1][2] = moves[6];
		
		// bottom row.
		winPaths[2][0] = moves[7];
		winPaths[2][1] = moves[8];
		winPaths[2][2] = moves[9];
		
		// left col.
		winPaths[3][0] = moves[1];
		winPaths[3][1] = moves[4];
		winPaths[3][2] = moves[7];
		
		// mid col.
		winPaths[4][0] = moves[2];
		winPaths[4][1] = moves[5];
		winPaths[4][2] = moves[8];
		
		// right col.
		winPaths[5][0] = moves[3];
		winPaths[5][1] = moves[6];
		winPaths[5][2] = moves[9];
		
		// left cross
		winPaths[6][0] = moves[1];
		winPaths[6][1] = moves[5];
		winPaths[6][2] = moves[9];
		
		// right cross
		winPaths[7][0] = moves[3];
		winPaths[7][1] = moves[5];
		winPaths[7][2] = moves[7];
		
	}
	private String[] buildMovesFromWinPath() {
		String[] moves = new String[rowsize*rowsize + 1];
		
		// 0 = rowsize.
		// 1 - 3 = top row.
		// 4 - 6 = mid row.
		// 7 - 9 = bottom row.
		
		moves[0] = "" + rowsize;
		
		moves[1] = winPaths[0][0];
		moves[2] = winPaths[0][1];
		moves[3] = winPaths[0][2];
		
		moves[4] = winPaths[1][0];
		moves[5] = winPaths[1][1];
		moves[6] = winPaths[1][2];
		
		moves[7] = winPaths[2][0];
		moves[8] = winPaths[2][1];
		moves[9] = winPaths[2][2];
				
		return moves;
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
		
		evaluatePosition(position04);
	}
	
	public static void evaluatePosition(String[] moves) {
		
		TicTacToePositionThreeByThree threeByThree = new TicTacToePositionThreeByThree();		
		threeByThree.setMoves(moves);
		threeByThree.display();
		threeByThree.load();
		threeByThree.display();
		String resultstr = threeByThree.evaluate();
		
		System.out.println("Result: " + resultstr);

	}

}
