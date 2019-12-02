package org.codercamps.FSWO1043JV.tictactoe.classes;

import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.IGameStatus;

public class TicTacToeTwoPlayerResult implements IGameStatus {

	private String playerOrGameStatus;
	private String[] players;
	
	public static String PLAYER_WINS = "Wins!";
	public static String GAME_DRAWN = "Game Drawn!";
	public static String GAME_IN_PROGRESS = "Game In Progress";
	public static String GAME_IN_ERROR = "Error evaluating Game!";
	
	public static int MAXNUM_PLAYERS = 2;
	
	// Getters and setters.
	public String getPlayerOrGameStatus() {
		return playerOrGameStatus;
	}

	public void setPlayerOrGameStatus(String playerOrGameStatus) {
		this.playerOrGameStatus = playerOrGameStatus;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	// Interface methods.
	@Override
	public String getCurrent() {
		if (playerOrGameStatus == null) {
			playerOrGameStatus = GAME_IN_PROGRESS;
		}
		return playerOrGameStatus;
	}

	@Override
	public boolean isGameOver() {
		return (playerOrGameStatus != null && !playerOrGameStatus.equals(GAME_IN_PROGRESS))?
				true : false;
	}

	@Override
	public boolean isGameDrawn() {
		return (playerOrGameStatus != null && playerOrGameStatus.equals(GAME_DRAWN))?
				true : false;
	}

	@Override
	public void setGameDrawn() {
		playerOrGameStatus = GAME_DRAWN;		
	}

	@Override
	public void setGameWon(String player) {
		playerOrGameStatus = player + " " + PLAYER_WINS;	
	}

	@Override
	public boolean addPlayer(String player) {
		if (players == null) {
			players = new String[MAXNUM_PLAYERS];
		}
		for(int i=0; i<players.length; i++) {
			if (players[i] == null) {
				players[i] = player;
				return true;
			}
		}
		return false;
	}

	@Override
	public String findPlayer(String player) {
		if (players != null && players.length>0) {
			for(int i=0; i<players.length; i++) {
				if (players[i].equals(player)) {
					return (players[i]);
				}
			}
		}
		return null;
	}
	
	public static void main(String[]args) {
		RunTest01();
	}
	
	public static void RunTest01 () {
		System.out.println("Creating new game...");
		TicTacToeTwoPlayerResult result = new TicTacToeTwoPlayerResult();
		System.out.println("Status: " + result.getCurrent());
		System.out.println("Is Game over? " + (result.isGameOver()?"yes":"no"));
		String playerWon = "White";
		result.addPlayer("White");
		result.addPlayer("Black");
		System.out.println("Players ready: " + result.getPlayers().length);
		System.out.println("Player White plays well.");
		result.setGameWon(result.findPlayer(playerWon));
		System.out.println("Is Game over? " + (result.isGameOver()?"yes":"no"));
		System.out.println("Who wins? " + result.getCurrent());
	}



}
