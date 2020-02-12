package com.davidaturner.l10;

import com.davidaturner.l10.classes.RobbieRobot;
import com.davidaturner.l10.designpatterns.behaviors.CanLift;

public class RobotTestingFacility {

	public static void main(String[] args) {
		
		RobbieRobot robot = new RobbieRobot();
		robot.test();
		
		println();
		println("...DONE!");
				
	}
	
	public static void println() {
		System.out.println();
	}
	public static void println(String prompt, String message) {
		if (prompt != null && !prompt.isEmpty()) {
			message = prompt + ": " + message;
		}
		System.out.println(message);
	}
	public static void println(String message) {
		println(null, message);
	}

}
