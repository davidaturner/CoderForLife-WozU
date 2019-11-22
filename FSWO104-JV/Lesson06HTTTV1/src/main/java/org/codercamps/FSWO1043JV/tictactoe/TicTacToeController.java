package org.codercamps.FSWO1043JV.tictactoe;

import org.codercamps.FSWO1043JV.tictactoe.classes.TicTacToeTwoPlayerResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TicTacToeController {
    
    @PostMapping(value="/v1/solver", produces="application/json")
    public TicTacToeResponse solver(@RequestBody TicTacToeRequest request) {
    	
    	// Evaluate request and build response.
     	TicTacToeResponse response = new TicTacToeResponse();
    	response.setStatus(evaluate(request));    	
    	return response;  	
    }
    
    private String evaluate(TicTacToeRequest request) {
    	System.out.println("In evaluate()");
    	return (new TicTacToeTwoPlayerResult()).GAME_DRAWN;
    }
}
