package org.codercamps.FSWO1043JV.tictactoe.classes;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codercamps.FSWO1043JV.tictactoe.classes.interfaces.ITicTacToeImportable;

public class TicTacToeExportSimpleArray implements ITicTacToeImportable {

	private String[] position;
	
	public static int ROWSIZE_POS = 0;
	public static int CELLS_START_POS = 1;
	
	public static String NO_PLAYER = " ";
	
	// Getters and setters	
	public String[] getPosition() {
		return position;
	}

	public void setPosition(String[] position) {
		this.position = position;
	}

	// Interface methods
	@Override
	public List<String> getPieces() {
		if (position != null && position.length>0) {
			List<String>list = Arrays.asList(position);
			ArrayList<String>pieces = new ArrayList<>();
			for(int i=1; i<list.size(); i++) {
				String candidate = (String)list.get(i);
				if ( !candidate.equals(NO_PLAYER) &&
						!pieces.contains(candidate)) {
					pieces.add(candidate);
				}
			}
			return pieces;
		}
		return null;
	}

	@Override
	public List<String> getCells() {
		if (position != null && position.length>0) {
			List<String>list = Arrays.asList(position);
			ArrayList<String>cells = new ArrayList<>();
			for(int i=1; i<list.size(); i++) {
				String candidate = (String)list.get(i);
				cells.add(candidate);
			}
			return cells;
		}
		return null;
	}

	@Override
	public List<String> getPlayers() {
		return getPieces();
	}

	@Override
	public void display() {
		System.out.println("Position: ");
		if (position != null && position.length>0) {
			for(int i=0; i<position.length; i++) {
				System.out.print(position[i] + " ");
			}
			System.out.println("(" + position.length + ")");
		}	
	}

	@Override
	public int getRowsize() {
		return (position != null && position.length>0)?
				Integer.parseInt(position[0]) : 0;
	}

	public static void main(String args[]) {
		String[] position01 = {"3", "X", "X", "X", " ", "O", "O", " ", " ", " "};
		
		RunTest01(position01);
	}
	
	public static void display(String prompt, List<String> list) {
		System.out.println(prompt + ": ");
		for(String lister : list) {
			System.out.print(lister + " ");
		}
		System.out.println("(" + list.size() + ")");
	}
	
	public static void RunTest01(String[] position) {
		TicTacToeExportSimpleArray export = new TicTacToeExportSimpleArray();
		
		System.out.println("Building players array:");
		export.setPosition(position);
		export.display();
		
		List<String> cells = export.getCells();
		display("Cells", cells);
		
		List<String> pieces = export.getPieces();
		display("Pieces", pieces);
		
		List<String> players = export.getPlayers();
		display("Players", players);
		
		int rowsize = export.getRowsize();
		System.out.println("Rowsize: " + rowsize);
	}

}
