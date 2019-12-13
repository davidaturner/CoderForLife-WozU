package org.codercamps.FSWO1043JV.tictactoe.controllers;

import org.codercamps.FSWO1043JV.tictactoe.classes.TicTacToeExportSimpleArray;
import org.codercamps.FSWO1043JV.tictactoe.classes.TicTacToeTwoPlayerResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicTacToeController {
    
	@GetMapping(value="/")
	public String index() {
		return "<h1>index</h1>";
	}
	
	@PostMapping(value = "/v1/solver", produces = "application/json")
	public TicTacToeResponse solver(@RequestBody TicTacToeRequest request) {
		
		// Display request as needed.
		displayPosition(request);
		TicTacToeExportSimpleArray position = decode(request);
		
		// Evaluate request and build response. TicTacToeResponse response = new
		TicTacToeResponse response = new TicTacToeResponse();
		response.setStatus(evaluate(request));
		return response;
	}

	private TicTacToeExportSimpleArray decode(TicTacToeRequest request) {
		TicTacToeExportSimpleArray position = new TicTacToeExportSimpleArray();
		return position;
	}
	
	private String evaluate(TicTacToeRequest request) {

		return (new TicTacToeTwoPlayerResult()).GAME_DRAWN;
	}
	
	private void displayPosition(TicTacToeRequest request) {
		String[] row1 = request.getRow1();
		String[] row2 = request.getRow2();
		String[] row3 = request.getRow3();
		
		System.out.println("Position: ");
		checkRow(row1);
		checkRow(row2);
		checkRow(row3);
	}
	private void checkRow(String[] row) {
		for(int i=0; i<3; i++) {
			System.out.print(row[i] + " ");
		}
		System.out.println();
	}
	 
}
