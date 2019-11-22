package org.codercamps.FSWO1043JV.tictactoe.classes;

import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.ITicTacToeResult;

public class TicTacToeTwoPlayerResult implements ITicTacToeResult {

	private String playerOrStateResult;
	private String[] players;
	
	public static String PLAYER_WINS = "Wins!";
	public static String GAME_DRAWN = "Game Drawn!";
	public static String GAME_IN_PROGRESS = "Game In Progress";
	public static String GAME_IN_ERROR = "Error evaluating Game!";
	
	public static int MAXNUM_PLAYERS = 2;
	
	public static String PLAYER_X = "X";
	public static String PLAYER_O = "O";
	
	public TicTacToeTwoPlayerResult() {
		playerOrStateResult = GAME_IN_PROGRESS;
		players = new String[2];
		addPlayer(TicTacToeTwoPlayerResult.PLAYER_X);
		addPlayer(TicTacToeTwoPlayerResult.PLAYER_O);
	}
	
	// Getters and Setters
	public String getPlayerOrStateResult() {
		return playerOrStateResult;
	}

	public void setPlayerOrStateResult(String playerOrStateResult) {
		this.playerOrStateResult = playerOrStateResult;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	// Interface methods
	@Override
	public String getResult() {
		return (playerWon() != null)
				? playerWon() + " " + TicTacToeTwoPlayerResult.PLAYER_WINS
							: playerOrStateResult;
	}

	@Override
	public void setResult(String playerOrStateResult) {
		this.playerOrStateResult = playerOrStateResult;
	}

	@Override
	public boolean isGameOver() {
		return (playerOrStateResult != null &&
				!playerOrStateResult.equals(GAME_IN_PROGRESS))
					? true : false;
	}

	@Override
	public boolean isGameDrawn() {
		return (playerOrStateResult != null &&
				playerOrStateResult.equals(GAME_DRAWN))
					? true : false;
	}

	@Override
	public boolean addPlayer(String player) {
		for(int i=0; i<MAXNUM_PLAYERS; i++) {
			if (players[i] == null || players[i].isEmpty()) {
				players[i] = player;
				return true;
			}
		}
		return false;
	}

	@Override
	public String playerWon() {
		for(int i=0; i<MAXNUM_PLAYERS; i++) {
			if (players[i].equals(playerOrStateResult)) {
				return players[i];
			}
		}
		return null;
	}

	public static void main(String[]args) {
		RunTest01();
	}
	
	public static void RunTest01 () {
		
		TicTacToeTwoPlayerResult result = new TicTacToeTwoPlayerResult();
		System.out.println("Starting game... initial state:");
		System.out.println(result.getPlayerOrStateResult());
		System.out.print("Players: ");
		for(String player : result.getPlayers()) {
			System.out.print(player + " ");
		}
		System.out.println();
		
	}
}
